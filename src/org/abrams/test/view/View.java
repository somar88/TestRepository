package org.abrams.test.view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1366;
	private static final int HIGHT = WIDTH * 3 / 4;

	public View() {
		this.setSize(new Dimension(WIDTH, HIGHT));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
}
