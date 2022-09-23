package com.example.basic.data.string_class;

class Functions_isEmpty_isBlank {
   public static void main(String args[]) {

      String emptyStr = "";
      String blankStr = "     \n  ";

      if(emptyStr.isEmpty()) {
         //true
         System.out.println("emptyStr jest pusty - isEmpty()");
      }

      if(blankStr.isEmpty()) { //false
         //true
         System.out.println("blankStr jest pusty isEmpty()");
      } else  {
         System.out.println("blankStr nie jest pusty - isEmpty ");
      }

      if(emptyStr.isBlank()) {
         //true
         System.out.println("emptyStr 0 znaków lub same białe znaki");
      }

      if(blankStr.isBlank()) {
         //true
         System.out.println("blankStr 0 znaków lub same białe znaki");
      }

   }
}
