# Question 1

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
file = 'Z:/CO1102Labs/text1.txt'
capitalise_txt(file)

# Question 2
import random as rd


def mysqrt(x, eps):
    """Inputs:two numbers x, eps such that x >= 0, eps>=0
        Output: a number res such that x-eps <= res*res <=x+eps """
    g = rd.uniform(0, x)  # random guess
    gsquared = g * g
    count = 1
    try:
        fhand = open('outputs.txt', 'w')
        assert (x >= 0)  # to add in robustness
        assert (eps >= 0)  # to be robust
        while (gsquared < x - eps or gsquared > x + eps):
            try:
                g = (g + x / g) / 2  # new g is average of g and x/g
            except ZeroDivisionError:
                print("Cannot divide by zero")
                g = g + 10 * eps  # artificial increment to keep the code run
            fhand.write('At iteration ' + '{:d}'.format(count) + \
                        ', the estimated squared root is ' + \
                        '{:.3f}'.format(g) + '\n')
            gsquared = g * g
            count = count + 1
        return g
        assert (gsquared >= x - eps and gsquared <= x + eps)
    except AssertionError:
        print("Assertion violated!")
    except:
        print("Something went wrong")
    finally:
        fhand.close()  # closing the file


# Run the function
res = '{:.5f}'.format(mysqrt(45, 1.e-8))
print(res)

# Question 3
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

read_csv_data('Z:/CO1102Labs/data.csv')
data = read_csv_data('Z:/CO1102Labs/data.csv')
row_averages = averages(data)
print_averages(row_averages)