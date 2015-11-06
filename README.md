# COMSCI_4_16_1411: How to generate a random uppercase letter.

## Introduction

For this assignment I will create a program to generate a random number from the Math.random() code. This program will take the randomly generated number and translate it to a corresponding uppercase letter. The code will be managed using Git source code management and this document is edited through github.com.

## Outline
``` Java
//Generate a random uppercase letter (using a custom method call)
//Print the random letter to the console
```

## References and Literature
#### This section was copied in class from Dr. Evert's README.md
```Java
// Liang Java 10th edition, Pg 87 Listing 3.3
// This is an example of how to make a random number
// int number1 = (int) (Math.random() *10);

// Liang Java 10th edition. Pg 125, Table 4.4
// We can map from integers to capital letters
// Characters "A" and "Z" have a value in decimal from 65 to 90.

// Liang Java 10th edition. pg 122, 4.2.5 The random method.
// a + Math.random() * b
//returns a random number between a & a+b but excludes a+b.
```

## Code
``` Java
public class COMSCI_4_16_1411 {
	public static void main(String[] args) {
		
		
		// A=65, Z=90
		// To cover the possible outputs, we need a range from 65 to 25.
		// a will be 65
		// b will be 25
		// Because the code excludes the upper limit of a+b, we must add one to raise the upper limit.
		int number = (int) (65 + Math.random() *(25+1));
		System.out.println (number);
		char letter =(char)number;
		System.out.println (letter);

	}

}
```
## Console Output
#### Run 1:
S
#### Run 2:
W
#### Run 3:
I

## Git commands used in command prompt
C:\Users\LAB>dir
 Volume in drive C is OS
 Volume Serial Number is BEA5-2D8E

C:\Users\LAB>T:

T:\>dir
 Volume in drive T is ThawSpace0
 Volume Serial Number is F486-90AC

 Directory of T:\

11/02/2015  09:15 AM    <DIR>          CSEclipseWorkspace
               0 File(s)              0 bytes
               1 Dir(s)   1,025,552,384 bytes free

T:\>cd CSEclipseWorkspace

T:\CSEclipseWorkspace>dir
 Volume in drive T is ThawSpace0
 Volume Serial Number is F486-90AC

 Directory of T:\CSEclipseWorkspace

11/02/2015  09:15 AM    <DIR>          .
11/02/2015  09:15 AM    <DIR>          ..
08/25/2014  08:03 AM    <DIR>          .metadata
09/02/2015  09:16 AM    <DIR>          Area of a circle
10/30/2015  08:33 AM    <DIR>          Boolean
10/30/2015  08:14 AM    <DIR>          COMSCI_1033_ADDITION
11/02/2015  09:15 AM    <DIR>          COMSCI_4_16_1411
10/14/2015  08:10 AM    <DIR>          COMSCI_HW_ADDITION_GAME
09/14/2015  08:35 AM    <DIR>          Demo
09/18/2015  08:01 AM    <DIR>          In_Class_9_18
10/12/2015  08:44 AM    <DIR>          l
09/11/2015  12:36 PM    <DIR>          LabelDemo
10/30/2015  09:16 AM    <DIR>          Methods
09/11/2015  08:05 AM    <DIR>          Problem 1.12
10/02/2015  12:11 PM    <DIR>          project
10/02/2015  12:23 PM    <DIR>          project test
09/16/2015  12:10 PM    <DIR>          the account class
               0 File(s)              0 bytes
              17 Dir(s)   1,025,552,384 bytes free

T:\CSEclipseWorkspace>cd COMSCI_4_16_1411

T:\CSEclipseWorkspace\COMSCI_4_16_1411>echo # COMSCI_4_16_1411 >> README.md

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git init
Initialized empty Git repository in T:/CSEclipseWorkspace/COMSCI_4_16_1411/.git/

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git add README.md

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git config user.name "Dakota Davis"

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git config user.email "davisds@student.sw
osu.edu

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git commit -m "first commit"
[master (root-commit) 1476d39] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git remote add origin https://github.com/
dakotadavis/COMSCI_4_16_1411.git

T:\CSEclipseWorkspace\COMSCI_4_16_1411>git push -u origin master
Username for 'https://github.com': dakotadavis
Password for 'https://dakotadavis@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 235 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/dakotadavis/COMSCI_4_16_1411.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

T:\CSEclipseWorkspace\COMSCI_4_16_1411>

# Conclusion
For this assignment I learned that there are more, conceivably infinite possibilities for the Math.Random () code. I see many applications for this in my own daily and professional work, and my mind was reeling with the possibilities this code presents. Also, the formatting presented in the github.com README.md editor is a more convenient and professional tool to manage a report.
