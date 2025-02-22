package androidx.compose.ui.platform;

import sf.j;
import x0.g;

public final class d extends b {

    /* renamed from: d  reason: collision with root package name */
    public static d f1271d;

    /* renamed from: c  reason: collision with root package name */
    public g f1272c;

    public final int[] a(int i8) {
        if (d().length() <= 0 || i8 >= d().length()) {
            return null;
        }
        if (i8 < 0) {
            if (this.f1272c == null) {
                j.l("layoutResult");
                throw null;
            }
            throw null;
        } else if (this.f1272c == null) {
            j.l("layoutResult");
            throw null;
        } else {
            throw null;
        }
    }

    public final int[] b(int i8) {
        if (d().length() <= 0 || i8 <= 0) {
            return null;
        }
        if (i8 > d().length()) {
            if (this.f1272c == null) {
                j.l("layoutResult");
                throw null;
            }
            d();
            throw null;
        } else if (this.f1272c == null) {
            j.l("layoutResult");
            throw null;
        } else {
            throw null;
        }
    }
}
