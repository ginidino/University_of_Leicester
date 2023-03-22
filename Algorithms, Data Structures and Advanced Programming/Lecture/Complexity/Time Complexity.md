# Time Complexity
* The time complexity can be said to the number of times the instructions set of an algorithm executes. So, the tiem complexity is defined in the terms of N where N is the function of input size(N)
* **The time complexity is divided into three categories**
  - **Best Case Time Complexity**
    * The best case time complexity is defined for the input that is taking to minimum time for execution
  - **Average Case Time Complexity**
    * As the name suggests the average case time complexity is defined for all possible inputs as we calculate computing time for all of the inputs and then divide ther result by the total number of inputs 
  - **Worst Case Time Complexity** 
    * The worst-case time complexity is defined as the input that is taking the maximum time for execution

## Running time in RAM model
* Each "simple" operation (e.g., +,-,*,=,+= etc) take one time step
* Each read, print, and return statement takes one time step
* Each comparison takes one time step
* The running time of the sequence of statements is the sum of running times of the statements
* Loop and functions are considered as the composition of many simple operations, and their running time depends upon how many times each of these simple operations are performed

## Calculate the running time
<img width="588" alt="Screenshot 2023-03-22 at 10 17 14 pm" src="https://user-images.githubusercontent.com/94044443/227050960-1da943f6-7ea2-4624-aa23-02d48c84130c.png">
Total running time = 3 + (N + 1) + 2N = 3N + 4
