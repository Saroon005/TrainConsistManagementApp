# Train Consist Management App – UC3

## Use Case 3: Track Unique Bogie IDs

This Java console application ensures that **duplicate bogie IDs cannot be added** to the train by using a **HashSet**.

Unlike a List, a **Set automatically prevents duplicate values**, ensuring every bogie ID in the train is unique.

---

## Features

* Add bogie IDs
* Prevent duplicate bogie IDs
* Remove bogies
* View all unique bogies
* Check if a bogie exists

---

## Concepts Used

* **Set Interface** – Collection that does not allow duplicates
* **HashSet** – Implementation of Set using hashing for fast access
* **add() Method** – Inserts elements into the set
* **Automatic Deduplication** – Duplicate values are ignored automatically

---

## Example Menu

```
1. Add Bogies
2. Remove Bogies
3. View Bogies
4. Check if Bogie exists
0. Exit
```

---

## Version

3.0
