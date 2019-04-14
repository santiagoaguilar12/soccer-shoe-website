/*Programmer: Santiago Aguilar
Program Description: Allows a user to browse a selection of cleat. Program will proceed to Details page, or back to home page
Date Created: 01/08/17
Date Revised : 01/23/18*/


import javax.swing.*;//imports necessary classes
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Details implements ActionListener
{
   JFrame frame;//declares variables of different types for each button, labe,or frame
   JPanel contentPane,logoPane,detailPane,picPane, infoPane, choicePane;
   public JButton nike,adidas,puma,all,cart,smallPic1,smallPic2,smallPic3;
   JComboBox sizeNames;
   JMenuBar menuBar;
   JMenu menu;
   JMenuItem back,home;

   public Shoe cleat;
   String name,brand;
   boolean sizeChoice=false;

   int itemNum;
   double price;
 
   public JLabel logo, sizeListPrompt, bigPic,checkSize;
   public static int choice;

   public Details(Shoe cleatIN)
   {
      cleat=cleatIN;
   
      frame = new JFrame("Santi's Soccer Store");//creates frame with text
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Font buttonFont = new Font("Monospaced", Font.BOLD, 20);
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
   
   	
      contentPane = new JPanel();//creates main panel
      contentPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));//sets layout
      contentPane.setBackground(new Color(224, 224, 224));
   	
      logoPane = new JPanel();//creates panel for logo
      logoPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      logoPane.setLayout(new BoxLayout(logoPane, BoxLayout.PAGE_AXIS));//sets layout
      logoPane.setBackground(new Color(224, 224, 224));
      
      logo = new JLabel(new ImageIcon("background1.jpg"));//creates new label with a logo
      logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      logo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      logoPane.add(logo);//adds logo to logo pane
      contentPane.add(logoPane);//adds logo pane to contentPane
   	
      detailPane=new JPanel();//creates a panel for details
      detailPane.setLayout(new FlowLayout(FlowLayout.LEFT));//sets flow layout
      detailPane.setBackground(new Color(224, 224, 224));
   	
   	
      picPane = new JPanel();//creates panel for pictures
      picPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      picPane.setLayout(new BoxLayout(picPane, BoxLayout.PAGE_AXIS));//sets layout
      picPane.setBackground(new Color(224, 224, 224));
      
      choicePane = new JPanel();//sets panel for smll picture choices
      choicePane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for 
      choicePane.setAlignmentX(JPanel.CENTER_ALIGNMENT);
      choicePane.setBackground(new Color(224, 224, 224));
   
   	
      infoPane = new JPanel();//creates panel for text info
      infoPane.setAlignmentX(JPanel.CENTER_ALIGNMENT);//aliigns to center   
      infoPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));//sets border for spacing
      infoPane.setLayout(new BoxLayout(infoPane, BoxLayout.PAGE_AXIS));//sets layout
      infoPane.setBackground(new Color(224, 224, 224));
   	
   
      bigPic=new JLabel(cleat.getPic(3));//creates JLabel with first picture in array
      bigPic.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      bigPic.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      picPane.add(bigPic);//adds meme to content pane
      
      smallPic1=new JButton(cleat.getPic(6));//creates JButton with first picture in array
      smallPic1.setActionCommand("one"); //sets action name
      smallPic1.addActionListener(this);//adds listener to check when button is clicked
   
      choicePane.add(smallPic1);//adds meme to content pane
   
      smallPic2=new JButton(cleat.getPic(7));//creates JButton with second picture in array
      smallPic2.setActionCommand("two");   //sets action name
      smallPic2.setBackground(Color.white);   
      smallPic2.addActionListener(this);//adds listener to check when button is clicked   
      choicePane.add(smallPic2);//adds button to content pane
   
      smallPic3=new JButton(cleat.getPic(8));//creates JButton with third picture in array
      smallPic3.setActionCommand("three");   
      smallPic3.setBackground(Color.white);   
      smallPic3.addActionListener(this);//adds listener to check when button is clicked   
      choicePane.add(smallPic3);//adds meme to content pane
   
      picPane.add(choicePane);//ads choice pane to pic pane
      
      contentPane.add(picPane);//adds picPane to content Pane
      
      //gets cleat name, brand, item number, price
      name=cleat.getName();
      brand=cleat.getBrand();
      itemNum=cleat.getItem();
      price=cleat.getPrice();
      
      //creates JLabel with brand text and specific font
      JLabel brandLab=new JLabel(brand);
      brandLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      brandLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      brandLab.setFont(buttonFont);
      infoPane.add(brandLab);//adds brand Label to info pane
   
      //creates JLabel with name text and specific font
      JLabel nameLab=new JLabel(name);
      nameLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      nameLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      nameLab.setFont(titleFont);
      infoPane.add(nameLab);//adds info number to info pane
      
      //creates JLabel with item number text and specific font
      JLabel itemLab=new JLabel(Integer.toString(itemNum));
      itemLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      itemLab.setFont(buttonFont);
      itemLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      infoPane.add(itemLab);//adds info number to info pane
   
        //creates JLabel with price text andspecific font
      JLabel priceLab=new JLabel(Double.toString(price));
      priceLab.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      priceLab.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      priceLab.setFont(titleFont);
      infoPane.add(priceLab);//adds price to info pane
   
      sizeListPrompt = new JLabel("Select a shoe size: ");//creates prompt text to display in a Jlabel      
      sizeListPrompt.setAlignmentX(JLabel.CENTER_ALIGNMENT);
      sizeListPrompt.setFont(buttonFont);      
      infoPane.add(sizeListPrompt);      
      
      //creates an array of size strings and adds it to a JComboBox
      String[] names = {"Select","5","6","7","8","9","10","11","12"};      
      sizeNames = new JComboBox(names);      
      sizeNames.setAlignmentX(JComboBox.CENTER_ALIGNMENT);      
      sizeNames.setSelectedIndex(0);      
      sizeNames.addActionListener(this);      
      infoPane.add(sizeNames);
      
      //creates a label indicating to user to select a shoe size
      checkSize=new JLabel("*Please Enter A Shoe Size" );
      checkSize.setAlignmentX(JLabel.CENTER_ALIGNMENT);//aliigns to center
      checkSize.setBorder(BorderFactory.createEmptyBorder(0, 0, 0,0));//sets border for spacing
      checkSize.setFont(buttonFont);
      infoPane.add(checkSize);//adds label to info pane
      checkSize.setVisible(false);//hides label for now
         
      cart = new JButton("Proceed to Checkout");//new button with text
      cart.setAlignmentX(JLabel.CENTER_ALIGNMENT);   
      cart.setActionCommand("cart");//sets command name
      cart.setFont(buttonFont);
      cart.setBackground(Color.white);
      cart.addActionListener(this);//adds listener to check when button is clicked
      infoPane.add(cart);//adds button to info pane   
      
      //adds picPane and infoPane to detailPane, and adds details Pane to a Scroll Pane with unit increment of 12. then adds scroll pane to content pane
      detailPane.add(picPane);
      detailPane.add(infoPane);      
      JScrollPane paneScr=new JScrollPane(detailPane);
      paneScr.getVerticalScrollBar().setUnitIncrement(12);   	
      contentPane.add(paneScr);   
      frame.setContentPane(contentPane);//sets content pane
   	  
                
   //Size and then display the frame
      frame.setExtendedState(Frame.MAXIMIZED_BOTH);
      frame.setVisible(true);   
   }

