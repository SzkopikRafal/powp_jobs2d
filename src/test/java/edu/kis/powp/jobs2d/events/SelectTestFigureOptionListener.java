package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final static String figureJoe1 = "Figure Joe 1";
	private final static String figureJoe2 = "Figure Joe 2";
	private final static String figureJane1 = "Figures Jane";

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case figureJoe1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case figureJoe2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case figureJane1:
				FiguresJane.figureScript(new Job2dDriverAbstractDriverAdapter(driverManager.getCurrentDriver()));
				break;
		}
	}
}
