Algorithm Relationship & Selection Guide
This comprehensive guide helps you understand how different algorithm patterns relate to each other, when to use them, and how to combine them effectively to solve complex problems.

Quick Pattern Selection
By Problem Characteristics
Problem Signal	Primary Pattern	Alternative/Combined	Time Complexity
Sorted array + target finding	Binary Search	Two Pointers	O(log n)
Two elements + condition	Two Pointers	Hash Table	O(n) vs O(n)
Subarray/substring with condition	Sliding Window	Two Pointers	O(n)
Linked list cycle/middle	Fast & Slow Pointers	Hash Set	O(n) vs O(n)
Tree/graph traversal	DFS/BFS	Recursion	O(V+E)
All combinations/permutations	Backtracking	Bit Manipulation	O(2^n)
Optimization problem	Dynamic Programming	Greedy	O(n²) vs O(n log n)
Top-K elements	Heap	Sorting	O(n log k) vs O(n log n)
Fast lookup/counting	Hash Table	Sorting	O(1) vs O(log n)
Range queries	Prefix Sum	Segment Tree	O(1) vs O(log n)

Core Pattern Relationships
Two Pointers Family
Core Variants:

Opposite Direction: Start/end → middle (Two Sum, Palindrome)
Same Direction: Slow/fast pointers (Remove duplicates, Cycle detection)
Sliding Window: Dynamic window size (Longest substring)
Connects with:

Binary Search: Both use left/right pointers to narrow search space
Merge Operations: Essential for merging sorted arrays/lists
Hash Tables: Can optimize O(n²) two-pointer solutions to O(n)
Fast & Slow Pointers: Specialized for linked list problems
Example Combinations:

3Sum = Sort + Two Pointers (reduce O(n³) to O(n²))
Merge Intervals = Sort + Two Pointers (track start/end)
Container With Most Water = Two Pointers (greedy optimization)

Binary Search Family
Core Variants:

Standard: Find exact target in sorted array
Lower/Upper Bound: Find insertion position
Binary Search on Answer: Search solution space
Connects with:

Two Pointers: Binary search uses left/right pointers
Divide & Conquer: Classic divide-and-conquer application
Dynamic Programming: Binary search on DP answer space
Monotonic Properties: Requires some form of ordering/monotonicity
Example Combinations:

Split Array Largest Sum = Binary Search + DP validation
Search in Rotated Array = Modified Binary Search
Kth Smallest in Matrix = Binary Search + Two Pointers

Sliding Window Family
Core Variants:

Fixed Size: Window size is constant (Average of subarrays)
Variable Size: Window expands/contracts (Longest substring)
Two-Pointer Window: Left/right pointers define window
Connects with:

Two Pointers: Sliding window IS two pointers moving in same direction
Hash Tables: Track elements in current window
Deque: For sliding window maximum/minimum
Example Combinations:

Longest Substring Without Repeating = Sliding Window + Hash Set
Sliding Window Maximum = Sliding Window + Monotonic Deque
Minimum Window Substring = Variable Sliding Window + Hash Map

Tree & Graph Traversal
Core Variants:

DFS: Recursive/Stack-based depth exploration
BFS: Queue-based level exploration
Topological Sort: Ordering with dependencies
Connects with:

Stack/Queue: DFS uses stack, BFS uses queue
Backtracking: DFS with state restoration
Dynamic Programming: Many DP problems require specific traversal
Union Find: For connectivity problems
Example Combinations:

Path Sum = DFS + Backtracking
Level Order Traversal = BFS + Queue
Course Schedule = Topological Sort + BFS/DFS
Word Ladder = BFS + Hash Set

Hash Table Patterns
Core Applications:

Fast Lookup: O(1) access time
Frequency Counting: Count occurrences
Caching/Memoization: Store computed results
Connects with:

Two Pointers: Can optimize O(n²) solutions to O(n)
Dynamic Programming: Memoization storage
Sliding Window: Track window contents
Graph Algorithms: Store visited nodes

Heap & Priority Queue
Core Applications:

Top-K Problems: Maintain K largest/smallest elements
Streaming Data: Process data as it arrives
Graph Algorithms: Dijkstra's, Prim's algorithm
Connects with:

Sorting: Heap sort algorithm
Graph Traversal: Priority-based exploration
Two Pointers: Both find extreme values efficiently

Dynamic Programming
Core Variants:

1D DP: Linear state progression
2D DP: Grid/matrix problems
State Machine DP: Multiple states at each position
Connects with:

Hash Tables: Memoization storage
Binary Search: Search answer space
Graph Traversal: State transitions
Greedy: Some DP problems have greedy solutions

Smart Pattern Selection Strategy
Step 1: Identify Problem Type
Data Analysis Questions:
• What's the input structure? (Array, Tree, Graph, String)
• Is the data sorted or can it be sorted efficiently?
• What's the expected output? (Single value, All solutions, Optimization)
• Are there constraints? (Time limit, Space limit, Online algorithm)

