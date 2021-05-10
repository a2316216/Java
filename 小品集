package willy;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;


@SuppressWarnings("serial")
public class 作品集
{

	public static void main(String[] args) 
	{	
		Frame A = new Frame();
		Label B=new Label();
		Button b1=new Button("隨機大樂透");
		Button b2=new Button("自選大樂透");
		Button b3=new Button("計算機");
		Button b4=new Button("數字遊戲");
		A.setTitle("綜合品集");
		A.setSize(500,650);
		A.setLocation(0,0);
		A.setBackground(Color.PINK);
		A.setVisible(true);
		A.setLayout(null);
		
		B.setText("綜合品集");
		B.setAlignment(Label.CENTER);	
		B.setBounds(100,100,300,100);
		B.setFont(new Font("Arial", Font.PLAIN, 50));	
		A.add(B);
		b1.setBounds(100,200,300,100);
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("Arial", Font.PLAIN, 50));
		A.add(b1);
		b2.setBounds(100,300,300,100);
		b2.setBackground(Color.ORANGE);
		b2.setFont(new Font("Arial", Font.PLAIN, 50));
		//A.add(b2);
		b3.setBounds(100,400,300,100);
		b3.setBackground(Color.ORANGE);
		b3.setFont(new Font("Arial", Font.PLAIN, 50));
		A.add(b3);
		b4.setBounds(100,500,300,100);
		b4.setBackground(Color.ORANGE);
		b4.setFont(new Font("Arial", Font.PLAIN, 50));
		//A.add(b4);
		
		
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent x) 
			{
				new 隨機大樂透(0, 0, 500, 650, "隨機大樂透");		
				
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent actionEvent) 
			{
				//new 自選大樂透();		
				
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent  actionEvent) 
			{	
				new 計算機();
				
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent  actionEvent) 
			{	
		
					
			}
		});
		A.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent){System.exit(0);}});

				
			
	}	
}

class 隨機大樂透 extends Frame implements ActionListener {

	private Label D = new Label();
	private Button 列印 = new Button("列印");
	private Button 關閉 = new Button("關閉");
	private Button 回前頁 = new Button("回前頁");
	private Button 清除 = new Button("清除");
	private Button a1 = new Button("1組");
	private Button a2 = new Button("2組");
	private Button a3 = new Button("3組");
	private Button a4 = new Button("4組");
	private Button a5 = new Button("5組");
	//private Label LB = new Label();
	//TextField tf = new TextField();
	private int A[] = new int[6];
	private String 字串;
	private TextArea TA = new TextArea();
	//private Panel pn1=new Panel(new GridLayout(4,3));
	
	public 隨機大樂透(int z, int x, int c, int v, String title) {

		
		setTitle(title);
		setSize(c, v);
		setLocation(z, x);
		setBackground(Color.PINK);
		setVisible(true);
		setLayout(null);
		Label B = new Label();
		B.setText("隨機大樂透");
		B.setAlignment(Label.CENTER);
		B.setBounds(100, 100, 300, 100);
		B.setFont(new Font("Arial", Font.PLAIN, 50));
		add(B);
		
		列印.setBounds(390, 500, 50, 40);
		列印.setFont(new Font("Arial", Font.PLAIN, 12));
		列印.addActionListener(this);
		//add(列印);

		關閉.setBounds(440, 500, 50, 40);
		關閉.setFont(new Font("Arial", Font.PLAIN, 12));
		關閉.addActionListener(this);
		add(關閉);

		回前頁.setBounds(10, 500, 50, 40);
		回前頁.setFont(new Font("Arial", Font.PLAIN, 12));
		回前頁.addActionListener(this);
		add(回前頁);

		清除.setBounds(60, 500, 50, 40);
		清除.setFont(new Font("Arial", Font.PLAIN, 12));
		清除.addActionListener(this);
		add(清除);

		Label C = new Label();
		C.setText("看您需要幾組:");
		C.setAlignment(Label.CENTER);
		C.setBounds(50, 200, 130, 30);
		C.setFont(new Font("Arial", Font.PLAIN, 20));
		add(C);

		a1.setBounds(180, 200, 50, 40);
		a1.setFont(new Font("Arial", Font.PLAIN, 12));
		a1.addActionListener(this);
		add(a1);

		a2.setBounds(180 + 50, 200, 50, 40);
		a2.setFont(new Font("Arial", Font.PLAIN, 12));
		a2.addActionListener(this);
		add(a2);

		a3.setBounds(180 + 100, 200, 50, 40);
		a3.setFont(new Font("Arial", Font.PLAIN, 12));
		a3.addActionListener(this);
		add(a3);

		a4.setBounds(180 + 150, 200, 50, 40);
		a4.setFont(new Font("Arial", Font.PLAIN, 12));
		a4.addActionListener(this);
		add(a4);

		a5.setBounds(180 + 200, 200, 50, 40);
		a5.setFont(new Font("Arial", Font.PLAIN, 12));
		a5.addActionListener(this);
		add(a5);

		TA.setBounds(100, 250, 300, 220);
		TA.setFont(new Font("Arial", Font.PLAIN, 30));
		add(TA);

		// tf.setBounds(180,200,40,30);
		// tf.setFont(new Font("Arial",Font.PLAIN,22));
		// add(tf);
		this.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
	}
	
