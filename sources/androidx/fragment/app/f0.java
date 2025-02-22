package androidx.fragment.app;

import android.content.res.Configuration;
import c2.a;

public final /* synthetic */ class f0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i0 f1951a;

    public /* synthetic */ f0(i0 i0Var) {
        this.f1951a = i0Var;
    }

    public final void accept(Object obj) {
        Configuration configuration = (Configuration) obj;
        i0 i0Var = this.f1951a;
        if (i0Var.L()) {
            i0Var.h(false, configuration);
        }
    }
}
