# Train Consist Management App – UC18

Progress: UC1 – UC18 Completed

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

## Version

18.0
