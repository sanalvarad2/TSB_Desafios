package Desafio2.App;

public class ArraysUtil {

    public static long contarInversiones(Long[] array){
        long cantInversiones = 0;

        for(int i= 0; i< array.length-1; i++){

            for (int j = i+1; j< array.length; j++ ){
                if(array[i]> array[j]){
                    cantInversiones++;
                }

            }

        }
        return cantInversiones;
    }

    public static long contar(Long[] v)     {
          int n = v.length;
          long c = 0;
          for( int i = 0; i < n - 1; i++ ){
              for( int j = i + 1; j < n; j++ ){
                if( v[i] > v[j] ) {
                    c++;
                    long aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
              }
          }

          return c;
    }

    public static boolean isSorted(Long[]v){
        for (int i =0; i< v.length -1; i++){
            for (int j = i+1; j < v.length; j++) {
                if(v[i]>v[j]){
                    return false;
                }
            }


        }

        return true;
    }

    public static long maxSumSubsequence(Long[] v){
        long mss = 0;
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i; j < v.length; j++) {
                long sp= 0;
                for (int k = i; k < j; k++) {
                    sp += v[k];
                }
                if(sp> mss){
                    mss = sp;
                }

            }
        }
        return mss;
    }

    public static long  maxSumSubsequence2(Long[] v){
        long mss = 0;
        for (int i = 0; i < v.length-1; i++) {
            long sp = 0;
            for (int j = i; j < v.length; j++) {
             sp += v[j];
             if (sp> mss){
                 mss = sp;

             }
            }
        }
        return mss;
    }

    public static long maxSumSubsequence3(Long[] v){

        long mss = 0;
        long sp= 0;
        int i = 0;
        for (int j = 0; j < v.length-1; j++) {
            sp = sp + v[j];
            if(sp> mss){
                mss= sp;

            }else{
                if(sp< 0){
                    i = j+1;
                    sp= 0;
                }
            }
        }
        return mss;

    }
}