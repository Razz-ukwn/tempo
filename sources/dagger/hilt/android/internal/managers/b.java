package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import dagger.hilt.android.internal.managers.c;
import jc.d;
import sf.j;

public final class b implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7397a;

    public b(Context context) {
        this.f7397a = context;
    }

    public final <T extends j0> T a(Class<T> cls) {
        Context context = this.f7397a;
        j.f(context, "context");
        return new c.b(new d(((c.a) cb.d.E(c.a.class, b1.b.d(context.getApplicationContext()))).c().f9902a));
    }
}
