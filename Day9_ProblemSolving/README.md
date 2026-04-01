# 📝 Daily Coding Log – Day X

Today I practiced **Two Pointer techniques**, focusing on optimization from brute force to efficient solutions.

Problems covered:

- 3Sum
- Container With Most Water

---

# 1️⃣ 3Sum

## 🧩 Problem

Given an integer array `nums`, return all unique triplets:

```
nums[i] + nums[j] + nums[k] = 0
```

Where:

- `i ≠ j ≠ k`
- No duplicate triplets allowed

---

## 📥 Example

Input
```
[-1, 0, 1, 2, -1, -4]
```

Output
```
[[-1, -1, 2], [-1, 0, 1]]
```

---

## 🎯 Goal

- Find all **unique triplets**
- Sum of triplet = **0**
- Avoid duplicates

---

## 🧠 Approach / Pattern

**Pattern:** Sorting + Two Pointers

---

### Steps

1. Sort the array
2. Fix one element `i`
3. Use two pointers:
   - `left = i + 1`
   - `right = n - 1`
4. Check sum:
   - If sum = 0 → store result
   - If sum < 0 → move `left++`
   - If sum > 0 → move `right--`
5. Skip duplicates

---

## ⏱ Complexity

Time Complexity
```
O(n²)
```

Space Complexity
```
O(1)  (excluding result list)
```

---

## 🔑 Key Takeaways

- Sorting helps in **duplicate handling**
- Two pointers reduce complexity from **O(n³) → O(n²)**
- Always skip duplicate elements to avoid repeated triplets

---

# 2️⃣ Container With Most Water

## 🧩 Problem

Given an array `height[]`, where each element represents height of a vertical line.

Find two lines such that they form a container that holds the **maximum water**.

---

## 📥 Example

Input
```
[1,8,6,2,5,4,8,3,7]
```

Output
```
49
```

---

## 🎯 Goal

Maximize the area:

```
area = min(height[left], height[right]) * (right - left)
```

---

## 🧠 Approach / Pattern

**Pattern:** Two Pointers

---

### Steps

1. Initialize:
```
left = 0
right = n - 1
```

2. Calculate area
3. Move pointer with **smaller height**
4. Repeat until `left < right`

---

## 💡 Key Insight

The limiting factor is:

```
min(height[left], height[right])
```

So we move the pointer pointing to the **smaller height** to try finding a better height.

---

## 🔍 Dry Run Idea

Start with widest container → gradually reduce width  
Try improving height → maximize area

---

## ⏱ Complexity

Time Complexity
```
O(n)
```

Space Complexity
```
O(1)
```

---

## 🔑 Key Takeaways

- Always think of **width vs height tradeoff**
- Moving the taller pointer is useless
- Two pointer approach reduces **O(n²) → O(n)**

---

# 💡 What I Learned Today

- Two pointers can drastically reduce complexity
- Sorting helps convert brute force into optimal solutions
- Pattern recognition is key:
  - 3Sum → Sorting + Two Pointers
  - Container → Greedy Two Pointer

---

## 📚 References

- [Notes](notes.md)
- [3Sum Code](ThreeSum.java)
- [Container Code](ContainerWithMostWater.java)