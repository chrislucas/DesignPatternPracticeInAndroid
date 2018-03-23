package br.com.xplorer.designpatternoo.entities;

import br.com.xplorer.designpatternoo.factory.Bread;

/**
 * Created by r028367 on 22/03/2018.
 */

public class Baguette implements Bread {


    @Type private int type;

    public Baguette(@Type int type) {
        this.type = type;
    }


    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public long getCalories() {
        return 0;
    }
}
