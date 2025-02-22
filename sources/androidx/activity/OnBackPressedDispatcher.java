package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import ff.m;
import gf.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f563a;

    /* renamed from: b  reason: collision with root package name */
    public final k<n> f564b = new k<>();

    /* renamed from: c  reason: collision with root package name */
    public final a f565c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f566d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f567e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f568f;

    public final class LifecycleOnBackPressedCancellable implements n, a {

        /* renamed from: a  reason: collision with root package name */
        public final j f569a;

        /* renamed from: b  reason: collision with root package name */
        public final n f570b;

        /* renamed from: c  reason: collision with root package name */
        public d f571c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f572d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, j jVar, n nVar) {
            sf.j.f(nVar, "onBackPressedCallback");
            this.f572d = onBackPressedDispatcher;
            this.f569a = jVar;
            this.f570b = nVar;
            jVar.a(this);
        }

        public final void cancel() {
            this.f569a.c(this);
            n nVar = this.f570b;
            nVar.getClass();
            nVar.f602b.remove(this);
            d dVar = this.f571c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f571c = null;
        }

        public final void d(p pVar, j.a aVar) {
            if (aVar == j.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = this.f572d;
                onBackPressedDispatcher.getClass();
                n nVar = this.f570b;
                sf.j.f(nVar, "onBackPressedCallback");
                onBackPressedDispatcher.f564b.addLast(nVar);
                d dVar = new d(nVar);
                nVar.f602b.add(dVar);
                if (Build.VERSION.SDK_INT >= 33) {
                    onBackPressedDispatcher.c();
                    nVar.f603c = onBackPressedDispatcher.f565c;
                }
                this.f571c = dVar;
            } else if (aVar == j.a.ON_STOP) {
                d dVar2 = this.f571c;
                if (dVar2 != null) {
                    dVar2.cancel();
                }
            } else if (aVar == j.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    public static final class a extends sf.k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f573a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f573a = onBackPressedDispatcher;
        }

        public final Object d() {
            this.f573a.c();
            return m.f8717a;
        }
    }

    public static final class b extends sf.k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f574a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f574a = onBackPressedDispatcher;
        }

        public final Object d() {
            this.f574a.b();
            return m.f8717a;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f575a = new c();

        public final OnBackInvokedCallback a(rf.a<m> aVar) {
            sf.j.f(aVar, "onBackInvoked");
            return new o(aVar);
        }

        public final void b(Object obj, int i8, Object obj2) {
            sf.j.f(obj, "dispatcher");
            sf.j.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i8, (OnBackInvokedCallback) obj2);
        }

        public final void c(Object obj, Object obj2) {
            sf.j.f(obj, "dispatcher");
            sf.j.f(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final n f576a;

        public d(n nVar) {
            this.f576a = nVar;
        }

        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            k<n> kVar = onBackPressedDispatcher.f564b;
            n nVar = this.f576a;
            kVar.remove(nVar);
            nVar.getClass();
            nVar.f602b.remove(this);
            if (Build.VERSION.SDK_INT >= 33) {
                nVar.f603c = null;
                onBackPressedDispatcher.c();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f563a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f565c = new a(this);
            this.f566d = c.f575a.a(new b(this));
        }
    }

    public final void a(p pVar, n nVar) {
        sf.j.f(nVar, "onBackPressedCallback");
        j b10 = pVar.b();
        if (b10.b() != j.b.f2277a) {
            nVar.f602b.add(new LifecycleOnBackPressedCancellable(this, b10, nVar));
            if (Build.VERSION.SDK_INT >= 33) {
                c();
                nVar.f603c = this.f565c;
            }
        }
    }

    public final void b() {
        n nVar;
        k<n> kVar = this.f564b;
        ListIterator<n> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                nVar = null;
                break;
            }
            nVar = listIterator.previous();
            if (nVar.f601a) {
                break;
            }
        }
        n nVar2 = nVar;
        if (nVar2 != null) {
            nVar2.a();
            return;
        }
        Runnable runnable = this.f563a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z10;
        OnBackInvokedCallback onBackInvokedCallback;
        k<n> kVar = this.f564b;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<n> it = kVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f601a) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f567e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f566d) != null) {
            c cVar = c.f575a;
            if (z10 && !this.f568f) {
                cVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f568f = true;
            } else if (!z10 && this.f568f) {
                cVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f568f = false;
            }
        }
    }
}
