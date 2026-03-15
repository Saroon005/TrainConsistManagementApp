# Train Consist Management App – UC10

## Progress

UC1 – UC10 Completed

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

## Version

10.0
