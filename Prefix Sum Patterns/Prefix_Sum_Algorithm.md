#### Prefix Sum Algorithm 

- The prefix sum algorithm is a technique used to preprocess an array so that range sum queries can be answered efficiently. It is widely used in competitive programming and data structure problems.


### Understandings

- Basically the prefix sum algoirthm allows us to precompute cumulative sums and retrive the sum of any subarray in constant time
  
#### Conept 

- Given an array of A of length N , the prefix sum array P is defined as:

- P [i] = P[i-1] + A[i]

With the Base Case as :
P[0] = A[0]

Basically the algorithm has two steps 
1) Compute the prefix sum array 
2) Answer range sum queries efficiently
   { Sum(L,R) = P[R] - P[L-1]}



```java
//Compute Prefix sum Array 

public static int[] computeprefixSum(int[] arr){
    int n = arr.length;
    int[] prefixsum = new int[n];
    prefixsum[0] = arr[0];

    for (int i = 1; i < n ; i++){
        prefixsum[i] = prefixsum[i-1] + arr[i];
    }
    return prefixsum;
}
```

```java
// Get sum of range[L,R]

public static int rangeSum(int[] prefixsum, int L, int R){
    if (L == 0) return prefixSum[R];
    return prefixsum[R] - prefixsum[L-1];
}
```


#### Time Complexity 

- Prefix Sum Computation O(N)
- Query Sum O(1)