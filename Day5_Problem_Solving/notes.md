# Detailed Notes – Day 04

## Problem 1: Top N Competitors

### Problem Understanding

Given:

* Competitor list
* Customer reviews

Goal:

Find the top N competitors mentioned most frequently.

---

### Important Conditions

1. Case insensitive

```
Newshop = newshop
```

2. Count only once per review

```
"newshop newshop newshop"
```

Count = 1

3. Sorting rule

Sort competitors by:

1. Mention count (descending)
2. Name (alphabetical)

---

### Approach

Step 1

Store competitors in a **HashSet**.

Step 2

Process each review:

* Convert to lowercase
* Split words
* Remove punctuation

Step 3

Use a **seen set** to avoid duplicate counting per review.

Step 4

Update frequency map.

Step 5

Sort results based on frequency and alphabetical order.

---

### Complexity

```
Review parsing = O(R × W)
Sorting = O(C log C)
```

Where

R = number of reviews
W = words per review
C = competitors

---

## Problem 2: Largest Item Association

### Problem Understanding

Each pair represents an association between two items.

Example

```
[Item1, Item2]
[Item3, Item4]
[Item4, Item5]
```

This forms a graph.

---

### Graph Representation

```
Item1 — Item2

Item3 — Item4 — Item5
```

Groups

```
[Item1, Item2]
[Item3, Item4, Item5]
```

---

### Goal

Find the **largest group of associated items**.

If sizes are equal:

Choose the group whose **first item is lexicographically smaller**.

---

### Algorithm

Step 1

Build adjacency list.

Step 2

Run DFS from each unvisited node.

Step 3

Collect connected component.

Step 4

Sort component lexicographically.

Step 5

Update best group.

---

### Complexity

```
Graph build = O(E)

DFS traversal = O(V + E)

Sorting group = O(K log K)
```

---

### Edge Cases

Chain connections

```
[Item1, Item2]
[Item2, Item3]
[Item3, Item4]
```

Result

```
[Item1, Item2, Item3, Item4]
```

Tie groups

```
[Item1, Item2]
[Item3, Item4]
```

Choose

```
[Item1, Item2]
```

Because

```
Item1 < Item3
```

---

### Key Pattern

Problems involving:

* connections
* relationships
* associations

Usually require:

```
Graph + Connected Components
```
