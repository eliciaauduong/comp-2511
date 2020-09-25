# Week 2 Tutorial

## super vs this

```java
public class Shape {
    public String color;
    public Shape(String color) {
        System.out.println("Inside Shape constructor");
        this.color = color;
    }
}
```

```java
public class Rectangle extends Shape {
    public int height;
    public int width;
    public Rectangle(String color) {
        super(color);
        System.out.println("Inside Rectangle constructor with one argument");
    }
    public Rectangle(String name, int width, int height) {
        this(name);
        this.width = width;
        this.height = height;
        System.out.println("Inside Rectangle constructor with three arguments");
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle('red', 10, 20);
    }
}
```

## Questions on methods

What are static fields and methods?

- fields and methods attached to the class rather than object

## Access Modifiers

What are access modifiers? Why do we use them?

- protected, private, public, default
- allows us to impose greater guarantees on the state of the program

How does access control in Java differ from access control in Python?

- in python if you prefix a field with `__` e.g. `__abc` you won't be able to use `object.__abc` to access it you will need to use `_A__abc` for class A
- we have full access control in Java

> If you are overriding any method, overridden method must not be more restrictive. Access modifiers restrictions in decreasing order: private -> default -> protected -> public
