package tarea.com.init;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;

import tarea.com.mvc.controllers.ControllerPrincipal;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("k");
		
		new FlatArcDarkIJTheme().setup();
		new ControllerPrincipal().init();

	}

}
