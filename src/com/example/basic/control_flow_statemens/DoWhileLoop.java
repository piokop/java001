package com.example.basic.control_flow_statemens;

class DoWhileLoop {
   public static void main(String args[]) {

      int a = 0;

      do {
         System.out.println( a * 2);
         a++;
      } while ( a < 10 );

      do {
         System.out.println(a);
         a--;
      } while ( a > 0);

   }
}
