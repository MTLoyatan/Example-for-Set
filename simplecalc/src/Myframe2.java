import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Myframe2   extends JFrame{
		
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lblresult;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtresult;
	private JButton btnsum;
	private JButton btnsubtract;
	
	public Myframe2 (){
		super("my calculator");
		setLayout(new FlowLayout());
		lbl1 = new JLabel("number1");
		lbl2 = new JLabel("number2");
		lblresult = new JLabel("result");
		txt1= new JTextField(5);
		txt2= new JTextField(5);
		txtresult = new JTextField(5);
		btnsum= new JButton("+");
		btnsubtract = new JButton("-");
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		System.out.println();
		add(lblresult);
		add(txtresult);
		
		btnsum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int num1=Integer.parseInt(txt1.getText());
				int num2 =Integer.parseInt(txt2.getText());
				int sumation= num1+num2;
				txtresult.setText(""+sumation);
			}
		});
		add(btnsum);
		
		btnsubtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			int num1 = Integer.parseInt(txt1.getText())	;
			int num2= Integer.parseInt(txt2.getText());
			int subtractnumbers= num1-num2;
			txtresult.setText(""+subtractnumbers);
			}
		});
		add(btnsubtract);
		
	}
	
	
	
	
}
