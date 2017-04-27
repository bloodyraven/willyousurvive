package main;

import javax.swing.JFrame;

import ui.ConsolePanel;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Will You Survive");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new ConsolePanel());
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
