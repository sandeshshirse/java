// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class GradeCalculator {
   public GradeCalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Please enter the score: ");
      int var2 = var1.nextInt();
      if (var2 >= 0 && var2 <= 100) {
         if (var2 >= 90) {
            System.out.println("Grade A: Outstanding");
         } else if (var2 >= 75) {
            System.out.println("Grade B: Good");
         } else if (var2 >= 60) {
            System.out.println("Grade C: Keep Going");
         } else if (var2 >= 40) {
            System.out.println("Grade D: Need Improvement");
         } else {
            System.out.println("Failed");
         }
      } else {
         System.out.println("Invalid Score.");
      }

      var1.close();
   }
}
