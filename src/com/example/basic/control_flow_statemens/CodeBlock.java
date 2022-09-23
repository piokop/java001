package com.example.basic.control_flow_statemens;

class CodeBlock {
   public static void main(String args[]) {

      int b = 12;
      int num = 100;

      {
//         long num = 1000; // zbierzność nazw zmiennych!
         int a = 5;
         System.out.println("a:" + a);
         System.out.println("b:" + b);
//         System.out.println("c:" + c); // powoduje błąd brak zmiennej o takiej nazwie
      }
      ;
      int c = 7;

      int a = 99;// nie ma konfliktyu ze zmienną a w bloku

      {
         int value = 9;
         {
            int test = 8;
            {
               System.out.println("terst: " + test);
               System.out.println("value: " + value);
               System.out.println("a: " + a); // 99


            }
         }



      }





   }
}
