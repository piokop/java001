package com.example.basic.control_flow_statemens;

class ForLoop {
   public static void main(String args[]) {

      int arr[] = {1, 5, 10, 15, 20};

      for ( int i = 0; i < arr.length; i+=2 ) {
         int value = arr[i];
         System.out.println("arr: " + value);
      }

      String names[] = {"Ola","Adam","Kasia"};
      for ( int i = names.length - 1; i >= 0; i-- ) { // wypisz od końca
         String str = names[i];
         System.out.println("Imię: " + str);
      }

      for ( int i = 0; i<=2; i++ ) { // wypisz od początku
         String str = names[i];
         System.out.println("Imię: " + str);

      }
   }
}
