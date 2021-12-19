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


import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author asus
 */
public class Functions_and_GUI {
    
    
    
    
    
    
//dokme haye asli    
 JButton shoro , khoroj , normal , sakht , bazgasht_be_menu_asli
//dokme haye normal         
 ,shoro_mojadad_normal1,normal_marhale_baad,
 shoro_mojadad_normal2,bazgasht_az_normal2_be_menu_2,emtehan_mojadad
//dokme haye sakht         
 ,shoro_mojadad_sakht1,sakht_marhale_baad,
 shoro_mojadad_sakht2,bazgasht_az_sakht2_be_menu_2,emtehan_mojadad_sakht;
 
        //dokme haye normal
 JButton A,A2,D,D2,M,M2
        //dokme haye sakht 
         ,K,K2,M3,M4,R,R2,Y,Y2;
 JFrame menu_asli = new JFrame("بازی کلمات");    
 JFrame menu_2 = new JFrame("منو"); 
 
 
 //frame va label haye normal
 JFrame normal_stage = new JFrame("نرمال مرحله یک");
 JFrame normal_stage_bordan = new JFrame("برد"); 
 JFrame normal_stage_bakhtan = new JFrame("باخت");
 JFrame normal_stage2 = new JFrame("نرمال مرحله دو"); 
  JFrame normal_stage2_bordan = new JFrame("برد"); 
 JFrame normal_stage2_bakhtan = new JFrame("باخت");
 JFrame dobare_emtehan_konid = new JFrame("!");
 
 
JLabel label_matn_vared_shode = new JLabel("");
String matn_vared_shode = "";
JLabel payam_be_karbar = new JLabel("");
JLabel payam_be_karbar_ = new JLabel("");

JLabel label_matn_vared_shode2 = new JLabel("");
String matn_vared_shode2 = "";
JLabel payam_be_karbar2 = new JLabel("");
JLabel payam_be_karbar2_ = new JLabel("");  
JLabel payam_be_karbar3 = new JLabel("این کلمه یک بار وارد شده دوباره امتحان کنید");  
static int emtiaz = 0;


 //frame va label haye sakht
 JFrame sakht_stage = new JFrame("سخت مرحله یک");
 JFrame sakht_stage_bordan = new JFrame("برد"); 
 JFrame sakht_stage_bakhtan = new JFrame("باخت");
 JFrame sakht_stage2 = new JFrame("سخت مرحله دو"); 
  JFrame sakht_stage2_bordan = new JFrame("برد"); 
 JFrame sakht_stage2_bakhtan = new JFrame("باخت");
 JFrame dobare_emtehan_konid_sakht = new JFrame("!");
 
JLabel label_matn_vared_shode_sakht = new JLabel("");
String matn_vared_shode_sakht = "";
JLabel payam_be_karbar_sakht = new JLabel("");
JLabel payam_be_karbar__sakht = new JLabel("");

JLabel label_matn_vared_shode2_sakht = new JLabel("");
String matn_vared_shode2_sakht = "";
JLabel payam_be_karbar2_sakht = new JLabel("");
JLabel payam_be_karbar2__sakht = new JLabel("");  
JLabel payam_be_karbar3_sakht = new JLabel("این کلمه یک بار وارد شده دوباره امتحان کنید");  
static int emtiaz_sakht = 0;





    File wavFile = new File("src/button-3.wav");
    AudioClip sound;

public Functions_and_GUI(){
        
 

    try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
    
    
    
        
    menu_asli.setSize(600,400); 
    menu_2.setSize(600,400); 
    
    normal_stage.setSize(600,400);  
    normal_stage_bordan.setSize(600,400); 
    normal_stage_bakhtan.setSize(600,400); 
    normal_stage2.setSize(600,400);  
    normal_stage2_bordan.setSize(600,400); 
    normal_stage2_bakhtan.setSize(600,400); 
    dobare_emtehan_konid.setSize(600,400);    
    
    sakht_stage.setSize(600,400);  
    sakht_stage_bordan.setSize(600,400); 
    sakht_stage_bakhtan.setSize(600,400); 
    sakht_stage2.setSize(600,400);  
    sakht_stage2_bordan.setSize(600,400); 
    sakht_stage2_bakhtan.setSize(600,400); 
    dobare_emtehan_konid_sakht.setSize(600,400);    
               
               
               

        
        
        
        
}    
    
    
    
