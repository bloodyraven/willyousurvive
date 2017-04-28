package main;

import javax.swing.JFrame;

import bean.Player;
import ui.GamePanel;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Will You Survive");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new GamePanel(f, new Player("Johnny")));
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
