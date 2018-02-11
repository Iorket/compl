package com.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FirstGUI extends JFrame {
    private JButton referButton=new JButton("Reference");
    private JTextArea inputTextArea =new JTextArea();
    private JLabel inputLabel=new JLabel("input:");
    private JLabel outputLabel=new JLabel("output:");
    private JTextArea outputTextArea= new JTextArea();
    public FirstGUI(){
        super("Comp0l");
        this.setBounds(200,200,500,600);
        inputTextArea.setLineWrap(true);
        inputTextArea.setWrapStyleWord(true);
        outputTextArea.setLineWrap(true);
        outputTextArea.setWrapStyleWord(true);
        inputTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String inpText=inputTextArea.getText();
                if (e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
                    outputTextArea.setText(inpText + e.getKeyChar());
                }
                else if(inpText.length()>0) outputTextArea.setText(inpText.substring(0,inpText.length()-1));
                }
        });
        JScrollPane inputArea = new JScrollPane(inputTextArea);
        JScrollPane outputArea = new JScrollPane(outputTextArea);
        inputArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        inputArea.setPreferredSize(new Dimension(300,300));
        outputArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        outputArea.setPreferredSize(new Dimension(300,180));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container =this.getContentPane();
        LayoutManager layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        container.add(inputLabel);
        container.add(inputArea);
        container.add(outputLabel);
        container.add(outputArea);
    }



}
