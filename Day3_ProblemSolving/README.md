# 📝 Daily Coding Log - Day 3

Welcome to my daily coding log. Today I solved a **grid partition problem** involving prefix sums and equal partition logic.

---

## 1️⃣ Check if Grid Can Be Partitioned Into Equal Sum Halves

**Problem:**  
Given a 2D grid of integers, determine whether it is possible to **partition the grid into two parts with equal sum** using **one straight cut**.

The cut can be:

- **Horizontal** (between rows)
- **Vertical** (between columns)

Both resulting parts must have the **same total sum**.

---

## 📥 Input / Output Example

Input

grid = [
[1,2,3],
[3,2,1]
]


Output

true


Explanation:

Total sum = 12  

If we cut horizontally:

Top part → 1+2+3 = 6  
Bottom part → 3+2+1 = 6  

Both halves are equal.

---

## 🎯 Goal

Check whether a **single straight cut** can divide the grid into **two parts with equal sum**.

---

## 🧠 Approach / Pattern

**Pattern:** Prefix Sum + Grid Traversal

### Key Steps

1. Compute the **total sum of all elements** in the grid.
2. If total sum is **odd**, partition is impossible.
3. Otherwise, target sum = `total / 2`.

Then try two possibilities:

### Horizontal Cut
Accumulate row sums from top.

If cumulative sum becomes equal to target → partition possible.

### Vertical Cut
Accumulate column sums from left.

If cumulative sum becomes equal to target → partition possible.

---

## ⏱ Complexity

Time Complexity


O(m × n)


We traverse the grid to compute the total and evaluate cuts.

Space Complexity


O(1)


No extra data structures are used.

---

## 📚 References

- [Notes](notes.md)
- [Code](PartitionGrid.java)

---

## 🔑 Key Takeaways

- Always check **total sum first** in partition problems.
- If total sum is **odd → immediate false**.
- Use **prefix accumulation** to simulate horizontal or vertical cuts.
- Grid traversal problems often reduce to **row-wise or column-wise prefix sums**.