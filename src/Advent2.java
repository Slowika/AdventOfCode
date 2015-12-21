import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Aga on 15.12.2015.
 */
public class Advent2 {
    public static void main (String[] args) {
        Scanner inScan = new Scanner(System.in);
        int l, w, h, min, min1, maxSide1, maxSide = 0;
        int total = 0;
        int totalRibbon = 0;

        while(inScan.hasNext()){
            String a = inScan.next();
            String[] arr = a.split("x");
            l = Integer.parseInt(arr[0]);
            w = Integer.parseInt(arr[1]);
            h = Integer.parseInt(arr[2]);

           // min1 = Integer.min(l*w, w*h);
            //min = Integer.min(min1, h*l);

            maxSide1 = Integer.max(l, w);
            maxSide = Integer.max(maxSide1, h);

           // total += 2*l*w + 2*w*h + 2*h*l + min;



            totalRibbon += 2*(l + w + h - maxSide);

            totalRibbon += (l*w*h);

            System.out.println(totalRibbon);

        }
    }
}
