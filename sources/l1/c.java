package l1;

import j1.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m1.i;
import m1.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f10826a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f10827b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10828c;

    /* renamed from: d  reason: collision with root package name */
    public final d f10829d;

    /* renamed from: e  reason: collision with root package name */
    public final a f10830e;

    /* renamed from: f  reason: collision with root package name */
    public c f10831f;

    /* renamed from: g  reason: collision with root package name */
    public int f10832g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f10833h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public g f10834i;

    public enum a {
        f10835a,
        f10836b,
        f10837c,
        f10838d,
        f10839e,
        B,
        C,
        D;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public c(d dVar, a aVar) {
        this.f10829d = dVar;
        this.f10830e = aVar;
    }

    public final void a(c cVar, int i8) {
        b(cVar, i8, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i8, int i10, boolean z10) {
        if (cVar == null) {
            j();
            return true;
        } else if (!z10 && !i(cVar)) {
            return false;
        } else {
            this.f10831f = cVar;
            if (cVar.f10826a == null) {
                cVar.f10826a = new HashSet<>();
            }
            HashSet<c> hashSet = this.f10831f.f10826a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f10832g = i8;
            this.f10833h = i10;
            return true;
        }
    }

    public final void c(int i8, o oVar, ArrayList arrayList) {
        HashSet<c> hashSet = this.f10826a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f10829d, i8, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.f10828c) {
            return 0;
        }
        return this.f10827b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2 = r3.f10831f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r3 = this;
            l1.d r0 = r3.f10829d
            int r0 = r0.f10859j0
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r3.f10833h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x001b
            l1.c r2 = r3.f10831f
            if (r2 == 0) goto L_0x001b
            l1.d r2 = r2.f10829d
            int r2 = r2.f10859j0
            if (r2 != r1) goto L_0x001b
            return r0
        L_0x001b:
            int r0 = r3.f10832g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.e():int");
    }

    public final c f() {
        a aVar = this.f10830e;
        int ordinal = aVar.ordinal();
        d dVar = this.f10829d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.M;
            case 2:
                return dVar.N;
            case 3:
                return dVar.K;
            case 4:
                return dVar.L;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final boolean g() {
        HashSet<c> hashSet = this.f10826a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f10831f != null;
    }

    public final boolean i(c cVar) {
        boolean z10 = false;
        if (cVar == null) {
            return false;
        }
        a aVar = a.f10839e;
        a aVar2 = this.f10830e;
        d dVar = cVar.f10829d;
        a aVar3 = cVar.f10830e;
        if (aVar3 == aVar2) {
            return aVar2 != aVar || (dVar.F && this.f10829d.F);
        }
        int ordinal = aVar2.ordinal();
        a aVar4 = a.D;
        a aVar5 = a.f10837c;
        a aVar6 = a.C;
        a aVar7 = a.f10835a;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z11 = aVar3 == aVar7 || aVar3 == aVar5;
                if (!(dVar instanceof g)) {
                    return z11;
                }
                if (z11 || aVar3 == aVar6) {
                    z10 = true;
                }
                return z10;
            case 2:
            case 4:
                boolean z12 = aVar3 == a.f10836b || aVar3 == a.f10838d;
                if (!(dVar instanceof g)) {
                    return z12;
                }
                if (z12 || aVar3 == aVar4) {
                    z10 = true;
                }
                return z10;
            case 5:
                return (aVar3 == aVar7 || aVar3 == aVar5) ? false : true;
            case 6:
                return (aVar3 == aVar || aVar3 == aVar6 || aVar3 == aVar4) ? false : true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    public final void j() {
        HashSet<c> hashSet;
        c cVar = this.f10831f;
        if (!(cVar == null || (hashSet = cVar.f10826a) == null)) {
            hashSet.remove(this);
            if (this.f10831f.f10826a.size() == 0) {
                this.f10831f.f10826a = null;
            }
        }
        this.f10826a = null;
        this.f10831f = null;
        this.f10832g = 0;
        this.f10833h = Integer.MIN_VALUE;
        this.f10828c = false;
        this.f10827b = 0;
    }

    public final void k() {
        g gVar = this.f10834i;
        if (gVar == null) {
            this.f10834i = new g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i8) {
        this.f10827b = i8;
        this.f10828c = true;
    }

    public final String toString() {
        return this.f10829d.f10861k0 + ":" + this.f10830e.toString();
    }
}