    public void play(){
        
        set_menu_asli();
        set_menu_2();    
        
        set_normal_stage_1();
        set_normal_stage_bakhtan();
        set_normal_stage_bordan();
        set_normal_stage_2();
        set_normal_stage2_bakhtan();
        set_normal_stage2_bordan();
        set_emtehan_mojadad();
        
        
        set_sakht_stage_1();
        set_sakht_stage_bakhtan();
        set_sakht_stage_bordan();
        set_sakht_stage_2();
        set_sakht_stage2_bakhtan();
        set_sakht_stage2_bordan();
        set_emtehan_mojadad_sakht();
                
        
        
   
        
        

      A.setBackground(Color.lightGray);
      A2.setBackground(Color.lightGray); 
      D.setBackground(Color.lightGray);
      D2.setBackground(Color.lightGray);   
      M.setBackground(Color.lightGray);
      M2.setBackground(Color.lightGray); 
      M3.setBackground(Color.lightGray);
      M4.setBackground(Color.lightGray);  
      R.setBackground(Color.lightGray);
      R2.setBackground(Color.lightGray); 
      Y.setBackground(Color.lightGray);
      Y2.setBackground(Color.lightGray);   
      K.setBackground(Color.lightGray);
      K2.setBackground(Color.lightGray); 
      
      A.setForeground(Color.MAGENTA);
      A2.setForeground(Color.MAGENTA);
      D.setForeground(Color.MAGENTA);
      D2.setForeground(Color.MAGENTA);  
      M.setForeground(Color.MAGENTA);
      M2.setForeground(Color.MAGENTA); 
      M3.setForeground(Color.MAGENTA);
      M4.setForeground(Color.MAGENTA); 
      R.setForeground(Color.MAGENTA);
      R2.setForeground(Color.MAGENTA);
      Y.setForeground(Color.MAGENTA);
      Y2.setForeground(Color.MAGENTA);  
      K.setForeground(Color.MAGENTA);
      K2.setForeground(Color.MAGENTA);      
      
      
      
shoro.setBackground(Color.DARK_GRAY);
khoroj.setBackground(Color.DARK_GRAY); 
normal.setBackground(Color.DARK_GRAY);
sakht.setBackground(Color.DARK_GRAY); 
bazgasht_be_menu_asli.setBackground(Color.DARK_GRAY);
shoro_mojadad_normal1.setBackground(Color.DARK_GRAY);
normal_marhale_baad.setBackground(Color.DARK_GRAY);
shoro_mojadad_normal2.setBackground(Color.DARK_GRAY);
bazgasht_az_normal2_be_menu_2.setBackground(Color.DARK_GRAY);
emtehan_mojadad.setBackground(Color.DARK_GRAY);     
shoro_mojadad_sakht1.setBackground(Color.DARK_GRAY);
sakht_marhale_baad.setBackground(Color.DARK_GRAY);
shoro_mojadad_sakht2.setBackground(Color.DARK_GRAY);
bazgasht_az_sakht2_be_menu_2.setBackground(Color.DARK_GRAY);
emtehan_mojadad_sakht.setBackground(Color.DARK_GRAY);
 
shoro.setForeground(Color.PINK);
khoroj.setForeground(Color.PINK); 
normal.setForeground(Color.PINK);
sakht.setForeground(Color.PINK); 
bazgasht_be_menu_asli.setForeground(Color.PINK);
shoro_mojadad_normal1.setForeground(Color.PINK);
normal_marhale_baad.setForeground(Color.PINK);
shoro_mojadad_normal2.setForeground(Color.PINK);
bazgasht_az_normal2_be_menu_2.setForeground(Color.PINK);
emtehan_mojadad.setForeground(Color.PINK);     
shoro_mojadad_sakht1.setForeground(Color.PINK);
sakht_marhale_baad.setForeground(Color.PINK);
shoro_mojadad_sakht2.setForeground(Color.PINK);
bazgasht_az_sakht2_be_menu_2.setForeground(Color.PINK);
emtehan_mojadad_sakht.setForeground(Color.PINK);
      
      
      
      
      
        
        menu_asli.setVisible(true);     
        menu_asli.setLayout(new FlowLayout()); 
        
    }
    
    
   

    
      
