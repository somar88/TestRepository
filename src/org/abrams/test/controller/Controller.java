package org.abrams.test.controller;

import org.abrams.test.model.Model;
import org.abrams.test.view.View;

public class Controller {
	private View view;
	private Model model;

	public Controller() {
		view = new View();
		model = new Model();
	}

	public void init() {
		this.view.setVisible(true);
	}
}
