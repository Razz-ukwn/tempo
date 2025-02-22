package androidx.fragment.app;

import androidx.lifecycle.j;
import java.util.ArrayList;

public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f2106a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f2107b;

    /* renamed from: c  reason: collision with root package name */
    public int f2108c;

    /* renamed from: d  reason: collision with root package name */
    public int f2109d;

    /* renamed from: e  reason: collision with root package name */
    public int f2110e;

    /* renamed from: f  reason: collision with root package name */
    public int f2111f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2112g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2113h = true;

    /* renamed from: i  reason: collision with root package name */
    public String f2114i;

    /* renamed from: j  reason: collision with root package name */
    public int f2115j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2116k;

    /* renamed from: l  reason: collision with root package name */
    public int f2117l;
    public CharSequence m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f2118n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f2119o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2120p = false;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2121a;

        /* renamed from: b  reason: collision with root package name */
        public p f2122b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2123c;

        /* renamed from: d  reason: collision with root package name */
        public int f2124d;

        /* renamed from: e  reason: collision with root package name */
        public int f2125e;

        /* renamed from: f  reason: collision with root package name */
        public int f2126f;

        /* renamed from: g  reason: collision with root package name */
        public int f2127g;

        /* renamed from: h  reason: collision with root package name */
        public j.b f2128h;

        /* renamed from: i  reason: collision with root package name */
        public j.b f2129i;

        public a() {
        }

        public a(int i8, p pVar) {
            this.f2121a = i8;
            this.f2122b = pVar;
            this.f2123c = false;
            j.b bVar = j.b.f2281e;
            this.f2128h = bVar;
            this.f2129i = bVar;
        }

        public a(int i8, p pVar, int i10) {
            this.f2121a = i8;
            this.f2122b = pVar;
            this.f2123c = true;
            j.b bVar = j.b.f2281e;
            this.f2128h = bVar;
            this.f2129i = bVar;
        }

        public a(p pVar, j.b bVar) {
            this.f2121a = 10;
            this.f2122b = pVar;
            this.f2123c = false;
            this.f2128h = pVar.f2074k0;
            this.f2129i = bVar;
        }

        public a(a aVar) {
            this.f2121a = aVar.f2121a;
            this.f2122b = aVar.f2122b;
            this.f2123c = aVar.f2123c;
            this.f2124d = aVar.f2124d;
            this.f2125e = aVar.f2125e;
            this.f2126f = aVar.f2126f;
            this.f2127g = aVar.f2127g;
            this.f2128h = aVar.f2128h;
            this.f2129i = aVar.f2129i;
        }
    }

    public final void b(a aVar) {
        this.f2106a.add(aVar);
        aVar.f2124d = this.f2107b;
        aVar.f2125e = this.f2108c;
        aVar.f2126f = this.f2109d;
        aVar.f2127g = this.f2110e;
    }

    public final void c(String str) {
        if (this.f2113h) {
            this.f2112g = true;
            this.f2114i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract void d(int i8, p pVar, String str, int i10);

    public final void e(int i8, p pVar, String str) {
        if (i8 != 0) {
            d(i8, pVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
