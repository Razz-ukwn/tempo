package f3;

import androidx.recyclerview.widget.k;

public final class w0 extends k.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0<Object> f8525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0<Object> f8526b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k.e<Object> f8527c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8528d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f8529e;

    public w0(v0<Object> v0Var, v0<Object> v0Var2, k.e<Object> eVar, int i8, int i10) {
        this.f8525a = v0Var;
        this.f8526b = v0Var2;
        this.f8527c = eVar;
        this.f8528d = i8;
        this.f8529e = i10;
    }

    public final boolean a(int i8, int i10) {
        Object e10 = this.f8525a.e(i8);
        Object e11 = this.f8526b.e(i10);
        if (e10 == e11) {
            return true;
        }
        return this.f8527c.a(e10, e11);
    }

    public final boolean b(int i8, int i10) {
        Object e10 = this.f8525a.e(i8);
        Object e11 = this.f8526b.e(i10);
        if (e10 == e11) {
            return true;
        }
        return this.f8527c.b(e10, e11);
    }

    public final Object c(int i8, int i10) {
        if (this.f8525a.e(i8) == this.f8526b.e(i10)) {
            return Boolean.TRUE;
        }
        this.f8527c.getClass();
        return null;
    }

    public final int d() {
        return this.f8529e;
    }

    public final int e() {
        return this.f8528d;
    }
}
