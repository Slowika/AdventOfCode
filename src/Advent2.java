import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Aga on 15.12.2015.
 */
public class Advent2 {
    public static void main (String[] args) {
        Scanner inScan = new Scanner(System.in);
        int l, w, h, min, min1 = 0;
        int total = 0;
        while(inScan.hasNext()){
            String a = inScan.next();
            String[] arr = a.split("x");
            l = Integer.parseInt(arr[0]);
            w = Integer.parseInt(arr[1]);
            h = Integer.parseInt(arr[2]);

            min1 = Integer.min(l*w, w*h);
            min = Integer.min(min1, h*l);

            total += 2*l*w + 2*w*h + 2*h*l + min;
            System.out.println(total);

        }
    }
}
