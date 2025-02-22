package b0;

import ff.m;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import sf.j;

public abstract class d0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final u<K, V> f2902a;

    /* renamed from: b  reason: collision with root package name */
    public final Iterator<Map.Entry<K, V>> f2903b;

    /* renamed from: c  reason: collision with root package name */
    public int f2904c;

    /* renamed from: d  reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f2905d;

    /* renamed from: e  reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f2906e;

    public d0(u<K, V> uVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        j.f(uVar, "map");
        j.f(it, "iterator");
        this.f2902a = uVar;
        this.f2903b = it;
        this.f2904c = uVar.a().f2962d;
        a();
    }

    public final void a() {
        this.f2905d = this.f2906e;
        Iterator<Map.Entry<K, V>> it = this.f2903b;
        this.f2906e = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f2906e != null;
    }

    public final void remove() {
        u<K, V> uVar = this.f2902a;
        if (uVar.a().f2962d == this.f2904c) {
            Map.Entry<? extends K, ? extends V> entry = this.f2905d;
            if (entry != null) {
                uVar.remove(entry.getKey());
                this.f2905d = null;
                m mVar = m.f8717a;
                this.f2904c = uVar.a().f2962d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
