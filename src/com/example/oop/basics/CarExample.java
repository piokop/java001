package com.example.oop.basics;
class Car {
   String manufacturer;
   String name;
   int year;
   String color;
   float topSpeed;


   public Car() {
      this.manufacturer = "unknown";
//      this.name = "unknown";
//      this.color = "unknown";
   }
   public Car(String manufacturer, String name, int year, String color, float topSpeed) { // *konstruktor
      this.manufacturer = manufacturer;
      this.name = name;
      this.color = color;
      this.year = year;
      this.topSpeed = topSpeed;
   }

   public void printInfo() {  // *metoda
      System.out.println(this.manufacturer + " "
              + this.name + "\n"
              + this.year + "\n"
              + this.color +"\n"
              + this.topSpeed);
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
      ford.printInfo();

      Car chevrolet = new Car(); // nowa instancja, nowy obiekt
      chevrolet.manufacturer = "Chevrolet";
      chevrolet.name = "Camaro";
      chevrolet.color = "red";
      chevrolet.year = 2020;
      chevrolet.topSpeed = 300.0f;
      chevrolet.printInfo();

      Car fiat = new Car();
      fiat.manufacturer = "Fiat";
      fiat.name = "'Maluch' 126p";
      fiat.color = "Wiśniowy";
      fiat.year = 1990;
      fiat.topSpeed = 180.0f;
      fiat.printInfo();


      Car dodge = new Car("Dodge", "Viper"
              , 1997, "blue", 270.0f);
      dodge.printInfo();







   }
}
