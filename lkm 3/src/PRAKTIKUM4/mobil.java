package PRAKTIKUM4;

public class mobil extends kendaraan{
  //overriding method
  void bergerak(){
    System.out.println("Mobil Bergerak");
  }
  //main class
  public static void main(String[] args) {
    //membuat objek mobil
    mobil car = new mobil();
    //objek car menggunakan metode bergerak()
    car.bergerak();
  } 
}
