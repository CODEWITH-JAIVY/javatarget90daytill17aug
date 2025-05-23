
# 📘 Java Class, Object, Instance, and Method - Explained

## ✅ 1. What is a Class?

A **class** is a blueprint or template for creating objects. It defines properties (fields) and behaviors (methods) common to all objects of that type.

### 🔹 Syntax:
```java
class ClassName {
    // fields (data members)
    // methods (member functions)
}
```

### 📌 Example:
```java
class Car {
    // Fields
    String color;
    int speed;

    // Method
    void drive() {
        System.out.println("Car is driving.");
    }
}
```

---

## ✅ 2. What is an Object?

An **object** is a real-world entity created using the class blueprint. It holds individual data and has access to methods defined in the class.

### 🔹 Syntax to Create an Object:
```java
ClassName obj = new ClassName();
```

### 📌 Example:
```java
Car myCar = new Car();
```

Here:
- `Car` is the class.
- `myCar` is the object or instance.
- `new Car()` allocates memory and returns a reference.

---

## ✅ 3. What is an Instance?

- An **instance** is simply a specific object created from a class.
- Every object is an **instance** of a class.
- You can create **multiple instances** (objects) from a single class.

### 📌 Example:
```java
Car car1 = new Car(); // instance 1
Car car2 = new Car(); // instance 2
```

Each object (`car1`, `car2`) is a separate **instance** of the class `Car`.

---

## ✅ 4. What is a Method (Function in Java)?

- A **method** (also called a function) defines the **behavior** of the objects.
- It is a block of code that performs an action.

### 🔹 Syntax:
```java
returnType methodName(parameters) {
    // code block
}
```

### 📌 Example:
```java
void startEngine() {
    System.out.println("Engine started.");
}
```

---

## ✅ 5. Complete Example with Class, Object, and Method

```java
class Student {
    // Fields
    String name;
    int age;

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object (instance) of Student
        Student s1 = new Student();
        
        // Assigning values
        s1.name = "Jaivy";
        s1.age = 21;

        // Calling method
        s1.displayInfo();
    }
}
```

### ✅ Output:
```
Name: Jaivy
Age: 21
```

---

## ✅ Summary Table

| Concept  | Description                   |
|----------|-------------------------------|
| Class    | Blueprint for objects         |
| Object   | Real instance of a class      |
| Instance | Another term for object       |
| Method   | Function that defines behavior|

---

## 🔚 Conclusion

- A **class** is like a **blueprint**.
- An **object** is like a **real-world item** built from that blueprint.
- A **method** is an **action** the object can perform.
- You can create **multiple instances** of a class, each with its own data.
