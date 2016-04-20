package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageButton;

class VisibilityAwareImageButton extends ImageButton {
    private int mUserSetVisibility;

    public VisibilityAwareImageButton(Context context) {
        super(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mUserSetVisibility = this.getVisibility();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public VisibilityAwareImageButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mUserSetVisibility = this.getVisibility();
    }

    public void setVisibility(int visibility) {
        this.internalSetVisibility(visibility, true);
    }

    final void internalSetVisibility(int visibility, boolean fromUser) {
        super.setVisibility(visibility);
        if(fromUser) {
            this.mUserSetVisibility = visibility;
        }

    }


    final int getUserSetVisibility() {
        return this.mUserSetVisibility;
    }
}