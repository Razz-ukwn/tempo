package og;

import java.util.List;
import jg.c0;
import jg.s;
import jg.x;
import ng.b;
import ng.d;
import ng.e;
import sf.j;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final d f12365a;

    /* renamed from: b  reason: collision with root package name */
    public final List<s> f12366b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12367c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12368d;

    /* renamed from: e  reason: collision with root package name */
    public final x f12369e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12370f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12371g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12372h;

    /* renamed from: i  reason: collision with root package name */
    public int f12373i;

    public f(d dVar, List<? extends s> list, int i8, b bVar, x xVar, int i10, int i11, int i12) {
        j.f(dVar, "call");
        j.f(list, "interceptors");
        j.f(xVar, "request");
        this.f12365a = dVar;
        this.f12366b = list;
        this.f12367c = i8;
        this.f12368d = bVar;
        this.f12369e = xVar;
        this.f12370f = i10;
        this.f12371g = i11;
        this.f12372h = i12;
    }

    public static f b(f fVar, int i8, b bVar, x xVar, int i10) {
        if ((i10 & 1) != 0) {
            i8 = fVar.f12367c;
        }
        int i11 = i8;
        if ((i10 & 2) != 0) {
            bVar = fVar.f12368d;
        }
        b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            xVar = fVar.f12369e;
        }
        x xVar2 = xVar;
        int i12 = (i10 & 8) != 0 ? fVar.f12370f : 0;
        int i13 = (i10 & 16) != 0 ? fVar.f12371g : 0;
        int i14 = (i10 & 32) != 0 ? fVar.f12372h : 0;
        fVar.getClass();
        j.f(xVar2, "request");
        return new f(fVar.f12365a, fVar.f12366b, i11, bVar2, xVar2, i12, i13, i14);
    }

    public final e a() {
        b bVar = this.f12368d;
        if (bVar == null) {
            return null;
        }
        return bVar.f11928f;
    }

    public final c0 c(x xVar) {
        j.f(xVar, "request");
        List<s> list = this.f12366b;
        int size = list.size();
        boolean z10 = false;
        int i8 = this.f12367c;
        if (i8 < size) {
            this.f12373i++;
            b bVar = this.f12368d;
            if (bVar != null) {
                if (bVar.f11925c.b(xVar.f10219a)) {
                    if (!(this.f12373i == 1)) {
                        throw new IllegalStateException(("network interceptor " + list.get(i8 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i8 - 1) + " must retain the same host and port").toString());
                }
            }
            int i10 = i8 + 1;
            f b10 = b(this, i10, (b) null, xVar, 58);
            s sVar = list.get(i8);
            c0 a10 = sVar.a(b10);
            if (a10 != null) {
                if (bVar != null) {
                    if (!(i10 >= list.size() || b10.f12373i == 1)) {
                        throw new IllegalStateException(("network interceptor " + sVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.C != null) {
                    z10 = true;
                }
                if (z10) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + sVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
