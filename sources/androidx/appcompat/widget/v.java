package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.quickkonnect.silencio.R;

public final class v extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final w f1123a;

    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        c1.a(this, getContext());
        w wVar = new w(this);
        this.f1123a = wVar;
        wVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f1123a;
        Drawable drawable = wVar.f1133e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = wVar.f1132d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1123a.f1133e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1123a.d(canvas);
    }
}
