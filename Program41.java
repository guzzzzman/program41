// Jose Guzman
// September 17, 2023
// Description: Using InputStreamReader, BufferedReader,
//    and readLine() to allow input from the user
// File Name: Program41.java
// To Compile in terminal type: javac Program41.java
// To Run the program in terminal type: java Program41

// needed for InputStreamReader & BufferedReader
import java.io.*; 

public class Program41
{
  public static void main(String[] args)
  throws IOException // need this for readLine()
  {
    String s1,s2,s3;
    double num1, num2, product, num3, sum;

    // set up the basic input stream
    // needed for information to be
    // entered into program using the keyboard
    InputStreamReader isr = new InputStreamReader(System.in);
    // needed for readLine()
    BufferedReader br = new BufferedReader(isr); 

    // tell the user what to enter
    System.out.print("Enter a number: ");
    //                ^^^^^^^^^^^^^^^ prompt
    // prompt - message that tells the user what to enter

    // When it reaches br.readLine(), 
    //  the program will pause.
    // The user will type a number, press Enter,
    //  and then the program resumes.

    // INPUT: user enters a number which is read as a string
    s1 = br.readLine(); 
    // the string is converted into double
    num1 = Double.parseDouble(s1); 

    System.out.print("Enter another number: ");
    s2 = br.readLine(); // INPUT
    num2 = Double.parseDouble(s2);

    System.out.print("Enter the third number: ");
    s3 = br.readLine();
    num3 = Double.parseDouble(s3);

    product = num1 * num2; //multiply the two numbers

    System.out.println(num1 + " times " + num2 + 
                                   " = " + product);

    sum = num1 + num2 + num3; //adding the three numbers

    System.out.println(num1 + " plus " + num2 + " plus " + num3 + " = " + sum);
  }
}
/* How it ran:
javac Program41.java
java Program41
Enter a number: 6
Enter another number: 2
6.0 times 2.0 = 12.0
*/