package com.example.basic.data;

import java.math.*;

class BigIntegerBigDecymal {
   public static void main(String args[]) {

      BigInteger bigInt = new BigInteger("1229649826489812816821969");
      bigInt = bigInt.add(new BigInteger("77758855858"));

      System.out.println("Wynik: " + bigInt);


      BigDecimal decimal = new BigDecimal("89898698459804985869485");
      decimal = decimal.pow(3);  //przypisanie do decimal
      decimal = decimal.subtract(new BigDecimal("5363656536535636"));



      System.out.println("Wynik: " + decimal.toString());




   }
}
