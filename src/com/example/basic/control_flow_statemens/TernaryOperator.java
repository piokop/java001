package com.example.basic.control_flow_statemens;

class TernaryOperator {                      // operator trójargumentowy
   public static void main(String args[]) {

      int a = 1;
      int b = (a > 3) ? 100 : 9;
      System.out.println("b: " + b);



      // to samo co if else
      if (a > 3) {
         b = 100;
      }else {
         b = 9;
      }
      System.out.println("b: " + b );


   }
}