    public void set_menu_asli(){
        
         //dokme haye menu_asli
    
               shoro = new JButton( new AbstractAction("شروع") {

        @Override
        public void actionPerformed( ActionEvent e ) {
        menu_asli.setVisible(false);
        menu_2.setVisible(true);
        sound.play();
        }
    });
      
          
        khoroj = new JButton( new AbstractAction("خروج") {
        @Override
        public void actionPerformed( ActionEvent e ) {
        sound.play();
        System.exit(0);
        }
    });      
               
               
    menu_asli.add(shoro);
    menu_asli.add(khoroj);
    menu_asli.setLayout(new FlowLayout());        
////////////////////////////////////////////////////////////////////////////////      
        
    }
    
    public void set_menu_2(){
      
        //dokme haye menu_2 
        
        normal = new JButton( new AbstractAction("نرمال") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            menu_2.setVisible(false);
            normal_stage.setVisible(true);
            sound.play();
        }
    });
      
          
        sakht = new JButton( new AbstractAction("سخت") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            menu_2.setVisible(false);
            sakht_stage.setVisible(true);
            sound.play();
        }
    });      
        
        
        bazgasht_be_menu_asli = new JButton( new AbstractAction("بازگشت") {
        @Override
        public void actionPerformed( ActionEvent e ) {
        menu_2.setVisible(false);
        menu_asli.setVisible(true);
        sound.play();
        }
    });      
        


        menu_2.add(normal);
        menu_2.add(sakht);
        menu_2.add(bazgasht_be_menu_asli);             
         menu_2.setLayout(new FlowLayout());        
               
