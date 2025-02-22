package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.List;
import s0.c1;
import sf.j;
import v0.h;

public final class t2 implements c1 {
    public h B = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f1466a;

    /* renamed from: b  reason: collision with root package name */
    public final List<t2> f1467b;

    /* renamed from: c  reason: collision with root package name */
    public Float f1468c = null;

    /* renamed from: d  reason: collision with root package name */
    public Float f1469d = null;

    /* renamed from: e  reason: collision with root package name */
    public h f1470e = null;

    public t2(int i8, ArrayList arrayList) {
        j.f(arrayList, "allScopes");
        this.f1466a = i8;
        this.f1467b = arrayList;
    }

    public final boolean j() {
        return this.f1467b.contains(this);
    }
}
