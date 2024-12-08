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

### e. Implement the average function in a class Average and generate test cases using Junit. 
[Link to average class and averageTest class source files](https://github.com/UTDClassroomOrg/Individual-HW3-cse3354-003-f24-martinists/tree/main/HW3_Files/src)

### f. Compiling and running test cases and fixing failures.

Upon running the test cases, I received 5 failures out of 9 testcases. These include,
- testAverageSingleElementArray()
- testAverageK1()
- testAverageKEqualList()
- testAverageKOverList()
- testAverageKOneLessList()

These tests failed because the average class' for loop iterated starting from 1 to less than the value n, which means that when determining the average, the program skips the first index in the array since the array index in Java starts at 0 and not 1. The code looks like `for(int i = 1; i < n; i++)` on line 8. To fix this, instead of instantiating i to 1, it must be instantiated to 0. The corrected code looks like `for(int i = 0; i < n; i++)` on line 8. This causes all 9 test cases to pass.

### g. Code Coverage (VS Code)
![Code Coverage Image](https://github.com/UTDClassroomOrg/Individual-HW3-cse3354-003-f24-martinists/blob/main/HW3_Coverage.png)

#### Sources Used
- Visual Studio Code
- Kung Book Ch. 20 (Black-Box Testing)
- Test Runner for Java extension from Microsoft
