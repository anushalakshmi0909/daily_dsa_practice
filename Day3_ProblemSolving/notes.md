# 📝 Daily Notes - Day 3

---

## 1️⃣ Partition Grid Into Equal Sum Halves

**Pattern:** Prefix Sum + Grid Traversal

---

## 📌 Problem Recap

Given a grid:


m × n matrix


Determine if we can split the grid using **one straight cut** such that:


sum(top or left part) == sum(bottom or right part)


Allowed cuts:


Horizontal cut
Vertical cut


---

## 💡 Core Idea

First calculate the **total sum of the grid**.

If total sum is odd:


return false


Because it cannot be divided equally.

Otherwise:


target = total / 2


Now try forming that sum using prefix accumulation.

---

## 🔍 Horizontal Partition

We accumulate row sums:


row1
row1 + row2
row1 + row2 + row3


If cumulative sum becomes equal to target:


partition exists


---

## 🔍 Vertical Partition

We accumulate column sums:


col1
col1 + col2
col1 + col2 + col3


If cumulative sum equals target:


partition exists


---

## ✏ Pseudocode


function canPartitionGrid(grid):

calculate totalSum

if totalSum is odd:
    return false

target = totalSum / 2

sum = 0

check horizontal cuts
    accumulate row sums
    if sum == target
        return true

reset sum

check vertical cuts
    accumulate column sums
    if sum == target
        return true

return false

---

## 🔎 Dry Run Example

Grid:


1 2 3
3 2 1


Total sum:


12


Target:


6


### Horizontal Check

Row1:


1+2+3 = 6


Target reached → valid partition.

---

## 📈 Complexity Analysis

Time Complexity


O(m × n)


We scan the grid multiple times.

Space Complexity


O(1)


Only variables are used.

---

## 🎯 Pattern Learned

This problem demonstrates:

- **Prefix accumulation**
- **Grid traversal**
- **Partition logic**

Similar problems often involve:

- Prefix sums
- Balanced partitions
- Matrix traversal