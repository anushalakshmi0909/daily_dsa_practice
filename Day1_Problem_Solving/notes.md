## Observations 📝
- Problem involves searching for two elements that sum to a target.
- Brute force works but is O(n²).

## Patterns Identified 🔑
- Array + Complement Search
- HashMap can reduce time complexity to O(n)

## Key Notes / Mistakes to Avoid ⚠️
- Always check complement **before inserting** the current number.
- Keep track of indices, do not sort the array unnecessarily.
- Watch out for duplicate numbers.

## Dry Run Example 🏃‍♂️
nums = [2, 7, 11, 15], target = 9

| Index | Num | Complement | HashMap | Action         |
|-------|-----|------------|---------|----------------|
| 0     | 2   | 7          | {}      | Add 2 → 0      |
| 1     | 7   | 2          | {2:0}   | 2 exists → return [0,1] ✅ |

## Similar Problems 📚
- 3Sum
- 4Sum
- Two Sum II (sorted array)
