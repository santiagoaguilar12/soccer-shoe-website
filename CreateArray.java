/*Programmer: Santiago Aguilar
Program Description: Slide file with a few methods that are called from main method to run program properly
Date Created: 11/30/17
Date Revised : 12/3/17*/


   import java.io.*;
   import java.util.*;
   import javaxBtn.swing.*;//imports necessary classes
   import java.awt.*;
   import java.awt.event.*;
   import java.util.Random;


   public class CreateBtnArray {
   
      JButton[] array;
      JButton magBtn,hyperBtn,mercBtn,tiempoBtn,aceBtn,xBtn,nemezBtn,powBtn,speedBtn;
		
      public CreateBtnArray(JButton[] arrayIn)
      {
         array=arrayIn;
      }
    
      public JButton[] fillArray()
      {
      
         magBtn=new JButton((new ImageIcon("nike1.jpg")));
         magBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[0]=magBtn;		
			
      
         hyperBtn=new JButton((new ImageIcon("nike1.jpg")));
         hyperBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[1]=hyperBtn;
      
         mercBtn=new JButton((new ImageIcon("nike1.jpg")));
         mercBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[2]=mercBtn;
      
         tiempoBtn=new JButton((new ImageIcon("nike1.jpg")));
         tiempoBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[3]=tiempoBtn;
      
         aceBtn=new JButton((new ImageIcon("adidas1.jpg")));
         aceBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[4]=aceBtn;
      
         xBtn=new JButton((new ImageIcon("adidas1.jpg")));
         xBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[5]=xBtn;
      
         nemezBtn=new JButton((new ImageIcon("adidas1.jpg")));
         nemezBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[6]=nemezBtn;
      
         powBtn=new JButton((new ImageIcon("puma1.jpg")));
         powBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[7]=powBtn;
      
         speedBtn=new JButton((new ImageIcon("puma1.jpg")));
         speedBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 10,0));
         array[8]=speedBtn;     
      
      
         return(array);
      } 
    
   }