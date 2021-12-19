/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordGame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;


import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author asus
 */
public class Functions_and_GUI {
    
//these arraylists will init in functions so that we can init them after each losing or wining easily    
ArrayList<String> list_for_hard_words = new ArrayList<String>();    
ArrayList<String> list_for_hard_words_typed = new ArrayList<String>();    
ArrayList<String> list_for_normal_words = new ArrayList<String>();    
ArrayList<String> list_for_normal_words_typed = new ArrayList<String>();    

    
//buttons for main page    
 JButton begin , exit , normal , hard , back_to_main_menu
//buttons for normal mode         
 ,try_again_normal_mode_page1,next_stage_normal_mode,
 try_again_normal_mode_page2,back_from_normal_mode_page2_to_main_page,try_again
//buttons for hard mode         
 ,try_again_hard_mode_page1,next_stage_hard_mode,
 try_again_hard_mode_page2,back_from_hard_mode_page2_to_main_page,try_again_hard_mode;
 
        //dokme haye normal
 JButton I,I2,Z,T2,T,Z2
        //dokme haye sakht 
         ,A,E2,E,A2,R,R2,G,G2;
 JFrame menu_asli_frame = new JFrame("words game");
 JFrame menu_2_frame = new JFrame("menu"); 
 
 
 //frame va label haye normal
 JFrame normal_stage_frame = new JFrame("normal:stage1");
 JFrame normal_stage_wining_frame = new JFrame("win"); 
 JFrame normal_stage_losing_frame = new JFrame("lose");
 JFrame normal_stage2_frame = new JFrame("normal:stage2"); 
  JFrame normal_stage2_wining_frame = new JFrame("win"); 
 JFrame normal_stage2_losing_frame = new JFrame("lose");
 JFrame try_again_normal_mode_frame = new JFrame("!");
 
 
JLabel input_text_normal_mode_label = new JLabel("");
String input_text_normal_mode = "";
JLabel msg_normal_mode_label = new JLabel("");
JLabel msg1_normal_mode_label = new JLabel("");

JLabel input_text2_normal_mode_label = new JLabel("");
String input_text2_normal_mode = "";
JLabel msg2_normal_mode_label = new JLabel("");
JLabel msg3_normal_mode_label = new JLabel("");  
JLabel msg4_normal_mode_label = new JLabel("you have tried this word once");  
static int normal_mode_score = 0;


 //frame va label haye sakht
 JFrame hard_stage_frame = new JFrame("hard:stage1");
 JFrame hard_stage_wining_frame = new JFrame("win"); 
 JFrame hard_stage_losing_frame = new JFrame("lose");
 JFrame hard_stage2_frame = new JFrame("hard:stage2"); 
  JFrame hard_stage2_wining_frame = new JFrame("win"); 
 JFrame hard_stage2_losing_frame = new JFrame("lose");
 JFrame try_again_hard_mode_frame = new JFrame("!");
 
JLabel label_matn_vared_shode_sakht = new JLabel("");
String input_text_hard_mode = "";
JLabel msg_hard_mode_label = new JLabel("");
JLabel msg1_hard_mode_label = new JLabel("");

JLabel label_hard_mode_stage2 = new JLabel("");
String input_text2_hard_mode = "";
JLabel msg2_to_user_hard_mode = new JLabel("");
JLabel msg3_hard_mode_label = new JLabel("");  
JLabel msg4_hard_mode_label = new JLabel("you have tried this word once");  
static int hard_mode_score = 0;





    File wavFile = new File("src/button-3.wav");
    AudioClip sound;

public Functions_and_GUI(){
//set close for frame
 menu_asli_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 menu_2_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 //frame va label haye normal
 normal_stage_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 normal_stage_wining_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 normal_stage_losing_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 normal_stage2_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 normal_stage2_wining_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 normal_stage2_losing_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 try_again_normal_mode_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 //frame va label haye sakht
 hard_stage_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 hard_stage_wining_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 hard_stage_losing_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 hard_stage2_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 hard_stage2_wining_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 hard_stage2_losing_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 try_again_hard_mode_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
 
    try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
    
    
    
        
    menu_asli_frame.setSize(600,400); 
    menu_2_frame.setSize(600,400); 
    
    normal_stage_frame.setSize(600,400);  
    normal_stage_wining_frame.setSize(600,400); 
    normal_stage_losing_frame.setSize(600,400); 
    normal_stage2_frame.setSize(600,400);  
    normal_stage2_wining_frame.setSize(600,400); 
    normal_stage2_losing_frame.setSize(600,400); 
    try_again_normal_mode_frame.setSize(600,400);    
    
    hard_stage_frame.setSize(600,400);  
    hard_stage_wining_frame.setSize(600,400); 
    hard_stage_losing_frame.setSize(600,400); 
    hard_stage2_frame.setSize(600,400);  
    hard_stage2_wining_frame.setSize(600,400); 
    hard_stage2_losing_frame.setSize(600,400); 
    try_again_hard_mode_frame.setSize(600,400);    
               
               
               

        
        
        
        
}    
    
    
    
