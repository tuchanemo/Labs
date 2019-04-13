/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod12;

/**
 *
 * @author Alex
 */
public class ThreadTester {

    public static void main(String[] args) {
        Runnable prog = new PrintMe();
        Thread t1 = new Thread(prog);
        Thread t2 = new Thread(prog);
        Thread t3 = new Thread(prog);
        
        t1.setName("Thread 1 - John");
        t2.setName("Thread 2 - Jane");
        t3.setName("Thread 3 - Jake");
        
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
