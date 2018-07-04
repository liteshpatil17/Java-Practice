/*ind the area of a triangle with all its three sides given as a,b and c. 

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains
three space-separated integers a,b and c.

Output:
Output the area of the triangle answer with a precision of 6 decimal places.The area is to be printed as 0.000000 if the triangle does not exist.

Constraints:
1<=t<=200
1<=a,b,c <= 100

Example:
Input:
2
2 2 3
3 4 5

Output:
1.984313
6.000000
 */
package GeeksForGeeksSchool;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Litesh
 */
public class AreaOfTriangle {
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int test=sc.nextInt();
            for(int i=0;i<test;i++)
            {
                
                double a=sc.nextInt();              
                double b=sc.nextInt();
                double c=sc.nextInt();
                if((a+b)>c && (b+c)>a && (a+c)>b)
                {
                double half_Peri=((a+b+c)/2);
                double area=(half_Peri*(half_Peri-a)*(half_Peri-b)*(half_Peri-c));
                DecimalFormat df=new DecimalFormat("#.000000");
                String str=new BigDecimal(Math.sqrt(area)).setScale(6,BigDecimal.ROUND_HALF_EVEN).toString();
                
                System.out.println(str);
                }
                else
                    System.out.println("0.000000");

            }
        }
}