    public void play(){
        
        set_menu_asli();
        set_menu_2();    
        
        set_normal_stage_1();
        set_losing_for_normal_mode_stage1();
        set_wining_for_normal_mode_stage1();
        set_normal_stage_2();
        set_losing_for_normal_mode_stage2();
        set_wining_for_normal_mode_stage2();
        try_again_in_normal_mode();
        
        
        set_hard_mode_stage1();
        set_losing_for_hard_stage1();
        set_wining_for_hard_mode_stage1();
        set_hard_mode_stage2();
        set_losing_hard_mode_stage_2();
        set_wining_for_hard_mode_stage2();
        set_try_again_for_hard_mode();
                
        
        
   
        
        

      I.setBackground(Color.lightGray);
      I2.setBackground(Color.lightGray); 
      Z.setBackground(Color.lightGray);
      T2.setBackground(Color.lightGray);   
      T.setBackground(Color.lightGray);
      Z2.setBackground(Color.lightGray); 
      E.setBackground(Color.lightGray);
      A2.setBackground(Color.lightGray);  
      R.setBackground(Color.lightGray);
      R2.setBackground(Color.lightGray); 
      G.setBackground(Color.lightGray);
      G2.setBackground(Color.lightGray);   
      A.setBackground(Color.lightGray);
      E2.setBackground(Color.lightGray); 
      
      I.setForeground(Color.MAGENTA);
      I2.setForeground(Color.MAGENTA);
      Z.setForeground(Color.MAGENTA);
      T2.setForeground(Color.MAGENTA);  
      T.setForeground(Color.MAGENTA);
      Z2.setForeground(Color.MAGENTA); 
      E.setForeground(Color.MAGENTA);
      A2.setForeground(Color.MAGENTA); 
      R.setForeground(Color.MAGENTA);
      R2.setForeground(Color.MAGENTA);
      G.setForeground(Color.MAGENTA);
      G2.setForeground(Color.MAGENTA);  
      A.setForeground(Color.MAGENTA);
      E2.setForeground(Color.MAGENTA);      
      
      
      
begin.setBackground(Color.DARK_GRAY);
exit.setBackground(Color.DARK_GRAY); 
normal.setBackground(Color.DARK_GRAY);
hard.setBackground(Color.DARK_GRAY); 
back_to_main_menu.setBackground(Color.DARK_GRAY);
try_again_normal_mode_page1.setBackground(Color.DARK_GRAY);
next_stage_normal_mode.setBackground(Color.DARK_GRAY);
try_again_normal_mode_page2.setBackground(Color.DARK_GRAY);
back_from_normal_mode_page2_to_main_page.setBackground(Color.DARK_GRAY);
try_again.setBackground(Color.DARK_GRAY);     
try_again_hard_mode_page1.setBackground(Color.DARK_GRAY);
next_stage_hard_mode.setBackground(Color.DARK_GRAY);
try_again_hard_mode_page2.setBackground(Color.DARK_GRAY);
back_from_hard_mode_page2_to_main_page.setBackground(Color.DARK_GRAY);
try_again_hard_mode.setBackground(Color.DARK_GRAY);
 
begin.setForeground(Color.PINK);
exit.setForeground(Color.PINK); 
normal.setForeground(Color.PINK);
hard.setForeground(Color.PINK); 
back_to_main_menu.setForeground(Color.PINK);
try_again_normal_mode_page1.setForeground(Color.PINK);
next_stage_normal_mode.setForeground(Color.PINK);
try_again_normal_mode_page2.setForeground(Color.PINK);
back_from_normal_mode_page2_to_main_page.setForeground(Color.PINK);
try_again.setForeground(Color.PINK);     
try_again_hard_mode_page1.setForeground(Color.PINK);
next_stage_hard_mode.setForeground(Color.PINK);
try_again_hard_mode_page2.setForeground(Color.PINK);
back_from_hard_mode_page2_to_main_page.setForeground(Color.PINK);
try_again_hard_mode.setForeground(Color.PINK);
      
      
      
      
      
        
        menu_asli_frame.setVisible(true);     
        menu_asli_frame.setLayout(new FlowLayout()); 
        
    }
    
    
   

    
      
