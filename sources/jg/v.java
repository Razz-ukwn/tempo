package jg;

import androidx.fragment.app.z;
import androidx.lifecycle.u;
import cb.c;
import j0.p;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import jg.d;
import jg.n;
import kg.b;
import r3.s;
import sf.j;

public final class v implements Cloneable, d.a {
    public static final List<w> V = b.l(w.f10217e, w.f10215c);
    public static final List<i> W = b.l(i.f10109e, i.f10110f);
    public final boolean B;
    public final c C;
    public final boolean D;
    public final boolean E;
    public final cb.d F;
    public final ag.d G;
    public final ProxySelector H;
    public final c I;
    public final SocketFactory J;
    public final SSLSocketFactory K;
    public final X509TrustManager L;
    public final List<i> M;
    public final List<w> N;
    public final ug.c O;
    public final f P;
    public final z Q;
    public final int R;
    public final int S;
    public final int T;
    public final u U;

    /* renamed from: a  reason: collision with root package name */
    public final l f10190a;

    /* renamed from: b  reason: collision with root package name */
    public final s f10191b;

    /* renamed from: c  reason: collision with root package name */
    public final List<s> f10192c;

    /* renamed from: d  reason: collision with root package name */
    public final List<s> f10193d;

    /* renamed from: e  reason: collision with root package name */
    public final p f10194e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final l f10195a = new l();

        /* renamed from: b  reason: collision with root package name */
        public final s f10196b = new s(14, 0);

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f10197c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f10198d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final p f10199e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f10200f;

        /* renamed from: g  reason: collision with root package name */
        public final c f10201g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f10202h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f10203i;

        /* renamed from: j  reason: collision with root package name */
        public final cb.d f10204j;

        /* renamed from: k  reason: collision with root package name */
        public final ag.d f10205k;

        /* renamed from: l  reason: collision with root package name */
        public final c f10206l;
        public final SocketFactory m;

        /* renamed from: n  reason: collision with root package name */
        public final List<i> f10207n;

        /* renamed from: o  reason: collision with root package name */
        public final List<? extends w> f10208o;

        /* renamed from: p  reason: collision with root package name */
        public final ug.c f10209p;

        /* renamed from: q  reason: collision with root package name */
        public final f f10210q;

        /* renamed from: r  reason: collision with root package name */
        public int f10211r;

        /* renamed from: s  reason: collision with root package name */
        public int f10212s;

        /* renamed from: t  reason: collision with root package name */
        public final int f10213t;

