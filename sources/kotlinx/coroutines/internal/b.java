package kotlinx.coroutines.internal;

import b3.l0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b<T> extends p {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10704a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = l0.f3099a;

    public final Object a(Object obj) {
        boolean z10;
        Object obj2 = this._consensus;
        v vVar = l0.f3099a;
        if (obj2 == vVar) {
            v c3 = c(obj);
            obj2 = this._consensus;
            if (obj2 == vVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10704a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != vVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                obj2 = z10 ? c3 : this._consensus;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t2, Object obj);

    public abstract v c(Object obj);
}
