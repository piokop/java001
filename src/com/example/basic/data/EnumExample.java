package com.example.basic.data;

class EnumExample {

   enum SoundVolume {LOW, MEDIUM, HIGH, VERY_HIGH}; //SoundVolume własny typ
   enum CarVariant {SEDAN, COMBI, SUPER_CAR};      //CarVariant to samo



   public static void main(String args[]) {
      SoundVolume phoneSound = SoundVolume.LOW;
      System.out.println(phoneSound);
      

   }
}
