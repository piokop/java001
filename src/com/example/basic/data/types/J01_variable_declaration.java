package com.example.basic.data.types;

class J01_variable_declaration {

   public static void main( String srgs[]) {
      int number =24;
      number = 98;

      System.out.println("Wartość zmiennej number:" + number);

      int data = -123;
      System.out.println("data:" + data);

      number = data * 2;
      System.out.println("number:" + number);

   }
}
