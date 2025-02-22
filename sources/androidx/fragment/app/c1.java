package androidx.fragment.app;

import androidx.fragment.app.d1;
import java.util.ArrayList;

public final class c1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1.a f1918a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1 f1919b;

    public c1(d1 d1Var, d1.a aVar) {
        this.f1919b = d1Var;
        this.f1918a = aVar;
    }

    public final void run() {
        d1 d1Var = this.f1919b;
        ArrayList<d1.b> arrayList = d1Var.f1927b;
        d1.a aVar = this.f1918a;
        arrayList.remove(aVar);
        d1Var.f1928c.remove(aVar);
    }
}
