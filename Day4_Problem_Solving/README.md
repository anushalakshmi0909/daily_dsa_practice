# Dynamic Programming Basics 🚀

## Problems Covered
1. Fibonacci
2. Climbing Stairs

Dynamic Programming (DP) is a technique used to solve problems by breaking them into **smaller overlapping subproblems** and storing the results to avoid recomputation.

Two main DP approaches:
- **Memoization (Top-Down)** → recursion + caching
- **Tabulation (Bottom-Up)** → iterative DP array

---

# Problem 1: Fibonacci

## Problem Statement
Given an integer `n`, return the `n`th Fibonacci number.

Fibonacci sequence:

F(0) = 0  
F(1) = 1  

For n ≥ 2:


F(n) = F(n-1) + F(n-2)


### Example

Input:  

n = 5


Output  

5


Sequence  

0 1 1 2 3 5


---

## Approach

Instead of recalculating values repeatedly using recursion, we store results in a **DP array**.

Time Complexity: **O(n)**  
Space Complexity: **O(n)**

---

# Problem 2: Climbing Stairs

## Problem Statement

You are climbing a staircase with `n` steps.

You can climb:
- 1 step
- 2 steps

Find the number of **distinct ways to reach the top**.

---

### Example

Input  

n = 3


Output  

3


Ways

1 + 1 + 1
1 + 2
2 + 1


---

## Approach

The problem follows the recurrence:


ways(n) = ways(n-1) + ways(n-2)


This is identical to the **Fibonacci pattern**.

Time Complexity: **O(n)**  
Space Complexity: **O(n)**

---

## Key Learning ✨

- Dynamic Programming avoids **repeated calculations**.
- Identify **overlapping subproblems**.
- Store results using a **DP array**.
- Many problems reduce to **Fibonacci-like recurrence**.