package hitchings.evan.SumOfTheNumbers; /**
 * Created by evanhitchings on 9/9/16.
 */

import java.util.Scanner;
public class SumOfTheNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberSum numberSum = new NumberSum();
        System.out.println("Input a number:");
        System.out.println("Total is" + numberSum.sumNumber(reader.nextInt()));



    }
}
