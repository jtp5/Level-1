import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class Sunday implements KeyListener{
	JFrame frame = new JFrame();
	int x = 200;
	int y = 200;
	Random rand = new Random();
public static void main(String[] args) {
	Sunday s = new Sunday();
	s.setup();
	
}

void setup(){
	frame.addKeyListener(this);
	frame.setSize(x, y);
	frame.show();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

@Override

public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyCode() == KeyEvent.VK_ENTER){
		x += 100;
		y += 100;
		frame.setSize(rand.nextInt(1001), rand.nextInt(1001));
		
	}
	if(e.getKeyCode() == KeyEvent.VK_SPACE){
		frame.setVisible(rand.nextBoolean());
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
