package r2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.f;

public final class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f13792a;

    public h(TransformationMethod transformationMethod) {
        this.f13792a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f13792a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || f.a().b() != 1) {
            return charSequence;
        }
        f a10 = f.a();
        a10.getClass();
        return a10.f(0, charSequence.length(), charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i8, Rect rect) {
        TransformationMethod transformationMethod = this.f13792a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i8, rect);
        }
    }
}
