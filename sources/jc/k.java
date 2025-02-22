package jc;

import androidx.appcompat.app.c;
import androidx.lifecycle.m0;
import cb.d;
import dagger.hilt.android.internal.managers.a;
import ee.a;
import he.b;

public abstract class k extends c implements b {
    public volatile a V;
    public final Object W = new Object();
    public boolean X = false;

    public k() {
        G(new j(this));
    }

    public final Object g() {
        if (this.V == null) {
            synchronized (this.W) {
                if (this.V == null) {
                    this.V = new a(this);
                }
            }
        }
        return this.V.g();
    }

    public final m0.b k() {
        m0.b k10 = super.k();
        a.c a10 = ((a.C0131a) d.E(a.C0131a.class, this)).a();
        a10.getClass();
        if (getIntent() != null) {
            getIntent().getExtras();
        }
        k10.getClass();
        return new ee.d(a10.f7977a, k10, a10.f7978b);
    }
}
