# Shell Script

## Question1
```
Hello! This is the first shell scripting exercise for module CO1101.
The script is being run by user `xyz123`.
The current directory is `/the/current/directory`.
```

Except that the username "xyz123" should be replaced by the actual username used to run the script, and the directory "/the/current/directory" should be replaced with the path of the actual directory where the script is executed.

```shell
#!/bin/bash

echo "Hello! This is the first shell scripting exercise for module CO1101."
echo "The script is being run by user $USER"
echo "The current directory is $PWD"
```

## Question2
Write a simple script q2-pwc.sh for system access through password. Create a variable named VALID_PASSWORD and assign it a value. Then ask the user to enter password. If the password entered matches the assigned password, the message “You have Access” should appear. If the password does not match, the message “ACCESS DENIED” should appear. 

```shell
#!/bin/bash

VALID_PASSWORD=password123
echo "Enter the password: "
read USER_PASSWORD

if [ "$VALID_PASSWORD" == "$USER_PASSWORD" ]; then
	echo "You have Access"
else
	echo "ACCESS DENIED"
fi
```
## Question3
Write a shell script called q3-sort.sh that takes a file path to a data file (of the form described above) as its single command line argument. The script should use the Sort command to produce four sorted versions of the file based on the four different columns. The four output files will contain all of the original data, but arranged in a new order

If the original file is called ffff.txt then the four output files should be called:   
1. alpha-ffff.txt normal alphabetic sort based on the names in the first column;
2. size-ffff.txt sort based on the "human readable" size in the second column; so 1000 is less than 1K, which is less than 2M, etc;
3. date-ffff.txt, sort based on the 3 letter month in the third column; so "Jan" is before "Feb", etc;
4. value-ffff.txt sort based on the decimal numeric value in the fourth column; so 5.1 is less than 10, etc

```shell
#!/bin/bash

FILENAME=$1

sort -t";" -k1 $FILENAME > ALPHA_$FILENAME
sort -t";" -h -k2  $FILENAME > SIZE_$FILENAME
sort -t";" -M -k3  $FILENAME > DATE_$FILENAME
sort -t";" -n -k4  $FILENAME > VALUE_$FILENAME
```
