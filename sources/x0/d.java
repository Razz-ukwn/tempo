package x0;

import e1.c;
import e1.e;
import e1.h;
import f1.k;
import f1.l;
import sf.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f16832a;

    /* renamed from: b  reason: collision with root package name */
    public final e f16833b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16834c;

    /* renamed from: d  reason: collision with root package name */
    public final h f16835d;

    public d(c cVar, e eVar, long j10, h hVar) {
        this.f16832a = cVar;
        this.f16833b = eVar;
        this.f16834c = j10;
        this.f16835d = hVar;
        if (!k.a(j10, k.f8043c)) {
            if (!(k.c(j10) >= 0.0f)) {
                throw new IllegalStateException(("lineHeight can't be negative (" + k.c(j10) + ')').toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!j.a(this.f16832a, dVar.f16832a) || !j.a(this.f16833b, dVar.f16833b) || !k.a(this.f16834c, dVar.f16834c) || !j.a(this.f16835d, dVar.f16835d)) {
            return false;
        }
        dVar.getClass();
        if (!j.a((Object) null, (Object) null)) {
            return false;
        }
        dVar.getClass();
        if (!j.a((Object) null, (Object) null)) {
            return false;
        }
        dVar.getClass();
        if (!j.a((Object) null, (Object) null)) {
            return false;
        }
        dVar.getClass();
        if (!j.a((Object) null, (Object) null)) {
            return false;
        }
        dVar.getClass();
        return j.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = (this.f16832a != null ? Integer.hashCode(0) : 0) * 31;
        int hashCode2 = this.f16833b != null ? Integer.hashCode(0) : 0;
        l[] lVarArr = k.f8042b;
        int a10 = h0.e.a(this.f16834c, (hashCode + hashCode2) * 31, 31);
        h hVar = this.f16835d;
        return ((((((((((a10 + (hVar != null ? hVar.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + this.f16832a + ", textDirection=" + this.f16833b + ", lineHeight=" + k.d(this.f16834c) + ", textIndent=" + this.f16835d + ", platformStyle=null, lineHeightStyle=null, lineBreak=null, hyphens=null, textMotion=null)";
    }
}
