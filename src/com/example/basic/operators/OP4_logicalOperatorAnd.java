package com.example.basic.operators;

class OP4_logicalOperatorAnd {
   public static void main(String args[]) {

      //koniunkcja - operator logiczny, inaczej and

      System.out.println(5 < 10 && 20 >= 15); // true && true wynik true
      System.out.println(5 > 10 && 20 > 15); // false && true wynik false
      System.out.println(4 > 2 && 10 == 11); // true && false wynik false
      System.out.println(4 ==2 && 12 > 20);// false && false wynik false
      }
}
