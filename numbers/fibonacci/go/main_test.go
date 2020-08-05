package main

import "testing"

func TestRecursiveFib(t *testing.T) {
	expectedValues := []struct {
		input  int
		output int
	}{
		{0, 0},
		{1, 1},
		{2, 1},
		{3, 2},
		{5, 5},
		{6, 8},
		{7, 13},
	}
	for _, entry := range expectedValues {
		result, _ := recursiveFib(entry.input)
		CheckInt(result, entry.output, t)
	}
}

func TestIterativeFib(t *testing.T) {
	expectedValues := []struct {
		x   int
		res int
	}{
		{0, 0},
		{1, 1},
		{2, 1},
		{3, 2},
		{5, 5},
		{6, 8},
		{7, 13},
	}
	for _, v := range expectedValues {
		resultIter, _ := iterativeFib(v.x)
		resultRec, _ := recursiveFib(v.x)
		CheckInt(resultIter, v.res, t)
		CheckInt(resultRec, v.res, t)
	}
}

func CheckInt(ret, expected int, t *testing.T) {
	if ret != expected {
		t.Error("Expected:", expected, "Got:", ret)
	} else {
		t.Log("SUCCESS")
	}
}
