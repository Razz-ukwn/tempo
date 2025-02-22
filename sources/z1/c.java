package z1;

import ag.v1;
import android.os.Handler;
import v1.h;
import z1.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final v1 f17626a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17627b;

    public c(h.a aVar, Handler handler) {
        this.f17626a = aVar;
        this.f17627b = handler;
    }

    public final void a(j.a aVar) {
        int i8 = aVar.f17649b;
        boolean z10 = i8 == 0;
        Handler handler = this.f17627b;
        v1 v1Var = this.f17626a;
        if (z10) {
            handler.post(new a(v1Var, aVar.f17648a));
        } else {
            handler.post(new b(v1Var, i8));
        }
    }
}
