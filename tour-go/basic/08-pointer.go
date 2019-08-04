package main

import (
	"fmt"
)

func main() {
	i := 7
	fmt.Println("Memory address: ", &i)

	inc1(i)
	fmt.Println("i not modified: ", i)

	inc2(&i)
	fmt.Println("i incremented successfully: ", i)
	fmt.Println("i memory address after incremented: ", &i, " , still the same")
}

func inc1(x int) {
	x++
}

func inc2(x *int) {
	*x++
}