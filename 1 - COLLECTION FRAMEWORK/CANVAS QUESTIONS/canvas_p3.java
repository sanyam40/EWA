/* p3.Use a stack to reverse the words of a sentence. Keep reading words until you have a word that ends in a period, adding them onto a stack. When you have a word with a period, pop the words off and print them. Stop when there are no more words in the input.

Definition of Done
i.    You should convert the input as follows:
    Mary had a little lamb. Its fleece was white as snow.
                        into
    Lamb little a had mary. Snow as white was fleece its.
ii.    Display the desired resultant stack */


import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class canvas_p3{ 
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //System.out.printf("1. Enter string to reverse : ");
        String inputString ="Mary had a little lamb. Its fleece was white as snow.";
        sc.close();

        if (inputString == null || inputString.length() == 0)
        {
            System.out.println("Enter the valid string");
            return;
        }
        String reverse = reverseStringWordWise_Stack(inputString);
        System.out.printf("2. Reverse string using stack is : %s", reverse);
    }
    
    public static String reverseStringWordWise_Stack(String inputString)
    {
        String[] arrString = inputString.trim().split(Pattern.quote(" "));
        Stack<String> stack = new Stack<>();
        for(String input : arrString)
        {
            stack.push(input);
        }
        StringBuilder builder = new StringBuilder();
        while( !stack.isEmpty())
        {
            builder.append(stack.pop()).append(" ");
        }
        return builder.toString();
    }
}
