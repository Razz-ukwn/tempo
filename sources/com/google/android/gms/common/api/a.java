package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.k;
import java.util.Set;
import u6.b;
import u6.j;

public final class a<O extends c> {

    /* renamed from: a  reason: collision with root package name */
    public final C0067a f4180a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4181b;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0067a<T extends e, O> extends d<T, O> {
        @Deprecated
        public e a(Context context, Looper looper, u6.d dVar, c cVar, d.a aVar, d.b bVar) {
            return b(context, looper, dVar, cVar, aVar, bVar);
        }

        public e b(Context context, Looper looper, u6.d dVar, c cVar, com.google.android.gms.common.api.internal.d dVar2, k kVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public static class b<C> {
    }

    public interface c {

        /* renamed from: h  reason: collision with root package name */
        public static final C0069c f4182h = new C0069c(0);

        /* renamed from: com.google.android.gms.common.api.a$c$a  reason: collision with other inner class name */
        public interface C0068a extends c {
            Account i();
        }

        public interface b extends c {
            GoogleSignInAccount h();
        }

        /* renamed from: com.google.android.gms.common.api.a$c$c  reason: collision with other inner class name */
        public static final class C0069c implements c {
            public C0069c() {
            }

            public /* synthetic */ C0069c(int i8) {
            }
        }
    }

    public static abstract class d<T, O> {
    }

    public interface e {
        Set<Scope> a();

        void b(String str);

        void d(a0 a0Var);

        boolean e();

        String f();

        void g();

        boolean h();

        boolean i();

        int j();

        t6.d[] k();

        String l();

        boolean m();

        void n(j jVar, Set<Scope> set);

        void p(b.c cVar);
    }

    public static final class f<C extends e> extends b<C> {
    }

    public <C extends e> a(String str, C0067a<C, O> aVar, f<C> fVar) {
        this.f4181b = str;
        this.f4180a = aVar;
    }
}