Step 2: Pattern Decision Tree
INPUT ANALYSIS
├── Sorted Array/List
│   ├── Target Finding → Binary Search O(log n)
│   ├── Two Elements → Two Pointers O(n)
│   └── Range Queries → Binary Search + Prefix Sum
│
├── Unsorted Array
│   ├── Need Sorting → Quick/Merge Sort O(n log n)
│   ├── Frequency Count → Hash Table O(n)
│   ├── Subarray Problems → Sliding Window/Prefix Sum O(n)
│   └── Top-K Elements → Heap O(n log k)
│
├── String Problems
│   ├── Pattern Matching → KMP/Two Pointers O(n)
│   ├── Anagrams/Permutations → Hash Table/Sliding Window
│   └── Palindromes → Two Pointers/DP
│
├── Tree/Graph
│   ├── Path Finding → BFS O(V+E)
│   ├── All Paths → DFS + Backtracking
│   ├── Connectivity → Union Find O(α(n))
│   └── Shortest Path → Dijkstra O(E log V)
│
└── Optimization Problems
    ├── Overlapping Subproblems → Dynamic Programming
    ├── Greedy Choice Property → Greedy Algorithm
    └── Search Space → Binary Search on Answer

Step 3: Complexity Trade-offs
Pattern	Time	Space	Best For	Avoid When
Hash Table	O(1) avg	O(n)	Lookups, counting	Memory constrained
Binary Search	O(log n)	O(1)	Sorted data	Unsorted data
Two Pointers	O(n)	O(1)	Linear scan with condition	Random access needed
Sliding Window	O(n)	O(k)	Subarray problems	Non-contiguous elements
DFS/BFS	O(V+E)	O(V)	Graph traversal	Memory limited
Dynamic Programming	O(n²) avg	O(n)	Optimization with overlap	Simple greedy works
Heap	O(log n)	O(n)	Priority-based access	All elements needed

Advanced Pattern Combinations
Proven Hybrid Approaches
1. Binary Search + Dynamic Programming
Problem Type: Optimization with searchable answer space
Example: "410. Split Array Largest Sum"
Strategy: Binary search the answer, DP to validate feasibility
Time: O(n × log(sum)) vs O(n³) brute force
2. Sliding Window + Hash Table
Problem Type: Variable-length subarray with constraints
Example: "76. Minimum Window Substring"  
Strategy: Expand window with right pointer, contract with left
Time: O(n) vs O(n²) brute force
3. DFS + Memoization (Top-down DP)
Problem Type: Recursive problems with overlapping subproblems
Example: "329. Longest Increasing Path in Matrix"
Strategy: DFS exploration + cache results
Time: O(mn) vs O(4^(mn)) without memoization
4. Two Pointers + Sorting
Problem Type: Finding pairs/triplets with conditions  
Example: "15. 3Sum"
Strategy: Sort first, then apply two pointers
Time: O(n²) vs O(n³) brute force
5. Monotonic Stack + Hash Table
Problem Type: Next greater/smaller element problems
Example: "496. Next Greater Element I"
Strategy: Monotonic stack for pattern + hash for lookup
Time: O(n) vs O(n²) brute force
6. Union Find + DFS
Problem Type: Dynamic connectivity with path exploration
Example: "547. Number of Provinces" 
Strategy: Union Find for connectivity + DFS for exploration
Time: O(n²α(n)) efficient for multiple queries

Pattern Evolution Strategy
Start Simple → Optimize Gradually

Level 1: Brute Force
• Understand the problem completely
• Get a working solution first
• Time: Usually O(n²) or O(n³)

Level 2: Single Pattern Optimization  
• Apply most obvious pattern
• Binary Search for sorted data
• Hash Table for lookups
• Time: Usually O(n log n) or O(n)

Level 3: Hybrid Optimization
• Combine complementary patterns
• Consider space-time trade-offs  
• Handle edge cases efficiently
• Time: Often optimal O(n) or O(log n)

Level 4: Advanced Optimizations
• Bit manipulation for constant factors
• Cache-friendly algorithms
• Parallel/concurrent approaches
• Hardware-specific optimizations

Cross-Reference to Local Implementations
(See folders in this repo.)

Real-World Problem Examples
- Social Media Feed: Heap + Hash Table + BFS
- Autocomplete: Trie + Heap + Hash Table
- Stock Trading: Sliding Window + DP + Monotonic Stack
- File Deduplication: Hash Table + Union Find + DFS

Debugging & Optimization Checklist
When Too Slow: sort data, cache repeated work, use hash lookups, remove nested loops, binary-search the answer.
When Too Memory Heavy: two pointers, streaming, compress state, iterative over recursive.
When Hard to Debug: start brute-force, add prints, test small cases, separate concerns.

Performance Order (asymptotic)
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2^n) < O(n!)
