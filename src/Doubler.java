import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Doubler implements ActionListener{
static JFrame frame = new JFrame();
static JTextField field = new JTextField(10);
static JButton button1 = new JButton();
static JButton button2 = new JButton();
static JPanel panel = new JPanel();
public static void main(String[] args) {
Doubler hi = new Doubler();
hi.createeli();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600, 600);
frame.setVisible(true);
frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(field);
button1.setText("Double");
button2.setText("Square");
field.setEditable(true);
frame.pack();
}
public void createeli(){
	button1.addActionListener(this);
	button2.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	String s = field.getText();
	int x = Integer.parseInt(s);
	if(buttonPressed == button1){
		JOptionPane.showMessageDialog(null, (x + x));
	}
	if(buttonPressed == button2){
		JOptionPane.showMessageDialog(null, (x*x));
	}
}
}
