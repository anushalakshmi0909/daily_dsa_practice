# Problem: Two Sum 🧮

## Problem Link
https://leetcode.com/problems/two-sum/

## Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of two numbers such that they add up to `target`.
You may assume exactly one solution exists and you may not use the same element twice.

## Example
Input: nums = [2,7,11,15], target = 9  
Output: [0,1] ✅

---

## Approach 1: Brute Force 🔍
- Check all pairs of numbers.
- If sum equals target, return indices.
- Time Complexity: O(n²)
- Space Complexity: O(1)

---

## Approach 2: Optimized (HashMap) 💡
- For each number, compute `complement = target - current number`.
- Check if complement exists in hashmap.
- If yes → return indices.
- Otherwise, store current number in hashmap.
- Time Complexity: O(n)
- Space Complexity: O(n)

---

## Key Learning ✨
- HashMaps reduce time complexity for lookup problems.
- Always check complement **before inserting** current number.
- Common pattern: array + complement → useful in many problems.
