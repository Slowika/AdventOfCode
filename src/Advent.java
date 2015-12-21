/**
 * Created by Aga on 15.12.2015.
 */
import java.util.*;

public class Advent {

    public static void main (String[] args){
        Scanner inScan = new Scanner(System.in);
        String input = inScan.next();
        int res = 0;
        int position = 0;

        for (int i = 0; i<input.length(); i++){
            if (input.substring(i, i+1).equals("(")) res++;
            else if (input.substring(i, i+1).equals(")")) {
                res--;
                if(res < 0)
                    System.out.println(i+1);
            }
        }
        System.out.println(res);
    }
}
