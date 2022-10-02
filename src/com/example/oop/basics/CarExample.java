package com.example.oop.basics;

class Car {
   String manufacturer;
   String name;
   int year;
   String color;
   float topSpeed;
   float masa;

   public void printInfo() {  // metoda
      
      System.out.println(this.manufacturer + " "
                     + this.name + "\n"
                     + this.year + "\n"
                     + this.color + "\n"
                     + this.masa);
   }

}
 public class CarExample {
   public static void main(String args[]) {

      Car ford = new Car();
      ford.manufacturer = "Ford";
      ford.name = "Mustang";
      ford.color = "blue";
      ford.year = 1967;
      ford.topSpeed = 200.0f;
      ford.masa = 2.5f;
      ford.printInfo();

      Car chevrolet = new Car(); // nowa instancja, nowy obiekt
      chevrolet.manufacturer = "Chevrolet";
      chevrolet.name = "Camaro";
      chevrolet.color = "red";
      chevrolet.year = 2020;
      chevrolet.topSpeed = 300.0f;
      chevrolet.masa = 1.7f;
      chevrolet.printInfo();

      Car fiat = new Car();
      fiat.manufacturer = "Fiat";
      fiat.name = "'Maluch' 126p";
      fiat.color = "Wiśniowy";
      fiat.year = 1990;
      fiat.topSpeed = 180.0f;
      fiat.masa = 700.f;
      fiat.printInfo();





   }
}
