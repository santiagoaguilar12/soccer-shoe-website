/*Programmer: Santiago Aguilar
Program Description: Allows a user to enter information in order to buy a cleat. Program will end, or go back to home page
Date Created: 01/08/18
Date Revised : 01/23/18*/

import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class Checkout implements ActionListener
{
   JFrame frame;//declares variables of different types for each button, label, textfield, scrollpane, menu, menubar, menuitem,or frame
   JPanel contentPane,logoPane,brandPane,summaryPane,textPane,confirmPane, fieldFlowPane, fieldBoxPane;
   JButton nike,adidas,puma,all, submit, finalBtn;
   public Shoe cleat;
   String name,brand,size;
   int itemNum;
   double price,total;
   JTextField nameTXT, addressTXT, cardTXT, emailTXT;
   JScrollPane paneScr;
   JMenuBar menuBar;
   JMenu menu;
   JMenuItem back,home;
   boolean nameSet,addressSet,emailSet,cardSet;

 
   JLabel logo,namePrompt,addrPrompt,cardPrompt,infoPrompt,emailPrompt, regPic, titleLab, itemLab,nameLab,sizeLab,priceLab,totalLab, finalLab;
   public static int choice;

   public Checkout(Shoe item)//calls shoe item from last class
   {
      cleat=item;//assigns item to cleat
      frame = new JFrame("Santi's Soccer Store");//creates frame with text
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);
   
      
             
      Font buttonFont = new Font("Monospaced", Font.BOLD, 20);//creates two types of fonts
      Font titleFont = new Font("Monospaced", Font.BOLD, 40);
      
      //creates a back and a home button in menu
   
      menuBar=new JMenuBar();
      frame.setJMenuBar(menuBar);
      menu=new JMenu("Go To");
      menuBar.add(menu);
      back = new JMenuItem("Back");
      back.setActionCommand("back");
      back.addActionListener(this);
      
      menu.add(back);
      home = new JMenuItem("Home");
      home.setActionCommand("home");
      home.addActionListener(this);      
      menu.add(home);
   
   
   	
      contentPane = new JPanel();//sets main content pane
      contentPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));//sets layout
      contentPane.setBackground(new Color(224, 224, 224));//sets colour
      
      	
      textPane = new JPanel();//sets panel for text info
      textPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      textPane.setLayout(new BoxLayout(textPane, BoxLayout.PAGE_AXIS));//sets layout
      textPane.setBackground(new Color(224, 224, 224));
   
   	
      logoPane = new JPanel();//sets panel for logo
      logoPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      //logoPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));//sets layout
      logoPane.setBackground(new Color(224, 224, 224));
      
      confirmPane = new JPanel();//sets panel for picture and text
      confirmPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      confirmPane.setLayout(new FlowLayout(FlowLayout.LEFT));//sets layout
      confirmPane.setBackground(new Color(224, 224, 224));
      
      fieldFlowPane = new JPanel();//pane for fields with flow layout
      fieldFlowPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      fieldFlowPane.setLayout(new FlowLayout(FlowLayout.LEFT));
      fieldFlowPane.setBackground(new Color(224, 224, 224));
      
      fieldBoxPane = new JPanel();//pane for fields with box layout
      fieldBoxPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      fieldBoxPane.setLayout(new BoxLayout(fieldBoxPane, BoxLayout.PAGE_AXIS));//sets layout
      fieldBoxPane.setBackground(new Color(224, 224, 224));   
   
     
      logo = new JLabel(new ImageIcon("images/background1.jpg"));//creates new label with a logo of soccer field
      logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aligns to center
      logo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      logoPane.add(logo);//adds logo to logo pane
      contentPane.add(logoPane);//adds logoPane to contentPane
      
      summaryPane = new JPanel();//adds Pane with picture, text info and information textfields
      summaryPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      summaryPane.setLayout(new BoxLayout(summaryPane, BoxLayout.PAGE_AXIS));//sets layout
      summaryPane.setBackground(new Color(224, 224, 224));
   
      //centred label with directions and title font
      titleLab=new JLabel("Please Confirm Your Order and Enter Your Payment:");
      titleLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      titleLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      titleLab.setFont(titleFont);
      contentPane.add(titleLab);
      
      //centred label with thank you message. hidden until info is submitted
      finalLab=new JLabel("Thank You For Shopping At Santi's Soccer Store");
      finalLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      finalLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      finalLab.setFont(titleFont);
      contentPane.add(finalLab);
      finalLab.setVisible(false);
      
       //centred button with option to conitune shopping. hidden until info is submitted
      finalBtn=new JButton("Continue Shopping");
      finalBtn.setActionCommand("continue");
      finalBtn.addActionListener(this);
      finalBtn.setAlignmentX(JButton.CENTER_ALIGNMENT);//aliigns to center
      finalBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      finalBtn.setFont(buttonFont);
      contentPane.add(finalBtn);
      finalBtn.setVisible(false);//hides for now
   
   
      
      NumberFormat money = NumberFormat.getCurrencyInstance();//import number format to use for currency 
   
      //uses accessor methods to get produt name, brand, item number, price and size
      name=cleat.getName();
      brand=cleat.getBrand();
      itemNum=cleat.getItem();
      price=cleat.getPrice();
      total=price*1.13;//finds price with tax
      size=cleat.getSize();
   
      regPic=new JLabel(cleat.getPic(6));//adds Jlebel with pic from Icon array
      regPic.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      confirmPane.add(regPic);//adds pic to content pane
   
      sizeLab=new JLabel("Size: "+size);//creates label with size info
      sizeLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      sizeLab.setFont(buttonFont);
      textPane.add(sizeLab);//adds label to text pane
   
   
      nameLab=new JLabel("Product Name: "+name);///adds Jlabel with name info
      nameLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      nameLab.setFont(buttonFont);
      textPane.add(nameLab);//adds label to content pane
      
      itemLab=new JLabel("Product Number: "+Integer.toString(itemNum));//adds Jlabel with prod. num info
      itemLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      itemLab.setFont(buttonFont);
      textPane.add(itemLab);//adds label to text pane
   
      priceLab=new JLabel("Subtotal: "+money.format(price));//adds Jlabel with price info
      priceLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      priceLab.setFont(buttonFont);
      textPane.add(priceLab);//adds price to text pane
      
      totalLab=new JLabel("Total: "+money.format(total));//adds Jlabel with total with tax info
      totalLab.setFont(buttonFont);
      totalLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      textPane.add(totalLab);//adds total to text pane
      	
      confirmPane.add(textPane);//adds textPane to confirm pane and confirm pane to summary pane
      summaryPane.add(confirmPane);
   
      infoPrompt=new JLabel("Now Enter Your Name, Address and Credit Card Information:");//creates prompt for textfields
      infoPrompt.setFont(buttonFont);
      infoPrompt.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      fieldBoxPane.add(infoPrompt);//adds to box pane
      
            //Create and add a prompt and then a text field
      namePrompt = new JLabel("Enter Your Full Name: ");
      namePrompt.setFont(buttonFont);
      fieldBoxPane.add(namePrompt);
      nameTXT = new JTextField(10);
      nameTXT.setActionCommand("name");
      nameTXT.addActionListener(this);
   
      fieldBoxPane.add(nameTXT);      
      //Create and add a second prompt and then a text field
      addrPrompt = new JLabel("Enter Your Shipping Address: ");
      addrPrompt.setFont(buttonFont);   
      fieldBoxPane.add(addrPrompt);
      addressTXT = new JTextField(10);
      addressTXT.addActionListener(this);
      addressTXT.setActionCommand("address");  
      fieldBoxPane.add(addressTXT);  
        
       //Create and add a third prompt and then a text field
      emailPrompt = new JLabel("Enter Your Email Address: ");
      emailPrompt.setFont(buttonFont);
      fieldBoxPane.add(emailPrompt);
      emailTXT = new JTextField(10);
      emailTXT.addActionListener(this);
      emailTXT.setActionCommand("email");
      fieldBoxPane.add(emailTXT);    
        
       //Create and add a fourth prompt and then a text field      
      cardPrompt = new JLabel("Enter Your Credit Card Number: ");
      cardPrompt.setFont(buttonFont);
      fieldBoxPane.add(cardPrompt);      
      cardTXT = new JTextField(10);
      cardTXT.addActionListener(this);
      cardTXT.setActionCommand("card");
      fieldBoxPane.add(cardTXT);
      
      //creates subit button with font, color
      submit = new JButton("Submit Information");//new button with text 
      submit.setActionCommand("submit");
      submit.setFont(buttonFont);   
      submit.setBackground(Color.white);
      submit.addActionListener(this);//adds listener to check when button is clicked
      fieldBoxPane.add(submit);//adds button to content pane
      //add box pane to flow pane and flow pane to summaryPane
      fieldFlowPane.add(fieldBoxPane);
      summaryPane.add(fieldFlowPane);
   
      paneScr=new JScrollPane(summaryPane);//adds summaryPane to scrollPane
   	
   
      contentPane.add(paneScr);//adds paneScr to content pane and then sets content Pane
      frame.setContentPane(contentPane);
      
      
   	  
                
   //display the frame
      frame.setVisible(true);
   
   
   }

