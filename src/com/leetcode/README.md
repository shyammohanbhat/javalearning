# LeetCode Patterns

## 🔁 Quick Trigger Words Table

| Keyword | Pattern |
|---------|---------|
| pair, sorted | Two Pointers |
| subarray, substring | Sliding Window |
| next greater, next smaller | Stack / Monotonic Stack |
| duplicate, frequency | HashMap / HashSet |
| cycle, loop, fast/slow | Linked List Slow-Fast Pointer |
| min/max, capacity, speed | Binary Search |
| level, distance, shortest | BFS |
| root-to-leaf, path sum | DFS + Backtracking |
| top k, heap | Priority Queue |
| max sum, ways, count | DP |
---

## 1️⃣ Arrays / Strings

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| Two Pointers | Sorted arrays, pairs, remove duplicates, reverse, palindrome | sorted, pair, reverse, palindrome, remove duplicates | `int l=0, r=n-1; while(l<r){ // logic }` | Two Sum II, Container With Most Water, Reverse String, Remove Duplicates |
| Sliding Window | Contiguous subarray/substring, longest/shortest, count | substring, subarray, window, longest, shortest | `left=0; for(right=0; right<n; right++){ while(condition) left++; }` | Longest Substring Without Repeating, Min Window Substring, Max Sum Subarray of Size K |
| Prefix / Suffix Sum | Range sum queries, subarray sum = K | range sum, prefix sum, continuous sum | `prefix[i] = prefix[i-1] + nums[i]; sum(l,r) = prefix[r]-prefix[l-1];` | Subarray Sum Equals K, Range Sum Query |
| Hashing (Map/Set) | Fast lookup, frequency, duplicates, counting | count, distinct, duplicate, frequency | `map.put(x,map.getOrDefault(x,0)+1);` | Two Sum, Group Anagrams, Longest Consecutive Sequence |
| Monotonic Stack | Next/previous greater/smaller, histogram, sliding max | next greater, next smaller, previous greater/smaller, span | `while(!st.isEmpty() && curr>st.peek()) st.pop(); st.push(curr);` | Next Greater Element I/II, Daily Temperatures, Largest Rectangle Histogram |

---

## 2️⃣ Linked Lists

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| Slow/Fast Pointer | Cycle detection, middle, palindrome | cycle, loop, middle, fast/slow | `while(fast!=null && fast.next!=null){ slow=slow.next; fast=fast.next.next; }` | Linked List Cycle, Middle of Linked List, Palindrome Linked List |
| Dummy Node / In-place modification | Insert/delete first node, merge, remove nodes | remove nodes, merge, insert at head | `ListNode dummy = new ListNode(0); dummy.next=head; curr=dummy;` | Remove Nth Node, Merge Two Sorted Lists |
| Reverse Linked List | Reverse a list or part of it | reverse, in-place | `prev=null; curr=head; while(curr!=null){ temp=curr.next; curr.next=prev; prev=curr; curr=temp; }` | Reverse Linked List I/II, Reverse K Group |

---

## 3️⃣ Stack / Queue

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| Monotonic Stack | NGE / NSE, histogram, temperatures | next greater, next smaller, span, daily temperatures | See monotonic stack template | Next Greater Element I/II, Daily Temperatures, Largest Rectangle Histogram |
| Queue / BFS | Level-order traversal, sliding window max | level, distance, span, window | Use `Queue<TreeNode>` for BFS | Sliding Window Maximum, Binary Tree Level Order Traversal |
| Deque (2-ended queue) | Sliding window, max/min, stock span | max of last k elements | `Deque<Integer> dq = new ArrayDeque<>();` | Sliding Window Maximum, Online Stock Span |

---

## 4️⃣ Binary Search / Search Space

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| Standard Binary Search | Find element in sorted array | search, sorted | `while(low<=high){ mid=low+(high-low)/2; if(arr[mid]==target)... }` | Binary Search, Search in Rotated Sorted Array |
| Search Space / Answer Binary Search | Optimize min/max, speed, capacity | minimum, maximum, capacity, speed | `while(low<=high){ mid=...; if(possible(mid)) high=mid-1; else low=mid+1; }` | Koko Eating Bananas, Minimize Max Distance |

---

## 5️⃣ Trees

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| DFS / Recursion | Visit all nodes, path problems | depth, height, max path, root-to-leaf | `dfs(node.left); dfs(node.right);` | Max Depth, Diameter, Path Sum |
| BFS / Level-order | Level by level | level, minimum, rightmost, bottom view | `Queue<TreeNode> q = new LinkedList<>();` | Level Order Traversal, Zigzag Traversal, Right Side View |
| Divide & Conquer | Subtree aggregation | combine results from left/right | `int left=helper(node.left); int right=helper(node.right); return max(left,right)+1;` | Max Depth, Diameter, Balanced Tree |
| Path Tracking / Backtracking | Root-to-leaf paths | root-to-leaf, path sum, sequence | Add/remove node to path during recursion | Path Sum II, Binary Tree Paths |
| BST | Ordered tree logic | BST property, successor/predecessor, range query | Use `left < node.val < right` | Validate BST, LCA BST, Kth Smallest |

---

## 6️⃣ Graphs

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| DFS | Explore nodes, connected components | connected, component, visited | Recursive DFS, mark visited | Number of Islands, Word Search |
| BFS | Shortest path in unweighted graph | shortest path, levels | Queue BFS | Minimum Depth of Binary Tree, Sliding Puzzle |
| Topological Sort | DAG / dependencies | order, dependency, prerequisite | DFS + stack or BFS Kahn’s | Course Schedule I/II |
| Union-Find | Connected components | group, connected, union | Parent array with path compression | Redundant Connection, Number of Connected Components |

---

## 7️⃣ Backtracking

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| Generate combinations / permutations | All possible arrangements | all subsets, all permutations, N-Queens | `for(choice){ choose; backtrack; unchoose; }` | Subsets, Permutations, Combination Sum, N-Queens |
| DFS + pruning | Constraints | sum ≤ target, distinct, no repetition | Prune early | Combination Sum, Word Search |

---

## 8️⃣ Dynamic Programming (DP)

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| 1D DP | Linear optimization | max sum, ways, count | `dp[i] = f(dp[i-1], ...)` | Climbing Stairs, House Robber, Max Subarray |
| 2D DP | Grid / matrix / substring | path count, edit distance, longest common | `dp[i][j] = f(dp[i-1][j], dp[i][j-1], ...)` | Unique Paths, Edit Distance, Longest Common Subsequence |
| Tree DP | Subtree optimization | subtree sum / max / height | Memoize left/right | Max Path Sum, Diameter |

---

## 9️⃣ Heap / Priority Queue

| Pattern | When to Use | Trigger Words | Template / Hint | Classic Problems |
|---------|------------|---------------|----------------|-----------------|
| Max / Min heap | Kth largest/smallest, top elements | top k, largest, smallest | `PriorityQueue<Integer> pq = new PriorityQueue<>();` | Kth Largest Element, Merge K Sorted Lists |
| Sliding window + heap | Top elements in window | sliding window max | Use heap of size k | Sliding Window Maximum |

---

