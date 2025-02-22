package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.p;
import com.quickkonnect.silencio.R;
import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import rf.l;
import sf.k;
import t.e0;
import t.h;
import t.j1;
import t.k1;
import t.l0;
import t.q0;
import t.r0;
import t.s0;
import t.t0;
import t.v1;
import t.y1;
import t.z2;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f1360a;

    /* renamed from: b  reason: collision with root package name */
    public static final z2 f1361b = l0.b(b.f1367a);

    /* renamed from: c  reason: collision with root package name */
    public static final z2 f1362c = l0.b(c.f1368a);

    /* renamed from: d  reason: collision with root package name */
    public static final z2 f1363d = l0.b(d.f1369a);

    /* renamed from: e  reason: collision with root package name */
    public static final z2 f1364e = l0.b(e.f1370a);

    /* renamed from: f  reason: collision with root package name */
    public static final z2 f1365f = l0.b(f.f1371a);

    public static final class a extends k implements rf.a<Configuration> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1366a = new a();

        public a() {
            super(0);
        }

        public final Object d() {
            o0.b("LocalConfiguration");
            throw null;
        }
    }

    public static final class b extends k implements rf.a<Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1367a = new b();

        public b() {
            super(0);
        }

        public final Object d() {
            o0.b("LocalContext");
            throw null;
        }
    }

    public static final class c extends k implements rf.a<u0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f1368a = new c();

        public c() {
            super(0);
        }

        public final Object d() {
            o0.b("LocalImageVectorCache");
            throw null;
        }
    }

    public static final class d extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f1369a = new d();

        public d() {
            super(0);
        }

        public final Object d() {
            o0.b("LocalLifecycleOwner");
            throw null;
        }
    }

    public static final class e extends k implements rf.a<l3.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f1370a = new e();

        public e() {
            super(0);
        }

        public final Object d() {
            o0.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    public static final class f extends k implements rf.a<View> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f1371a = new f();

        public f() {
            super(0);
        }

        public final Object d() {
            o0.b("LocalView");
            throw null;
        }
    }

    public static final class g extends k implements l<Configuration, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j1<Configuration> f1372a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(j1<Configuration> j1Var) {
            super(1);
            this.f1372a = j1Var;
        }

        public final Object invoke(Object obj) {
            Configuration configuration = (Configuration) obj;
            sf.j.f(configuration, "it");
            this.f1372a.setValue(configuration);
            return m.f8717a;
        }
    }

    public static final class h extends k implements l<r0, q0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j1 f1373a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(j1 j1Var) {
            super(1);
            this.f1373a = j1Var;
        }

        public final Object invoke(Object obj) {
            sf.j.f((r0) obj, "$this$DisposableEffect");
            return new p0(this.f1373a);
        }
    }

    public static final class i extends k implements rf.p<t.h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1374a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y0 f1375b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ rf.p<t.h, Integer, m> f1376c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f1377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(AndroidComposeView androidComposeView, y0 y0Var, rf.p<? super t.h, ? super Integer, m> pVar, int i8) {
            super(2);
            this.f1374a = androidComposeView;
            this.f1375b = y0Var;
            this.f1376c = pVar;
            this.f1377d = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            t.h hVar = (t.h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
                e0.b bVar = e0.f15020a;
                y0 y0Var = this.f1375b;
                rf.p<t.h, Integer, m> pVar = this.f1376c;
                h1.a(this.f1374a, y0Var, pVar, hVar, ((this.f1377d << 3) & 896) | 72);
            } else {
                hVar.j();
            }
            return m.f8717a;
        }
    }

    public static final class j extends k implements rf.p<t.h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f1378a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ rf.p<t.h, Integer, m> f1379b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f1380c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(AndroidComposeView androidComposeView, rf.p<? super t.h, ? super Integer, m> pVar, int i8) {
            super(2);
            this.f1378a = androidComposeView;
            this.f1379b = pVar;
            this.f1380c = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int L = cb.b.L(this.f1380c | 1);
            o0.a(this.f1378a, this.f1379b, (t.h) obj, L);
            return m.f8717a;
        }
    }

    static {
        k1 k1Var = k1.f15133a;
        a aVar = a.f1366a;
        sf.j.f(aVar, "defaultFactory");
        f1360a = new s0(k1Var, aVar);
    }

    public static final void a(AndroidComposeView androidComposeView, rf.p<? super t.h, ? super Integer, m> pVar, t.h hVar, int i8) {
        LinkedHashMap linkedHashMap;
        boolean z10;
        AndroidComposeView androidComposeView2 = androidComposeView;
        rf.p<? super t.h, ? super Integer, m> pVar2 = pVar;
        int i10 = i8;
        sf.j.f(androidComposeView2, "owner");
        sf.j.f(pVar2, "content");
        t.i g10 = hVar.g(1396852028);
        e0.b bVar = e0.f15020a;
        Context context = androidComposeView.getContext();
        g10.c(-492369756);
        Object M = g10.M();
        h.a.C0280a aVar = h.a.f15061a;
        if (M == aVar) {
            M = cb.d.R(context.getResources().getConfiguration(), k1.f15133a);
            g10.o0(M);
        }
        g10.E(false);
        j1 j1Var = (j1) M;
        g10.c(1157296644);
        boolean p10 = g10.p(j1Var);
        Object M2 = g10.M();
        if (p10 || M2 == aVar) {
            M2 = new g(j1Var);
            g10.o0(M2);
        }
        g10.E(false);
        androidComposeView2.setConfigurationChangeObserver((l) M2);
        g10.c(-492369756);
        Object M3 = g10.M();
        if (M3 == aVar) {
            sf.j.e(context, "context");
            M3 = new y0(context);
            g10.o0(M3);
        }
        g10.E(false);
        y0 y0Var = (y0) M3;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            g10.c(-492369756);
            Object M4 = g10.M();
            l3.b bVar2 = viewTreeOwners.f1213b;
            if (M4 == aVar) {
                sf.j.f(bVar2, "owner");
                ViewParent parent = androidComposeView.getParent();
                sf.j.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                sf.j.f(str, "id");
                String str2 = a0.a.class.getSimpleName() + ':' + str;
                androidx.savedstate.a w10 = bVar2.w();
                Bundle a10 = w10.a(str2);
                if (a10 != null) {
                    linkedHashMap = new LinkedHashMap();
                    Set<String> keySet = a10.keySet();
                    sf.j.e(keySet, "this.keySet()");
                    Iterator<T> it = keySet.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        Iterator<T> it2 = it;
                        ArrayList parcelableArrayList = a10.getParcelableArrayList(str3);
                        sf.j.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        sf.j.e(str3, "key");
                        linkedHashMap.put(str3, parcelableArrayList);
                        it = it2;
                        a10 = a10;
                    }
                } else {
                    linkedHashMap = null;
                }
                z2 z2Var = a0.c.f9a;
                m1 m1Var = m1.f1350a;
                sf.j.f(m1Var, "canBeSaved");
                a0.b bVar3 = new a0.b(linkedHashMap, m1Var);
                try {
                    w10.c(str2, new l1(bVar3));
                    z10 = true;
                } catch (IllegalArgumentException unused) {
                    z10 = false;
                }
                j1 j1Var2 = new j1(bVar3, new k1(z10, w10, str2));
                g10.o0(j1Var2);
                M4 = j1Var2;
            }
            g10.E(false);
            j1 j1Var3 = (j1) M4;
            t0.a(m.f8717a, new h(j1Var3), g10);
            sf.j.e(context, "context");
            Configuration configuration = (Configuration) j1Var.getValue();
            g10.c(-485908294);
            e0.b bVar4 = e0.f15020a;
            g10.c(-492369756);
            Object M5 = g10.M();
            if (M5 == aVar) {
                M5 = new u0.a();
                g10.o0(M5);
            }
            g10.E(false);
            u0.a aVar2 = (u0.a) M5;
            g10.c(-492369756);
            Object M6 = g10.M();
            Configuration configuration2 = M6;
            if (M6 == aVar) {
                Configuration configuration3 = new Configuration();
                if (configuration != null) {
                    configuration3.setTo(configuration);
                }
                g10.o0(configuration3);
                configuration2 = configuration3;
            }
            g10.E(false);
            Configuration configuration4 = (Configuration) configuration2;
            g10.c(-492369756);
            Object M7 = g10.M();
            if (M7 == aVar) {
                M7 = new s0(configuration4, aVar2);
                g10.o0(M7);
            }
            g10.E(false);
            t0.a(aVar2, new r0(context, (s0) M7), g10);
            g10.E(false);
            Configuration configuration5 = (Configuration) j1Var.getValue();
            sf.j.e(configuration5, "configuration");
            v1[] v1VarArr = {f1360a.b(configuration5), f1361b.b(context), f1363d.b(viewTreeOwners.f1212a), f1364e.b(bVar2), a0.c.f9a.b(j1Var3), f1365f.b(androidComposeView.getView()), f1362c.b(aVar2)};
            AndroidComposeView androidComposeView3 = androidComposeView;
            l0.a(v1VarArr, z.b.b(g10, 1471621628, new i(androidComposeView3, y0Var, pVar2, i10)), g10, 56);
            y1 G = g10.G();
            if (G != null) {
                G.f15286d = new j(androidComposeView3, pVar2, i10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
