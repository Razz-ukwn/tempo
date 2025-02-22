package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.p;
import cb.d;
import d2.f1;
import he.b;
import jc.e;

public final class f implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile jc.f f7405a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7406b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final p f7407c;

    public interface a {
        e c();
    }

    public f(p pVar) {
        this.f7407c = pVar;
    }

    public static final Context b(ContextWrapper contextWrapper) {
        Context context;
        while (true) {
            boolean z10 = context instanceof ContextWrapper;
            context = contextWrapper;
            if (!z10 || (context instanceof Activity)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final Object a() {
        p pVar = this.f7407c;
        if (pVar.r() != null) {
            f1.n(pVar.r() instanceof b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", pVar.r().getClass());
            e c3 = ((a) d.E(a.class, pVar.r())).c();
            c3.getClass();
            c3.getClass();
            return new jc.f(c3.f9906a);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    public final Object g() {
        if (this.f7405a == null) {
            synchronized (this.f7406b) {
                if (this.f7405a == null) {
                    this.f7405a = (jc.f) a();
                }
            }
        }
        return this.f7405a;
    }
}
