package ui;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import console.Commandes;
import bean.CommandResponse;
import bean.Player;

public class ConsolePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private String consoleContent="";
	private TextArea ta;
	private TextField tf;
	private JPanel papa;
	private Player player;
	
	public ConsolePanel(JPanel papa, Player player) {
		this.setPlayer(player);
		this.setPapa(papa);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		final TextArea ta = new TextArea();
		ta.setFocusable(false);
		final TextField tf = new TextField();
		this.add(ta);
		this.add(tf);
		tf.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER && !tf.getText().equals("")) {
					ta.append("> "+tf.getText()+"\n");
					CommandResponse response = Commandes.sendCommand(tf.getText(), player);
					if(response!=null)
						ta.append("[noeud "+player.getNoeudActuel().getNom()+"] "+response.getResponse()+"\n");
					tf.setText("");
				}
			}
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
	}

	public String getConsoleContent() {
		return consoleContent;
	}

	public void setConsoleContent(String consoleContent) {
		this.consoleContent = consoleContent;
	}

	public TextArea getTa() {
		return ta;
	}

	public void setTa(TextArea ta) {
		this.ta = ta;
	}

	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}

	public JPanel getPapa() {
		return papa;
	}

	public void setPapa(JPanel papa) {
		this.papa = papa;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
