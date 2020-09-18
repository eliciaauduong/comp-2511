# Object Oriented Programming (OOP) in Java

## Object Oriented Programming (OOP)

- In procedural programming languages (like C), programming tends to be **action-oriented**, whereas in Java - programming is **object-oriented**

- In _procedural_ programming,

  - Groups of actions that perform some task are formed into functions and functions are grouped to form programs

- In OOP,
  - Programmers concentrate on creating their own user-defined types called _classes_
  - Each _class_ contains _data_ as well as the set of _methods_ (procedures) that manipulate the data
  - An instance of a user-defined type (i.e. a _class_) is called an _object_
  - OOP _encapsulates_ data (attributes) and methods (behaviours) into _objects_, the data and methds of an object are intimately tied together
  - Objects have the property of _information hiding_

## Inheritance in OOP

- _Inheritance_ is a form of software reusability in which new classes are created from the existing classes by absorbing their attributes and behaviours
- Instead of defining completely (separate) new class, the programmer can designate that the new class is to inherit attributes and behaviours of the existing class (called _superclass_)
  - The new class is referred to as _subclass_
- Programmer can _add more attributes and behaviours_ to the subclass, hence, normally _subclasses_ have **more features** than their _superclasses_
- Inheritance relationships form \_\_tree-like hierarchical structures. For example,
  ![inheritance in OOP](../img/inheritance-oop.png)

### 'Is-a' - Inheritance relationship

- In a 'is-a' relationship, an object of a subclass may also be treated as an object of the superclass
- For example, _UndergraduateStudent_ can be treated as _Student_ too
- You should use inheritance to model 'is-a' relationship

**VERY IMPORTANT**

- Don't use inheritance unless all or most inherited attributes and methods makes sense
- For example, mathematically, a _circle_ is-a oval, however, you should NOT inherit a class _circle_ from a class _oval_. A class _oval_ can have one method to set _width_ and another to set _height_.

### 'Has-a' - Association relationship

- In a 'has-a' relationship, a **class object has an object of another class** to store its state or do its work, i.e. it 'has-a' reference to that other object
- For example, a Retangle is-not-a Line. However, we may use a Line to draw a Rectangle.
- The 'has-a' relationship is quite different from an 'is-a' relationship
- 'Has-a' relationships are examples of creating new classes by _composition_ of existing classes (as opposed to extending classes)

**VERY IMPORTANT**

- Getting 'is-a' vs 'has-a' relationships correct is both _subtle_ and potentially _critical_. You should _consider_ all _possible_ future _usages_ of the classes before finalising the hierarchy
- It is possible that _obvious solutions may not work_ for some applications.

### Designing a Class

- Think carefully about the functionality (methods) a class should offer
- Always _try to keep data private_ (local)
- Consider _different ways_ an object may be created
- Creating an object may require different actions such as initialisations
- Always initialise data
- If the object is no longer in use, free up all the associated resources
- _Break up_ classes with _too many responsibilities_
- In Object Oriented, classes are often closely related. '_Factor out_' common attributes and behaviours and place these in a class. Then use suitable relationships between classes (e.g. 'is-a' or 'has-a')

## Introduction to Classes and Objects

- A class is a collection of _data_ and _methods_ (procedures) that operate on that data
- For example, a circle can be described by the x,y position of its centre and by its radius
- We can define some udeful methods (procedures) for circles, compute circumference, compute area, check whether points are inside the circle etc.
- By defining the Circle class (as below), we can create a _new data type_

### The class Circle

For simplicity, the methods for getter and setters are not shown in the code

```java
public class Circle {
    protected static final double pi= 3.14159;
    protected int x, y;
    protected int r;

    // Very simple constructor
    public Circle() {
        this.x = 1;
        this.y = 1;
        this.r = 1;
    }

    // Another simple constructor
    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /**
    * Below, methods that return the circumference or
    * area of the circle
    */
    public double circumference() {
        return 2 * pi * r;
    }

    public double area() {
        return pi * r * r;
    }
}

```

### Objects are Instances of a class

In Java, objects are created by instantiating a class. For example,

```java
Circle c;
c = new Circle();
```

or

```java
Circle c = new Circle();
```

### Accessing Object Data

We can access data fields of an object. For example,

