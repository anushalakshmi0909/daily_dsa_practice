# Day 04 – Amazon Interview Pattern Problems

Today I practiced two common Amazon-style coding interview problems.

These problems combine multiple important concepts like:

* String processing
* HashMaps
* Sorting with custom comparators
* Graph traversal (DFS)
* Connected components

---

# Problems Covered

## 1️⃣ Top N Competitors

Find the top N competitor products mentioned in customer reviews.

### Concepts Used

* HashMap for counting
* HashSet for duplicate avoidance
* String normalization
* Custom sorting

### Key Rules

* Case insensitive comparison
* Count only **once per review**
* Sort by:

  * Frequency (descending)
  * Alphabetical order (ascending)

Example Output

```
[newshop, fashionbeats]
```

---

## 2️⃣ Largest Item Association

Given item pairs frequently purchased together, find the **largest association group**.

Example Input

```
[Item1, Item2]
[Item3, Item4]
[Item4, Item5]
```

Groups formed

```
[Item1, Item2]
[Item3, Item4, Item5]
```

Largest group

```
[Item3, Item4, Item5]
```

### Concepts Used

* Graph representation
* DFS traversal
* Connected components
* Lexicographic sorting

---

# Key Learning

These problems helped reinforce:

* String normalization
* HashMap counting patterns
* Graph connected components
* DFS traversal
* Custom comparator sorting

---

# Time Complexity

Top N Competitors

```
O(R × W + C log C)
```

Largest Item Association

```
O(V + E)
```

---

# Pattern Recognition

When interview problems include:

* item pairs
* associations
* friend relationships
* account merging

Think immediately:

```
GRAPH + CONNECTED COMPONENTS
```

Possible solutions:

* DFS
* BFS
* Union Find

---

# Next Learning Goal

Practice more problems based on:

* Graph traversal
* Union Find
* Top K frequency problems
