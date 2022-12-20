# CS61B of UC-Berkeley

## 1.1 

### Java and Object Orientation

- Every Java file must contain a class or a interface declaration.
- All code lives in a class or a interface, even helper functions, global constants, etc.
- To run a Java code, you typically define a main method using public static void main(String[] args)

### Java and Static Typing

- All variables, parameters, and methods must have a decalred type.
- Type can never change.
- Expression also have a type.
- The compiler checks that all the types in your program are compatible before the program ever runs!

### Reflections on Static Typing

**The Good:**
- Catches certain types of errors, making it on the programmer to debug their code.
- Type errors can (almost) never occur on the end user's computer/
- Makes it easier to read and reason about code.
- Code can run more efficiently, no need to do expensive runtime type checks.

**The Bad:**
- Code is more verbose.
- Code is less general. There is a way around this in Java called generics  
  

