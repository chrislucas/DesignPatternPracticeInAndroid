package br.com.xplorer.designpatternoo.entities.abs;

import br.com.xplorer.designpatternoo.entities.typedefs.FillingType;

/**
 * Created by r028367 on 27/03/2018.
 */

public interface Filling extends Entities {
    public @FillingType int getType();
}
