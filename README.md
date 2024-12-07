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
<br> int k;
| Test Case | Scenario | Input | Expected Output |
| --- | --- | --- | --- |
| TC 1 | Empty List | list = {}; <br> k = 1; | return average = 0; |
| TC 2 | `k` is negative or 0 | list = {1, 2, 3 , 4}; <br> k = -1; | return average = 0; |
| TC 3 | `k` within list length| list = {3, 5, 6 , 7}; <br> k = 2; | return average = 4; //(3 + 5)/2 |
| TC 4 | `k` over list length | list = {2, 4, 3, 5, 7}; <br> k = 9; | return average = 4; //(2 + 4 + 3 + 5 + 7)/5 |

### c. Identify and specify the partitions and generate partition test cases.
**`k` Partitions:**
- Partition 1: **k <= 0:** No subset of array selected
- Partition 2: **0 < k < list.length:** A subset of array `list` averaged
- Partition 3: **k >= list.length:** Entire array `list` is averaged

**`list` Partitions:**
- Partition 4: **list.length = 0:** Empty array `list`.
- Partition 5: **list.length > 0:** Non-empty array `list`.

**Partition Test Cases**
| Test Case | Scenario | Input | Expected Output |
| --- | --- | --- | --- |
| TC 1 (Partition 1) | k <= 0 | list = {1, 2, 3, 4}; <br> k = 0; | return average = 0; |
| TC 2 (Partition 2) | 0 < k < list.length | list = {4, 2, 6, 1}; <br> k = 2; | return average = 3; |
| TC 3 (Partition 3) | k >= list.length | list = {3, 5, 7}; <br> k = 5; | return average = 5; |
| TC 4 (Partition 4) | list.length = 0 | list = {}; <br> k = 5; | return average = 0; |
| TC 5 (Partition 5) | list.length > 0 | list = {2, 4, 6}; <br> k = 3; | return average = 4; |

### d. Generate boundary value test cases.
| Test Case | Scenario | Input | Expected Output |
| --- | --- | --- | --- |
| TC 1 (Boundary 1) | k = 0 | list = {1, 2, 3, 4}; <br> k = 0; | return average = 0; |
| TC 2 (Boundary 2) | k = 1 | list = {1, 2, 3, 4}; <br> k = 1; | return average = 1; |
| TC 3 (Boundary 3) | k = -1 | list = {1, 2, 3, 4}; <br> k = -1; | return average = 0; |
| TC 4 (Boundary 4) | k = list.length | list = {1, 2, 3, 4}; <br> k = 4; | return average = 2; |
| TC 5 (Boundary 5) | k = list.length + 1 | list = {1, 2, 3, 4}; <br> k = 5; | return average = 2; |
| TC 6 (Boundary 6) | k = list.length - 1 | list = {3, 4, 6, 7, 1}; <br> k = 4; | return average = 5; |
| TC 7 (Boundary 7) | list.length = 0 | list = {}; <br> k = 1; | return average = 0; |
| TC 8 (Boundary 8) | list.length = 1 | list = {3}; <br> k = 1; | return average = 3; |

### e. Implement the average function in a class Average and generate test cases using Junit. (Please also submit this part of the assignment in your individual GitHub classroom code)

### f. Compile and run the test cases. Record any failures and errors that are reported. Analyze and briefly explain why each of the failures and errors occurs and how you fix them. Correct all the failures and errors until the CUT (Component Under Test) passes all the test cases.

### g. Measure the code coverage using a code coverage tools such as EclEmma. Your test case must achieve 100% branch coverage.
