/*Programmer: Santiago Aguilar
Program Description: Creates an array of Shoe Objects to be used in List class
Date Created: 01/08/18
Date Revised : 01/23/18*/

import java.io.*;
import java.util.*;
import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class CreateObjArray {

   Shoe[] array;//creates show array
   Shoe magista,hypervenom,mercurial,tiempo,ace,x,nemeziz,copa,power,speed;//creates shoe objects
	
   public CreateObjArray(Shoe[] arrayIn)
   {
      array=arrayIn;//sets array as the array passed through
   }
 
   public Shoe[] fillObjArray()//same code for every object, just different index and specific info
   {
      ImageIcon mag1= new ImageIcon("mag1.jpg");//creates imageIcon variables
      ImageIcon mag2= new ImageIcon("mag2.jpg");   
      ImageIcon mag3= new ImageIcon("mag3.jpg");
      ImageIcon mag1B= new ImageIcon("mag1B.jpg");//creates imageIcon variables
      ImageIcon mag2B= new ImageIcon("mag2B.jpg");   
      ImageIcon mag3B= new ImageIcon("mag3B.jpg");
      ImageIcon mag1S= new ImageIcon("mag1S.jpg");//creates imageIcon variables
      ImageIcon mag2S= new ImageIcon("mag2S.jpg");   
      ImageIcon mag3S= new ImageIcon("mag3S.jpg");   
      
      ImageIcon[] magArr={mag1,mag2,mag3,mag1B,mag2B,mag3B,mag1S,mag2S,mag3S}; //  makes an array out of those variables
      Nike magista = new Nike( "NIKE MAGISTA OBRA II FG","Nike", magArr, 249.97, "0", 101);//passes name, brand, Icon array, price, initial size, and product number
      array[0]=magista;	  	//sets object to element at index
      
      ImageIcon hyp1= new ImageIcon("hyp1.jpg");
      ImageIcon hyp2= new ImageIcon("hyp2.jpg");   
      ImageIcon hyp3= new ImageIcon("hyp3.jpg");
      ImageIcon hyp1B= new ImageIcon("hyp1B.jpg");//creates ihypeIcon variables
      ImageIcon hyp2B= new ImageIcon("hyp2B.jpg");   
      ImageIcon hyp3B= new ImageIcon("hyp3B.jpg");
      ImageIcon hyp1S= new ImageIcon("hyp1S.jpg");//creates ihypeIcon variables
      ImageIcon hyp2S= new ImageIcon("hyp2S.jpg");   
      ImageIcon hyp3S= new ImageIcon("hyp3S.jpg");

      ImageIcon[] hypArr={hyp1,hyp2,hyp3,hyp1B,hyp2B,hyp3B,hyp1S,hyp2S,hyp3S};   
      Nike hypervenom = new Nike( "NIKE HYPERVENOM PHANTOM 3 DF FG","Nike", hypArr, 229.97, "0", 102);
      array[1]=hypervenom;
      
      ImageIcon merc1= new ImageIcon("merc1.jpg");
      ImageIcon merc2= new ImageIcon("merc2.jpg");   
      ImageIcon merc3= new ImageIcon("merc3.jpg");
      ImageIcon merc1B= new ImageIcon("merc1B.jpg");//creates imerceIcon variables
      ImageIcon merc2B= new ImageIcon("merc2B.jpg");   
      ImageIcon merc3B= new ImageIcon("merc3B.jpg");
      ImageIcon merc1S= new ImageIcon("merc1S.jpg");//creates imerceIcon variables
      ImageIcon merc2S= new ImageIcon("merc2S.jpg");   
      ImageIcon merc3S= new ImageIcon("merc3S.jpg");

      ImageIcon[] mercArr={merc1,merc2,merc3,merc1B,merc2B,merc3B,merc1S,merc2S,merc3S};   
      Nike mercurial = new Nike( "NIKE MERCURIAL SUPERFLY V FG","Nike", mercArr, 279.97, "0", 103);
      array[2]=mercurial;
      
      ImageIcon tiem1= new ImageIcon("tiem1.jpg");
      ImageIcon tiem2= new ImageIcon("tiem2.jpg");   
      ImageIcon tiem3= new ImageIcon("tiem3.jpg");
      ImageIcon tiem1B= new ImageIcon("tiem1B.jpg");//creates itiemeIcon variables
      ImageIcon tiem2B= new ImageIcon("tiem2B.jpg");   
      ImageIcon tiem3B= new ImageIcon("tiem3B.jpg");
      ImageIcon tiem1S= new ImageIcon("tiem1S.jpg");//creates itiemeIcon variables
      ImageIcon tiem2S= new ImageIcon("tiem2S.jpg");   
      ImageIcon tiem3S= new ImageIcon("tiem3S.jpg");

      ImageIcon[] tiemArr={tiem1,tiem2,tiem3,tiem1B,tiem2B,tiem3B,tiem1S,tiem2S,tiem3S};   

      Nike tiempo = new Nike( "NIKE TIEMPO LEGEND VII FG","Nike", tiemArr, 199.97, "0", 104);
      array[3]=tiempo;
      
      ImageIcon ace1= new ImageIcon("ace1.jpg");
      ImageIcon ace2= new ImageIcon("ace2.jpg");   
      ImageIcon ace3= new ImageIcon("ace3.jpg");
      ImageIcon ace1B= new ImageIcon("ace1B.jpg");//creates iaceeIcon variables
      ImageIcon ace2B= new ImageIcon("ace2B.jpg");   
      ImageIcon ace3B= new ImageIcon("ace3B.jpg");
      ImageIcon ace1S= new ImageIcon("ace1S.jpg");//creates iaceeIcon variables
      ImageIcon ace2S= new ImageIcon("ace2S.jpg");   
      ImageIcon ace3S= new ImageIcon("ace3S.jpg");

      ImageIcon[] aceArr={ace1,ace2,ace3,ace1B,ace2B,ace3B,ace1S,ace2S,ace3S};   

      Adidas ace = new Adidas( "ACE 17+ PURECONTROL FG","Adidas", aceArr, 199.99, "0", 105);
      array[4]=ace;
   
      ImageIcon x1= new ImageIcon("x1.jpg");
      ImageIcon x2= new ImageIcon("x2.jpg");   
      ImageIcon x3= new ImageIcon("x3.jpg");
      ImageIcon x1B= new ImageIcon("x1B.jpg");//creates ixeIcon variables
      ImageIcon x2B= new ImageIcon("x2B.jpg");   
      ImageIcon x3B= new ImageIcon("x3B.jpg");
      ImageIcon x1S= new ImageIcon("x1S.jpg");//creates ixeIcon variables
      ImageIcon x2S= new ImageIcon("x2S.jpg");   
      ImageIcon x3S= new ImageIcon("x3S.jpg");

      ImageIcon[] xArr={x1,x2,x3,x1B,x2B,x3B,x1S,x2S,x3S};   

      Adidas x = new Adidas( "X 17+ PURESPEED FG","Adidas", xArr, 259.99, "0", 106);
      array[5]=x;
   
      ImageIcon nemez1= new ImageIcon("nemez1.jpg");
      ImageIcon nemez2= new ImageIcon("nemez2.jpg");   
      ImageIcon nemez3= new ImageIcon("nemez3.jpg");
      ImageIcon nemez1B= new ImageIcon("nemez1B.jpg");//creates inemezeIcon variables
      ImageIcon nemez2B= new ImageIcon("nemez2B.jpg");   
      ImageIcon nemez3B= new ImageIcon("nemez3B.jpg");
      ImageIcon nemez1S= new ImageIcon("nemez1S.jpg");//creates inemezeIcon variables
      ImageIcon nemez2S= new ImageIcon("nemez2S.jpg");   
      ImageIcon nemez3S= new ImageIcon("nemez3S.jpg");

      ImageIcon[] nemezArr={nemez1,nemez2,nemez3,nemez1B,nemez2B,nemez3B,nemez1S,nemez2S,nemez3S};   

      Adidas nemeziz = new Adidas( "NEMEZIZ 17+ 360 AGILITY FG","Adidas", nemezArr, 299.99, "0", 107);
      array[6]=nemeziz;
   	
      ImageIcon copa1= new ImageIcon("copa1.jpg");
      ImageIcon copa2= new ImageIcon("copa2.jpg");   
      ImageIcon copa3= new ImageIcon("copa3.jpg");
      ImageIcon copa1B= new ImageIcon("copa1B.jpg");//creates icopaeIcon variables
      ImageIcon copa2B= new ImageIcon("copa2B.jpg");   
      ImageIcon copa3B= new ImageIcon("copa3B.jpg");
      ImageIcon copa1S= new ImageIcon("copa1S.jpg");//creates icopaeIcon variables
      ImageIcon copa2S= new ImageIcon("copa2S.jpg");   
      ImageIcon copa3S= new ImageIcon("copa3S.jpg");

      ImageIcon[] copaArr={copa1,copa2,copa3,copa1B,copa2B,copa3B,copa1S,copa2S,copa3S};   

      Adidas copa = new Adidas( "COPA 17.1 FG","Adidas", copaArr, 179.99, "0", 108);
      array[7]=copa;
   
   
      ImageIcon pow1= new ImageIcon("pow1.jpg");
      ImageIcon pow2= new ImageIcon("pow2.jpg");   
      ImageIcon pow3= new ImageIcon("pow3.jpg");
      ImageIcon pow1B= new ImageIcon("pow1B.jpg");//creates ipoweIcon variables
      ImageIcon pow2B= new ImageIcon("pow2B.jpg");   
      ImageIcon pow3B= new ImageIcon("pow3B.jpg");
      ImageIcon pow1S= new ImageIcon("pow1S.jpg");//creates ipoweIcon variables
      ImageIcon pow2S= new ImageIcon("pow2S.jpg");   
      ImageIcon pow3S= new ImageIcon("pow3S.jpg");

      ImageIcon[] powArr={pow1,pow2,pow3,pow1B,pow2B,pow3B,pow1S,pow2S,pow3S};   

      Puma power = new Puma( "EVOPOWER VIGOR 1 GRAPHIC FG","Puma", powArr, 199.98, "0", 109);
      array[8]=power;
   
      ImageIcon speed1= new ImageIcon("speed1.jpg");
      ImageIcon speed2= new ImageIcon("speed2.jpg");   
      ImageIcon speed3= new ImageIcon("speed3.jpg");
      ImageIcon speed1B= new ImageIcon("speed1B.jpg");//creates ispeedeIcon variables
      ImageIcon speed2B= new ImageIcon("speed2B.jpg");   
      ImageIcon speed3B= new ImageIcon("speed3B.jpg");
      ImageIcon speed1S= new ImageIcon("speed1S.jpg");//creates ispeedeIcon variables
      ImageIcon speed2S= new ImageIcon("speed2S.jpg");   
      ImageIcon speed3S= new ImageIcon("speed3S.jpg");

      ImageIcon[] speedArr={speed1,speed2,speed3,speed1B,speed2B,speed3B,speed1S,speed2S,speed3S};   

      Puma speed = new Puma( "PUMA evoSPEED SL II FG","Puma", speedArr, 149.99,"0", 110);
      array[9]=speed;     
   
   
      return(array);//returns filled array
   } 
 
}