package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LifePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	
	public LifePanel(JPanel papa) {
		this.setPapa(papa);
		this.add(new JLabel("100/100HP"));
	}

	public JPanel getPapa() {
		return papa;
	}

	public void setPapa(JPanel papa) {
		this.papa = papa;
	}

}