////////////////////////////////////////////////////////////////////////////////               
          
        
    }
    
    
    
    
    public void set_normal_stage_1(){
        
     //dokme ha va label haye normal_stage               
        
        
        D = new JButton( new AbstractAction("د") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode.contains("د")){        
        matn_vared_shode = matn_vared_shode + "د";
        label_matn_vared_shode.setText(matn_vared_shode);
        payam_be_karbar.setText(""); 
        if(matn_vared_shode.length()>=3){ 
        normal_stage.setVisible(false);    
        normal_stage_bakhtan.setVisible(true);  
       payam_be_karbar_.setText("شما باختید امتیاز شما "+":"+emtiaz);
        }
        }
        }
    });
      
          
        A = new JButton( new AbstractAction("ا") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode.contains("ا")){      
        matn_vared_shode = matn_vared_shode + "ا";
        label_matn_vared_shode.setText(matn_vared_shode);
        payam_be_karbar.setText(""); 
        if(matn_vared_shode.length()>=3){ 
        normal_stage.setVisible(false);    
        normal_stage_bakhtan.setVisible(true);  
       payam_be_karbar_.setText("شما باختید امتیاز شما "+":"+emtiaz);
        }
        }
        }
    });
      
        
        
        M = new JButton( new AbstractAction("م") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode.contains("م")){    
        matn_vared_shode = matn_vared_shode + "م";
        label_matn_vared_shode.setText(matn_vared_shode);
        payam_be_karbar.setText(""); 
        if(matn_vared_shode.length()>=3){
        if(matn_vared_shode.equals("دام")){ 
        normal_stage.setVisible(false);    
        emtiaz = emtiaz + 1;
       payam_be_karbar.setText("شما بردید امتیاز شما "+":"+emtiaz);
        normal_stage_bordan.setVisible(true);    
        }
        else{
        normal_stage.setVisible(false);        
        normal_stage_bakhtan.setVisible(true);  
       payam_be_karbar_.setText("شما باختید امتیاز شما "+":"+emtiaz);
        }
            
        }
        }
        }
    });
      
    
        normal_stage.add(label_matn_vared_shode);   
        normal_stage.add(M);
        normal_stage.add(D);
        normal_stage.add(A);
        normal_stage.setLayout(new FlowLayout());     
   
        
    }
    
    
    
    
    
    
    
    
    
        public void set_normal_stage_bakhtan(){
                
     //   bazgasht_az_normal1_be_menu_2
        shoro_mojadad_normal1 = new JButton( new AbstractAction("شروع مجدد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage_bakhtan.setVisible(false);
        matn_vared_shode = "";
        label_matn_vared_shode.setText(matn_vared_shode);
        emtiaz = 0;
        normal_stage.setVisible(true);
        }
    });
           
        normal_stage_bakhtan.add(shoro_mojadad_normal1);
        normal_stage_bakhtan.add(payam_be_karbar_);
        normal_stage_bakhtan.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_normal_stage_bordan(){
                
     //   bazgasht_az_normal1_be_menu_2
        normal_marhale_baad = new JButton( new AbstractAction("مرحله ی بعد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage_bordan.setVisible(false);
        matn_vared_shode = "";
        label_matn_vared_shode.setText(matn_vared_shode);
        normal_stage2.setVisible(true);
        }
    });
           
        normal_stage_bordan.add(normal_marhale_baad);
        normal_stage_bordan.add(payam_be_karbar);
        normal_stage_bordan.setLayout(new FlowLayout());   
        
    }
    
    
            
         public void set_normal_stage_2(){
        
     //dokme ha va label haye normal_stage               
        
        
        M2 = new JButton( new AbstractAction("م") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2.contains("م")){    
        matn_vared_shode2 = matn_vared_shode2 + "م";
        label_matn_vared_shode2.setText(matn_vared_shode2);
        if(matn_vared_shode2.length()>=3){
        if(matn_vared_shode2.equals("دام")){
        normal_stage2.setVisible(false);
        dobare_emtehan_konid.setVisible(true);
        }
        else{
        normal_stage2.setVisible(false);    
        payam_be_karbar2_.setText("شما باختید امتیاز شما "+":"+emtiaz);  
        normal_stage2_bakhtan.setVisible(true); 
        }
        }
        }
        }
    });
      
          
        A2 = new JButton( new AbstractAction("ا") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2.contains("ا")){      
        matn_vared_shode2 = matn_vared_shode2 + "ا";
        label_matn_vared_shode2.setText(matn_vared_shode2);
        if(matn_vared_shode2.length()>=3){ 
        normal_stage2.setVisible(false);    
        payam_be_karbar2_.setText("شما باختید امتیاز شما "+":"+emtiaz);  
        normal_stage2_bakhtan.setVisible(true); 
        }
        }
        }
    });
      
        
        
        D2 = new JButton( new AbstractAction("د") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2.contains("د")){    
        matn_vared_shode2 = matn_vared_shode2 + "د";
        label_matn_vared_shode2.setText(matn_vared_shode2);
        if(matn_vared_shode2.length()>=3){
        if(matn_vared_shode2.equals("ماد")){ 
        //frame bordan ke dokme raftan be marhale2 ra darad va emtiaz = 1 ra neshan midahad va migoyad shoma bordid      
        normal_stage2.setVisible(false); 
        emtiaz = emtiaz + 1;
        payam_be_karbar2.setText("شما بردید امتیاز شما "+":"+emtiaz);     
        normal_stage2_bordan.setVisible(true);    
        }
        else{
        normal_stage2.setVisible(false);    
        payam_be_karbar2_.setText("شما باختید امتیاز شما "+":"+emtiaz);     
        normal_stage2_bakhtan.setVisible(true);    
        }
            
        }
        }
        }
    });
      
    
        normal_stage2.add(label_matn_vared_shode2);   
        normal_stage2.add(M2);
        normal_stage2.add(D2);
        normal_stage2.add(A2);
        normal_stage2.setLayout(new FlowLayout());     
   
        
    }
           
            
            
           public void set_normal_stage2_bakhtan(){
                
     //   bazgasht_az_normal1_be_menu_2
        shoro_mojadad_normal2 = new JButton( new AbstractAction("شروع مجدد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage2_bakhtan.setVisible(false);
        matn_vared_shode2 = "";
        emtiaz = 1;
        label_matn_vared_shode2.setText(matn_vared_shode2);
        normal_stage2.setVisible(true);
        }
    });
           
        normal_stage2_bakhtan.add(shoro_mojadad_normal2);
        normal_stage2_bakhtan.add(payam_be_karbar2_);
        normal_stage2_bakhtan.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_normal_stage2_bordan(){
                
     //   bazgasht_az_normal1_be_menu_2
        bazgasht_az_normal2_be_menu_2 = new JButton( new AbstractAction("بازگشت به منو اصلی") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        normal_stage2_bordan.setVisible(false);
        matn_vared_shode2 = "";
        emtiaz = 0;
        label_matn_vared_shode2.setText(matn_vared_shode2);
        menu_2.setVisible(true);
        }
    });
           
        normal_stage2_bordan.add(bazgasht_az_normal2_be_menu_2);
        normal_stage2_bordan.add(payam_be_karbar2);
        normal_stage2_bordan.setLayout(new FlowLayout());   
        
    }
             
            
            
 
            
            
               public void set_emtehan_mojadad(){
                
     //   bazgasht_az_normal1_be_menu_2
        emtehan_mojadad = new JButton( new AbstractAction("امنحان مجدد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        dobare_emtehan_konid.setVisible(false);
        matn_vared_shode2 = "";
        emtiaz = 1;
        label_matn_vared_shode2.setText(matn_vared_shode2);
        normal_stage2.setVisible(true);
        }
    });
           
        dobare_emtehan_konid.add(emtehan_mojadad);
        dobare_emtehan_konid.add(payam_be_karbar3);
        dobare_emtehan_konid.setLayout(new FlowLayout());   
        
    }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       public void set_sakht_stage_1(){
        
     //dokme ha va label haye normal_stage               
        
        
        K = new JButton( new AbstractAction("خ") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode_sakht.contains("خ")){        
        matn_vared_shode_sakht = matn_vared_shode_sakht + "خ";
        label_matn_vared_shode_sakht.setText(matn_vared_shode_sakht);
        payam_be_karbar_sakht.setText(""); 
        if(matn_vared_shode_sakht.length()>=4){ 
        sakht_stage.setVisible(false);    
        sakht_stage_bakhtan.setVisible(true);  
       payam_be_karbar__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
        }
        }
    });
      
          
        Y = new JButton( new AbstractAction("ی") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode_sakht.contains("ی")){      
        matn_vared_shode_sakht = matn_vared_shode_sakht + "ی";
        label_matn_vared_shode_sakht.setText(matn_vared_shode_sakht);
        payam_be_karbar_sakht.setText(""); 
        if(matn_vared_shode_sakht.length()>=4){ 
        sakht_stage.setVisible(false);    
        sakht_stage_bakhtan.setVisible(true);  
       payam_be_karbar__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
        }
        }
    });
        
        
        
        M3 = new JButton( new AbstractAction("م") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode_sakht.contains("م")){      
        matn_vared_shode_sakht = matn_vared_shode_sakht + "م";
        label_matn_vared_shode_sakht.setText(matn_vared_shode_sakht);
        payam_be_karbar_sakht.setText(""); 
        if(matn_vared_shode_sakht.length()>=4){ 
        sakht_stage.setVisible(false);    
        sakht_stage_bakhtan.setVisible(true);  
       payam_be_karbar__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
        }
        }
    });
      
        
        
        R = new JButton( new AbstractAction("ر") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode_sakht.contains("ر")){    
        matn_vared_shode_sakht = matn_vared_shode_sakht + "ر";
        label_matn_vared_shode_sakht.setText(matn_vared_shode_sakht);
        payam_be_karbar_sakht.setText(""); 
        if(matn_vared_shode_sakht.length()>=4){
        if(matn_vared_shode_sakht.equals("خمیر")){ 
        sakht_stage.setVisible(false);    
        emtiaz_sakht = emtiaz_sakht + 1;
       payam_be_karbar_sakht.setText("شما بردید امتیاز شما "+":"+emtiaz_sakht);
        sakht_stage_bordan.setVisible(true);    
        }
        else{
        sakht_stage.setVisible(false);        
        sakht_stage_bakhtan.setVisible(true);  
       payam_be_karbar__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
            
        }
        }
        }
    });
      
    
        sakht_stage.add(label_matn_vared_shode_sakht);   
        sakht_stage.add(M3);
        sakht_stage.add(R);
        sakht_stage.add(K);
        sakht_stage.add(Y);

        sakht_stage.setLayout(new FlowLayout());     
   
        
    }
    
    
    
    
    
    
    
    
    
        public void set_sakht_stage_bakhtan(){
                
     //   bazgasht_az_normal1_be_menu_2
        shoro_mojadad_sakht1 = new JButton( new AbstractAction("شروع مجدد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        sakht_stage_bakhtan.setVisible(false);
        matn_vared_shode_sakht = "";
        label_matn_vared_shode_sakht.setText(matn_vared_shode_sakht);
        emtiaz_sakht = 0;
        sakht_stage.setVisible(true);
        }
    });
           
        sakht_stage_bakhtan.add(shoro_mojadad_sakht1);
        sakht_stage_bakhtan.add(payam_be_karbar__sakht);
        sakht_stage_bakhtan.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_sakht_stage_bordan(){
                
     //   bazgasht_az_normal1_be_menu_2
        sakht_marhale_baad = new JButton( new AbstractAction("مرحله ی بعد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        sakht_stage_bordan.setVisible(false);
        matn_vared_shode_sakht = "";
        label_matn_vared_shode_sakht.setText(matn_vared_shode_sakht);
        sakht_stage2.setVisible(true);
        }
    });
           
        sakht_stage_bordan.add(sakht_marhale_baad);
        sakht_stage_bordan.add(payam_be_karbar_sakht);
        sakht_stage_bordan.setLayout(new FlowLayout());   
        
    }
    
    
            
       public void set_sakht_stage_2(){
        
     //dokme ha va label haye normal_stage               
        
        
        R2 = new JButton( new AbstractAction("ر") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2_sakht.contains("ر")){        
        matn_vared_shode2_sakht = matn_vared_shode2_sakht + "ر";
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        payam_be_karbar2_sakht.setText(""); 
        if(matn_vared_shode2_sakht.length()>=4){   
        if(matn_vared_shode2_sakht.equals("خمیر")){
        sakht_stage2.setVisible(false);    
        dobare_emtehan_konid_sakht.setVisible(true);    
        }
        else{    
        sakht_stage2.setVisible(false);    
        sakht_stage2_bakhtan.setVisible(true);  
       payam_be_karbar2__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
        }
        }
        }
    });
      
          
        Y2 = new JButton( new AbstractAction("ی") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2_sakht.contains("ی")){      
        matn_vared_shode2_sakht = matn_vared_shode2_sakht + "ی";
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        payam_be_karbar2_sakht.setText(""); 
        if(matn_vared_shode2_sakht.length()>=4){ 
        sakht_stage2.setVisible(false);    
        sakht_stage2_bakhtan.setVisible(true);  
       payam_be_karbar2__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
        }
        }
    });
        
        
        
        M4 = new JButton( new AbstractAction("م") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2_sakht.contains("م")){      
        matn_vared_shode2_sakht = matn_vared_shode2_sakht + "م";
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        payam_be_karbar2_sakht.setText(""); 
        if(matn_vared_shode2_sakht.length()>=4){ 
        sakht_stage2.setVisible(false);    
        sakht_stage2_bakhtan.setVisible(true);  
       payam_be_karbar2__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
        }
        }
    });
      
        
        
        K2 = new JButton( new AbstractAction("خ") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        if(!matn_vared_shode2_sakht.contains("خ")){    
        matn_vared_shode2_sakht = matn_vared_shode2_sakht + "خ";
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        payam_be_karbar2_sakht.setText(""); 
        if(matn_vared_shode2_sakht.length()>=4){
        if(matn_vared_shode2_sakht.equals("مریخ")){ 
        sakht_stage2.setVisible(false);    
        emtiaz_sakht = emtiaz_sakht + 1;
       payam_be_karbar2_sakht.setText("شما بردید امتیاز شما "+":"+emtiaz_sakht);
        sakht_stage2_bordan.setVisible(true);    
        }
        else{
        sakht_stage2.setVisible(false);        
        sakht_stage2_bakhtan.setVisible(true);  
       payam_be_karbar2__sakht.setText("شما باختید امتیاز شما "+":"+emtiaz_sakht);
        }
            
        }
        }
        }
    });
      
    
        sakht_stage2.add(label_matn_vared_shode2_sakht);   
        sakht_stage2.add(M4);
        sakht_stage2.add(R2);
        sakht_stage2.add(K2);
        sakht_stage2.add(Y2);

        sakht_stage2.setLayout(new FlowLayout());     
   
        
    }
    
    
    
    
    
    
    
    
    
        public void set_sakht_stage2_bakhtan(){
                
     //   bazgasht_az_normal1_be_menu_2
        shoro_mojadad_sakht2 = new JButton( new AbstractAction("شروع مجدد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        sakht_stage2_bakhtan.setVisible(false);
        matn_vared_shode2_sakht = "";
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        emtiaz_sakht = 1;
        sakht_stage2.setVisible(true);
        }
    });
           
        sakht_stage2_bakhtan.add(shoro_mojadad_sakht2);
        sakht_stage2_bakhtan.add(payam_be_karbar2__sakht);
        sakht_stage2_bakhtan.setLayout(new FlowLayout());   
        
    }
    
    
    
            public void set_sakht_stage2_bordan(){
                
     //   bazgasht_az_normal1_be_menu_2
        bazgasht_az_sakht2_be_menu_2 = new JButton( new AbstractAction("بازگشت به منو اصلی") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        sakht_stage2_bordan.setVisible(false);
        matn_vared_shode2_sakht = "";
        emtiaz_sakht = 0;
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        menu_2.setVisible(true);
        }
    });
           
        sakht_stage2_bordan.add(bazgasht_az_sakht2_be_menu_2);
        sakht_stage2_bordan.add(payam_be_karbar2_sakht);
        sakht_stage2_bordan.setLayout(new FlowLayout());   
    }
    
        
            
   
            
            
            
       public void set_emtehan_mojadad_sakht(){
                
     //   bazgasht_az_normal1_be_menu_2
        emtehan_mojadad_sakht = new JButton( new AbstractAction("امنحان مجدد") {
        @Override
        public void actionPerformed( ActionEvent e ) {
            sound.play();
        dobare_emtehan_konid_sakht.setVisible(false);
        matn_vared_shode2_sakht = "";
        emtiaz_sakht = 1;
        label_matn_vared_shode2_sakht.setText(matn_vared_shode2_sakht);
        sakht_stage2.setVisible(true);
        }
    });
           
        dobare_emtehan_konid_sakht.add(emtehan_mojadad_sakht);
        dobare_emtehan_konid_sakht.add(payam_be_karbar3_sakht);
        dobare_emtehan_konid_sakht.setLayout(new FlowLayout());   
        
    }        
            
            
            
            
            
    
    
}
