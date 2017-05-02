package ui;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import models.HungryModel;

public class HungryPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	private JLabel label;
	
	public HungryPanel(JPanel papa) {
		this.setPapa(papa);
		setLabel(new JLabel("Affamé"));
		this.add(label);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		int hungry = ((HungryModel)arg0).getHungry();
		if(hungry >= 80)
			label.setText("Repu");
		if(hungry < 80 && hungry >= 60) {
			label.setText("Faible faim");
		}
		if(hungry < 60 && hungry >= 45) {
			label.setText("Faim ressentie");
		}
		if(hungry < 45 && hungry >= 30) {
			label.setText("Faim importante");
		}
		if(hungry < 30 && hungry >= 0) {
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

}
