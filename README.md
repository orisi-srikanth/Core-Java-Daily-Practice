# Day 01 — Core Java OOP

## Project: Hospital Billing System

Today I practiced the fundamental Object-Oriented Programming concepts in Java by creating a simple hospital billing system.

### Concepts Covered

* Classes and Objects
* Constructors
* Constructor Overloading
* `this` keyword
* `super()` keyword
* Inheritance
* Method Overriding
* Runtime Polymorphism
* Upcasting
* Encapsulation
* Access Modifiers
* Getters and Setters
* `toString()`
* Conditional Statements
* Methods

### Classes Used

* `Patient` — Parent class
* `GeneralPatient` — Child class
* `EmergencyPatient` — Child class
* `Hospital` — Main class

### Polymorphism Example

```java
Patient obj = new GeneralPatient(1, "ravi", 4);
Patient obj1 = new EmergencyPatient(1, "ramu", 4);

obj.calcbill();
obj1.calcbill();
```

The `Patient` reference can refer to different child objects, and Java decides which overridden `calcbill()` method to execute at runtime.

### Day 1 Goal

Understand how inheritance, method overriding, and runtime polymorphism work together in Java.

## Progress

✅ Day 1 completed

> One day of Core Java completed. Keep going.
