package com.example.basic.control_flow_statemens;

class IfStatement {
   public static void main(String args[]) {

      int a = 0;
      if(a > 5) {
         System.out.println("a jest większe od 5");
      } else if (a == 2) {
         System.out.println("a jest równe 2");
      } else if (a == 3) {
         System.out.println("a jest równe 3");
      } else if (a == 4) {
         System.out.println("a jest równe 4");
      }
      else {
         System.out.println("Wartość a jets równa:" + a);
      }


      if (9 < 20)
         System.out.println("9 < 20");
      else
         System.out.println("nie jest spełniony warunek");



   }
}
