package b3;

import ag.f2;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.n;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.z0;
import androidx.lifecycle.j;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import b3.j;
import b3.z;
import d2.f1;
import gf.k;
import gf.o;
import gf.q;
import gf.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.l0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.p0;
import kotlinx.coroutines.flow.y0;
import rf.l;
import sf.r;
import sf.t;
import sf.y;
import yf.p;

public class m {
    public final ArrayList A;
    public final ff.j B;
    public final p0 C;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3101a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f3102b;

    /* renamed from: c  reason: collision with root package name */
    public b0 f3103c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f3104d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable[] f3105e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3106f;

    /* renamed from: g  reason: collision with root package name */
    public final k<j> f3107g;

    /* renamed from: h  reason: collision with root package name */
    public final y0 f3108h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f3109i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f3110j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f3111k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f3112l;
    public p m;

    /* renamed from: n  reason: collision with root package name */
    public OnBackPressedDispatcher f3113n;

    /* renamed from: o  reason: collision with root package name */
    public t f3114o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f3115p;

    /* renamed from: q  reason: collision with root package name */
    public j.b f3116q;

    /* renamed from: r  reason: collision with root package name */
    public final l f3117r;

    /* renamed from: s  reason: collision with root package name */
    public final e f3118s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3119t;

    /* renamed from: u  reason: collision with root package name */
    public final o0 f3120u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f3121v;

    /* renamed from: w  reason: collision with root package name */
    public l<? super j, ff.m> f3122w;

    /* renamed from: x  reason: collision with root package name */
    public l<? super j, ff.m> f3123x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f3124y;

    /* renamed from: z  reason: collision with root package name */
    public int f3125z;

    public final class a extends p0 {

        /* renamed from: g  reason: collision with root package name */
        public final m0<? extends z> f3126g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ m f3127h;

        /* renamed from: b3.m$a$a  reason: collision with other inner class name */
        public static final class C0037a extends sf.k implements rf.a<ff.m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f3128a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ j f3129b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ boolean f3130c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0037a(a aVar, j jVar, boolean z10) {
                super(0);
                this.f3128a = aVar;
                this.f3129b = jVar;
                this.f3130c = z10;
            }

            public final Object d() {
                a.super.c(this.f3129b, this.f3130c);
                return ff.m.f8717a;
            }
        }

        public a(m mVar, m0<? extends z> m0Var) {
            sf.j.f(m0Var, "navigator");
            this.f3127h = mVar;
            this.f3126g = m0Var;
        }

        public final j a(z zVar, Bundle bundle) {
            m mVar = this.f3127h;
            return j.a.a(mVar.f3101a, zVar, bundle, mVar.j(), mVar.f3114o);
        }

        public final void c(j jVar, boolean z10) {
            sf.j.f(jVar, "popUpTo");
            m mVar = this.f3127h;
            m0 b10 = mVar.f3120u.b(jVar.f3084b.f3201a);
            if (sf.j.a(b10, this.f3126g)) {
                l<? super j, ff.m> lVar = mVar.f3123x;
                if (lVar != null) {
                    lVar.invoke(jVar);
                    super.c(jVar, z10);
                    return;
                }
                C0037a aVar = new C0037a(this, jVar, z10);
                k<j> kVar = mVar.f3107g;
                int indexOf = kVar.indexOf(jVar);
                if (indexOf < 0) {
                    Log.i("NavController", "Ignoring pop of " + jVar + " as it was not found on the current back stack");
                    return;
                }
                int i8 = indexOf + 1;
                if (i8 != kVar.f8975c) {
                    mVar.p(kVar.get(i8).f3084b.D, true, false);
                }
                mVar.q(jVar, false, new k());
                aVar.d();
                mVar.x();
                mVar.c();
                return;
            }
            Object obj = mVar.f3121v.get(b10);
            sf.j.c(obj);
            ((a) obj).c(jVar, z10);
        }

        public final void d(j jVar) {
            sf.j.f(jVar, "backStackEntry");
            m mVar = this.f3127h;
            m0 b10 = mVar.f3120u.b(jVar.f3084b.f3201a);
            if (sf.j.a(b10, this.f3126g)) {
                l<? super j, ff.m> lVar = mVar.f3122w;
                if (lVar != null) {
                    lVar.invoke(jVar);
                    super.d(jVar);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + jVar.f3084b + " outside of the call to navigate(). ");
                return;
            }
            Object obj = mVar.f3121v.get(b10);
            if (obj != null) {
                ((a) obj).d(jVar);
                return;
            }
            throw new IllegalStateException(androidx.activity.g.a(new StringBuilder("NavigatorBackStack for "), jVar.f3084b.f3201a, " should already be created").toString());
        }

