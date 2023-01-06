# Workshop6

## Question 1
1. Write a function that takes in a file name and print the contents of the file (line by line) all in upper case. This function does not need to return anything.
2. Test your program with the file text.txt.

Code
```py
def capitalise_txt(file):
    '''Inputs: a text file
        Outputs: Normally nothing as we print on the screen the read text in capital letters
        But here we return the string 'Done'
    '''
    try:
        fhand = open(file, 'r')
        try:
            for line in fhand:
                print(line.upper())
        except:
            print("Processing error!")
        finally:
            fhand.close()
    except FileNotFoundError:
        print("Could not open the file!")
        
    
    return ['Done']

## Running the function
file = 'text.txt'
capitalise_txt(file)
```
Output
```
THE AVENUE RANGE STATION MASSACRE WAS THE MURDER OF AT LEAST NINE ABORIGINAL TANGANEKALD PEOPLE, 

WHO WERE SHOT BY WHITE SETTLERS ON THE AVENUE RANGE PASTORAL STATION IN THE COLONY OF 

SOUTH AUSTRALIA AROUND SEPTEMBER 1848, DURING THE AUSTRALIAN FRONTIER WARS. 

THOSE CONFIRMED TO HAVE BEEN KILLED WERE AN OLD BLIND MAN, THREE WOMEN, TWO TEENAGE GIRLS, 

AND THREE FEMALE CHILDREN, INCLUDING A BABY. THE SHEEP FARMER JAMES BROWN (PICTURED) AND HIS OVERSEER, 

EASTWOOD, WERE SUSPECTED, AND BROWN WAS CHARGED WITH THE MURDER OF "UNKNOWN ABORIGINAL NATIVES" IN MARCH 1849. 

THE MAGISTRATE WHO COMMITTED HIM FOR TRIAL SAID THAT THERE WAS "LITTLE QUESTION OF THE BUTCHERY OR THE BUTCHER". 

FURTHER INVESTIGATION WAS ORDERED, BUT BY THE NOVEMBER 1849 SITTINGS OF THE SUPREME COURT IN THE COLONIAL 

CAPITAL OF ADELAIDE, THE CASE HAD BEEN DROPPED. AT THE TIME THERE WERE SIGNIFICANT RESTRICTIONS ON THE USE OF 

EVIDENCE GIVEN BY ABORIGINAL WITNESSES, ESPECIALLY WHERE A VERDICT COULD INVOLVE CAPITAL PUNISHMENT. 
Out[3]:
['Done']
```

## Question 2
```
import random as rd
def mysqrt(x, eps):
  “””Inputs:two numbers x, eps such that x >= 0, eps>=0
  Output: a number res such that x-eps <= res*res <=x+eps “””
  g = rd.uniform(0, x) #random guess
  gsquared = g*g
  while (gsquared<x-eps or gsquared>x+eps):
    g = (g+x/g)/2 #new g is average of g and x/g
    gsquared = g*g
  return g
```

1. Modify the given code so as all the estimates of the value g for each iteration of the loop are stored into the file outputs.txt. You need to record also the iteration number. 

Use the Python command `format()` to format the numbers so that floats are printed with 3 decimal places. A sample output with `mysqrt(45, 1.e-8)` may look as follows:
```
At iteration 1, the estimated squared root is 12.691
At iteration 2, the estimated squared root is 8.118
At iteration 3, the estimated squared root is 6.831
At iteration 4, the estimated squared root is 6.709
At iteration 5, the estimated squared root is 6.708
At iteration 6, the estimated squared root is 6.708
```

2. Add an exception-handling construct to deal with the possibility of a `ZeroDivisionError` in the code.
3. Add assertions to the code in order to ensure that the inputs and outputs satisfy the constraints as given in the docstring of the function. Remember that constraints on the inputs/outputs as called pre-conditions/post-conditions respectively. Ensure your code is robust by handling exceptions that may arise.

