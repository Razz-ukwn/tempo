package androidx.fragment.app;

import androidx.fragment.app.d1;
import java.util.ArrayList;

public final class b1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1.a f1910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1 f1911b;

    public b1(d1 d1Var, d1.a aVar) {
        this.f1911b = d1Var;
        this.f1910a = aVar;
    }

    public final void run() {
        ArrayList<d1.b> arrayList = this.f1911b.f1927b;
        d1.a aVar = this.f1910a;
        if (arrayList.contains(aVar)) {
            g1.a(aVar.f1932a, aVar.f1934c.f2066d0);
        }
    }
}
