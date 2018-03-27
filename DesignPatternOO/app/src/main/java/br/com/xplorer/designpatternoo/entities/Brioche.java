package br.com.xplorer.designpatternoo.entities;


import br.com.xplorer.designpatternoo.entities.abs.Bread;

/**
 * Created by r028367 on 23/03/2018.
 */

public class Brioche implements Bread {

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getCalories() {
        return 0;
    }
}
