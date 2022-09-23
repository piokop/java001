package com.example.basic.control_flow_statemens;

class Continue {
   public static void main(String args[]) {

      for (int a = 0; a < 10; a++) {
         if(a ==2 || a == 5 || a == 9) continue;
         System.out.println(a);
      }

   }
}
