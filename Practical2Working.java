package ClassPracticals2;

import java.io.*;
import java.util.Scanner;

public class Practical2Working {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print ("Enter stock file name: ");
        String StockFile = keyboard.nextLine();
        try {

            FileReader fr = new FileReader(StockFile);
            BufferedReader br = new BufferedReader(fr);

            System.out.print("Enter quantity file name: ");
            String QuantityFile = keyboard.nextLine();
            FileReader fr2 = new FileReader(QuantityFile);
            BufferedReader br2 = new BufferedReader(fr2);

            System.out.print("Enter price file name: ");
            String PriceFile = keyboard.nextLine();
            FileReader fr3 = new FileReader(PriceFile);
            BufferedReader br3 = new BufferedReader(fr3);

            FileWriter fw = new FileWriter("stockvalue.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);


            // process each record in the stock file, and write new record to value file
            String stockNum = br.readLine();
            while (stockNum != null) {
                // read input record
                String QtyNo = br2.readLine();
                String Price = br3.readLine();
                int qty = Integer.parseInt(QtyNo);
                int cost = Integer.parseInt(Price);
                // write output record to output file

                pw.println(qty * cost);
            }

            // close both files
            pw.close();
            bw.close();
            fw.close();
            br3.close();
            fr3.close();
            br2.close();
            fr2.close();
            br.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    } // end of main

}
