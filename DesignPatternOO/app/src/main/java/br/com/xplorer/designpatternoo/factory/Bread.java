package br.com.xplorer.designpatternoo.factory;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by r028367 on 22/03/2018.
 */

public interface Bread {

    static final int VEGAN = 0;
    static final int NOT_VEGAN = 1;
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({VEGAN, NOT_VEGAN})
    @interface Type {}

    @Type
    int getType();
    String getDescription();
    long getCalories();
}
