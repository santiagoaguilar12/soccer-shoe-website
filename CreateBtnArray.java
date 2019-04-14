/*Programmer: Santiago Aguilar
Program Description: Creates an array of buttons to be used in List class
Date Created: 01/08/18
Date Revised : 01/23/18*/


import java.io.*;
import java.util.*;
import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class CreateBtnArray 
{

   JButton[] array;//creates array of buttons
   JButton magBtn,hyperBtn,mercBtn,tiempoBtn,aceBtn,xBtn,nemezBtn, copaBtn,powBtn,speedBtn;//creates buttons for each shoe

   public CreateBtnArray(JButton[] arrayIn)
   {
      array=arrayIn;//accepts button array and sets it to array
   }

   public JButton[] fillBtnArray()
   {
      //same code for all buttons, just different images and text
      magBtn=new JButton("NIKE MAGISTA OBRA II FG",new ImageIcon("images/mag1.jpg"));//creates button with text and icon
      magBtn.setVerticalTextPosition(SwingConstants.BOTTOM);//sets text position
      magBtn.setHorizontalTextPosition(SwingConstants.CENTER);   
      magBtn.setBackground(new Color(246, 246, 246));   //sets background color
      magBtn.setActionCommand("magista");//sets name of action   
      array[0]=magBtn;		//adds to array at index 0
   
   
      hyperBtn=new JButton("NIKE HYPERVENOM PHANTOM 3 DF FG",(new ImageIcon("images/hyp1.jpg")));
      hyperBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      hyperBtn.setHorizontalTextPosition(SwingConstants.CENTER);   
      hyperBtn.setActionCommand("hypervenom");
      hyperBtn.setBackground(new Color(246, 246, 246));
      array[1]=hyperBtn;
   
      mercBtn=new JButton("NIKE MERCURIAL SUPERFLY V FG",(new ImageIcon("images/merc1.jpg")));
      mercBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      mercBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      mercBtn.setBackground(new Color(246, 246, 246));
      mercBtn.setActionCommand("mercurial");   
      array[2]=mercBtn;
   
      tiempoBtn=new JButton("NIKE TIEMPO LEGEND VII FG",(new ImageIcon("images/tiem1.jpg")));
      tiempoBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      tiempoBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      tiempoBtn.setActionCommand("tiempo");
      tiempoBtn.setBackground(Color.white);
      tiempoBtn.setBackground(new Color(246, 246, 246));
      array[3]=tiempoBtn;
   
      aceBtn=new JButton("ACE 17+ PURECONTROL FG",(new ImageIcon("images/ace1.jpg")));
      aceBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      aceBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      aceBtn.setBackground(new Color(236, 237, 239));
      aceBtn.setActionCommand("ace");
      array[4]=aceBtn;
   
      xBtn=new JButton("X 17+ PURESPEED FG",(new ImageIcon("images/x1.jpg")));
      xBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      xBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      xBtn.setBackground(new Color(236, 237, 239));
      xBtn.setActionCommand("x");
      array[5]=xBtn;
   
      nemezBtn=new JButton("NEMEZIZ 17+ 360 AGILITY FG",(new ImageIcon("images/nemez1.jpg")));
      nemezBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      nemezBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      nemezBtn.setBackground(new Color(236, 237, 239));
      nemezBtn.setActionCommand("nemeziz");
      array[6]=nemezBtn;
   	
      copaBtn=new JButton("COPA 17.1 FG",(new ImageIcon("images/copa1.jpg")));
      copaBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      copaBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      copaBtn.setBackground(new Color(236, 237, 239));
      copaBtn.setActionCommand("copa");
      array[7]=copaBtn;
   
   
      powBtn=new JButton("EVOPOWER VIGOR 1 GRAPHIC FG",(new ImageIcon("images/pow1.jpg")));
      powBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      powBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      powBtn.setActionCommand("power");
      powBtn.setBackground(new Color(236, 237, 239));
      array[8]=powBtn;
   
      speedBtn=new JButton("PUMA evoSPEED SL II FG",(new ImageIcon("images/speed1.jpg")));
      speedBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
      speedBtn.setHorizontalTextPosition(SwingConstants.CENTER);
      speedBtn.setBackground(new Color(236, 237, 239));
      speedBtn.setActionCommand("speed");  
      array[9]=speedBtn;     
   
   
      return(array);
   } 

}