//Handle a button and textfield entry
//Pre: none
//Post: the information has been submitted and the final page is shown, or the home page is shown
   public void actionPerformed(ActionEvent event)
   {
      String eventName = event.getActionCommand();//converrs actionCommand to a string     
      //if information has been entered to all textfields and submit is pressed or card is pressed twice
      if((eventName.equals("submit")&&nameSet==true&&emailSet==true&&addressSet==true&&cardSet==true)||(eventName.equals("card")&&nameSet==true&&emailSet==true&&addressSet==true&&cardSet==true))//eventName.equals("card")&&nameSet==true&&emailSet==true&&addressSet==true&&cardSet==true)
      {
         titleLab.setVisible(false);//hide labels and panels
         summaryPane.setVisible(false);
         finalLab.setVisible(true);  //show final lab and button
         finalBtn.setVisible(true); 
       
      }
      
      else if(eventName.equals("submit"))//if not all information has been entered
      {
         submit.setText("Please Enter Information and Submit");//changes text to instructions
      }
      
      else if (eventName.equals("name"))
      {
         String namePrint=nameTXT.getText();
         if(namePrint!="")//checks if textbox is empty
         {
            nameSet=true;
            addressTXT.requestFocus();//moves text cursor to next textfield
         }        
      
      }
      else if (eventName.equals("address"))
      {
         String addressPrint=addressTXT.getText();
         if(addressPrint!="")//checks if textbox is empty
         
         {
            addressSet=true;
            emailTXT.requestFocus();//moves text cursor to next textfield
         
         
         }
         
      
      }
      else if (eventName.equals("email"))
      {
         String emailPrint=emailTXT.getText();
         if(emailPrint!="")//checks if textbox is empty
         
         {
            emailSet=true;
            cardTXT.requestFocus();//moves text cursor to next textfield
         
         }
         
      
      }
      else if (eventName.equals("card"))
      {
         String cardPrint=cardTXT.getText();
         if(cardPrint!="")//checks if textbox is empty
         
         {
            cardSet=true;
         }
         
      
      }
      
      else if(eventName.equals("back"))
      {
         Details start= new Details(cleat);//returns to last page
      }
      else if(eventName.equals("home")||eventName.equals("continue"))
      {
         Store start= new Store();//returns to home page
      }
   
   
   }
	
   private static void runGUI()
   {
      try 
      {
         JFrame.setDefaultLookAndFeelDecorated(false);
      	//creates default shoe object in order to allow actual shoe object to be passed
      
         ImageIcon tiem1= new ImageIcon("images/tiem1.jpg");
         ImageIcon tiem2= new ImageIcon("images/tiem2.jpg");   
         ImageIcon tiem3= new ImageIcon("images/tiem3.jpg");
         ImageIcon tiem1B= new ImageIcon("images/tiem1B.jpg");//creates itiemeIcon variables
         ImageIcon tiem2B= new ImageIcon("images/tiem2B.jpg");   
         ImageIcon tiem3B= new ImageIcon("images/tiem3B.jpg");
         ImageIcon tiem1S= new ImageIcon("images/tiem1S.jpg");//creates itiemeIcon variables
         ImageIcon tiem2S= new ImageIcon("images/tiem2S.jpg");   
         ImageIcon tiem3S= new ImageIcon("images/tiem3S.jpg");
      
         ImageIcon[] tiemArr={tiem1,tiem2,tiem3,tiem1B,tiem2B,tiem3B,tiem1S,tiem2S,tiem3S};   
      
      
         Nike empty =new Nike( "NIKE TIEMPO LEGEND VII FG","Nike", tiemArr, 199.97, "0", 104);
         if(Store.homeStarted()==true)
         {
         Checkout start  = new Checkout(empty);   
          }
          else
         {
            Store start = new Store();
         
         }
   					
      } 
      catch (Exception e)
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
                  runGUI();
               }
            });
   }
}