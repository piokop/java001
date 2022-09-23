package com.example.basic.control_flow_statemens;

class Break {
   public static void main(String args[]) {

      for(int i = 0; i < 20; i++) {
         System.out.println(i);

         if(i > 3) break;
      }

      System.out.println("Dalsza cześć progarmu");

      int a = 10;
      while( a > 0) {
         System.out.println(a);
         a--;


         if(a == 2) break;
      }

      System.out.println("Petla while zakończona");
   }

}
