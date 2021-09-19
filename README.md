# Dynamic Programming

<p>
<img src="">
</p>

<hr />

## Task list

- [x] Introduction
- [ ] Problems
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 
	- [ ] 


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

| ---    | ---    | ---    | ---    | ---    |
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

| ---  | ---  | ---  | ---  | ---  | ---  | ---  |
| F(6) | F(5) | F(4) | F(3) | F(2) | F(1) | F(0) |
| ---  | ---  | ---  | ---  | ---  | ---  | ---  |


---


#### Climbing Stairs



---

