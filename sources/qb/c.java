package qb;

import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.concurrent.atomic.AtomicBoolean;
import sf.j;

public final class c<T> extends v<T> {

    /* renamed from: l  reason: collision with root package name */
    public final AtomicBoolean f13473l = new AtomicBoolean(false);
    public final String m = c.class.getSimpleName();

    public final void e(p pVar, w<? super T> wVar) {
        j.f(pVar, "owner");
        j.f(wVar, "observer");
        if (this.f2191c > 0) {
            Log.w(this.m, "Multiple observers registered but only one will be notified of changes.");
        }
        super.e(pVar, new b(this, wVar));
    }

    public final void k(T t2) {
        this.f13473l.set(true);
        super.k(t2);
    }
}
