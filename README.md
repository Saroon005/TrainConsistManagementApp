# Train Consist Management App – UC11

## Progress

UC1 – UC11 Completed

## Use Case 7: Sort Bogies by Capacity

This Java console application sorts **passenger bogies based on their seating capacity** using a **Comparator**.
Bogies are modeled as objects and stored in a **List**, allowing custom sorting based on business logic.

---

## Features

* Add passenger bogies with capacity
* Remove bogies from the list
* View all bogies
* Check if a bogie exists
* Sort bogies by seating capacity

---

## Concepts Used

* **Custom Class (Bogie)** – Represents a bogie with name and capacity
* **List Collection** – Stores bogie objects dynamically
* **Comparator** – Defines custom sorting logic
* **sort() Method** – Sorts bogies based on capacity

---

## Example Menu

```
1. Add Bogie
2. Remove Bogie
3. View Bogies
4. Check if Bogie exists
5. Sort Bogies by Capacity
6. Filter High Capacity Bogies (Stream)
7. Group Bogies by Type
8. Count Total Seats in Train
9. Validate Train ID & Cargo Code
0. Exit
```

---

## UC8 – Filter Passenger Bogies Using Streams

### Description

Filtering bogies using Java Stream API.

### Goal

Display only high-capacity bogies.

### Concepts Introduced

* Stream API
* filter()
* Lambda Expressions
* Declarative Programming

### Example Code Snippet

```java
bogies.stream()
	.filter(b -> b.getCapacity() > 60)
	.toList();
```

---

## UC9 – Group Bogies by Type (Collectors.groupingBy)

### Description

Grouping bogies into structured categories using Java Stream collectors.

### Goal

Organize bogies into logical groups for reporting.

### Concepts Introduced

* Stream API
* Collectors.groupingBy()
* Map<String, List<Bogie>>
* Lambda Expressions
* Data aggregation

### Example code snippet

```java
bogies.stream()
	.collect(Collectors.groupingBy(Bogie::getName));
```

---

## UC10 – Count Total Seats in Train (reduce)

### Description

Aggregate seating capacity using Stream reduction.

### Goal

Calculate the total number of seats available in the train.

### Concepts Introduced

* Stream API
* map()
* reduce()
* Method references
* Functional aggregation

### Example snippet

```java
bogies.stream()
	.map(Bogie::getCapacity)
	.reduce(0, Integer::sum);
```

---

## UC11 – Validate Train ID & Cargo Code (Regex)

### Description

Validate input formats using Java Regular Expressions.

### Goal

Ensure Train ID and Cargo Codes follow strict format rules.

### Concepts Introduced

* Regular Expressions
* Pattern
* Matcher
* matches()
* Input validation

### Example snippet

```java
Pattern pattern = Pattern.compile("TRN-\\d{4}");
Matcher matcher = pattern.matcher(input);
boolean valid = matcher.matches();
```

---

## Version

11.0
