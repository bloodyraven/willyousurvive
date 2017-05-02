package ui;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import models.LifeModel;

public class LifePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	private JLabel label;
	
	public LifePanel(JPanel papa) {
		this.setPapa(papa);
		setLabel(new JLabel("100/100HP"));
		this.add(label);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		label.setText(((LifeModel)arg0).getVie()+"/100HP");
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
