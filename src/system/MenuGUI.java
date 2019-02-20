package system;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuGUI extends JFrame implements ActionListener{
JFrame Menuframe;
JLabel l1, l2, l3, l4, l5, l6;
JButton b1, b2, b3, b4, b5, b6;
JButton StaffLogin, Pastries, Sandwiches, HotDrinks, ColdDrinks, Checkout;

//need to add drop down boxes too

//set up panels that will be on the GUI 

public MenuGUI(){
	JFrame Menuframe = new JFrame("Menu");
	JPanel northPanel = new JPanel();
	JPanel eastPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JPanel westPanel = new JPanel();
	JPanel centerPanel = new JPanel();
	
	
	JMenuBar menuBar = new JMenuBar();
    /*menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.PAGE_AXIS));
    menuBar.add(createMenu("Menu 1"));
    menuBar.add(createMenu("Menu 2"));
    menuBar.add(createMenu("Menu 3")); */
	
	
	
	setNorthPanel();
	setSouthPanel();
	setEastPanel();
	setWestPanel();
	setCenterPanel();
	
	//setMenuBar();
	
	Menuframe.add(northPanel);
	Menuframe.add(southPanel);
	Menuframe.add(eastPanel);
	Menuframe.add(westPanel);
	Menuframe.add(centerPanel);
	Menuframe.setSize(300,300);
	Menuframe.setLocation(300,500);
	
	Menuframe.add(menuBar);
	
	Menuframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

//create the north JPanel that allows a staff member to login
private void setNorthPanel(){
	JPanel northPanel = new JPanel();
	b1 = new JButton("Staff Login");
	//b1.addActionListener(this);
	
	northPanel.add(b1);
	//northPanel.add(StaffLogin);
	
	this.add(northPanel, BorderLayout.NORTH);
	pack();
	}

private void setWestPanel(){
	JPanel westPanel = new JPanel();
	
	
	
	b2 = new JButton("Pastries");
	b3 = new JButton("Sandwiches");
	b4 = new JButton("Hot Drinks");
	b5 = new JButton("Cold Drinks");
	
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
	westPanel.add(b2);
	//westPanel.add(Pastries);
	
	westPanel.add(b3);
	//westPanel.add(Sandwiches);
	
	westPanel.add(b4);
	//westPanel.add(HotDrinks);
	
	westPanel.add(b5);
	//westPanel.add(ColdDrinks);
	
	this.add(westPanel, BorderLayout.WEST);
	
	pack();
	}


private void setSouthPanel(){
	JPanel southPanel = new JPanel();
	b6 = new JButton("Checkout");
	b6.addActionListener(this);
	
	southPanel.add(b6);
	//southPanel.add(Checkout);
	
	this.add(southPanel, BorderLayout.SOUTH);
	
	pack();
}

private void setEastPanel(){
	JPanel eastPanel = new JPanel();
	
	this.add(eastPanel, BorderLayout.EAST);
	
	pack();
}

private void setCenterPanel(){
	JPanel centerPanel = new JPanel();
	
	this.add(centerPanel, BorderLayout.CENTER);
	
	pack();
}


/*private void setMenuBar() {
	 JMenuBar menuBar = new JMenuBar();
	 
     menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.PAGE_AXIS));
     
     menuBar.add(createMenu("Pastries"));
     menuBar.add(createMenu("Sandwiches"));
     menuBar.add(createMenu("HotDrinks"));
     menuBar.add(createMenu("ColdDrinks"));
     
     //the tutorial I looked at had a return, should be void or not?
     //return menuBar;
}

public JMenu createMenu(String title){
	JMenu m = new HorizontalMenu(title);
	m.add("muffin");
	m.add("bagel");
	m.add("tray bake");
	m.add("croissant");
	m.add("brownie");
	m.add("strawberry tart");
	m.add("fruit tart");
	m.add("cinnamon roll");
	
	return m;
	}

public JMenu createMenu2(String title){
	JMenu m2 = new HorizontalMenu(title);
	m2.add("cheese");
	m2.add("ham");
	m2.add("ham and cheese");
	m2.add("BLT");
	m2.add("chicken mayo");
	m2.add("prawn mayo");
	
	return m2;
	}

public JMenu createMenu3(String title){
	JMenu m3 = new HorizontalMenu(title);
	m3.add("espresso");
	m3.add("Macchiato");
	m3.add("Latte");
	m3.add("Cappuccino");
	m3.add("Americano");
	m3.add("Mocha");
	m3.add("tea");
	m3.add("flavoured tea");
	m3.add("hot chocolate");
	
	return m3;
	}

public JMenu createMenu4(String title){
	JMenu m4 = new HorizontalMenu(title);
	m4.add("juics");
	m4.add("smoothie");
	m4.add("bottled water");
	m4.add("lemonade");
	m4.add("coca cola");
	m4.add("fanta");
	m4.add("diet coke");
	
	return m4;
	}


//create HorizontalMenu class
class HorizontalMenu extends JMenu {
	HorizontalMenu(String label) {
		super(label);
		JPopupMenu pm = getPopupMenu();
		pm.setLayout(new BoxLayout(pm, BoxLayout.LINE_AXIS));
}
}
	
	//set popup menu visible*/
	
	

//methods describing what happens when each button is pressed



	
	
	public static void main (String [] args) {
		MenuGUI gui = new MenuGUI();
		Menu menu = new Menu();
		String filename = "menuItem.csv";
				menu.readFile(filename);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}




}











/*private void buildMenus() {
	 JMenuBar menuBar=new JMenuBar();
	  
	 JMenu menu=new JMenu("Menu");
	  
	 JMenu fileMenu=new JMenu("Pastries");
	 fileMenu.setBackground(Color.RED);
	  
	 JMenu editMenu=new JMenu("Sandwiches");
	 editMenu.setBackground(Color.GREEN);
	  
	 JMenu viewMenu=new JMenu("Hot Drinks");
	 viewMenu.setBackground(Color.BLUE);
	 
	 JMenu viewMenu=new JMenu("Cold Drinks");
	 viewMenu.setBackground(Color.BLUE);
	  
	 menu.add(fileMenu);
	 menu.addSeparator();
	 menu.add(editMenu);
	 menu.addSeparator();
	 menu.add(viewMenu);
	  
	 menuBar.add(menu);
	  
	  
	 setJMenuBar(menuBar);
	 }*/































/*package system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class MenuGUI extends JFrame implements ActionListener, ItemListener{
	public static void main(String[] args) {
		Menu menu = new Menu();
		// declares file path if file is located in diff location not in the same folder
		String filename = "menuItems.csv";
		// reads items from file 
		menu.readFile(filename);
		
		//MenuGUI component
		//create menubar
		private JMenuBar createMenuBar() {
			
			
		}
		private JMenu menu, submenu;
		private JMenuItem munuItem;
		
		//create the MenuFrame
		private JFrame Menuframe = new JFrame();
		
		//create the JPanels
		private JPanel titlePanel = new JPanel();
		private JPanel centrePanel = new JPanel();
		private JPanel northPanel = new JPanel();
		private JPanel eastPanel = new JPanel();
		private JPanel westPanel = new JPanel();
		private JPanel southPanel = new JPanel();
		
		
		
		//create the JLabels
		private JLabel label1 = new JLabel("Staff Login", JLabel.NORTH_EAST);
		//private JLabel label2 = new JLabel("Menu", JLabel.TOP);
		private JLabel label3 = new JLabel("Hot Drinks", JLabel.LEFT);
		private JLabel label4 = new JLabel("Cold Drinks", JLabel.LEFT);
		private JLabel label5 = new JLabel("Pastries", JLabel.LEFT);
		private JLabel label6 = new JLabel("Sandwiches", JLabel.LEFT);
		
		private JLabel title = new JLabel();
		
		private JLabel label7 = new JLabel("Checkout", JLabel.SOUTH);
		
		
		//Create the buttons
		private JButton StaffLogin = new JButton("Staff Login");
		private JButton Menu = new JButton("Menu");
		private JButton HotDrinks = new JButton("Hot Drinks");
		private JButton ColdDrinks = new JButton("Cold Drinks");
		private JButton Pastries = new JButton("Pastries");
		private JButton Sandwiches = new JButton("Sandwiches");
		private JButton Checkout = new JButton("Checkout");
		
		private final static String newline = "\n";
		
		public MenuGUI() {
			buildMenuGUI();
		}
		
		public void buildMenuGUI() {
			//title = createLable("")
			//set layout of components in frame
			Menuframe.setTitle("Menu");
			Menuframe.setSize(300,300);
			Menuframe.setLocation(300,500);
			Menuframe.setVisible(true);
			Menuframe.setLayout(new BorderLayout(50,50));
			
			//set staff login button in north panel
			northPanel.setLayout(new GridLayout(1, 3, 5, 5));
			Font itemsFont = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
			label1.setFont(itemsFont);
			northPanel.add(label1);
			
			//set list of category buttons in west panel
			westPanel.setLayout(new GridLayout(4, 1, 5, 5));
			//Font itemsFont = new Font(Font.SANS_SERIF, Font.PLAIN, 20);
			label3.setFont(itemsFont);
			label4.setFont(itemsFont);
			label5.setFont(itemsFont);
			label6.setFont(itemsFont);
			westPanel.add(label3);
			westPanel.add(label4);
			westPanel.add(label5);
			westPanel.add(label6);
			
			//set checkout button in the south panel
			southPanel.setLayout(new GridLayout(1, 3, 5, 5));
			label7.setFont(itemsFont);
			southPanel.add(label7);
			
			
			//add east and centre panels
			Menuframe.add(eastPanel, BorderLayout.EAST);
		    Menuframe.add(centrePanel, BorderLayout.CENTER);
			
			
			
			
			
			//title = createOneLabel("Menu", 16);
			//titlePanel.add(title);
			

			
			


		}
		
		
		
		// report
		//System.out.println();
	 
				
	
	}


	public static JLabel createOneLabel (String s, int size) {
		Font f = new Font(Font.SANS_SERIF, Font.BOLD, size);
		JLabel label= new JLabel(s, JLabel.CENTER);
		label.setFont(f);
		label.setOpaque(true);
		return label;
		}
}
*/

	