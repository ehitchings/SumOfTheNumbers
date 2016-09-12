package hitchings.evan.SumOfTheNumbers;

/**
 * Created by evanhitchings on 9/9/16.
 */
public class NumberSum {

    public int sumNumber(int endNumber){
        int toReturn = 0;
        for (int i = 1; i <= endNumber; i++){
            toReturn += i;

        }
        return toReturn;

    }
}
