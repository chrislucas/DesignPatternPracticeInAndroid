package br.com.xplorer.designpatternoo.factory;

import br.com.xplorer.designpatternoo.abstractfactory.AbstractFactory;
import br.com.xplorer.designpatternoo.entities.abs.Bread;
import br.com.xplorer.designpatternoo.entities.Cheese;
import br.com.xplorer.designpatternoo.entities.abs.Filling;
import br.com.xplorer.designpatternoo.entities.typedefs.FillingType;
import br.com.xplorer.designpatternoo.entities.Tomato;

/**
 * Created by r028367 on 27/03/2018.
 */

public class FillingFactory extends AbstractFactory {

    private static Filling create(@FillingType int type) {
        Filling filling = null;
        switch (type) {
            case FillingType.TOMATO:
                filling = new Tomato(type);
                break;
            case FillingType.CHEESE:
                filling = new Cheese(type);
                break;
        }

        return filling;
    }

    public Filling createFilling(int type) {
        return FillingFactory.create(type);
    }

    public Filling createFilling(Filling filling) {
        Filling newFilling = FillingFactory.create(filling.getType());
        return newFilling;
    }

    public Filling createFilling(int type, String description, double calories) {
        Filling newFilling = FillingFactory.create(type);
        newFilling.setCalories(calories);
        newFilling.setDescription(description);
        return newFilling;
    }
}
