package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDriverAbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final static String figureJoe1 = "Figure Joe 1";
	private final static String figureJoe2 = "Figure Joe 2";
	private final static String figureJane1 = "Figures Jane";
	private final static String figure = "Figure4";
	private final static String figure2 = "Figure5";
	private final static String figure3 = "Figure6";

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
			case figure:
				DriverCommand driverCommand = new SetPositionCommand(0, 0);
				DriverCommand driverCommand1 = new OperateToCommand(0, 100);
				DriverCommand driverCommand2 = new OperateToCommand(100, 100);
				DriverCommand driverCommand3 = new OperateToCommand(100, 0);
				DriverCommand driverCommand4 = new OperateToCommand(0, 0);

				driverCommand.execute(driverManager.getCurrentDriver());
				driverCommand1.execute(driverManager.getCurrentDriver());
				driverCommand2.execute(driverManager.getCurrentDriver());
				driverCommand3.execute(driverManager.getCurrentDriver());
				driverCommand4.execute(driverManager.getCurrentDriver());

				break;
			case figure2:
				ComplexCommand complexCommand = new ComplexCommand();
				complexCommand.addCommand(new SetPositionCommand(-100, 0));
				complexCommand.addCommand(new OperateToCommand(100, 0));
				complexCommand.addCommand(new OperateToCommand(100, 100));
				complexCommand.addCommand(new OperateToCommand(-100, 100));
				complexCommand.addCommand(new OperateToCommand(-100, 0));
				complexCommand.execute(driverManager.getCurrentDriver());
				break;
			case figure3:
				ComplexCommand complexCommand1 = new ComplexCommand();
				complexCommand1.addCommand(new SetPositionCommand(-100, 0));
				complexCommand1.addCommand(new OperateToCommand(50, 100));
				complexCommand1.addCommand(new OperateToCommand(100, 0));
				complexCommand1.addCommand(new OperateToCommand(-100, 0));
				complexCommand1.execute(driverManager.getCurrentDriver());
				break;
		}
	}
}
