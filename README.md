# Individual HW 3
Individual HW3 Testing: Martin Hoang

## Average Function Testing (Java)

For the "average" function we will do the following:

 ------------------------------------------------------------------------------------------------------------------
    public class Average {
     
      public int average(int k, int[] list){

                int average = 0;
                int n = Math.min(k, list.length);
                if( n > 0) {
                            for(int i = 0 ; i < n; i++){
                                        average += list[i];
                            }
                            average = average/n;
                }
                return average;
      }}
-------------------------------------------------------------------------------------------------------------------
### a. Brief Functional Description
The `average` function takes an input of int `k` and int array `list` as its parameters and if the minimum value of `k` or the end of the `list` is not negative, then `n` will represent the last index of the sublist of `list` and the program calculates and returns the average of a sublist of the array `list` from index 0 to `n` by cumulatively adding the integers in those indexes to the `average` and then dividing the `average` by `n`. If the minimum value from `k` to the end of the list is negative, then the `average` is 0.

### b. Generate functional test case based on functional description.
int[] list = A_1, A_2, ... , A_m; // (m is length of list)
int k;
| Test Case | Scenario | Input | Expected Output |
| --- | --- | --- | --- |
| Case 1 | if m = 0 (empty list). | list = {}; <br> k = 1; | return average = 0; |
| Case 2 | if m = 1 (single-element). | list = {5}; <br> k = 5;| return average = 5; |
| Case 3 | if m >= 2 and k <= 0 | list = {1, 2, 3 , 4}; <br> k = -1; | return average = 0; |
| Case 4 | if m >= 2 and 0 < k < m | list = {3, 5, 6 , 7}; <br> k = 2; | return average = 4; //(3 + 5)/2 |
| Case 5 | if m >= 2 and k >= m | list = {2, 4, 3, 5, 7}; <br> k = 9; | return average = 4; //(2 + 4 + 3 + 5 + 7)/5 |

### c. Identify and specify the partitions and generate partition test cases.

### d. Generate boundary value test cases.

### e. Implement the average function in a class Average and generate test cases using Junit. (Please also submit this part of the assignment in your individual GitHub classroom code)

### f. Compile and run the test cases. Record any failures and errors that are reported. Analyze and briefly explain why each of the failures and errors occurs and how you fix them. Correct all the failures and errors until the CUT (Component Under Test) passes all the test cases.

### g. Measure the code coverage using a code coverage tools such as EclEmma. Your test case must achieve 100% branch coverage.
