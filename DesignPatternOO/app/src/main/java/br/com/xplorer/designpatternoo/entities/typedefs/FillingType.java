package br.com.xplorer.designpatternoo.entities.typedefs;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static br.com.xplorer.designpatternoo.entities.typedefs.FillingType.CHEESE;
import static br.com.xplorer.designpatternoo.entities.typedefs.FillingType.TOMATO;

/**
 * Created by r028367 on 27/03/2018.
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({TOMATO, CHEESE})
public @interface FillingType {
    int TOMATO = 1;
    int CHEESE= 2;
}
