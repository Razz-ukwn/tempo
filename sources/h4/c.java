package h4;

import ag.c0;
import android.graphics.Bitmap;
import androidx.lifecycle.j;
import i4.f;
import l4.c;
import q.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final j f9125a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9126b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9127c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f9128d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f9129e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f9130f;

    /* renamed from: g  reason: collision with root package name */
    public final c0 f9131g;

    /* renamed from: h  reason: collision with root package name */
    public final c.a f9132h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9133i;

    /* renamed from: j  reason: collision with root package name */
    public final Bitmap.Config f9134j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f9135k;

    /* renamed from: l  reason: collision with root package name */
    public final Boolean f9136l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9137n;

    /* renamed from: o  reason: collision with root package name */
    public final int f9138o;

    public c(j jVar, f fVar, int i8, c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, c.a aVar, int i10, Bitmap.Config config, Boolean bool, Boolean bool2, int i11, int i12, int i13) {
        this.f9125a = jVar;
        this.f9126b = fVar;
        this.f9127c = i8;
        this.f9128d = c0Var;
        this.f9129e = c0Var2;
        this.f9130f = c0Var3;
        this.f9131g = c0Var4;
        this.f9132h = aVar;
        this.f9133i = i10;
        this.f9134j = config;
        this.f9135k = bool;
        this.f9136l = bool2;
        this.m = i11;
        this.f9137n = i12;
        this.f9138o = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return sf.j.a(this.f9125a, cVar.f9125a) && sf.j.a(this.f9126b, cVar.f9126b) && this.f9127c == cVar.f9127c && sf.j.a(this.f9128d, cVar.f9128d) && sf.j.a(this.f9129e, cVar.f9129e) && sf.j.a(this.f9130f, cVar.f9130f) && sf.j.a(this.f9131g, cVar.f9131g) && sf.j.a(this.f9132h, cVar.f9132h) && this.f9133i == cVar.f9133i && this.f9134j == cVar.f9134j && sf.j.a(this.f9135k, cVar.f9135k) && sf.j.a(this.f9136l, cVar.f9136l) && this.m == cVar.m && this.f9137n == cVar.f9137n && this.f9138o == cVar.f9138o;
        }
    }

    public final int hashCode() {
        int i8 = 0;
        j jVar = this.f9125a;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        f fVar = this.f9126b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        int i10 = this.f9127c;
        int c3 = (hashCode2 + (i10 != 0 ? g.c(i10) : 0)) * 31;
        c0 c0Var = this.f9128d;
        int hashCode3 = (c3 + (c0Var != null ? c0Var.hashCode() : 0)) * 31;
        c0 c0Var2 = this.f9129e;
        int hashCode4 = (hashCode3 + (c0Var2 != null ? c0Var2.hashCode() : 0)) * 31;
        c0 c0Var3 = this.f9130f;
        int hashCode5 = (hashCode4 + (c0Var3 != null ? c0Var3.hashCode() : 0)) * 31;
        c0 c0Var4 = this.f9131g;
        int hashCode6 = (hashCode5 + (c0Var4 != null ? c0Var4.hashCode() : 0)) * 31;
        c.a aVar = this.f9132h;
        int hashCode7 = (hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        int i11 = this.f9133i;
        int c10 = (hashCode7 + (i11 != 0 ? g.c(i11) : 0)) * 31;
        Bitmap.Config config = this.f9134j;
        int hashCode8 = (c10 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f9135k;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f9136l;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        int i12 = this.m;
        int c11 = (hashCode10 + (i12 != 0 ? g.c(i12) : 0)) * 31;
        int i13 = this.f9137n;
        int c12 = (c11 + (i13 != 0 ? g.c(i13) : 0)) * 31;
        int i14 = this.f9138o;
        if (i14 != 0) {
            i8 = g.c(i14);
        }
        return c12 + i8;
    }
}
