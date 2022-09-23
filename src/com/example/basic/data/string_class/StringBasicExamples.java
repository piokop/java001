package com.example.basic.data.string_class;

class StringBasicExamples {
   public static void main(String args[]) {

      String s1 = "Hello Worold!";
      String s2 = new String("String apssed to constructor");

      String s3 = "Test".repeat(5);
      System.out.println(s3);

      String s4 = String.join("-","1", "2", "333", "4", "5");
      System.out.println(s4);

      char arr[] = {'O', 'L', 'A'};
      String s5 = new String(arr);
      System.out.println(s5);







   }
}
