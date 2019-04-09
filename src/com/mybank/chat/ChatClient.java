/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.chat;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author alex
 */
public class ChatClient {

    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButton;

    public ChatClient() {
        this.output = new JTextArea(10, 50);
        this.input = new JTextField(50);
        this.sendButton = new JButton("Send");
        this.quitButton = new JButton("Quit");
    }

    public void launchFrame() {
        JFrame frame = new JFrame("Bank Chat Room");
        frame.setLayout(new BorderLayout());

        frame.add(output, BorderLayout.CENTER);
        frame.add(input, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,1));
        buttonPanel.add(sendButton);
        buttonPanel.add(quitButton);
        
        frame.add(buttonPanel,BorderLayout.EAST);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ChatClient myChat=new ChatClient();
        myChat.launchFrame();
    }

}
