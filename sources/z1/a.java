package z1;

import ag.v1;
import android.graphics.Typeface;
import u1.f;
import v1.h;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v1 f17622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f17623b;

    public a(v1 v1Var, Typeface typeface) {
        this.f17622a = v1Var;
        this.f17623b = typeface;
    }

    public final void run() {
        f.e eVar = ((h.a) this.f17622a).L;
        if (eVar != null) {
            eVar.d(this.f17623b);
        }
    }
}
