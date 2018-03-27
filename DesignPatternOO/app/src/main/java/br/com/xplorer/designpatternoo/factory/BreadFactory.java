package br.com.xplorer.designpatternoo.factory;

import br.com.xplorer.designpatternoo.abstractfactory.AbstractFactory;
import br.com.xplorer.designpatternoo.entities.Baguette;
import br.com.xplorer.designpatternoo.entities.abs.Bread;
import br.com.xplorer.designpatternoo.entities.typedefs.BreadType;
import br.com.xplorer.designpatternoo.entities.Brioche;
import br.com.xplorer.designpatternoo.entities.abs.Filling;

/**
 * Created by r028367 on 27/03/2018.
 */

public class BreadFactory extends AbstractFactory {

    private static Bread create(@BreadType int type) {
        Bread bread = null;
        switch (type) {
            case BreadType.BAGUETTE:
                bread = new Baguette();
                break;
            case BreadType.BRIOCHE:
                bread = new Brioche();
                break;
        }

        return bread;
    }

    public Bread createBread(int type) {
        return null;
    }

    public Bread createBread(Bread bread) {
        return null;
    }


    public Bread createBread(int type, String name, double calories) {
        return null;
    }

}
