package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.Player;

public class GamePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private MenuPanel menuPanel;
	private ConsolePanel consolePanel;
	private JFrame f;
	private Player player;
	
	public GamePanel(JFrame f, Player player) {
		this.setF(f);
		menuPanel = new MenuPanel(this);
		consolePanel = new ConsolePanel(this, player);
		this.setLayout(new BorderLayout());
		this.add(menuPanel, BorderLayout.NORTH);
		this.add(consolePanel, BorderLayout.CENTER);
		setPlayer(player);
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public ConsolePanel getConsolePanel() {
		return consolePanel;
	}

	public void setConsolePanel(ConsolePanel consolePanel) {
		this.consolePanel = consolePanel;
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
