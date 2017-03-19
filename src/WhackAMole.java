import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
void drawButtons(int x){
	JButton[] button = new JButton[24];
	frame.add(panel);
	frame.setVisible(true);
	for (int i = 0; i < 24; i++) {
		button[i] = new JButton();
		panel.add(button[i]);
		button[i].addActionListener(this);
	}
	button[x].setText("Mole");
	frame.setSize(300, 350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
Random r = new Random();
public static void main(String[] args) {
	Random random = new Random();
	WhackAMole eli = new WhackAMole();
	eli.drawButtons(random.nextInt(24));
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(!buttonPressed.getText().equals("Mole")){
		speak("Dork!");
		frame.removeAll();
		frame = new JFrame();
		drawButtons(r.nextInt(24));
	}
}
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}

}
