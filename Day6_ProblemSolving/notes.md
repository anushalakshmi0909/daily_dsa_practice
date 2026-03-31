# 📝 Daily Notes - Day 6

---

## 1️⃣ Check if Strings Can Be Made Equal With Operations

**Pattern:** Constraint-based String Manipulation

---

## 📌 Problem Recap

Given two strings `s1` and `s2` of length **4**.

Allowed operations:


swap(0,2)
swap(1,3)


Goal:

Determine if `s1` can be transformed into `s2`.

---

## 💡 Core Idea

The swaps create **two independent index groups**.

Group A

0, 2


Group B

1, 3


Characters inside each group can swap freely.

But characters **cannot move between groups**.

So we verify each group separately.

---

## 🧠 Intuition

My first intuition was to use **two pointers**.

However, I missed the key constraint:


swap allowed only when index difference = 2


This means:

Even positions swap with even positions.  
Odd positions swap with odd positions.

So the problem reduces to verifying if both groups can match.

---

## 🔍 Group Validation Logic

### Group A

Indices:


0, 2


Valid if:


(s1[0] == s2[0] AND s1[2] == s2[2])
OR
(s1[0] == s2[2] AND s1[2] == s2[0])


---

### Group B

Indices:


1, 3


Valid if:


(s1[1] == s2[1] AND s1[3] == s2[3])
OR
(s1[1] == s2[3] AND s1[3] == s2[1])


---

## ✏ Pseudocode


function canBeEqual(s1, s2):

check groupA:
    positions 0 and 2

check groupB:
    positions 1 and 3

if both groups valid
    return true

return false

---

## 📈 Complexity Analysis

Time Complexity


O(1)


Only fixed index comparisons.

Space Complexity


O(1)


No extra memory required.

---

## 🎯 Pattern Learned

When swaps are restricted:

1. Identify **which indices can interact**
2. Form **independent groups**
3. Validate groups separately

This technique appears in problems involving:

- restricted swaps
- parity-based transformations
- index grouping