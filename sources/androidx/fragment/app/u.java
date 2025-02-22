package androidx.fragment.app;

import android.content.res.Configuration;
import c2.a;
import s1.k;

public final /* synthetic */ class u implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2145b;

    public /* synthetic */ u(Object obj, int i8) {
        this.f2144a = i8;
        this.f2145b = obj;
    }

    public final void accept(Object obj) {
        int i8 = this.f2144a;
        Object obj2 = this.f2145b;
        switch (i8) {
            case 0:
                Configuration configuration = (Configuration) obj;
                ((x) obj2).P.a();
                return;
            default:
                i0 i0Var = (i0) obj2;
                k kVar = (k) obj;
                if (i0Var.L()) {
                    i0Var.m(kVar.f14495a, false);
                    return;
                }
                return;
        }
    }
}
