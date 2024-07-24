import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencere extends JPanel implements ActionListener,MouseListener {
	int x,y;
	
	int yuk,gen;
	
	int artisMiktari=4;
	
	public KarePencere() {
		super();
		
		addMouseListener(this);
		
		x=100;
		y=100;
		
		yuk=0;
		gen=0;
		
		Timer zaman = new Timer(150, this);
		zaman.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x, y, gen, yuk);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x-=artisMiktari/2;
		y-=artisMiktari/2;
		
		yuk+=artisMiktari;
		gen+=artisMiktari;
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		x = e.getX();
		y = e.getY();
		
		gen = 0;
		yuk = 0;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
