from main import fib, iter_fib

def test_fib():
    assert fib(0) == 0
    assert fib(1) == 1
    assert fib(5) == 5
    assert fib(8) == 21

def test_iter_fib():
    assert iter_fib(0) == 0
    assert iter_fib(1) == 1
    assert iter_fib(5) == 5
    assert iter_fib(8) == 21