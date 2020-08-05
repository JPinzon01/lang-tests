use std::io;
fn main() {
    loop {
        println!("Enter a positive integer");
        let mut x = String::new();
        io::stdin().read_line(&mut x).expect("Failed to read line");
        let x = x.trim().parse::<u128>();
        if !x.is_err() {
            println!("{}", iter_fib(x.unwrap()););
            break;
        }
    }
}

/// Recursive implementation of Fibonacci's algorithm.
/// 
/// # Examples
/// ```
/// let x = 5
/// let let res = rec_fib(x.unwrap());
/// assert_eq!(6, res);
/// ```
fn rec_fib(x: u128) -> u128 {
    match x {
        0 => 0,
        1 => 1,
        _ => rec_fib(x - 1) + rec_fib(x - 2),
    }
}

/// Iterative implementation of Fibonacci's algorithm.
/// 
/// # Examples
/// ```
/// let x = 5
/// let let res = iter_fib(x.unwrap());
/// assert_eq!(6, res);
/// ```
fn iter_fib(x: u128) -> u128 {
    let mut last_values = (0, 1);
    for _ in 1..x + 1 {
        last_values = (last_values.1, last_values.0 + last_values.1);
    }
    last_values.0
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_fib() {
        assert_eq!(fib(0), 0);
        assert_eq!(fib(1), 1);
        assert_eq!(fib(5), 5);
        assert_eq!(fib(8), 21);
    }

    #[test]
    fn test_iter_fib() {
        assert_eq!(iter_fib(0), 0);
        assert_eq!(iter_fib(1), 1);
        assert_eq!(iter_fib(5), 5);
        assert_eq!(iter_fib(8), 21);
    }
}