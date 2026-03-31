# 📝 Daily Notes - 2026-03-31

---

## 1️⃣ Longest Substring Without Repeating Characters

**Pattern:** Sliding Window + HashSet

---

## 📌 Problem Recap

Given a string `s`, find the **length of the longest substring without repeating characters**.

Example:

Input

abcabcbb


Output

3


Longest substring: `"abc"`

---

## 💡 Core Idea

Use a **sliding window technique** to maintain a valid substring.

Window representation:


[left .... right]


Rules:

1. Expand window using `right`
2. If duplicate appears → shrink window using `left`
3. Remove characters leaving the window
4. Track maximum window size

---

## 🔍 Dry Run Example

Input:


abcabcbb


| Step | Right | Character | Action | Window | Max |
|-----|------|-----------|--------|--------|-----|
| 1 | 0 | a | add | [a] | 1 |
| 2 | 1 | b | add | [ab] | 2 |
| 3 | 2 | c | add | [abc] | 3 |
| 4 | 3 | a | duplicate → remove a | [bca] | 3 |
| 5 | 4 | b | duplicate → remove b | [cab] | 3 |
| 6 | 5 | c | duplicate → remove c | [abc] | 3 |

Final Answer:


3


---

## 🧠 Sliding Window Mental Model

Think of a **moving window**:


expand → expand → expand
duplicate → shrink
expand again


Or imagine a **room with people (characters)**.

Rule:


No duplicate people allowed


If a duplicate enters:


Remove people from the left door
Until the rule is satisfied


---

## ✏ Pseudocode


function longestSubstring(s):

create empty set
left = 0
maxLength = 0

for right from 0 to length(s)-1:

    while s[right] exists in set:
        remove s[left] from set
        left++

    add s[right] to set

    currentLength = right - left + 1
    maxLength = max(maxLength, currentLength)

return maxLength

---

## 📈 Complexity Analysis

Time Complexity


O(n)


Reason:
- Each character is added once
- Each character is removed once

Total operations ≈ `2n`.

Space Complexity


O(min(n, charset))


---

## 🎯 Pattern Learned

Sliding Window problems often involve:

- Substrings
- Continuous ranges
- Maximum/minimum window
- Constraints like **unique characters**

Examples:

- Longest substring without repeating characters
- Longest substring with K distinct characters
- Minimum window substring
- Permutation in string