package org.modules.intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchFile {
    public static void main(String[] args) throws Exception {
        try {
            String filepath = "SearchFile.csv";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name to find the Records");
            String str = sc.nextLine();
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            boolean found = false;
            String line;
            while ((line = br.readLine()) != null) {
                String arr[] = line.split(",");
                if (str.equalsIgnoreCase(arr[1])) {
                    System.out.println(arr[2] + " " + arr[3]+" "+arr[0]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Name not found in the List");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
