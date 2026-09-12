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
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Breadth-First Search
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Union-Find
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Graph Theory
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Graph Coloring
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
## Bipartite Graph
|  |
| ------- |
| [0785-is-graph-bipartite](https://github.com/Ashwani-mic/Leetcode-solution/tree/master/0785-is-graph-bipartite) |
<!---LeetCode Topics End-->