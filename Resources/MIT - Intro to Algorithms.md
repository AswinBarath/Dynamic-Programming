# Dynamic Programming

<p>
<img src="">
</p>

<hr />

## Task list

- [x] Introduction
- [ ] Problems
	- [ ] Memoization and subproblems
	- [ ] Fibonacci 
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

<hr />

## What is Dynamic Programming?

- General, powerful algorithm design technique
- Dynamic Programming was invented by a guy named Richard Bellman
- We can solve problems by polynomial time using DP
- Intended for optimization problems
	- Like shortest paths, minimum-length path ( to find the best way to do something)
	- Minimize or maximaze something (optimization problem)


- SRTBOT Recursive algorithm paradigm
- DP is going to build on this template by adding one new idea called memoization
- DP => recursion + memoization
- DP => subproblems + "reuse"


## SRTBOT acronym - Recursive algorithm design paradigm

- SRTBOT : Sub-problems, Relations, Topological order, Base case, Original Problem and Time
- This will help you remember all the steps you need in order to specify a recursive algorithm


## Fibonacci numbers

- F1 = F2 = 1
- Fn = Fn-1 + Fn-2
- Goal: Compute Fn

### Naive recursive algorithm
```
fib(n):
	if n <= 2 : f = 1
	else: f = fib(n-1) + fib(n-2)
	return f
```
- EXPONENTIAL TIME (Bad algorithm)

### Memoized DP algorithm

```
memo = {} 
fib(n):
	if n in memo: return memo[n]
	if n <= 2 : f = 1
	else: f = fib(n-1) + fib(n-2)
	memo[n] = f
	return f
```