    public void set_menu_asli(){
        
         //dokme haye menu_asli
    
               begin = new JButton( new AbstractAction("begin") {

        @Override
        public void actionPerformed( ActionEvent e ) {
        menu_asli_frame.setVisible(false);
        menu_2_frame.setVisible(true);
        sound.play();
        }
    });
      
          
        exit = new JButton( new AbstractAction("exit") {
        @Override
        public void actionPerformed( ActionEvent e ) {
        sound.play();
        System.exit(0);
        }
    });      
               
               
    menu_asli_frame.add(begin);
    menu_asli_frame.add(exit);
    menu_asli_frame.setLayout(new FlowLayout());        
////////////////////////////////////////////////////////////////////////////////      
        
    }
    
    public void set_menu_2(){
      
        //dokme haye menu_2 
        
        normal = new JButton( new AbstractAction("normal") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            menu_2_frame.setVisible(false);
            init_normal_words();
            normal_stage_frame.setVisible(true);
            sound.play();
        }
    });
      
          
        hard = new JButton( new AbstractAction("hard") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            menu_2_frame.setVisible(false);
            init_hard_words();
            hard_stage_frame.setVisible(true);
            sound.play();
        }
    });      
        
        
        back_to_main_menu = new JButton( new AbstractAction("back") {
        @Override
        public void actionPerformed( ActionEvent e ) {
        menu_2_frame.setVisible(false);
        menu_asli_frame.setVisible(true);
        sound.play();
        }
    });      
        


        menu_2_frame.add(normal);
        menu_2_frame.add(hard);
        menu_2_frame.add(back_to_main_menu);             
         menu_2_frame.setLayout(new FlowLayout());        
               
