/*
 Shubham wrote a sequence of words in following format,having the following properties:
-It is a concatenation of one or more words consisting of English letters.
-All letters in the first word are lowercase.
-For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
-Given , print the number of words in a new line.
Examples-
String saveChangesInTheEditor contains five words- save, Changes, In, The, Editor .
Thus, we print 5 on a new line.
and iAmShubam contains three words- i, Am, Shubham . 
Thus, we print 3 on a new line.
Input Format-
A single line containing string s.
Output Format-
Print the number of words in string .
Constraints-
1<=T<=150
1<=|s|<=100000
 
Example:
Input-
2
saveChangesInTheEditor
iAmShubam
Sample Output-
5
3
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class TheCountinGame {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
        String str=sc.next();
        
        StringBuffer sb=new StringBuffer(str);
        String []strSplit=str.split("(?=[A-Z])");
        System.out.println(strSplit.length);
        
        test--;}
    }
}
