package main

import "fmt"

func adder() func(int) int {
	sum := 0
	return func(x int) int {
		sum += x
		return sum
	}
}

func main() {
	pos, neg := adder(), adder()
	for i := 0; i < 10; i++ {
		fmt.Println(
			pos(i),
			neg(-i),
		)
	}
}
/*
- Go functions may be closures.
- A closure is a FUNCTION VALUE that REFERENCES variables from OUTSIDE its body.
- The function may access and assign to the referenced variables; in this sense the function is "bound" to the variables.
*/

/*
0 0
1 -1
3 -3
6 -6
10 -10
15 -15
21 -21
28 -28
36 -36
45 -45
*/