package com.example.basic.data;

class NumbersConversion {
   public static void main(String args[]) {

      //KOnwersja jawna - zawężająca
      int i = 5;
      double d = 20.0d / (double)i;


      System.out.println("Wyik: " + d);


      //Konwersja niejawna - rozszeżająca
      int a = 4;
      double b = 10.0d * a;

      System.out.println("Wynik: " + b);

      //rzutowanie / casting
      double d2 = 5.0;
      int num = 10 * (int)d2; // Przy rzutowaniu/konwersji float/double na
                              // typ całkowity cześć ułamkowa jest tracona


      System.out.println(num);//50

      byte small = (byte)200; // rzutowanie z short na byte co powoduje utratę informacji
      System.out.println("small: " + small);



   }
}
