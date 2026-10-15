package tarea.com.mvc.controllers;

import tarea.com.mvc.views.ViewPrincipal;

public class ControllerPrincipal {

	public ViewPrincipal vp;
	public ControllerGenero cg;
	public ControllerSeries series;

	public ControllerPrincipal() {
		vp = new ViewPrincipal();
		cg = new ControllerGenero();
		series = new ControllerSeries(this);
	}
	
	public void init(){
		vp.init();
		
		new ControllerSeries(this).index();
	}
}
