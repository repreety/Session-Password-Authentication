import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.*;

public class SessionColorWhileLogin implements ActionListener{
  static BufferedImage bg = null;
  static String temp="";
  static JFrame frame = new JFrame();
  JButton b1,b2,b3,b4,b5,b6,b7,b8;
  static JButton[][] b=new JButton[7][7];
  JPasswordField p=new JPasswordField();
   JLabel l=new JLabel("SESSION PASSWORD");
   JLabel k;
   JCheckBox cb;
   int t=1;
   JButton h=new JButton("<html><u>SUBMIT</u></html>");
   static public char l(int i)
   {
	   switch(i)
	   {
	   case 1:return 'A';
	  
	   case 2:return 'B';
	   case 3:return 'C';
	   case 4:return 'D';
	   case 5:return 'E';
	   }
	return 0;
   	
   }


  public  SessionColorWhileLogin() throws FontFormatException, IOException
  {
	  b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		b5=new JButton();
		b6=new JButton();
		b7=new JButton();
		b8=new JButton();
		b2.setBackground(Color.RED);
		b2.setBounds(200, 50,50, 50);
		b3.setBackground(Color.YELLOW);
		b3.setBounds(300, 50,50, 50);
		b4.setBackground(Color.PINK);
		b4.setBounds(400, 50,50, 50);
		b5.setBackground(Color.GREEN);
		b5.setBounds(500, 50,50, 50);
		b6.setBackground(Color.ORANGE);
		b6.setBounds(600, 50,50, 50);
		b7.setBackground(Color.BLACK);
		b7.setBounds(700, 50,50, 50);
		b8.setBackground(Color.MAGENTA);
		b8.setBounds(800, 50,50, 50);
		b1.setBackground(Color.GRAY);
		b1.setBounds(900, 50,50, 50);
		
	  frame.setLayout(null);
	  frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\t.jpg")));
	    String filename="C:\\Users\\MUCB\\Downloads\\wcp.ttf";
	    cb=new JCheckBox("Show Password");
	   
	       Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
	       font = font.deriveFont(Font.PLAIN,40);

	       try {
	       	File fq=new File("C:\\Users\\MUCB\\Desktop\\images\\t.jpg");
	         bg = ImageIO.read(fq);
	       } catch (Exception ex) {
	         System.out.println(ex);
	       }


    JPanel tabPanel = new JPanel(new GridBagLayout());
    JPanel buttons = new JPanel(new GridLayout(7, 7, 25, 25));
    buttons.setOpaque(false);
    char r='A';
  //  p=new JPasswordField();
   p.setBounds(900,400,300,40);
   cb.setBounds(900,450,300,40);
   h.setBounds(900,500,300,40);
   // p.setBackground(new Color(95,158,160));
	p.setForeground(new Color(0,255,0));
	h.setForeground(new Color(0,255,0));
	 //cb.setBackground(new Color(95,158,160));
		cb.setForeground(new Color(0,255,0));
		cb.setOpaque(false);
		p.setOpaque(false);
		h.setOpaque(false);
		h.setFont(font);
		cb.setFont(font);
	p.setFont(new Font("Digital-7 Mono ",Font.PLAIN, 40));
	p.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
	l.setFont(font);
	h.addActionListener(this);
	 h.setBackground(new Color(37,178,170));
	l.setBounds(450,600,500,40);
l.setForeground(new Color(0,255,0));
    for (int i = 0; i < 6; i++) {
    	for(int j=0;j<6;j++)
    	{
    		if(i==0)
    		{
    			b[i][j]=new JButton(" "+j);   			
    			b[i][j].setBackground(new Color(95,158,160));
    			b[i][j].setForeground(new Color(0,255,0));
    			b[i][j].setFont(font);
    			b[i][j].setEnabled(true);
    			b[i][j].addActionListener(this);
    	
    		}
    		else  if(j==0&&i<6)
    		{
    			
    			b[i][j]=new JButton(" "+t);    			
    			b[i][j].setBackground(new Color(95,158,160));
    			b[i][j].setForeground(new Color(0,255,0));
    			b[i][j].setFont(font);
    			b[i][j].addActionListener(this);
    			t++;
    		}
    		
    		else {
			String t=randomAlphaNumeric(1);
             b[i][j]=new JButton(t);    		
    		b[i][j].setPreferredSize(new Dimension(50,50));
    		b[i][j].setBackground(new Color(176,196,222));
			b[i][j].setForeground(Color.BLACK);
			b[i][j].setFont(font);
			b[i][j].addActionListener(this);
    		}
      buttons.add(b[i][j]);
      
    	}
    }
  tabPanel.add(buttons);
tabPanel.setOpaque(false);
p.addActionListener(this);
cb.addActionListener(this);
    frame.add(p);
    frame.add(l);
//    frame.add(cb);
    frame.add(h);
    frame.add(b1);
	frame.add(b2);
	frame.add(b3);
	frame.add(b4);
	frame.add(b5);
	frame.add(b6);
	frame.add(b7);
	frame.add(b8);

    tabPanel.setBounds(200,20,800,800);
    
    frame.add(tabPanel);
   // frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setBounds(0,0,screenSize.width, screenSize.height);
    frame.setVisible(true);
    frame.setVisible(true);
    
  }
   
  
  
  
  public static  String randomAlphaNumeric(int count) {
		String ALPHA_NUMERIC_STRING = "ABCDEFGHIJLKMNOPQRSTUVWXYZ012345";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    
	
		}
		return builder.toString();
		}


String c[]=new String[40];

@Override
public void actionPerformed(ActionEvent e) {
	

     for(int i=1;i<6;i++)
     {
    	 for(int j=0;j<6;j++)
    	 {
    		 if(e.getSource()==b[i][j])
    		 {
    			 c[i]="";
    			 char t=l(i);
    			
    			 c[i]=temp+t+j;
    			 temp=c[i];
    			 if(c[i].length()>=6)
    			 {
    				 k=new JLabel("Password Strength Excellent");
    				 k.setForeground(new Color(0,255,0));
    				 k.setOpaque(false);
    			
    				 k.setFont(new Font("Digital-7 Mono ",Font.PLAIN, 35));
    			 }
    			 p.setText(c[i]);
    		 }
    	 }
    	
     }
	

if (e.getSource() == cb) {
    if (cb.isSelected()) {
        p.setEchoChar((char) 0);
    } else {
        p.setEchoChar('*');
    }
}
if(e.getSource()==h)
{
	String email=Login.user1;
	char[] t=p.getPassword();
	String c=new String(t);
	 try
     {

          Class.forName("oracle.jdbc.driver.OracleDriver");

          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mucb");
        Statement ps=con.createStatement();
          ResultSet rs=ps.executeQuery("select *from reg2");
          
          while(rs.next()) {
      String mail=rs.getString(1);
       	   
       	String pass=rs.getString(2);
      
           	  new end();
           	  //dispose();
              
}
     }catch(Exception ey) {}
}
}
public static void main(String args[]) throws FontFormatException, IOException
{
	new SessionColorWhileLogin();
}
}
