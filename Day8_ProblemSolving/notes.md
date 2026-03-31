# 📝 Daily Notes – 2026-03-31

---

# 1️⃣ Longest Substring Without Repeating Characters

**Pattern:** Sliding Window + HashSet

---

## 📌 Problem Recap

Given a string `s`, find the **length of the longest substring without repeating characters**.

### Example

Input
```
abcabcbb
```

Output
```
3
```

Longest substring: `"abc"`

---

## 💡 Core Idea

Use a **sliding window technique** to maintain a valid substring.

Window representation:

```
[left .... right]
```

### Rules

1. Expand the window using `right`
2. If a duplicate appears → shrink window using `left`
3. Remove characters leaving the window
4. Track maximum window size

---

## 🔍 Dry Run Example

Input:

```
abcabcbb
```

| Step | Right | Character | Action | Window | Max |
|-----|------|-----------|--------|--------|-----|
| 1 | 0 | a | add | [a] | 1 |
| 2 | 1 | b | add | [ab] | 2 |
| 3 | 2 | c | add | [abc] | 3 |
| 4 | 3 | a | duplicate → remove a | [bca] | 3 |
| 5 | 4 | b | duplicate → remove b | [cab] | 3 |
| 6 | 5 | c | duplicate → remove c | [abc] | 3 |

Final Answer

```
3
```

---

## 🧠 Sliding Window Mental Model

Think of a **moving window**:

```
expand → expand → expand
duplicate → shrink
expand again
```

Or imagine a **room with people (characters)**.

Rule:

```
No duplicate people allowed
```

If a duplicate enters:

```
Remove people from the left door
Until the rule is satisfied
```

---

## ✏ Pseudocode

```
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
```

---

## 📈 Complexity Analysis

### Time Complexity
```
O(n)
```

Reason:
- Each character is added once
- Each character is removed once

Total operations ≈ `2n`.

### Space Complexity
```
O(min(n, charset))
```

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

---

# 2️⃣ Day 8 – Zero Balance Shipment Combinations (4 Arrays Sum)

---

## 📌 Problem Pattern

Four arrays where we need:

```
A[i] + B[j] + C[k] + D[l] = 0
```

Brute force approach:

```
4 nested loops
```

Time complexity:

```
O(n⁴)
```

Not efficient when `n = 200`.

---

## 💡 Optimization Trick

Rearrange the equation:

```
(A[i] + B[j]) + (C[k] + D[l]) = 0
```

Therefore:

```
A[i] + B[j] = -(C[k] + D[l])
```

This allows splitting the problem into **two halves**.

---

## ⚙ Algorithm Steps

1. Create a **HashMap**
2. Store all sums of `A + B`
3. Store frequency of each sum
4. Compute sums of `C + D`
5. Check if negative of the sum exists
6. Add its frequency to the result

---

## ❓ Why HashMap?

Multiple pairs can produce the same sum.

Example:

```
A + B sums

-1 → 1
 0 → 2
 1 → 1
```

If we find:

```
needed = 0
```

We must add **2**, not just **1**.

---

## 🧠 Pattern Name

**Meet in the Middle**

Used when:

```
A + B + C + D = target
```

or when nested loops become too expensive.

---

## 📈 Complexity

Brute Force
```
O(n⁴)
```

Optimized
```
O(n²)
```

---

## 🎯 Key Learning

Instead of fixing variables using loops, we can:

```
store pair sums
search complements
```

This technique appears in problems like:

- 4Sum II  
- Zero Sum Tuples  
- Pair Sum Problems

## 🧩 Patterns Learned Today

• Sliding Window
• Meet in the Middle