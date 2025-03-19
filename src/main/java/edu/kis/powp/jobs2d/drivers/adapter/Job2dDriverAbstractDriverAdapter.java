package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Job2dDriverAbstractDriverAdapter extends AbstractDriver {
    private final Job2dDriver driver;

    public Job2dDriverAbstractDriverAdapter(Job2dDriver driver) {
        super(0, 0);
        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y){
        driver.setPosition(this.getX(), this.getY());
        driver.operateTo(x, y);
        setPosition(x,y);
    }
}
