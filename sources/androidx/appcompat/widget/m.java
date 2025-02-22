package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import cb.e;
import r2.f;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1075a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1076b;

    public m(TextView textView) {
        this.f1075a = textView;
        this.f1076b = new f(textView);
    }

    /* JADX INFO: finally extract failed */
    public final void a(AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = this.f1075a.getContext().obtainStyledAttributes(attributeSet, e.F, i8, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        this.f1076b.f13782a.b(z10);
    }

    public final void c(boolean z10) {
        this.f1076b.f13782a.c(z10);
    }
}
