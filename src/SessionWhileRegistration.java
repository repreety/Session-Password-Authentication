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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.*;

public class SessionWhileRegistration implements ActionListener{
  static BufferedImage bg = null;
  static char r='A';
  static String temp="";
  static JFrame frame = new JFrame();
  static JButton[][] b=new JButton[7][7];
  JPasswordField p=new JPasswordField();
   JLabel l=new JLabel("SESSION PASSWORD");
   JLabel k;
   JCheckBox cb;
  static  JButton h=new JButton("<html><u>SUBMIT</u><html>");
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


  public  SessionWhileRegistration() throws FontFormatException, IOException
  {
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
		
		cb.setFont(font);
		h.setFont(font);
	p.setFont(new Font("Digital-7 Mono ",Font.PLAIN, 40));
	p.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
	l.setFont(font);
	h.addActionListener(this);
	 h.setBackground(new Color(37,178,170));
	l.setBounds(400,100,500,40);
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
    			
    			b[i][j]=new JButton(" "+r);    			
    			b[i][j].setBackground(new Color(95,158,160));
    			b[i][j].setForeground(new Color(0,255,0));
    			b[i][j].setFont(font);
    			b[i][j].addActionListener(this);
    			r++;
    		}
    		
    		else {
			
             b[i][j]=new JButton();    		
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
    frame.add(cb);
    frame.add(h);
    tabPanel.setBounds(200,20,800,800);
    
    frame.add(tabPanel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
   
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setBounds(0,0,screenSize.width, screenSize.height);
 
    
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
  /*
  public static void main(String[] args) throws FontFormatException, IOException {
	  new SessionRegistration();
  }*/

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
	int x=0;
	String email=RegistrationFormDesign.user;
	char s[]=p.getPassword();
	String ss=new String(s);
	  try
      {

           Class.forName("oracle.jdbc.driver.OracleDriver");

           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mucb");

           PreparedStatement ps = con.prepareStatement("insert into reg1 values(?,?)");

          ps.setString(1,email);

           ps.setString(2, ss);
           ResultSet rs = ps.executeQuery();

           x++;

           if (x > 0) 
           {

               JOptionPane.showMessageDialog(h, "Data Saved Successfully");
               new SessionColorWhileRegistration();

           }

       }
 catch (Exception ex) 
       {

           System.out.println(ex);

       }

   }
 
}


}
