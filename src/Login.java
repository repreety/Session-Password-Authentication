import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.Border;
import javax.xml.transform.Result;

public class Login extends JFrame implements ActionListener  {
	JLabel  l1,l2;
	JTextField tf1;
	JPasswordField ps1;
     static String user1;
	JButton btn1,btn2;
	 JCheckBox showPassword;
	//int radius;
	   Icon imgicon = new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\4.png");
	   Icon imgicon1 = new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\locked.png");
JLabel head;
	Login() throws FontFormatException, IOException
	{	   String filename="C:\\Users\\MUCB\\Downloads\\wcp.ttf";
    Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
    font = font.deriveFont(Font.PLAIN,40);
		// this.radius = radius;
		setLayout(null);
	      head=new JLabel("Session Password Authentication");
	      head.setBounds(400,150,900,100);
	      head.setFont(font);
	      head.setBackground(Color.black);
	      head.setForeground(new Color(0,255,0));
	      
		l1=new JLabel("USERNAME:",imgicon,JLabel.LEFT);
		l2=new JLabel("PASSWORD:",imgicon1,JLabel.LEFT);
		tf1=new JTextField();
		ps1=new JPasswordField();
		btn1=new JButton("<html><u>LOGIN</u></html>");
		btn2=new JButton("<html><u>SIGN UP</u></html>");
		  showPassword = new JCheckBox("Show Password");
		 setContentPane(new JLabel(new ImageIcon("C:\\Users\\MUCB\\Desktop\\images\\d.jpg")));
		 tf1.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));
		 ps1.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.LIGHT_GRAY));


		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
            l1.setBounds(400, 310, 300,55 );
	        l2.setBounds(400, 370, 300, 35);
	        tf1.setBounds(650, 310, 200, 40);
	        ps1.setBounds(650, 360, 200, 40);
	        showPassword.setBounds(500, 420, 300, 30);
	        btn1.setBounds(400, 500, 130, 30);
	        btn2.setBounds(700, 500, 130, 30);
	        btn1.setBorder(null);
	        btn2.setBorder(null);
	        
	       l1.setFont(new Font("Digital-7 MonoItalic ",Font.PLAIN, 45));
	       l2.setFont(new Font("Digital-7 Mono ",Font.PLAIN, 20));
	 
	        String file="C:\\Users\\MUCB\\Downloads\\sf.ttf";
	       Font f=Font.createFont(Font.TRUETYPE_FONT,new File(file));
	       f=f.deriveFont(Font.PLAIN,40);
	      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	       ge.registerFont(font);
	       l1.setFont(font);
	       l2.setFont(font);
	       tf1.setFont(f);
	       ps1.setFont(f);
	       showPassword.setFont(font);
	       btn1.setFont(font);
	       btn2.setFont(font);
	      
	      
	       l1.setForeground(new Color(0, 255,0));
	       l2.setForeground(new Color(0,255,0));
	       tf1.setForeground(new Color(169, 169,169));
	       ps1.setForeground(new Color(169, 169,169));
	       showPassword.setForeground(new Color(0,255,0));
	       btn1.setForeground(new Color(0,255,0));
	       btn2.setForeground(new Color(0,255,0));
	       showPassword.setOpaque(false);
	       btn1.setOpaque(false);
	       btn1.setBackground(new Color(37,178,170));
	       btn2.setOpaque(false);
	       btn2.setBackground(new Color(37,178,170));
	       tf1.setOpaque(false);
	       tf1.setBackground(new Color(37,178,170));
	       ps1.setOpaque(false);
	       ps1.setBackground(new Color(37,178,170));
          add(head);
		add(l1);
		add(tf1);
		add(l2);
		add(ps1);
		add(showPassword);
		add(btn1);
		add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		showPassword.addActionListener(this);
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      setBounds(0,0,screenSize.width, screenSize.height);
	      //setLayout(null);
	      setVisible(true);
	}
	      public static void main(String args[]) throws FontFormatException, IOException
	      {
	    	  new Login();
	      }
	

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn1)
			{
			
				String n=tf1.getText();
				char c[]=ps1.getPassword();
				String s1=new String(c);
				//System.out.println(n);
			   try
			          {

			               Class.forName("oracle.jdbc.driver.OracleDriver");

			               Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mucb");
			             Statement ps=con.createStatement();
			               ResultSet rs=ps.executeQuery("select *from reg");
			               
			               while(rs.next()) {
			            	String mail=rs.getString(4);
			            	String pass=rs.getString(2);
			            	if(pass.equals(s1)&&n.equals(mail))
				               {
			            		user1=mail;
				            	  new SessionWhileLogin();
				            	  //dispose();
				               }
			            	}
			               
			               
			}catch(Exception e2) {
				System.out.println(e2);
				
			}
			}
			if (e.getSource() == showPassword) {
	            if (showPassword.isSelected()) {
	                ps1.setEchoChar((char) 0);
	            } else {
	                ps1.setEchoChar('*');
	            }
			}
			
			if(e.getSource()==btn2)
			{
				try {
					
					new RegistrationFormDesign();
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
			}
			}
			
			
		

