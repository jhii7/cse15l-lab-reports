# Lab Report 9
## Scenario 1

Desired behavior: Run the tests (which are hopefully successful).

It appears that the bug is a result of a missing class, `ArrayTests.java`.

To get the expected output, we would need to find the missing class and implement it. If i had to tutor someone, I would tell them that this should be the first thing they do when they create the file.

I have made this same mistake (renamed a class on accident), but luckily I was able to catch the error too. Just going over and checking the code one last time is very helpful and goes a long way towards making sure it runs smoothly. 

## Scenario 2

Desired behavior: Run the shell script `grade.sh` which grades the following repository.

This bug is tricky as we cannot see the full `grade.sh` file. Just a guess, but it appears that the bug is a result of a missing hamcrest file in the `lib` directory.

To get the expected output, we must add this missing file into the `lib` directory so that our tests can proceed and run.

I have made this mistake by forgetting a `lib` directory while running my JUnit tests, and none of my tests were able to run. It is important to make sure that this folder exists so that the tests have the resources to compile and run. 

## Scenario 3


Desired behavior: Run shell script `bug.sh` and have it compare VAR and 1. If they are equal, print "it was 1"

This bug is a result of a missing whitespace character between the bracket and the enclosed comparison. `if [[1 -eq $VAR ]]` should instead be `if [[ 1 -eq $VAR ]]`. Note the space in between the 1 and the bracket. 

Missing whitespace is a tricky thing to catch, especially in bash where the whitespace actually matters. I have not encountered this error myself, but seeing how it completely messed up the function of the code, I will keep this in mind for future coding purposes. 

## Scenario 4

Desired behavior: Run Code.java and have it find if a certain file exists or not.

The bug here is that Code.java only searches the working directory for an existing file. It does not check different folders for the desired file. The solution to this would be to implement a loop which searches through each directory

This is a routine problem for me. By expecting a piece of code to act a certain way, I create many different errors which I then have to go back and solve. By reading the documentation properly and taking my time, I feel that this error may be remedied sooner. 
