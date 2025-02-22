package f3;

import androidx.fragment.app.z0;
import f3.m0;
import ff.m;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.y0;
import rf.l;

public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8471a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<l<t, m>> f8472b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public m0 f8473c;

    /* renamed from: d  reason: collision with root package name */
    public m0 f8474d;

    /* renamed from: e  reason: collision with root package name */
    public m0 f8475e;

    /* renamed from: f  reason: collision with root package name */
    public n0 f8476f;

    /* renamed from: g  reason: collision with root package name */
    public n0 f8477g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f8478h;

    /* renamed from: i  reason: collision with root package name */
    public final d0 f8479i;

    public s0() {
        m0.c cVar = m0.c.f8367c;
        this.f8473c = cVar;
        this.f8474d = cVar;
        this.f8475e = cVar;
        this.f8476f = n0.f8381d;
        y0 a10 = z0.a((Object) null);
        this.f8478h = a10;
        this.f8479i = new d0(a10);
    }

    public static m0 a(m0 m0Var, m0 m0Var2, m0 m0Var3, m0 m0Var4) {
        return m0Var4 == null ? m0Var3 : (!(m0Var instanceof m0.b) || ((m0Var2 instanceof m0.c) && (m0Var4 instanceof m0.c)) || (m0Var4 instanceof m0.a)) ? m0Var4 : m0Var;
    }

    public final void b() {
        m0 m0Var = this.f8473c;
        m0 m0Var2 = this.f8476f.f8382a;
        n0 n0Var = this.f8477g;
        t tVar = null;
        this.f8473c = a(m0Var, m0Var2, m0Var2, n0Var == null ? null : n0Var.f8382a);
        m0 m0Var3 = this.f8474d;
        n0 n0Var2 = this.f8476f;
        m0 m0Var4 = n0Var2.f8382a;
        n0 n0Var3 = this.f8477g;
        this.f8474d = a(m0Var3, m0Var4, n0Var2.f8383b, n0Var3 == null ? null : n0Var3.f8383b);
        m0 m0Var5 = this.f8475e;
        n0 n0Var4 = this.f8476f;
        m0 m0Var6 = n0Var4.f8382a;
        n0 n0Var5 = this.f8477g;
        m0 a10 = a(m0Var5, m0Var6, n0Var4.f8384c, n0Var5 == null ? null : n0Var5.f8384c);
        this.f8475e = a10;
        if (this.f8471a) {
            tVar = new t(this.f8473c, this.f8474d, a10, this.f8476f, this.f8477g);
        }
        if (tVar != null) {
            this.f8478h.setValue(tVar);
            Iterator<l<t, m>> it = this.f8472b.iterator();
            while (it.hasNext()) {
                it.next().invoke(tVar);
            }
        }
    }
}
