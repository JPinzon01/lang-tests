package main

import (
	"bufio"
	"errors"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	for {
		reader := bufio.NewReader(os.Stdin)
		fmt.Println("Enter a positive integer")
		text, _ := reader.ReadString('\n')
		i, err := strconv.Atoi(strings.TrimSpace(text))
		if err != nil {
			continue
		}
		result, err := iterativeFib(i)
		if err != nil {
			continue
		}
		fmt.Println(result)
		break
	}
}

// Recursive implementation of Fibonacci's algorithm.
func recursiveFib(x int) (int, error) {
	if x < 0 {
		return -1, errors.New("Only positive integers allowed")
	}
	switch x {
	case 0:
		return 0, nil
	case 1:
		return 1, nil
	default:
		return mustFib(x-1) + mustFib(x-2), nil
	}
}

// Iterative implementation of Fibonacci's algorithm.
func iterativeFib(x int) (int, error) {
	f0 := 0
	f1 := 1
	if x < 0 {
		return -1, errors.New("Only positive integers allowed")
	}
	for i := 1; i <= x; i++ {
		f0, f1 = f1, f0+f1
	}
	return f0, nil
}

// Runs recursiveFib without error handling, as input validation was done before.
func mustFib(x int) int {
	result, err := recursiveFib(x)
	if err != nil {
		panic(err)
	}
	return result
}
