/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KomangRyan
 */
class Person {
     String name;
  String address;
  final String country = "Indonesia";
  
  Person(String paramName, String paramAddress){
      name = paramName;
      address = paramAddress;
  }
  
    void sayHello(String paramName){
    System.out.println("Hello " + paramName + ", My Name is " + name);
}
}