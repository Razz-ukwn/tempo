package r4;

import ag.b1;
import java.security.MessageDigest;
import java.util.Map;
import l5.b;
import p4.f;
import p4.h;
import p4.l;

public final class q implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f13970b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13971c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13972d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f13973e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f13974f;

    /* renamed from: g  reason: collision with root package name */
    public final f f13975g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, l<?>> f13976h;

    /* renamed from: i  reason: collision with root package name */
    public final h f13977i;

    /* renamed from: j  reason: collision with root package name */
    public int f13978j;

    public q(Object obj, f fVar, int i8, int i10, b bVar, Class cls, Class cls2, h hVar) {
        b1.b(obj);
        this.f13970b = obj;
        if (fVar != null) {
            this.f13975g = fVar;
            this.f13971c = i8;
            this.f13972d = i10;
            b1.b(bVar);
            this.f13976h = bVar;
            if (cls != null) {
                this.f13973e = cls;
                if (cls2 != null) {
                    this.f13974f = cls2;
                    b1.b(hVar);
                    this.f13977i = hVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13970b.equals(qVar.f13970b) && this.f13975g.equals(qVar.f13975g) && this.f13972d == qVar.f13972d && this.f13971c == qVar.f13971c && this.f13976h.equals(qVar.f13976h) && this.f13973e.equals(qVar.f13973e) && this.f13974f.equals(qVar.f13974f) && this.f13977i.equals(qVar.f13977i);
    }

    public final int hashCode() {
        if (this.f13978j == 0) {
            int hashCode = this.f13970b.hashCode();
            this.f13978j = hashCode;
            int hashCode2 = ((((this.f13975g.hashCode() + (hashCode * 31)) * 31) + this.f13971c) * 31) + this.f13972d;
            this.f13978j = hashCode2;
            int hashCode3 = this.f13976h.hashCode() + (hashCode2 * 31);
            this.f13978j = hashCode3;
            int hashCode4 = this.f13973e.hashCode() + (hashCode3 * 31);
            this.f13978j = hashCode4;
            int hashCode5 = this.f13974f.hashCode() + (hashCode4 * 31);
            this.f13978j = hashCode5;
            this.f13978j = this.f13977i.hashCode() + (hashCode5 * 31);
        }
        return this.f13978j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f13970b + ", width=" + this.f13971c + ", height=" + this.f13972d + ", resourceClass=" + this.f13973e + ", transcodeClass=" + this.f13974f + ", signature=" + this.f13975g + ", hashCode=" + this.f13978j + ", transformations=" + this.f13976h + ", options=" + this.f13977i + '}';
    }
}
