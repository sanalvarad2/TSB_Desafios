package Desafio1.App;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lector {

    private String path = "src/Desafio1.lote01/Desafio1.lote01.txt";
    private Scanner sc;
    private List<Long> list;
    private Long[] array;
    public Lector() {
        try {
            File text = new File(path);
            sc = new Scanner(text);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public List<Long> getListFromFile(){
        if(list == null) {

            list = new ArrayList<Long>();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(Long.parseLong(line));
            }
        }
        return list;
    }

    public Long[] getArrayFromList(){
        if(array == null) {
            array = new Long[list.size()];
            array = list.toArray(array);
        }
        return array;
    }


}
