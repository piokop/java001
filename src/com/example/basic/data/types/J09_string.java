package com.example.basic.data.types;

import java.security.SecureRandom;

class J09_string {
   public static void main(String args[]) {
      String s1 = "String #1";
      String s2 = new String(" Str #2");

      String s3 = s1 + s2;
      System.out.println(s3.length());
      System.out.println(s3.toUpperCase());

      String s4 = "wiersz #1 \n \t wiersz #2 \n \\ \" \u263A";
      System.out.println(s4);

   }

}
