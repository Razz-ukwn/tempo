package p2;

import java.util.ArrayDeque;
import java.util.Queue;
import l5.l;
import s4.k;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12427a;

    public /* synthetic */ c(Object obj) {
        this.f12427a = obj;
    }

    public abstract k a();

    public final k b() {
        k kVar = (k) ((Queue) this.f12427a).poll();
        return kVar == null ? a() : kVar;
    }

    public abstract float c(Object obj);

    public final void d(k kVar) {
        Object obj = this.f12427a;
        if (((Queue) obj).size() < 20) {
            ((Queue) obj).offer(kVar);
        }
    }

    public abstract void e(float f10, Object obj);

    public c() {
        char[] cArr = l.f11007a;
        this.f12427a = new ArrayDeque(20);
    }
}
