import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Canvas;
import javax.swing.SwingConstants;

public class cal {

	private JFrame frame;
	private JTextField textField;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.setBounds(100, 100, 908, 688);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		textField.setBounds(94, 104, 645, 97);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s=textField.getText();
				textField.setText(s+"1");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(94, 201, 146, 103);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBackground(new Color(245, 245, 245));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s=textField.getText();
				textField.setText(s+"2");
			}
			
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button.setBounds(239, 201, 146, 103);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBackground(new Color(245, 245, 245));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"3");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBounds(382, 201, 146, 103);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBackground(new Color(245, 245, 245));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"4");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_2.setBounds(94, 301, 146, 97);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBackground(new Color(245, 245, 245));
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"5");
			}
		});
		button_3.setBounds(239, 301, 146, 97);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBackground(new Color(245, 245, 245));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"6");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_4.setBounds(382, 301, 146, 97);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBackground(new Color(245, 245, 245));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"7");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_5.setBounds(94, 395, 146, 103);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBackground(new Color(245, 245, 245));
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"8");
			}
		});
		button_6.setBounds(239, 395, 146, 103);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBackground(new Color(245, 245, 245));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"9");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_7.setBounds(382, 395, 146, 103);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setBackground(new Color(245, 245, 245));
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"0");
			}
		});
		button_8.setBounds(94, 498, 146, 61);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("00");
		button_9.setBackground(new Color(245, 245, 245));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"00");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_9.setBounds(239, 498, 146, 61);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("=");
		button_10.setBackground(new Color(255, 0, 102));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String s=textField.getText();
				String s1="",s2="";
				int i,j;
				char c;
				double a,b,total=0;
				for( i=0;i<s.length();i++)
				{
					c=s.charAt(i);
					
					if(c=='+' || c=='-' || c=='X' || c=='/')
					{
						for(j=0;j<i;j++)
						{
							s1=s1+s.charAt(j);
						}
						a=Double.parseDouble(s1);
						
						for(j=i+1;j<s.length();j++)
						{
							s2=s2+s.charAt(j);
						}
						b=Double.parseDouble(s2);
						
				
						if(c=='+')
							total=a+b;
						else if(c=='-')
							total=a-b;
						else if(c=='X')
							total=a*b;
						else if(c=='/')
							total=a/b;
						
					}
					
					textField.setText(""+total);
					
					
				}
				
				
				
//				int i,j,lastIndex,count=0;
//				String s1="";
//				char op[]=new char[100];
//				char c;
//				double a[]=new double[100];
//				String s=textField.getText();
//				lastIndex=s.length();
//				if(s.charAt(s.length()-1)!='+' ||s.charAt(s.length()-1)!='-' ||s.charAt(s.length()-1)!='X' ||s.charAt(s.length()-1)!='/')
//				{
//					for(i=0;i<s.length();i++)
//					{
//						c=s.charAt(i);
//						s1="";
//						if(c=='+')
//						{
//							for(j=i+1;j<lastIndex;j++)
//							{
//								s1=s1+s.charAt(j);
//							}
//							
//							lastIndex=i-1;
//							
//							a[count]=Double.parseDouble(s1);
//							op[count]=c;
//							count++;
//						}
//					
//					}
//					
//					if(c=='-')
//					{
//						for(j=i+1;j<lastIndex;j++)
//						{
//							s1=s1+s.charAt(j);
//						}
//						
//						lastIndex=i-1;
//						
//						a[count]=Double.parseDouble(s1);
//						op[count]=c;
//						count++;
//					}
//				
//				}
//					for(i=lastIndex;i<s.length();i++)
//					{
//						s1=s1+s.charAt(i);
//					}
//					a[count]=Double.parseDouble(s1);
//					count++;
//				}
//				
//				
//				
				
				
				
				
				
