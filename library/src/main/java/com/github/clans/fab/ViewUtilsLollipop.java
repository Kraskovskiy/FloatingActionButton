package com.github.clans.fab;

import android.view.View;
import android.view.ViewOutlineProvider;

public class ViewUtilsLollipop {

    static void setBoundsViewOutlineProvider(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

}