        public a() {
            n.a aVar = n.f10137a;
            byte[] bArr = b.f10474a;
            j.f(aVar, "<this>");
            this.f10199e = new p(aVar, 11);
            this.f10200f = true;
            c cVar = b.f10030t;
            this.f10201g = cVar;
            this.f10202h = true;
            this.f10203i = true;
            this.f10204j = k.f10131u;
            this.f10205k = m.f10136v;
            this.f10206l = cVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            j.e(socketFactory, "getDefault()");
            this.m = socketFactory;
            this.f10207n = v.W;
            this.f10208o = v.V;
            this.f10209p = ug.c.f16035a;
            this.f10210q = f.f10076c;
            this.f10211r = 10000;
            this.f10212s = 10000;
            this.f10213t = 10000;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(jg.v.a r6) {
        /*
            r5 = this;
            r5.<init>()
            jg.l r0 = r6.f10195a
            r5.f10190a = r0
            r3.s r0 = r6.f10196b
            r5.f10191b = r0
            java.util.ArrayList r0 = r6.f10197c
            java.util.List r0 = kg.b.x(r0)
            r5.f10192c = r0
            java.util.ArrayList r0 = r6.f10198d
            java.util.List r0 = kg.b.x(r0)
            r5.f10193d = r0
            j0.p r0 = r6.f10199e
            r5.f10194e = r0
            boolean r0 = r6.f10200f
            r5.B = r0
            cb.c r0 = r6.f10201g
            r5.C = r0
            boolean r0 = r6.f10202h
            r5.D = r0
            boolean r0 = r6.f10203i
            r5.E = r0
            cb.d r0 = r6.f10204j
            r5.F = r0
            ag.d r0 = r6.f10205k
            r5.G = r0
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            if (r0 != 0) goto L_0x003f
            tg.a r0 = tg.a.f15627a
        L_0x003f:
            r5.H = r0
            cb.c r0 = r6.f10206l
            r5.I = r0
            javax.net.SocketFactory r0 = r6.m
            r5.J = r0
            java.util.List<jg.i> r0 = r6.f10207n
            r5.M = r0
            java.util.List<? extends jg.w> r1 = r6.f10208o
            r5.N = r1
            ug.c r1 = r6.f10209p
            r5.O = r1
            int r1 = r6.f10211r
            r5.R = r1
            int r1 = r6.f10212s
            r5.S = r1
            int r1 = r6.f10213t
            r5.T = r1
            androidx.lifecycle.u r1 = new androidx.lifecycle.u
            r2 = 16
            r1.<init>((int) r2)
            r5.U = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x007c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x007c
            goto L_0x0092
        L_0x007c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0080:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r0.next()
            jg.i r1 = (jg.i) r1
            boolean r1 = r1.f10111a
            if (r1 == 0) goto L_0x0080
            r0 = r2
            goto L_0x0093
        L_0x0092:
            r0 = r3
        L_0x0093:
            r1 = 0
            if (r0 == 0) goto L_0x00a1
            r5.K = r1
            r5.Q = r1
            r5.L = r1
            jg.f r6 = jg.f.f10076c
            r5.P = r6
            goto L_0x00d6
        L_0x00a1:
            rg.h r0 = rg.h.f14273a
            rg.h r0 = rg.h.f14273a
            javax.net.ssl.X509TrustManager r0 = r0.n()
            r5.L = r0
            rg.h r4 = rg.h.f14273a
            sf.j.c(r0)
            javax.net.ssl.SSLSocketFactory r4 = r4.m(r0)
            r5.K = r4
            rg.h r4 = rg.h.f14273a
            androidx.fragment.app.z r0 = r4.b(r0)
            r5.Q = r0
            jg.f r6 = r6.f10210q
            sf.j.c(r0)
            androidx.fragment.app.z r4 = r6.f10078b
            boolean r4 = sf.j.a(r4, r0)
            if (r4 == 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            jg.f r4 = new jg.f
            java.util.Set<jg.f$a> r6 = r6.f10077a
            r4.<init>(r6, r0)
            r6 = r4
        L_0x00d4:
            r5.P = r6
        L_0x00d6:
            java.util.List<jg.s> r6 = r5.f10192c
            boolean r0 = r6.contains(r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x019c
            java.util.List<jg.s> r6 = r5.f10193d
            boolean r0 = r6.contains(r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x018c
            java.util.List<jg.i> r6 = r5.M
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00fa
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00fa
            goto L_0x0110
        L_0x00fa:
            java.util.Iterator r6 = r6.iterator()
        L_0x00fe:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r0 = r6.next()
            jg.i r0 = (jg.i) r0
            boolean r0 = r0.f10111a
            if (r0 == 0) goto L_0x00fe
            r6 = r2
            goto L_0x0111
        L_0x0110:
            r6 = r3
        L_0x0111:
            javax.net.ssl.X509TrustManager r0 = r5.L
            androidx.fragment.app.z r1 = r5.Q
            javax.net.ssl.SSLSocketFactory r4 = r5.K
            if (r6 == 0) goto L_0x0161
            if (r4 != 0) goto L_0x011d
            r6 = r3
            goto L_0x011e
        L_0x011d:
            r6 = r2
        L_0x011e:
            java.lang.String r4 = "Check failed."
            if (r6 == 0) goto L_0x0157
            if (r1 != 0) goto L_0x0126
            r6 = r3
            goto L_0x0127
        L_0x0126:
            r6 = r2
        L_0x0127:
            if (r6 == 0) goto L_0x014d
            if (r0 != 0) goto L_0x012c
            r2 = r3
        L_0x012c:
            if (r2 == 0) goto L_0x0143
            jg.f r6 = r5.P
            jg.f r0 = jg.f.f10076c
            boolean r6 = sf.j.a(r6, r0)
            if (r6 == 0) goto L_0x0139
            goto L_0x0167
        L_0x0139:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.toString()
            r6.<init>(r0)
            throw r6
        L_0x0143:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.toString()
            r6.<init>(r0)
            throw r6
        L_0x014d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.toString()
            r6.<init>(r0)
            throw r6
        L_0x0157:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r4.toString()
            r6.<init>(r0)
            throw r6
        L_0x0161:
            if (r4 == 0) goto L_0x0180
            if (r1 == 0) goto L_0x0174
            if (r0 == 0) goto L_0x0168
        L_0x0167:
            return
        L_0x0168:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0174:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0180:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x018c:
            java.lang.String r0 = "Null network interceptor: "
            java.lang.String r6 = sf.j.k(r6, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x019c:
            java.lang.String r0 = "Null interceptor: "
            java.lang.String r6 = sf.j.k(r6, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.v.<init>(jg.v$a):void");
    }

    public final ng.d a(x xVar) {
        j.f(xVar, "request");
        return new ng.d(this, xVar, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public v() {
        this(new a());
    }
}