```java
Circle c = new Circle();
// Initialise our circle to have centre (2, 5) and radius 1
// Assume x, y, r are not private
c.x = 2;
c.y = 5;
c.r = 1;
```

### Using Object Methods

To access the methods of an object, we can use the same syntax as accessing the data of an object:

```java
Circle c = new Circle();
double a;
c.r = 2; // assuming r is not private
a = c.area();
```

## Subclasses and Inheritance

### First Approach

- In this approach we are creating the _new separate class_ for _GraphicalCircle_ and **rewriting** the code already available in the class _Circle_
- For example, we rewrite the methods _area_ and _circumference_
- Hence, this approach is NOT elegant, in fact its the _worst_ possible solution

```java
// The class of graphical circles
public class GraphicalCircle {
    int x, y;
    int r;
    Color outline, fill;

    public double circumference() {
        return 2 * 3.14159 * r;
    }

    public double area() {
        return 3.14159 * r * r;
    }

    public void draw(Graphics g) {
        g.setColor(outline);
        g.drawOval(x-r, y-r, 2*r, 2*r);
        g.setColor(fill);
        g.fillOval(x-r, y-r, 2*r, 2*r);
    }
}
```

### Second Approach

- We want to implement _GraphicalCircle_ so that it can make use of the code in the class _Circle_
- This approach uses 'has-a' relationship
- That means, a _GraphicalCircle_ has a (mathematical) _Circle_
- It uses methods from the class _Circle_ (_area_ and _circumference_) to define some of the new methods
- This technique is also known as _method forwarding_

```java
public class GraphicalCircle2 {
    // here's the math circle
    Circle c;
    // the new graphics variables go here
    Color outline, fill;

    // very simple constructor
    public GraphicalCircle2 {
        c = new Circle();
        this.outline = Color.black;
        this.fill = Color.white;
    }

    // another simple constructor
    public GraphicalCircle2(int x, int y, int r, Color o, Color f) {
        c = new Circle(x, y, r);
        this.outline = o;
        this.fill = f;
    }

    // draw method, using object 'c'
    public void draw(Graphics g) {
        g.setColor(outline);
        g.drawOval(c.x - c.r, e.y - c.r, 2 * c.r, 2 * c.r);
        g.setColor(fill);
        g.fillOval(c.x - c.r, e.y - c.r, 2 * c.r, 2 * c.r);
    }
}
```

### Third Approach - Extending a Class

- We can say that _GraphicalCircle_ is-a _Circle_
- Hence we can define _GraphicalCircle_ as an extension, or subclass of _Circle_
- The subclass _GraphicalCircle_ inherits all the variables and methods of its superclass _Circle_

```java
import java.awt.Color;
import java.awt.Graphics;

public class GraphicalCircle extends Circle {

    Color outline, fill;

    public GraphicalCircle {
        super();
        this.outline = Color.black;
        this.fill = Color.white;
    }

    // another simple constructor
    public GraphicalCircle2(int x, int y, int r, Color o, Color f) {
        super(x, y, r);
        this.outline = o;
        this.fill = f;
    }

    public void draw(Graphics g) {
        g.setColor(outline);
        g.drawOval(x-r, y-r, 2*r, 2*r);
        g.setColor(fill);
        g.fillOval(x-r, y-r, 2*r, 2*r);
    }
```

### Example

We can assign an instance of _GraphicalCircle_ to a _Circle_ variable. For example,

```java
GraphicalCircle gc = new GraphicalCircle();
double area = gc.area();
Circle c = gc;
// we cannot call draw method for c
```

**IMPORTANT**
Considering the variable 'c' is of type _Circle_, we can only access attributes and methods available in class _Circle_

### Superclasses, Objects, and the class Hierarchy

- Every class has a superclass
- If we don't define the superclass, by default, the superclass is the class _Object_

_Object_ class:

- It's the only class that does not have a superclass
- The methods defined by _Object_ can be called by any Java object (instance)
- Often we need to override teh following methods:
  - toString()
  - equals()
  - hasCode()

## Abstract Classes

## Single Inheritance vs Multiple Inheritance

## Interfaces

## Method Forwarding (Has-a Relationship)

## Method Overriding (Polymorphism)

## Method Overloading

## Constructors
