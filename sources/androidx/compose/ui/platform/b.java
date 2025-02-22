package androidx.compose.ui.platform;

import sf.j;

public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public String f1258a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1259b = new int[2];

    public final int[] c(int i8, int i10) {
        if (i8 < 0 || i10 < 0 || i8 == i10) {
            return null;
        }
        int[] iArr = this.f1259b;
        iArr[0] = i8;
        iArr[1] = i10;
        return iArr;
    }

    public final String d() {
        String str = this.f1258a;
        if (str != null) {
            return str;
        }
        j.l("text");
        throw null;
    }
}
