# 📝 Daily Coding Log - Day 6

Welcome to my daily coding log. Today I solved a **string manipulation problem** that required understanding **index-based swap constraints**.

---

## 1️⃣ Check if Strings Can Be Made Equal With Operations (LeetCode 2833)

**Problem:**  
Two strings `s1` and `s2` of length **4** are given.

You are allowed to perform the following operation any number of times:

Swap characters at indices `(0,2)` or `(1,3)`.

Determine if `s1` can be transformed into `s2`.

---

## 📥 Input / Output Example

Input

s1 = "abcd"
s2 = "cdab"


Output

true


Explanation:

We can swap:

- index `0 ↔ 2`
- index `1 ↔ 3`

This means characters at **even indices can swap among themselves**, and characters at **odd indices can swap among themselves**.

---

## 🎯 Key Insight

The string length is **always 4**, and swaps are only allowed between:


0 ↔ 2
1 ↔ 3


So the string forms **two independent groups**:

Group A (even indices)

0, 2


Group B (odd indices)

1, 3


Characters can swap **within their group only**, but **never between groups**.

So we just need to check if:

- characters at `(0,2)` in `s1` can match `(0,2)` in `s2`
- characters at `(1,3)` in `s1` can match `(1,3)` in `s2`

---

## 🧠 Approach

1. Check if **Group A (0,2)** characters match either directly or swapped.
2. Check if **Group B (1,3)** characters match either directly or swapped.
3. If both groups match → return `true`.

---

## ⏱ Complexity

Time Complexity

O(1)


Only constant comparisons are performed.

Space Complexity

O(1)


No additional data structures are used.

---

## 📚 References

- [Notes](notes.md)
- [Code](CheckStringsEqual.java)

---

## 🔑 Key Takeaways

- Always read **operation constraints carefully**.
- Identify **independent index groups** created by swap rules.
- When swaps are limited, the problem often becomes **group comparison instead of full permutation checking**.