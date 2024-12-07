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
### a. Write a brief functional description for the function.
### b. Generate functional test case based on functional description.
### c. Identify and specify the partitions and generate partition test cases.
### d. Generate boundary value test cases.
### e. Implement the average function in a class Average and generate test cases using Junit. (Please also submit this part of the assignment in your individual GitHub classroom code)
### f. Compile and run the test cases. Record any failures and errors that are reported. Analyze and briefly explain why each of the failures and errors occurs and how you fix them. Correct all the failures and errors until the CUT (Component Under Test) passes all the test cases.
### g. Measure the code coverage using a code coverage tools such as EclEmma. Your test case must achieve 100% branch coverage.
