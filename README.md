# Homework2

## Answer number 4.1
```
public static long fibonacci(int n) {
 // the base case
 if (n < 2) return 1;
 // the recursive step
 return fibonacci(n-1) + fibonacci(n-2);
}
```
This function is so slow because every time this method is call, it creates a stack frame to store the data and every calling will make two more recursion, so the more number the more slow.  

