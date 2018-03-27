package br.com.xplorer.designpatternoo.entities;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static br.com.xplorer.designpatternoo.entities.BreadType.BAGUETTE;
import static br.com.xplorer.designpatternoo.entities.BreadType.BRIOCHE;

/**
 * Created by r028367 on 27/03/2018.
 */


@Retention(RetentionPolicy.SOURCE)
@IntDef({BRIOCHE, BAGUETTE})
public @interface BreadType {
    int BRIOCHE = 0;
    int BAGUETTE = 1;
}
