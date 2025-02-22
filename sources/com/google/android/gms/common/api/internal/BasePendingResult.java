package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import h7.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import u6.q;

@KeepName
public abstract class BasePendingResult<R extends h> extends e<R> {

    /* renamed from: j  reason: collision with root package name */
    public static final e1 f4197j = new e1(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f4198a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f4199b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4200c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f4201d = new AtomicReference();

    /* renamed from: e  reason: collision with root package name */
    public h f4202e;

    /* renamed from: f  reason: collision with root package name */
    public Status f4203f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f4204g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4205h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4206i = false;
    @KeepName
    private f1 mResultGuardian;

    public static class a<R extends h> extends i {
        public a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                Pair pair = (Pair) message.obj;
                com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a();
                } catch (RuntimeException e10) {
                    BasePendingResult.h(hVar);
                    throw e10;
                }
            } else if (i8 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i8, new Exception());
            } else {
                ((BasePendingResult) message.obj).c(Status.E);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        new a(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    public static void h(h hVar) {
        if (hVar instanceof f) {
            try {
                ((f) hVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    public final void a(e.a aVar) {
        synchronized (this.f4198a) {
            if (d()) {
                aVar.a(this.f4203f);
            } else {
                this.f4200c.add(aVar);
            }
        }
    }

    public abstract R b(Status status);

    @Deprecated
    public final void c(Status status) {
        synchronized (this.f4198a) {
            if (!d()) {
                e(b(status));
                this.f4205h = true;
            }
        }
    }

    public final boolean d() {
        return this.f4199b.getCount() == 0;
    }

    public final void e(R r10) {
        synchronized (this.f4198a) {
            if (!this.f4205h) {
                d();
                q.k(!d(), "Results have already been set");
                q.k(!this.f4204g, "Result has already been consumed");
                g(r10);
                return;
            }
            h(r10);
        }
    }

    public final h f() {
        h hVar;
        synchronized (this.f4198a) {
            q.k(!this.f4204g, "Result has already been consumed.");
            q.k(d(), "Result is not ready.");
            hVar = this.f4202e;
            this.f4202e = null;
            this.f4204g = true;
        }
        if (((u0) this.f4201d.getAndSet((Object) null)) == null) {
            q.i(hVar);
            return hVar;
        }
        throw null;
    }

    public final void g(h hVar) {
        this.f4202e = hVar;
        this.f4203f = hVar.p();
        this.f4199b.countDown();
        if (this.f4202e instanceof f) {
            this.mResultGuardian = new f1(this);
        }
        ArrayList arrayList = this.f4200c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((e.a) arrayList.get(i8)).a(this.f4203f);
        }
        arrayList.clear();
    }

    public BasePendingResult(f0 f0Var) {
        Looper looper;
        if (f0Var != null) {
            looper = f0Var.f4260b.f4188f;
        } else {
            looper = Looper.getMainLooper();
        }
        new a(looper);
        new WeakReference(f0Var);
    }
}
