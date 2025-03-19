package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    private final ILine line;

    public LineDrawerAdapter(ILine chosenLine) {
        super();
        line = chosenLine;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x, y);

        edu.kis.powp.jobs2d.features.DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter";
    }
}