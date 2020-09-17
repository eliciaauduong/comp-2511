# Week 1 Tutorial

## Similarities/ Differences - C/ Python/ Java

|                   | C                                            | Python                                   | Java                                                                                                                   |
| ----------------- | -------------------------------------------- | ---------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| Syntax            | {}                                           | indentation                              | {}                                                                                                                     |
| Classes           | struct - no inheritance                      | classes                                  | classes                                                                                                                |
| Access control    |                                              | - public<br>- private (prefix with \_\_) | more control over how we can access methods and fields in a class<br>- public<br>- protected<br>- default<br>- private |
| Type system       | built-in type system                         | no built-in type system                  | built-in type system - includes classes                                                                                |
| Memory management | `malloc` & `free` - but can have memory leak | garbage collector                        | garbage collector                                                                                                      |
| Execution         | require compilation stage (machine level)    | interpreted                              | require compilation stage (byte level code on JVM)                                                                     |
| Applications      | low level - performance critical             | web dev, scientific analysis             | enterprise level - reliability is key                                                                                  |

## What are classes/ objects?

- classes
  - blueprint
  - specifies values/fields/methods
- objects
  - instantiation of class
  - concrete values in fields

## What is an IDE?

- Integrated Development Environment
- Typically
  - Code-editing
  - Compilation
  - Execution
  - Debugging
  - Code exploration
- In VSCode, install extensions:
  - Java Extension Pack
  - Code Runner
- You may have to configure Path variable in Windows 10 to recognise Java, Javac
  - `where` command shows you location of executable

## Tutorial Questions

From `Shouter.java`:

```java
package example;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }
}
```

When there is name conflict:

- `this.message` refers to message in `private String message;`
- `message` refers to message in `public Shouter(String message)`

## Access modifiers

|           | class | package | subclass | global |
| --------- | ----- | ------- | -------- | ------ |
| public    | YES   | YES     | YES      | YES    |
| protected | YES   | YES     | YES      | NO     |
| default   | YES   | YES     | NO       | NO     |
| private   | YES   | NO      | NO       | NO     |

`static` means that the method is tied to the class rather than to the object
