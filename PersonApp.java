/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KomangRyan
 */
public class PersonApp {
    public static void main(String[] args) {

    var person1 = new Person("eko","aldi");
    person1.name = "Eko";
    person1.address = "Subang";
    

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Budi");

    Person person2 = new Person("joko","meki");
    Person person3;
    person3 = new Person("titi","radi");
    
    person2.sayHello("anj");
    

  }
}
