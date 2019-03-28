# Find minimum swap required for sorting an unordered array consisting of consecutive integers

## Solution: 

Uses internal Graph creation between element at specified index to element present at its actual index and so on till it reaches to already visited element, which creats closed loop. Boolean array is maintained to track already visited index.

For example, it will take 5 iterations to swap the given array :

7, 1, 3, 2, 4, 5, 6
