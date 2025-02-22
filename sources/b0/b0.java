package b0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import sf.j;
import tf.c;

public final class b0 implements Map.Entry<Object, Object>, c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2894a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2895b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c0<Object, Object> f2896c;

    public b0(c0<Object, Object> c0Var) {
        this.f2896c = c0Var;
        Map.Entry<? extends K, ? extends V> entry = c0Var.f2905d;
        j.c(entry);
        this.f2894a = entry.getKey();
        Map.Entry<? extends K, ? extends V> entry2 = c0Var.f2905d;
        j.c(entry2);
        this.f2895b = entry2.getValue();
    }

    public final Object getKey() {
        return this.f2894a;
    }

    public final Object getValue() {
        return this.f2895b;
    }

    public final Object setValue(Object obj) {
        c0<Object, Object> c0Var = this.f2896c;
        if (c0Var.f2902a.a().f2962d == c0Var.f2904c) {
            Object obj2 = this.f2895b;
            c0Var.f2902a.put(this.f2894a, obj);
            this.f2895b = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
