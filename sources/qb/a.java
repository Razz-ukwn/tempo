package qb;

import androidx.lifecycle.w;
import ff.m;
import rf.l;

public final class a<T> implements w<T> {

    /* renamed from: a  reason: collision with root package name */
    public final l<T, m> f13470a;

    public a(l<? super T, m> lVar) {
        this.f13470a = lVar;
    }

    public final void b(T t2) {
        if (t2 != null) {
            this.f13470a.invoke(t2);
        }
    }
}
