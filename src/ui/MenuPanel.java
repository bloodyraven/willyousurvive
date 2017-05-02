package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import models.LifeModel;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	private JButton inventoryButton = new JButton("Inventaire"), mapButton = new JButton("Carte"), saveButton = new JButton("Sauver");
	private LifePanel lp;
	private HungryPanel hp;
	private LifeModel lm;
	
	public MenuPanel(JPanel papa) {
		this.setPapa(papa);
		lp = new LifePanel(this);
		hp = new HungryPanel(this);
		this.add(lp);
		this.add(hp);
		this.add(inventoryButton);
		this.add(mapButton);
		lm=new LifeModel();
		lm.addObserver(lp);
		inventoryButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lm.setVie(lm.getVie()-1);
			}
		});
	}

	public JPanel getPapa() {
		return papa;
	}

	public void setPapa(JPanel papa) {
		this.papa = papa;
	}

	public JButton getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(JButton saveButton) {
		this.saveButton = saveButton;
	}

	public LifePanel getLp() {
		return lp;
	}

	public void setLp(LifePanel lp) {
		this.lp = lp;
	}
}
