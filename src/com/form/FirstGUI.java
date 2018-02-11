package com.form;

import javax.swing.*;
import java.awt.*;

public class FirstGUI extends JFrame {
    private JButton referButton=new JButton("Reference");
    private JTextArea inputTextArea =new JTextArea();
    private JScrollPane inputArea = new JScrollPane(inputTextArea);
    private JLabel inputLabel=new JLabel("input:");
    private JLabel outputLabel=new JLabel("output:");
    private JTextArea outputTextArea= new JTextArea();
    private JScrollPane outputArea = new JScrollPane(outputTextArea);
    public FirstGUI(){
        super("Comp0l");
        this.setBounds(200,200,500,600);
        inputArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        inputArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        inputArea.setPreferredSize(new Dimension(400,300));
        outputArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        outputArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        outputArea.setPreferredSize(new Dimension(400,180));
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
