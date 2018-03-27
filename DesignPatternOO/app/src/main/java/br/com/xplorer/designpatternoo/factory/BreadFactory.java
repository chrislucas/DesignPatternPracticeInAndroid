package br.com.xplorer.designpatternoo.factory;

import br.com.xplorer.designpatternoo.entities.Baguette;
import br.com.xplorer.designpatternoo.entities.Bread;
import br.com.xplorer.designpatternoo.entities.BreadType;
import br.com.xplorer.designpatternoo.entities.Brioche;

/**
 * Created by r028367 on 27/03/2018.
 */

public class BreadFactory {

    public static Bread create(@BreadType int type) {
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

}
