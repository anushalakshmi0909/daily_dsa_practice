# 📝 Daily Coding Log – March 31, 2026

Today I practiced two important problem-solving patterns:

- **Sliding Window**
- **Meet in the Middle + HashMap**

---

# 1️⃣ Longest Substring Without Repeating Characters

## 🧩 Problem
Given a string `s`, find the **length of the longest substring without repeating characters**.

### Example

**Input**
```
abcabcbb
```

**Output**
```
3
```

**Explanation**

The longest substring without repeating characters is:

```
"abc"
```

---

## 🎯 Goal

- Identify the longest substring containing **unique characters only**
- Return the **maximum length**

---

## 🧠 Approach / Pattern

**Pattern:** Sliding Window + HashSet

Key idea:

Maintain a **window using two pointers**

```
left  → start of window
right → end of window
```

Use a **HashSet** to store characters currently inside the window.

### Steps

1. Expand the window using the `right` pointer.
2. If a duplicate character appears:
   - Move the `left` pointer forward.
   - Remove characters from the set until the duplicate disappears.
3. Add the new character to the set.
4. Track the **maximum window length**.

---

## ⏱ Complexity

**Time Complexity**

```
O(n)
```

Each character is added and removed at most once.

**Space Complexity**

```
O(min(n, charset))
```

The HashSet stores characters currently inside the window.

---

## 🔑 Key Takeaways

- **Sliding Window** is very useful for substring problems.
- Expand the window using the **right pointer**.
- Shrink the window using the **left pointer** when constraints break.
- Always maintain a **valid window condition**.

Common problems using this pattern:

- Longest Substring Without Repeating Characters
- Longest Substring with K Distinct Characters
- Minimum Window Substring
- Permutation in String

---

# 2️⃣ Zero Balance Shipment Combinations (4 Arrays Sum)

## 🧩 Problem

A logistics company manages shipments across **four warehouses**.  
Each warehouse provides a list of load values (which may be positive or negative).

We must select **exactly one value from each warehouse** such that the **total load equals zero**.

Find the number of tuples `(i, j, k, l)` satisfying:

```
A[i] + B[j] + C[k] + D[l] = 0
```

---

## 📥 Input

- `n` → size of arrays  
- Four arrays `A`, `B`, `C`, `D` each containing `n` integers

---

## 📤 Output

Print the number of **valid tuples whose sum equals 0**.

---

## Example

**Input**
```
2
1 2
-2 -1
-1 2
0 2
```

**Output**
```
2
```

---

## 🧠 Approach

### Brute Force Idea

Check all possible combinations:

```
for A
 for B
  for C
   for D
```

Time Complexity:

```
O(n⁴)
```

Since `n ≤ 200`, this approach becomes too slow.

---

## ⚡ Optimized Idea (Meet in the Middle)

Rearrange the equation:

```
A[i] + B[j] + C[k] + D[l] = 0
```

Group the terms:

```
(A[i] + B[j]) + (C[k] + D[l]) = 0
```

Which means:

```
A[i] + B[j] = -(C[k] + D[l])
```

---

### Algorithm Steps

1. Compute all sums of **A + B**.
2. Store them in a **HashMap with frequencies**.
3. Compute sums of **C + D**.
4. For each sum, check if its **negative exists in the HashMap**.
5. Add the frequency to the total count.

---

## ⏱ Complexity

| Approach | Time Complexity |
|--------|--------|
| Brute Force | O(n⁴) |
| Optimized | O(n²) |

---

## 📌 Key Concept Learned

**Meet in the Middle + HashMap Pair Sums**

Used when a problem involves:

```
A + B + C + D = target
```

Split the equation into two parts:

```
(A + B) and (C + D)
```

Store one half in a **HashMap** and search for its **complement**.

---

# 💡 What I Learned Today

- Sliding Window helps solve **substring optimization problems efficiently**
- HashMaps can significantly reduce time complexity
- Recognizing patterns like **Meet in the Middle** helps transform brute-force solutions into optimized ones

---

## 📚 References

- [Notes](notes.md)
- [Sliding Window Code](LongestSubstring.java)
- [4 Arrays Sum Solution](ZeroSumTuples.java)