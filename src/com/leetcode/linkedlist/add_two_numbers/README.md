## Problem

https://leetcode.com/problems/add-two-numbers/
2. Add Two Numbers

## Pattern
Linked List traversal


## Approach
Traverse both the list l1 and l2 using current pointer. Take sum of value of l2 
and l2. Take there remainder and the carry value. 
Remainder value is the next node value and carry will be used as sum for next iteration


## Dry Run
Input: l1 = [2,4,3], l2 = [5,6,4]

Step 1: 
sum = 0 
2 + 5 = 7 
carry = 0, rem = 7 
curr.next = new ListNode(7); 

Step 1:
sum = 0
4 + 6 = 10
carry = 1, rem = 0
curr.next = new ListNode(0);

Step 3:
sum = 1
3 + 4 + 1 = 8
carry = 0, rem = 8
curr.next = new ListNode(8);

## Complexity
Time: O(max(n, m)) -> Max iteration equal max number of nodes list
Space: O(max(n, m) + 1) -> O(max(n, m) + 1) -> max of m, n digits in result plus 1 for carry

## Issue Faced and findings
Initial approach was to find integer add then reverse and add to head. 
This approach fails because number can go out of int range.
Also [0] [0] both linked list have 0 then loop never executes