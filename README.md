# Train Consist Management App – UC16

Progress: UC1 – UC16 Completed

## UC15 – Safe Cargo Assignment using try-catch-finally

### Description

Handle runtime cargo safety violations gracefully.

### Goal

Prevent unsafe cargo assignment without crashing the system.

### Concepts Introduced

* try-catch-finally
* Runtime Exception
* Custom Exception
* Graceful failure handling

### Example snippet

```java
try {
	assignCargo();
}
catch(CargoSafetyException e){
	System.out.println(e.getMessage());
}
finally{
	System.out.println("Operation complete");
}
```

---

## UC16 – Sort Passenger Bogies by Capacity (Bubble Sort)

### Description

Manual sorting algorithm demonstration using Bubble Sort.

### Goal

Teach algorithm fundamentals before using built-in sorting utilities.

### Concepts Introduced

* Bubble Sort algorithm
* Nested loops
* Array manipulation
* Swap logic
* Time complexity O(n²)

### Example snippet

```java
if(arr[j] > arr[j+1]) {
	int temp = arr[j];
	arr[j] = arr[j+1];
	arr[j+1] = temp;
}
```

---

## Version

16.0
