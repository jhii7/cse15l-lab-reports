# Week 1 Lab Report
## `cd` command

**1. No arguments**  
![Image](cdnoargs.PNG)  
The working directory was `/home/`. There are no arguments, which means that we "change directories" to nothing (we stay at home). Also, the default behavior of `cd` without arguments changes the directory to `/home/`.    

**2. Directory argument**  
![Image](cddirectoryarg.PNG)  
The working directory was `/home/`. We change directories to `/home/lecture1/`  

**3. File argument**  
![Image](cdfilearg.PNG)  
The working directory was `/home/lecture1/`. Since `Hello.java` is not a directory, this returns an error. We cannot change our directory to a file.  

## `ls` command
**1. No arguments**  
![Image](lsnoargs.PNG)  
The working directory was `/home/`. Without any arguments, `ls` lists the files that are contained in the `/home/` directory.  

**2. Directory argument**  
![Image](lsdirectoryarg.PNG)  
The working directory was `/home/`. Using the `lecture1` argument, `ls` lists the files under the `lecture1` directory.  

**3. File argument**  
![Image](lsfileargs.PNG)  
The working directory was `/home/lecture1/messages/`. By using `en-us.txt` as our argument, we list out the file name, "en-us.txt".



## `cat` command
**1. No arguments**  
![Image](catnoargs.PNG)  
The working directory was `/home/`. Running `cat` with no arguments essentially "copies" amy further text written and repeats it upon input.  

**2. Directory argument**  
![Image](catdirectoryarg.PNG)  
The working directory was `/home/`. When we run `cat`, our output is that `lecture1` is a directory. We cannot concatenate a directory, as it is not a file.  

**3. File argument**  
![Image](catfileargs.PNG)  
The working directory was `/home/lecture1/`. We can concatenate the contents of file `Hello.java`, which prints out the contents of that file to the command line.  
