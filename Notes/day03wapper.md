
# 🧠 Java Wrapper Classes: Real-World and Senior-Level Usage

This note explains key methods in Java wrapper classes: `valueOf()`, `parseXXX()`, and `xxxValue()`.

---

## 🔧 1. valueOf()

### ✅ What It Does:
Converts a `String` or primitive to a **Wrapper Object** like `Integer`, `Float`, `Double`, etc.

### 🛠️ Syntax:
```java
Integer a = Integer.valueOf("10");   // String → Integer object
```

### ✅ Use Cases:
- When storing in **Collections** (`List`, `Map`, etc.)
- For **autoboxing**
- Useful when working with **Object-oriented APIs**

### 🔄 Autoboxing Example:
```java
List<Integer> marks = new ArrayList<>();
marks.add(Integer.valueOf("90"));  // Explicit
marks.add(90);                     // Autoboxing (Java does it automatically)
```

---

## 🔧 2. parseXXX()

### ✅ What It Does:
Converts a `String` to a **primitive** type like `int`, `float`, etc.

### 🛠️ Syntax:
```java
int x = Integer.parseInt("123");    // String → int
float y = Float.parseFloat("50.5"); // String → float
```

### ✅ Use Cases:
- Reading data from **user input**, **file**, **database**, or **web APIs**
- Data parsing from **CSV**, **JSON**, etc.

### 🧪 Example:
```java
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
int age = Integer.parseInt(input);  // Validating & converting age
```

---

## 🔧 3. xxxValue()

### ✅ What It Does:
Extracts the **primitive value** from a wrapper object.

### 🛠️ Syntax:
```java
Integer num = Integer.valueOf("100");
int x = num.intValue();     // Wrapper → primitive
```

### ✅ Use Cases:
- Mathematical operations requiring primitives
- Conversions in **legacy code**
- Type control: `floatValue()`, `byteValue()`, etc.

---

## 🔁 Summary Table

| Method        | Description                                | Returns         | Common Use                          |
|---------------|--------------------------------------------|------------------|--------------------------------------|
| `valueOf()`   | Converts string/primitive to wrapper object | Wrapper Object   | For Collections, Object APIs, caching |
| `parseXXX()`  | Converts string to primitive                | Primitive        | Reading input from user/API/DB       |
| `xxxValue()`  | Extracts primitive from wrapper             | Primitive        | Arithmetic, legacy integrations      |

---

## 💡 Senior Developer Insights

- `Integer.valueOf(int)` is **memory-efficient**: reuses objects in range `-128 to 127` via caching.
- Prefer `parseXXX()` for **performance** when object is not required.
- Use `xxxValue()` when you have an object but need a **primitive** for calculations or system APIs.

---

## ✅ Sample Code

```java
public class WrapperDemo {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("10");
        Float b = Float.valueOf("10.5");

        int c = Integer.parseInt("123");
        float d = Float.parseFloat("50.25");

        int f = Integer.valueOf("12").intValue();

        System.out.println("a (Integer) with valueOf(): " + a);
        System.out.println("b (Float) with valueOf(): " + b);
        System.out.println("c (int) with parseInt(): " + c);
        System.out.println("d (float) with parseFloat(): " + d);
        System.out.println("f (int) with valueOf().intValue(): " + f);
    }
}
```

---

