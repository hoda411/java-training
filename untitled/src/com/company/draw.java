package com.company;

import javax.swing.*;
import java.awt.*;

public class draw extends  JPanel {

public draw(){
  this.setLayout(null);
  this.setBackground(Color.white);
    JTextField t = new JTextField();
    //40 15 240 40
    t.setBounds(40,15,240,40);
    this.add(t);

    JButton b1=new JButton("sin()");
b1.setBounds(20,70,70,30);
b1.setForeground(Color.white);
b1.setBackground(Color.blue);
this.add(b1);

JButton b2 = new JButton("cos()");
b2.setBounds(100,70,70,30);
this.add(b2);

  JButton b3 = new JButton("Tan()");
  b3.setBounds(180,70,70,30);
  this.add(b3);

  JButton b4=new JButton("log10(");
  b4.setBounds(260,70,70,30);
  this.add(b4);


  JButton b5=new JButton("!N");
  b5.setBounds(20,110,70,30);
  this.add(b5);

    JButton b6=new JButton("π");
    b6.setBounds(100,110,70,30);
    this.add(b6);

    JButton b7 = new JButton("%");
    b7.setBounds(180,110,70,30);
    this.add(b7);

    JButton b8=new JButton("^");
    b8.setBounds(260,110,70,30);
    this.add(b8);


    JButton b9=new JButton("1");
    b9.setBounds(20,150,70,30);
    this.add(b9);

    JButton b10=new JButton("2");
    b10.setBounds(100,150,70,30);
    this.add(b10);

    JButton b11 = new JButton("3");
    b11.setBounds(180,150,70,30);
    this.add(b11);

    JButton b12=new JButton("/");
    b12.setBounds(260,150,70,30);
    this.add(b12);



    JButton b13=new JButton("4");
    b13.setBounds(20,190,70,30);
    this.add(b13);

    JButton b14 = new JButton("5");
    b14.setBounds(100,190,70,30);
    this.add(b14);

    JButton b15 = new JButton("6");
    b15.setBounds(180,190,70,30);
    this.add(b15);

    JButton b16=new JButton("+");
    b16.setBounds(260,190,70,30);
    this.add(b16);


    JButton b17=new JButton("7");
    b17.setBounds(20,230,70,30);
    this.add(b17);

    JButton b18=new JButton("8");
    b18.setBounds(100,230,70,30);
    this.add(b18);

    JButton b19 = new JButton("9");
    b19.setBounds(180,230,70,30);
    this.add(b19);

    JButton b20=new JButton("-");
    b20.setBounds(260,230,70,30);
    this.add(b20);



}
}