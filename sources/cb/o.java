package cb;

import ab.a0;
import ab.b0;
import ab.i;
import bb.c;
import bb.d;
import hb.b;
import java.util.Collections;
import java.util.List;

public final class o implements b0, Cloneable {
    public static final o B = new o();

    /* renamed from: a  reason: collision with root package name */
    public final double f3920a = -1.0d;

    /* renamed from: b  reason: collision with root package name */
    public final int f3921b = 136;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3922c = true;

    /* renamed from: d  reason: collision with root package name */
    public final List<ab.a> f3923d = Collections.emptyList();

    /* renamed from: e  reason: collision with root package name */
    public final List<ab.a> f3924e = Collections.emptyList();

    public class a extends a0<T> {

        /* renamed from: a  reason: collision with root package name */
        public a0<T> f3925a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f3926b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f3927c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f3928d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ gb.a f3929e;

        public a(boolean z10, boolean z11, i iVar, gb.a aVar) {
            this.f3926b = z10;
            this.f3927c = z11;
            this.f3928d = iVar;
            this.f3929e = aVar;
        }

        public final T a(hb.a aVar) {
            if (this.f3926b) {
                aVar.v0();
                return null;
            }
            a0<T> a0Var = this.f3925a;
            if (a0Var == null) {
                a0Var = this.f3928d.d(o.this, this.f3929e);
                this.f3925a = a0Var;
            }
            return a0Var.a(aVar);
        }

        public final void b(b bVar, T t2) {
            if (this.f3927c) {
                bVar.z();
                return;
            }
            a0<T> a0Var = this.f3925a;
            if (a0Var == null) {
                a0Var = this.f3928d.d(o.this, this.f3929e);
                this.f3925a = a0Var;
            }
            a0Var.b(bVar, t2);
        }
    }

    public static boolean g(Class cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if (!((cls.getModifiers() & 8) != 0)) {
            return cls.isAnonymousClass() || cls.isLocalClass();
        }
        return false;
    }

    public final <T> a0<T> a(i iVar, gb.a<T> aVar) {
        Class<? super T> cls = aVar.f8928a;
        boolean b10 = b(cls);
        boolean z10 = b10 || f(cls, true);
        boolean z11 = b10 || f(cls, false);
        if (z10 || z11) {
            return new a(z11, z10, iVar, aVar);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            double r0 = r4.f3920a
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x0020
            java.lang.Class<bb.c> r0 = bb.c.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            bb.c r0 = (bb.c) r0
            java.lang.Class<bb.d> r2 = bb.d.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            bb.d r2 = (bb.d) r2
            boolean r0 = r4.h(r0, r2)
            if (r0 != 0) goto L_0x0020
            return r1
        L_0x0020:
            boolean r0 = r4.f3922c
            r2 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L_0x003a
            int r0 = r5.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0035
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 != 0) goto L_0x003a
            r0 = r1
            goto L_0x003b
        L_0x003a:
            r0 = r2
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r1
        L_0x003e:
            boolean r5 = g(r5)
            if (r5 == 0) goto L_0x0045
            return r1
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.o.b(java.lang.Class):boolean");
    }

    public final Object clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean f(Class<?> cls, boolean z10) {
        for (ab.a a10 : z10 ? this.f3923d : this.f3924e) {
            if (a10.a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(c cVar, d dVar) {
        double d10 = this.f3920a;
        if (!(cVar == null || cVar.value() <= d10)) {
            return false;
        }
        return dVar == null || (dVar.value() > d10 ? 1 : (dVar.value() == d10 ? 0 : -1)) > 0;
    }
}
