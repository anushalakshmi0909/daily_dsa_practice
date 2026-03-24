# Problem: Corporate Hierarchy Level Display 🌳

## Problem Context
Given a corporate hierarchy where the CEO is at the top and each employee can have at most two subordinates, display the employees **level by level**.

The input is provided in **level order format**, and the task is to print each level of the hierarchy on a new line.

---

## Example

Input
3
1 2 3

Tree Representation

      1
     / \
    2   3

Output
1
2 3

---

## Approach: Breadth-First Search (BFS) using Queue 🔍

To print nodes level by level, we use **Breadth-First Search (BFS)**.

Steps:
1. Insert the root node into a queue.
2. While the queue is not empty:
   - Determine the current queue size (represents nodes at that level).
   - Process exactly those nodes.
   - Add their children to the queue.
3. Move to the next level.

---

## Complexity

Time Complexity: **O(n)**  
Space Complexity: **O(n)**

---

## Key Learning ✨

- Hierarchical problems often map to **Tree structures**.
- When nodes need to be processed **level by level**, the solution usually involves **BFS with a Queue**.
- Using the **queue size technique** helps separate levels naturally.

This problem strengthened my ability to **recognize patterns in problem statements before implementing a solution.**