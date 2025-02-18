package org.modules.intermediate;
import java.io.*;

import java.util.List;
import com.opencsv.*;


public class ModifyCsv {
    public static void main(String[] args) throws Exception {
        try {
            //String path="employees.csv";
            CSVReader csvReader = new CSVReader(new FileReader("employees.csv"));
            List<String[]> ls = csvReader.readAll();
            for (String[] temp : ls) {
                if (temp[2].equals("IT")) {
                    int salary = Integer.parseInt(temp[3]);
                    salary += salary * 0.1;
                    temp[3] = String.valueOf(salary);
                    for (String t : temp) {
                        System.out.println(t + " |");
                    }
                    System.out.println();

                }

            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter("employees.csv"));
            csvWriter.writeAll(ls);
            csvWriter.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
