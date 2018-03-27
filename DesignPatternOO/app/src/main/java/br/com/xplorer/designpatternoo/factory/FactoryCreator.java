package br.com.xplorer.designpatternoo.factory;

import br.com.xplorer.designpatternoo.abstractfactory.AbstractFactory;
import br.com.xplorer.designpatternoo.entities.typedefs.FactoryType;

/**
 * Created by r028367 on 27/03/2018.
 */

public class FactoryCreator {

    public static AbstractFactory get(@FactoryType int type) {
        AbstractFactory abstractFactory = null;
        switch (type) {
            case FactoryType.BREAD_FACTORY:
                abstractFactory = new BreadFactory();
                break;
            case FactoryType.FILLING_FACTORY:
                abstractFactory = new FillingFactory();
        }

        return abstractFactory;
    }

}
