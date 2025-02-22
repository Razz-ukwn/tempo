package f3;

import ag.c0;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.b3;
import cg.e;
import f3.c2;
import ff.m;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.d;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.p0;
import rf.a;
import sf.j;

public abstract class e2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y f8165a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f8166b;

    /* renamed from: c  reason: collision with root package name */
    public t1<T> f8167c = t1.f8494e;

    /* renamed from: d  reason: collision with root package name */
    public t2 f8168d;

    /* renamed from: e  reason: collision with root package name */
    public final s0 f8169e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList<a<m>> f8170f;

    /* renamed from: g  reason: collision with root package name */
    public final p2 f8171g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f8172h;

    /* renamed from: i  reason: collision with root package name */
    public volatile int f8173i;

    /* renamed from: j  reason: collision with root package name */
    public final d2 f8174j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f8175k;

    /* renamed from: l  reason: collision with root package name */
    public final p0 f8176l;

    public e2(e eVar, c0 c0Var) {
        this.f8165a = eVar;
        this.f8166b = c0Var;
        s0 s0Var = new s0();
        this.f8169e = s0Var;
        CopyOnWriteArrayList<a<m>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f8170f = copyOnWriteArrayList;
        this.f8171g = new p2(true);
        this.f8174j = new d2(this);
        this.f8175k = s0Var.f8479i;
        this.f8176l = b3.a(0, 64, e.f4021b);
        copyOnWriteArrayList.add(new b2(this));
    }

    public final void a(n0 n0Var, n0 n0Var2) {
        j.f(n0Var, "source");
        s0 s0Var = this.f8169e;
        if (!j.a(s0Var.f8476f, n0Var) || !j.a(s0Var.f8477g, n0Var2)) {
            s0Var.getClass();
            s0Var.f8471a = true;
            s0Var.f8476f = n0Var;
            s0Var.f8477g = n0Var2;
            s0Var.b();
        }
    }

    public final T b(int i8) {
        this.f8172h = true;
        this.f8173i = i8;
        t2 t2Var = this.f8168d;
        if (t2Var != null) {
            t2Var.a(this.f8167c.f(i8));
        }
        t1<T> t1Var = this.f8167c;
        if (i8 < 0) {
            t1Var.getClass();
        } else if (i8 < t1Var.a()) {
            int i10 = i8 - t1Var.f8497c;
            if (i10 < 0 || i10 >= t1Var.f8496b) {
                return null;
            }
            return t1Var.e(i10);
        }
        StringBuilder b10 = a1.b("Index: ", i8, ", Size: ");
        b10.append(t1Var.a());
        throw new IndexOutOfBoundsException(b10.toString());
    }

    public abstract Object c(t1 t1Var, t1 t1Var2, int i8, c2.a.C0133a aVar, d dVar);
}
