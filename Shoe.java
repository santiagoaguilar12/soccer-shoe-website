/*Programmer: Santiago Aguilar
Program Description: Acts as a super class of the Nike,adidas, and puma objects
Date Created: 01/08/18
Date Revised : 01/23/18*/

import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



abstract class Shoe
{
   String shoeName,brand,size;
   ImageIcon[] pic;
   double price;
   int itemNum;

   public Shoe( String n,String b,ImageIcon[] i, double p, String s,int t)
   {
      shoeName=n;//assigns values to each variable
      brand=b;
      pic=i;
      price=p;
      size=s;
      itemNum=t;
   
   }
	
   //Lets other classes access shoe name
   //Pre: none
   //Post: the shoe name has been returned

   public String getName()
   {
      return(shoeName);
   
   }
	
   //Lets other classes access brand 
   //Pre: none
   //Post: the brand string has been returned

   public String getBrand()
   {
      return(brand);
   
   }

	//Lets other classes access item number
   //Pre: none
   //Post: the int itemNum has been returned

   public int getItem()
   {
      return(itemNum);
   
   }
   
   public void setSize(String a)
   {
      size=a;
   
   }
   
   //Lets other classes access size
   //Pre: none
   //Post: the size has been returned

   public String getSize()
   {
      return(size);   
   }

   
	
   abstract double getPrice();//declares abstract classes fro subclass
   abstract ImageIcon getPic(int x);
	
	




}