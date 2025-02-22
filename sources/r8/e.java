package r8;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.z;

public final class e extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14106b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextPaint f14107c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ z f14108d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f14109e;

    public e(d dVar, Context context, TextPaint textPaint, z zVar) {
        this.f14109e = dVar;
        this.f14106b = context;
        this.f14107c = textPaint;
        this.f14108d = zVar;
    }

    public final void t(int i8) {
        this.f14108d.t(i8);
    }

    public final void y(Typeface typeface, boolean z10) {
        this.f14109e.g(this.f14106b, this.f14107c, typeface);
        this.f14108d.y(typeface, z10);
    }
}
