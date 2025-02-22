package x0;

import androidx.fragment.app.z;
import b1.d;
import e1.a;
import e1.g;
import f1.k;
import f1.l;
import h0.e;
import i0.i;
import i0.s;
import sf.j;
import z0.n;
import z0.o;
import z0.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final e1.f f16892a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16893b;

    /* renamed from: c  reason: collision with root package name */
    public final p f16894c;

    /* renamed from: d  reason: collision with root package name */
    public final n f16895d;

    /* renamed from: e  reason: collision with root package name */
    public final o f16896e;

    /* renamed from: f  reason: collision with root package name */
    public final z0.f f16897f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16898g;

    /* renamed from: h  reason: collision with root package name */
    public final long f16899h;

    /* renamed from: i  reason: collision with root package name */
    public final a f16900i;

    /* renamed from: j  reason: collision with root package name */
    public final g f16901j;

    /* renamed from: k  reason: collision with root package name */
    public final d f16902k;

    /* renamed from: l  reason: collision with root package name */
    public final long f16903l;
    public final e1.d m;

    /* renamed from: n  reason: collision with root package name */
    public final s f16904n;

    /* renamed from: o  reason: collision with root package name */
    public final z f16905o;

    public f(e1.f fVar, long j10, p pVar, n nVar, o oVar, z0.f fVar2, String str, long j11, a aVar, g gVar, d dVar, long j12, e1.d dVar2, s sVar, z zVar) {
        this.f16892a = fVar;
        this.f16893b = j10;
        this.f16894c = pVar;
        this.f16895d = nVar;
        this.f16896e = oVar;
        this.f16897f = fVar2;
        this.f16898g = str;
        this.f16899h = j11;
        this.f16900i = aVar;
        this.f16901j = gVar;
        this.f16902k = dVar;
        this.f16903l = j12;
        this.m = dVar2;
        this.f16904n = sVar;
        this.f16905o = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        j.f(fVar, "other");
        if (this == fVar || (k.a(this.f16893b, fVar.f16893b) && j.a(this.f16894c, fVar.f16894c) && j.a(this.f16895d, fVar.f16895d) && j.a(this.f16896e, fVar.f16896e) && j.a(this.f16897f, fVar.f16897f) && j.a(this.f16898g, fVar.f16898g) && k.a(this.f16899h, fVar.f16899h) && j.a(this.f16900i, fVar.f16900i) && j.a(this.f16901j, fVar.f16901j) && j.a(this.f16902k, fVar.f16902k) && i.b(this.f16903l, fVar.f16903l) && j.a((Object) null, (Object) null))) {
            if (j.a(this.f16892a, fVar.f16892a) && j.a(this.m, fVar.m) && j.a(this.f16904n, fVar.f16904n) && j.a(this.f16905o, fVar.f16905o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        e1.f fVar = this.f16892a;
        long a10 = fVar.a();
        int i8 = i.f9377f;
        fVar.b();
        int i10 = 0;
        int hashCode = Float.hashCode(fVar.c());
        l[] lVarArr = k.f8042b;
        int a11 = e.a(this.f16893b, (hashCode + (((Long.hashCode(a10) * 31) + 0) * 31)) * 31, 31);
        p pVar = this.f16894c;
        int hashCode2 = (((((a11 + (pVar != null ? pVar.f17608a : 0)) * 31) + (this.f16895d != null ? Integer.hashCode(0) : 0)) * 31) + (this.f16896e != null ? Integer.hashCode(0) : 0)) * 31;
        z0.f fVar2 = this.f16897f;
        int hashCode3 = (hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        String str = this.f16898g;
        int a12 = e.a(this.f16899h, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
        a aVar = this.f16900i;
        int hashCode4 = (a12 + (aVar != null ? Float.hashCode(aVar.f7766a) : 0)) * 31;
        g gVar = this.f16901j;
        int hashCode5 = (hashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        d dVar = this.f16902k;
        int a13 = e.a(this.f16903l, (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
        e1.d dVar2 = this.m;
        int i11 = (a13 + (dVar2 != null ? dVar2.f7768a : 0)) * 31;
        s sVar = this.f16904n;
        int hashCode6 = (((i11 + (sVar != null ? sVar.hashCode() : 0)) * 31) + 0) * 31;
        z zVar = this.f16905o;
        if (zVar != null) {
            i10 = zVar.hashCode();
        }
        return hashCode6 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        e1.f fVar = this.f16892a;
        sb2.append(i.h(fVar.a()));
        sb2.append(", brush=null, alpha=");
        fVar.b();
        sb2.append(fVar.c());
        sb2.append(", fontSize=");
        sb2.append(k.d(this.f16893b));
        sb2.append(", fontWeight=");
        sb2.append(this.f16894c);
        sb2.append(", fontStyle=");
        sb2.append(this.f16895d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f16896e);
        sb2.append(", fontFamily=");
        sb2.append(this.f16897f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f16898g);
        sb2.append(", letterSpacing=");
        sb2.append(k.d(this.f16899h));
        sb2.append(", baselineShift=");
        sb2.append(this.f16900i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f16901j);
        sb2.append(", localeList=");
        sb2.append(this.f16902k);
        sb2.append(", background=");
        sb2.append(i.h(this.f16903l));
        sb2.append(", textDecoration=");
        sb2.append(this.m);
        sb2.append(", shadow=");
        sb2.append(this.f16904n);
        sb2.append(", platformStyle=null, drawStyle=");
        sb2.append(this.f16905o);
        sb2.append(')');
        return sb2.toString();
    }
}
