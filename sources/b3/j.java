package b3;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.q;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import sf.k;

public final class j implements p, p0, h, l3.b {
    public final String B;
    public final Bundle C;
    public final q D = new q(this);
    public final l3.a E = new l3.a(this);
    public boolean F;
    public final ff.j G = b7.a.x(new d(this));
    public j.b H;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3083a;

    /* renamed from: b  reason: collision with root package name */
    public z f3084b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f3085c;

    /* renamed from: d  reason: collision with root package name */
    public j.b f3086d;

    /* renamed from: e  reason: collision with root package name */
    public final i0 f3087e;

    public static final class a {
        public static j a(Context context, z zVar, Bundle bundle, j.b bVar, t tVar) {
            String uuid = UUID.randomUUID().toString();
            sf.j.e(uuid, "randomUUID().toString()");
            sf.j.f(bVar, "hostLifecycleState");
            return new j(context, zVar, bundle, bVar, tVar, uuid, (Bundle) null);
        }
    }

    public static final class b extends androidx.lifecycle.a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(jVar);
            sf.j.f(jVar, "owner");
        }

        public final <T extends j0> T d(String str, Class<T> cls, b0 b0Var) {
            sf.j.f(b0Var, "handle");
            return new c(b0Var);
        }
    }

    public static final class c extends j0 {

        /* renamed from: d  reason: collision with root package name */
        public final b0 f3088d;

        public c(b0 b0Var) {
            sf.j.f(b0Var, "handle");
            this.f3088d = b0Var;
        }
    }

    public static final class d extends k implements rf.a<f0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f3089a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar) {
            super(0);
            this.f3089a = jVar;
        }

        public final Object d() {
            j jVar = this.f3089a;
            Context context = jVar.f3083a;
            Application application = null;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            return new f0(application, jVar, jVar.f3085c);
        }
    }

    public static final class e extends k implements rf.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f3090a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(j jVar) {
            super(0);
            this.f3090a = jVar;
        }

        public final Object d() {
            j jVar = this.f3090a;
            if (jVar.F) {
                if (jVar.D.f2304d != j.b.f2277a) {
                    return ((c) new m0((p0) jVar, (m0.b) new b(jVar)).a(c.class)).f3088d;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    static {
        new a();
    }

    public j(Context context, z zVar, Bundle bundle, j.b bVar, i0 i0Var, String str, Bundle bundle2) {
        this.f3083a = context;
        this.f3084b = zVar;
        this.f3085c = bundle;
        this.f3086d = bVar;
        this.f3087e = i0Var;
        this.B = str;
        this.C = bundle2;
        b7.a.x(new e(this));
        this.H = j.b.f2278b;
    }

    public final void a(j.b bVar) {
        sf.j.f(bVar, "maxState");
        this.H = bVar;
        c();
    }

    public final androidx.lifecycle.j b() {
        return this.D;
    }

    public final void c() {
        if (!this.F) {
            l3.a aVar = this.E;
            aVar.a();
            this.F = true;
            if (this.f3087e != null) {
                c0.b(this);
            }
            aVar.b(this.C);
        }
        int ordinal = this.f3086d.ordinal();
        int ordinal2 = this.H.ordinal();
        q qVar = this.D;
        if (ordinal < ordinal2) {
            qVar.h(this.f3086d);
        } else {
            qVar.h(this.H);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x007d
            boolean r1 = r7 instanceof b3.j
            if (r1 != 0) goto L_0x0009
            goto L_0x007d
        L_0x0009:
            b3.j r7 = (b3.j) r7
            java.lang.String r1 = r7.B
            java.lang.String r2 = r6.B
            boolean r1 = sf.j.a(r2, r1)
            if (r1 == 0) goto L_0x007d
            b3.z r1 = r6.f3084b
            b3.z r2 = r7.f3084b
            boolean r1 = sf.j.a(r1, r2)
            if (r1 == 0) goto L_0x007d
            androidx.lifecycle.q r1 = r6.D
            androidx.lifecycle.q r2 = r7.D
            boolean r1 = sf.j.a(r1, r2)
            if (r1 == 0) goto L_0x007d
            l3.a r1 = r6.E
            androidx.savedstate.a r1 = r1.f10968b
            l3.a r2 = r7.E
            androidx.savedstate.a r2 = r2.f10968b
            boolean r1 = sf.j.a(r1, r2)
            if (r1 == 0) goto L_0x007d
            android.os.Bundle r1 = r6.f3085c
            android.os.Bundle r7 = r7.f3085c
            boolean r2 = sf.j.a(r1, r7)
            r3 = 1
            if (r2 != 0) goto L_0x007c
            if (r1 == 0) goto L_0x0079
            java.util.Set r2 = r1.keySet()
            if (r2 == 0) goto L_0x0079
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0052
        L_0x0050:
            r7 = r3
            goto L_0x0075
        L_0x0052:
            java.util.Iterator r2 = r2.iterator()
        L_0x0056:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            if (r7 == 0) goto L_0x006d
            java.lang.Object r4 = r7.get(r4)
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            boolean r4 = sf.j.a(r5, r4)
            if (r4 != 0) goto L_0x0056
            r7 = r0
        L_0x0075:
            if (r7 != r3) goto L_0x0079
            r7 = r3
            goto L_0x007a
        L_0x0079:
            r7 = r0
        L_0x007a:
            if (r7 == 0) goto L_0x007d
        L_0x007c:
            r0 = r3
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f3084b.hashCode() + (this.B.hashCode() * 31);
        Bundle bundle = this.f3085c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i8 = hashCode * 31;
                Object obj = bundle.get(str);
                hashCode = i8 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.E.f10968b.hashCode() + ((this.D.hashCode() + (hashCode * 31)) * 31);
    }

    public final m0.b k() {
        return (f0) this.G.getValue();
    }

    public final x2.a l() {
        x2.c cVar = new x2.c(0);
        Application application = null;
        Context context = this.f3083a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        LinkedHashMap linkedHashMap = cVar.f16911a;
        if (application != null) {
            linkedHashMap.put(l0.f2292a, application);
        }
        linkedHashMap.put(c0.f2254a, this);
        linkedHashMap.put(c0.f2255b, this);
        Bundle bundle = this.f3085c;
        if (bundle != null) {
            linkedHashMap.put(c0.f2256c, bundle);
        }
        return cVar;
    }

    public final o0 s() {
        if (this.F) {
            if (this.D.f2304d != j.b.f2277a) {
                i0 i0Var = this.f3087e;
                if (i0Var != null) {
                    return i0Var.a(this.B);
                }
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }

    public final androidx.savedstate.a w() {
        return this.E.f10968b;
    }
}
