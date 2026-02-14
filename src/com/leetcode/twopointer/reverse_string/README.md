## Problem

https://leetcode.com/problems/reverse-vowels-of-a-string/description/
345. Reverse Vowels of a String

## Pattern
Two Pointer


## Approach
Compare left side character with right character if both are vowel swap.
If left is not Vowel and right is Vowel, increment left
If left is vowel and right is not vowel, decrement right
else increment left and decrement right


## Dry Run
Input: s = "IceCreAm"

Step 1: left =0 right=7
left -> Vowel, right -> not Vowel 

Step 2: left =0 right=6
left -> Vowel, right -> Vowel
swap

....


## Complexity
Time: O(n) -> Single loop not nested loops
Space: O(n) -> String builder is created with same size as input string as string is immutable

## Issue Faced and findings
Use Character.toLowerCase('I') to get lowercase