//Handle a button and comboBox
//Pre: none
//Post: A shoe size has been selected, an image has been chosen to enlarge or either back page or home page have been started
   public void actionPerformed(ActionEvent event)
   {
      String eventName = event.getActionCommand();//converts actionCommand to a string 
      if(eventName.equals("cart")&&sizeChoice==true)//if cart is clicked and size has been chosen
      {
         Checkout start = new Checkout(cleat);//run checkout class
         frame.setVisible(false);//hide current frame
      
      }
      else if(eventName.equals("cart")&&sizeChoice==false)//if button is clicked but no size has ben chosen
      {
         checkSize.setVisible(true);    //shoes JLabel with instructions  
      }
      
      else if (eventName.equals("one"))//if first small pic is chosen
      {
         Icon newPic=cleat.getPic(3);//uses accessor method to get Image Icon from shoe array
         bigPic.setIcon(newPic);//sets big pic to newPic
      
      }
      else if (eventName.equals("two"))//same as first pic but with second image
      {
         bigPic.setIcon(cleat.getPic(4));
      
      }
      else if (eventName.equals("three"))//same as first pic but with third image
      {
         bigPic.setIcon(cleat.getPic(5));
      
      }
      
      else if(eventName.equals("back"))//sends user back to list of cleats
      {
         List start= new List();
      }
      else if(eventName.equals("home"))//sends user to home page
      {
         Store start= new Store();
      }
      
      
      
      else{
         sizeChoice=true;//confrims that size was chosen
         JComboBox comboBox = (JComboBox)event.getSource();   
         String sizeCho = (String)comboBox.getSelectedItem(); //gets input from combobox
         //sets size to corresponding choice for all shoe sizes
         if(sizeCho.equals("5"))
         {
            cleat.setSize("5");
         
         }
         else if(sizeCho.equals("6"))
         {
            cleat.setSize("6");
         
         }
         else if(sizeCho.equals("7"))
         {
            cleat.setSize("7");
         
         }
         else if(sizeCho.equals("8"))
         {
            cleat.setSize("8");
         
         }
         else if(sizeCho.equals("9"))
         {
            cleat.setSize("9");
         
         }
         else if(sizeCho.equals("9"))
         {
            cleat.setSize("9");
         
         }
         else if(sizeCho.equals("10"))
         {
            cleat.setSize("10");
         
         }
         else if(sizeCho.equals("11"))
         {
            cleat.setSize("11");
         
         }
         else if(sizeCho.equals("12"))
         {
            cleat.setSize("12");
         
         }
      
      }
   
   
   }
	
    	
   private static void runGUI()
   {
      try 
      {
         //creates default shoe object in order to allow actual shoe object to be passed
         JFrame.setDefaultLookAndFeelDecorated(false);
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
      
      
         Nike nothing=new Nike( "NIKE TIEMPO LEGEND VII FG","Nike", tiemArr, 199.97, "0", 104);
         if(Store.homeStarted()==true)
         {
         Details start  = new Details(nothing);//starts detail GUI with 'nothing' object
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