	public void actionPerformed(ActionEvent e) throws ArithmeticException {
		Button btn = (Button) e.getSource();
		if (btn == a1) {
			TA.setText("");
			for (int z = 0; z < A.length; z++) {
				A[0] = (int) (Math.random() * 49 + 1);
				do {
					A[1] = (int) (Math.random() * 49 + 1);
				} while (A[1] == A[0]);
				do {
					A[2] = (int) (Math.random() * 49 + 1);
				} while (A[2] == A[0] || A[2] == A[1]);
				do {
					A[3] = (int) (Math.random() * 49 + 1);
				} while (A[3] == A[0] || A[3] == A[1] || A[3] == A[2]);
				do {
					A[4] = (int) (Math.random() * 49 + 1);
				} while (A[4] == A[0] || A[4] == A[1] || A[4] == A[2] || A[4] == A[3]);
				do {
					A[5] = (int) (Math.random() * 49 + 1);
				} while (A[5] == A[0] || A[5] == A[1] || A[5] == A[2] || A[5] == A[3] || A[5] == A[4]);
				Arrays.sort(A);
			}
			字串 = (((A[0]<10)?"0"+A[0]+" ":A[0]+" ")+((A[1]<10)?"0"+A[1]+" ":A[1]+" ")+((A[2]<10)?"0"+A[2]+" ":A[2]+" ")+((A[3]<10)?"0"+A[3]+" ":A[3]+" ")+((A[4]<10)?"0"+A[4]+" ":A[4]+" ")+((A[5]<10)?"0"+A[5]+" ":A[5]+" ")+"\n");
			TA.append(字串);
			
		}
		else if (btn == a2) 
		{
			TA.setText("");
			for (int j = 0; j < 2; j++) 
			{
				for (int z = 0; z < A.length; z++) 
				{
					A[0] = (int) (Math.random() * 49 + 1);
					do {
						A[1] = (int) (Math.random() * 49 + 1);
					} while (A[1] == A[0]);
					do {
						A[2] = (int) (Math.random() * 49 + 1);
					} while (A[2] == A[0] || A[2] == A[1]);
					do {
						A[3] = (int) (Math.random() * 49 + 1);
					} while (A[3] == A[0] || A[3] == A[1] || A[3] == A[2]);
					do {
						A[4] = (int) (Math.random() * 49 + 1);
					} while (A[4] == A[0] || A[4] == A[1] || A[4] == A[2] || A[4] == A[3]);
					do {
						A[5] = (int) (Math.random() * 49 + 1);
					} while (A[5] == A[0] || A[5] == A[1] || A[5] == A[2] || A[5] == A[3] || A[5] == A[4]);
					Arrays.sort(A);
				}
				
				
				字串 = (((A[0]<10)?"0"+A[0]+" ":A[0]+" ")+((A[1]<10)?"0"+A[1]+" ":A[1]+" ")+((A[2]<10)?"0"+A[2]+" ":A[2]+" ")+((A[3]<10)?"0"+A[3]+" ":A[3]+" ")+((A[4]<10)?"0"+A[4]+" ":A[4]+" ")+((A[5]<10)?"0"+A[5]+" ":A[5]+" ")+"\n");
				TA.append(字串);
			}
		}
		else if (btn == a3) 
			{
				TA.setText("");
				for (int j = 0; j < 3; j++)
				{
					for (int z = 0; z < A.length; z++) 
					{
						A[0] = (int) (Math.random() * 49 + 1);
						do {
							A[1] = (int) (Math.random() * 49 + 1);
						} while (A[1] == A[0]);
						do {
							A[2] = (int) (Math.random() * 49 + 1);
						} while (A[2] == A[0] || A[2] == A[1]);
						do {
							A[3] = (int) (Math.random() * 49 + 1);
						} while (A[3] == A[0] || A[3] == A[1] || A[3] == A[2]);
						do {
							A[4] = (int) (Math.random() * 49 + 1);
						} while (A[4] == A[0] || A[4] == A[1] || A[4] == A[2] || A[4] == A[3]);
						do {
							A[5] = (int) (Math.random() * 49 + 1);
						} while (A[5] == A[0] || A[5] == A[1] || A[5] == A[2] || A[5] == A[3] || A[5] == A[4]);
						Arrays.sort(A);
					}

					字串 = (((A[0]<10)?"0"+A[0]+" ":A[0]+" ")+((A[1]<10)?"0"+A[1]+" ":A[1]+" ")+((A[2]<10)?"0"+A[2]+" ":A[2]+" ")+((A[3]<10)?"0"+A[3]+" ":A[3]+" ")+((A[4]<10)?"0"+A[4]+" ":A[4]+" ")+((A[5]<10)?"0"+A[5]+" ":A[5]+" ")+"\n");
					TA.append(字串);
				}
			}
		else if (btn == a4) {
				TA.setText("");
				for (int j = 0; j < 4; j++) {
					for (int z = 0; z < A.length; z++) {
						A[0] = (int) (Math.random() * 49 + 1);
						do {
							A[1] = (int) (Math.random() * 49 + 1);
						} while (A[1] == A[0]);
						do {
							A[2] = (int) (Math.random() * 49 + 1);
						} while (A[2] == A[0] || A[2] == A[1]);
						do {
							A[3] = (int) (Math.random() * 49 + 1);
						} while (A[3] == A[0] || A[3] == A[1] || A[3] == A[2]);
						do {
							A[4] = (int) (Math.random() * 49 + 1);
						} while (A[4] == A[0] || A[4] == A[1] || A[4] == A[2] || A[4] == A[3]);
						do {
							A[5] = (int) (Math.random() * 49 + 1);
						} while (A[5] == A[0] || A[5] == A[1] || A[5] == A[2] || A[5] == A[3] || A[5] == A[4]);
						Arrays.sort(A);
					}
					字串 = (((A[0]<10)?"0"+A[0]+" ":A[0]+" ")+((A[1]<10)?"0"+A[1]+" ":A[1]+" ")+((A[2]<10)?"0"+A[2]+" ":A[2]+" ")+((A[3]<10)?"0"+A[3]+" ":A[3]+" ")+((A[4]<10)?"0"+A[4]+" ":A[4]+" ")+((A[5]<10)?"0"+A[5]+" ":A[5]+" ")+"\n");
					TA.append(字串);
				}
			}
		else if (btn == a5) 
			{
				TA.setText("");
				for (int j = 0; j < 5; j++) 
				{
					for (int z = 0; z < A.length; z++) 
					{
						A[0] = (int) (Math.random() * 49 + 1);
						do {
							A[1] = (int) (Math.random() * 49 + 1);
						} while (A[1] == A[0]);
						do {
							A[2] = (int) (Math.random() * 49 + 1);
						} while (A[2] == A[0] || A[2] == A[1]);
						do {
							A[3] = (int) (Math.random() * 49 + 1);
						} while (A[3] == A[0] || A[3] == A[1] || A[3] == A[2]);
						do {
							A[4] = (int) (Math.random() * 49 + 1);
						} while (A[4] == A[0] || A[4] == A[1] || A[4] == A[2] || A[4] == A[3]);
						do {
							A[5] = (int) (Math.random() * 49 + 1);
						} while (A[5] == A[0] || A[5] == A[1] || A[5] == A[2] || A[5] == A[3] || A[5] == A[4]);
						Arrays.sort(A);
					}
					字串 = (((A[0]<10)?"0"+A[0]+" ":A[0]+" ")+((A[1]<10)?"0"+A[1]+" ":A[1]+" ")+((A[2]<10)?"0"+A[2]+" ":A[2]+" ")+((A[3]<10)?"0"+A[3]+" ":A[3]+" ")+((A[4]<10)?"0"+A[4]+" ":A[4]+" ")+((A[5]<10)?"0"+A[5]+" ":A[5]+" ")+"\n");
					TA.append(字串);
				}
			} 
			else if (btn == 關閉)
				System.exit(500);
			else if (btn == 回前頁)
				dispose();
			else if (btn == 清除)
				TA.setText("");			
	}
}
class 計算機 {
	private Frame frm=new Frame("計算機");
	private Panel pn1=new Panel(new GridLayout(4,3));
	private Panel pn2=new Panel(new GridLayout(4,1));
	private Label lab=new Label("0",Label.RIGHT);
	
