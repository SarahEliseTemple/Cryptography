package CryptographyTry2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Name: Sarah Temple
 * Date: Decemebr 1 2020
 * THis is probably just going to be comments. I have to go to bed by ten so I can babysit for ten hours tomorrow. Ah I just want a break.
 * 
 * This is actually maybe going to be a cryptography project someday. I just dont think today is that day.     
 */
import javax.swing.JFrame;
import javax.swing.JTextField;


public class CryptographyTry2 implements ActionListener{
	JFrame frame = new JFrame();
	JTextField textField = new JTextField(100);
    
     
	public CryptographyTry2() {
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		textField.addActionListener(this);
	}
	public static void main(String[] args) {
		new CryptographyTry2();

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
