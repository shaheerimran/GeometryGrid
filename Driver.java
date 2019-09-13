import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener, KeyListener {
	

	public void paint(Graphics g) {
		super.paintComponent(g);
		/*
		int counter = 0;
	    while(counter < 800){
	    	int y = (int)(Math.random()*300);
	    	g.drawLine(counter, 0, counter, y);
	    	counter++;
	    }
		
		int total = 0;
		int x = (int)(Math.random()*750);
		int y = (int)(Math.random()*550);
		int d = (int)(Math.random()*100);
		int r = (int)(Math.random()*255);
		int gr = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		Color rgb = new Color(r, gr, b);
		g.setColor(rgb);
		g.fillOval(x, y, d, d);
		i++;
		total += (d/2)*(d/2) * Math.PI;
		System.out.println(total);
		System.out.println(total);
		int i = 0;
		while(i < 1000){
		}
		*/
		
		g.setColor(Color.orange);
		g.fillRect(0, 0, 800, 600);
		int x1 = 0, x2 = 800, y1 = 570, y2 = 800;
		g.setColor(Color.red);
		while(y2 > 0){
			g.drawLine(x1, y1, x2, y2);
			y2 -= 10;
			x1 += 10;
		}
		
		x1 = 800;
		y1 = 600;
		x2 = 800;
		y2 = 0;
		while(x2 > 0){
			g.drawLine(x1, y1, x2, y2);
			x2 -= 5;
			y1 -= 5;
		}
		
		
		x1 = 800;
		y1 = 0;
		x2 = 0;
		y2 = -200;
		while(y2 < 600){
			g.drawLine(x1, y1, x2, y2);
			x1 -= 5;
			y2 += 5;
		}
		
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 570;
		while(x2 < 800){
			g.drawLine(x1, y1, x2, y2);
			x2 += 5;
			y1 += 5;
		}
		t.stop();
		
	}

	// function (method) for updating variables
	public void update() {

		
		

	} // end of update function, do not accidentally delete this curly bracket

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		update();
		repaint();

	}

	public static void main(String[] arg) {
		Driver d = new Driver();
	}

	public Driver() {

		JFrame f = new JFrame();
		f.setTitle("Pong");
		f.setSize(800	, 600);
		f.setBackground(Color.BLACK);
		f.setResizable(false);
		
		f.addKeyListener(this);
		
		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	Timer t;

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
