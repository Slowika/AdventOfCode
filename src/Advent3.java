import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Iterator;

/**
 * Created by Aga on 21.12.2015.
 */

class Pair<L,R> {
    private L l;
    private R r;
    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }
    public L getL(){ return l; }
    public R getR(){ return r; }
    public void setL(L l){ this.l = l; }
    public void setR(R r){ this.r = r; }
}

public class Advent3 {
    public static void main (String[] args) {
        Scanner inScan = new Scanner(System.in);
        HashSet<Pair<Integer,Integer>> pairList = new HashSet<Pair<Integer,Integer>>();
        int x = 0;
        int y = 0;
        pairList.add(new Pair(x,y));

        while(inScan.hasNext()) {
            String a = inScan.next();
            for (int i = 0; i<a.length(); i++){
                if(a.charAt(i) == 'v'){
                    y-=1;
                }
                else if(a.charAt(i) == '^'){
                    y+=1;
                }
                else if(a.charAt(i) == '>'){
                    x+=1;
                }
                else if(a.charAt(i) == '<'){
                    x-=1;
                }
                //System.out.println(x + " " + y);
                Pair <Integer, Integer> coor = new Pair(x,y);
                boolean isAlready = false;

                for (Pair s : pairList) {
                    if (s.getL().equals(x) && s.getR().equals(y)) isAlready = true;
                }
                if(!isAlready)
                    pairList.add(coor);

            }
            System.out.println(pairList.size());
        }
       // System.out.println(houses);

    }
}
