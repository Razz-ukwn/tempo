package sf;

import java.io.Serializable;

public abstract class b implements xf.a, Serializable {
    public final boolean B;

    /* renamed from: a  reason: collision with root package name */
    public transient xf.a f14943a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14944b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f14945c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14946d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14947e;

    public static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14948a = new a();
    }

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f14944b = obj;
        this.f14945c = cls;
        this.f14946d = str;
        this.f14947e = str2;
        this.B = z10;
    }

    public final xf.a a() {
        xf.a aVar = this.f14943a;
        if (aVar != null) {
            return aVar;
        }
        xf.a b10 = b();
        this.f14943a = b10;
        return b10;
    }

    public abstract xf.a b();

    public final c c() {
        Class cls = this.f14945c;
        if (cls == null) {
            return null;
        }
        if (!this.B) {
            return w.a(cls);
        }
        w.f14958a.getClass();
        return new o(cls);
    }
}
