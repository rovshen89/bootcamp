package firstpackage;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseStack {
    public static void main(String[] args)
    throws Exception
    {
        //create new Stack class
        Stack<Character> stk = new Stack<Character>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        StringTokenizer token = new StringTokenizer(sentence, " ");
        System.out.println("\n The sentence with the characters of each word backwards: ");

        while (token.hasMoreTokens()){
            String s = token.nextToken();

            int i = 0;
            while(i < s.length()){
                stk.push(s.charAt(i));
                i++;
            }
            while (!stk.isEmpty()){
                System.out.print(stk.pop());
            }
            System.out.print(" ");

        }


    }

}
