import java.util.*;
public class Exercise2 {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your number here: ");
        int number = in.nextInt();
            if (number % 3 == 0) {
                System.out.print("Pling");
            }
            if (number % 5 == 0) {
                    System.out.print("Plang");
                }
            if (number % 7 == 0){
                    System.out.print("Plong");
                }
            if (number % 3 !=0 && number % 5 != 0 && number % 7 != 0){
                System.out.print(number);
                }
        }

        }


