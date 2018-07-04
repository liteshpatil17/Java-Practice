
import java.util.Scanner;

/*
 * In this problem, a String is composed of lowercase alphabets and wildcard characters i.e. '?'. Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify the given String on the basis of following rules:

If there are more than 3 consonants together or more than 5 vowels together, the String is considered to be "BAD". A String is considered "GOOD" only if it is not “BAD”.

NOTE: String is considered as "BAD" if the above condition is satisfied even once. Else it is "GOOD".

Input:
The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of a string s. 

Output:
If the string is GOOD,  Print "1"  else print "0".

Constraints: 
1<=T<=100
1<=|Length of string|<=100

Example:
Input:
2
aeioup??
bcdaeiou??

Output:
1
0
package Basic;

/**
 *
 * @author Litesh
 */
public class GoodOrBadString {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            
        test--;}
    }
}