//				String s=textField.getText();
//				char c;
//				int j,startIndex=0;
//				StringBuffer s1=new StringBuffer("");
//				StringBuffer s2=new StringBuffer("");
//				double a=0,b=0,total=0;
//				
//				if(s.charAt(s.length()-1)!='+' ||s.charAt(s.length()-1)!='-' ||s.charAt(s.length()-1)!='X' ||s.charAt(s.length()-1)!='/')
//				{
//					for(int i=0;i<s.length();i++)
//					{
//						c=s.charAt(i);
//						
//						if(c=='/')
//						{
//							for(j=i-1;j>0;j--)
//							{
//								if(s.charAt(j)!='+' ||s.charAt(j)!='-' ||s.charAt(j)!='X' ||s.charAt(j)!='/')
//									s1=s1.append(s.charAt(j));
//								else
//									break;
//							}
//							a=Double.parseDouble(s1.toString());
//							
//							for(j=i+1;j<s.length();j++)
//							{
//								if(s.charAt(j)!='+' ||s.charAt(j)!='-' ||s.charAt(j)!='X' ||s.charAt(j)!='/')
//									s2=s2.append(s.charAt(j));
//								else
//									break;
//							}
//							b=Double.parseDouble(s1.toString());
//							total=total+a/b;	
//						}
//						
//						else if(c=='X')
//						{
//							for(j=i-1;j>0;j--)
//							{
//								if(s.charAt(j)!='+' ||s.charAt(j)!='-' ||s.charAt(j)!='X')
//									s1=s1.append(s.charAt(j));
//								else
//									break;
//							}
//							a=Double.parseDouble(s1.toString());
//							
//							for(j=i+1;j<s.length();j++)
//							{
//								if(s.charAt(j)!='+' ||s.charAt(j)!='-' ||s.charAt(j)!='X')
//									s2=s2.append(s.charAt(j));
//								else
//									break;
//							}
//							b=Double.parseDouble(s1.toString());
//							total=total+a*b;	
//						}
//						
//						else if(c=='-')
//						{
//							for(j=i-1;j>0;j--)
//							{
//								if(s.charAt(j)!='+' ||s.charAt(j)!='-')
//									s1=s1.append(s.charAt(j));
//								else
//									break;
//							}
//							a=Double.parseDouble(s1.toString());
//							
//							for(j=i+1;j<s.length();j++)
//							{
//								if(s.charAt(j)!='+' ||s.charAt(j)!='-')
//									s2=s2.append(s.charAt(j));
//								else
//									break;
//							}
//							b=Double.parseDouble(s1.toString());
//							total=total+a-b;	
//						}
//						else if(c=='+')
//						{
//							for(j=i-1;j>0;j--)
//							{
//								if(s.charAt(j)!='+' )
//									s1=s1.append(s.charAt(j));
//								else
//									break;
//							}
//							a=Double.parseDouble(s1.toString());
//							
//							for(j=i+1;j<s.length();j++)
//							{
//								if(s.charAt(j)!='+')
//									s2=s2.append(s.charAt(j));
//								else
//									break;
//							}
//							b=Double.parseDouble(s1.toString());
//							total=total+a+b;	
//						}
//					}
//				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_10.setBounds(379, 498, 360, 61);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.setForeground(new Color(255, 255, 255));
		button_11.setBackground(new Color(128, 0, 128));
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"+");
			}
		});
		button_11.setBounds(526, 201, 107, 149);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setForeground(new Color(255, 255, 255));
		button_12.setBackground(new Color(128, 0, 128));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"-");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_12.setBounds(526, 349, 107, 149);
		frame.getContentPane().add(button_12);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(new Color(255, 255, 255));
		btnX.setBackground(new Color(128, 0, 128));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"X");
			}
		});
		btnX.setBounds(632, 201, 107, 149);
		frame.getContentPane().add(btnX);
		
		JButton button_13 = new JButton("/");
		button_13.setForeground(new Color(255, 255, 255));
		button_13.setBackground(new Color(128, 0, 128));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				textField.setText(s+"/");
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_13.setBounds(632, 349, 107, 149);
		frame.getContentPane().add(button_13);
		panel.setBackground(new Color(51, 0, 102));
		panel.setBounds(0, 0, 894, 651);
		frame.getContentPane().add(panel);
	}
}
