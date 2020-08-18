from main import rec_fib, iter_fib

def test_fib():
    assert rec_fib(0) == 0
    assert rec_fib(1) == 1
    assert rec_fib(5) == 5
    assert rec_fib(8) == 21

def test_iter_fib():
    assert iter_fib(0) == 0
    assert iter_fib(1) == 1
    assert iter_fib(5) == 5
    assert iter_fib(8) == 21