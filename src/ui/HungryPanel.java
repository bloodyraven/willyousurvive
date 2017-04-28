package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HungryPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel papa;
	
	public HungryPanel(JPanel papa) {
		this.setPapa(papa);
		this.add(new JLabel("Affamé"));
	}

	public JPanel getPapa() {
		return papa;
	}

	public void setPapa(JPanel papa) {
		this.papa = papa;
	}
}
