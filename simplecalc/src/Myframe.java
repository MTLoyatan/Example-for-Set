import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Myframe extends JFrame {

	private JLabel lblNum1;
	private JLabel lblNum2;
	private JLabel lblResult;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JButton btnSum;
	private JButton btnSubtract;

	public Myframe() {

		super("simple caculator");
		setLayout(new FlowLayout());
		lblNum1 = new JLabel("number1:");
		lblNum2 = new JLabel("number2:");
		lblResult = new JLabel("result:");
		txtNum1 = new JTextField(5);
		txtNum2 = new JTextField(5);
		btnSum = new JButton("+");
		btnSubtract = new JButton("-");
		add(lblNum1);
		add(txtNum1);
		add(lblNum2);
		add(txtNum2);

		btnSum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int n1 = Integer.parseInt(txtNum1.getText());
					int n2 = Integer.parseInt(txtNum2.getText());
					int sum = n1 + n2;
					lblResult.setText("result:" + sum);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		add(btnSum);

		btnSubtract.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int n1 = Integer.parseInt(txtNum1.getText());
					int n2 = Integer.parseInt(txtNum2.getText());
					int sub = n1 - n2;
					lblResult.setText("result:" + sub);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		add(btnSubtract);
		add(lblResult);
	}

}
