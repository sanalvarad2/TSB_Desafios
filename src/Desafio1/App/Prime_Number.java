package Desafio1.App;

public class Prime_Number {
    public static boolean isPrime(Long n){
        boolean retVal = false;
        int i,flag=0;
        Long m;
        m=n/2;
        if(n==0||n==1){
            retVal = false;
        }else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    retVal = false;
                    flag = 1;
                    break;
                    }
                }
            if (flag == 0) {
                retVal = true;
            }
        }
        return retVal;
    }

    public static int PrimerPrimo(Long[] array){
        for(int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                return i;
            }
        }
        return -1;
    }
}
