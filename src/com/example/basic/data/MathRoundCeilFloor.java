package com.example.basic.data;

class MathRoundCeilFloor {
   public static void main(String args[]) {

      //Zaokrąglenie do najbliższej liczby całkowitej
      System.out.println(Math.round(5.51));// 6
      System.out.println(Math.round(5.49));// 5

      //rzutowanie, utrata części ulamkowej
      System.out.println((int) 5.45d);

      //Math.ceil() - największa możliwa całkowita liczba
      System.out.println(Math.ceil(6.11));// 7.0
      System.out.println(Math.ceil(6.8)); // 7.0


      //Math.floor - najmniejsza możliwa liczba całkowita
      System.out.println(Math.floor(6.11)); //6.0
      System.out.println(Math.floor(6.8));  //6.0


   }
}
