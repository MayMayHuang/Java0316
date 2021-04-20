package com.ocp.day13;

import java.util.stream.Stream;

public class PetStore {
    public static void main(String[] args) {
        Pet a1 = new Dog();
        Pet a2 = new Cat();
        Pet a3 = new Epet();
        a1.eat();
        a1.move();
        a2.eat();
        a2.move();
        a3.eat();
        a3.move();
        System.out.println(Animal.legs);//類別資料
        System.out.println(Dog.legs);
        System.out.println(Cat.legs);
        System.out.println(Epet.legs);
        Pet[] pets = {a1, a2, a3};
        Stream.of(pets).forEach(p -> p.eat());
    }
    
}
