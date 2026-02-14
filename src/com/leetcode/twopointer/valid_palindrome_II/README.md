## Problem

https://leetcode.com/problems/valid-palindrome-ii/description/

680.Valid Palindrome II

## Pattern
Two Pointer


## Approach
Compare left side character with right character if they don't match
check if the left+1, right is palindrome or left, right -1 is palindrome


## Dry Run
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.

Step 1: left =0 right=3
left and right match 

Step 2: left =1 right=2
left and right don't match
check palindrome for s, 2, 2 -> true
output true


## Complexity
Time: O(n) -> Single loop not nested loops (palindrome method is called only once in loop not nested repeatedly)

Space: O(1) -> No additional space used

## Issue Faced and findings
