/*Programmer: Santiago Aguilar
Program Description: Acts as a subclass of the Shoe class. Has accessor methods that allow other classes to access certain variabes
Date Created: 01/08/18
Date Revised : 01/23/18*/

import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



public class Nike extends Shoe
{
   String shoeName,brand,size;
   ImageIcon[] pic;
   double price;
   int itemNum;

   public Nike( String n,String b,ImageIcon[] i, double p, String s,int t)//parameters
   {
   
      super(n,b,i,p,s,t);
      pic=i;
      price=p;//assigns value to price and pic
   
   }
	
	//Lets other classes access price
   //Pre: none
   //Post: the price has been returned
	
   public  double getPrice()
   {
      return(price);
   
   }
   
   //Lets other classes access picture at specific index
   //Pre: none
   //Post: the picture at that index has been returned

   public ImageIcon getPic(int x)
   {
      return(pic[x]);
   
   }
   
   
   
   
	
	




}