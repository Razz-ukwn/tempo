package androidx.compose.ui.platform;

import android.graphics.Rect;
import h0.d;
import q4.a;
import sf.j;
import v0.p;
import x0.g;

public final class e extends b {

    /* renamed from: e  reason: collision with root package name */
    public static e f1274e;

    /* renamed from: c  reason: collision with root package name */
    public g f1275c;

    /* renamed from: d  reason: collision with root package name */
    public p f1276d;

    public e() {
        new Rect();
    }

    public final int[] a(int i8) {
        if (d().length() <= 0 || i8 >= d().length()) {
            return null;
        }
        try {
            p pVar = this.f1276d;
            if (pVar != null) {
                d d10 = pVar.d();
                a.g(d10.f9077d - d10.f9075b);
                if (this.f1275c == null) {
                    j.l("layoutResult");
                    throw null;
                }
                throw null;
            }
            j.l("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int[] b(int i8) {
        if (d().length() <= 0 || i8 <= 0) {
            return null;
        }
        try {
            p pVar = this.f1276d;
            if (pVar != null) {
                d d10 = pVar.d();
                a.g(d10.f9077d - d10.f9075b);
                d();
                if (this.f1275c == null) {
                    j.l("layoutResult");
                    throw null;
                }
                throw null;
            }
            j.l("node");
            throw null;
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
