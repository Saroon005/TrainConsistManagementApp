# Train Consist Management App – UC4

## Use Case 4: Maintain Ordered Bogie Consist

This Java console application models the **physical sequence of train bogies** using a **LinkedList**.
Unlike HashSet, LinkedList preserves order and allows efficient insertion and removal of bogies.

---

## Features

* Add bogies at start, end, or specific position
* Remove bogies from front or rear
* View the ordered train consist
* Check if a bogie exists

---

## Concepts Used

* **LinkedList** – Doubly linked list implementation of List
* **Order Preservation** – Maintains the sequence of bogies
* **addFirst() / addLast()** – Insert at beginning or end
* **removeFirst() / removeLast()** – Remove from front or rear

---

## Example Menu

```
1. Add Bogies at specific position
2. Add Bogies at the start
3. Add Bogies at the end
4. Remove Bogies from the front
5. Remove Bogies from the rear
6. View Bogies
7. Check if Bogie exists
0. Exit
```

---

## Version

4.0
