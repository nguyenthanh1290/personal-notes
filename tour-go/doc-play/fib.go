package main

import "fmt"

// fib returns a function that returns
// successive Fibonacci numbers.
func fib() func() int {
	a, b := 0, 1
	return func() int {
		a, b = b, a+b
		return a
	}
}

func main() {
	f := fib()
	// Function calls are evaluated left-to-right.
	fmt.Println(f(), f(), f(), f(), f())
	// 1 1 2 3 5
	fmt.Println(fib()(), fib()(), fib()(), fib()())
	// 1 1 1 1
	d := fib()
	fmt.Println(d(), d(), d(), d())
	// 1 1 2 3
}
