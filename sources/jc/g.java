package jc;

import ab.x;
import android.app.Application;
import android.content.Context;
import cb.f;
import cb.o;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.data.local.AppDatabase;
import i3.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import jg.r;
import jg.v;
import kc.b;
import lc.d;
import sf.j;
import yg.c;
import yg.c0;
import yg.e;
import yg.i;
import yg.u;
import yg.y;
import zd.c;

public final class g extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final fe.a f9908a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9909b = this;

    /* renamed from: c  reason: collision with root package name */
    public ef.a<c> f9910c;

    /* renamed from: d  reason: collision with root package name */
    public ef.a<v> f9911d;

    /* renamed from: e  reason: collision with root package name */
    public ef.a<zg.a> f9912e;

    /* renamed from: f  reason: collision with root package name */
    public ef.a<c0> f9913f;

    /* renamed from: g  reason: collision with root package name */
    public ef.a<lc.a> f9914g;

    /* renamed from: h  reason: collision with root package name */
    public ef.a<mc.a> f9915h;

    /* renamed from: i  reason: collision with root package name */
    public ef.a<AppDatabase> f9916i;

    /* renamed from: j  reason: collision with root package name */
    public ef.a<b> f9917j;

    /* renamed from: k  reason: collision with root package name */
    public ef.a<lc.b> f9918k;

    /* renamed from: l  reason: collision with root package name */
    public ef.a<mc.b> f9919l;
    public ef.a<lc.c> m;

    /* renamed from: n  reason: collision with root package name */
    public ef.a<mc.c> f9920n;

    /* renamed from: o  reason: collision with root package name */
    public ef.a<d> f9921o;

    /* renamed from: p  reason: collision with root package name */
    public ef.a<mc.d> f9922p;

    public static final class a<T> implements ef.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final g f9923a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9924b;

        public a(g gVar, int i8) {
            this.f9923a = gVar;
            this.f9924b = i8;
        }

        public final T get() {
            g gVar = this.f9923a;
            int i8 = this.f9924b;
            switch (i8) {
                case 0:
                    Application a10 = z.a(gVar.f9908a);
                    lc.a aVar = gVar.f9914g.get();
                    j.f(aVar, "authApi");
                    return new mc.a(a10, aVar);
                case 1:
                    c0 c0Var = gVar.f9913f.get();
                    j.f(c0Var, "retrofit");
                    T b10 = c0Var.b(lc.a.class);
                    j.e(b10, "retrofit.create(AuthApi::class.java)");
                    return (lc.a) b10;
                case 2:
                    v vVar = gVar.f9911d.get();
                    zg.a aVar2 = gVar.f9912e.get();
                    j.f(vVar, "okHttpClient");
                    j.f(aVar2, "gsonConverterFactory");
                    y yVar = y.f17557c;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    r.a aVar3 = new r.a();
                    aVar3.d((r) null, "https://api.silencio.store/");
                    r a11 = aVar3.a();
                    List<String> list = a11.f10158f;
                    if ("".equals(list.get(list.size() - 1))) {
                        arrayList.add(aVar2);
                        Executor a12 = yVar.a();
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        i iVar = new i(a12);
                        boolean z10 = yVar.f17558a;
                        arrayList3.addAll(z10 ? Arrays.asList(new c.a[]{e.f17458a, iVar}) : Collections.singletonList(iVar));
                        ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + (z10 ? 1 : 0));
                        arrayList4.add(new yg.a());
                        arrayList4.addAll(arrayList);
                        arrayList4.addAll(z10 ? Collections.singletonList(u.f17514a) : Collections.emptyList());
                        return new c0(vVar, a11, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3));
                    }
                    throw new IllegalArgumentException("baseUrl must end in /: " + a11);
                case 3:
                    zd.c cVar = gVar.f9910c.get();
                    j.f(cVar, "encryptionHelper");
                    oc.a aVar4 = new oc.a(cVar);
                    vg.b bVar = new vg.b();
                    v.a aVar5 = new v.a();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    j.f(timeUnit, "unit");
                    aVar5.f10212s = kg.b.b(timeUnit);
                    aVar5.f10211r = kg.b.b(timeUnit);
                    ArrayList arrayList5 = aVar5.f10197c;
                    arrayList5.add(aVar4);
                    arrayList5.add(bVar);
                    return new v(aVar5);
                case 4:
                    return new zd.c();
                case 5:
                    return new zg.a(new ab.i(o.B, ab.b.f242a, Collections.emptyMap(), true, true, ab.v.f277a, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), x.f279a, x.f280b, Collections.emptyList()));
                case 6:
                    AppDatabase appDatabase = gVar.f9916i.get();
                    j.f(appDatabase, "database");
                    T p10 = appDatabase.p();
                    if (p10 != null) {
                        return p10;
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                case 7:
                    Context context = gVar.f9908a.f8700a;
                    if (context != null) {
                        p.a d10 = f.d(context, AppDatabase.class, "silencio-database");
                        d10.a(kc.a.f10402a);
                        d10.a(kc.a.f10403b);
                        d10.f9528j = true;
                        d10.f9529k = true;
                        return (AppDatabase) d10.b();
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                case 8:
                    Application a13 = z.a(gVar.f9908a);
                    lc.b bVar2 = gVar.f9918k.get();
                    j.f(bVar2, "measureApi");
                    return new mc.b(a13, bVar2);
                case 9:
                    c0 c0Var2 = gVar.f9913f.get();
                    j.f(c0Var2, "retrofit");
                    T b11 = c0Var2.b(lc.b.class);
                    j.e(b11, "retrofit.create(MeasureApi::class.java)");
                    return (lc.b) b11;
                case 10:
                    lc.c cVar2 = gVar.m.get();
                    j.f(cVar2, "menuApi");
                    return new mc.c(cVar2);
                case ModuleDescriptor.MODULE_VERSION:
                    c0 c0Var3 = gVar.f9913f.get();
                    j.f(c0Var3, "retrofit");
                    T b12 = c0Var3.b(lc.c.class);
                    j.e(b12, "retrofit.create(MenuApi::class.java)");
                    return (lc.c) b12;
                case 12:
                    d dVar = gVar.f9921o.get();
                    j.f(dVar, "tabsApi");
                    return new mc.d(dVar);
                case 13:
                    c0 c0Var4 = gVar.f9913f.get();
                    j.f(c0Var4, "retrofit");
                    T b13 = c0Var4.b(d.class);
                    j.e(b13, "retrofit.create(TabsApi::class.java)");
                    return (d) b13;
                default:
                    throw new AssertionError(i8);
            }
        }
    }

    public g(fe.a aVar) {
        this.f9908a = aVar;
        this.f9910c = ie.a.a(new a(this, 4));
        this.f9911d = ie.a.a(new a(this, 3));
        this.f9912e = ie.a.a(new a(this, 5));
        this.f9913f = ie.a.a(new a(this, 2));
        this.f9914g = ie.a.a(new a(this, 1));
        this.f9915h = ie.a.a(new a(this, 0));
        this.f9916i = ie.a.a(new a(this, 7));
        this.f9917j = ie.a.a(new a(this, 6));
        this.f9918k = ie.a.a(new a(this, 9));
        this.f9919l = ie.a.a(new a(this, 8));
        this.m = ie.a.a(new a(this, 11));
        this.f9920n = ie.a.a(new a(this, 10));
        this.f9921o = ie.a.a(new a(this, 13));
        this.f9922p = ie.a.a(new a(this, 12));
    }

    public final Set<Boolean> a() {
        return Collections.emptySet();
    }

    public final void b() {
    }

    public final c c() {
        return new c(this.f9909b);
    }
}
