package androidx.fragment.app;

import android.content.Intent;
import c2.a;
import s1.a0;

public final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2154b;

    public /* synthetic */ v(Object obj, int i8) {
        this.f2153a = i8;
        this.f2154b = obj;
    }

    public final void accept(Object obj) {
        int i8 = this.f2153a;
        Object obj2 = this.f2154b;
        switch (i8) {
            case 0:
                Intent intent = (Intent) obj;
                ((x) obj2).P.a();
                return;
            default:
                i0 i0Var = (i0) obj2;
                a0 a0Var = (a0) obj;
                if (i0Var.L()) {
                    i0Var.r(a0Var.f14473a, false);
                    return;
                }
                return;
        }
    }
}
