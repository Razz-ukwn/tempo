package dagger.hilt.android.internal.managers;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import ee.e;
import jc.d;

public final class c implements he.b<be.a> {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f7398a;

    /* renamed from: b  reason: collision with root package name */
    public volatile be.a f7399b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7400c = new Object();

    public interface a {
        jc.c c();
    }

    public static final class b extends j0 {

        /* renamed from: d  reason: collision with root package name */
        public final be.a f7401d;

        public b(d dVar) {
            this.f7401d = dVar;
        }

        public final void c() {
            ((e) ((C0117c) cb.d.E(C0117c.class, this.f7401d)).a()).a();
        }
    }

    /* renamed from: dagger.hilt.android.internal.managers.c$c  reason: collision with other inner class name */
    public interface C0117c {
        ae.a a();
    }

    public c(ComponentActivity componentActivity) {
        this.f7398a = new m0((p0) componentActivity, (m0.b) new b(componentActivity));
    }

    public final Object g() {
        if (this.f7399b == null) {
            synchronized (this.f7400c) {
                if (this.f7399b == null) {
                    this.f7399b = ((b) this.f7398a.a(b.class)).f7401d;
                }
            }
        }
        return this.f7399b;
    }
}
