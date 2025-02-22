package androidx.databinding;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class j<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f1784a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1785b;

    /* renamed from: c  reason: collision with root package name */
    public T f1786c;

    public j(ViewDataBinding viewDataBinding, int i8, g<T> gVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f1785b = i8;
        this.f1784a = gVar;
    }

    public final boolean a() {
        boolean z10;
        T t2 = this.f1786c;
        if (t2 != null) {
            this.f1784a.c(t2);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1786c = null;
        return z10;
    }
}