        public final void f(j jVar) {
            super.d(jVar);
        }
    }

    public interface b {
        void a(m mVar, z zVar);
    }

    public static final class c extends sf.k implements l<Context, Context> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3131a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Context context = (Context) obj;
            sf.j.f(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public static final class d extends sf.k implements rf.a<e0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f3132a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(m mVar) {
            super(0);
            this.f3132a = mVar;
        }

        public final Object d() {
            m mVar = this.f3132a;
            mVar.getClass();
            return new e0(mVar.f3101a, mVar.f3120u);
        }
    }

    public static final class e extends n {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m f3133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(m mVar) {
            super(false);
            this.f3133d = mVar;
        }

        public final void a() {
            m mVar = this.f3133d;
            if (!mVar.f3107g.isEmpty()) {
                z g10 = mVar.g();
                sf.j.c(g10);
                if (mVar.p(g10.D, true, false)) {
                    mVar.c();
                }
            }
        }
    }

    public static final class f extends sf.k implements l<j, ff.m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f3134a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r f3135b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ m f3136c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f3137d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ k<k> f3138e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(r rVar, r rVar2, m mVar, boolean z10, k<k> kVar) {
            super(1);
            this.f3134a = rVar;
            this.f3135b = rVar2;
            this.f3136c = mVar;
            this.f3137d = z10;
            this.f3138e = kVar;
        }

        public final Object invoke(Object obj) {
            j jVar = (j) obj;
            sf.j.f(jVar, "entry");
            this.f3134a.f14953a = true;
            this.f3135b.f14953a = true;
            this.f3136c.q(jVar, this.f3137d, this.f3138e);
            return ff.m.f8717a;
        }
    }

    public static final class g extends sf.k implements l<z, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f3139a = new g();

        public g() {
            super(1);
        }

        public final Object invoke(Object obj) {
            z zVar = (z) obj;
            sf.j.f(zVar, "destination");
            b0 b0Var = zVar.f3202b;
            if (b0Var != null && b0Var.H == zVar.D) {
                return b0Var;
            }
            return null;
        }
    }

    public static final class h extends sf.k implements l<z, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f3140a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(m mVar) {
            super(1);
            this.f3140a = mVar;
        }

        public final Object invoke(Object obj) {
            z zVar = (z) obj;
            sf.j.f(zVar, "destination");
            return Boolean.valueOf(!this.f3140a.f3111k.containsKey(Integer.valueOf(zVar.D)));
        }
    }

    public static final class i extends sf.k implements l<z, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f3141a = new i();

        public i() {
            super(1);
        }

        public final Object invoke(Object obj) {
            z zVar = (z) obj;
            sf.j.f(zVar, "destination");
            b0 b0Var = zVar.f3202b;
            if (b0Var != null && b0Var.H == zVar.D) {
                return b0Var;
            }
            return null;
        }
    }

    public static final class j extends sf.k implements l<z, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f3142a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(m mVar) {
            super(1);
            this.f3142a = mVar;
        }

        public final Object invoke(Object obj) {
            z zVar = (z) obj;
            sf.j.f(zVar, "destination");
            return Boolean.valueOf(!this.f3142a.f3111k.containsKey(Integer.valueOf(zVar.D)));
        }
    }

    public m(Context context) {
        Object obj;
        this.f3101a = context;
        Iterator it = yf.k.o0(context, c.f3131a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f3102b = (Activity) obj;
        this.f3107g = new k<>();
        y0 a10 = z0.a(s.f8978a);
        this.f3108h = a10;
        new m0(a10, (f2) null);
        this.f3109i = new LinkedHashMap();
        this.f3110j = new LinkedHashMap();
        this.f3111k = new LinkedHashMap();
        this.f3112l = new LinkedHashMap();
        this.f3115p = new CopyOnWriteArrayList<>();
        this.f3116q = j.b.f2278b;
        this.f3117r = new l(this, 0);
        this.f3118s = new e(this);
        this.f3119t = true;
        o0 o0Var = new o0();
        this.f3120u = o0Var;
        this.f3121v = new LinkedHashMap();
        this.f3124y = new LinkedHashMap();
        o0Var.a(new c0(o0Var));
        o0Var.a(new b(this.f3101a));
        this.A = new ArrayList();
        this.B = b7.a.x(new d(this));
        p0 a11 = b3.a(1, 0, cg.e.f4021b);
        this.C = a11;
        new l0(a11, (f2) null);
    }

    public static z e(z zVar, int i8) {
        b0 b0Var;
        if (zVar.D == i8) {
            return zVar;
        }
        if (zVar instanceof b0) {
            b0Var = (b0) zVar;
        } else {
            b0Var = zVar.f3202b;
            sf.j.c(b0Var);
        }
        return b0Var.j(i8, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x000a A[LOOP:0: B:2:0x000a->B:7:0x002a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(b3.z r12, android.os.Bundle r13, b3.j r14, java.util.List<b3.j> r15) {
        /*
            r11 = this;
            b3.z r0 = r14.f3084b
            boolean r1 = r0 instanceof b3.d
            r2 = 1
            r3 = 0
            gf.k<b3.j> r4 = r11.f3107g
            if (r1 != 0) goto L_0x002c
        L_0x000a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x002c
            java.lang.Object r1 = r4.last()
            b3.j r1 = (b3.j) r1
            b3.z r1 = r1.f3084b
            boolean r1 = r1 instanceof b3.d
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r4.last()
            b3.j r1 = (b3.j) r1
            b3.z r1 = r1.f3084b
            int r1 = r1.D
            boolean r1 = r11.p(r1, r2, r3)
            if (r1 != 0) goto L_0x000a
        L_0x002c:
            gf.k r1 = new gf.k
            r1.<init>()
            boolean r5 = r12 instanceof b3.b0
            android.content.Context r6 = r11.f3101a
            r7 = 0
            if (r5 == 0) goto L_0x008e
            r5 = r0
        L_0x0039:
            sf.j.c(r5)
            b3.b0 r5 = r5.f3202b
            if (r5 == 0) goto L_0x008a
            int r8 = r15.size()
            java.util.ListIterator r8 = r15.listIterator(r8)
        L_0x0048:
            boolean r9 = r8.hasPrevious()
            if (r9 == 0) goto L_0x005e
            java.lang.Object r9 = r8.previous()
            r10 = r9
            b3.j r10 = (b3.j) r10
            b3.z r10 = r10.f3084b
            boolean r10 = sf.j.a(r10, r5)
            if (r10 == 0) goto L_0x0048
            goto L_0x005f
        L_0x005e:
            r9 = r7
        L_0x005f:
            b3.j r9 = (b3.j) r9
            if (r9 != 0) goto L_0x006d
            androidx.lifecycle.j$b r8 = r11.j()
            b3.t r9 = r11.f3114o
            b3.j r9 = b3.j.a.a(r6, r5, r13, r8, r9)
        L_0x006d:
            r1.addFirst(r9)
            boolean r8 = r4.isEmpty()
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x008a
            java.lang.Object r8 = r4.last()
            b3.j r8 = (b3.j) r8
            b3.z r8 = r8.f3084b
            if (r8 != r5) goto L_0x008a
            java.lang.Object r8 = r4.last()
            b3.j r8 = (b3.j) r8
            r11.q(r8, false, new gf.k())
        L_0x008a:
            if (r5 == 0) goto L_0x008e
            if (r5 != r12) goto L_0x0039
        L_0x008e:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0096
            r2 = r0
            goto L_0x009e
        L_0x0096:
            java.lang.Object r2 = r1.first()
            b3.j r2 = (b3.j) r2
            b3.z r2 = r2.f3084b
        L_0x009e:
            if (r2 == 0) goto L_0x00e1
            int r5 = r2.D
            b3.z r5 = r11.d(r5)
            if (r5 != 0) goto L_0x00e1
            b3.b0 r2 = r2.f3202b
            if (r2 == 0) goto L_0x009e
            int r5 = r15.size()
            java.util.ListIterator r5 = r15.listIterator(r5)
        L_0x00b4:
            boolean r8 = r5.hasPrevious()
            if (r8 == 0) goto L_0x00ca
            java.lang.Object r8 = r5.previous()
            r9 = r8
            b3.j r9 = (b3.j) r9
            b3.z r9 = r9.f3084b
            boolean r9 = sf.j.a(r9, r2)
            if (r9 == 0) goto L_0x00b4
            goto L_0x00cb
        L_0x00ca:
            r8 = r7
        L_0x00cb:
            b3.j r8 = (b3.j) r8
            if (r8 != 0) goto L_0x00dd
            android.os.Bundle r5 = r2.b(r13)
            androidx.lifecycle.j$b r8 = r11.j()
            b3.t r9 = r11.f3114o
            b3.j r8 = b3.j.a.a(r6, r2, r5, r8, r9)
        L_0x00dd:
            r1.addFirst(r8)
            goto L_0x009e
        L_0x00e1:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00e8
            goto L_0x00f0
        L_0x00e8:
            java.lang.Object r0 = r1.first()
            b3.j r0 = (b3.j) r0
            b3.z r0 = r0.f3084b
        L_0x00f0:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x011e
            java.lang.Object r2 = r4.last()
            b3.j r2 = (b3.j) r2
            b3.z r2 = r2.f3084b
            boolean r2 = r2 instanceof b3.b0
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r4.last()
            b3.j r2 = (b3.j) r2
            b3.z r2 = r2.f3084b
            b3.b0 r2 = (b3.b0) r2
            int r5 = r0.D
            b3.z r2 = r2.j(r5, r3)
            if (r2 != 0) goto L_0x011e
            java.lang.Object r2 = r4.last()
            b3.j r2 = (b3.j) r2
            r11.q(r2, false, new gf.k())
            goto L_0x00f0
        L_0x011e:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0126
            r0 = r7
            goto L_0x012c
        L_0x0126:
            java.lang.Object[] r0 = r4.f8974b
            int r2 = r4.f8973a
            r0 = r0[r2]
        L_0x012c:
            b3.j r0 = (b3.j) r0
            if (r0 != 0) goto L_0x0140
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0138
            r0 = r7
            goto L_0x013e
        L_0x0138:
            java.lang.Object[] r0 = r1.f8974b
            int r2 = r1.f8973a
            r0 = r0[r2]
        L_0x013e:
            b3.j r0 = (b3.j) r0
        L_0x0140:
            if (r0 == 0) goto L_0x0145
            b3.z r0 = r0.f3084b
            goto L_0x0146
        L_0x0145:
            r0 = r7
        L_0x0146:
            b3.b0 r2 = r11.f3103c
            boolean r0 = sf.j.a(r0, r2)
            if (r0 != 0) goto L_0x0190
            int r0 = r15.size()
            java.util.ListIterator r15 = r15.listIterator(r0)
        L_0x0156:
            boolean r0 = r15.hasPrevious()
            if (r0 == 0) goto L_0x0171
            java.lang.Object r0 = r15.previous()
            r2 = r0
            b3.j r2 = (b3.j) r2
            b3.z r2 = r2.f3084b
            b3.b0 r3 = r11.f3103c
            sf.j.c(r3)
            boolean r2 = sf.j.a(r2, r3)
            if (r2 == 0) goto L_0x0156
            r7 = r0
        L_0x0171:
            b3.j r7 = (b3.j) r7
            if (r7 != 0) goto L_0x018d
            b3.b0 r15 = r11.f3103c
            sf.j.c(r15)
            b3.b0 r0 = r11.f3103c
            sf.j.c(r0)
            android.os.Bundle r13 = r0.b(r13)
            androidx.lifecycle.j$b r0 = r11.j()
            b3.t r2 = r11.f3114o
            b3.j r7 = b3.j.a.a(r6, r15, r13, r0, r2)
        L_0x018d:
            r1.addFirst(r7)
        L_0x0190:
            java.util.Iterator r13 = r1.iterator()
        L_0x0194:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x01d1
            java.lang.Object r15 = r13.next()
            b3.j r15 = (b3.j) r15
            b3.z r0 = r15.f3084b
            java.lang.String r0 = r0.f3201a
            b3.o0 r2 = r11.f3120u
            b3.m0 r0 = r2.b(r0)
            java.util.LinkedHashMap r2 = r11.f3121v
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x01b8
            b3.m$a r0 = (b3.m.a) r0
            r0.f(r15)
            goto L_0x0194
        L_0x01b8:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "NavigatorBackStack for "
            r13.<init>(r14)
            java.lang.String r12 = r12.f3201a
            java.lang.String r14 = " should already be created"
            java.lang.String r12 = androidx.activity.g.a(r13, r12, r14)
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L_0x01d1:
            r4.addAll(r1)
            r4.addLast(r14)
            java.util.ArrayList r12 = gf.q.H0(r1, r14)
            java.util.Iterator r12 = r12.iterator()
        L_0x01df:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01fb
            java.lang.Object r13 = r12.next()
            b3.j r13 = (b3.j) r13
            b3.z r14 = r13.f3084b
            b3.b0 r14 = r14.f3202b
            if (r14 == 0) goto L_0x01df
            int r14 = r14.D
            b3.j r14 = r11.f(r14)
            r11.k(r13, r14)
            goto L_0x01df
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.a(b3.z, android.os.Bundle, b3.j, java.util.List):void");
    }

    public final void b(b bVar) {
        this.f3115p.add(bVar);
        k<j> kVar = this.f3107g;
        if (!kVar.isEmpty()) {
            bVar.a(this, kVar.last().f3084b);
        }
    }

    public final boolean c() {
        k<j> kVar;
        while (true) {
            kVar = this.f3107g;
            if (kVar.isEmpty() || !(kVar.last().f3084b instanceof b0)) {
                j g10 = kVar.g();
                ArrayList arrayList = this.A;
            } else {
                q(kVar.last(), false, new k());
            }
        }
        j g102 = kVar.g();
        ArrayList arrayList2 = this.A;
        if (g102 != null) {
            arrayList2.add(g102);
        }
        this.f3125z++;
        w();
        int i8 = this.f3125z - 1;
        this.f3125z = i8;
        if (i8 == 0) {
            ArrayList P0 = q.P0(arrayList2);
            arrayList2.clear();
            Iterator it = P0.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                Iterator<b> it2 = this.f3115p.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, jVar.f3084b);
                }
                this.C.h(jVar);
            }
            this.f3108h.setValue(s());
        }
        return g102 != null;
    }

    public final z d(int i8) {
        z zVar;
        b0 b0Var = this.f3103c;
        if (b0Var == null) {
            return null;
        }
        if (b0Var.D == i8) {
            return b0Var;
        }
        j g10 = this.f3107g.g();
        if (g10 == null || (zVar = g10.f3084b) == null) {
            zVar = this.f3103c;
            sf.j.c(zVar);
        }
        return e(zVar, i8);
    }

    public final j f(int i8) {
        j jVar;
        boolean z10;
        k<j> kVar = this.f3107g;
        ListIterator<j> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                jVar = null;
                break;
            }
            jVar = listIterator.previous();
            if (jVar.f3084b.D == i8) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        j jVar2 = jVar;
        if (jVar2 != null) {
            return jVar2;
        }
        StringBuilder b10 = a1.b("No destination with ID ", i8, " is on the NavController's back stack. The current destination is ");
        b10.append(g());
        throw new IllegalArgumentException(b10.toString().toString());
    }

    public final z g() {
        j g10 = this.f3107g.g();
        if (g10 != null) {
            return g10.f3084b;
        }
        return null;
    }

    public final int h() {
        k<j> kVar = this.f3107g;
        int i8 = 0;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<j> it = kVar.iterator();
            while (it.hasNext()) {
                if ((!(it.next().f3084b instanceof b0)) && (i8 = i8 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i8;
    }

    public final b0 i() {
        b0 b0Var = this.f3103c;
        if (b0Var == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        } else if (b0Var != null) {
            return b0Var;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
    }

    public final j.b j() {
        return this.m == null ? j.b.f2279c : this.f3116q;
    }

    public final void k(j jVar, j jVar2) {
        this.f3109i.put(jVar, jVar2);
        LinkedHashMap linkedHashMap = this.f3110j;
        if (linkedHashMap.get(jVar2) == null) {
            linkedHashMap.put(jVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(jVar2);
        sf.j.c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r7, android.os.Bundle r8, b3.f0 r9) {
        /*
            r6 = this;
            gf.k<b3.j> r0 = r6.f3107g
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000b
            b3.b0 r0 = r6.f3103c
            goto L_0x0013
        L_0x000b:
            java.lang.Object r0 = r0.last()
            b3.j r0 = (b3.j) r0
            b3.z r0 = r0.f3084b
        L_0x0013:
            if (r0 == 0) goto L_0x00bc
            b3.e r1 = r0.d(r7)
            if (r1 == 0) goto L_0x002e
            if (r9 != 0) goto L_0x001f
            b3.f0 r9 = r1.f3039b
        L_0x001f:
            android.os.Bundle r2 = r1.f3040c
            int r3 = r1.f3038a
            if (r2 == 0) goto L_0x002f
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putAll(r2)
            goto L_0x0030
        L_0x002e:
            r3 = r7
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r8 == 0) goto L_0x003c
            if (r4 != 0) goto L_0x0039
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x0039:
            r4.putAll(r8)
        L_0x003c:
            r8 = 0
            if (r3 != 0) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            r2 = -1
            int r5 = r9.f3046c
            if (r5 == r2) goto L_0x0052
            boolean r7 = r9.f3047d
            boolean r7 = r6.p(r5, r7, r8)
            if (r7 == 0) goto L_0x00af
            r6.c()
            goto L_0x00af
        L_0x0052:
            r2 = 1
            if (r3 == 0) goto L_0x0057
            r5 = r2
            goto L_0x0058
        L_0x0057:
            r5 = r8
        L_0x0058:
            if (r5 == 0) goto L_0x00b0
            b3.z r5 = r6.d(r3)
            if (r5 != 0) goto L_0x00ac
            int r9 = b3.z.F
            android.content.Context r9 = r6.f3101a
            java.lang.String r3 = b3.z.a.a(r9, r3)
            if (r1 != 0) goto L_0x006b
            r8 = r2
        L_0x006b:
            java.lang.String r1 = " cannot be found from the current destination "
            if (r8 != 0) goto L_0x0092
            java.lang.String r8 = "Navigation destination "
            java.lang.String r2 = " referenced from action "
            java.lang.StringBuilder r8 = androidx.activity.result.d.c(r8, r3, r2)
            java.lang.String r7 = b3.z.a.a(r9, r7)
            r8.append(r7)
            r8.append(r1)
            r8.append(r0)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0092:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Navigation action/destination "
            r8.<init>(r9)
            r8.append(r3)
            r8.append(r1)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00ac:
            r6.m(r5, r4, r9)
        L_0x00af:
            return
        L_0x00b0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00bc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "no current navigation node"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.l(int, android.os.Bundle, b3.f0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r8 = r2.f3046c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010d A[LOOP:1: B:42:0x0107->B:44:0x010d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(b3.z r18, android.os.Bundle r19, b3.f0 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.util.LinkedHashMap r3 = r0.f3121v
            java.util.Collection r4 = r3.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0012:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r4.next()
            b3.m$a r5 = (b3.m.a) r5
            r5.f3158d = r6
            goto L_0x0012
        L_0x0022:
            sf.r r4 = new sf.r
            r4.<init>()
            if (r2 == 0) goto L_0x0037
            r7 = -1
            int r8 = r2.f3046c
            if (r8 == r7) goto L_0x0037
            boolean r7 = r2.f3047d
            boolean r9 = r2.f3048e
            boolean r7 = r0.p(r8, r7, r9)
            goto L_0x0038
        L_0x0037:
            r7 = 0
        L_0x0038:
            android.os.Bundle r11 = r18.b(r19)
            if (r2 == 0) goto L_0x0044
            boolean r8 = r2.f3045b
            if (r8 != r6) goto L_0x0044
            r8 = r6
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            if (r8 == 0) goto L_0x0061
            java.util.LinkedHashMap r8 = r0.f3111k
            int r9 = r1.D
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L_0x0061
            int r1 = r1.D
            boolean r1 = r0.t(r1, r11, r2)
            r4.f14953a = r1
            r16 = r7
            goto L_0x00f9
        L_0x0061:
            gf.k<b3.j> r15 = r0.f3107g
            java.lang.Object r8 = r15.g()
            r14 = r8
            b3.j r14 = (b3.j) r14
            b3.o0 r8 = r0.f3120u
            java.lang.String r9 = r1.f3201a
            b3.m0 r13 = r8.b(r9)
            if (r2 == 0) goto L_0x007a
            boolean r8 = r2.f3044a
            if (r8 != r6) goto L_0x007a
            r8 = r6
            goto L_0x007b
        L_0x007a:
            r8 = 0
        L_0x007b:
            if (r8 == 0) goto L_0x00d9
            if (r14 == 0) goto L_0x008b
            b3.z r8 = r14.f3084b
            if (r8 == 0) goto L_0x008b
            int r9 = r1.D
            int r8 = r8.D
            if (r9 != r8) goto L_0x008b
            r8 = r6
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            if (r8 == 0) goto L_0x00d9
            java.lang.Object r1 = r15.removeLast()
            b3.j r1 = (b3.j) r1
            r0.v(r1)
            b3.j r1 = new b3.j
            java.lang.String r2 = "entry"
            sf.j.f(r14, r2)
            android.content.Context r9 = r14.f3083a
            b3.z r10 = r14.f3084b
            androidx.lifecycle.j$b r12 = r14.f3086d
            b3.i0 r2 = r14.f3087e
            java.lang.String r8 = r14.B
            android.os.Bundle r6 = r14.C
            r16 = r8
            r8 = r1
            r5 = r13
            r13 = r2
            r2 = r14
            r14 = r16
            r16 = r7
            r7 = r15
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            androidx.lifecycle.j$b r6 = r2.f3086d
            r1.f3086d = r6
            androidx.lifecycle.j$b r2 = r2.H
            r1.a(r2)
            r7.addLast(r1)
            b3.z r2 = r1.f3084b
            b3.b0 r2 = r2.f3202b
            if (r2 == 0) goto L_0x00d4
            int r2 = r2.D
            b3.j r2 = r0.f(r2)
            r0.k(r1, r2)
        L_0x00d4:
            r5.f(r1)
            r6 = 1
            goto L_0x00fa
        L_0x00d9:
            r16 = r7
            r5 = r13
            androidx.lifecycle.j$b r6 = r17.j()
            b3.t r7 = r0.f3114o
            android.content.Context r8 = r0.f3101a
            b3.j r6 = b3.j.a.a(r8, r1, r11, r6, r7)
            java.util.List r6 = cb.d.O(r6)
            b3.q r7 = new b3.q
            r7.<init>(r4, r0, r1, r11)
            r0.f3122w = r7
            r5.d(r6, r2)
            r1 = 0
            r0.f3122w = r1
        L_0x00f9:
            r6 = 0
        L_0x00fa:
            r17.x()
            java.util.Collection r1 = r3.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0107:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0117
            java.lang.Object r2 = r1.next()
            b3.m$a r2 = (b3.m.a) r2
            r3 = 0
            r2.f3158d = r3
            goto L_0x0107
        L_0x0117:
            if (r16 != 0) goto L_0x0124
            boolean r1 = r4.f14953a
            if (r1 != 0) goto L_0x0124
            if (r6 == 0) goto L_0x0120
            goto L_0x0124
        L_0x0120:
            r17.w()
            goto L_0x0127
        L_0x0124:
            r17.c()
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.m(b3.z, android.os.Bundle, b3.f0):void");
    }

    public final void n(a0 a0Var) {
        l(a0Var.b(), a0Var.a(), (f0) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r4 = r3.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r13 = this;
            int r0 = r13.h()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x019b
            r0 = 0
            android.app.Activity r3 = r13.f3102b
            if (r3 == 0) goto L_0x0018
            android.content.Intent r4 = r3.getIntent()
            if (r4 == 0) goto L_0x0018
            android.os.Bundle r4 = r4.getExtras()
            goto L_0x0019
        L_0x0018:
            r4 = r0
        L_0x0019:
            java.lang.String r5 = "android-support-nav:controller:deepLinkIds"
            if (r4 == 0) goto L_0x0022
            int[] r4 = r4.getIntArray(r5)
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            java.lang.String r6 = "android-support-nav:controller:deepLinkExtras"
            java.lang.String r7 = "android-support-nav:controller:deepLinkIntent"
            if (r4 == 0) goto L_0x0115
            boolean r4 = r13.f3106f
            if (r4 != 0) goto L_0x002f
            goto L_0x010e
        L_0x002f:
            sf.j.c(r3)
            android.content.Intent r4 = r3.getIntent()
            android.os.Bundle r8 = r4.getExtras()
            sf.j.c(r8)
            int[] r5 = r8.getIntArray(r5)
            sf.j.c(r5)
            java.util.ArrayList r5 = gf.l.g0(r5)
            java.lang.String r9 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r9 = r8.getParcelableArrayList(r9)
            boolean r10 = r5.isEmpty()
            java.lang.String r11 = "List is empty."
            if (r10 != 0) goto L_0x010f
            int r10 = cb.d.H(r5)
            java.lang.Object r10 = r5.remove(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r9 == 0) goto L_0x007d
            boolean r12 = r9.isEmpty()
            if (r12 != 0) goto L_0x0077
            int r11 = cb.d.H(r9)
            java.lang.Object r11 = r9.remove(r11)
            android.os.Bundle r11 = (android.os.Bundle) r11
            goto L_0x007d
        L_0x0077:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r11)
            throw r0
        L_0x007d:
            boolean r11 = r5.isEmpty()
            if (r11 == 0) goto L_0x0085
            goto L_0x010e
        L_0x0085:
            b3.b0 r11 = r13.i()
            b3.z r11 = e(r11, r10)
            boolean r12 = r11 instanceof b3.b0
            if (r12 == 0) goto L_0x009b
            int r10 = b3.b0.K
            b3.b0 r11 = (b3.b0) r11
            b3.z r10 = b3.b0.a.a(r11)
            int r10 = r10.D
        L_0x009b:
            b3.z r11 = r13.g()
            if (r11 == 0) goto L_0x00a7
            int r11 = r11.D
            if (r10 != r11) goto L_0x00a7
            r10 = r2
            goto L_0x00a8
        L_0x00a7:
            r10 = r1
        L_0x00a8:
            if (r10 != 0) goto L_0x00ab
            goto L_0x010e
        L_0x00ab:
            b3.v r10 = new b3.v
            r10.<init>(r13)
            ff.g[] r2 = new ff.g[r2]
            ff.g r11 = new ff.g
            r11.<init>(r7, r4)
            r2[r1] = r11
            android.os.Bundle r2 = y1.d.a(r2)
            android.os.Bundle r4 = r8.getBundle(r6)
            if (r4 == 0) goto L_0x00c6
            r2.putAll(r4)
        L_0x00c6:
            android.content.Intent r4 = r10.f3191b
            r4.putExtra(r6, r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x00cf:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0104
            java.lang.Object r4 = r2.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L_0x0100
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r9 == 0) goto L_0x00ec
            java.lang.Object r1 = r9.get(r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            goto L_0x00ed
        L_0x00ec:
            r1 = r0
        L_0x00ed:
            java.util.ArrayList r6 = r10.f3193d
            b3.v$a r7 = new b3.v$a
            r7.<init>(r4, r1)
            r6.add(r7)
            b3.b0 r1 = r10.f3192c
            if (r1 == 0) goto L_0x00fe
            r10.c()
        L_0x00fe:
            r1 = r5
            goto L_0x00cf
        L_0x0100:
            cb.d.i0()
            throw r0
        L_0x0104:
            s1.c0 r0 = r10.a()
            r0.b()
            r3.finish()
        L_0x010e:
            return
        L_0x010f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r11)
            throw r0
        L_0x0115:
            b3.z r1 = r13.g()
            sf.j.c(r1)
            int r2 = r1.D
            b3.b0 r1 = r1.f3202b
        L_0x0120:
            if (r1 == 0) goto L_0x019a
            int r4 = r1.H
            if (r4 == r2) goto L_0x0195
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            if (r3 == 0) goto L_0x0168
            android.content.Intent r4 = r3.getIntent()
            if (r4 == 0) goto L_0x0168
            android.content.Intent r4 = r3.getIntent()
            android.net.Uri r4 = r4.getData()
            if (r4 == 0) goto L_0x0168
            android.content.Intent r4 = r3.getIntent()
            r2.putParcelable(r7, r4)
            b3.b0 r4 = r13.f3103c
            sf.j.c(r4)
            b3.w r5 = new b3.w
            android.content.Intent r7 = r3.getIntent()
            java.lang.String r8 = "activity!!.intent"
            sf.j.e(r7, r8)
            r5.<init>((android.content.Intent) r7)
            b3.z$b r4 = r4.g(r5)
            if (r4 == 0) goto L_0x0168
            b3.z r5 = r4.f3206a
            android.os.Bundle r4 = r4.f3207b
            android.os.Bundle r4 = r5.b(r4)
            r2.putAll(r4)
        L_0x0168:
            b3.v r4 = new b3.v
            r4.<init>(r13)
            int r1 = r1.D
            java.util.ArrayList r5 = r4.f3193d
            r5.clear()
            b3.v$a r7 = new b3.v$a
            r7.<init>(r1, r0)
            r5.add(r7)
            b3.b0 r0 = r4.f3192c
            if (r0 == 0) goto L_0x0183
            r4.c()
        L_0x0183:
            android.content.Intent r0 = r4.f3191b
            r0.putExtra(r6, r2)
            s1.c0 r0 = r4.a()
            r0.b()
            if (r3 == 0) goto L_0x019a
            r3.finish()
            goto L_0x019a
        L_0x0195:
            int r2 = r1.D
            b3.b0 r1 = r1.f3202b
            goto L_0x0120
        L_0x019a:
            return
        L_0x019b:
            gf.k<b3.j> r0 = r13.f3107g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a4
            goto L_0x01b6
        L_0x01a4:
            b3.z r0 = r13.g()
            sf.j.c(r0)
            int r0 = r0.D
            boolean r0 = r13.p(r0, r2, r1)
            if (r0 == 0) goto L_0x01b6
            r13.c()
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.o():void");
    }

    public final boolean p(int i8, boolean z10, boolean z11) {
        z zVar;
        String str;
        String str2;
        int i10 = i8;
        boolean z12 = z11;
        k<j> kVar = this.f3107g;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = q.I0(kVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                zVar = null;
                break;
            }
            z zVar2 = ((j) it.next()).f3084b;
            m0 b10 = this.f3120u.b(zVar2.f3201a);
            if (z10 || zVar2.D != i10) {
                arrayList.add(b10);
            }
            if (zVar2.D == i10) {
                zVar = zVar2;
                break;
            }
        }
        if (zVar == null) {
            int i11 = z.F;
            String a10 = z.a.a(this.f3101a, i10);
            Log.i("NavController", "Ignoring popBackStack to destination " + a10 + " as it was not found on the current back stack");
            return false;
        }
        r rVar = new r();
        k kVar2 = new k();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            r rVar2 = new r();
            f fVar = r0;
            k<j> kVar3 = kVar;
            j last = kVar.last();
            f fVar2 = new f(rVar2, rVar, this, z11, kVar2);
            this.f3123x = fVar;
            ((m0) it2.next()).i(last, z12);
            str = null;
            this.f3123x = null;
            if (!rVar2.f14953a) {
                break;
            }
            kVar = kVar3;
        }
        if (z12) {
            LinkedHashMap linkedHashMap = this.f3111k;
            if (!z10) {
                p.a aVar = new p.a(new yf.p(yf.k.o0(zVar, g.f3139a), new h(this)));
                while (aVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((z) aVar.next()).D);
                    k kVar4 = (k) (kVar2.isEmpty() ? str : kVar2.f8974b[kVar2.f8973a]);
                    linkedHashMap.put(valueOf, kVar4 != null ? kVar4.f3092a : str);
                }
            }
            if (!kVar2.isEmpty()) {
                k kVar5 = (k) kVar2.first();
                p.a aVar2 = new p.a(new yf.p(yf.k.o0(d(kVar5.f3093b), i.f3141a), new j(this)));
                while (true) {
                    boolean hasNext = aVar2.hasNext();
                    str2 = kVar5.f3092a;
                    if (!hasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((z) aVar2.next()).D), str2);
                }
                this.f3112l.put(str2, kVar2);
            }
        }
        x();
        return rVar.f14953a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        r6 = (java.util.Set) (r6 = r6.f3160f).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(b3.j r6, boolean r7, gf.k<b3.k> r8) {
        /*
            r5 = this;
            gf.k<b3.j> r0 = r5.f3107g
            java.lang.Object r1 = r0.last()
            b3.j r1 = (b3.j) r1
            boolean r2 = sf.j.a(r1, r6)
            if (r2 == 0) goto L_0x0091
            r0.removeLast()
            b3.z r6 = r1.f3084b
            java.lang.String r6 = r6.f3201a
            b3.o0 r0 = r5.f3120u
            b3.m0 r6 = r0.b(r6)
            java.util.LinkedHashMap r0 = r5.f3121v
            java.lang.Object r6 = r0.get(r6)
            b3.m$a r6 = (b3.m.a) r6
            r0 = 0
            r2 = 1
            if (r6 == 0) goto L_0x003b
            kotlinx.coroutines.flow.m0 r6 = r6.f3160f
            if (r6 == 0) goto L_0x003b
            java.lang.Object r6 = r6.getValue()
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L_0x003b
            boolean r6 = r6.contains(r1)
            if (r6 != r2) goto L_0x003b
            r6 = r2
            goto L_0x003c
        L_0x003b:
            r6 = r0
        L_0x003c:
            if (r6 != 0) goto L_0x0049
            java.util.LinkedHashMap r6 = r5.f3110j
            boolean r6 = r6.containsKey(r1)
            if (r6 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r6 = r0
            goto L_0x004a
        L_0x0049:
            r6 = r2
        L_0x004a:
            androidx.lifecycle.q r3 = r1.D
            androidx.lifecycle.j$b r3 = r3.f2304d
            androidx.lifecycle.j$b r4 = androidx.lifecycle.j.b.f2279c
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L_0x0057
            r0 = r2
        L_0x0057:
            if (r0 == 0) goto L_0x0074
            if (r7 == 0) goto L_0x0066
            r1.a(r4)
            b3.k r0 = new b3.k
            r0.<init>((b3.j) r1)
            r8.addFirst(r0)
        L_0x0066:
            if (r6 != 0) goto L_0x0071
            androidx.lifecycle.j$b r8 = androidx.lifecycle.j.b.f2277a
            r1.a(r8)
            r5.v(r1)
            goto L_0x0074
        L_0x0071:
            r1.a(r4)
        L_0x0074:
            if (r7 != 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            b3.t r6 = r5.f3114o
            if (r6 == 0) goto L_0x0090
            java.lang.String r7 = "backStackEntryId"
            java.lang.String r8 = r1.B
            sf.j.f(r8, r7)
            java.util.LinkedHashMap r6 = r6.f3173d
            java.lang.Object r6 = r6.remove(r8)
            androidx.lifecycle.o0 r6 = (androidx.lifecycle.o0) r6
            if (r6 == 0) goto L_0x0090
            r6.a()
        L_0x0090:
            return
        L_0x0091:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Attempted to pop "
            r7.<init>(r8)
            b3.z r6 = r6.f3084b
            r7.append(r6)
            java.lang.String r6 = ", which is not the top of the back stack ("
            r7.append(r6)
            b3.z r6 = r1.f3084b
            r7.append(r6)
            r6 = 41
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.q(b3.j, boolean, gf.k):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0032 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList s() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap r1 = r10.f3121v
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            androidx.lifecycle.j$b r3 = androidx.lifecycle.j.b.f2280d
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r1.next()
            b3.m$a r2 = (b3.m.a) r2
            kotlinx.coroutines.flow.m0 r2 = r2.f3160f
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0032:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x005b
            java.lang.Object r7 = r2.next()
            r8 = r7
            b3.j r8 = (b3.j) r8
            boolean r9 = r0.contains(r8)
            if (r9 != 0) goto L_0x0054
            androidx.lifecycle.j$b r8 = r8.H
            int r8 = r8.compareTo(r3)
            if (r8 < 0) goto L_0x004f
            r8 = r4
            goto L_0x0050
        L_0x004f:
            r8 = r5
        L_0x0050:
            if (r8 != 0) goto L_0x0054
            r8 = r4
            goto L_0x0055
        L_0x0054:
            r8 = r5
        L_0x0055:
            if (r8 == 0) goto L_0x0032
            r6.add(r7)
            goto L_0x0032
        L_0x005b:
            gf.o.p0(r6, r0)
            goto L_0x0011
        L_0x005f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            gf.k<b3.j> r2 = r10.f3107g
            java.util.Iterator r2 = r2.iterator()
        L_0x006a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r2.next()
            r7 = r6
            b3.j r7 = (b3.j) r7
            boolean r8 = r0.contains(r7)
            if (r8 != 0) goto L_0x008c
            androidx.lifecycle.j$b r7 = r7.H
            int r7 = r7.compareTo(r3)
            if (r7 < 0) goto L_0x0087
            r7 = r4
            goto L_0x0088
        L_0x0087:
            r7 = r5
        L_0x0088:
            if (r7 == 0) goto L_0x008c
            r7 = r4
            goto L_0x008d
        L_0x008c:
            r7 = r5
        L_0x008d:
            if (r7 == 0) goto L_0x006a
            r1.add(r6)
            goto L_0x006a
        L_0x0093:
            gf.o.p0(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x009f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r0.next()
            r3 = r2
            b3.j r3 = (b3.j) r3
            b3.z r3 = r3.f3084b
            boolean r3 = r3 instanceof b3.b0
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x009f
            r1.add(r2)
            goto L_0x009f
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.s():java.util.ArrayList");
    }

    public final boolean t(int i8, Bundle bundle, f0 f0Var) {
        z zVar;
        j jVar;
        z zVar2;
        LinkedHashMap linkedHashMap = this.f3111k;
        if (!linkedHashMap.containsKey(Integer.valueOf(i8))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i8));
        Iterable values = linkedHashMap.values();
        r rVar = new r(str);
        sf.j.f(values, "<this>");
        o.q0(values, rVar);
        LinkedHashMap linkedHashMap2 = this.f3112l;
        y.b(linkedHashMap2);
        k kVar = (k) linkedHashMap2.remove(str);
        ArrayList arrayList = new ArrayList();
        j g10 = this.f3107g.g();
        if (g10 == null || (zVar = g10.f3084b) == null) {
            zVar = i();
        }
        if (kVar != null) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                k kVar2 = (k) it.next();
                z e10 = e(zVar, kVar2.f3093b);
                Context context = this.f3101a;
                if (e10 != null) {
                    arrayList.add(kVar2.a(context, e10, j(), this.f3114o));
                    zVar = e10;
                } else {
                    int i10 = z.F;
                    String a10 = z.a.a(context, kVar2.f3093b);
                    throw new IllegalStateException(("Restore State failed: destination " + a10 + " cannot be found from the current destination " + zVar).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((j) next).f3084b instanceof b0)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it3.hasNext()) {
                break;
            }
            j jVar2 = (j) it3.next();
            List list = (List) q.C0(arrayList2);
            if (!(list == null || (jVar = (j) q.B0(list)) == null || (zVar2 = jVar.f3084b) == null)) {
                str2 = zVar2.f3201a;
            }
            if (sf.j.a(str2, jVar2.f3084b.f3201a)) {
                list.add(jVar2);
            } else {
                arrayList2.add(cb.d.Q(jVar2));
            }
        }
        r rVar2 = new r();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            m0 b10 = this.f3120u.b(((j) q.u0(list2)).f3084b.f3201a);
            this.f3122w = new s(rVar2, arrayList, new t(), this, bundle);
            b10.d(list2, f0Var);
            this.f3122w = null;
        }
        return rVar2.f14953a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bf, code lost:
        if ((r10.length == 0) != false) goto L_0x01c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(b3.b0 r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            b3.b0 r2 = r0.f3103c
            boolean r2 = sf.j.a(r2, r1)
            gf.k<b3.j> r3 = r0.f3107g
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x03a9
            b3.b0 r2 = r0.f3103c
            java.util.LinkedHashMap r6 = r0.f3121v
            r7 = 0
            if (r2 == 0) goto L_0x007c
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.LinkedHashMap r9 = r0.f3111k
            java.util.Set r9 = r9.keySet()
            r8.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x0026:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0077
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r10 = "id"
            sf.j.e(r9, r10)
            int r9 = r9.intValue()
            java.util.Collection r10 = r6.values()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0045:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0054
            java.lang.Object r11 = r10.next()
            b3.m$a r11 = (b3.m.a) r11
            r11.f3158d = r5
            goto L_0x0045
        L_0x0054:
            boolean r10 = r0.t(r9, r7, r7)
            java.util.Collection r11 = r6.values()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0062:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0071
            java.lang.Object r12 = r11.next()
            b3.m$a r12 = (b3.m.a) r12
            r12.f3158d = r4
            goto L_0x0062
        L_0x0071:
            if (r10 == 0) goto L_0x0026
            r0.p(r9, r5, r4)
            goto L_0x0026
        L_0x0077:
            int r2 = r2.D
            r0.p(r2, r5, r4)
        L_0x007c:
            r0.f3103c = r1
            android.os.Bundle r1 = r0.f3104d
            b3.o0 r2 = r0.f3120u
            if (r1 == 0) goto L_0x00af
            java.lang.String r8 = "android-support-nav:controller:navigatorState:names"
            java.util.ArrayList r8 = r1.getStringArrayList(r8)
            if (r8 == 0) goto L_0x00af
            java.util.Iterator r8 = r8.iterator()
        L_0x0090:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "name"
            sf.j.e(r9, r10)
            b3.m0 r10 = r2.b(r9)
            android.os.Bundle r9 = r1.getBundle(r9)
            if (r9 == 0) goto L_0x0090
            r10.g(r9)
            goto L_0x0090
        L_0x00af:
            android.os.Parcelable[] r1 = r0.f3105e
            java.lang.String r8 = " cannot be found from the current destination "
            android.content.Context r9 = r0.f3101a
            if (r1 == 0) goto L_0x0123
            int r10 = r1.length
            r11 = r4
        L_0x00b9:
            if (r11 >= r10) goto L_0x011e
            r12 = r1[r11]
            b3.k r12 = (b3.k) r12
            int r13 = r12.f3093b
            b3.z r13 = r0.d(r13)
            if (r13 == 0) goto L_0x00ff
            androidx.lifecycle.j$b r14 = r23.j()
            b3.t r15 = r0.f3114o
            b3.j r12 = r12.a(r9, r13, r14, r15)
            java.lang.String r13 = r13.f3201a
            b3.m0 r13 = r2.b(r13)
            java.lang.Object r14 = r6.get(r13)
            if (r14 != 0) goto L_0x00e5
            b3.m$a r14 = new b3.m$a
            r14.<init>(r0, r13)
            r6.put(r13, r14)
        L_0x00e5:
            b3.m$a r14 = (b3.m.a) r14
            r3.addLast(r12)
            r14.f(r12)
            b3.z r13 = r12.f3084b
            b3.b0 r13 = r13.f3202b
            if (r13 == 0) goto L_0x00fc
            int r13 = r13.D
            b3.j r13 = r0.f(r13)
            r0.k(r12, r13)
        L_0x00fc:
            int r11 = r11 + 1
            goto L_0x00b9
        L_0x00ff:
            int r1 = b3.z.F
            int r1 = r12.f3093b
            java.lang.String r1 = b3.z.a.a(r9, r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Restoring the Navigation back stack failed: destination "
            java.lang.StringBuilder r1 = androidx.activity.result.d.c(r3, r1, r8)
            b3.z r3 = r23.g()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x011e:
            r23.x()
            r0.f3105e = r7
        L_0x0123:
            java.util.LinkedHashMap r1 = r2.f3152a
            java.util.Map r1 = gf.y.W(r1)
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0138:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x014d
            java.lang.Object r10 = r1.next()
            r11 = r10
            b3.m0 r11 = (b3.m0) r11
            boolean r11 = r11.f3144b
            if (r11 != 0) goto L_0x0138
            r2.add(r10)
            goto L_0x0138
        L_0x014d:
            java.util.Iterator r1 = r2.iterator()
        L_0x0151:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0171
            java.lang.Object r2 = r1.next()
            b3.m0 r2 = (b3.m0) r2
            java.lang.Object r10 = r6.get(r2)
            if (r10 != 0) goto L_0x016b
            b3.m$a r10 = new b3.m$a
            r10.<init>(r0, r2)
            r6.put(r2, r10)
        L_0x016b:
            b3.m$a r10 = (b3.m.a) r10
            r2.e(r10)
            goto L_0x0151
        L_0x0171:
            b3.b0 r1 = r0.f3103c
            if (r1 == 0) goto L_0x03a4
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x03a4
            boolean r1 = r0.f3106f
            if (r1 != 0) goto L_0x0395
            android.app.Activity r1 = r0.f3102b
            if (r1 == 0) goto L_0x0395
            android.content.Intent r2 = r1.getIntent()
            if (r2 != 0) goto L_0x018b
            goto L_0x0391
        L_0x018b:
            android.os.Bundle r6 = r2.getExtras()
            if (r6 == 0) goto L_0x0198
            java.lang.String r10 = "android-support-nav:controller:deepLinkIds"
            int[] r10 = r6.getIntArray(r10)
            goto L_0x0199
        L_0x0198:
            r10 = r7
        L_0x0199:
            if (r6 == 0) goto L_0x01a2
            java.lang.String r11 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r11 = r6.getParcelableArrayList(r11)
            goto L_0x01a3
        L_0x01a2:
            r11 = r7
        L_0x01a3:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            if (r6 == 0) goto L_0x01b1
            java.lang.String r13 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r6 = r6.getBundle(r13)
            goto L_0x01b2
        L_0x01b1:
            r6 = r7
        L_0x01b2:
            if (r6 == 0) goto L_0x01b7
            r12.putAll(r6)
        L_0x01b7:
            if (r10 == 0) goto L_0x01c1
            int r6 = r10.length
            if (r6 != 0) goto L_0x01be
            r6 = r5
            goto L_0x01bf
        L_0x01be:
            r6 = r4
        L_0x01bf:
            if (r6 == 0) goto L_0x01e4
        L_0x01c1:
            b3.b0 r6 = r0.f3103c
            sf.j.c(r6)
            b3.w r13 = new b3.w
            r13.<init>((android.content.Intent) r2)
            b3.z$b r6 = r6.g(r13)
            if (r6 == 0) goto L_0x01e4
            b3.z r10 = r6.f3206a
            int[] r11 = r10.c(r7)
            android.os.Bundle r6 = r6.f3207b
            android.os.Bundle r6 = r10.b(r6)
            if (r6 == 0) goto L_0x01e2
            r12.putAll(r6)
        L_0x01e2:
            r10 = r11
            goto L_0x01e5
        L_0x01e4:
            r7 = r11
        L_0x01e5:
            if (r10 == 0) goto L_0x0391
            int r6 = r10.length
            if (r6 != 0) goto L_0x01ec
            r6 = r5
            goto L_0x01ed
        L_0x01ec:
            r6 = r4
        L_0x01ed:
            if (r6 == 0) goto L_0x01f1
            goto L_0x0391
        L_0x01f1:
            b3.b0 r6 = r0.f3103c
            int r11 = r10.length
            r13 = r4
        L_0x01f5:
            if (r13 >= r11) goto L_0x023e
            r14 = r10[r13]
            if (r13 != 0) goto L_0x0209
            b3.b0 r15 = r0.f3103c
            sf.j.c(r15)
            int r15 = r15.D
            if (r15 != r14) goto L_0x0207
            b3.b0 r15 = r0.f3103c
            goto L_0x0210
        L_0x0207:
            r15 = 0
            goto L_0x0210
        L_0x0209:
            sf.j.c(r6)
            b3.z r15 = r6.j(r14, r5)
        L_0x0210:
            if (r15 != 0) goto L_0x0219
            int r6 = b3.z.F
            java.lang.String r6 = b3.z.a.a(r9, r14)
            goto L_0x023f
        L_0x0219:
            int r14 = r10.length
            int r14 = r14 - r5
            if (r13 == r14) goto L_0x023b
            boolean r14 = r15 instanceof b3.b0
            if (r14 == 0) goto L_0x023b
            b3.b0 r15 = (b3.b0) r15
        L_0x0223:
            sf.j.c(r15)
            int r6 = r15.H
            b3.z r6 = r15.j(r6, r5)
            boolean r6 = r6 instanceof b3.b0
            if (r6 == 0) goto L_0x023a
            int r6 = r15.H
            b3.z r6 = r15.j(r6, r5)
            r15 = r6
            b3.b0 r15 = (b3.b0) r15
            goto L_0x0223
        L_0x023a:
            r6 = r15
        L_0x023b:
            int r13 = r13 + 1
            goto L_0x01f5
        L_0x023e:
            r6 = 0
        L_0x023f:
            if (r6 == 0) goto L_0x025e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find destination "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r3 = " in the navigation graph, ignoring the deep link from "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NavController"
            android.util.Log.i(r2, r1)
            goto L_0x0391
        L_0x025e:
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            r12.putParcelable(r6, r2)
            int r6 = r10.length
            android.os.Bundle[] r11 = new android.os.Bundle[r6]
            r13 = r4
        L_0x0267:
            if (r13 >= r6) goto L_0x0283
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            r14.putAll(r12)
            if (r7 == 0) goto L_0x027e
            java.lang.Object r15 = r7.get(r13)
            android.os.Bundle r15 = (android.os.Bundle) r15
            if (r15 == 0) goto L_0x027e
            r14.putAll(r15)
        L_0x027e:
            r11[r13] = r14
            int r13 = r13 + 1
            goto L_0x0267
        L_0x0283:
            int r6 = r2.getFlags()
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = r7 & r6
            if (r7 == 0) goto L_0x02bf
            r12 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r12
            if (r6 != 0) goto L_0x02bf
            r2.addFlags(r12)
            s1.c0 r3 = new s1.c0
            r3.<init>(r9)
            android.content.ComponentName r6 = r2.getComponent()
            if (r6 != 0) goto L_0x02aa
            android.content.Context r6 = r3.f14477b
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            android.content.ComponentName r6 = r2.resolveActivity(r6)
        L_0x02aa:
            if (r6 == 0) goto L_0x02af
            r3.a(r6)
        L_0x02af:
            java.util.ArrayList<android.content.Intent> r6 = r3.f14476a
            r6.add(r2)
            r3.b()
            r1.finish()
            r1.overridePendingTransition(r4, r4)
            goto L_0x038f
        L_0x02bf:
            java.lang.String r1 = "Deep Linking failed: destination "
            if (r7 == 0) goto L_0x030c
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x02d3
            b3.b0 r2 = r0.f3103c
            sf.j.c(r2)
            int r2 = r2.D
            r0.p(r2, r5, r4)
        L_0x02d3:
            r2 = r4
        L_0x02d4:
            int r3 = r10.length
            if (r2 >= r3) goto L_0x038f
            r3 = r10[r2]
            int r6 = r2 + 1
            r2 = r11[r2]
            b3.z r7 = r0.d(r3)
            if (r7 == 0) goto L_0x02f1
            b3.p r3 = new b3.p
            r3.<init>(r7, r0)
            b3.f0 r3 = cb.d.T(r3)
            r0.m(r7, r2, r3)
            r2 = r6
            goto L_0x02d4
        L_0x02f1:
            int r2 = b3.z.F
            java.lang.String r2 = b3.z.a.a(r9, r3)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = androidx.activity.result.d.c(r1, r2, r8)
            b3.z r2 = r23.g()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
        L_0x030c:
            b3.b0 r2 = r0.f3103c
            int r3 = r10.length
            r6 = r4
        L_0x0310:
            if (r6 >= r3) goto L_0x038d
            r7 = r10[r6]
            r8 = r11[r6]
            if (r6 != 0) goto L_0x031b
            b3.b0 r12 = r0.f3103c
            goto L_0x0322
        L_0x031b:
            sf.j.c(r2)
            b3.z r12 = r2.j(r7, r5)
        L_0x0322:
            if (r12 == 0) goto L_0x036d
            int r7 = r10.length
            int r7 = r7 - r5
            if (r6 == r7) goto L_0x0347
            boolean r7 = r12 instanceof b3.b0
            if (r7 == 0) goto L_0x036a
            b3.b0 r12 = (b3.b0) r12
        L_0x032e:
            sf.j.c(r12)
            int r2 = r12.H
            b3.z r2 = r12.j(r2, r5)
            boolean r2 = r2 instanceof b3.b0
            if (r2 == 0) goto L_0x0345
            int r2 = r12.H
            b3.z r2 = r12.j(r2, r5)
            r12 = r2
            b3.b0 r12 = (b3.b0) r12
            goto L_0x032e
        L_0x0345:
            r2 = r12
            goto L_0x036a
        L_0x0347:
            r15 = 0
            r14 = 0
            r22 = -1
            b3.b0 r7 = r0.f3103c
            sf.j.c(r7)
            int r7 = r7.D
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            b3.f0 r13 = new b3.f0
            r24 = r13
            r16 = r7
            r21 = r22
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r7 = r24
            r0.m(r12, r8, r7)
        L_0x036a:
            int r6 = r6 + 1
            goto L_0x0310
        L_0x036d:
            int r3 = b3.z.F
            java.lang.String r3 = b3.z.a.a(r9, r7)
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r3)
            java.lang.String r1 = " cannot be found in graph "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            throw r4
        L_0x038d:
            r0.f3106f = r5
        L_0x038f:
            r1 = r5
            goto L_0x0392
        L_0x0391:
            r1 = r4
        L_0x0392:
            if (r1 == 0) goto L_0x0395
            r4 = r5
        L_0x0395:
            if (r4 != 0) goto L_0x041d
            b3.b0 r1 = r0.f3103c
            sf.j.c(r1)
            r2 = 0
            r3 = r25
            r0.m(r1, r3, r2)
            goto L_0x041d
        L_0x03a4:
            r23.c()
            goto L_0x041d
        L_0x03a9:
            o.g<b3.z> r1 = r1.G
            int r2 = r1.j()
            r6 = r4
        L_0x03b0:
            if (r6 >= r2) goto L_0x041d
            java.lang.Object r7 = r1.k(r6)
            b3.z r7 = (b3.z) r7
            b3.b0 r8 = r0.f3103c
            sf.j.c(r8)
            o.g<b3.z> r8 = r8.G
            boolean r9 = r8.f12034a
            if (r9 == 0) goto L_0x03c6
            r8.g()
        L_0x03c6:
            int[] r9 = r8.f12035b
            int r10 = r8.f12037d
            int r9 = cb.b.n(r10, r6, r9)
            if (r9 < 0) goto L_0x03d6
            java.lang.Object[] r8 = r8.f12036c
            r10 = r8[r9]
            r8[r9] = r7
        L_0x03d6:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r3.iterator()
        L_0x03df:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x03ff
            java.lang.Object r10 = r9.next()
            r11 = r10
            b3.j r11 = (b3.j) r11
            if (r7 == 0) goto L_0x03f8
            b3.z r11 = r11.f3084b
            int r11 = r11.D
            int r12 = r7.D
            if (r11 != r12) goto L_0x03f8
            r11 = r5
            goto L_0x03f9
        L_0x03f8:
            r11 = r4
        L_0x03f9:
            if (r11 == 0) goto L_0x03df
            r8.add(r10)
            goto L_0x03df
        L_0x03ff:
            java.util.Iterator r8 = r8.iterator()
        L_0x0403:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x041a
            java.lang.Object r9 = r8.next()
            b3.j r9 = (b3.j) r9
            java.lang.String r10 = "newDestination"
            sf.j.e(r7, r10)
            r9.getClass()
            r9.f3084b = r7
            goto L_0x0403
        L_0x041a:
            int r6 = r6 + 1
            goto L_0x03b0
        L_0x041d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.u(b3.b0, android.os.Bundle):void");
    }

    public final void v(j jVar) {
        t tVar;
        sf.j.f(jVar, "child");
        j jVar2 = (j) this.f3109i.remove(jVar);
        if (jVar2 != null) {
            LinkedHashMap linkedHashMap = this.f3110j;
            AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(jVar2);
            Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                a aVar = (a) this.f3121v.get(this.f3120u.b(jVar2.f3084b.f3201a));
                if (aVar != null) {
                    m mVar = aVar.f3127h;
                    boolean a10 = sf.j.a(mVar.f3124y.get(jVar2), Boolean.TRUE);
                    y0 y0Var = aVar.f3157c;
                    Set set = (Set) y0Var.getValue();
                    sf.j.f(set, "<this>");
                    LinkedHashSet linkedHashSet = new LinkedHashSet(f1.B(set.size()));
                    Iterator it = set.iterator();
                    boolean z10 = false;
                    boolean z11 = false;
                    while (true) {
                        boolean z12 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (!z11 && sf.j.a(next, jVar2)) {
                            z11 = true;
                            z12 = false;
                        }
                        if (z12) {
                            linkedHashSet.add(next);
                        }
                    }
                    y0Var.setValue(linkedHashSet);
                    mVar.f3124y.remove(jVar2);
                    k<j> kVar = mVar.f3107g;
                    boolean contains = kVar.contains(jVar2);
                    y0 y0Var2 = mVar.f3108h;
                    if (!contains) {
                        mVar.v(jVar2);
                        if (jVar2.D.f2304d.compareTo(j.b.f2279c) >= 0) {
                            jVar2.a(j.b.f2277a);
                        }
                        boolean isEmpty = kVar.isEmpty();
                        String str = jVar2.B;
                        if (!isEmpty) {
                            Iterator<j> it2 = kVar.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (sf.j.a(it2.next().B, str)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        z10 = true;
                        if (z10 && !a10 && (tVar = mVar.f3114o) != null) {
                            sf.j.f(str, "backStackEntryId");
                            o0 o0Var = (o0) tVar.f3173d.remove(str);
                            if (o0Var != null) {
                                o0Var.a();
                            }
                        }
                        mVar.w();
                        y0Var2.setValue(mVar.s());
                    } else if (!aVar.f3158d) {
                        mVar.w();
                        y0Var2.setValue(mVar.s());
                    }
                }
                linkedHashMap.remove(jVar2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r7 = (java.util.Set) (r7 = r7.f3160f).getValue();
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w() {
        /*
            r13 = this;
            gf.k<b3.j> r0 = r13.f3107g
            java.util.ArrayList r0 = gf.q.P0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r1 = gf.q.B0(r0)
            b3.j r1 = (b3.j) r1
            b3.z r1 = r1.f3084b
            boolean r2 = r1 instanceof b3.d
            r3 = 0
            if (r2 == 0) goto L_0x0039
            java.util.List r2 = gf.q.I0(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0022:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r2.next()
            b3.j r4 = (b3.j) r4
            b3.z r4 = r4.f3084b
            boolean r5 = r4 instanceof b3.b0
            if (r5 != 0) goto L_0x0022
            boolean r5 = r4 instanceof b3.d
            if (r5 != 0) goto L_0x0022
            goto L_0x003a
        L_0x0039:
            r4 = r3
        L_0x003a:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.List r5 = gf.q.I0(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0047:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r5.next()
            b3.j r6 = (b3.j) r6
            androidx.lifecycle.j$b r7 = r6.H
            b3.z r8 = r6.f3084b
            androidx.lifecycle.j$b r9 = androidx.lifecycle.j.b.f2281e
            androidx.lifecycle.j$b r10 = androidx.lifecycle.j.b.f2280d
            if (r1 == 0) goto L_0x00b4
            int r11 = r8.D
            int r12 = r1.D
            if (r11 != r12) goto L_0x00b4
            if (r7 == r9) goto L_0x00b1
            java.lang.String r7 = r8.f3201a
            b3.o0 r8 = r13.f3120u
            b3.m0 r7 = r8.b(r7)
            java.util.LinkedHashMap r8 = r13.f3121v
            java.lang.Object r7 = r8.get(r7)
            b3.m$a r7 = (b3.m.a) r7
            if (r7 == 0) goto L_0x008c
            kotlinx.coroutines.flow.m0 r7 = r7.f3160f
            if (r7 == 0) goto L_0x008c
            java.lang.Object r7 = r7.getValue()
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x008c
            boolean r7 = r7.contains(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x008d
        L_0x008c:
            r7 = r3
        L_0x008d:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = sf.j.a(r7, r8)
            if (r7 != 0) goto L_0x00ae
            java.util.LinkedHashMap r7 = r13.f3110j
            java.lang.Object r7 = r7.get(r6)
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            if (r7 == 0) goto L_0x00a7
            int r7 = r7.get()
            if (r7 != 0) goto L_0x00a7
            r7 = 1
            goto L_0x00a8
        L_0x00a7:
            r7 = 0
        L_0x00a8:
            if (r7 != 0) goto L_0x00ae
            r2.put(r6, r9)
            goto L_0x00b1
        L_0x00ae:
            r2.put(r6, r10)
        L_0x00b1:
            b3.b0 r1 = r1.f3202b
            goto L_0x0047
        L_0x00b4:
            if (r4 == 0) goto L_0x00cb
            int r8 = r8.D
            int r11 = r4.D
            if (r8 != r11) goto L_0x00cb
            if (r7 != r9) goto L_0x00c2
            r6.a(r10)
            goto L_0x00c7
        L_0x00c2:
            if (r7 == r10) goto L_0x00c7
            r2.put(r6, r10)
        L_0x00c7:
            b3.b0 r4 = r4.f3202b
            goto L_0x0047
        L_0x00cb:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.j.b.f2279c
            r6.a(r7)
            goto L_0x0047
        L_0x00d2:
            java.util.Iterator r0 = r0.iterator()
        L_0x00d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f2
            java.lang.Object r1 = r0.next()
            b3.j r1 = (b3.j) r1
            java.lang.Object r3 = r2.get(r1)
            androidx.lifecycle.j$b r3 = (androidx.lifecycle.j.b) r3
            if (r3 == 0) goto L_0x00ee
            r1.a(r3)
            goto L_0x00d6
        L_0x00ee:
            r1.c()
            goto L_0x00d6
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.w():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (h() > 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r2 = this;
            boolean r0 = r2.f3119t
            if (r0 == 0) goto L_0x000c
            int r0 = r2.h()
            r1 = 1
            if (r0 <= r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            b3.m$e r0 = r2.f3118s
            r0.f601a = r1
            rf.a<ff.m> r0 = r0.f603c
            if (r0 == 0) goto L_0x0018
            r0.d()
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.m.x():void");
    }
}
