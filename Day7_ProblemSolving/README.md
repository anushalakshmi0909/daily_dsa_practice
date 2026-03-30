# 📝 Daily Coding Log - March 30, 2026

Welcome to my daily coding log. Today I solved **2 major problems** using stack and tree-based patterns. Each problem includes description, input/output, approach, and links to notes and code.

---

## 1️⃣ Encrypted Message Decoder

**Problem:** Decode strings with nested patterns like `3[a2[c]]` → `accaccacc`.

**Input / Output:**
- Input: `"3[a]2[bc]"`
- Output: `"aaabcbc"`

**Approach / Pattern:**
- **Pattern:** Stack + StringBuilder
- Maintain **two stacks**: one for numbers, one for previous strings
- Append repeated substring on closing bracket
- Handles nested and multi-digit numbers

**Complexity:**
- Time: O(n)
- Space: O(n)

**References:**
- [Notes](notes.md)
- [Code](EncryptedMessageDecoder.java)

---

## 2️⃣ Chennai Weather Forecasting System

**Problem:** For each day, find the number of days until a warmer temperature occurs.

**Input / Output:**
- Input: `8\n73 74 75 71 69 72 76 73`
- Output: `1 1 4 2 1 1 0 0`

**Approach / Pattern:**
- **Pattern:** Monotonic Stack
- Stack stores indexes of pending warmer days
- Update answer when a warmer temperature is found

**Complexity:**
- Time: O(n)
- Space: O(n)

**References:**
- [Notes](notes.md)
- [Code](hennaiWeatherForecast.java)

---

## 🔑 Key Takeaways Today

- Stack + auxiliary stack → great for nested operations and min/max tracking
- Monotonic stack → excellent for next greater element problems
- Practice dry runs and pseudocode before coding → reduces bugs