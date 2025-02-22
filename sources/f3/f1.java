package f3;

import ag.g0;
import ag.n1;
import f3.a1;
import f3.f2;
import f3.l1;
import f3.m0;
import f3.q1;
import f3.v2;
import f3.y0;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.f;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.sync.d;
import lf.e;
import sf.j;

public final class f1<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public final Key f8195a;

    /* renamed from: b  reason: collision with root package name */
    public final f2<Key, Value> f8196b;

    /* renamed from: c  reason: collision with root package name */
    public final w1 f8197c;

    /* renamed from: d  reason: collision with root package name */
    public final f<m> f8198d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8199e;

    /* renamed from: f  reason: collision with root package name */
    public final j2<Key, Value> f8200f;

    /* renamed from: g  reason: collision with root package name */
    public final g2<Key, Value> f8201g;

    /* renamed from: h  reason: collision with root package name */
    public final rf.a<m> f8202h;

    /* renamed from: i  reason: collision with root package name */
    public final h0 f8203i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f8204j;

    /* renamed from: k  reason: collision with root package name */
    public final cg.a f8205k;

    /* renamed from: l  reason: collision with root package name */
    public final q1.a<Key, Value> f8206l;
    public final ag.q1 m;

    /* renamed from: n  reason: collision with root package name */
    public final o f8207n;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8208a;

        static {
            int[] iArr = new int[o0.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f8208a = iArr;
        }
    }

    @e(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {608}, m = "currentPagingState")
    public static final class b extends lf.c {
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public f1 f8209a;

        /* renamed from: b  reason: collision with root package name */
        public q1.a f8210b;

        /* renamed from: c  reason: collision with root package name */
        public d f8211c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f8212d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f1<Key, Value> f8213e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f1<Key, Value> f1Var, jf.d<? super b> dVar) {
            super(dVar);
            this.f8213e = f1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8212d = obj;
            this.B |= Integer.MIN_VALUE;
            return this.f8213e.e(this);
        }
    }

    @e(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {608, 280, 283, 619, 630, 317, 641, 652, 341}, m = "doInitialLoad")
    public static final class c extends lf.c {
        public final /* synthetic */ f1<Key, Value> B;
        public int C;

        /* renamed from: a  reason: collision with root package name */
        public Object f8214a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8215b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8216c;

        /* renamed from: d  reason: collision with root package name */
        public d f8217d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f8218e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f1<Key, Value> f1Var, jf.d<? super c> dVar) {
            super(dVar);
            this.B = f1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8218e = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.f(this);
        }
    }

    public f1(Object obj, f2 f2Var, w1 w1Var, f fVar, boolean z10, i2 i2Var, g2 g2Var, a1.b.a aVar) {
        j.f(f2Var, "pagingSource");
        j.f(w1Var, "config");
        j.f(fVar, "retryFlow");
        this.f8195a = obj;
        this.f8196b = f2Var;
        this.f8197c = w1Var;
        this.f8198d = fVar;
        this.f8199e = z10;
        this.f8200f = i2Var;
        this.f8201g = g2Var;
        this.f8202h = aVar;
        if (w1Var.f8534e == Integer.MIN_VALUE || f2Var.a()) {
            this.f8203i = new h0();
            this.f8204j = new AtomicBoolean(false);
            this.f8205k = cb.d.d(-2, (cg.e) null, 6);
            this.f8206l = new q1.a<>(w1Var);
            ag.q1 q1Var = new ag.q1((n1) null);
            this.m = q1Var;
            this.f8207n = new o(new m1(this, (jf.d<? super m1>) null), k2.a(new q(q1Var, new l1(this, (jf.d<? super l1>) null), (jf.d<? super q>) null)));
            return;
        }
        throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
    }

    public static final Object a(f1 f1Var, o oVar, o0 o0Var, jf.d dVar) {
        f1Var.getClass();
        f a10 = f0.a(oVar, new h1(o0Var, f1Var, (jf.d) null));
        i1 i1Var = new i1(o0Var, (jf.d<? super i1>) null);
        j.f(a10, "<this>");
        Object a11 = cb.d.o(new n0(new d0(a10, i1Var, (jf.d<? super d0>) null)), -1).a(new g1(f1Var, o0Var), dVar);
        return a11 == kf.a.f10464a ? a11 : m.f8717a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: f3.f2$b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: kotlinx.coroutines.sync.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: kotlinx.coroutines.sync.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v36, resolved type: kotlinx.coroutines.sync.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v37, resolved type: kotlinx.coroutines.sync.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: kotlinx.coroutines.sync.d} */
    /* JADX WARNING: type inference failed for: r0v71, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0376, code lost:
        throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0377, code lost:
        r1 = ((f3.f2.b.C0140b) r5).f8226b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x037c, code lost:
        r12.f8196b.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0389, code lost:
        if ((!sf.j.a(r1, r10.f14957a)) != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x038b, code lost:
        if (r14 != r7) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x038d, code lost:
        r0 = "prevKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0390, code lost:
        r0 = "nextKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03bc, code lost:
        throw new java.lang.IllegalStateException(zf.f.n0("The same value, " + r10.f14957a + ", was passed as the " + r0 + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ").toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03bd, code lost:
        r1 = r12.f8206l;
        r2 = r1.f8458a;
        r3.f8301a = r12;
        r3.f8302b = r14;
        r3.f8303c = r0;
        r3.f8304d = r11;
        r3.f8305e = r10;
        r3.B = r9;
        r3.C = r8;
        r3.D = r5;
        r3.E = r1;
        r3.F = r2;
        r3.L = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03dc, code lost:
        if (r2.b(r3) != r4) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03e0, code lost:
        r15 = r12;
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03f3, code lost:
        if (r1.f8459b.e(r12.f8242a, r14, (f3.f2.b.C0140b) r5) != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03f7, code lost:
        r1 = (f3.f2.b.C0140b) r5;
        r11.f14955a = r1.f8225a.size() + r11.f14955a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0405, code lost:
        if (r14 != r7) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0409, code lost:
        if (r1.f8226b == null) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x040e, code lost:
        if (r14 != r6) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0412, code lost:
        if (r1.f8227c != null) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0415, code lost:
        r9.f14953a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0419, code lost:
        r3 = r18;
        r0 = r12;
        r12 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x041f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0420, code lost:
        r2.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0424, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0428, code lost:
        if ((r5 instanceof f3.f2.b.a) == false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x042a, code lost:
        r1 = r12.f8206l;
        r2 = r1.f8458a;
        r3.f8301a = r12;
        r3.f8302b = r14;
        r3.f8303c = r0;
        r3.f8304d = r5;
        r3.f8305e = r1;
        r3.B = r2;
        r3.C = null;
        r3.L = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0444, code lost:
        if (r2.b(r3) != r4) goto L_0x0448;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0448, code lost:
        r8 = r12;
        r16 = r4;
        r4 = r0;
        r0 = r16;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r1 = r1.f8459b;
        r6 = new f3.m0.a(((f3.f2.b.a) r5).f8224a);
        r3.f8301a = r14;
        r3.f8302b = r4;
        r3.f8303c = r2;
        r3.f8304d = r1;
        r3.f8305e = null;
        r3.B = null;
        r3.L = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x046d, code lost:
        if (r8.i(r1, r14, r6, r3) != r0) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0472, code lost:
        r0 = r1;
        r1 = r2;
        r3 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r0.f8456k.put(r3, r4.f8243b);
        r0 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x047e, code lost:
        r1.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0488, code lost:
        r0 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0489, code lost:
        r2.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x048d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0497, code lost:
        if (f3.f1.a.f8208a[r14.ordinal()] != 2) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0499, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x049b, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x049c, code lost:
        r1 = r12.f8206l;
        r15 = r1.f8458a;
        r3.f8301a = r12;
        r3.f8302b = r14;
        r3.f8303c = r0;
        r3.f8304d = r11;
        r3.f8305e = r10;
        r3.B = r9;
        r3.C = r8;
        r3.D = r5;
        r3.E = r2;
        r3.F = r1;
        r3.G = r15;
        r18 = r0;
        r3.L = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04c0, code lost:
        if (r15.b(r3) != r4) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04c4, code lost:
        r0 = r14;
        r14 = r18;
        r16 = r5;
        r5 = r2;
        r2 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04d1, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r1 = r1.f8459b;
        r18 = r6;
        r5 = r1.c(r5, r14.f8243b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04db, code lost:
        if (r5 != null) goto L_0x04e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04dd, code lost:
        r6 = r18;
        r5 = r8;
        r8 = r9;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04e2, code lost:
        r1.b(r5);
        r6 = r2.f8205k;
        r3.f8301a = r2;
        r3.f8302b = r0;
        r3.f8303c = r14;
        r3.f8304d = r12;
        r3.f8305e = r11;
        r3.B = r10;
        r3.C = r9;
        r3.D = r8;
        r3.E = r15;
        r3.F = r1;
        r19 = r1;
        r3.G = null;
        r3.L = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0508, code lost:
        if (r6.t(r5, r3) != r4) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x050c, code lost:
        r6 = r18;
        r5 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r14;
        r1 = r15;
        r14 = r0;
        r15 = r2;
        r0 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r2 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x051b, code lost:
        r2 = r15;
        r15 = r1;
        r1 = r0;
        r0 = r14;
        r14 = r12;
        r12 = r11;
        r11 = r10;
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r18 = r6;
        r19 = r7;
        r6 = r2.h(r1, r0, r14.f8242a, r14.f8243b.a(r0) + r12.f14955a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0536, code lost:
        r7 = r1.f8457l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r11.f14957a = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x053a, code lost:
        if (r6 != null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0542, code lost:
        if ((r7.a(r0) instanceof f3.m0.a) != false) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0546, code lost:
        if (r10.f14953a == false) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0548, code lost:
        r6 = f3.m0.c.f8366b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x054b, code lost:
        r6 = f3.m0.c.f8367c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x054d, code lost:
        r7.c(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0550, code lost:
        r1 = r1.f((f3.f2.b.C0140b) r5, r0);
        r6 = r2.f8205k;
        r3.f8301a = r2;
        r3.f8302b = r0;
        r3.f8303c = r14;
        r3.f8304d = r12;
        r3.f8305e = r11;
        r3.B = r10;
        r3.C = r8;
        r3.D = r5;
        r3.E = r15;
        r3.F = null;
        r3.G = null;
        r3.L = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0578, code lost:
        if (r6.t(r1, r3) != r4) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x057c, code lost:
        r6 = r18;
        r9 = r0;
        r0 = r5;
        r5 = r8;
        r8 = r14;
        r1 = r15;
        r15 = r10;
        r10 = r11;
        r11 = r2;
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r14 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x058a, code lost:
        r1.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0590, code lost:
        if ((r5 instanceof f3.f2.a.b) == false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0597, code lost:
        if (((f3.f2.b.C0140b) r0).f8226b != null) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0599, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x059b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x059e, code lost:
        if ((r5 instanceof f3.f2.a.C0139a) == false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05a4, code lost:
        if (((f3.f2.b.C0140b) r0).f8227c != null) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05a6, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05a8, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05ab, code lost:
        if (r11.f8200f == null) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05ad, code lost:
        if (r1 != 0) goto L_0x05b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05af, code lost:
        if (r0 == 0) goto L_0x0608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05b1, code lost:
        r14 = r11.f8206l;
        r5 = r14.f8458a;
        r3.f8301a = r11;
        r3.f8302b = r9;
        r3.f8303c = r8;
        r3.f8304d = r12;
        r3.f8305e = r10;
        r3.B = r15;
        r3.C = r14;
        r3.D = r5;
        r3.E = null;
        r3.H = r1;
        r3.I = r0;
        r3.L = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05d4, code lost:
        if (r5.b(r3) != r4) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05d7, code lost:
        r7 = r2;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        r2 = r14.f8459b.a(r11.f8203i.f8259a.f8264c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05e4, code lost:
        r5.a((java.lang.Object) null);
        r5 = r11.f8200f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05ea, code lost:
        if (r1 == 0) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05ec, code lost:
        r5.c(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05ef, code lost:
        if (r0 == 0) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05f1, code lost:
        r5.c(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05f4, code lost:
        r0 = r15;
        r16 = r10;
        r10 = r8;
        r8 = r16;
        r17 = r11;
        r11 = r9;
        r9 = r12;
        r12 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0602, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0603, code lost:
        r5.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0607, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0608, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x060a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x060b, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x060c, code lost:
        r1.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0610, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0614, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0615, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0616, code lost:
        r5.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x061a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0620, code lost:
        throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0621, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0622, code lost:
        r2.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0626, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        return ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01f7, code lost:
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5 = r5.f8459b;
        r10 = r1.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0234, code lost:
        if (r10 == 0) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0237, code lost:
        if (r10 == 1) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x023a, code lost:
        if (r10 == 2) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x023e, code lost:
        r10 = (r5.f8449d + r8.f8243b.f8522d) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0247, code lost:
        if (r10 >= 0) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0249, code lost:
        r11 = r9.f14955a;
        r0.f8197c.getClass();
        r9.f14955a = ((-r10) * 10) + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0257, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0258, code lost:
        r5 = r5.f8448c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r11 = cb.d.H(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x025e, code lost:
        if (r10 > r11) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0260, code lost:
        r12 = r10 + 1;
        r9.f14955a += ((f3.f2.b.C0140b) r5.get(r10)).f8225a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0273, code lost:
        if (r10 != r11) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0276, code lost:
        r10 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x027e, code lost:
        r10 = (r5.f8449d + r8.f8243b.f8521c) - 1;
        r5 = r5.f8448c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0287, code lost:
        if (r10 <= cb.d.H(r5)) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0289, code lost:
        r11 = r9.f14955a;
        r0.f8197c.getClass();
        r9.f14955a = ((r10 - cb.d.H(r5)) * 10) + r11;
        r10 = cb.d.H(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x029f, code lost:
        if (r10 < 0) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a1, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a2, code lost:
        r12 = r11 + 1;
        r9.f14955a += ((f3.f2.b.C0140b) r5.get(r11)).f8225a.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b5, code lost:
        if (r11 != r10) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02b8, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02ba, code lost:
        r5 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02bc, code lost:
        r2.a((java.lang.Object) null);
        r2 = new sf.v();
        r5 = r0.f8206l;
        r10 = r5.f8458a;
        r3.f8301a = r0;
        r3.f8302b = r1;
        r3.f8303c = r8;
        r3.f8304d = r9;
        r3.f8305e = r2;
        r3.B = r5;
        r3.C = r10;
        r3.D = r2;
        r3.L = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02e0, code lost:
        if (r10.b(r3) != r4) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02e4, code lost:
        r12 = r0;
        r11 = r1;
        r0 = r2;
        r1 = r10;
        r10 = r8;
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2 = r5.f8459b;
        r5 = r12.h(r2, r11, r10.f8242a, r10.f8243b.a(r11) + r9.f14955a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02fb, code lost:
        if (r5 != null) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02fd, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02ff, code lost:
        r3.f8301a = r12;
        r3.f8302b = r11;
        r3.f8303c = r10;
        r3.f8304d = r9;
        r3.f8305e = r8;
        r3.B = r1;
        r3.C = r5;
        r3.D = r0;
        r3.L = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0316, code lost:
        if (r12.j(r2, r11, r3) != r4) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x031a, code lost:
        r16 = r5;
        r5 = r1;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x031f, code lost:
        r2 = r1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0321, code lost:
        r1.a((java.lang.Object) null);
        r0.f14957a = r2;
        r0 = new sf.r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x032c, code lost:
        r1 = r8.f14957a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x032e, code lost:
        if (r1 == null) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0330, code lost:
        r1 = r12.g(r11, r1);
        r3.f8301a = r12;
        r3.f8302b = r11;
        r3.f8303c = r10;
        r3.f8304d = r9;
        r3.f8305e = r8;
        r3.B = r0;
        r3.C = r1;
        r3.D = null;
        r3.E = null;
        r3.L = 4;
        r2 = r12.f8196b.c(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0350, code lost:
        if (r2 != r4) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0354, code lost:
        r14 = r11;
        r11 = r9;
        r9 = r0;
        r0 = r10;
        r10 = r8;
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x035a, code lost:
        r5 = (f3.f2.b) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x035f, code lost:
        if ((r5 instanceof f3.f2.b.C0140b) == false) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0361, code lost:
        r1 = r14.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0366, code lost:
        if (r1 == 1) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0369, code lost:
        if (r1 != 2) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x036b, code lost:
        r1 = ((f3.f2.b.C0140b) r5).f8227c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(f3.f1 r18, f3.o0 r19, f3.g0 r20, jf.d r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r18.getClass()
            boolean r3 = r2 instanceof f3.k1
            if (r3 == 0) goto L_0x001c
            r3 = r2
            f3.k1 r3 = (f3.k1) r3
            int r4 = r3.L
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.L = r4
            goto L_0x0021
        L_0x001c:
            f3.k1 r3 = new f3.k1
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.J
            kf.a r4 = kf.a.f10464a
            int r5 = r3.L
            f3.o0 r6 = f3.o0.f8399c
            f3.o0 r7 = f3.o0.f8398b
            java.lang.String r13 = "Use doInitialLoad for LoadType == REFRESH"
            switch(r5) {
                case 0: goto L_0x01fa;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01b1;
                case 3: goto L_0x018b;
                case 4: goto L_0x0163;
                case 5: goto L_0x0135;
                case 6: goto L_0x0114;
                case 7: goto L_0x00fc;
                case 8: goto L_0x00c7;
                case 9: goto L_0x0097;
                case 10: goto L_0x0061;
                case 11: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            int r0 = r3.I
            int r1 = r3.H
            java.lang.Object r5 = r3.D
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5
            java.lang.Object r14 = r3.C
            f3.q1$a r14 = (f3.q1.a) r14
            java.lang.Object r15 = r3.B
            sf.r r15 = (sf.r) r15
            java.lang.Object r10 = r3.f8305e
            sf.v r10 = (sf.v) r10
            java.lang.Object r12 = r3.f8304d
            sf.t r12 = (sf.t) r12
            java.lang.Object r8 = r3.f8303c
            f3.g0 r8 = (f3.g0) r8
            java.lang.Object r9 = r3.f8302b
            f3.o0 r9 = (f3.o0) r9
            java.lang.Object r11 = r3.f8301a
            f3.f1 r11 = (f3.f1) r11
            cb.b.J(r2)
            goto L_0x05d8
        L_0x0061:
            java.lang.Object r0 = r3.E
            r1 = r0
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r0 = r3.D
            f3.f2$b r0 = (f3.f2.b) r0
            java.lang.Object r5 = r3.C
            f3.f2$a r5 = (f3.f2.a) r5
            java.lang.Object r8 = r3.B
            sf.r r8 = (sf.r) r8
            java.lang.Object r9 = r3.f8305e
            sf.v r9 = (sf.v) r9
            java.lang.Object r10 = r3.f8304d
            sf.t r10 = (sf.t) r10
            java.lang.Object r11 = r3.f8303c
            f3.g0 r11 = (f3.g0) r11
            java.lang.Object r12 = r3.f8302b
            f3.o0 r12 = (f3.o0) r12
            java.lang.Object r14 = r3.f8301a
            f3.f1 r14 = (f3.f1) r14
            cb.b.J(r2)     // Catch:{ all -> 0x00c4 }
            r2 = r7
            r15 = r8
            r8 = r11
            r11 = r14
            r7 = 10
            r16 = r10
            r10 = r9
            r9 = r12
            r12 = r16
            goto L_0x0588
        L_0x0097:
            java.lang.Object r0 = r3.F
            f3.q1 r0 = (f3.q1) r0
            java.lang.Object r1 = r3.E
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r5 = r3.D
            f3.f2$b r5 = (f3.f2.b) r5
            java.lang.Object r8 = r3.C
            f3.f2$a r8 = (f3.f2.a) r8
            java.lang.Object r9 = r3.B
            sf.r r9 = (sf.r) r9
            java.lang.Object r10 = r3.f8305e
            sf.v r10 = (sf.v) r10
            java.lang.Object r11 = r3.f8304d
            sf.t r11 = (sf.t) r11
            java.lang.Object r12 = r3.f8303c
            f3.g0 r12 = (f3.g0) r12
            java.lang.Object r14 = r3.f8302b
            f3.o0 r14 = (f3.o0) r14
            java.lang.Object r15 = r3.f8301a
            f3.f1 r15 = (f3.f1) r15
            cb.b.J(r2)     // Catch:{ all -> 0x00c4 }
            goto L_0x0519
        L_0x00c4:
            r0 = move-exception
            goto L_0x060c
        L_0x00c7:
            kotlinx.coroutines.sync.d r0 = r3.G
            java.lang.Object r1 = r3.F
            f3.q1$a r1 = (f3.q1.a) r1
            java.lang.Object r5 = r3.E
            f3.o0 r5 = (f3.o0) r5
            java.lang.Object r8 = r3.D
            f3.f2$b r8 = (f3.f2.b) r8
            java.lang.Object r9 = r3.C
            f3.f2$a r9 = (f3.f2.a) r9
            java.lang.Object r10 = r3.B
            sf.r r10 = (sf.r) r10
            java.lang.Object r11 = r3.f8305e
            sf.v r11 = (sf.v) r11
            java.lang.Object r12 = r3.f8304d
            sf.t r12 = (sf.t) r12
            java.lang.Object r14 = r3.f8303c
            f3.g0 r14 = (f3.g0) r14
            java.lang.Object r15 = r3.f8302b
            f3.o0 r15 = (f3.o0) r15
            r18 = r0
            java.lang.Object r0 = r3.f8301a
            f3.f1 r0 = (f3.f1) r0
            cb.b.J(r2)
            r2 = r0
            r0 = r15
            r15 = r18
            goto L_0x04d1
        L_0x00fc:
            java.lang.Object r0 = r3.f8304d
            f3.q1 r0 = (f3.q1) r0
            java.lang.Object r1 = r3.f8303c
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r4 = r3.f8302b
            f3.g0 r4 = (f3.g0) r4
            java.lang.Object r3 = r3.f8301a
            f3.o0 r3 = (f3.o0) r3
            cb.b.J(r2)     // Catch:{ all -> 0x0111 }
            goto L_0x0475
        L_0x0111:
            r0 = move-exception
            goto L_0x0486
        L_0x0114:
            java.lang.Object r0 = r3.B
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.c) r0
            java.lang.Object r1 = r3.f8305e
            f3.q1$a r1 = (f3.q1.a) r1
            java.lang.Object r5 = r3.f8304d
            f3.f2$b r5 = (f3.f2.b) r5
            java.lang.Object r6 = r3.f8303c
            f3.g0 r6 = (f3.g0) r6
            java.lang.Object r7 = r3.f8302b
            f3.o0 r7 = (f3.o0) r7
            java.lang.Object r8 = r3.f8301a
            f3.f1 r8 = (f3.f1) r8
            cb.b.J(r2)
            r2 = r0
            r0 = r4
            r4 = r6
            r14 = r7
            goto L_0x044e
        L_0x0135:
            java.lang.Object r0 = r3.F
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.c) r0
            java.lang.Object r1 = r3.E
            f3.q1$a r1 = (f3.q1.a) r1
            java.lang.Object r5 = r3.D
            f3.f2$b r5 = (f3.f2.b) r5
            java.lang.Object r8 = r3.C
            f3.f2$a r8 = (f3.f2.a) r8
            java.lang.Object r9 = r3.B
            sf.r r9 = (sf.r) r9
            java.lang.Object r10 = r3.f8305e
            sf.v r10 = (sf.v) r10
            java.lang.Object r11 = r3.f8304d
            sf.t r11 = (sf.t) r11
            java.lang.Object r12 = r3.f8303c
            f3.g0 r12 = (f3.g0) r12
            java.lang.Object r14 = r3.f8302b
            f3.o0 r14 = (f3.o0) r14
            java.lang.Object r15 = r3.f8301a
            f3.f1 r15 = (f3.f1) r15
            cb.b.J(r2)
            r2 = r0
            goto L_0x03e2
        L_0x0163:
            java.lang.Object r0 = r3.C
            f3.f2$a r0 = (f3.f2.a) r0
            java.lang.Object r1 = r3.B
            sf.r r1 = (sf.r) r1
            java.lang.Object r5 = r3.f8305e
            sf.v r5 = (sf.v) r5
            java.lang.Object r8 = r3.f8304d
            sf.t r8 = (sf.t) r8
            java.lang.Object r9 = r3.f8303c
            f3.g0 r9 = (f3.g0) r9
            java.lang.Object r10 = r3.f8302b
            f3.o0 r10 = (f3.o0) r10
            java.lang.Object r11 = r3.f8301a
            f3.f1 r11 = (f3.f1) r11
            cb.b.J(r2)
            r14 = r10
            r12 = r11
            r10 = r5
            r11 = r8
            r8 = r0
            r0 = r9
            r9 = r1
            goto L_0x035a
        L_0x018b:
            java.lang.Object r0 = r3.D
            sf.v r0 = (sf.v) r0
            java.lang.Object r1 = r3.C
            java.lang.Object r5 = r3.B
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5
            java.lang.Object r8 = r3.f8305e
            sf.v r8 = (sf.v) r8
            java.lang.Object r9 = r3.f8304d
            sf.t r9 = (sf.t) r9
            java.lang.Object r10 = r3.f8303c
            f3.g0 r10 = (f3.g0) r10
            java.lang.Object r11 = r3.f8302b
            f3.o0 r11 = (f3.o0) r11
            java.lang.Object r12 = r3.f8301a
            f3.f1 r12 = (f3.f1) r12
            cb.b.J(r2)     // Catch:{ all -> 0x01ae }
            goto L_0x031f
        L_0x01ae:
            r0 = move-exception
            goto L_0x0616
        L_0x01b1:
            java.lang.Object r0 = r3.D
            sf.v r0 = (sf.v) r0
            java.lang.Object r1 = r3.C
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r5 = r3.B
            f3.q1$a r5 = (f3.q1.a) r5
            java.lang.Object r8 = r3.f8305e
            sf.v r8 = (sf.v) r8
            java.lang.Object r9 = r3.f8304d
            sf.t r9 = (sf.t) r9
            java.lang.Object r10 = r3.f8303c
            f3.g0 r10 = (f3.g0) r10
            java.lang.Object r11 = r3.f8302b
            f3.o0 r11 = (f3.o0) r11
            java.lang.Object r12 = r3.f8301a
            f3.f1 r12 = (f3.f1) r12
            cb.b.J(r2)
            goto L_0x02ea
        L_0x01d6:
            java.lang.Object r0 = r3.B
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.c) r0
            java.lang.Object r1 = r3.f8305e
            f3.q1$a r1 = (f3.q1.a) r1
            java.lang.Object r5 = r3.f8304d
            sf.t r5 = (sf.t) r5
            java.lang.Object r8 = r3.f8303c
            f3.g0 r8 = (f3.g0) r8
            java.lang.Object r9 = r3.f8302b
            f3.o0 r9 = (f3.o0) r9
            java.lang.Object r10 = r3.f8301a
            f3.f1 r10 = (f3.f1) r10
            cb.b.J(r2)
            r2 = r0
            r0 = r10
            r16 = r5
            r5 = r1
            r1 = r9
        L_0x01f7:
            r9 = r16
            goto L_0x022e
        L_0x01fa:
            cb.b.J(r2)
            f3.o0 r2 = f3.o0.f8397a
            if (r1 == r2) goto L_0x0203
            r2 = 1
            goto L_0x0204
        L_0x0203:
            r2 = 0
        L_0x0204:
            if (r2 == 0) goto L_0x0627
            sf.t r5 = new sf.t
            r5.<init>()
            f3.q1$a<Key, Value> r2 = r0.f8206l
            kotlinx.coroutines.sync.d r8 = r2.f8458a
            r3.f8301a = r0
            r3.f8302b = r1
            r9 = r20
            r3.f8303c = r9
            r3.f8304d = r5
            r3.f8305e = r2
            r3.B = r8
            r10 = 1
            r3.L = r10
            java.lang.Object r10 = r8.b(r3)
            if (r10 != r4) goto L_0x0228
            goto L_0x0613
        L_0x0228:
            r16 = r5
            r5 = r2
            r2 = r8
            r8 = r9
            goto L_0x01f7
        L_0x022e:
            f3.q1<Key, Value> r5 = r5.f8459b     // Catch:{ all -> 0x0621 }
            int r10 = r1.ordinal()     // Catch:{ all -> 0x0621 }
            if (r10 == 0) goto L_0x061b
            r11 = 1
            if (r10 == r11) goto L_0x0278
            r11 = 2
            if (r10 == r11) goto L_0x023e
            goto L_0x02ba
        L_0x023e:
            int r10 = r5.f8449d     // Catch:{ all -> 0x0621 }
            f3.v2 r11 = r8.f8243b     // Catch:{ all -> 0x0621 }
            int r11 = r11.f8522d     // Catch:{ all -> 0x0621 }
            int r10 = r10 + r11
            r11 = 1
            int r10 = r10 + r11
            if (r10 >= 0) goto L_0x0258
            int r11 = r9.f14955a     // Catch:{ all -> 0x0621 }
            f3.w1 r12 = r0.f8197c     // Catch:{ all -> 0x0621 }
            r12.getClass()     // Catch:{ all -> 0x0621 }
            int r10 = -r10
            r12 = 10
            int r10 = r10 * r12
            int r10 = r10 + r11
            r9.f14955a = r10     // Catch:{ all -> 0x0621 }
            r10 = 0
        L_0x0258:
            java.util.ArrayList r5 = r5.f8448c
            int r11 = cb.d.H(r5)     // Catch:{ all -> 0x0621 }
            if (r10 > r11) goto L_0x02ba
        L_0x0260:
            int r12 = r10 + 1
            int r14 = r9.f14955a     // Catch:{ all -> 0x0621 }
            java.lang.Object r15 = r5.get(r10)     // Catch:{ all -> 0x0621 }
            f3.f2$b$b r15 = (f3.f2.b.C0140b) r15     // Catch:{ all -> 0x0621 }
            java.util.List<Value> r15 = r15.f8225a     // Catch:{ all -> 0x0621 }
            int r15 = r15.size()     // Catch:{ all -> 0x0621 }
            int r14 = r14 + r15
            r9.f14955a = r14     // Catch:{ all -> 0x0621 }
            if (r10 != r11) goto L_0x0276
            goto L_0x02ba
        L_0x0276:
            r10 = r12
            goto L_0x0260
        L_0x0278:
            int r10 = r5.f8449d     // Catch:{ all -> 0x0621 }
            f3.v2 r11 = r8.f8243b     // Catch:{ all -> 0x0621 }
            int r11 = r11.f8521c     // Catch:{ all -> 0x0621 }
            int r10 = r10 + r11
            r11 = 1
            int r10 = r10 - r11
            java.util.ArrayList r5 = r5.f8448c
            int r11 = cb.d.H(r5)     // Catch:{ all -> 0x0621 }
            if (r10 <= r11) goto L_0x029f
            int r11 = r9.f14955a     // Catch:{ all -> 0x0621 }
            f3.w1 r12 = r0.f8197c     // Catch:{ all -> 0x0621 }
            r12.getClass()     // Catch:{ all -> 0x0621 }
            int r12 = cb.d.H(r5)     // Catch:{ all -> 0x0621 }
            int r10 = r10 - r12
            r12 = 10
            int r10 = r10 * r12
            int r10 = r10 + r11
            r9.f14955a = r10     // Catch:{ all -> 0x0621 }
            int r10 = cb.d.H(r5)     // Catch:{ all -> 0x0621 }
        L_0x029f:
            if (r10 < 0) goto L_0x02ba
            r11 = 0
        L_0x02a2:
            int r12 = r11 + 1
            int r14 = r9.f14955a     // Catch:{ all -> 0x0621 }
            java.lang.Object r15 = r5.get(r11)     // Catch:{ all -> 0x0621 }
            f3.f2$b$b r15 = (f3.f2.b.C0140b) r15     // Catch:{ all -> 0x0621 }
            java.util.List<Value> r15 = r15.f8225a     // Catch:{ all -> 0x0621 }
            int r15 = r15.size()     // Catch:{ all -> 0x0621 }
            int r14 = r14 + r15
            r9.f14955a = r14     // Catch:{ all -> 0x0621 }
            if (r11 != r10) goto L_0x02b8
            goto L_0x02ba
        L_0x02b8:
            r11 = r12
            goto L_0x02a2
        L_0x02ba:
            ff.m r5 = ff.m.f8717a     // Catch:{ all -> 0x0621 }
            r5 = 0
            r2.a(r5)
            sf.v r2 = new sf.v
            r2.<init>()
            f3.q1$a<Key, Value> r5 = r0.f8206l
            kotlinx.coroutines.sync.d r10 = r5.f8458a
            r3.f8301a = r0
            r3.f8302b = r1
            r3.f8303c = r8
            r3.f8304d = r9
            r3.f8305e = r2
            r3.B = r5
            r3.C = r10
            r3.D = r2
            r11 = 2
            r3.L = r11
            java.lang.Object r11 = r10.b(r3)
            if (r11 != r4) goto L_0x02e4
            goto L_0x0613
        L_0x02e4:
            r12 = r0
            r11 = r1
            r0 = r2
            r1 = r10
            r10 = r8
            r8 = r0
        L_0x02ea:
            f3.q1<Key, Value> r2 = r5.f8459b     // Catch:{ all -> 0x0614 }
            int r5 = r10.f8242a     // Catch:{ all -> 0x0614 }
            f3.v2 r14 = r10.f8243b     // Catch:{ all -> 0x0614 }
            int r14 = r14.a(r11)     // Catch:{ all -> 0x0614 }
            int r15 = r9.f14955a     // Catch:{ all -> 0x0614 }
            int r14 = r14 + r15
            java.lang.Object r5 = r12.h(r2, r11, r5, r14)     // Catch:{ all -> 0x0614 }
            if (r5 != 0) goto L_0x02ff
            r2 = 0
            goto L_0x0321
        L_0x02ff:
            r3.f8301a = r12     // Catch:{ all -> 0x0614 }
            r3.f8302b = r11     // Catch:{ all -> 0x0614 }
            r3.f8303c = r10     // Catch:{ all -> 0x0614 }
            r3.f8304d = r9     // Catch:{ all -> 0x0614 }
            r3.f8305e = r8     // Catch:{ all -> 0x0614 }
            r3.B = r1     // Catch:{ all -> 0x0614 }
            r3.C = r5     // Catch:{ all -> 0x0614 }
            r3.D = r0     // Catch:{ all -> 0x0614 }
            r14 = 3
            r3.L = r14     // Catch:{ all -> 0x0614 }
            java.lang.Object r2 = r12.j(r2, r11, r3)     // Catch:{ all -> 0x0614 }
            if (r2 != r4) goto L_0x031a
            goto L_0x0613
        L_0x031a:
            r16 = r5
            r5 = r1
            r1 = r16
        L_0x031f:
            r2 = r1
            r1 = r5
        L_0x0321:
            r5 = 0
            r1.a(r5)
            r0.f14957a = r2
            sf.r r0 = new sf.r
            r0.<init>()
        L_0x032c:
            T r1 = r8.f14957a
            if (r1 == 0) goto L_0x0611
            f3.f2$a r1 = r12.g(r11, r1)
            r3.f8301a = r12
            r3.f8302b = r11
            r3.f8303c = r10
            r3.f8304d = r9
            r3.f8305e = r8
            r3.B = r0
            r3.C = r1
            r2 = 0
            r3.D = r2
            r3.E = r2
            r2 = 4
            r3.L = r2
            f3.f2<Key, Value> r2 = r12.f8196b
            java.lang.Object r2 = r2.c(r1, r3)
            if (r2 != r4) goto L_0x0354
            goto L_0x0613
        L_0x0354:
            r14 = r11
            r11 = r9
            r9 = r0
            r0 = r10
            r10 = r8
            r8 = r1
        L_0x035a:
            r5 = r2
            f3.f2$b r5 = (f3.f2.b) r5
            boolean r1 = r5 instanceof f3.f2.b.C0140b
            if (r1 == 0) goto L_0x0425
            int r1 = r14.ordinal()
            r2 = 1
            if (r1 == r2) goto L_0x0377
            r2 = 2
            if (r1 != r2) goto L_0x0371
            r1 = r5
            f3.f2$b$b r1 = (f3.f2.b.C0140b) r1
            Key r1 = r1.f8227c
            goto L_0x037c
        L_0x0371:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r13)
            throw r0
        L_0x0377:
            r1 = r5
            f3.f2$b$b r1 = (f3.f2.b.C0140b) r1
            Key r1 = r1.f8226b
        L_0x037c:
            f3.f2<Key, Value> r2 = r12.f8196b
            r2.getClass()
            T r2 = r10.f14957a
            boolean r1 = sf.j.a(r1, r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x03bd
            if (r14 != r7) goto L_0x0390
            java.lang.String r0 = "prevKey"
            goto L_0x0392
        L_0x0390:
            java.lang.String r0 = "nextKey"
        L_0x0392:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The same value, "
            r1.<init>(r2)
            T r2 = r10.f14957a
            r1.append(r2)
            java.lang.String r2 = ", was passed as the "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = zf.f.n0(r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x03bd:
            f3.q1$a<Key, Value> r1 = r12.f8206l
            kotlinx.coroutines.sync.d r2 = r1.f8458a
            r3.f8301a = r12
            r3.f8302b = r14
            r3.f8303c = r0
            r3.f8304d = r11
            r3.f8305e = r10
            r3.B = r9
            r3.C = r8
            r3.D = r5
            r3.E = r1
            r3.F = r2
            r15 = 5
            r3.L = r15
            java.lang.Object r15 = r2.b(r3)
            if (r15 != r4) goto L_0x03e0
            goto L_0x0613
        L_0x03e0:
            r15 = r12
            r12 = r0
        L_0x03e2:
            f3.q1<Key, Value> r0 = r1.f8459b     // Catch:{ all -> 0x041f }
            int r1 = r12.f8242a     // Catch:{ all -> 0x041f }
            r18 = r3
            r3 = r5
            f3.f2$b$b r3 = (f3.f2.b.C0140b) r3     // Catch:{ all -> 0x041f }
            boolean r0 = r0.e(r1, r14, r3)     // Catch:{ all -> 0x041f }
            r1 = 0
            r2.a(r1)
            if (r0 != 0) goto L_0x03f7
            goto L_0x0611
        L_0x03f7:
            int r0 = r11.f14955a
            r1 = r5
            f3.f2$b$b r1 = (f3.f2.b.C0140b) r1
            java.util.List<Value> r2 = r1.f8225a
            int r2 = r2.size()
            int r2 = r2 + r0
            r11.f14955a = r2
            if (r14 != r7) goto L_0x040e
            Key r0 = r1.f8226b
            if (r0 == 0) goto L_0x040c
            goto L_0x040e
        L_0x040c:
            r1 = 1
            goto L_0x0415
        L_0x040e:
            if (r14 != r6) goto L_0x0418
            Key r0 = r1.f8227c
            if (r0 != 0) goto L_0x0418
            goto L_0x040c
        L_0x0415:
            r9.f14953a = r1
            goto L_0x0419
        L_0x0418:
            r1 = 1
        L_0x0419:
            r3 = r18
            r0 = r12
            r12 = r15
            goto L_0x048e
        L_0x041f:
            r0 = move-exception
            r1 = 0
            r2.a(r1)
            throw r0
        L_0x0425:
            r1 = 1
            boolean r2 = r5 instanceof f3.f2.b.a
            if (r2 == 0) goto L_0x048e
            f3.q1$a<Key, Value> r1 = r12.f8206l
            kotlinx.coroutines.sync.d r2 = r1.f8458a
            r3.f8301a = r12
            r3.f8302b = r14
            r3.f8303c = r0
            r3.f8304d = r5
            r3.f8305e = r1
            r3.B = r2
            r6 = 0
            r3.C = r6
            r6 = 6
            r3.L = r6
            java.lang.Object r6 = r2.b(r3)
            if (r6 != r4) goto L_0x0448
            goto L_0x0613
        L_0x0448:
            r8 = r12
            r16 = r4
            r4 = r0
            r0 = r16
        L_0x044e:
            f3.q1<Key, Value> r1 = r1.f8459b     // Catch:{ all -> 0x0488 }
            f3.m0$a r6 = new f3.m0$a     // Catch:{ all -> 0x0488 }
            f3.f2$b$a r5 = (f3.f2.b.a) r5     // Catch:{ all -> 0x0488 }
            java.lang.Throwable r5 = r5.f8224a     // Catch:{ all -> 0x0488 }
            r6.<init>(r5)     // Catch:{ all -> 0x0488 }
            r3.f8301a = r14     // Catch:{ all -> 0x0488 }
            r3.f8302b = r4     // Catch:{ all -> 0x0488 }
            r3.f8303c = r2     // Catch:{ all -> 0x0488 }
            r3.f8304d = r1     // Catch:{ all -> 0x0488 }
            r5 = 0
            r3.f8305e = r5     // Catch:{ all -> 0x0488 }
            r3.B = r5     // Catch:{ all -> 0x0488 }
            r5 = 7
            r3.L = r5     // Catch:{ all -> 0x0488 }
            java.lang.Object r3 = r8.i(r1, r14, r6, r3)     // Catch:{ all -> 0x0488 }
            if (r3 != r0) goto L_0x0472
            r4 = r0
            goto L_0x0613
        L_0x0472:
            r0 = r1
            r1 = r2
            r3 = r14
        L_0x0475:
            java.util.LinkedHashMap r0 = r0.f8456k     // Catch:{ all -> 0x0111 }
            f3.v2 r2 = r4.f8243b     // Catch:{ all -> 0x0111 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0111 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0111 }
            r2 = 0
            r1.a(r2)
            ff.m r4 = ff.m.f8717a
            goto L_0x0613
        L_0x0486:
            r2 = r1
            goto L_0x0489
        L_0x0488:
            r0 = move-exception
        L_0x0489:
            r1 = 0
            r2.a(r1)
            throw r0
        L_0x048e:
            int[] r2 = f3.f1.a.f8208a
            int r15 = r14.ordinal()
            r2 = r2[r15]
            r15 = 2
            if (r2 != r15) goto L_0x049b
            r2 = r6
            goto L_0x049c
        L_0x049b:
            r2 = r7
        L_0x049c:
            f3.q1$a<Key, Value> r1 = r12.f8206l
            kotlinx.coroutines.sync.d r15 = r1.f8458a
            r3.f8301a = r12
            r3.f8302b = r14
            r3.f8303c = r0
            r3.f8304d = r11
            r3.f8305e = r10
            r3.B = r9
            r3.C = r8
            r3.D = r5
            r3.E = r2
            r3.F = r1
            r3.G = r15
            r18 = r0
            r0 = 8
            r3.L = r0
            java.lang.Object r0 = r15.b(r3)
            if (r0 != r4) goto L_0x04c4
            goto L_0x0613
        L_0x04c4:
            r0 = r14
            r14 = r18
            r16 = r5
            r5 = r2
            r2 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r16
        L_0x04d1:
            f3.q1<Key, Value> r1 = r1.f8459b     // Catch:{ all -> 0x060a }
            r18 = r6
            f3.v2 r6 = r14.f8243b     // Catch:{ all -> 0x060a }
            f3.y0$a r5 = r1.c(r5, r6)     // Catch:{ all -> 0x060a }
            if (r5 != 0) goto L_0x04e2
            r6 = r18
            r5 = r8
            r8 = r9
            goto L_0x0523
        L_0x04e2:
            r1.b(r5)     // Catch:{ all -> 0x060a }
            cg.a r6 = r2.f8205k     // Catch:{ all -> 0x060a }
            r3.f8301a = r2     // Catch:{ all -> 0x060a }
            r3.f8302b = r0     // Catch:{ all -> 0x060a }
            r3.f8303c = r14     // Catch:{ all -> 0x060a }
            r3.f8304d = r12     // Catch:{ all -> 0x060a }
            r3.f8305e = r11     // Catch:{ all -> 0x060a }
            r3.B = r10     // Catch:{ all -> 0x060a }
            r3.C = r9     // Catch:{ all -> 0x060a }
            r3.D = r8     // Catch:{ all -> 0x060a }
            r3.E = r15     // Catch:{ all -> 0x060a }
            r3.F = r1     // Catch:{ all -> 0x060a }
            r19 = r1
            r1 = 0
            r3.G = r1     // Catch:{ all -> 0x060a }
            r1 = 9
            r3.L = r1     // Catch:{ all -> 0x060a }
            java.lang.Object r1 = r6.t(r5, r3)     // Catch:{ all -> 0x060a }
            if (r1 != r4) goto L_0x050c
            goto L_0x0613
        L_0x050c:
            r6 = r18
            r5 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r1 = r15
            r14 = r0
            r15 = r2
            r0 = r19
        L_0x0519:
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x00c4 }
            r2 = r15
            r15 = r1
            r1 = r0
            r0 = r14
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
        L_0x0523:
            int r9 = r14.f8242a     // Catch:{ all -> 0x060a }
            r18 = r6
            f3.v2 r6 = r14.f8243b     // Catch:{ all -> 0x060a }
            int r6 = r6.a(r0)     // Catch:{ all -> 0x060a }
            r19 = r7
            int r7 = r12.f14955a     // Catch:{ all -> 0x060a }
            int r6 = r6 + r7
            java.lang.Object r6 = r2.h(r1, r0, r9, r6)     // Catch:{ all -> 0x060a }
            f3.t0 r7 = r1.f8457l
            r11.f14957a = r6     // Catch:{ all -> 0x060a }
            if (r6 != 0) goto L_0x0550
            f3.m0 r6 = r7.a(r0)     // Catch:{ all -> 0x060a }
            boolean r6 = r6 instanceof f3.m0.a     // Catch:{ all -> 0x060a }
            if (r6 != 0) goto L_0x0550
            boolean r6 = r10.f14953a     // Catch:{ all -> 0x060a }
            if (r6 == 0) goto L_0x054b
            f3.m0$c r6 = f3.m0.c.f8366b     // Catch:{ all -> 0x060a }
            goto L_0x054d
        L_0x054b:
            f3.m0$c r6 = f3.m0.c.f8367c     // Catch:{ all -> 0x060a }
        L_0x054d:
            r7.c(r0, r6)     // Catch:{ all -> 0x060a }
        L_0x0550:
            r6 = r5
            f3.f2$b$b r6 = (f3.f2.b.C0140b) r6     // Catch:{ all -> 0x060a }
            f3.y0$b r1 = r1.f(r6, r0)     // Catch:{ all -> 0x060a }
            cg.a r6 = r2.f8205k     // Catch:{ all -> 0x060a }
            r3.f8301a = r2     // Catch:{ all -> 0x060a }
            r3.f8302b = r0     // Catch:{ all -> 0x060a }
            r3.f8303c = r14     // Catch:{ all -> 0x060a }
            r3.f8304d = r12     // Catch:{ all -> 0x060a }
            r3.f8305e = r11     // Catch:{ all -> 0x060a }
            r3.B = r10     // Catch:{ all -> 0x060a }
            r3.C = r8     // Catch:{ all -> 0x060a }
            r3.D = r5     // Catch:{ all -> 0x060a }
            r3.E = r15     // Catch:{ all -> 0x060a }
            r7 = 0
            r3.F = r7     // Catch:{ all -> 0x060a }
            r3.G = r7     // Catch:{ all -> 0x060a }
            r7 = 10
            r3.L = r7     // Catch:{ all -> 0x060a }
            java.lang.Object r1 = r6.t(r1, r3)     // Catch:{ all -> 0x060a }
            if (r1 != r4) goto L_0x057c
            goto L_0x0613
        L_0x057c:
            r6 = r18
            r9 = r0
            r0 = r5
            r5 = r8
            r8 = r14
            r1 = r15
            r15 = r10
            r10 = r11
            r11 = r2
            r2 = r19
        L_0x0588:
            ff.m r14 = ff.m.f8717a     // Catch:{ all -> 0x00c4 }
            r14 = 0
            r1.a(r14)
            boolean r1 = r5 instanceof f3.f2.a.b
            if (r1 == 0) goto L_0x059b
            r1 = r0
            f3.f2$b$b r1 = (f3.f2.b.C0140b) r1
            Key r1 = r1.f8226b
            if (r1 != 0) goto L_0x059b
            r1 = 1
            goto L_0x059c
        L_0x059b:
            r1 = 0
        L_0x059c:
            boolean r5 = r5 instanceof f3.f2.a.C0139a
            if (r5 == 0) goto L_0x05a8
            f3.f2$b$b r0 = (f3.f2.b.C0140b) r0
            Key r0 = r0.f8227c
            if (r0 != 0) goto L_0x05a8
            r0 = 1
            goto L_0x05a9
        L_0x05a8:
            r0 = 0
        L_0x05a9:
            f3.j2<Key, Value> r5 = r11.f8200f
            if (r5 == 0) goto L_0x0608
            if (r1 != 0) goto L_0x05b1
            if (r0 == 0) goto L_0x0608
        L_0x05b1:
            f3.q1$a<Key, Value> r14 = r11.f8206l
            kotlinx.coroutines.sync.d r5 = r14.f8458a
            r3.f8301a = r11
            r3.f8302b = r9
            r3.f8303c = r8
            r3.f8304d = r12
            r3.f8305e = r10
            r3.B = r15
            r3.C = r14
            r3.D = r5
            r7 = 0
            r3.E = r7
            r3.H = r1
            r3.I = r0
            r7 = 11
            r3.L = r7
            java.lang.Object r7 = r5.b(r3)
            if (r7 != r4) goto L_0x05d7
            goto L_0x0613
        L_0x05d7:
            r7 = r2
        L_0x05d8:
            f3.q1<Key, Value> r2 = r14.f8459b     // Catch:{ all -> 0x0602 }
            f3.h0 r14 = r11.f8203i     // Catch:{ all -> 0x0602 }
            f3.h0$b r14 = r14.f8259a     // Catch:{ all -> 0x0602 }
            f3.v2$a r14 = r14.f8264c     // Catch:{ all -> 0x0602 }
            f3.g2 r2 = r2.a(r14)     // Catch:{ all -> 0x0602 }
            r14 = 0
            r5.a(r14)
            f3.j2<Key, Value> r5 = r11.f8200f
            if (r1 == 0) goto L_0x05ef
            r5.c(r7, r2)
        L_0x05ef:
            if (r0 == 0) goto L_0x05f4
            r5.c(r6, r2)
        L_0x05f4:
            r0 = r15
            r16 = r10
            r10 = r8
            r8 = r16
            r17 = r11
            r11 = r9
            r9 = r12
            r12 = r17
            goto L_0x032c
        L_0x0602:
            r0 = move-exception
            r1 = 0
            r5.a(r1)
            throw r0
        L_0x0608:
            r7 = r2
            goto L_0x05f4
        L_0x060a:
            r0 = move-exception
            r1 = r15
        L_0x060c:
            r2 = 0
            r1.a(r2)
            throw r0
        L_0x0611:
            ff.m r4 = ff.m.f8717a
        L_0x0613:
            return r4
        L_0x0614:
            r0 = move-exception
            r5 = r1
        L_0x0616:
            r1 = 0
            r5.a(r1)
            throw r0
        L_0x061b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0621 }
            r0.<init>(r13)     // Catch:{ all -> 0x0621 }
            throw r0     // Catch:{ all -> 0x0621 }
        L_0x0621:
            r0 = move-exception
            r1 = 0
            r2.a(r1)
            throw r0
        L_0x0627:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r13.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.f1.b(f3.f1, f3.o0, f3.g0, jf.d):java.lang.Object");
    }

    public static final Object c(f1 f1Var, o0 o0Var, v2 v2Var, l1.c.b.a aVar) {
        f1Var.getClass();
        boolean z10 = true;
        if (a.f8208a[o0Var.ordinal()] == 1) {
            Object f10 = f1Var.f(aVar);
            return f10 == kf.a.f10464a ? f10 : m.f8717a;
        }
        if (v2Var != null) {
            h0 h0Var = f1Var.f8203i;
            h0Var.getClass();
            j.f(v2Var, "viewportHint");
            if (!(o0Var == o0.f8398b || o0Var == o0.f8399c)) {
                z10 = false;
            }
            if (z10) {
                h0Var.f8259a.a((v2.a) null, new i0(o0Var, v2Var));
                return m.f8717a;
            }
            throw new IllegalArgumentException(j.k(o0Var, "invalid load type for reset: ").toString());
        }
        throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
    }

    public static final void d(f1 f1Var, g0 g0Var) {
        if (f1Var.f8197c.f8534e != Integer.MIN_VALUE) {
            for (o0 n1Var : cb.d.P(o0.f8399c, o0.f8398b)) {
                cb.b.D(g0Var, (f.b) null, 0, new n1(n1Var, f1Var, (jf.d) null), 3);
            }
        }
        cb.b.D(g0Var, (f.b) null, 0, new o1(f1Var, (jf.d<? super o1>) null), 3);
        cb.b.D(g0Var, (f.b) null, 0, new p1(f1Var, (jf.d<? super p1>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(jf.d<? super f3.g2<Key, Value>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f3.f1.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            f3.f1$b r0 = (f3.f1.b) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.B = r1
            goto L_0x0018
        L_0x0013:
            f3.f1$b r0 = new f3.f1$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f8212d
            kf.a r1 = kf.a.f10464a
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlinx.coroutines.sync.d r1 = r0.f8211c
            f3.q1$a r2 = r0.f8210b
            f3.f1 r0 = r0.f8209a
            cb.b.J(r5)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            cb.b.J(r5)
            f3.q1$a<Key, Value> r2 = r4.f8206l
            kotlinx.coroutines.sync.d r5 = r2.f8458a
            r0.f8209a = r4
            r0.f8210b = r2
            r0.f8211c = r5
            r0.B = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
            r1 = r5
        L_0x004d:
            r5 = 0
            f3.q1<Key, Value> r2 = r2.f8459b     // Catch:{ all -> 0x005e }
            f3.h0 r0 = r0.f8203i     // Catch:{ all -> 0x005e }
            f3.h0$b r0 = r0.f8259a     // Catch:{ all -> 0x005e }
            f3.v2$a r0 = r0.f8264c     // Catch:{ all -> 0x005e }
            f3.g2 r0 = r2.a(r0)     // Catch:{ all -> 0x005e }
            r1.a(r5)
            return r0
        L_0x005e:
            r0 = move-exception
            r1.a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.f1.e(jf.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01eb, code lost:
        r3 = r7.f8206l;
        r2 = r3.f8458a;
        r0.f8214a = r7;
        r0.f8215b = r13;
        r0.f8216c = r3;
        r0.f8217d = r2;
        r0.C = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ff, code lost:
        if (r2.b(r0) != r1) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0201, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0202, code lost:
        r4 = r13;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r13 = r3.f8459b;
        r3 = new f3.m0.a(((f3.f2.b.a) r4).f8224a);
        r0.f8214a = r2;
        r0.f8215b = null;
        r0.f8216c = null;
        r0.f8217d = null;
        r0.C = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021e, code lost:
        if (r7.i(r13, r5, r3, r0) != r1) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0220, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0221, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r13 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0224, code lost:
        r0.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0229, code lost:
        return ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022c, code lost:
        r13 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022d, code lost:
        r2.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0230, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0233, code lost:
        return ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r13 = r7.f8459b;
        r0.f8214a = r8;
        r0.f8215b = r2;
        r0.f8216c = null;
        r0.C = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if (r8.j(r13, r5, r0) != r1) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        r13 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ec, code lost:
        r2.a((java.lang.Object) null);
        r13 = r7.g(r5, r7.f8195a);
        r0.f8214a = r7;
        r0.f8215b = null;
        r0.C = 3;
        r13 = r7.f8196b.c(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0102, code lost:
        if (r13 != r1) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0104, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0105, code lost:
        r13 = (f3.f2.b) r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0109, code lost:
        if ((r13 instanceof f3.f2.b.C0140b) == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        r2 = r7.f8206l;
        r8 = r2.f8458a;
        r0.f8214a = r7;
        r0.f8215b = r13;
        r0.f8216c = r2;
        r0.f8217d = r8;
        r0.C = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        if (r8.b(r0) != r1) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        r9 = r7;
        r7 = r2;
        r2 = r8;
        r8 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r13 = r7.f8459b;
        r7 = r13.e(0, r5, (f3.f2.b.C0140b) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012f, code lost:
        r13 = r13.f8457l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r13.c(r5, f3.m0.c.f8367c);
        r10 = ((f3.f2.b.C0140b) r8).f8226b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013b, code lost:
        r11 = f3.m0.c.f8366b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013d, code lost:
        if (r10 != null) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r13.c(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0147, code lost:
        if (((f3.f2.b.C0140b) r8).f8227c != null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        r13.c(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014f, code lost:
        if (r7 == false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0151, code lost:
        r7 = r9.f8206l;
        r13 = r7.f8458a;
        r0.f8214a = r9;
        r0.f8215b = r8;
        r0.f8216c = r7;
        r0.f8217d = r13;
        r0.C = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0164, code lost:
        if (r13.b(r0) != r1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0166, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0167, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r13 = r7.f8459b;
        r7 = r9.f8205k;
        r13 = r13.f((f3.f2.b.C0140b) r8, r5);
        r0.f8214a = r9;
        r0.f8215b = r8;
        r0.f8216c = r2;
        r0.f8217d = null;
        r0.C = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        if (r7.t(r13, r0) != r1) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0184, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
        r5 = r8;
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0187, code lost:
        r13 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        r2.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        r5 = r8;
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0196, code lost:
        if (r7.f8200f == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0198, code lost:
        r13 = (f3.f2.b.C0140b) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019d, code lost:
        if (r13.f8226b == null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        if (r13.f8227c != null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a3, code lost:
        r2 = r7.f8206l;
        r13 = r2.f8458a;
        r0.f8214a = r7;
        r0.f8215b = r5;
        r0.f8216c = r2;
        r0.f8217d = r13;
        r0.C = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b6, code lost:
        if (r13.b(r0) != r1) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b9, code lost:
        r1 = r13;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r13 = r2.f8459b.a(r0.f8203i.f8259a.f8264c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c7, code lost:
        r1.a((java.lang.Object) null);
        r5 = (f3.f2.b.C0140b) r5;
        r1 = r5.f8226b;
        r0 = r0.f8200f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d0, code lost:
        if (r1 != null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d2, code lost:
        r0.c(r4, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d7, code lost:
        if (r5.f8227c != null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d9, code lost:
        r0.c(r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01dd, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01de, code lost:
        r1.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e1, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e2, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e3, code lost:
        r2.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e6, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e9, code lost:
        if ((r13 instanceof f3.f2.b.a) == false) goto L_0x0231;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(jf.d<? super ff.m> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof f3.f1.c
            if (r0 == 0) goto L_0x0013
            r0 = r13
            f3.f1$c r0 = (f3.f1.c) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.C = r1
            goto L_0x0018
        L_0x0013:
            f3.f1$c r0 = new f3.f1$c
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f8218e
            kf.a r1 = kf.a.f10464a
            int r2 = r0.C
            f3.o0 r3 = f3.o0.f8399c
            f3.o0 r4 = f3.o0.f8398b
            f3.o0 r5 = f3.o0.f8397a
            r6 = 0
            switch(r2) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0099;
                case 4: goto L_0x0086;
                case 5: goto L_0x0073;
                case 6: goto L_0x0062;
                case 7: goto L_0x004f;
                case 8: goto L_0x003c;
                case 9: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0030:
            java.lang.Object r0 = r0.f8214a
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.c) r0
            cb.b.J(r13)     // Catch:{ all -> 0x0039 }
            goto L_0x0222
        L_0x0039:
            r13 = move-exception
            goto L_0x022a
        L_0x003c:
            kotlinx.coroutines.sync.d r2 = r0.f8217d
            java.lang.Object r3 = r0.f8216c
            f3.q1$a r3 = (f3.q1.a) r3
            java.lang.Object r4 = r0.f8215b
            f3.f2$b r4 = (f3.f2.b) r4
            java.lang.Object r7 = r0.f8214a
            f3.f1 r7 = (f3.f1) r7
            cb.b.J(r13)
            goto L_0x0203
        L_0x004f:
            kotlinx.coroutines.sync.d r1 = r0.f8217d
            java.lang.Object r2 = r0.f8216c
            f3.q1$a r2 = (f3.q1.a) r2
            java.lang.Object r5 = r0.f8215b
            f3.f2$b r5 = (f3.f2.b) r5
            java.lang.Object r0 = r0.f8214a
            f3.f1 r0 = (f3.f1) r0
            cb.b.J(r13)
            goto L_0x01bb
        L_0x0062:
            java.lang.Object r2 = r0.f8216c
            kotlinx.coroutines.sync.c r2 = (kotlinx.coroutines.sync.c) r2
            java.lang.Object r5 = r0.f8215b
            f3.f2$b r5 = (f3.f2.b) r5
            java.lang.Object r7 = r0.f8214a
            f3.f1 r7 = (f3.f1) r7
            cb.b.J(r13)     // Catch:{ all -> 0x018d }
            goto L_0x0187
        L_0x0073:
            kotlinx.coroutines.sync.d r2 = r0.f8217d
            java.lang.Object r7 = r0.f8216c
            f3.q1$a r7 = (f3.q1.a) r7
            java.lang.Object r8 = r0.f8215b
            f3.f2$b r8 = (f3.f2.b) r8
            java.lang.Object r9 = r0.f8214a
            f3.f1 r9 = (f3.f1) r9
            cb.b.J(r13)
            goto L_0x0168
        L_0x0086:
            kotlinx.coroutines.sync.d r2 = r0.f8217d
            java.lang.Object r7 = r0.f8216c
            f3.q1$a r7 = (f3.q1.a) r7
            java.lang.Object r8 = r0.f8215b
            f3.f2$b r8 = (f3.f2.b) r8
            java.lang.Object r9 = r0.f8214a
            f3.f1 r9 = (f3.f1) r9
            cb.b.J(r13)
            goto L_0x0125
        L_0x0099:
            java.lang.Object r2 = r0.f8214a
            f3.f1 r2 = (f3.f1) r2
            cb.b.J(r13)
            r7 = r2
            goto L_0x0105
        L_0x00a2:
            java.lang.Object r2 = r0.f8215b
            kotlinx.coroutines.sync.c r2 = (kotlinx.coroutines.sync.c) r2
            java.lang.Object r7 = r0.f8214a
            f3.f1 r7 = (f3.f1) r7
            cb.b.J(r13)     // Catch:{ all -> 0x0234 }
            goto L_0x00ea
        L_0x00ae:
            java.lang.Object r2 = r0.f8216c
            kotlinx.coroutines.sync.c r2 = (kotlinx.coroutines.sync.c) r2
            java.lang.Object r7 = r0.f8215b
            f3.q1$a r7 = (f3.q1.a) r7
            java.lang.Object r8 = r0.f8214a
            f3.f1 r8 = (f3.f1) r8
            cb.b.J(r13)
            goto L_0x00d7
        L_0x00be:
            cb.b.J(r13)
            f3.q1$a<Key, Value> r7 = r12.f8206l
            kotlinx.coroutines.sync.d r13 = r7.f8458a
            r0.f8214a = r12
            r0.f8215b = r7
            r0.f8216c = r13
            r2 = 1
            r0.C = r2
            java.lang.Object r2 = r13.b(r0)
            if (r2 != r1) goto L_0x00d5
            return r1
        L_0x00d5:
            r8 = r12
            r2 = r13
        L_0x00d7:
            f3.q1<Key, Value> r13 = r7.f8459b     // Catch:{ all -> 0x0234 }
            r0.f8214a = r8     // Catch:{ all -> 0x0234 }
            r0.f8215b = r2     // Catch:{ all -> 0x0234 }
            r0.f8216c = r6     // Catch:{ all -> 0x0234 }
            r7 = 2
            r0.C = r7     // Catch:{ all -> 0x0234 }
            java.lang.Object r13 = r8.j(r13, r5, r0)     // Catch:{ all -> 0x0234 }
            if (r13 != r1) goto L_0x00e9
            return r1
        L_0x00e9:
            r7 = r8
        L_0x00ea:
            ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x0234 }
            r2.a(r6)
            Key r13 = r7.f8195a
            f3.f2$a r13 = r7.g(r5, r13)
            r0.f8214a = r7
            r0.f8215b = r6
            r2 = 3
            r0.C = r2
            f3.f2<Key, Value> r2 = r7.f8196b
            java.lang.Object r13 = r2.c(r13, r0)
            if (r13 != r1) goto L_0x0105
            return r1
        L_0x0105:
            f3.f2$b r13 = (f3.f2.b) r13
            boolean r2 = r13 instanceof f3.f2.b.C0140b
            if (r2 == 0) goto L_0x01e7
            f3.q1$a<Key, Value> r2 = r7.f8206l
            kotlinx.coroutines.sync.d r8 = r2.f8458a
            r0.f8214a = r7
            r0.f8215b = r13
            r0.f8216c = r2
            r0.f8217d = r8
            r9 = 4
            r0.C = r9
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L_0x0121
            return r1
        L_0x0121:
            r9 = r7
            r7 = r2
            r2 = r8
            r8 = r13
        L_0x0125:
            f3.q1<Key, Value> r13 = r7.f8459b     // Catch:{ all -> 0x01e2 }
            r7 = r8
            f3.f2$b$b r7 = (f3.f2.b.C0140b) r7     // Catch:{ all -> 0x01e2 }
            r10 = 0
            boolean r7 = r13.e(r10, r5, r7)     // Catch:{ all -> 0x01e2 }
            f3.t0 r13 = r13.f8457l
            f3.m0$c r10 = f3.m0.c.f8367c     // Catch:{ all -> 0x01e2 }
            r13.c(r5, r10)     // Catch:{ all -> 0x01e2 }
            r10 = r8
            f3.f2$b$b r10 = (f3.f2.b.C0140b) r10     // Catch:{ all -> 0x01e2 }
            Key r10 = r10.f8226b     // Catch:{ all -> 0x01e2 }
            f3.m0$c r11 = f3.m0.c.f8366b
            if (r10 != 0) goto L_0x0142
            r13.c(r4, r11)     // Catch:{ all -> 0x01e2 }
        L_0x0142:
            r10 = r8
            f3.f2$b$b r10 = (f3.f2.b.C0140b) r10     // Catch:{ all -> 0x01e2 }
            Key r10 = r10.f8227c     // Catch:{ all -> 0x01e2 }
            if (r10 != 0) goto L_0x014c
            r13.c(r3, r11)     // Catch:{ all -> 0x01e2 }
        L_0x014c:
            r2.a(r6)
            if (r7 == 0) goto L_0x0192
            f3.q1$a<Key, Value> r7 = r9.f8206l
            kotlinx.coroutines.sync.d r13 = r7.f8458a
            r0.f8214a = r9
            r0.f8215b = r8
            r0.f8216c = r7
            r0.f8217d = r13
            r2 = 5
            r0.C = r2
            java.lang.Object r2 = r13.b(r0)
            if (r2 != r1) goto L_0x0167
            return r1
        L_0x0167:
            r2 = r13
        L_0x0168:
            f3.q1<Key, Value> r13 = r7.f8459b     // Catch:{ all -> 0x018d }
            cg.a r7 = r9.f8205k     // Catch:{ all -> 0x018d }
            r10 = r8
            f3.f2$b$b r10 = (f3.f2.b.C0140b) r10     // Catch:{ all -> 0x018d }
            f3.y0$b r13 = r13.f(r10, r5)     // Catch:{ all -> 0x018d }
            r0.f8214a = r9     // Catch:{ all -> 0x018d }
            r0.f8215b = r8     // Catch:{ all -> 0x018d }
            r0.f8216c = r2     // Catch:{ all -> 0x018d }
            r0.f8217d = r6     // Catch:{ all -> 0x018d }
            r5 = 6
            r0.C = r5     // Catch:{ all -> 0x018d }
            java.lang.Object r13 = r7.t(r13, r0)     // Catch:{ all -> 0x018d }
            if (r13 != r1) goto L_0x0185
            return r1
        L_0x0185:
            r5 = r8
            r7 = r9
        L_0x0187:
            ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x018d }
            r2.a(r6)
            goto L_0x0194
        L_0x018d:
            r13 = move-exception
            r2.a(r6)
            throw r13
        L_0x0192:
            r5 = r8
            r7 = r9
        L_0x0194:
            f3.j2<Key, Value> r13 = r7.f8200f
            if (r13 == 0) goto L_0x0231
            r13 = r5
            f3.f2$b$b r13 = (f3.f2.b.C0140b) r13
            Key r2 = r13.f8226b
            if (r2 == 0) goto L_0x01a3
            Key r13 = r13.f8227c
            if (r13 != 0) goto L_0x0231
        L_0x01a3:
            f3.q1$a<Key, Value> r2 = r7.f8206l
            kotlinx.coroutines.sync.d r13 = r2.f8458a
            r0.f8214a = r7
            r0.f8215b = r5
            r0.f8216c = r2
            r0.f8217d = r13
            r8 = 7
            r0.C = r8
            java.lang.Object r0 = r13.b(r0)
            if (r0 != r1) goto L_0x01b9
            return r1
        L_0x01b9:
            r1 = r13
            r0 = r7
        L_0x01bb:
            f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x01dd }
            f3.h0 r2 = r0.f8203i     // Catch:{ all -> 0x01dd }
            f3.h0$b r2 = r2.f8259a     // Catch:{ all -> 0x01dd }
            f3.v2$a r2 = r2.f8264c     // Catch:{ all -> 0x01dd }
            f3.g2 r13 = r13.a(r2)     // Catch:{ all -> 0x01dd }
            r1.a(r6)
            f3.f2$b$b r5 = (f3.f2.b.C0140b) r5
            Key r1 = r5.f8226b
            f3.j2<Key, Value> r0 = r0.f8200f
            if (r1 != 0) goto L_0x01d5
            r0.c(r4, r13)
        L_0x01d5:
            Key r1 = r5.f8227c
            if (r1 != 0) goto L_0x0231
            r0.c(r3, r13)
            goto L_0x0231
        L_0x01dd:
            r13 = move-exception
            r1.a(r6)
            throw r13
        L_0x01e2:
            r13 = move-exception
            r2.a(r6)
            throw r13
        L_0x01e7:
            boolean r2 = r13 instanceof f3.f2.b.a
            if (r2 == 0) goto L_0x0231
            f3.q1$a<Key, Value> r3 = r7.f8206l
            kotlinx.coroutines.sync.d r2 = r3.f8458a
            r0.f8214a = r7
            r0.f8215b = r13
            r0.f8216c = r3
            r0.f8217d = r2
            r4 = 8
            r0.C = r4
            java.lang.Object r4 = r2.b(r0)
            if (r4 != r1) goto L_0x0202
            return r1
        L_0x0202:
            r4 = r13
        L_0x0203:
            f3.q1<Key, Value> r13 = r3.f8459b     // Catch:{ all -> 0x022c }
            f3.m0$a r3 = new f3.m0$a     // Catch:{ all -> 0x022c }
            f3.f2$b$a r4 = (f3.f2.b.a) r4     // Catch:{ all -> 0x022c }
            java.lang.Throwable r4 = r4.f8224a     // Catch:{ all -> 0x022c }
            r3.<init>(r4)     // Catch:{ all -> 0x022c }
            r0.f8214a = r2     // Catch:{ all -> 0x022c }
            r0.f8215b = r6     // Catch:{ all -> 0x022c }
            r0.f8216c = r6     // Catch:{ all -> 0x022c }
            r0.f8217d = r6     // Catch:{ all -> 0x022c }
            r4 = 9
            r0.C = r4     // Catch:{ all -> 0x022c }
            java.lang.Object r13 = r7.i(r13, r5, r3, r0)     // Catch:{ all -> 0x022c }
            if (r13 != r1) goto L_0x0221
            return r1
        L_0x0221:
            r0 = r2
        L_0x0222:
            ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x0039 }
            r0.a(r6)
            ff.m r13 = ff.m.f8717a
            return r13
        L_0x022a:
            r2 = r0
            goto L_0x022d
        L_0x022c:
            r13 = move-exception
        L_0x022d:
            r2.a(r6)
            throw r13
        L_0x0231:
            ff.m r13 = ff.m.f8717a
            return r13
        L_0x0234:
            r13 = move-exception
            r2.a(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.f1.f(jf.d):java.lang.Object");
    }

    public final f2.a<Key> g(o0 o0Var, Key key) {
        int i8;
        o0 o0Var2 = o0.f8397a;
        w1 w1Var = this.f8197c;
        if (o0Var == o0Var2) {
            i8 = w1Var.f8532c;
        } else {
            w1Var.getClass();
            i8 = 10;
        }
        boolean z10 = w1Var.f8531b;
        j.f(o0Var, "loadType");
        int ordinal = o0Var.ordinal();
        if (ordinal == 0) {
            return new f2.a.c(i8, key, z10);
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new ff.e();
            } else if (key != null) {
                return new f2.a.C0139a(i8, key, z10);
            } else {
                throw new IllegalArgumentException("key cannot be null for append".toString());
            }
        } else if (key != null) {
            return new f2.a.b(i8, key, z10);
        } else {
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
    }

    public final Key h(q1<Key, Value> q1Var, o0 o0Var, int i8, int i10) {
        int i11;
        q1Var.getClass();
        int ordinal = o0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i11 = q1Var.f8452g;
            } else if (ordinal == 2) {
                i11 = q1Var.f8453h;
            } else {
                throw new ff.e();
            }
            if (i8 != i11 || (q1Var.f8457l.a(o0Var) instanceof m0.a) || i10 >= this.f8197c.f8530a) {
                return null;
            }
            o0 o0Var2 = o0.f8398b;
            ArrayList arrayList = q1Var.f8448c;
            return o0Var == o0Var2 ? ((f2.b.C0140b) q.u0(arrayList)).f8226b : ((f2.b.C0140b) q.B0(arrayList)).f8227c;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    public final Object i(q1 q1Var, o0 o0Var, m0.a aVar, lf.c cVar) {
        if (j.a(q1Var.f8457l.a(o0Var), aVar)) {
            return m.f8717a;
        }
        t0 t0Var = q1Var.f8457l;
        t0Var.c(o0Var, aVar);
        Object t2 = this.f8205k.t(new y0.c(t0Var.d(), (n0) null), cVar);
        return t2 == kf.a.f10464a ? t2 : m.f8717a;
    }

    public final Object j(q1 q1Var, o0 o0Var, lf.c cVar) {
        m0 a10 = q1Var.f8457l.a(o0Var);
        m0.b bVar = m0.b.f8365b;
        if (j.a(a10, bVar)) {
            return m.f8717a;
        }
        t0 t0Var = q1Var.f8457l;
        t0Var.c(o0Var, bVar);
        Object t2 = this.f8205k.t(new y0.c(t0Var.d(), (n0) null), cVar);
        return t2 == kf.a.f10464a ? t2 : m.f8717a;
    }
}
