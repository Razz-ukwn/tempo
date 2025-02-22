package s0;

import d2.f1;
import ff.m;
import gf.y;
import h0.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import q0.b;
import q0.e;
import rf.l;
import sf.j;
import sf.k;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f14296a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14297b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14298c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14299d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14300e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14301f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14302g;

    /* renamed from: h  reason: collision with root package name */
    public b f14303h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f14304i = new HashMap();

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    public static final class C0268a extends k implements l<b, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f14305a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0268a(a aVar) {
            super(1);
            this.f14305a = aVar;
        }

        public final Object invoke(Object obj) {
            a aVar;
            b bVar = (b) obj;
            j.f(bVar, "childOwner");
            if (bVar.t()) {
                if (bVar.c().f14297b) {
                    bVar.s();
                }
                Iterator it = bVar.c().f14304i.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    aVar = this.f14305a;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    a.a(aVar, (q0.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.b());
                }
                s0 s0Var = bVar.b().E;
                j.c(s0Var);
                while (!j.a(s0Var, aVar.f14296a.b())) {
                    for (q0.a aVar2 : aVar.c(s0Var).keySet()) {
                        a.a(aVar, aVar2, aVar.d(s0Var, aVar2), s0Var);
                    }
                    s0Var = s0Var.E;
                    j.c(s0Var);
                }
            }
            return m.f8717a;
        }
    }

    public a(b bVar) {
        this.f14296a = bVar;
    }

    public static final void a(a aVar, q0.a aVar2, int i8, s0 s0Var) {
        aVar.getClass();
        float f10 = (float) i8;
        long f11 = f1.f(f10, f10);
        while (true) {
            f11 = aVar.b(s0Var, f11);
            s0Var = s0Var.E;
            j.c(s0Var);
            if (j.a(s0Var, aVar.f14296a.b())) {
                break;
            } else if (aVar.c(s0Var).containsKey(aVar2)) {
                float d10 = (float) aVar.d(s0Var, aVar2);
                f11 = f1.f(d10, d10);
            }
        }
        int g10 = aVar2 instanceof e ? q4.a.g(c.c(f11)) : q4.a.g(c.b(f11));
        HashMap hashMap = aVar.f14304i;
        if (!hashMap.containsKey(aVar2)) {
            hashMap.put(aVar2, Integer.valueOf(g10));
            return;
        }
        ((Number) y.R(aVar2, hashMap)).intValue();
        int i10 = b.f12798a;
        j.f(aVar2, "<this>");
        throw null;
    }

    public abstract long b(s0 s0Var, long j10);

    public abstract Map<q0.a, Integer> c(s0 s0Var);

    public abstract int d(s0 s0Var, q0.a aVar);

    public final boolean e() {
        return this.f14298c || this.f14300e || this.f14301f || this.f14302g;
    }

    public final boolean f() {
        i();
        return this.f14303h != null;
    }

    public final void g() {
        this.f14297b = true;
        b bVar = this.f14296a;
        b h3 = bVar.h();
        if (h3 != null) {
            if (this.f14298c) {
                h3.A();
            } else if (this.f14300e || this.f14299d) {
                h3.requestLayout();
            }
            if (this.f14301f) {
                bVar.A();
            }
            if (this.f14302g) {
                h3.requestLayout();
            }
            h3.c().g();
        }
    }

    public final void h() {
        HashMap hashMap = this.f14304i;
        hashMap.clear();
        C0268a aVar = new C0268a(this);
        b bVar = this.f14296a;
        bVar.y(aVar);
        hashMap.putAll(c(bVar.b()));
        this.f14297b = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            s0.b r1 = r2.f14296a
            if (r0 == 0) goto L_0x0009
            goto L_0x0051
        L_0x0009:
            s0.b r0 = r1.h()
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            s0.a r0 = r0.c()
            s0.b r1 = r0.f14303h
            if (r1 == 0) goto L_0x0023
            s0.a r0 = r1.c()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0023
            goto L_0x0051
        L_0x0023:
            s0.b r0 = r2.f14303h
            if (r0 == 0) goto L_0x0053
            s0.a r1 = r0.c()
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0032
            goto L_0x0053
        L_0x0032:
            s0.b r1 = r0.h()
            if (r1 == 0) goto L_0x0041
            s0.a r1 = r1.c()
            if (r1 == 0) goto L_0x0041
            r1.i()
        L_0x0041:
            s0.b r0 = r0.h()
            if (r0 == 0) goto L_0x0050
            s0.a r0 = r0.c()
            if (r0 == 0) goto L_0x0050
            s0.b r1 = r0.f14303h
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            r2.f14303h = r1
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.i():void");
    }
}
