import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class countries  extends JFrame {
			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbl1;
	private JComboBox<?> cmb1;
	
	
	public countries(){
		
		super("home work");
		setLayout(new FlowLayout());
		String country[]={"russia","sweden","unated stats","australia"};
		final Icon icones[]={
				new ImageIcon(getClass().getResource("rus.jpg")),
				new ImageIcon(getClass().getResource("sws.jpg")),
				new ImageIcon(getClass().getResource("usa.jpg")),
				new ImageIcon(getClass().getResource("aus.jpg"))
				};
		lbl1= new JLabel();
		 cmb1= new JComboBox(country);
		  lbl1.setIcon(new ImageIcon(getClass().getResource("rus.jpg")));
		 
		cmb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
			lbl1.setIcon(icones[cmb1.getSelectedIndex()]);	
			}
		});
		add(lbl1);
		 add(cmb1);
		
	}
}
