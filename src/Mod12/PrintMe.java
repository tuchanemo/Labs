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
public class PrintMe implements Runnable {

    @Override
    public void run() {
        for (int x = 0; x < 10; x++ ) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (Exception ex) {
            }
        }
    }

}
