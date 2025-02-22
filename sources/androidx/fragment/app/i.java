package androidx.fragment.app;

import androidx.fragment.app.d1;
import o.a;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1.b f1963a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1.b f1964b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1965c;

    public i(d1.b bVar, d1.b bVar2, boolean z10, a aVar) {
        this.f1963a = bVar;
        this.f1964b = bVar2;
        this.f1965c = z10;
    }

    public final void run() {
        p pVar = this.f1963a.f1934c;
        p pVar2 = this.f1964b.f1934c;
        t0 t0Var = r0.f2131a;
        if (this.f1965c) {
            pVar2.getClass();
        } else {
            pVar.getClass();
        }
    }
}
