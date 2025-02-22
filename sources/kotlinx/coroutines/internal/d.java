package kotlinx.coroutines.internal;

import b1.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.d;
import sf.j;

public abstract class d<N extends d<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10706a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10707b;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    static {
        Class<d> cls = d.class;
        Class<Object> cls2 = Object.class;
        f10706a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f10707b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public d(N n2) {
        this._prev = n2;
    }

    public static final Object a(t tVar) {
        return tVar._next;
    }

    public abstract boolean b();

    public final boolean c() {
        Object obj = this._next;
        return (obj == b.B ? null : (d) obj) == null;
    }

    public final void d() {
        while (true) {
            d dVar = (d) this._prev;
            while (dVar != null && dVar.b()) {
                dVar = (d) dVar._prev;
            }
            Object obj = this._next;
            v vVar = b.B;
            d dVar2 = obj == vVar ? null : (d) obj;
            j.c(dVar2);
            while (dVar2.b()) {
                Object obj2 = dVar2._next;
                dVar2 = obj2 == vVar ? null : (d) obj2;
                j.c(dVar2);
            }
            dVar2._prev = dVar;
            if (dVar != null) {
                dVar._next = dVar2;
            }
            if (!dVar2.b() && (dVar == null || !dVar.b())) {
                return;
            }
        }
    }
}
