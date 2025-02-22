package androidx.lifecycle;

import androidx.lifecycle.j;
import java.util.Map;
import k.b;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2188k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2189a;

    /* renamed from: b  reason: collision with root package name */
    public final k.b<w<? super T>, LiveData<T>.c> f2190b;

    /* renamed from: c  reason: collision with root package name */
    public int f2191c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2192d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2193e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2194f;

    /* renamed from: g  reason: collision with root package name */
    public int f2195g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2196h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2197i;

    /* renamed from: j  reason: collision with root package name */
    public final a f2198j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements n {

        /* renamed from: e  reason: collision with root package name */
        public final p f2199e;

        public LifecycleBoundObserver(p pVar, w<? super T> wVar) {
            super(wVar);
            this.f2199e = pVar;
        }

        public final void d(p pVar, j.a aVar) {
            p pVar2 = this.f2199e;
            j.b b10 = pVar2.b().b();
            if (b10 == j.b.f2277a) {
                LiveData.this.j(this.f2201a);
                return;
            }
            j.b bVar = null;
            while (bVar != b10) {
                a(g());
                bVar = b10;
                b10 = pVar2.b().b();
            }
        }

        public final void e() {
            this.f2199e.b().c(this);
        }

        public final boolean f(p pVar) {
            return this.f2199e == pVar;
        }

        public final boolean g() {
            return this.f2199e.b().b().a(j.b.f2280d);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.f2189a) {
                obj = LiveData.this.f2194f;
                LiveData.this.f2194f = LiveData.f2188k;
            }
            LiveData.this.k(obj);
        }
    }

    public class b extends LiveData<T>.c {
        public b(LiveData liveData, w<? super T> wVar) {
            super(wVar);
        }

        public final boolean g() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final w<? super T> f2201a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2202b;

        /* renamed from: c  reason: collision with root package name */
        public int f2203c = -1;

        public c(w<? super T> wVar) {
            this.f2201a = wVar;
        }

        public final void a(boolean z10) {
            if (z10 != this.f2202b) {
                this.f2202b = z10;
                int i8 = z10 ? 1 : -1;
                LiveData liveData = LiveData.this;
                int i10 = liveData.f2191c;
                liveData.f2191c = i8 + i10;
                if (!liveData.f2192d) {
                    liveData.f2192d = true;
                    while (true) {
                        try {
                            int i11 = liveData.f2191c;
                            if (i10 == i11) {
                                break;
                            }
                            boolean z11 = i10 == 0 && i11 > 0;
                            boolean z12 = i10 > 0 && i11 == 0;
                            if (z11) {
                                liveData.g();
                            } else if (z12) {
                                liveData.h();
                            }
                            i10 = i11;
                        } finally {
                            liveData.f2192d = false;
                        }
                    }
                }
                if (this.f2202b) {
                    liveData.c(this);
                }
            }
        }

        public void e() {
        }

        public boolean f(p pVar) {
            return false;
        }

        public abstract boolean g();
    }

    public LiveData(T t2) {
        this.f2189a = new Object();
        this.f2190b = new k.b<>();
        this.f2191c = 0;
        this.f2194f = f2188k;
        this.f2198j = new a();
        this.f2193e = t2;
        this.f2195g = 0;
    }

    public static void a(String str) {
        if (!j.c.F().G()) {
            throw new IllegalStateException(b2.c.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f2202b) {
            if (!cVar.g()) {
                cVar.a(false);
                return;
            }
            int i8 = cVar.f2203c;
            int i10 = this.f2195g;
            if (i8 < i10) {
                cVar.f2203c = i10;
                cVar.f2201a.b(this.f2193e);
            }
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.f2196h) {
            this.f2197i = true;
            return;
        }
        this.f2196h = true;
        do {
            this.f2197i = false;
            if (cVar == null) {
                k.b<w<? super T>, LiveData<T>.c> bVar = this.f2190b;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f10237c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2197i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f2197i);
        this.f2196h = false;
    }

    public final T d() {
        T t2 = this.f2193e;
        if (t2 != f2188k) {
            return t2;
        }
        return null;
    }

    public void e(p pVar, w<? super T> wVar) {
        a("observe");
        if (pVar.b().b() != j.b.f2277a) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, wVar);
            c b10 = this.f2190b.b(wVar, lifecycleBoundObserver);
            if (b10 != null && !b10.f(pVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b10 == null) {
                pVar.b().a(lifecycleBoundObserver);
            }
        }
    }

    public final void f(w<? super T> wVar) {
        a("observeForever");
        b bVar = new b(this, wVar);
        c b10 = this.f2190b.b(wVar, bVar);
        if (b10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (b10 == null) {
            bVar.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(T t2) {
        boolean z10;
        synchronized (this.f2189a) {
            z10 = this.f2194f == f2188k;
            this.f2194f = t2;
        }
        if (z10) {
            j.c.F().H(this.f2198j);
        }
    }

    public void j(w<? super T> wVar) {
        a("removeObserver");
        c c3 = this.f2190b.c(wVar);
        if (c3 != null) {
            c3.e();
            c3.a(false);
        }
    }

    public void k(T t2) {
        a("setValue");
        this.f2195g++;
        this.f2193e = t2;
        c((LiveData<T>.c) null);
    }

    public LiveData() {
        this.f2189a = new Object();
        this.f2190b = new k.b<>();
        this.f2191c = 0;
        Object obj = f2188k;
        this.f2194f = obj;
        this.f2198j = new a();
        this.f2193e = obj;
        this.f2195g = -1;
    }
}
