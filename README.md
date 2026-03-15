# Train Consist Management App – UC19

Progress: UC1 – UC19 Completed

## UC18 – Linear Search for Bogie ID

### Description

Search for a specific bogie ID using a sequential traversal algorithm.

### Goal

Locate bogies even when the dataset is unsorted.

### Concepts Introduced

* Linear Search
* Sequential traversal
* Early termination
* Time complexity O(n)

### Example snippet

```java
for(String id : bogieIds){
	if(id.equals(searchKey)){
		return true;
	}
}
return false;
```

---

## UC19 – Binary Search for Bogie ID

### Description

Efficient search algorithm for locating bogies in sorted datasets.

### Goal

Improve search performance compared to Linear Search.

### Concepts Introduced

* Binary Search
* Divide-and-conquer
* Sorted data requirement
* Index-based traversal
* Time complexity O(log n)

### Example snippet

```java
int mid = (low + high) / 2;
```

---

## Version

19.0
