package br.com.xplorer.designpatternoo.entities;

import br.com.xplorer.designpatternoo.entities.abs.Filling;
import br.com.xplorer.designpatternoo.entities.typedefs.FillingType;

/**
 * Created by r028367 on 27/03/2018.
 */

public class Tomato implements Filling {

    private @FillingType int type;
    private String description;
    private double calories;

    public Tomato(int type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setCalories(double calories) {
        this.calories = calories;
    }
}
