# Dynamic Programming

<p>
<img src="">
</p>

<hr />

## Task list

- [x] [Introduction](#what-is-dynamic-programming)
- [ ] Problems
	- [x] [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
	- [x] [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
	- [x] [House Robber](https://leetcode.com/problems/house-robber/)
	- [ ] [Maximum Alternating Subsequence Sum](https://leetcode.com/problems/maximum-alternating-subsequence-sum/) 
	- [ ] [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)
	- [ ] [Target Sum](https://leetcode.com/problems/target-sum/)
	- [ ] [Coin Change](https://leetcode.com/problems/coin-change/)
	- [ ] [Coin Change II](https://leetcode.com/problems/coin-change-2/)
	- [ ] [Minimum Cost for Tickets](https://leetcode.com/problems/minimum-cost-for-tickets/)
	- [ ] [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
	- [ ] [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
	- [ ] [Edit Distance](https://leetcode.com/problems/edit-distance/)
	- [ ] [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/)
	- [ ] [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring)
	- [ ] [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)
	- [ ] [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)

---


## What is Dynamic Programming?

- General, powerful algorithm design technique
- Dynamic Programming was invented by a guy named Richard Bellman
- We can solve problems by polynomial time using DP
- Intended for optimization problems
	- Like shortest paths, minimum-length path ( to find the best way to do something)
	- Minimize or maximaze something (optimization problem)


- DP => recursion + memoization
- DP => subproblems + "reuse"


---

### Top-Down approach

		     Fib(4)
                     /    \
                Fib(3)    Fib(2)
               /     \     /   \
          Fib(2)  Fib(1) Fib(1)  Fib(0)
         /    \
    Fib(1) Fib(0)


### Bottom-up approach

| Fib(0) | Fib(1) | Fib(2) | Fib(3) | Fib(4) |
| ---    | ---    | ---    | ---    | ---    |


---


## DP Patterns

### Fibonacci Numbers Pattern

#### Problems:
- [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
- [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)
- [House Robber](https://leetcode.com/problems/house-robber/)
- [Maximum Alternating Subsequence Sum](https://leetcode.com/problems/maximum-alternating-subsequence-sum/)


---


#### Fibonacci Number

- F(0) = 0, F(1) = 1
- F(n) = F(n-1) + F(n-2) -> {for n >= 2}
- Example: Fibonacci(6)

| F(6) | F(5) | F(4) | F(3) | F(2) | F(1) | F(0) |
| ---  | ---  | ---  | ---  | ---  | ---  | ---  |

- Approach:
	- Use two recursive calls for finding F(n-1) and F(n-2)
	- Add them to get F(n) and to store F(n) in an array (memoization)


#### Climbing Stairs `Amazon`

- Use two recursive calls for taking 1 step and 2 steps
- Add both of the count and to store the distinct no. of count in an array (memoization)


#### House Robber `Google`



#### Maximum Alternating Subsequence Sum `Facebook`, `Amazon`, `Google`



---


### Zero / One Knapsack pattern

#### Problems:

- [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)
- [Target Sum](https://leetcode.com/problems/target-sum/)

---


### Unbounded Knapsack pattern

#### Problems:

- [Coin Change](https://leetcode.com/problems/coin-change/)
- [Coin Change II](https://leetcode.com/problems/coin-change-2/)
- [Minimum Cost for Tickets](https://leetcode.com/problems/minimum-cost-for-tickets/)

---


### Longest Common Subsequence pattern

#### Problems:

- [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
- [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
- [Edit Distance](https://leetcode.com/problems/edit-distance/)
- [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/)

---


### Palindromes (pattern)

#### Problems:

- [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring)
- [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)
- [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)

---