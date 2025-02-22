package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f943b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f944c;

    public b0(TextView textView, Typeface typeface, int i8) {
        this.f942a = textView;
        this.f943b = typeface;
        this.f944c = i8;
    }

    public final void run() {
        this.f942a.setTypeface(this.f943b, this.f944c);
    }
}
