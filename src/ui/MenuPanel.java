package ui;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	private JButton inventoryButton = new JButton("Inventaire"), mapButton = new JButton("Carte"), saveButton = new JButton("Sauver");
	private LifePanel lp;
	private HungryPanel hp;
	
	public MenuPanel(JPanel papa) {
		this.setPapa(papa);
		lp = new LifePanel(this);
		hp = new HungryPanel(this);
		this.add(lp);
		this.add(hp);
		this.add(inventoryButton);
		this.add(mapButton);
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
