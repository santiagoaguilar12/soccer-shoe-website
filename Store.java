/*Programmer: Santiago Aguilar
Program Description: Allows a user to select a brand of cleats and sends them to the list of cleats that corresponds
Date Created: 01/08/18
Date Revised : 01/23/18*/


import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Store implements ActionListener
{
   JFrame frame;//declares variables of different types for each button, labe,or frame
   JPanel contentPane,logoPane,brandPane;
   JButton nike,adidas,puma,all;
   JMenuBar menuBar;//creates menu bar, menu and menu items
   JMenu menu;
   JMenuItem back,home;
   JLabel logo,introLab;
   public static int choice;//makes int choice available to all methods
   public static boolean homeStart;

   public Store()
   {
      homeStart=true;
      frame = new JFrame("Santi's Soccer Store");//creates frame with text
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);//makes Jframe maximium size
      
      Font buttonFont = new Font("Monospaced", Font.BOLD, 20);//creates two different types of fonts to be used
      Font titleFont = new Font("Monospaced", Font.BOLD, 40);
      
      
   	menuBar=new JMenuBar();//creates empty menu bar
      frame.setJMenuBar(menuBar);
      menu=new JMenu("Go To");//creates a menu withname'Go To'
      menuBar.add(menu);//adds menu to menuBar
      back = new JMenuItem("Back");
      back.setActionCommand("back");//creates a menu item called 'back'
      back.addActionListener(this);
      
      menu.add(back);
      home = new JMenuItem("Home");//creates a menu item called 'home'
      home.setActionCommand("home");
      home.addActionListener(this);
      
      menu.add(home);   
   
      contentPane = new JPanel();//creates content pane
      contentPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));//sets layout
      contentPane.setBackground(new Color(224, 224, 224));
   	
      logoPane = new JPanel();//creates a panel for the logo
      logoPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      logoPane.setLayout(new BoxLayout(logoPane, BoxLayout.PAGE_AXIS));//sets layout
      logoPane.setBackground(new Color(224, 224, 224));//sets to a specific colur that was chosen      
      
   
      brandPane = new JPanel();//creates a panel for the brand Choices
      brandPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      brandPane.setLayout(new GridLayout(0,4, 10, 5)); ///sets layout  
      brandPane.setBackground(new Color(224, 224, 224));//sets colour
   
      logo = new JLabel(new ImageIcon("images/background2.jpg"));//creates new label with an image of soccer field
      logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      logo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      logoPane.add(logo);//adds logo to logo pane
      contentPane.add(logoPane);//adds logo pane to contentPane
      
      introLab=new JLabel("Welcome To Santi's Soccer Store");//creates an intro title
      introLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      introLab.setVerticalTextPosition(SwingConstants.TOP);//sets text position on Label
      introLab.setHorizontalTextPosition(SwingConstants.CENTER);   
      introLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      introLab.setFont(titleFont);//sets font
      contentPane.add(introLab);
   
      	
      nike = new JButton("Nike Cleats",new ImageIcon("images/nike1.jpg"));//new nike button with image and text 
      nike.setVerticalTextPosition(SwingConstants.BOTTOM);//sets text position
      nike.setHorizontalTextPosition(SwingConstants.CENTER);
      nike.setFont(buttonFont);//sets font
      nike.setActionCommand("nike");//sets name of action   
      nike.setBackground(Color.white);//sets color
      nike.addActionListener(this);//adds listener to check when button is clicked
      brandPane.add(nike);//adds button to brand pane
   	
      adidas = new JButton("Adidas Cleats",new ImageIcon("images/adidas1.jpg"));//new addias button with image and text 
      adidas.setVerticalTextPosition(SwingConstants.BOTTOM);//sets text position
      adidas.setHorizontalTextPosition(SwingConstants.CENTER);
      adidas.setFont(buttonFont);//sets font   
      adidas.setActionCommand("adidas");   
      adidas.setBackground(Color.white);   
      adidas.addActionListener(this);//adds listener to check when button is clicked
      brandPane.add(adidas);//adds button to brandPane
   	
      puma = new JButton("Puma Cleats",new ImageIcon("images/puma1.jpg"));//new button with text 
      puma.setVerticalTextPosition(SwingConstants.BOTTOM);
      puma.setHorizontalTextPosition(SwingConstants.CENTER);//sets text position
      puma.setFont(buttonFont); //sets font
      puma.setActionCommand("puma");   //sets action name
      puma.setBackground(Color.white);   //sets color
      puma.addActionListener(this);//adds listener to check when button is clicked
      brandPane.add(puma);//adds button to content pane
   	
      all = new JButton("All Cleats",new ImageIcon("images/all1.jpg"));//new button with text 
      all.setVerticalTextPosition(SwingConstants.BOTTOM);//sets text position
      all.setHorizontalTextPosition(SwingConstants.CENTER);
      all.setFont(buttonFont);//sets font  
      all.setActionCommand("all");   
      all.setBackground(Color.white);
      all.addActionListener(this);//adds listener to check when button is clicked
      brandPane.add(all);//adds button to brand pane
      
      
      contentPane.add(brandPane);//adds brandPane to ccontentPane
   
   
   
      frame.setContentPane(contentPane);//sets ContentPane
   	  
                
   //Size and then display the frame
      frame.setVisible(true);
   
   
   }

//Handle a button
//Pre: none
//Post: A button has been selected and Matching list is shown.
   public void actionPerformed(ActionEvent event)
   {
      String eventName = event.getActionCommand();//converts actionCommand to a string     
      frame.setVisible(false); //hides frame
      choice=1;//initializes choice
      if(eventName.equals("nike"))//if nike button is clicked
      {
         choice=1;	//sets choice		
      
         List start= new List();//starts List class
      	
      }
      else if(eventName.equals("adidas"))//if adidas is clicked
      {
         choice=2;//sets choice
      
         List start= new List();//starts class
      }
      if(eventName.equals("puma"))//if uma is clicked
      {
         choice=3;//sets choice number        			
      
         List start= new List();//starts List class
      	
      }
      else if(eventName.equals("all"))//if all cleats is clicked
      {
         choice=4;    //sets choice num   			
      
         List start= new List();//starts List
      	
      }   
      frame.setVisible(false); //hides frame
   
   
   }
	
   //Lets other classes access choice int
//Pre: none
//Post: the int choice has been returned

   public static int getChoice()
   {
      return(choice);//returns int
   }
   
   //Lets other classes access choice int
//Pre: none
//Post: the int choice has been returned

   public static boolean homeStarted()
   {
      return(homeStart);//returns int
   }

   
	
   //Lets other classes set choice int
//Pre: none
//Post: the int choice has been set to a

   public static void setChoice( int a)
   {
      choice=a;
   }
	
   private static void runGUI()
   {
      try 
      {
         JFrame.setDefaultLookAndFeelDecorated(false);
      	
         Store start  = new Store();//runs Store class
      							
      } 
      catch (Exception e)//in case Store can't start
      {
         e.printStackTrace();
      }   
   }

   public static void main(String[] args)
   //Methods that create and show a GUI should be run from
   //an event-dispatching thread.
   {
      javax.swing.SwingUtilities.invokeLater(
            new Runnable()
            {
               public void run()
               {
                  runGUI();//calls runGUI()
               }
            });
   }
}