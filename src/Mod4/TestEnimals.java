/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod4;

import animals.Cat;

/**
 *
 * @author alex
 */
public class TestEnimals {

    static Cat myCat = new Cat("Tiger");
    static Cat otherCat = new Cat();

    public static void main(String[] args) {
        myCat.setName("Toyger");
        System.out.println(myCat.getName()+"\n");
        myCat.walk();
        myCat.play();
        myCat.eat();
    }
}