	private Button 加=new Button("+");
	private Button 減=new Button("-");
	private Button 乘=new Button("*");
	private Button 除=new Button("/");
	private Button 等於=new Button("=");
	
	private Button A[]=new Button[10];
	private long 暫存;
	private byte op;
	
	private Button 關閉 = new Button("關閉");
	private Button 回前頁 = new Button("回前頁");
	private Button 清除=new Button("清除");
	
	
	public 計算機 (){
			frm.setLayout(null);
			frm.setBounds(500,300,300,300);
			frm.setBackground(Color.PINK);
			frm.setResizable(false);
			
			lab.setBounds(20,40,260,35);
			lab.setBackground(Color.YELLOW);
			lab.setFont(new Font("Arial", Font.PLAIN, 20));
			
			pn1.setBounds(20,80,200,150);
			pn2.setBounds(220,80,60,150);
			關閉.setBounds(170,240, 50, 40);
			關閉.setFont(new Font("Arial", Font.PLAIN, 12));
			關閉.addActionListener((ActionListener) new ActLis());
			frm.add(關閉);
			回前頁.setBounds(220,240, 50, 40);
			回前頁.setFont(new Font("Arial", Font.PLAIN, 12));
			回前頁.addActionListener((ActionListener) new ActLis());
			frm.add(回前頁);
			
			for(int i=9;i>=0;i--)
			{
			    A[i]=new Button(Integer.toString(i));
			    A[i].setFont(new Font("Arial", Font.PLAIN, 20));
			    pn1.add(A[i]);
			    A[i].addActionListener((ActionListener) new ActLis());
			}
				
			清除.setFont(new Font("Arial", Font.PLAIN, 12));
			pn1.add(清除);
			清除.addActionListener(new ActLis());
			
			等於.setFont(new Font("Arial", Font.PLAIN, 20));
			pn1.add(等於);
			等於.addActionListener(new ActLis());
		
			加.setFont(new Font("Arial", Font.PLAIN, 20));
			pn2.add(加);
			加.addActionListener(new ActLis());
			
			減.setFont(new Font("Arial", Font.PLAIN, 20));
			pn2.add(減);
			減.addActionListener(new ActLis());
			
			乘.setFont(new Font("Arial", Font.PLAIN, 20));
			pn2.add(乘);
			乘.addActionListener(new ActLis());
			
			除.setFont(new Font("Arial", Font.PLAIN, 20));
			pn2.add(除);
			除.addActionListener(new ActLis());
		
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){System.exit(0);}});  
		frm.add(lab);
		frm.add(pn1);
		frm.add(pn2);
		frm.setVisible(true);
	}
	
	
	
	public class ActLis implements ActionListener
	{
	public void actionPerformed(ActionEvent e)throws NumberFormatException,ArithmeticException{
	    long result;//存放由字串轉成的數值
	      
	        Button btn=(Button) e.getSource();
	        try{
	              //處理數值1-9
	              for(int i=0;i<=9;i++){
	                  if(btn==A[i]){
	                      output_digit(A[i]);
	                      
	                      break;
	                  }
	              }
	              if(btn==清除){
	                  result=0L;//把儲存的結果歸0
	                  暫存=0L;
	                  op=0;
	                  lab.setText(Long.toString(暫存));
	              }else if(btn==加){
	                  save_num(加);
	                  op=1;
	              }else if(btn==減){
	                  save_num(減);
	                  op=2;
	              }else if(btn==乘){
	                  save_num(乘);                   
	                  op=3;
	              }else if(btn==除){
	                  save_num(除);
	                  op=4;
	              }else if(btn==等於){
	                  result=Long.parseLong(lab.getText());
	             
	                  switch(op){
	                      case 1:
	                          暫存+=result;
	                          break;
	                      case 2:
	                          暫存-=result;
	                          break;
	                      case 3:
	                          暫存*=result;
	                          break;
	                      case 4:
	                          暫存/=result;
	                          break;
	                      default:
	                  }
	                  result=0L;
	                  
	                  lab.setText(Long.toString(暫存));
	              }
	            else if (btn == 關閉)
	      			System.exit(500);
	      		else if (btn == 回前頁)
	      			frm.dispose();
	   }catch(NumberFormatException ne){
	       
	    }catch(ArithmeticException ae){
	        
	    }   
	}
	  
	  private void output_digit(Button btn){
	lab.setText(Long.toString(Long.parseLong(lab.getText()+btn.getLabel())));
	}
	   
	  private void save_num(Button oper){
	      暫存=Long.parseLong(lab.getText());
	       lab.setText(Long.toString(0L));
	  }
	}
}
