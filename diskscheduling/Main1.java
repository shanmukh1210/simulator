import javax.swing.JPanel;

//public class Main1 extends JPanel {

	/**
	 * Create the panel.
	 */
	//public Main1() {

	//}

//}
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Main1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	private JPanel graph;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	public static int[] process;
//	public static int head;
	public static int tail;
	public static int n;
	private static JTextField textField_7;
	private static JTextField textField_8;
	public Main1(){
		super("Graph");
		getContentPane().setBackground(Color.GREEN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(672, 514));
		setLocationRelativeTo(null);
		setVisible(true);
		init();
	}
	public void setgraph(JPanel panel){
		graph.setLayout(new FlowLayout());
		graph.removeAll();
		graph.add(panel);
		//head.setFont(new Font("Vardana",Font.BOLD));
		//graph.add(head);
		graph.repaint();
		graph.revalidate();
		
		
	}
	public static void input(){
		
	}
	public void init(){
		getContentPane().setLayout(null);
		graph=new JPanel();
		graph.setBackground(Color.BLACK);
		graph.setBounds(0, 0, 654, 300);
		graph.setPreferredSize(new Dimension(300, 300));
		getContentPane().add(graph);
		
		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		textField.setBounds(105, 313, 97, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("FCFS");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//input p1=new input();
				process=new int[11];
				int i=0;
				process[i]=Integer.parseInt(textField_8.getText());//start
				i++;
				process[i]=Integer.parseInt(textField_7.getText());//end
				i++;
				process[i]=Integer.parseInt(textField.getText());
				i++;
				int head=process[2];
				process[i]=Integer.parseInt(textField_1.getText());
				i++;
				process[i]=Integer.parseInt(textField_2.getText());
				i++;
				process[i]=Integer.parseInt(textField_3.getText());
				i++;
				process[i]=Integer.parseInt(textField_4.getText());
				i++;
				process[i]=Integer.parseInt(textField_5.getText());
				i++;
				process[i]=Integer.parseInt(textField_6.getText());
				i++;
				n=i;
				int[] pro;
				pro=new int[n-2];
				int g=0;
				for(int j=2;j<n;j++)
				{
					System.out.println(process[j]);
					pro[g]=process[j];
					g++;
				}
			/*	int k=0,p=0;
				if(head<0||head>tail)
				{
					k=1;
				}
				if(k==0)
				{
					for(int j=2;j<g;j++)
					{
						if(pro[j]>tail||pro[j]<head)
							p=1;
					}
					if(p==0)
					{
						for(int j=0;j<g;j++)
						System.out.println(pro[j]);
					}*/
					setgraph(new DrawGraph(pro));
			//	}
				//else
				//	JOptionPane.showMessageDialog(null, "not possible");
					
			}
		});
		btnNewButton.setBounds(396, 345, 97, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("look");
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				process=new int[11];
				int i=0;
				process[i]=Integer.parseInt(textField_8.getText());//start
				i++;
				process[i]=Integer.parseInt(textField_7.getText());//end
				i++;
				process[i]=Integer.parseInt(textField.getText());
				int head=process[2];
				i++;
				process[i]=Integer.parseInt(textField_1.getText());
				i++;
				process[i]=Integer.parseInt(textField_2.getText());
				i++;
				process[i]=Integer.parseInt(textField_3.getText());
				i++;
				process[i]=Integer.parseInt(textField_4.getText());
				i++;
				process[i]=Integer.parseInt(textField_5.getText());
				i++;
				process[i]=Integer.parseInt(textField_6.getText());
				i++;
				n=i;
				for(int j=0;j<n;j++)    // sorting disk locations
				{
					for(int k=j;k<n;k++)
					{
						if(process[j]>process[k])
						{
							int temp=process[j];
							process[j]=process[k];
							process[k]=temp;
						}
					}
				}
				int dloc=0;
				for(int j=0;j<n;j++)
				{
					if(head==process[j])
					{
						dloc=j;break;
					}
				}
				int[] pro;
				pro= new int[n];
				int l=0;
				for(int j=dloc;j>=0;j--)
				{
					pro[l]=process[j];
					l++;
				}
				for(int j=dloc+1;j<n;j++)
				{
					pro[l]=process[j];
					l++;
				}
				for(int j=0;j<l;j++)
					System.out.println(pro[j]);
		setgraph(new DrawGraph(pro));		
			
			}
		});
		btnNewButton_1.setBounds(396, 421, 97, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnCscan = new JButton("STSF");
		btnCscan.setBackground(Color.YELLOW);
		btnCscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				process=new int[11];
				int i=0;
				process[i]=Integer.parseInt(textField_8.getText());//start
				i++;
				process[i]=Integer.parseInt(textField_7.getText());//end
				i++;
				process[i]=Integer.parseInt(textField.getText());
				i++;
				int head=process[i-1];
				process[i]=Integer.parseInt(textField_1.getText());
				i++;
				process[i]=Integer.parseInt(textField_2.getText());
				i++;
				process[i]=Integer.parseInt(textField_3.getText());
				i++;
				process[i]=Integer.parseInt(textField_4.getText());
				i++;
				process[i]=Integer.parseInt(textField_5.getText());
				i++;
				process[i]=Integer.parseInt(textField_6.getText());
				i++;
				n=i;
				int[] pro;
				pro=new int[n+1];
				//pro[0]=process[2];
				//int g=1;
				int t=0;
				int x=0,d=0;
				int k=0;
				pro[k++]=head;
				/*for(int j=0;j<n;j++)
				{
					int s=1000;
					for(int k=j+1;k<=n;k++)
					{
						if(process[j]>process[k])
						{
							d=process[j]-process[k];
						}
						else
							d=process[k]-process[j];
						if(d<s)
						{
							s=d;
							x=k;
						}
						t=t+s;
							int temp=process[j+1];
							process[j+1]=process[x];
							process[x]=temp;
							pro[g]=process[j+1];
							g++;
					}
				}*/
				for(int h=0;h<n;h++)
				 {
				  int s=1000;
				  for( int j=i+1;j<=n;j++)
				  {
				   if(process[h]>process[j])
				   d=process[h]-process[j];
				   else
				   d=process[j]-process[h];
				   if(d<s)
				   {
				    s=d;
				    x=j;
				   }
				  }
				  t+=s;
				  int temp=process[h+1];
				  process[h+1]=process[x];
				  process[x]=temp;
				  pro[k++]=process[h+1];
				 }
				setgraph(new DrawGraph(pro));
				
			}
		});
		btnCscan.setBounds(396, 383, 97, 25);
		getContentPane().add(btnCscan);
		
		JButton btnStsf = new JButton("CSCAN");
		btnStsf.setBackground(Color.CYAN);
		btnStsf.addActionListener(new ActionListener() {
			private int dloc;

			public void actionPerformed(ActionEvent e) {
				process=new int[11];
				int i=0;
				process[i]=Integer.parseInt(textField_8.getText());//start
				i++;
				process[i]=Integer.parseInt(textField_7.getText());//end
				i++;
				process[i]=Integer.parseInt(textField.getText());
				int head=process[2];
				i++;
				process[i]=Integer.parseInt(textField_1.getText());
				i++;
				process[i]=Integer.parseInt(textField_2.getText());
				i++;
				process[i]=Integer.parseInt(textField_3.getText());
				i++;
				process[i]=Integer.parseInt(textField_4.getText());
				i++;
				process[i]=Integer.parseInt(textField_5.getText());
				i++;
				process[i]=Integer.parseInt(textField_6.getText());
				i++;
				n=i;
				//int[] pro;
				//pro=new int[n];
				//int g=0;
				//System.out.println(process[2]);
				for(int h=0;h<n;h++)
				{
					for(int j=h;j<n;j++)
					{
						if(process[h]>process[j])
						{
							int temp;
							temp=process[h];
							process[h]=process[j];
							process[j]=temp;
						}
					}
				}
				//System.out.println(head);
				for(int j=0;j<n;j++)
					//System.out.println(process[j]);
				dloc = 0;
				for(int j=0;j<n;j++)
				{
					if(head==process[j])
					{
						dloc=j;
						break;
					}
				}
				int[] pro;
				pro= new int[n];
				int g=0;
				for(int j=dloc;j>=0;j--)
				{
					pro[g]=process[j];
					g++;
				}
				for(int k=n-1;k>dloc;k--)
				{	pro[g]=process[k];
					g++;
				}
				setgraph(new DrawGraph(pro));
				//for(int j=0;j<n;j++)
				//	System.out.println(pro[j]);
				
			}
		});
		btnStsf.setBounds(518, 345, 97, 25);
		getContentPane().add(btnStsf);
		
		JButton btnScan = new JButton("scan");
		btnScan.setBackground(Color.PINK);
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				process=new int[11];
				int i=0;
				process[i]=Integer.parseInt(textField_8.getText());//start
				i++;
				process[i]=Integer.parseInt(textField_7.getText());//end
				i++;
				process[i]=Integer.parseInt(textField.getText());
				int head=process[2];
				i++;
				process[i]=Integer.parseInt(textField_1.getText());
				i++;
				process[i]=Integer.parseInt(textField_2.getText());
				i++;
				process[i]=Integer.parseInt(textField_3.getText());
				i++;
				process[i]=Integer.parseInt(textField_4.getText());
				i++;
				process[i]=Integer.parseInt(textField_5.getText());
				i++;
				process[i]=Integer.parseInt(textField_6.getText());
				i++;
				n=i;
				for(int j=0;j<n;j++)    // sorting disk locations
				{
					for(int k=j;k<n;k++)
					{
						if(process[j]>process[k])
						{
							int temp=process[j];
							process[j]=process[k];
							process[k]=temp;
						}
					}
				}
				int dloc=0;
				for(int j=0;j<n;j++)
				{
					if(head==process[j])
					{
						dloc=j;break;
					}
				}
				int[] pro;
				pro= new int[n];
				int l=0;
				for(int j=dloc;j>=0;j--)
				{
					pro[l]=process[j];
					l++;
				}
				for(int j=dloc+1;j<n;j++)
				{
					pro[l]=process[j];
					l++;
				}
				for(int j=0;j<l;j++)
					System.out.println(pro[j]);
		setgraph(new DrawGraph(pro));		
			}
		});
		btnScan.setBounds(518, 383, 97, 25);
		getContentPane().add(btnScan);
		
		JButton btnClook = new JButton("clook");
		btnClook.setBackground(Color.MAGENTA);
		btnClook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				process=new int[11];
				int i=0;
				process[i]=Integer.parseInt(textField_8.getText());//start
				i++;
				process[i]=Integer.parseInt(textField_7.getText());//end
				i++;
				process[i]=Integer.parseInt(textField.getText());
				int head=process[2];
				i++;
				process[i]=Integer.parseInt(textField_1.getText());
				i++;
				process[i]=Integer.parseInt(textField_2.getText());
				i++;
				process[i]=Integer.parseInt(textField_3.getText());
				i++;
				process[i]=Integer.parseInt(textField_4.getText());
				i++;
				process[i]=Integer.parseInt(textField_5.getText());
				i++;
				process[i]=Integer.parseInt(textField_6.getText());
				i++;
				n=i;
				for(int j=0;j<n;j++)    // sorting disk locations
				{
					for(int k=j;k<n;k++)
					{
						if(process[j]>process[k])
						{
							int temp=process[j];
							process[j]=process[k];
							process[k]=temp;
						}
					}
				}
				int dloc=0;
				for(int j=0;j<n;j++)
				{
					if(head==process[j])
					{
						dloc=j;break;
					}
				}
				int[] pro;
				pro= new int[n];
				int l=0;
				for(int j=dloc;j>0;j--)
				{
					pro[l]=process[j];
					l++;
				}
				for(int j=n-2;j>dloc;j--)
				{
					pro[l]=process[j];
					l++;
				}
			//	for(int j=0;j<l;j++)
			//		System.out.println(pro[j]);
		setgraph(new DrawGraph(pro));		
			}
		});
		btnClook.setBounds(518, 421, 97, 25);
		getContentPane().add(btnClook);
		
		JLabel lblHead = new JLabel("head");
		lblHead.setBounds(37, 316, 56, 16);
		getContentPane().add(lblHead);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 358, 56, 16);
		getContentPane().add(label);
		
		JLabel lblFirst = new JLabel("First");
		lblFirst.setBounds(37, 358, 56, 16);
		getContentPane().add(lblFirst);
		
		JLabel lblSecond = new JLabel("second");
		lblSecond.setBounds(12, 387, 56, 16);
		getContentPane().add(lblSecond);
		
		JLabel lblThird = new JLabel("Third");
		lblThird.setBounds(12, 425, 56, 16);
		getContentPane().add(lblThird);
		
		JLabel lblFourth = new JLabel("Fourth");
		lblFourth.setBounds(195, 358, 56, 16);
		getContentPane().add(lblFourth);
		
		JLabel lblFifth = new JLabel("Fifth");
		lblFifth.setBounds(195, 387, 56, 16);
		getContentPane().add(lblFifth);
		
		JLabel lblSixth = new JLabel("sixth");
		lblSixth.setBounds(195, 425, 56, 16);
		getContentPane().add(lblSixth);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.RED);
		textField_1.setBounds(67, 352, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.MAGENTA);
		textField_2.setColumns(10);
		textField_2.setBounds(67, 384, 116, 22);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.CYAN);
		textField_3.setColumns(10);
		textField_3.setBounds(67, 422, 116, 22);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.PINK);
		textField_4.setColumns(10);
		textField_4.setBounds(242, 352, 116, 22);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.ORANGE);
		textField_5.setColumns(10);
		textField_5.setBounds(242, 384, 116, 22);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(Color.YELLOW);
		textField_6.setColumns(10);
		textField_6.setBounds(242, 422, 116, 22);
		getContentPane().add(textField_6);
		
		JLabel lblEnd = new JLabel("end");
		lblEnd.setBounds(214, 316, 56, 16);
		getContentPane().add(lblEnd);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setColumns(10);
		textField_7.setBounds(242, 313, 97, 22);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(Color.LIGHT_GRAY);
		textField_8.setColumns(10);
		textField_8.setBounds(504, 313, 97, 22);
		getContentPane().add(textField_8);
		
		JLabel lblStart = new JLabel("start");
		lblStart.setBounds(415, 316, 56, 16);
		getContentPane().add(lblStart);
}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 window = new Main1();
					//window.frame.setVisible(true);
					//input one=new input();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

