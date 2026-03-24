## Observations 📝
- The problem describes a corporate hierarchy.
- Hierarchical relationships usually indicate a **tree structure**.

## Patterns Identified 🔑
- Hierarchy → Tree
- Each node has at most two children → Binary Tree
- Level by level traversal → BFS (Queue)

## Key Notes / Mistakes to Avoid ⚠️
- BFS requires using a **queue data structure**.
- Use the **queue size trick** to process nodes level by level.
- Avoid recursion for level grouping problems; iterative BFS is usually clearer.

## Dry Run Example 🏃

Input
3
1 2 3

Tree

      1
     / \
    2   3

Queue Simulation

| Step | Queue | Output |
|-----|------|-------|
| Start | [1] | |
| Process Level 0 | [2,3] | 1 |
| Process Level 1 | [] | 2 3 |

## Similar Problems 📚
- Binary Tree Level Order Traversal
- Right Side View of Binary Tree
- Average of Levels in Binary Tree
- Zigzag Level Order Traversal