# ?? LeetCode & SQL Problem Solving (Java & SQL)

[![LeetCode Stats](https://img.shields.io/badge/Problems%20Solved-250%2B-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.java.com/)
[![SQL](https://img.shields.io/badge/Language-SQL%20(MySQL%2FPostgreSQL)-CC292B?style=flat-square&logo=postgresql&logoColor=white)](https://www.mysql.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)](LICENSE)

A curated repository of **250+ LeetCode Data Structures & Algorithms solutions and SQL queries** written primarily in **Java** and **SQL**, created to prepare for Software Development Engineer (SDE) technical interviews.

---

## ?? Summary of Solutions

| Difficulty | Count | Percentage |
|---|---|---|
| ?? **Easy** | 84 | ~53.5% |
| ?? **Medium** | 71 | ~45.2% |
| ?? **Hard** | 2 | ~1.3% |
| **Total Solved** | **250+** | **100%** |

### Language Breakdown
- **Java (111 solutions)**: Core object-oriented implementations focusing on optimal time & space complexity, clean code, and standard library collections (HashMap, PriorityQueue, ArrayList, Deque).
- **SQL (48 solutions)**: Advanced relational queries covering multi-table joins, window functions (DENSE_RANK(), ROW_NUMBER()), grouping & aggregations (GROUP BY, HAVING), subqueries, and CTEs.
- **JavaScript (2 solutions)**: Prototype & functional algorithms.

---

## ?? Key Algorithmic Patterns & Topics Covered

### 1. Data Structures
- **Arrays & Hash Maps**: Frequency counting, two-pass hash maps, prefix sums, cycle detection, in-place rotation (Two Sum, Group Anagrams, Rotate Array).
- **Strings**: Palindrome verification, anagrams, sliding window pattern matchers (Valid Palindrome, Longest Palindromic Subsequence).
- **Linked Lists & Stacks**: Monotonic stacks, parenthesis matching, stack simulations (Validate Stack Sequences, Online Stock Span, Remove Adjacent Duplicates).
- **Trees & Binary Search Trees**: Recursive DFS, BFS level-order traversal, LCA, BST validation & construction (Construct BST from Preorder, Maximum Binary Tree, Two Sum IV).
- **Graphs**: Disjoint Set Union (DSU / Union-Find), Breadth-First Search (BFS), Depth-First Search (DFS) (Number of Provinces, Number of Islands, Keys and Rooms, Find if Path Exists in Graph).

### 2. Algorithmic Techniques
- **Dynamic Programming (1D & 2D)**: Memoization and bottom-up tabulation (House Robber I & II, Coin Change, Unique Paths II, Partition Equal Subset Sum, Longest Common Subsequence).
- **Binary Search**: Classic search, search in rotated sorted arrays, binary search on answer space (Search in Rotated Array, Koko Eating Bananas, Peak Index in Mountain Array).
- **Greedy & Bit Manipulation**: State tracking, bitwise XOR operations (Jump Game I & II, XOR Operation in Array, Minimum Bit Flips).

### 3. Database & SQL Queries
- **Joins & Set Operations**: LEFT JOIN, INNER JOIN, self-joins, cross joins (Combine Two Tables, Replace Employee ID with Unique Identifier).
- **Window Functions & Analytics**: DENSE_RANK(), rolling averages, consecutive occurrences (Department Top Three Salaries, Consecutive Numbers, Last Person to Fit in Bus).
- **Aggregations & Filtering**: CASE WHEN, conditional sums, GROUP BY, HAVING (Immediate Food Delivery, Confirmation Rate, Monthly Transactions).

---

## ?? Repository Structure

Each solution is organized in its own self-contained directory containing the source code and problem description:

`	ext
Leetcode-solution/
+-- 0001-two-sum/
¦   +-- 0001-two-sum.java          # Clean, optimal Java solution
¦   +-- README.md                  # Problem description, constraints & examples
+-- 0185-department-top-three-salaries/
¦   +-- 0185-department-top-three-salaries.sql  # Window function / join query
¦   +-- README.md                  # Schema description & problem statement
+-- 0200-number-of-islands/
¦   +-- 0200-number-of-islands.java # Graph BFS/DFS traversal
¦   +-- README.md
+-- stats.json                     # Automated LeetHub sync metadata & solution stats
+-- README.md                      # Index & summary documentation
`

---

## ?? How to Run Solutions Locally

### Java Solutions
Compile and test any solution with the Java Development Kit (JDK 8+):

`ash
# Navigate to a specific problem directory
cd 0001-two-sum

# Compile the Java file
javac 0001-two-sum.java
`

### SQL Queries
Queries are standard ANSI SQL compatible with PostgreSQL, MySQL 8+, and Oracle. You can run them against any SQL instance or test environment.

---

## ?? Goals & Continuous Learning
- [x] Complete NeetCode 150 core pattern practice
- [x] Master SQL 50 interview questions
- [ ] Practice advanced Hard DP and Graph algorithms (Topological Sort, Dijkstra)
- [ ] Participate regularly in LeetCode Biweekly and Weekly contests

---

## ?? License
This repository is open-source and available under the [MIT License](LICENSE).

<!---LeetCode Topics Start-->
# LeetCode Topics
## Depth-First Search
|  |
| ------- |
| [0207-course-schedule](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0207-course-schedule) |
| [0547-number-of-provinces](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0547-number-of-provinces) |
| [0743-network-delay-time](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0743-network-delay-time) |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Breadth-First Search
|  |
| ------- |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
| [0207-course-schedule](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0207-course-schedule) |
| [0547-number-of-provinces](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0547-number-of-provinces) |
| [0743-network-delay-time](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0743-network-delay-time) |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Union-Find
|  |
| ------- |
| [0547-number-of-provinces](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0547-number-of-provinces) |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Graph Theory
|  |
| ------- |
| [0207-course-schedule](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0207-course-schedule) |
| [0547-number-of-provinces](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0547-number-of-provinces) |
| [0743-network-delay-time](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0743-network-delay-time) |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Graph Coloring
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Bipartite Graph
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0001-two-sum) |
| [0014-longest-common-prefix](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0014-longest-common-prefix) |
| [0042-trapping-rain-water](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0042-trapping-rain-water) |
| [0055-jump-game](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0055-jump-game) |
| [0283-move-zeroes](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0283-move-zeroes) |
| [0496-next-greater-element-i](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0496-next-greater-element-i) |
| [0503-next-greater-element-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0503-next-greater-element-ii) |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0001-two-sum) |
| [0013-roman-to-integer](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0013-roman-to-integer) |
| [0141-linked-list-cycle](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0142-linked-list-cycle-ii) |
| [0160-intersection-of-two-linked-lists](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0160-intersection-of-two-linked-lists) |
| [0205-isomorphic-strings](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0205-isomorphic-strings) |
| [0242-valid-anagram](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0242-valid-anagram) |
| [0496-next-greater-element-i](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0496-next-greater-element-i) |
## Topological Sort
|  |
| ------- |
| [0207-course-schedule](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0207-course-schedule) |
## Directed Acyclic Graph
|  |
| ------- |
| [0207-course-schedule](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0207-course-schedule) |
## Minimum Spanning Tree
|  |
| ------- |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Prim's Algorithm
|  |
| ------- |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Kruskal's Algorithm
|  |
| ------- |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Borůvka's Algorithm
|  |
| ------- |
| [1584-min-cost-to-connect-all-points](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1584-min-cost-to-connect-all-points) |
## Heap (Priority Queue)
|  |
| ------- |
| [0743-network-delay-time](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0743-network-delay-time) |
## Shortest Path
|  |
| ------- |
| [0743-network-delay-time](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0743-network-delay-time) |
## Dijkstra's Algorithm
|  |
| ------- |
| [0743-network-delay-time](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0743-network-delay-time) |
## Two Pointers
|  |
| ------- |
| [0019-remove-nth-node-from-end-of-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0019-remove-nth-node-from-end-of-list) |
| [0042-trapping-rain-water](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0042-trapping-rain-water) |
| [0141-linked-list-cycle](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0142-linked-list-cycle-ii) |
| [0148-sort-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0148-sort-list) |
| [0151-reverse-words-in-a-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0151-reverse-words-in-a-string) |
| [0160-intersection-of-two-linked-lists](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0160-intersection-of-two-linked-lists) |
| [0234-palindrome-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0234-palindrome-linked-list) |
| [0283-move-zeroes](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0283-move-zeroes) |
| [0876-middle-of-the-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0876-middle-of-the-linked-list) |
| [2095-delete-the-middle-node-of-a-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/2095-delete-the-middle-node-of-a-linked-list) |
## Dynamic Programming
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0042-trapping-rain-water) |
| [0055-jump-game](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0055-jump-game) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0020-valid-parentheses) |
| [0042-trapping-rain-water](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0042-trapping-rain-water) |
| [0225-implement-stack-using-queues](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0225-implement-stack-using-queues) |
| [0232-implement-queue-using-stacks](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0232-implement-queue-using-stacks) |
| [0234-palindrome-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0234-palindrome-linked-list) |
| [0496-next-greater-element-i](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0496-next-greater-element-i) |
| [0503-next-greater-element-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0503-next-greater-element-ii) |
| [1021-remove-outermost-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1021-remove-outermost-parentheses) |
| [1614-maximum-nesting-depth-of-the-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1614-maximum-nesting-depth-of-the-parentheses) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0042-trapping-rain-water) |
| [0496-next-greater-element-i](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0496-next-greater-element-i) |
| [0503-next-greater-element-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0503-next-greater-element-ii) |
## Greedy
|  |
| ------- |
| [0055-jump-game](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0055-jump-game) |
| [1903-largest-odd-number-in-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1903-largest-odd-number-in-string) |
## Database
|  |
| ------- |
| [0176-second-highest-salary](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0176-second-highest-salary) |
## Linked List
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0002-add-two-numbers) |
| [0019-remove-nth-node-from-end-of-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0019-remove-nth-node-from-end-of-list) |
| [0141-linked-list-cycle](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0142-linked-list-cycle-ii) |
| [0148-sort-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0148-sort-list) |
| [0160-intersection-of-two-linked-lists](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0160-intersection-of-two-linked-lists) |
| [0206-reverse-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0206-reverse-linked-list) |
| [0234-palindrome-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0234-palindrome-linked-list) |
| [0237-delete-node-in-a-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0237-delete-node-in-a-linked-list) |
| [0328-odd-even-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0328-odd-even-linked-list) |
| [0876-middle-of-the-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0876-middle-of-the-linked-list) |
| [2095-delete-the-middle-node-of-a-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/2095-delete-the-middle-node-of-a-linked-list) |
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0002-add-two-numbers) |
| [0206-reverse-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0206-reverse-linked-list) |
| [0231-power-of-two](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0231-power-of-two) |
| [0234-palindrome-linked-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0234-palindrome-linked-list) |
## Floyd's Cycle Finding Algorithm
|  |
| ------- |
| [0141-linked-list-cycle](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0142-linked-list-cycle-ii) |
## Divide and Conquer
|  |
| ------- |
| [0148-sort-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0148-sort-list) |
## Sorting
|  |
| ------- |
| [0148-sort-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0148-sort-list) |
| [0242-valid-anagram](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0242-valid-anagram) |
## Merge Sort
|  |
| ------- |
| [0148-sort-list](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0148-sort-list) |
## Math
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0002-add-two-numbers) |
| [0013-roman-to-integer](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0013-roman-to-integer) |
| [0231-power-of-two](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0231-power-of-two) |
| [1903-largest-odd-number-in-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1903-largest-odd-number-in-string) |
## String
|  |
| ------- |
| [0013-roman-to-integer](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0013-roman-to-integer) |
| [0014-longest-common-prefix](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0014-longest-common-prefix) |
| [0020-valid-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0020-valid-parentheses) |
| [0151-reverse-words-in-a-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0151-reverse-words-in-a-string) |
| [0205-isomorphic-strings](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0205-isomorphic-strings) |
| [0242-valid-anagram](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0242-valid-anagram) |
| [0796-rotate-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0796-rotate-string) |
| [1021-remove-outermost-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1021-remove-outermost-parentheses) |
| [1614-maximum-nesting-depth-of-the-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1614-maximum-nesting-depth-of-the-parentheses) |
| [1903-largest-odd-number-in-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1903-largest-odd-number-in-string) |
## Bracket Sequences
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0020-valid-parentheses) |
| [1021-remove-outermost-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1021-remove-outermost-parentheses) |
| [1614-maximum-nesting-depth-of-the-parentheses](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/1614-maximum-nesting-depth-of-the-parentheses) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0014-longest-common-prefix) |
## String Matching
|  |
| ------- |
| [0796-rotate-string](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0796-rotate-string) |
## Bit Manipulation
|  |
| ------- |
| [0231-power-of-two](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0231-power-of-two) |
## Design
|  |
| ------- |
| [0225-implement-stack-using-queues](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0225-implement-stack-using-queues) |
| [0232-implement-queue-using-stacks](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0232-implement-queue-using-stacks) |
## Queue
|  |
| ------- |
| [0225-implement-stack-using-queues](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0225-implement-stack-using-queues) |
| [0232-implement-queue-using-stacks](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0232-implement-queue-using-stacks) |
## Tree
|  |
| ------- |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
## Binary Tree
|  |
| ------- |
| [0103-binary-tree-zigzag-level-order-traversal](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0103-binary-tree-zigzag-level-order-traversal) |
<!---LeetCode Topics End-->