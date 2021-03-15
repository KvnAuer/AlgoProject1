import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Algorithm {

   public static void main(String args[]) {
   
      
      
      try {
      
         // Create a file to write too. 
         File myFile = new File("Project1.txt");
         FileWriter fw = new FileWriter(myFile);
      
         int n = 100;
         while (n <= 20000) {
            long startTime = System.nanoTime();
            computeSumPowers(0.5, n);
            long endTime = System.nanoTime();
            
            //Now we compute to get the run time in milliseconds
            double tn = (endTime - startTime) / 1000000;
            double tn_n = tn / n;
            double tn_n2 = tn / (Math.pow(n, 2));
            double tn_3 = tn / (Math.pow(n, 3));
            System.out.println(n);
            System.out.println(tn);
            
            // Write data to file. 
            fw.write(n + "," + tn + "," + tn_n + "," + tn_n2 + "," + tn_3);
            fw.flush();
            
            // Help user to see when the program is finished. 
            if (n == 1000000) {
               System.out.println("Done!!!");
            }
            n = n + 100;
         }
         fw.close();
      } catch (IOException e) {
         System.out.println(e);
      }
      // for (int n = 100; n <= 1000000; n =+ 100) {
      
      
   
   }
   
   public static double computeSumPowers(double x, int n) {
      double sum = 0;
      for (int i = 1; i <= n; i++) {
         double prod = 1;
         for (int j = 1; j <= i; j++) {
            prod = prod * x;
         }
         sum =+ prod;
      }
      return sum;
   }
   

}