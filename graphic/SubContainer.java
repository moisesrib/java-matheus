package graphic;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class SubContainer extends JInternalFrame {
	
	private static final long serialVersionUID = 1L;

	public JInternalFrame createContainer() {
		return new JInternalFrame("DEFAULT", false, false, false, false);
	}
	
	public void statusContainer(JInternalFrame iframe,String nameTitle, int x, int y) {
		iframe.setSize(350, 200);
		iframe.setTitle(nameTitle);
		iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		iframe.setLocation(x, y);
		setResizable(false);
		setLayout(null);
		iframe.setVisible(true);
	}
	
	public JLabel labelCustom(JLabel lblname,String name, int x, int y, int w, int h, int cor) {
		lblname = new JLabel(name);
		if(cor == 0) {
			lblname.setForeground(Color.red);
			
		} else if(cor == 1){
			lblname.setForeground(Color.blue);
		}  else if(cor == 4) {
			lblname.setForeground(new Color(0, 125, 127));
		} else if(cor == 5) {
			lblname.setForeground(new Color(128, 128, 0));
		}
		lblname.setBounds(x, y, w, h);
		return lblname;
	 }
	
	public JTextField txfCustom(final JTextField nameTxf, int x, int y, int w, int h, int cor) {
		 nameTxf.setBounds(x, y, w, h);
		 
		 if(cor == 0) {
			 nameTxf.setBackground(new Color(255, 158, 129));
			 nameTxf.setBorder(new LineBorder(Color.red));
		 } else if(cor == 1) {
			 nameTxf.setBackground(new Color(70, 130, 180));
			 nameTxf.setBorder(new LineBorder(Color.blue));
		 }  else if(cor == 4) {
			 nameTxf.setBackground(new Color(0, 125, 127));
			 nameTxf.setBorder(new LineBorder(new Color(0, 125, 127)));
		 }else if(cor == 5) {
			 nameTxf.setBackground(new Color(128, 128, 0));
			 nameTxf.setBorder(new LineBorder(new Color(128, 128, 0)));
		 } else {
			 nameTxf.setBackground(new Color(156, 156, 156));
			 nameTxf.setBorder(new LineBorder(Color.gray));
		 }
		 
		 return nameTxf;
	}
	

}
