package br.com.xplorer.designpatternoo.entities.typedefs;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static br.com.xplorer.designpatternoo.entities.typedefs.FactoryType.BREAD_FACTORY;
import static br.com.xplorer.designpatternoo.entities.typedefs.FactoryType.FILLING_FACTORY;

/**
 * Created by r028367 on 27/03/2018.
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({BREAD_FACTORY, FILLING_FACTORY})
public @interface FactoryType {
    int BREAD_FACTORY = 1;
    int FILLING_FACTORY = 2;
}
