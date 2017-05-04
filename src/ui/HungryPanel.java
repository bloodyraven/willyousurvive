package ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;

import models.HungryModel;

public class HungryPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	private JLabel label;
	private JPopupMenu popmenu = new JPopupMenu();
	private int value=100;
	
	public HungryPanel(JPanel papa) {
		this.setPapa(papa);
		setLabel(new JLabel("Repu"));
		this.add(label);
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				popmenu.removeAll();
				if(e.getButton() == MouseEvent.BUTTON1) {
					JProgressBar jpb = new JProgressBar(0, 100);
					jpb.setValue(value);
					popmenu.add(jpb);
				}
				popmenu.show(papa, e.getX() + 75, e.getY() - 20);
				setFocusable(true);
				requestFocusInWindow();
			}
		});
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		this.value = ((HungryModel)arg0).getHungry();
		if(value >= 80)
			label.setText("Repu");
		if(value < 80 && value >= 60) {
			label.setText("Faible faim");
		}
		if(value < 60 && value >= 45) {
			label.setText("Faim ressentie");
		}
		if(value < 45 && value >= 30) {
			label.setText("Faim importante");
		}
		if(value < 30 && value >= 0) {
			label.setText("Affamé");
		}
	}

	public JPanel getPapa() {
		return papa;
	}

	public void setPapa(JPanel papa) {
		this.papa = papa;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
