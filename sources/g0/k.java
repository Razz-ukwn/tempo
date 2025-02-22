package g0;

import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.platform.AndroidComposeView;
import d0.g;
import f1.j;
import ff.e;
import h0.d;
import java.util.ArrayList;
import java.util.List;
import p0.c;
import rf.l;
import s0.i;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final s f8756a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final g f8757b;

    /* renamed from: c  reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f8758c;

    /* renamed from: d  reason: collision with root package name */
    public j f8759d;

    public static final class a extends sf.k implements l<s, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8760a = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            s sVar = (s) obj;
            sf.j.f(sVar, "it");
            return Boolean.valueOf(u.c(sVar));
        }
    }

    public static final class b extends sf.k implements l<s, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f8761a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(s sVar) {
            super(1);
            this.f8761a = sVar;
        }

        public final Object invoke(Object obj) {
            s sVar = (s) obj;
            sf.j.f(sVar, "destination");
            if (sf.j.a(sVar, this.f8761a)) {
                return Boolean.FALSE;
            }
            g.c c3 = i.c(sVar, 1024);
            if (!(c3 instanceof s)) {
                c3 = null;
            }
            if (((s) c3) != null) {
                return Boolean.valueOf(u.c(sVar));
            }
            throw new IllegalStateException("Focus search landed at the root.".toString());
        }
    }

    public k(AndroidComposeView.e eVar) {
        this.f8757b = new g(eVar);
        this.f8758c = new FocusOwnerImpl$modifier$1(this);
    }

    public final void a(j jVar) {
        this.f8759d = jVar;
    }

    public final FocusOwnerImpl$modifier$1 b() {
        return this.f8758c;
    }

    public final boolean c(c cVar) {
        p0.a aVar;
        int i8;
        s a10 = v.a(this.f8756a);
        ArrayList arrayList = null;
        if (a10 != null) {
            g.c c3 = i.c(a10, 16384);
            if (!(c3 instanceof p0.a)) {
                c3 = null;
            }
            aVar = (p0.a) c3;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            ArrayList b10 = i.b(aVar, 16384);
            if (b10 instanceof List) {
                arrayList = b10;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i10 = i8 - 1;
                    if (((p0.a) arrayList.get(i8)).h(cVar)) {
                        return true;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    i8 = i10;
                }
            }
            if (aVar.h(cVar) || aVar.i(cVar)) {
                return true;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (((p0.a) arrayList.get(i11)).i(cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void d() {
        s sVar = this.f8756a;
        if (sVar.G == r.f8780d) {
            r rVar = r.f8777a;
            sVar.getClass();
            sVar.G = rVar;
        }
    }

    public final void e(boolean z10, boolean z11) {
        r rVar;
        s sVar = this.f8756a;
        r rVar2 = sVar.G;
        if (u.a(sVar, z10, z11)) {
            int ordinal = rVar2.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                rVar = r.f8777a;
            } else if (ordinal == 3) {
                rVar = r.f8780d;
            } else {
                throw new e();
            }
            sVar.getClass();
            sVar.G = rVar;
        }
    }

    public final void f(s sVar) {
        sf.j.f(sVar, "node");
        g gVar = this.f8757b;
        gVar.getClass();
        gVar.a(gVar.f8752b, sVar);
    }

    public final d g() {
        s a10 = v.a(this.f8756a);
        if (a10 != null) {
            return v.b(a10);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:194:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            g0.s r2 = r0.f8756a
            g0.s r3 = g0.v.a(r2)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            f1.j r5 = r0.f8759d
            java.lang.String r6 = "layoutDirection"
            if (r5 == 0) goto L_0x0250
            g0.m r8 = r3.C()
            r9 = 1
            if (r1 != r9) goto L_0x001d
            r10 = r9
            goto L_0x001e
        L_0x001d:
            r10 = r4
        L_0x001e:
            r11 = 8
            r12 = 7
            r13 = 4
            r14 = 6
            r15 = 5
            r7 = 3
            r4 = 2
            if (r10 == 0) goto L_0x002c
            g0.o r5 = r8.f8762a
            goto L_0x00bc
        L_0x002c:
            if (r1 != r4) goto L_0x0030
            r10 = r9
            goto L_0x0031
        L_0x0030:
            r10 = 0
        L_0x0031:
            if (r10 == 0) goto L_0x0037
            g0.o r5 = r8.f8763b
            goto L_0x00bc
        L_0x0037:
            if (r1 != r15) goto L_0x003b
            r10 = r9
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x0042
            g0.o r5 = r8.f8764c
            goto L_0x00bc
        L_0x0042:
            if (r1 != r14) goto L_0x0046
            r10 = r9
            goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            if (r10 == 0) goto L_0x004d
            g0.o r5 = r8.f8765d
            goto L_0x00bc
        L_0x004d:
            if (r1 != r7) goto L_0x0051
            r10 = r9
            goto L_0x0052
        L_0x0051:
            r10 = 0
        L_0x0052:
            g0.o r14 = r8.f8769h
            g0.o r15 = r8.f8768g
            if (r10 == 0) goto L_0x0078
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0067
            if (r5 != r9) goto L_0x0061
            goto L_0x0068
        L_0x0061:
            ff.e r1 = new ff.e
            r1.<init>()
            throw r1
        L_0x0067:
            r14 = r15
        L_0x0068:
            g0.o r5 = g0.o.f8774b
            boolean r5 = sf.j.a(r14, r5)
            if (r5 != 0) goto L_0x0072
            r5 = r14
            goto L_0x0073
        L_0x0072:
            r5 = 0
        L_0x0073:
            if (r5 != 0) goto L_0x00bc
            g0.o r5 = r8.f8766e
            goto L_0x00bc
        L_0x0078:
            if (r1 != r13) goto L_0x007c
            r10 = r9
            goto L_0x007d
        L_0x007c:
            r10 = 0
        L_0x007d:
            if (r10 == 0) goto L_0x009f
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x008f
            if (r5 != r9) goto L_0x0089
            r14 = r15
            goto L_0x008f
        L_0x0089:
            ff.e r1 = new ff.e
            r1.<init>()
            throw r1
        L_0x008f:
            g0.o r5 = g0.o.f8774b
            boolean r5 = sf.j.a(r14, r5)
            if (r5 != 0) goto L_0x0099
            r5 = r14
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            if (r5 != 0) goto L_0x00bc
            g0.o r5 = r8.f8767f
            goto L_0x00bc
        L_0x009f:
            if (r1 != r12) goto L_0x00a3
            r5 = r9
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 == 0) goto L_0x00ae
            g0.m$a r5 = r8.f8770i
            r5.getClass()
            g0.o r5 = g0.o.f8774b
            goto L_0x00bc
        L_0x00ae:
            if (r1 != r11) goto L_0x00b2
            r5 = r9
            goto L_0x00b3
        L_0x00b2:
            r5 = 0
        L_0x00b3:
            if (r5 == 0) goto L_0x0244
            g0.m$b r5 = r8.f8771j
            r5.getClass()
            g0.o r5 = g0.o.f8774b
        L_0x00bc:
            g0.o r8 = g0.o.f8775c
            boolean r8 = sf.j.a(r5, r8)
            if (r8 == 0) goto L_0x00c6
            r8 = 0
            return r8
        L_0x00c6:
            g0.o r8 = g0.o.f8774b
            boolean r8 = sf.j.a(r5, r8)
            if (r8 == 0) goto L_0x023d
            f1.j r5 = r0.f8759d
            if (r5 == 0) goto L_0x0238
            g0.k$b r6 = new g0.k$b
            r6.<init>(r3)
            if (r1 != r9) goto L_0x00db
            r8 = r9
            goto L_0x00dc
        L_0x00db:
            r8 = 0
        L_0x00dc:
            if (r8 == 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            if (r1 != r4) goto L_0x00e3
        L_0x00e1:
            r8 = r9
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            if (r8 == 0) goto L_0x010c
            if (r1 != r9) goto L_0x00ea
            r8 = r9
            goto L_0x00eb
        L_0x00ea:
            r8 = 0
        L_0x00eb:
            if (r8 == 0) goto L_0x00f3
            boolean r8 = g0.x.b(r2, r6)
            goto L_0x01ce
        L_0x00f3:
            if (r1 != r4) goto L_0x00f7
            r8 = r9
            goto L_0x00f8
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            if (r8 == 0) goto L_0x0100
            boolean r8 = g0.x.a(r2, r6)
            goto L_0x01ce
        L_0x0100:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This function should only be used for 1-D focus search"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x010c:
            if (r1 != r7) goto L_0x0110
            r8 = r9
            goto L_0x0111
        L_0x0110:
            r8 = 0
        L_0x0111:
            if (r8 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            if (r1 != r13) goto L_0x0118
        L_0x0116:
            r8 = r9
            goto L_0x0119
        L_0x0118:
            r8 = 0
        L_0x0119:
            if (r8 == 0) goto L_0x011c
            goto L_0x011f
        L_0x011c:
            r3 = 5
            if (r1 != r3) goto L_0x0121
        L_0x011f:
            r8 = r9
            goto L_0x0122
        L_0x0121:
            r8 = 0
        L_0x0122:
            if (r8 == 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r3 = 6
            if (r1 != r3) goto L_0x012a
        L_0x0128:
            r8 = r9
            goto L_0x012b
        L_0x012a:
            r8 = 0
        L_0x012b:
            if (r8 == 0) goto L_0x0139
            java.lang.Boolean r3 = com.google.android.gms.internal.p000firebaseauthapi.gf.m(r2, r1, r6)
            if (r3 == 0) goto L_0x01cd
            boolean r8 = r3.booleanValue()
            goto L_0x01ce
        L_0x0139:
            if (r1 != r12) goto L_0x013d
            r8 = r9
            goto L_0x013e
        L_0x013d:
            r8 = 0
        L_0x013e:
            if (r8 == 0) goto L_0x0162
            int r3 = r5.ordinal()
            if (r3 == 0) goto L_0x0150
            if (r3 != r9) goto L_0x014a
            r13 = r7
            goto L_0x0150
        L_0x014a:
            ff.e r1 = new ff.e
            r1.<init>()
            throw r1
        L_0x0150:
            g0.s r3 = g0.v.a(r2)
            if (r3 == 0) goto L_0x01cd
            java.lang.Boolean r3 = com.google.android.gms.internal.p000firebaseauthapi.gf.m(r3, r13, r6)
            if (r3 == 0) goto L_0x01cd
            boolean r8 = r3.booleanValue()
            goto L_0x01ce
        L_0x0162:
            if (r1 != r11) goto L_0x0166
            r8 = r9
            goto L_0x0167
        L_0x0166:
            r8 = 0
        L_0x0167:
            if (r8 == 0) goto L_0x021c
            g0.s r3 = g0.v.a(r2)
            if (r3 == 0) goto L_0x01b8
            d0.g$c r5 = r3.f7177a
            boolean r8 = r5.F
            if (r8 == 0) goto L_0x01ac
            d0.g$c r5 = r5.f7180d
            s0.a0 r3 = s0.i.e(r3)
        L_0x017b:
            if (r3 == 0) goto L_0x01b8
            s0.p0 r8 = r3.V
            d0.g$c r8 = r8.f14404e
            int r8 = r8.f7179c
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x019d
        L_0x0187:
            if (r5 == 0) goto L_0x019d
            int r8 = r5.f7178b
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x019a
            boolean r8 = r5 instanceof g0.s
            if (r8 == 0) goto L_0x019a
            r3 = r5
            g0.s r3 = (g0.s) r3
            r3.C()
            goto L_0x01b9
        L_0x019a:
            d0.g$c r5 = r5.f7180d
            goto L_0x0187
        L_0x019d:
            s0.a0 r3 = r3.q()
            if (r3 == 0) goto L_0x01aa
            s0.p0 r5 = r3.V
            if (r5 == 0) goto L_0x01aa
            s0.r$a r5 = r5.f14403d
            goto L_0x017b
        L_0x01aa:
            r5 = 0
            goto L_0x017b
        L_0x01ac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b8:
            r3 = 0
        L_0x01b9:
            if (r3 == 0) goto L_0x01cd
            boolean r5 = sf.j.a(r3, r2)
            if (r5 == 0) goto L_0x01c2
            goto L_0x01cd
        L_0x01c2:
            java.lang.Object r3 = r6.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = r3.booleanValue()
            goto L_0x01ce
        L_0x01cd:
            r8 = 0
        L_0x01ce:
            if (r8 != 0) goto L_0x021a
            g0.r r3 = r2.G
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x01e6
            if (r3 == r9) goto L_0x01e6
            if (r3 == r4) goto L_0x01e6
            if (r3 != r7) goto L_0x01e0
            r8 = 0
            goto L_0x01e7
        L_0x01e0:
            ff.e r1 = new ff.e
            r1.<init>()
            throw r1
        L_0x01e6:
            r8 = r9
        L_0x01e7:
            if (r8 == 0) goto L_0x0213
            g0.r r3 = r2.G
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x01f2
            goto L_0x0213
        L_0x01f2:
            if (r1 != r9) goto L_0x01f6
            r8 = r9
            goto L_0x01f7
        L_0x01f6:
            r8 = 0
        L_0x01f7:
            if (r8 == 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            if (r1 != r4) goto L_0x01fe
        L_0x01fc:
            r8 = r9
            goto L_0x01ff
        L_0x01fe:
            r8 = 0
        L_0x01ff:
            if (r8 == 0) goto L_0x0213
            r8 = 0
            r0.e(r8, r9)
            g0.r r2 = r2.G
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x020e
            goto L_0x0214
        L_0x020e:
            boolean r1 = r16.h(r17)
            goto L_0x0215
        L_0x0213:
            r8 = 0
        L_0x0214:
            r1 = r8
        L_0x0215:
            if (r1 == 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            r4 = r8
            goto L_0x021b
        L_0x021a:
            r4 = r9
        L_0x021b:
            return r4
        L_0x021c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Focus search invoked with invalid FocusDirection "
            r3.<init>(r4)
            java.lang.String r1 = g0.b.a(r17)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0238:
            sf.j.l(r6)
            r1 = 0
            throw r1
        L_0x023d:
            g0.k$a r1 = g0.k.a.f8760a
            boolean r1 = r5.a(r1)
            return r1
        L_0x0244:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "invalid FocusDirection"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0250:
            r1 = 0
            sf.j.l(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.h(int):boolean");
    }

    public final void i() {
        u.a(this.f8756a, true, true);
    }

    public final void j(d dVar) {
        sf.j.f(dVar, "node");
        g gVar = this.f8757b;
        gVar.getClass();
        gVar.a(gVar.f8753c, dVar);
    }

    public final void k(boolean z10) {
        e(z10, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(android.view.KeyEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "keyEvent"
            sf.j.f(r10, r0)
            g0.s r0 = r9.f8756a
            g0.s r0 = g0.v.a(r0)
            if (r0 == 0) goto L_0x00b6
            d0.g$c r1 = r0.f7177a
            boolean r2 = r1.F
            java.lang.String r3 = "Check failed."
            if (r2 == 0) goto L_0x00ac
            int r2 = r1.f7179c
            r2 = r2 & 9216(0x2400, float:1.2914E-41)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0048
            d0.g$c r1 = r1.f7181e
            r2 = r6
        L_0x0021:
            if (r1 == 0) goto L_0x0049
            int r7 = r1.f7178b
            r8 = r7 & 9216(0x2400, float:1.2914E-41)
            if (r8 == 0) goto L_0x0045
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x002f
            r7 = r4
            goto L_0x0030
        L_0x002f:
            r7 = r5
        L_0x0030:
            if (r7 == 0) goto L_0x0035
            n0.d r2 = (n0.d) r2
            goto L_0x004b
        L_0x0035:
            boolean r2 = r1 instanceof n0.d
            if (r2 == 0) goto L_0x003b
            r2 = r1
            goto L_0x0045
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = r3.toString()
            r10.<init>(r0)
            throw r10
        L_0x0045:
            d0.g$c r1 = r1.f7181e
            goto L_0x0021
        L_0x0048:
            r2 = r6
        L_0x0049:
            n0.d r2 = (n0.d) r2
        L_0x004b:
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r2 != 0) goto L_0x005b
            d0.g$c r0 = s0.i.c(r0, r1)
            boolean r2 = r0 instanceof n0.d
            if (r2 != 0) goto L_0x0058
            r0 = r6
        L_0x0058:
            r2 = r0
            n0.d r2 = (n0.d) r2
        L_0x005b:
            if (r2 == 0) goto L_0x00ab
            java.util.ArrayList r0 = s0.i.b(r2, r1)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x0066
            r6 = r0
        L_0x0066:
            if (r6 == 0) goto L_0x0084
            int r0 = r6.size()
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0084
        L_0x0070:
            int r1 = r0 + -1
            java.lang.Object r0 = r6.get(r0)
            n0.d r0 = (n0.d) r0
            boolean r0 = r0.a(r10)
            if (r0 == 0) goto L_0x007f
            return r4
        L_0x007f:
            if (r1 >= 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r0 = r1
            goto L_0x0070
        L_0x0084:
            boolean r0 = r2.a(r10)
            if (r0 == 0) goto L_0x008b
            return r4
        L_0x008b:
            boolean r0 = r2.k(r10)
            if (r0 == 0) goto L_0x0092
            return r4
        L_0x0092:
            if (r6 == 0) goto L_0x00ab
            int r0 = r6.size()
            r1 = r5
        L_0x0099:
            if (r1 >= r0) goto L_0x00ab
            java.lang.Object r2 = r6.get(r1)
            n0.d r2 = (n0.d) r2
            boolean r2 = r2.k(r10)
            if (r2 == 0) goto L_0x00a8
            return r4
        L_0x00a8:
            int r1 = r1 + 1
            goto L_0x0099
        L_0x00ab:
            return r5
        L_0x00ac:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = r3.toString()
            r10.<init>(r0)
            throw r10
        L_0x00b6:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Event can't be processed because we do not have an active focus target."
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.k.l(android.view.KeyEvent):boolean");
    }
}
