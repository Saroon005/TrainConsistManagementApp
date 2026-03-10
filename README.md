# Train Consist Management App

A **console-based Java application** that simulates how a railway system manages a train’s consist (collection of bogies attached to an engine).

The system supports **passenger bogies** (Sleeper, AC Chair, First Class) and **goods bogies** (Rectangular, Cylindrical) while tracking capacity, cargo type, and safety rules.

---

## Use Case 1: Initialize Train and Display Consist Summary

**Goal:**
Start the application and display the initial state of the train consist.

**Flow:**

1. User runs the program.
2. Welcome message is displayed.
3. Train consist is initialized.
4. Initial bogie count is shown.

---

## Key Concepts

* **Class & Main Method** – Entry point of the program.
* **Static Keyword** – Allows JVM to run `main()` without object creation.
* **List & ArrayList** – Dynamic storage for bogies.
* **Console Output** – Using `System.out.println()` to display messages.

---

## Example Output

```
======================================
  === Train Consist Management App === 
======================================
Train initialized successfully...
Initial Bogie Count : 0
Consist Train Consist : []

System ready for operations...
```
