import Desafio2.App.ArraysUtil;
import Util.Lector;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Lector lc = new Lector("src/Desafio2/lote/mss01.txt");
        lc.ReadFile();
        Long[] array = lc.getArrayFromList();

        //System.out.println(ArraysUtil.contarInversiones(array));

        //System.out.println((ArraysUtil.contar(array)));
        //System.out.println(ArraysUtil.isSorted(array));

        System.out.println(ArraysUtil.maxSumSubsequence3(array));



    }
}
