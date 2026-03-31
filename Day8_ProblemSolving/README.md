# 📝 Daily Coding Log - March 31, 2026

Welcome to my daily coding log. Today I practiced a **sliding window problem** focused on string manipulation and window optimization techniques.

---

## 1️⃣ Longest Substring Without Repeating Characters

**Problem:**  
Given a string `s`, find the **length of the longest substring without repeating characters**.

**Example:**

Input  

abcabcbb


Output  

3


Explanation:  
The longest substring without repeating characters is `"abc"`.

---

## 🎯 Goal

- Identify the longest substring with **unique characters only**.
- Return the **length of that substring**.

---

## 🧠 Approach / Pattern

**Pattern:** Sliding Window + HashSet

Key idea:
- Maintain a **window using two pointers (`left`, `right`)**
- Use a **HashSet** to store characters currently in the window.

### Steps

1. Expand the window using the `right` pointer.
2. If a duplicate character appears:
   - Shrink the window from the left.
   - Remove characters from the set until the duplicate disappears.
3. Add the new character to the set.
4. Track the **maximum window length**.

---

## ⏱ Complexity

**Time Complexity:**  

O(n)


Each character is added and removed at most once.

**Space Complexity:**  

O(min(n, charset))


HashSet stores characters in the current window.

---

## 📚 References

- [Notes](notes.md)
- [Code](LongestSubstring.java)

---

## 🔑 Key Takeaways

- **Sliding Window** is powerful for substring problems.
- Always **expand with right pointer and shrink with left pointer**.
- Maintain a **valid window condition**.
- Track the answer while iterating.

Common problems using this pattern:

- Longest substring without repeating characters
- Longest substring with K distinct characters
- Minimum window substring
- Permutation in string