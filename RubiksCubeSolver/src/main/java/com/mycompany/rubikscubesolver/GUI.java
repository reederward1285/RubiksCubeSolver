/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rubikscubesolver;

/**
 *
 * @author Johan
 */
package gui1;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;

//
class CubePanel extends JPanel {
 
    //schwarze Umrandung
    public CubePanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    //return größe von der Umrandung
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

//großer Rechteck
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);       

        // Draw Text
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.drawString("Add your colors!!!",400,190);
        g.drawRect(249, 199, 511, 511);
    }  
}
//entscheidet welche Seite anfängt
public class GUI {

    public static Color current_color;
    public static int current_side = 0;
    public static boolean show_white_btn = true;
    public static boolean show_orange_btn = false;
    public static boolean show_green_btn = false;
    public static boolean show_red_btn = false;
    public static boolean show_yellow_btn = false;
    public static boolean show_blue_btn = false;

    //keine Ahnung, muss irgendwie Copy Paste sein
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CreateFrame();
        });   
    } 
             
    
//das ist einfach zu verstehen
    public static void CreateFrame(){
       /* Erzeugung eines neuen Frames mit dem 
           Titel "Beispiel JFrame " */       
        JFrame CubeFrame = new JFrame("Rubik's Cube Solver - Daniel, Johannes, Ömer");
        /* Wir setzen die Breite und die Höhe 
           unseres Fensters auf 200 Pixel */        
        CubeFrame.setSize(1000,1000);
        /* Hinzufügen einer einfachen Komponente 
           (hier: JLabel) */
        // meinFrame.add(new JLabel("Add your colors"));
        // Wir lassen unseren Frame anzeigen
        CubeFrame.setVisible(true);  
        // generating panel object
        CubePanel main_panel = new CubePanel();

//30000 Buttons amk, versteht man von selber
        // btn 0
        JButton btn0 = new JButton();
        btn0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn0.setBackground(current_color); 
            }
        });
        btn0.setText("0");        
        btn0.setPreferredSize(new Dimension(170, 170));
        Dimension size = btn0.getPreferredSize();
        btn0.setBounds(250, 200, size.width, size.height);
        btn0.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn0.setVisible(show_white_btn);
        
        // btn 1
        JButton btn1 = new JButton();
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setBackground(current_color); 
            }
        });
        btn1.setText("1");
        btn1.setPreferredSize(new Dimension(170, 170));
        Dimension size1 = btn1.getPreferredSize();
        btn1.setBounds(420, 200, size1.width, size1.height);
        btn1.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn1.setVisible(show_white_btn);

       
        // btn 2
        JButton btn2 = new JButton();
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setBackground(current_color); 
            }
        });
        btn2.setText("2");        
        btn2.setPreferredSize(new Dimension(170, 170));
        Dimension size2 = btn1.getPreferredSize();
        btn2.setBounds(590, 200, size2.width, size2.height);
        btn2.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);       
        btn2.setVisible(show_white_btn);

        
        // btn 3
        JButton btn3 = new JButton();
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn3.setBackground(current_color); 
            }
        });
        btn3.setText("3");        
        btn3.setPreferredSize(new Dimension(170, 170));
        Dimension size3 = btn3.getPreferredSize();
        btn3.setBounds(250, 370, size3.width, size3.height);
        btn3.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn3.setVisible(show_white_btn);

        // btn 4
        JButton btn4 = new JButton();
        btn4.setText("4");
        btn4.setBackground(Color.white);
        btn4.setPreferredSize(new Dimension(170, 170));
        Dimension size4 = btn4.getPreferredSize();
        btn4.setBounds(420, 370, size4.width, size4.height);
        btn4.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn4.setVisible(show_white_btn);

        
        // btn 5
        JButton btn5 = new JButton();
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn5.setBackground(current_color); 
            }
        });
        btn5.setText("5");                
        btn5.setPreferredSize(new Dimension(170, 170));
        Dimension size5 = btn5.getPreferredSize();
        btn5.setBounds(590, 370, size5.width, size5.height);
        btn5.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn5.setVisible(show_white_btn);

        
        // btn 6
        JButton btn6 = new JButton();
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn6.setBackground(current_color); 
            }
        });
        btn6.setText("6");                
        btn6.setPreferredSize(new Dimension(170, 170));
        Dimension size6 = btn6.getPreferredSize();
        btn6.setBounds(250, 540, size6.width, size6.height);
        btn6.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);    
        btn6.setVisible(show_white_btn);

        
        // btn 7
        JButton btn7 = new JButton();
        btn7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn7.setBackground(current_color); 
            }
        });
        btn7.setText("7");                
        btn7.setPreferredSize(new Dimension(170, 170));
        Dimension size7 = btn7.getPreferredSize();
        btn7.setBounds(420, 540, size7.width, size7.height);
        btn7.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn7.setVisible(show_white_btn);

        
        
        // btn 8
        JButton btn8 = new JButton();
        btn8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn8.setBackground(current_color); 
            }
        });
        btn8.setText("8");        
        btn8.setPreferredSize(new Dimension(170, 170));
        Dimension size8 = btn8.getPreferredSize();
        btn8.setBounds(590, 540, size8.width, size8.height);
        btn8.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn8.setVisible(show_white_btn);

        
        // adding buttons to panel
        main_panel.add(btn0);
        main_panel.add(btn1);
        main_panel.add(btn2);
        main_panel.add(btn3);
        main_panel.add(btn4);
        main_panel.add(btn5);
        main_panel.add(btn6);
        main_panel.add(btn7);
        main_panel.add(btn8);
        
        // btn 9
        JButton btn9 = new JButton();
        btn9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn9.setBackground(current_color); 
            }
        });
        btn9.setText("9");
        btn9.setPreferredSize(new Dimension(170, 170));
        Dimension size9 = btn9.getPreferredSize();
        btn9.setBounds(250, 200, size9.width, size9.height);
        btn9.setBorder(BorderFactory.createLineBorder(Color.black));
        btn9.setVisible(show_orange_btn);
        main_panel.setLayout(null);
        
        // btn 10
        JButton btn10 = new JButton();
        btn10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn10.setBackground(current_color); 
            }
        });
        btn10.setText("10");
        btn10.setPreferredSize(new Dimension(170, 170));
        Dimension size10 = btn10.getPreferredSize();
        btn10.setBounds(420, 200, size10.width, size10.height);
        btn10.setBorder(BorderFactory.createLineBorder(Color.black));
        btn10.setVisible(show_orange_btn);
        main_panel.setLayout(null);
       
        // btn 11
        JButton btn11 = new JButton();
        btn11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn11.setBackground(current_color); 
            }
        });
        btn11.setText("11");        
        btn11.setPreferredSize(new Dimension(170, 170));
        Dimension size11 = btn11.getPreferredSize();
        btn11.setBounds(590, 200, size11.width, size11.height);
        btn11.setBorder(BorderFactory.createLineBorder(Color.black));
        btn11.setVisible(show_orange_btn);
        main_panel.setLayout(null);
        
        // btn 12
        JButton btn12 = new JButton();
        btn12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn12.setBackground(current_color); 
            }
        });
        btn12.setText("12");        
        btn12.setPreferredSize(new Dimension(170, 170));
        Dimension size12 = btn12.getPreferredSize();
        btn12.setBounds(250, 370, size12.width, size12.height);
        btn12.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn12.setVisible(show_orange_btn);
        
        
        // btn 13
        JButton btn13 = new JButton();
        btn13.setText("13");  
        btn13.setBackground(Color.orange);
        btn13.setPreferredSize(new Dimension(170, 170));
        Dimension size13 = btn13.getPreferredSize();
        btn13.setBounds(420, 370, size13.width, size13.height);
        btn13.setBorder(BorderFactory.createLineBorder(Color.black));
        btn13.setVisible(show_orange_btn);
        main_panel.setLayout(null);
        
        // btn 14
        JButton btn14 = new JButton();
        btn14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn14.setBackground(current_color); 
            }
        });
        btn14.setText("14");                
        btn14.setPreferredSize(new Dimension(170, 170));
        Dimension size14 = btn14.getPreferredSize();
        btn14.setBounds(590, 370, size14.width, size14.height);
        btn14.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn14.setVisible(show_orange_btn);
        
        // btn 15
        JButton btn15 = new JButton();
        btn15.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn15.setBackground(current_color); 
            }
        });
        btn15.setText("15");                
        btn15.setPreferredSize(new Dimension(170, 170));
        Dimension size15 = btn15.getPreferredSize();
        btn15.setBounds(250, 540, size15.width, size15.height);
        btn15.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);        
        btn15.setVisible(show_orange_btn);
        
        // btn 16
        JButton btn16 = new JButton();
        btn16.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn16.setBackground(current_color); 
            }
        });
        btn16.setText("16");                
        btn16.setPreferredSize(new Dimension(170, 170));
        Dimension size16 = btn16.getPreferredSize();
        btn16.setBounds(420, 540, size16.width, size16.height);
        btn16.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn16.setVisible(show_orange_btn);
        
        
        // btn 17
        JButton btn17 = new JButton();
        btn17.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn17.setBackground(current_color); 
            }
        });
        btn17.setText("17");        
        btn17.setPreferredSize(new Dimension(170, 170));
        Dimension size17 = btn17.getPreferredSize();
        btn17.setBounds(590, 540, size17.width, size17.height);
        btn17.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn17.setVisible(show_orange_btn);

        
        
        // adding buttons to panel
        main_panel.add(btn9);
        main_panel.add(btn10);
        main_panel.add(btn11);
        main_panel.add(btn12);
        main_panel.add(btn13);
        main_panel.add(btn14);
        main_panel.add(btn15);
        main_panel.add(btn16);
        main_panel.add(btn17);
        
        
        // btn 18
        JButton btn18 = new JButton();
        btn18.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn18.setBackground(current_color); 
            }
        });
        btn18.setText("18");        
        btn18.setPreferredSize(new Dimension(170, 170));
        Dimension size18 = btn18.getPreferredSize();
        btn18.setBounds(250, 200, size18.width, size18.height);
        btn18.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn18.setVisible(show_green_btn);
        
        // btn 19
        JButton btn19 = new JButton();
        btn19.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn19.setBackground(current_color); 
            }
        });
        btn19.setText("19");
        btn19.setPreferredSize(new Dimension(170, 170));
        Dimension size19= btn19.getPreferredSize();
        btn19.setBounds(420, 200, size19.width, size19.height);
        btn19.setBorder(BorderFactory.createLineBorder(Color.black));
        main_panel.setLayout(null);
        btn19.setVisible(show_green_btn);   
        
        // btn 20
        JButton btn20 = new JButton();
        btn20.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn20.setBackground(current_color); 
            }
        });
        btn20.setText("20");        
        btn20.setPreferredSize(new Dimension(170, 170));
        Dimension size20 = btn20.getPreferredSize();
        btn20.setBounds(590, 200, size20.width, size20.height);
        btn20.setBorder(BorderFactory.createLineBorder(Color.black));
        btn20.setVisible(show_green_btn);
        main_panel.setLayout(null);
        
        // btn 21
        JButton btn21 = new JButton();
        btn21.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn21.setBackground(current_color); 
            }
        });
        btn21.setText("21");        
        btn21.setPreferredSize(new Dimension(170, 170));
        Dimension size21 = btn21.getPreferredSize();
        btn21.setBounds(250, 370, size21.width, size21.height);
        btn21.setBorder(BorderFactory.createLineBorder(Color.black));
        btn21.setVisible(show_green_btn);
        main_panel.setLayout(null);
        
        // btn 22
        JButton btn22 = new JButton();
        btn22.setText("22");                
        btn22.setPreferredSize(new Dimension(170, 170));
        Dimension size22 = btn4.getPreferredSize();
        btn22.setBackground(Color.green);
        btn22.setBounds(420, 370, size22.width, size22.height);
        btn22.setBorder(BorderFactory.createLineBorder(Color.black));
        btn22.setVisible(show_green_btn);
        main_panel.setLayout(null);
        
        // btn 23
        JButton btn23 = new JButton();
        btn23.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn23.setBackground(current_color); 
            }
        });
        btn23.setText("23");                
        btn23.setPreferredSize(new Dimension(170, 170));
        Dimension size23 = btn23.getPreferredSize();
        btn23.setBounds(590, 370, size23.width, size23.height);
        btn23.setBorder(BorderFactory.createLineBorder(Color.black));   
        btn23.setVisible(show_green_btn);
        main_panel.setLayout(null);
                
        // btn 24
        JButton btn24 = new JButton();
        btn24.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn24.setBackground(current_color); 
            }
        });
        btn24.setText("24");                
        btn24.setPreferredSize(new Dimension(170, 170));
        Dimension size24 = btn24.getPreferredSize();
        btn24.setBounds(250, 540, size24.width, size24.height);
        btn24.setBorder(BorderFactory.createLineBorder(Color.black));
        btn24.setVisible(show_green_btn);
        main_panel.setLayout(null);
    
        // btn 25
        JButton btn25 = new JButton();
        btn25.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn25.setBackground(current_color); 
            }
        });
        btn25.setText("25");                
        btn25.setPreferredSize(new Dimension(170, 170));
        Dimension size25 = btn25.getPreferredSize();
        btn25.setBounds(420, 540, size25.width, size25.height);
        btn25.setBorder(BorderFactory.createLineBorder(Color.black));
        btn25.setVisible(show_green_btn);
        main_panel.setLayout(null);
    
        
       
        // btn 26
        JButton btn26 = new JButton();
        btn26.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn26.setBackground(current_color); 
            }
        });
        btn26.setText("26");        
        btn26.setPreferredSize(new Dimension(170, 170));
        Dimension size26 = btn26.getPreferredSize();
        btn26.setBounds(590, 540, size26.width, size26.height);
        btn26.setVisible(show_green_btn);
        main_panel.setLayout(null);
        
        
        // adding buttons to panel
        main_panel.add(btn18);
        main_panel.add(btn19);
        main_panel.add(btn20);
        main_panel.add(btn21);
        main_panel.add(btn22);
        main_panel.add(btn23);
        main_panel.add(btn24);
        main_panel.add(btn25);
        main_panel.add(btn26);
        
        
        // btn 27
        JButton btn27 = new JButton();
        btn27.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn27.setBackground(current_color); 
            }
        });
        btn27.setText("27");        
        btn27.setPreferredSize(new Dimension(170, 170));
        Dimension size27 = btn27.getPreferredSize();
        btn27.setBounds(250, 200, size27.width, size27.height);
        btn27.setBorder(BorderFactory.createLineBorder(Color.black));
        btn27.setVisible(show_red_btn);
        main_panel.setLayout(null);  
        
        // btn 28
        JButton btn28 = new JButton();
        btn28.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn28.setBackground(current_color); 
            }
        });
        btn28.setText("28");
        btn28.setPreferredSize(new Dimension(170, 170));
        Dimension size28 = btn28.getPreferredSize();
        btn28.setBounds(420, 200, size28.width, size28.height);
        btn28.setBorder(BorderFactory.createLineBorder(Color.black));
        btn28.setVisible(show_red_btn);
        main_panel.setLayout(null);
       
        // btn 29
        JButton btn29 = new JButton();
        btn29.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn29.setBackground(current_color); 
            }
        });
        btn29.setText("29");        
        btn29.setPreferredSize(new Dimension(170, 170));
        Dimension size29 = btn1.getPreferredSize();
        btn29.setBounds(590, 200, size29.width, size29.height);
        btn29.setVisible(show_red_btn);
        main_panel.setLayout(null);
       
        // btn 30
        JButton btn30 = new JButton();
        btn30.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn30.setBackground(current_color); 
            }
        });
        btn30.setText("30");        
        btn30.setPreferredSize(new Dimension(170, 170));
        Dimension size30 = btn30.getPreferredSize();
        btn30.setBounds(250, 370, size30.width, size30.height);
        btn30.setBorder(BorderFactory.createLineBorder(Color.black));
        btn30.setVisible(show_red_btn);
        main_panel.setLayout(null);   
        
        // btn 31
        JButton btn31 = new JButton();
        btn31.setText("31");    
        btn31.setBackground(Color.red);
        btn31.setPreferredSize(new Dimension(170, 170));
        Dimension size31 = btn31.getPreferredSize();
        btn31.setBounds(420, 370, size31.width, size31.height);
        btn31.setBorder(BorderFactory.createLineBorder(Color.black));
        btn31.setVisible(show_red_btn);
        main_panel.setLayout(null);   
        
        // btn 32
        JButton btn32 = new JButton();
        btn32.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn32.setBackground(current_color); 
            }
        });
        btn32.setText("32");                
        btn32.setPreferredSize(new Dimension(170, 170));
        Dimension size32 = btn32.getPreferredSize();
        btn32.setBounds(590, 370, size32.width, size32.height);
        btn32.setBorder(BorderFactory.createLineBorder(Color.black));
        btn32.setVisible(show_red_btn);
        main_panel.setLayout(null);
        
        // btn 33
        JButton btn33 = new JButton();
        btn33.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn33.setBackground(current_color); 
            }
        });
        btn33.setText("33");                
        btn33.setPreferredSize(new Dimension(170, 170));
        Dimension size33 = btn33.getPreferredSize();
        btn33.setBounds(250, 540, size33.width, size33.height);
        btn33.setBorder(BorderFactory.createLineBorder(Color.black));
        btn33.setVisible(show_red_btn);
        main_panel.setLayout(null);    
        
        // btn 34
        JButton btn34 = new JButton();
        btn34.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn34.setBackground(current_color); 
            }
        });
        btn34.setText("34");                
        btn34.setPreferredSize(new Dimension(170, 170));
        Dimension size34 = btn34.getPreferredSize();
        btn34.setBounds(420, 540, size34.width, size34.height);
        btn34.setBorder(BorderFactory.createLineBorder(Color.black));
        btn34.setVisible(show_red_btn);
        main_panel.setLayout(null);
        
        
        // btn 35
        JButton btn35 = new JButton();
        btn35.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn35.setBackground(current_color); 
            }
        });
        btn35.setText("35");        
        btn35.setPreferredSize(new Dimension(170, 170));
        Dimension size35 = btn35.getPreferredSize();
        btn35.setBounds(590, 540, size35.width, size35.height);
        btn35.setBorder(BorderFactory.createLineBorder(Color.black));
        btn35.setVisible(show_red_btn);
        main_panel.setLayout(null);
        
        
        // adding buttons to panel
        main_panel.add(btn27);
        main_panel.add(btn28);
        main_panel.add(btn29);
        main_panel.add(btn30);
        main_panel.add(btn31);
        main_panel.add(btn32);
        main_panel.add(btn33);
        main_panel.add(btn34);
        main_panel.add(btn35);
       
        // btn 36
        JButton btn36 = new JButton();
        btn36.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn36.setBackground(current_color); 
            }
        });
        btn36.setText("36");        
        btn36.setPreferredSize(new Dimension(170, 170));
        Dimension size36 = btn36.getPreferredSize();
        btn36.setBounds(250, 200, size36.width, size36.height);
        btn36.setBorder(BorderFactory.createLineBorder(Color.black));
        btn36.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
        
        // btn 37
        JButton btn37 = new JButton();
        btn37.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn37.setBackground(current_color); 
            }
        });
        btn37.setText("37");
        btn37.setPreferredSize(new Dimension(170, 170));
        Dimension size37 = btn37.getPreferredSize();
        btn37.setBounds(420, 200, size37.width, size37.height);
        btn37.setBorder(BorderFactory.createLineBorder(Color.black));
        btn37.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
       
        // btn 38
        JButton btn38 = new JButton();
        btn38.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn38.setBackground(current_color); 
            }
        });
        btn38.setText("38");        
        btn38.setPreferredSize(new Dimension(170, 170));
        Dimension size38 = btn38.getPreferredSize();
        btn38.setBounds(590, 200, size38.width, size38.height);
        btn38.setBorder(BorderFactory.createLineBorder(Color.black));
        btn38.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
        
        // btn 39
        JButton btn39 = new JButton();
        btn39.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn39.setBackground(current_color); 
            }
        });
        btn39.setText("39");        
        btn39.setPreferredSize(new Dimension(170, 170));
        Dimension size39 = btn39.getPreferredSize();
        btn39.setBounds(250, 370, size39.width, size39.height);
        btn39.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
        
        
        // btn 40
        JButton btn40 = new JButton();
        btn40.setText("40");    
        btn40.setBackground(Color.yellow);
        btn40.setPreferredSize(new Dimension(170, 170));
        Dimension size40 = btn40.getPreferredSize();
        btn40.setBounds(420, 370, size40.width, size40.height);
        btn40.setBorder(BorderFactory.createLineBorder(Color.black));
        btn40.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
        
        // btn 41
        JButton btn41 = new JButton();
        btn41.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn41.setBackground(current_color); 
            }
        });
        btn41.setText("41");                
        btn41.setPreferredSize(new Dimension(170, 170));
        Dimension size41 = btn41.getPreferredSize();
        btn41.setBounds(590, 370, size41.width, size41.height);
        btn41.setBorder(BorderFactory.createLineBorder(Color.black));
        btn41.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
        
        // btn 42
        JButton btn42 = new JButton();
        btn42.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn42.setBackground(current_color); 
            }
        });
        btn42.setText("42");                
        btn42.setPreferredSize(new Dimension(170, 170));
        Dimension size42 = btn42.getPreferredSize();
        btn42.setBounds(250, 540, size42.width, size42.height);
        btn42.setBorder(BorderFactory.createLineBorder(Color.black));
        btn42.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
                
        // btn 43
        JButton btn43 = new JButton();
        btn43.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn43.setBackground(current_color); 
            }
        });
        btn43.setText("43");                
        btn43.setPreferredSize(new Dimension(170, 170));
        Dimension size43 = btn43.getPreferredSize();
        btn43.setBounds(420, 540, size43.width, size43.height);
        btn43.setBorder(BorderFactory.createLineBorder(Color.black));
        btn43.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
        
        
        
        // btn 44
        JButton btn44 = new JButton();
        btn44.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn44.setBackground(current_color); 
            }
        });
        btn44.setText("44");        
        btn44.setPreferredSize(new Dimension(170, 170));
        Dimension size44 = btn44.getPreferredSize();
        btn44.setBounds(590, 540, size44.width, size44.height);
        btn44.setBorder(BorderFactory.createLineBorder(Color.black));
        btn44.setVisible(show_yellow_btn);
        main_panel.setLayout(null);
                
        
        // adding buttons to panel
        main_panel.add(btn36);
        main_panel.add(btn37);
        main_panel.add(btn38);
        main_panel.add(btn39);
        main_panel.add(btn40);
        main_panel.add(btn41);
        main_panel.add(btn42);
        main_panel.add(btn43);
        main_panel.add(btn44);
        
        // btn 45
        JButton btn45 = new JButton();
        btn45.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn45.setBackground(current_color); 
            }
        });
        btn45.setText("45");        
        btn45.setPreferredSize(new Dimension(170, 170));
        Dimension size45 = btn45.getPreferredSize();
        btn45.setBounds(250, 200, size45.width, size45.height);
        btn45.setBorder(BorderFactory.createLineBorder(Color.black));
        btn45.setVisible(show_blue_btn);
        main_panel.setLayout(null);
        
        // btn 46
        JButton btn46 = new JButton();
        btn46.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn46.setBackground(current_color); 
            }
        });
        btn46.setText("46");
        btn46.setPreferredSize(new Dimension(170, 170));
        Dimension size46 = btn46.getPreferredSize();
        btn46.setBounds(420, 200, size46.width, size46.height);
        btn46.setBorder(BorderFactory.createLineBorder(Color.black));
        btn46.setVisible(show_blue_btn);
        main_panel.setLayout(null);
               
        // btn 47
        JButton btn47 = new JButton();
        btn47.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn47.setBackground(current_color); 
            }
        });
        btn47.setText("47");        
        btn47.setPreferredSize(new Dimension(170, 170));
        Dimension size47 = btn47.getPreferredSize();
        btn47.setBounds(590, 200, size47.width, size47.height);
        btn47.setBorder(BorderFactory.createLineBorder(Color.black));
        btn47.setVisible(show_blue_btn);
        main_panel.setLayout(null);
                
        // btn 48
        JButton btn48 = new JButton();
        btn48.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn48.setBackground(current_color); 
            }
        });
        btn48.setText("48");        
        btn48.setPreferredSize(new Dimension(170, 170));
        Dimension size48 = btn48.getPreferredSize();
        btn48.setBounds(250, 370, size48.width, size48.height);
        btn48.setBorder(BorderFactory.createLineBorder(Color.black));
        btn48.setVisible(show_blue_btn);
        main_panel.setLayout(null);
                
        // btn 49
        JButton btn49 = new JButton();
        btn49.setText("49");                
        btn49.setPreferredSize(new Dimension(170, 170));
        btn49.setBackground(Color.blue);
        Dimension size49 = btn49.getPreferredSize();
        btn49.setBounds(420, 370, size49.width, size49.height);
        btn49.setBorder(BorderFactory.createLineBorder(Color.black));
        btn49.setVisible(show_blue_btn);
        main_panel.setLayout(null);
                
        // btn 50
        JButton btn50 = new JButton();
        btn50.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn50.setBackground(current_color); 
            }
        });
        btn50.setText("50");                
        btn50.setPreferredSize(new Dimension(170, 170));
        Dimension size50 = btn50.getPreferredSize();
        btn50.setBounds(590, 370, size50.width, size50.height);
        btn50.setBorder(BorderFactory.createLineBorder(Color.black));
        btn50.setVisible(show_blue_btn);
        main_panel.setLayout(null);
                
        // btn 51
        JButton btn51 = new JButton();
        btn51.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn51.setBackground(current_color); 
            }
        });
        btn51.setText("51");                
        btn51.setPreferredSize(new Dimension(170, 170));
        Dimension size51 = btn51.getPreferredSize();
        btn51.setBounds(250, 540, size51.width, size51.height);
        btn51.setBorder(BorderFactory.createLineBorder(Color.black));
        btn51.setVisible(show_blue_btn);
        main_panel.setLayout(null);
                
        // btn 52
        JButton btn52 = new JButton();
        btn52.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn52.setBackground(current_color); 
            }
        });
        btn52.setText("52");                
        btn52.setPreferredSize(new Dimension(170, 170));
        Dimension size52 = btn52.getPreferredSize();
        btn52.setBounds(420, 540, size52.width, size52.height);
        btn52.setBorder(BorderFactory.createLineBorder(Color.black));
        btn52.setVisible(show_blue_btn);
        main_panel.setLayout(null);
                
        
        // btn 53
        JButton btn53 = new JButton();
        btn53.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                btn53.setBackground(current_color); 
            }
        });
        btn53.setText("53");        
        btn53.setPreferredSize(new Dimension(170, 170));
        Dimension size53 = btn53.getPreferredSize();
        btn53.setBounds(590, 540, size53.width, size53.height);
        btn53.setBorder(BorderFactory.createLineBorder(Color.black));
        btn53.setVisible(show_blue_btn);
        main_panel.setLayout(null);
        
        
        
        // adding buttons to panel
        main_panel.add(btn45);
        main_panel.add(btn46);
        main_panel.add(btn47);
        main_panel.add(btn48);
        main_panel.add(btn49);
        main_panel.add(btn50);
        main_panel.add(btn51);
        main_panel.add(btn52);
        main_panel.add(btn53);
        
        //Farbpalette
        JButton yellow_btn = new JButton();
        yellow_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 current_color = Color.yellow;
                 
            }
        });
        yellow_btn.setPreferredSize(new Dimension(100, 50));
        yellow_btn.setBackground(Color.yellow);
        Dimension size_yel = yellow_btn.getPreferredSize();
        yellow_btn.setBounds(455, 750, size_yel.width, size_yel.height);
        
        
        JButton red_btn = new JButton();
        red_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 current_color = Color.red;
            }
        });
        red_btn.setPreferredSize(new Dimension(100, 50));
        red_btn.setBackground(Color.red);
        Dimension size_red = red_btn.getPreferredSize();
        red_btn.setBounds(630, 750, size_red.width, size_red.height);
        
        
        JButton green_btn = new JButton();
        green_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 current_color = Color.green;
            }
        });
        green_btn.setPreferredSize(new Dimension(100, 50));
        green_btn.setBackground(Color.green);
        Dimension size_green = green_btn.getPreferredSize();
        green_btn.setBounds(280, 750, size_green.width, size_green.height);
        
        
        JButton white_btn = new JButton();
        white_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 current_color = Color.white;
            }
        });
        white_btn.setPreferredSize(new Dimension(100, 50));
        white_btn.setBackground(Color.white);
        Dimension size_white = green_btn.getPreferredSize();
        white_btn.setBounds(280, 830, size_white.width, size_white.height);
        
        
        JButton blue_btn = new JButton();
        blue_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 current_color = Color.blue;
            }
        });
        blue_btn.setPreferredSize(new Dimension(100, 50));
        blue_btn.setBackground(Color.blue);
        Dimension size_blue = blue_btn.getPreferredSize();
        blue_btn.setBounds(630, 830, size_blue.width, size_blue.height);
        
        
        JButton orange_btn = new JButton();
        orange_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 current_color = Color.orange;
            }
        });
        orange_btn.setPreferredSize(new Dimension(100, 50));
        orange_btn.setBackground(Color.orange);
        Dimension size_ora = orange_btn.getPreferredSize();
        orange_btn.setBounds(455, 830, size_ora.width, size_ora.height);
        
        main_panel.add(yellow_btn);
        main_panel.add(red_btn);
        main_panel.add(green_btn);
        main_panel.add(white_btn);
        main_panel.add(blue_btn);
        main_panel.add(orange_btn);
        
        
        //nach vorn
        JButton next_btn = new JButton();
        next_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                current_side++;
                switch (current_side){
                    case 0:
                        show_white_btn = true;
                        break;
                    case 1:
                        btn0.setVisible(false);
                        btn1.setVisible(false);
                        btn2.setVisible(false);
                        btn3.setVisible(false);
                        btn4.setVisible(false);
                        btn5.setVisible(false);                        
                        btn6.setVisible(false);
                        btn7.setVisible(false);
                        btn8.setVisible(false);
                       
                        btn9.setVisible(true);
                        btn10.setVisible(true);
                        btn11.setVisible(true);
                        btn12.setVisible(true);
                        btn13.setVisible(true);
                        btn14.setVisible(true);                        
                        btn15.setVisible(true);
                        btn16.setVisible(true);
                        btn17.setVisible(true);

                        break;
                    case 2:
                        btn9.setVisible(false);
                        btn10.setVisible(false);
                        btn11.setVisible(false);
                        btn12.setVisible(false);
                        btn13.setVisible(false);
                        btn14.setVisible(false);                        
                        btn15.setVisible(false);
                        btn16.setVisible(false);
                        btn17.setVisible(false);
                       
                        btn18.setVisible(true);
                        btn19.setVisible(true);
                        btn20.setVisible(true);
                        btn21.setVisible(true);
                        btn22.setVisible(true);
                        btn23.setVisible(true);                        
                        btn24.setVisible(true);
                        btn25.setVisible(true);
                        btn26.setVisible(true);
                        break;
                    case 3:
                        btn18.setVisible(false);
                        btn19.setVisible(false);
                        btn20.setVisible(false);
                        btn21.setVisible(false);
                        btn22.setVisible(false);
                        btn23.setVisible(false);                        
                        btn24.setVisible(false);
                        btn25.setVisible(false);
                        btn26.setVisible(false);
                       
                        btn27.setVisible(true);
                        btn28.setVisible(true);
                        btn29.setVisible(true);
                        btn30.setVisible(true);
                        btn31.setVisible(true);
                        btn32.setVisible(true);                        
                        btn33.setVisible(true);
                        btn34.setVisible(true);
                        btn35.setVisible(true);
                        break;
                    case 4:
                        btn27.setVisible(false);
                        btn28.setVisible(false);
                        btn29.setVisible(false);
                        btn30.setVisible(false);
                        btn31.setVisible(false);
                        btn32.setVisible(false);                        
                        btn33.setVisible(false);
                        btn34.setVisible(false);
                        btn35.setVisible(false);
                       
                        btn36.setVisible(true);
                        btn37.setVisible(true);
                        btn38.setVisible(true);
                        btn39.setVisible(true);
                        btn40.setVisible(true);
                        btn41.setVisible(true);                        
                        btn42.setVisible(true);
                        btn43.setVisible(true);
                        btn44.setVisible(true);
                        break;
                    case 5:
                        btn36.setVisible(false);
                        btn37.setVisible(false);
                        btn38.setVisible(false);
                        btn39.setVisible(false);
                        btn40.setVisible(false);
                        btn41.setVisible(false);
                        btn42.setVisible(false);                        
                        btn43.setVisible(false);
                        btn44.setVisible(false);
                        
                        btn45.setVisible(true);
                        btn46.setVisible(true);
                        btn47.setVisible(true);
                        btn48.setVisible(true);
                        btn49.setVisible(true);
                        btn50.setVisible(true);
                        btn51.setVisible(true);                        
                        btn52.setVisible(true);
                        btn53.setVisible(true);
                        break;
                    case 6:
                        btn45.setVisible(false);
                        btn46.setVisible(false);
                        btn47.setVisible(false);
                        btn48.setVisible(false);
                        btn49.setVisible(false);
                        btn50.setVisible(false);
                        btn51.setVisible(false);                        
                        btn52.setVisible(false);
                        btn53.setVisible(false);
                       
                        btn0.setVisible(true);
                        btn1.setVisible(true);
                        btn2.setVisible(true);
                        btn3.setVisible(true);
                        btn4.setVisible(true);
                        btn5.setVisible(true);                        
                        btn6.setVisible(true);
                        btn7.setVisible(true);
                        btn8.setVisible(true);
                        current_side = 0;
                }
            }
        });
        next_btn.setText("Next");
        next_btn.setBounds(800, 450, 100, 50);
        
     
        //nach hinten
        JButton previous_btn = new JButton();
        previous_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                current_side--;
                if (current_side < 0){
                    current_side = 6;
                }
                switch (current_side){
                    case 0:
                        show_white_btn = true;
                        break;
                    case 1:
                        btn0.setVisible(false);
                        btn1.setVisible(false);
                        btn2.setVisible(false);
                        btn3.setVisible(false);
                        btn4.setVisible(false);
                        btn5.setVisible(false);                        
                        btn6.setVisible(false);
                        btn7.setVisible(false);
                        btn8.setVisible(false);
                       
                        btn9.setVisible(true);
                        btn10.setVisible(true);
                        btn11.setVisible(true);
                        btn12.setVisible(true);
                        btn13.setVisible(true);
                        btn14.setVisible(true);                        
                        btn15.setVisible(true);
                        btn16.setVisible(true);
                        btn17.setVisible(true);

                        break;
                    case 2:
                        btn9.setVisible(false);
                        btn10.setVisible(false);
                        btn11.setVisible(false);
                        btn12.setVisible(false);
                        btn13.setVisible(false);
                        btn14.setVisible(false);                        
                        btn15.setVisible(false);
                        btn16.setVisible(false);
                        btn17.setVisible(false);
                       
                        btn18.setVisible(true);
                        btn19.setVisible(true);
                        btn20.setVisible(true);
                        btn21.setVisible(true);
                        btn22.setVisible(true);
                        btn23.setVisible(true);                        
                        btn24.setVisible(true);
                        btn25.setVisible(true);
                        btn26.setVisible(true);
                        break;
                    case 3:
                        btn18.setVisible(false);
                        btn19.setVisible(false);
                        btn20.setVisible(false);
                        btn21.setVisible(false);
                        btn22.setVisible(false);
                        btn23.setVisible(false);                        
                        btn24.setVisible(false);
                        btn25.setVisible(false);
                        btn26.setVisible(false);
                       
                        btn27.setVisible(true);
                        btn28.setVisible(true);
                        btn29.setVisible(true);
                        btn30.setVisible(true);
                        btn31.setVisible(true);
                        btn32.setVisible(true);                        
                        btn33.setVisible(true);
                        btn34.setVisible(true);
                        btn35.setVisible(true);
                        break;
                    case 4:
                        btn27.setVisible(false);
                        btn28.setVisible(false);
                        btn29.setVisible(false);
                        btn30.setVisible(false);
                        btn31.setVisible(false);
                        btn32.setVisible(false);                        
                        btn33.setVisible(false);
                        btn34.setVisible(false);
                        btn35.setVisible(false);
                       
                        btn36.setVisible(true);
                        btn37.setVisible(true);
                        btn38.setVisible(true);
                        btn39.setVisible(true);
                        btn40.setVisible(true);
                        btn41.setVisible(true);                        
                        btn42.setVisible(true);
                        btn43.setVisible(true);
                        btn44.setVisible(true);
                        break;
                    case 5:
                        btn36.setVisible(false);
                        btn37.setVisible(false);
                        btn38.setVisible(false);
                        btn39.setVisible(false);
                        btn40.setVisible(false);
                        btn41.setVisible(false);
                        btn42.setVisible(false);                        
                        btn43.setVisible(false);
                        btn44.setVisible(false);
                        
                        btn45.setVisible(true);
                        btn46.setVisible(true);
                        btn47.setVisible(true);
                        btn48.setVisible(true);
                        btn49.setVisible(true);
                        btn50.setVisible(true);
                        btn51.setVisible(true);                        
                        btn52.setVisible(true);
                        btn53.setVisible(true);
                        break;
                    case 6:
                        btn45.setVisible(false);
                        btn46.setVisible(false);
                        btn47.setVisible(false);
                        btn48.setVisible(false);
                        btn49.setVisible(false);
                        btn50.setVisible(false);
                        btn51.setVisible(false);                        
                        btn52.setVisible(false);
                        btn53.setVisible(false);
                       
                        btn0.setVisible(true);
                        btn1.setVisible(true);
                        btn2.setVisible(true);
                        btn3.setVisible(true);
                        btn4.setVisible(true);
                        btn5.setVisible(true);                        
                        btn6.setVisible(true);
                        btn7.setVisible(true);
                        btn8.setVisible(true);
                        current_side = 0;
                    
                        
                }
            }
        });
        previous_btn.setText("Previous");
        previous_btn.setBounds(100, 450, 100, 50);
        
        //Button Löser
        JButton solve_btn = new JButton();
        solve_btn.setText("Solve Cube");
        solve_btn.setBounds(800, 800, 100, 50);
        
        //Buttons (nach hinten und zurück), Button Löser
        main_panel.add(next_btn);
        main_panel.add(previous_btn);
        main_panel.add(solve_btn);

        //Zeichenfläche zum Fenster
        CubeFrame.add(main_panel); 
   } 
}