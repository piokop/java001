package com.example.basic.data.types;

class J11_2dArray {
   public static void main(String args[]) {
      String strArr[][] = {

              //                 Kolumny 1, 2, 3
              //                 indeks  0, 1, 2


              /*Wiersz 1, indeks 0*/ {"1", "2", "3"},
              /*Wiersz 1, indeks 0*/ {"4", "5", "6"}
      };

      System.out.println(strArr[1][0]);// "4"
      System.out.println(strArr[0][2]);// "3"

      int numArr[][] = new int[3][4];
      numArr[1][2] = 100;

      int numRows = 10;
      int numCols = 15;
      int arr[][] = new int[numRows][numCols];




   }
}