Code
```py
import random as rd
def mysqrt(x, eps):
    """Inputs:two numbers x, eps such that x >= 0, eps>=0
        Output: a number res such that x-eps <= res*res <=x+eps """
    g = rd.uniform(0, x) #random guess
    gsquared = g*g
    count = 1
    try:
        fhand = open('outputs.txt', 'w')
        assert(x>=0) # to add in robustness
        assert(eps>=0) # to be robust
        while (gsquared<x-eps or gsquared>x+eps):
            try:
                g = (g+x/g)/2 #new g is average of g and x/g
            except ZeroDivisionError:
                print("Cannot divide by zero")
                g = g+10*eps #artificial increment to keep the code run
            fhand.write('At iteration '+'{:d}'.format(count)+\
                        ', the estimated squared root is '+\
                        '{:.3f}'.format(g)+'\n')
            gsquared = g*g
            count = count+1
        return g
        assert (gsquared >= x-eps and gsquared <= x+eps)
    except AssertionError:
        print("Assertion violated!")
    except:
        print("Something went wrong")
    finally:
        fhand.close() # closing the file
        
# Run the function
res = '{:.5f}'.format(mysqrt(45, 1.e-8))
print(res)
```
Output
```
6.70820
```
Output.txt
```
At iteration 1, the estimated squared root is 14.470
At iteration 2, the estimated squared root is 8.790
At iteration 3, the estimated squared root is 6.955
At iteration 4, the estimated squared root is 6.713
At iteration 5, the estimated squared root is 6.708
At iteration 6, the estimated squared root is 6.708
```

## Question 3
1. Open the csv file and observe that it contains rows of numbers separated by comma. Please do not edit nor modify the given csv file.
2. Write the function `read_csv_data`, which takes as input a file name and returns a list of lists storing all the data in the given file.
3. Write the function averages that takes as input the output from the function `read_csv_data` and returns a list composed of the averages for each row of the data. If the row is empty, then you should return nan as the average for that row. For that purpose, you can import the package numpy and the nan value is represented by `numpy.nan`. Before setting the average to nan, ensure the row is empty by using an `assertion` into your code.
4. Write a function `print_averages` that takes as input the averages calculated in question 3 and displays on the screen the average for each data row. A sample run this function is as follows:
```
Row 0 average is 15.783
Row 1 average is 11.117
Row 2 average is 15.025
Row 3 average is 10.025
Row 4 average is 27.300
Row 5 average is nan
Row 6 average is 4.600
```
Code
```py
def remove_empty(mylist):
    """
        A simple utility function to remove empty strings
        from a GIVEN list of strings
    """
    res = mylist[:] #or res = mylist.copy()
    for c in mylist:
        if c=='':
            res.remove(c)
    return res

# processing a csv file containing rows of decimal numbers
def read_csv_data(file):
    ''' Inputs: a csv file
        Outputs: a list of lists; each inner list is a row of data from the csv file
    '''
    try:
        fhand = open(file, 'r')
        res = []
        for line in fhand:
            # convert to string after split
            c_line = ''.join(line.split())
            # remove commas
            nums = c_line.split(',') 
            # remove empty strings if any
            nums = remove_empty(nums)
            #convert to float
            nums = [float(x) for x in nums]
            res.append(nums)
        fhand.close()
        return res
    except FileNotFoundError:
        print("File not found!")
    except:
        print("Processing error!")
read_csv_data('Z:/CO1102Labs/data.csv')
# averages by row
def averages(data):
    '''
        Inputs: data, which is a list of rows (lists)
        Outputs: a list formed by averages of each row of data
    '''
    import numpy as np
    avgs = []
    for row in data:
        try:
            if len(row)>0:
                avg = sum(row)/len(row)
                avgs.append(avg)
            else:
                assert(len(row)==0)
                avgs.append(np.nan)
        except AssertionError:
            print('Assertion violated')
        except:
            print("Someting went wrong")
    return avgs
def print_averages(avgs):
    '''
        inputs: a list containing the averages
        Output: None but just printing the contents of the list on the screen
    '''
    for i in range(len(avgs)):
        print("Row ", i, "average is", '{:5.3f}'.format(avgs[i]))

data = read_csv_data('data.csv')
row_averages = averages(data)
print_averages(row_averages)
```
Output
```
[[23.1, 3.5, 56.4, -12.4, 2.7, 21.4],
 [-2.4, 36.0, 1.9, 12.6, 6.3, 12.3],
 [34.6, 25.0, -10.8, 11.3],
 [3.4, 23.6, 14.5, 17.3, 14.8, -13.45],
 [27.3],
 [],
 [2.4, 6.8]]

Row  0 average is 15.783
Row  1 average is 11.117
Row  2 average is 15.025
Row  3 average is 10.025
Row  4 average is 27.300
Row  5 average is   nan
Row  6 average is 4.600
```
