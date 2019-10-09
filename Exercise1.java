import java.util.*;
public class Exercise1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your phrase to make an acronym: ");
        String str = in.nextLine();
        int i;
        String result = "";
        result += str.charAt(0);
        for (i = 1; i < str.length(); i++){
          if (str.charAt(i - 1) == ' '){
               result += str.charAt(i);
          }
        }
        System.out.print(result.toUpperCase());




    }
}
