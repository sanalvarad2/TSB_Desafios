import Desafio1.App.Array_Util;
import Util.Lector;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Lector lc = new Lector();
        List<Long> list = lc.getListFromFile();
        //System.out.println(list.get(5000000));
        Long[] ar = lc.getArrayFromList();
        //System.out.println(ar.length);
        //System.out.println(ar[5000000]);
        /*int val = Prime_Number.PrimerPrimo(ar);
        System.out.println(val);
        System.out.println(ar[val]);
        */
        //System.out.println("Mediana: " + Array_Util.median(ar));
        //System.out.println("Promedio: " + Array_Util.average(ar));
        //Arrays.sort(ar);
        Long[] mat = {(long)2755145, (long)12873556, (long)9121687, (long)1013111, (long)882943, (long)923810, (long)716253, (long)987235};
        System.out.println(Array_Util.getMatch(ar, mat));




    }
}
