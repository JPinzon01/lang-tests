def main():
    while True:
        try:
            x = int(input('Enter a positive number:\n'))
            print(iter_fib(x))
            break
        except ValueError:
            continue

def rec_fib(x):
    """Recursive implementation of Fibonacci's algorithm."""
    if x < 0:
        raise ValueError("Only positive integers allowed")
    if x == 0:
        return 0
    elif x == 1:
        return 1
    else:
        return rec_fib(x - 1) + rec_fib(x - 2)

def iter_fib(x):
    """Iterative implementation of Fibonacci's algorithm."""
    if x < 0:
        raise ValueError("Only positive integers allowed")
    f0, f1 = 0, 1
    for _ in range(x):
        f0, f1 = f1, f0 + f1
    return f0