////////////////////////////////////////////////////////////////////////////////               
          
        
    }
    
    
    
    
    public void set_normal_stage_1(){
        
     //buttons and labels of normal stage1    
        
     init_normal_words();
     //list_for_normal_words.clear();
     //list_for_normal_words_typed.clear();
     //list_for_normal_words.add("TIZ");
     //list_for_normal_words.add("ZIT");


        Z = new JButton( new AbstractAction("Z") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        boolean word_found = false;    
        if(!input_text_normal_mode.contains("Z")){        
        input_text_normal_mode = input_text_normal_mode + "Z";
        input_text_normal_mode_label.setText(input_text_normal_mode);
        msg_normal_mode_label.setText(""); 
                if(input_text_normal_mode.length()>=3){
        for(int i = 0; i <= list_for_normal_words.size()-1 ; i++){
                //System.out.println(list_for_normal_words.get(i));
                //System.out.println(input_text_normal_mode);
        if(input_text_normal_mode.equals(list_for_normal_words.get(i))){
        list_for_normal_words_typed.add(list_for_normal_words.get(i));
        list_for_normal_words.remove(i); 
        word_found = true;
        break;
        }
        }
        if(word_found){
        normal_stage_frame.setVisible(false);    
        normal_mode_score = normal_mode_score + 1;
       msg_normal_mode_label.setText("you won...your score"+":"+normal_mode_score);
        normal_stage_wining_frame.setVisible(true);    
        }
        else{
        normal_stage_frame.setVisible(false);        
        normal_stage_losing_frame.setVisible(true);  
       msg1_normal_mode_label.setText("you lose...your score"+":"+normal_mode_score);
        }
        }
        }
        }
    });
      
          
        I = new JButton( new AbstractAction("I") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text_normal_mode.contains("I")){      
        input_text_normal_mode = input_text_normal_mode + "I";
        input_text_normal_mode_label.setText(input_text_normal_mode);
        msg_normal_mode_label.setText(""); 
        if(input_text_normal_mode.length()>=3){ 
        normal_stage_frame.setVisible(false);    
        normal_stage_losing_frame.setVisible(true);  
       msg1_normal_mode_label.setText("you lose...your score"+":"+normal_mode_score);
        }
        }
        }
    });
      
        
        
        T = new JButton( new AbstractAction("T") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        boolean word_found = false;    
        if(!input_text_normal_mode.contains("T")){    
        input_text_normal_mode = input_text_normal_mode + "T";
        input_text_normal_mode_label.setText(input_text_normal_mode);
        msg_normal_mode_label.setText(""); 
        if(input_text_normal_mode.length()>=3){
        for(int i = 0; i <= list_for_normal_words.size()-1 ; i++){
                //System.out.println(list_for_normal_words.get(i));
                //System.out.println(input_text_normal_mode);
        if(input_text_normal_mode.equals(list_for_normal_words.get(i))){
        list_for_normal_words_typed.add(list_for_normal_words.get(i));
        list_for_normal_words.remove(i); 
        word_found = true;
        break;
        }
        }
        if(word_found){
        normal_stage_frame.setVisible(false);    
        normal_mode_score = normal_mode_score + 1;
       msg_normal_mode_label.setText("you won...your score"+":"+normal_mode_score);
        normal_stage_wining_frame.setVisible(true);    
        }
        else{
        normal_stage_frame.setVisible(false);        
        normal_stage_losing_frame.setVisible(true);  
       msg1_normal_mode_label.setText("you lose...your score"+":"+normal_mode_score);
        }
        }
        }
        }
    });
      
    
        normal_stage_frame.add(input_text_normal_mode_label);   
        normal_stage_frame.add(T);
        normal_stage_frame.add(Z);
        normal_stage_frame.add(I);
        normal_stage_frame.setLayout(new FlowLayout());     
   
        
    }
    
    
    
    
    
    
    
    
    
        public void set_losing_for_normal_mode_stage1(){
                
     //   back from normal stage1 to main menu
        try_again_normal_mode_page1 = new JButton( new AbstractAction("try again!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage_losing_frame.setVisible(false);
        input_text_normal_mode = "";
        input_text_normal_mode_label.setText(input_text_normal_mode);
        normal_mode_score = 0;
        normal_stage_frame.setVisible(true);
        }
    });
           
        normal_stage_losing_frame.add(try_again_normal_mode_page1);
        normal_stage_losing_frame.add(msg1_normal_mode_label);
        normal_stage_losing_frame.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_wining_for_normal_mode_stage1(){
                
     //   go to next normal stage
        next_stage_normal_mode = new JButton( new AbstractAction("next stage") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage_wining_frame.setVisible(false);
        input_text_normal_mode = "";
        input_text_normal_mode_label.setText(input_text_normal_mode);
        normal_stage2_frame.setVisible(true);
        }
    });
           
        normal_stage_wining_frame.add(next_stage_normal_mode);
        normal_stage_wining_frame.add(msg_normal_mode_label);
        normal_stage_wining_frame.setLayout(new FlowLayout());   
        
    }
    
    
            
         public void set_normal_stage_2(){
        
     //buttons and labels of normal stage2               
        
        
        T2 = new JButton( new AbstractAction("T") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_normal_mode.contains("T")){    
        input_text2_normal_mode = input_text2_normal_mode + "T";
        input_text2_normal_mode_label.setText(input_text2_normal_mode);
        if(input_text2_normal_mode.length()>=3){
        boolean temp = false;
        boolean word_found = false;
            
                for(int j = 0; j <= list_for_normal_words_typed.size()-1 ; j++){
                        if(input_text2_normal_mode.equals(list_for_normal_words_typed.get(j))){ 
                                normal_stage2_frame.setVisible(false);    
                                try_again_normal_mode_frame.setVisible(true);
                                temp = true;
                                
                        }
                }
                          
                if(temp)
                    return;
            
                for(int i = 0; i <= list_for_normal_words.size()-1 ; i++){
               // System.out.println(list_for_normal_words.get(i));
              //  System.out.println(input_text2_normal_mode);
        if(input_text2_normal_mode.equals(list_for_normal_words.get(i))){
        list_for_normal_words_typed.add(list_for_normal_words.get(i));
        list_for_normal_words.remove(i); 
        word_found = true;
        break;
        }
        }        
        
        if(word_found){        
        normal_stage2_frame.setVisible(false); 
        normal_mode_score = normal_mode_score + 1;
        msg2_normal_mode_label.setText("you won...your score"+":"+normal_mode_score);     
        normal_stage2_wining_frame.setVisible(true);    
        }
        else{
        normal_stage2_frame.setVisible(false);    
        msg3_normal_mode_label.setText("you lose your score"+":"+normal_mode_score);     
        normal_stage2_losing_frame.setVisible(true);    
        }
        }    
        
        }
        }
    });
      
          
        I2 = new JButton( new AbstractAction("I") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_normal_mode.contains("I")){      
        input_text2_normal_mode = input_text2_normal_mode + "I";
        input_text2_normal_mode_label.setText(input_text2_normal_mode);
        if(input_text2_normal_mode.length()>=3){ 
        normal_stage2_frame.setVisible(false);    
        msg3_normal_mode_label.setText("you lose...your score"+":"+normal_mode_score);  
        normal_stage2_losing_frame.setVisible(true); 
        }
        }
        }
    });
      
        
        
        Z2 = new JButton( new AbstractAction("Z") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_normal_mode.contains("Z")){    
        input_text2_normal_mode = input_text2_normal_mode + "Z";
        input_text2_normal_mode_label.setText(input_text2_normal_mode);
        if(input_text2_normal_mode.length()>=3){
        boolean temp = false;
        boolean word_found = false;
            
                for(int j = 0; j <= list_for_normal_words_typed.size()-1 ; j++){
                        if(input_text2_normal_mode.equals(list_for_normal_words_typed.get(j))){ 
                                normal_stage2_frame.setVisible(false);    
                                try_again_normal_mode_frame.setVisible(true);
                                temp = true;
                                
                        }
                }
                          
                if(temp)
                    return;
            
                for(int i = 0; i <= list_for_normal_words.size()-1 ; i++){
               // System.out.println(list_for_normal_words.get(i));
              //  System.out.println(input_text2_normal_mode);
        if(input_text2_normal_mode.equals(list_for_normal_words.get(i))){
        list_for_normal_words_typed.add(list_for_normal_words.get(i));
        list_for_normal_words.remove(i); 
        word_found = true;
        break;
        }
        }        
        
        if(word_found){        
        normal_stage2_frame.setVisible(false); 
        normal_mode_score = normal_mode_score + 1;
        msg2_normal_mode_label.setText("you won...your score"+":"+normal_mode_score);     
        normal_stage2_wining_frame.setVisible(true);    
        }
        else{
        normal_stage2_frame.setVisible(false);    
        msg3_normal_mode_label.setText("you lose your score"+":"+normal_mode_score);     
        normal_stage2_losing_frame.setVisible(true);    
        }
        }    
        
        }
        }
    });
      
    
        normal_stage2_frame.add(input_text2_normal_mode_label);   
        normal_stage2_frame.add(Z2);
        normal_stage2_frame.add(T2);
        normal_stage2_frame.add(I2);
        normal_stage2_frame.setLayout(new FlowLayout());     
   
        
    }
           
            
            
           public void set_losing_for_normal_mode_stage2(){
                
     //   back from normal stage2 to main menu
        try_again_normal_mode_page2 = new JButton( new AbstractAction("try again!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage2_losing_frame.setVisible(false);
        input_text2_normal_mode = "";
        normal_mode_score = 1;
        input_text2_normal_mode_label.setText(input_text2_normal_mode);
        normal_stage2_frame.setVisible(true);
        }
    });
           
        normal_stage2_losing_frame.add(try_again_normal_mode_page2);
        normal_stage2_losing_frame.add(msg3_normal_mode_label);
        normal_stage2_losing_frame.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_wining_for_normal_mode_stage2(){
                
     //   back from normal stage2 to main menu
        back_from_normal_mode_page2_to_main_page = new JButton( new AbstractAction("back to main menu") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage2_wining_frame.setVisible(false);
        input_text2_normal_mode = "";
        normal_mode_score = 0;
        input_text2_normal_mode_label.setText(input_text2_normal_mode);
        menu_2_frame.setVisible(true);
        }
    });
           
        normal_stage2_wining_frame.add(back_from_normal_mode_page2_to_main_page);
        normal_stage2_wining_frame.add(msg2_normal_mode_label);
        normal_stage2_wining_frame.setLayout(new FlowLayout());   
        
    }
             
            
            
 
            
            
               public void try_again_in_normal_mode(){
                
     //   try again in normal mode
        try_again = new JButton( new AbstractAction("try again!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        try_again_normal_mode_frame.setVisible(false);
        input_text2_normal_mode = "";
        normal_mode_score = 1;
        input_text2_normal_mode_label.setText(input_text2_normal_mode);
        normal_stage2_frame.setVisible(true);
        }
    });
           
        try_again_normal_mode_frame.add(try_again);
        try_again_normal_mode_frame.add(msg4_normal_mode_label);
        try_again_normal_mode_frame.setLayout(new FlowLayout());   
        
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       public void set_hard_mode_stage1(){
        
     //buttons and labels of hard stage1               
               
     init_hard_words();
     
        A = new JButton( new AbstractAction("A") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text_hard_mode.contains("A")){        
        input_text_hard_mode = input_text_hard_mode + "A";
        label_matn_vared_shode_sakht.setText(input_text_hard_mode);
        msg_hard_mode_label.setText(""); 
        if(input_text_hard_mode.length()>=4){ 
        hard_stage_frame.setVisible(false);    
        hard_stage_losing_frame.setVisible(true);  
       msg1_hard_mode_label.setText("you lose...your score is"+":"+hard_mode_score);
        }
        }
        }
    });
      
          
        G = new JButton( new AbstractAction("G") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text_hard_mode.contains("G")){      
        input_text_hard_mode = input_text_hard_mode + "G";
        label_matn_vared_shode_sakht.setText(input_text_hard_mode);
        msg_hard_mode_label.setText(""); 
        if(input_text_hard_mode.length()>=4){ 
        hard_stage_frame.setVisible(false);    
        hard_stage_losing_frame.setVisible(true);  
       msg1_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }
        }
        }
    });
        
        
        
        E = new JButton( new AbstractAction("E") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        boolean word_found = false;
        if(!input_text_hard_mode.contains("E")){      
        input_text_hard_mode = input_text_hard_mode + "E";
        label_matn_vared_shode_sakht.setText(input_text_hard_mode);
        msg_hard_mode_label.setText(""); 
        if(input_text_hard_mode.length()>=4){
        for(int i = 0; i <= list_for_hard_words.size()-1; i++){
        if(input_text_hard_mode.equals(list_for_hard_words.get(i))){
        list_for_hard_words_typed.add(list_for_hard_words.get(i));
        list_for_hard_words.remove(i);
        word_found = true;
        break;
        }    
        }
        if(word_found){
        hard_stage_frame.setVisible(false);    
        hard_mode_score = hard_mode_score + 1;
       msg_hard_mode_label.setText("you won...your score"+":"+hard_mode_score);
        hard_stage_wining_frame.setVisible(true);    
        }
        else{
        hard_stage_frame.setVisible(false);        
        hard_stage_losing_frame.setVisible(true);  
       msg1_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }    
        }
        }
        }
    });
      
        
        
        R = new JButton( new AbstractAction("R") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        boolean word_found = false;
        if(!input_text_hard_mode.contains("R")){    
        input_text_hard_mode = input_text_hard_mode + "R";
        label_matn_vared_shode_sakht.setText(input_text_hard_mode);
        msg_hard_mode_label.setText(""); 
        if(input_text_hard_mode.length()>=4){
        for(int i = 0; i <= list_for_hard_words.size()-1; i++){
        if(input_text_hard_mode.equals(list_for_hard_words.get(i))){
        list_for_hard_words_typed.add(list_for_hard_words.get(i));
        list_for_hard_words.remove(i);
        word_found = true;
        break;
        }    
        }
        if(word_found){
        hard_stage_frame.setVisible(false);    
        hard_mode_score = hard_mode_score + 1;
       msg_hard_mode_label.setText("you won...your score"+":"+hard_mode_score);
        hard_stage_wining_frame.setVisible(true);    
        }
        else{
        hard_stage_frame.setVisible(false);        
        hard_stage_losing_frame.setVisible(true);  
       msg1_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }   
        }
        }
        }
    });
      
    
        hard_stage_frame.add(label_matn_vared_shode_sakht);   
        hard_stage_frame.add(E);
        hard_stage_frame.add(R);
        hard_stage_frame.add(A);
        hard_stage_frame.add(G);

        hard_stage_frame.setLayout(new FlowLayout());     
   
        
    }
    
    
    
    
    
    
    
    
    
        public void set_losing_for_hard_stage1(){
                
     //   back from hard stage1 to main menu
        try_again_hard_mode_page1 = new JButton( new AbstractAction("try again!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        hard_stage_losing_frame.setVisible(false);
        input_text_hard_mode = "";
        label_matn_vared_shode_sakht.setText(input_text_hard_mode);
        hard_mode_score = 0;
        hard_stage_frame.setVisible(true);
        }
    });
           
        hard_stage_losing_frame.add(try_again_hard_mode_page1);
        hard_stage_losing_frame.add(msg1_hard_mode_label);
        hard_stage_losing_frame.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_wining_for_hard_mode_stage1(){
                
     //   go to next hard stage
        next_stage_hard_mode = new JButton( new AbstractAction("next stage") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        hard_stage_wining_frame.setVisible(false);
        input_text_hard_mode = "";
        label_matn_vared_shode_sakht.setText(input_text_hard_mode);
        hard_stage2_frame.setVisible(true);
        }
    });
           
        hard_stage_wining_frame.add(next_stage_hard_mode);
        hard_stage_wining_frame.add(msg_hard_mode_label);
        hard_stage_wining_frame.setLayout(new FlowLayout());   
        
    }
    
    
            
       public void set_hard_mode_stage2(){
        
     //buttons and lables of hard stage2               
        
        
        R2 = new JButton( new AbstractAction("R") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_hard_mode.contains("R")){        
        input_text2_hard_mode = input_text2_hard_mode + "R";
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        msg2_to_user_hard_mode.setText(""); 
        if(input_text2_hard_mode.length()>=4){   
            
        boolean temp = false;
        boolean word_found = false;
            
                for(int j = 0; j <= list_for_hard_words_typed.size()-1 ; j++){
                        if(input_text2_hard_mode.equals(list_for_hard_words_typed.get(j))){ 
                                hard_stage2_frame.setVisible(false);    
                                try_again_hard_mode_frame.setVisible(true);
                                temp = true;
                                
                        }
                }
                          
                if(temp)
                    return;
            
                for(int i = 0; i <= list_for_hard_words.size()-1 ; i++){
                //System.out.println(list_for_hard_words.get(i));
                //System.out.println(input_text2_hard_mode);
        if(input_text2_hard_mode.equals(list_for_hard_words.get(i))){
        list_for_hard_words_typed.add(list_for_hard_words.get(i));
        list_for_hard_words.remove(i); 
        word_found = true;
        break;
        }
        }        
        
        if(word_found){        
        hard_stage2_frame.setVisible(false); 
        hard_mode_score = hard_mode_score + 1;
        msg3_hard_mode_label.setText("you won...your score"+":"+hard_mode_score);     
        hard_stage2_wining_frame.setVisible(true);    
        }
        else{    
        hard_stage2_frame.setVisible(false);    
        hard_stage2_losing_frame.setVisible(true);  
       msg3_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }
        }
        }
        }
    });
      
          
        G2 = new JButton( new AbstractAction("G") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_hard_mode.contains("G")){      
        input_text2_hard_mode = input_text2_hard_mode + "G";
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        msg2_to_user_hard_mode.setText(""); 
        if(input_text2_hard_mode.length()>=4){ 
        hard_stage2_frame.setVisible(false);    
        hard_stage2_losing_frame.setVisible(true);  
       msg3_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }
        }
        }
    });
        
        
        
        A2 = new JButton( new AbstractAction("A") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_hard_mode.contains("A")){      
        input_text2_hard_mode = input_text2_hard_mode + "A";
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        msg2_to_user_hard_mode.setText(""); 
        if(input_text2_hard_mode.length()>=4){ 
        hard_stage2_frame.setVisible(false);    
        hard_stage2_losing_frame.setVisible(true);  
       msg3_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }
        }
        }
    });
      
        
        
        E2 = new JButton( new AbstractAction("E") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!input_text2_hard_mode.contains("E")){    
        input_text2_hard_mode = input_text2_hard_mode + "E";
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        msg2_to_user_hard_mode.setText(""); 
        if(input_text2_hard_mode.length()>=4){
        boolean temp = false;
        boolean word_found = false;
            
                for(int j = 0; j <= list_for_hard_words_typed.size()-1 ; j++){
                        if(input_text2_hard_mode.equals(list_for_hard_words_typed.get(j))){ 
                                hard_stage2_frame.setVisible(false);    
                                try_again_hard_mode_frame.setVisible(true);
                                temp = true;
                                
                        }
                }
                          
                if(temp)
                    return;
            
                for(int i = 0; i <= list_for_hard_words.size()-1 ; i++){
               // System.out.println(list_for_hard_words.get(i));
               // System.out.println(input_text2_hard_mode);
        if(input_text2_hard_mode.equals(list_for_hard_words.get(i))){
        list_for_hard_words_typed.add(list_for_hard_words.get(i));
        list_for_hard_words.remove(i); 
        word_found = true;
        break;
        }
        }        
        
        if(word_found){        
        hard_stage2_frame.setVisible(false); 
        hard_mode_score = hard_mode_score + 1;
        msg3_hard_mode_label.setText("you won...your score"+":"+hard_mode_score);     
        hard_stage2_wining_frame.setVisible(true);    
        }
        else{
        hard_stage2_frame.setVisible(false);        
        hard_stage2_losing_frame.setVisible(true);  
       msg3_hard_mode_label.setText("you lose...your score"+":"+hard_mode_score);
        }
            
        }
        }
        }
    });
      
    
        hard_stage2_frame.add(label_hard_mode_stage2);   
        hard_stage2_frame.add(A2);
        hard_stage2_frame.add(R2);
        hard_stage2_frame.add(E2);
        hard_stage2_frame.add(G2);

        hard_stage2_frame.setLayout(new FlowLayout());     
   
        
    }
    
    
    
    
    
    
    
    
    
        public void set_losing_hard_mode_stage_2(){
                
     //   back from hard stage2 to main menu
        try_again_hard_mode_page2 = new JButton( new AbstractAction("try again!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        hard_stage2_losing_frame.setVisible(false);
        input_text2_hard_mode = "";
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        hard_mode_score = 1;
        hard_stage2_frame.setVisible(true);
        }
    });
           
        hard_stage2_losing_frame.add(try_again_hard_mode_page2);
        hard_stage2_losing_frame.add(msg3_hard_mode_label);
        hard_stage2_losing_frame.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_wining_for_hard_mode_stage2(){
                
     //   back from hard stage2 to main menu
        back_from_hard_mode_page2_to_main_page = new JButton( new AbstractAction("back to main menu") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        hard_stage2_wining_frame.setVisible(false);
        input_text2_hard_mode = "";
        hard_mode_score = 0;
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        menu_2_frame.setVisible(true);
        }
    });
           
        hard_stage2_wining_frame.add(back_from_hard_mode_page2_to_main_page);
        hard_stage2_wining_frame.add(msg2_to_user_hard_mode);
        hard_stage2_wining_frame.setLayout(new FlowLayout());   
    }
    
        
            
   
            
            
            
       public void set_try_again_for_hard_mode(){
                
     //   try again in hard mode
        try_again_hard_mode = new JButton( new AbstractAction("try again!") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        try_again_hard_mode_frame.setVisible(false);
        input_text2_hard_mode = "";
        hard_mode_score = 1;
        label_hard_mode_stage2.setText(input_text2_hard_mode);
        hard_stage2_frame.setVisible(true);
        }
    });
           
        try_again_hard_mode_frame.add(try_again_hard_mode);
        try_again_hard_mode_frame.add(msg4_hard_mode_label);
        try_again_hard_mode_frame.setLayout(new FlowLayout());   
        
    }        
            
//init words arraylist for hard and normal modes            
public void init_normal_words(){            
list_for_normal_words.clear();
list_for_normal_words_typed.clear();
list_for_normal_words.add("TIZ");
list_for_normal_words.add("ZIT");
}            
    
public void init_hard_words(){    
list_for_hard_words_typed.clear();
list_for_hard_words.clear();
list_for_hard_words.add("RAGE");
list_for_hard_words.add("GEAR");        
}
            
        }
