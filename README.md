# Train Consist Management App – UC15

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

## Version

15.0
