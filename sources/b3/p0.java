package b3;

import ag.f2;
import android.os.Bundle;
import androidx.fragment.app.z0;
import gf.m;
import gf.q;
import gf.s;
import gf.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.y0;
import sf.j;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f3155a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    public final y0 f3156b;

    /* renamed from: c  reason: collision with root package name */
    public final y0 f3157c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3158d;

    /* renamed from: e  reason: collision with root package name */
    public final m0 f3159e;

    /* renamed from: f  reason: collision with root package name */
    public final m0 f3160f;

    public p0() {
        y0 a10 = z0.a(s.f8978a);
        this.f3156b = a10;
        y0 a11 = z0.a(u.f8980a);
        this.f3157c = a11;
        this.f3159e = new m0(a10, (f2) null);
        this.f3160f = new m0(a11, (f2) null);
    }

    public abstract j a(z zVar, Bundle bundle);

    public final void b(j jVar) {
        y0 y0Var = this.f3156b;
        Iterable iterable = (Iterable) y0Var.getValue();
        Object B0 = q.B0((List) y0Var.getValue());
        j.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(m.n0(iterable));
        boolean z10 = false;
        for (Object next : iterable) {
            boolean z11 = true;
            if (!z10 && j.a(next, B0)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        y0Var.setValue(q.H0(arrayList, jVar));
    }

    public void c(j jVar, boolean z10) {
        j.f(jVar, "popUpTo");
        ReentrantLock reentrantLock = this.f3155a;
        reentrantLock.lock();
        try {
            y0 y0Var = this.f3156b;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) y0Var.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(!j.a((j) next, jVar))) {
                    break;
                }
                arrayList.add(next);
            }
            y0Var.setValue(arrayList);
            ff.m mVar = ff.m.f8717a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(j jVar) {
        j.f(jVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f3155a;
        reentrantLock.lock();
        try {
            y0 y0Var = this.f3156b;
            y0Var.setValue(q.H0((Collection) y0Var.getValue(), jVar));
            ff.m mVar = ff.m.f8717a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
