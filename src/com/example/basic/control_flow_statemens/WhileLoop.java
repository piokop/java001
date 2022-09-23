package com.example.basic.control_flow_statemens;

class WhileLoop {
   public static void main(String args[]) {


      int i = 5;

      while (i > 0) {
         System.out.println(i);
         i--;
      }

      i = 0;

      while ( i < 6 ) {
         System.out.println("i: " + i);
         i++;
      }
   }
}
