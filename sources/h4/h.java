package h4;

import ag.c0;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import b4.h;
import coil.target.ImageViewTarget;
import f4.b;
import ff.g;
import gf.s;
import gf.y;
import h4.m;
import i4.d;
import i4.f;
import java.util.LinkedHashMap;
import java.util.List;
import jg.q;
import l4.a;
import l4.c;
import m4.c;
import y3.e;

public final class h {
    public final j A;
    public final f B;
    public final int C;
    public final m D;
    public final b.a E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final c L;
    public final b M;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9144a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9145b;

    /* renamed from: c  reason: collision with root package name */
    public final j4.a f9146c;

    /* renamed from: d  reason: collision with root package name */
    public final b f9147d;

    /* renamed from: e  reason: collision with root package name */
    public final b.a f9148e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9149f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f9150g;

    /* renamed from: h  reason: collision with root package name */
    public final ColorSpace f9151h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9152i;

    /* renamed from: j  reason: collision with root package name */
    public final g<h.a<?>, Class<?>> f9153j;

    /* renamed from: k  reason: collision with root package name */
    public final e.a f9154k;

    /* renamed from: l  reason: collision with root package name */
    public final List<k4.b> f9155l;
    public final c.a m;

    /* renamed from: n  reason: collision with root package name */
    public final q f9156n;

    /* renamed from: o  reason: collision with root package name */
    public final o f9157o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f9158p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f9159q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f9160r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9161s;

    /* renamed from: t  reason: collision with root package name */
    public final int f9162t;

    /* renamed from: u  reason: collision with root package name */
    public final int f9163u;

    /* renamed from: v  reason: collision with root package name */
    public final int f9164v;

    /* renamed from: w  reason: collision with root package name */
    public final c0 f9165w;

    /* renamed from: x  reason: collision with root package name */
    public final c0 f9166x;

    /* renamed from: y  reason: collision with root package name */
    public final c0 f9167y;

    /* renamed from: z  reason: collision with root package name */
    public final c0 f9168z;

    public interface b {
        void a();

        void b();

        void c();

        void onCancel();
    }

    public h() {
        throw null;
    }

    public h(Context context, Object obj, j4.a aVar, b bVar, b.a aVar2, String str, Bitmap.Config config, ColorSpace colorSpace, int i8, g gVar, e.a aVar3, List list, c.a aVar4, q qVar, o oVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, c0 c0Var, c0 c0Var2, c0 c0Var3, c0 c0Var4, j jVar, f fVar, int i13, m mVar, b.a aVar5, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, c cVar, b bVar2) {
        this.f9144a = context;
        this.f9145b = obj;
        this.f9146c = aVar;
        this.f9147d = bVar;
        this.f9148e = aVar2;
        this.f9149f = str;
        this.f9150g = config;
        this.f9151h = colorSpace;
        this.f9152i = i8;
        this.f9153j = gVar;
        this.f9154k = aVar3;
        this.f9155l = list;
        this.m = aVar4;
        this.f9156n = qVar;
        this.f9157o = oVar;
        this.f9158p = z10;
        this.f9159q = z11;
        this.f9160r = z12;
        this.f9161s = z13;
        this.f9162t = i10;
        this.f9163u = i11;
        this.f9164v = i12;
        this.f9165w = c0Var;
        this.f9166x = c0Var2;
        this.f9167y = c0Var3;
        this.f9168z = c0Var4;
        this.A = jVar;
        this.B = fVar;
        this.C = i13;
        this.D = mVar;
        this.E = aVar5;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = cVar;
        this.M = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return sf.j.a(this.f9144a, hVar.f9144a) && sf.j.a(this.f9145b, hVar.f9145b) && sf.j.a(this.f9146c, hVar.f9146c) && sf.j.a(this.f9147d, hVar.f9147d) && sf.j.a(this.f9148e, hVar.f9148e) && sf.j.a(this.f9149f, hVar.f9149f) && this.f9150g == hVar.f9150g && sf.j.a(this.f9151h, hVar.f9151h) && this.f9152i == hVar.f9152i && sf.j.a(this.f9153j, hVar.f9153j) && sf.j.a(this.f9154k, hVar.f9154k) && sf.j.a(this.f9155l, hVar.f9155l) && sf.j.a(this.m, hVar.m) && sf.j.a(this.f9156n, hVar.f9156n) && sf.j.a(this.f9157o, hVar.f9157o) && this.f9158p == hVar.f9158p && this.f9159q == hVar.f9159q && this.f9160r == hVar.f9160r && this.f9161s == hVar.f9161s && this.f9162t == hVar.f9162t && this.f9163u == hVar.f9163u && this.f9164v == hVar.f9164v && sf.j.a(this.f9165w, hVar.f9165w) && sf.j.a(this.f9166x, hVar.f9166x) && sf.j.a(this.f9167y, hVar.f9167y) && sf.j.a(this.f9168z, hVar.f9168z) && sf.j.a(this.E, hVar.E) && sf.j.a(this.F, hVar.F) && sf.j.a(this.G, hVar.G) && sf.j.a(this.H, hVar.H) && sf.j.a(this.I, hVar.I) && sf.j.a(this.J, hVar.J) && sf.j.a(this.K, hVar.K) && sf.j.a(this.A, hVar.A) && sf.j.a(this.B, hVar.B) && this.C == hVar.C && sf.j.a(this.D, hVar.D) && sf.j.a(this.L, hVar.L) && sf.j.a(this.M, hVar.M);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f9145b.hashCode() + (this.f9144a.hashCode() * 31)) * 31;
        int i8 = 0;
        j4.a aVar = this.f9146c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.f9147d;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b.a aVar2 = this.f9148e;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        String str = this.f9149f;
        int hashCode5 = (this.f9150g.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f9151h;
        int c3 = (q.g.c(this.f9152i) + ((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        g<h.a<?>, Class<?>> gVar = this.f9153j;
        int hashCode6 = (c3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        e.a aVar3 = this.f9154k;
        int hashCode7 = aVar3 != null ? aVar3.hashCode() : 0;
        int hashCode8 = this.f9155l.hashCode();
        int hashCode9 = this.m.hashCode();
        int hashCode10 = this.f9156n.hashCode();
        int hashCode11 = this.f9157o.hashCode();
        int hashCode12 = Boolean.hashCode(this.f9158p);
        int hashCode13 = (this.D.hashCode() + ((q.g.c(this.C) + ((this.B.hashCode() + ((this.A.hashCode() + ((this.f9168z.hashCode() + ((this.f9167y.hashCode() + ((this.f9166x.hashCode() + ((this.f9165w.hashCode() + ((q.g.c(this.f9164v) + ((q.g.c(this.f9163u) + ((q.g.c(this.f9162t) + ((Boolean.hashCode(this.f9161s) + ((Boolean.hashCode(this.f9160r) + ((Boolean.hashCode(this.f9159q) + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode6 + hashCode7) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        b.a aVar4 = this.E;
        int hashCode14 = (hashCode13 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        Integer num = this.F;
        int hashCode15 = (hashCode14 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int hashCode16 = (hashCode15 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int hashCode17 = (hashCode16 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int hashCode18 = (hashCode17 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int hashCode19 = (hashCode18 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        if (drawable3 != null) {
            i8 = drawable3.hashCode();
        }
        return this.M.hashCode() + ((this.L.hashCode() + ((hashCode19 + i8) * 31)) * 31);
    }

    public static final class a {
        public final c0 A;
        public final m.a B;
        public final b.a C;
        public Integer D;
        public Drawable E;
        public Integer F;
        public Drawable G;
        public final Integer H;
        public final Drawable I;
        public final j J;
        public final f K;
        public final int L;
        public j M;
        public f N;
        public int O;

        /* renamed from: a  reason: collision with root package name */
        public final Context f9169a;

        /* renamed from: b  reason: collision with root package name */
        public b f9170b;

        /* renamed from: c  reason: collision with root package name */
        public Object f9171c;

        /* renamed from: d  reason: collision with root package name */
        public j4.a f9172d;

        /* renamed from: e  reason: collision with root package name */
        public final b f9173e;

        /* renamed from: f  reason: collision with root package name */
        public final b.a f9174f;

        /* renamed from: g  reason: collision with root package name */
        public final String f9175g;

        /* renamed from: h  reason: collision with root package name */
        public final Bitmap.Config f9176h;

        /* renamed from: i  reason: collision with root package name */
        public final ColorSpace f9177i;

        /* renamed from: j  reason: collision with root package name */
        public final int f9178j;

        /* renamed from: k  reason: collision with root package name */
        public final g<? extends h.a<?>, ? extends Class<?>> f9179k;

        /* renamed from: l  reason: collision with root package name */
        public final e.a f9180l;
        public List<? extends k4.b> m;

        /* renamed from: n  reason: collision with root package name */
        public c.a f9181n;

        /* renamed from: o  reason: collision with root package name */
        public final q.a f9182o;

        /* renamed from: p  reason: collision with root package name */
        public final LinkedHashMap f9183p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f9184q;

        /* renamed from: r  reason: collision with root package name */
        public final Boolean f9185r;

        /* renamed from: s  reason: collision with root package name */
        public final Boolean f9186s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f9187t;

        /* renamed from: u  reason: collision with root package name */
        public final int f9188u;

        /* renamed from: v  reason: collision with root package name */
        public final int f9189v;

        /* renamed from: w  reason: collision with root package name */
        public final int f9190w;

        /* renamed from: x  reason: collision with root package name */
        public final c0 f9191x;

        /* renamed from: y  reason: collision with root package name */
        public final c0 f9192y;

        /* renamed from: z  reason: collision with root package name */
        public final c0 f9193z;

        public a(Context context) {
            this.f9169a = context;
            this.f9170b = m4.b.f11188a;
            this.f9171c = null;
            this.f9172d = null;
            this.f9173e = null;
            this.f9174f = null;
            this.f9175g = null;
            this.f9176h = null;
            this.f9177i = null;
            this.f9178j = 0;
            this.f9179k = null;
            this.f9180l = null;
            this.m = s.f8978a;
            this.f9181n = null;
            this.f9182o = null;
            this.f9183p = null;
            this.f9184q = true;
            this.f9185r = null;
            this.f9186s = null;
            this.f9187t = true;
            this.f9188u = 0;
            this.f9189v = 0;
            this.f9190w = 0;
            this.f9191x = null;
            this.f9192y = null;
            this.f9193z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = 0;
            this.M = null;
            this.N = null;
            this.O = 0;
        }

        public final h a() {
            q qVar;
            o oVar;
            j jVar;
            c.a aVar;
            f fVar;
            List<? extends k4.b> list;
            int i8;
            View view;
            f fVar2;
            j b10;
            Context context = this.f9169a;
            Object obj = this.f9171c;
            if (obj == null) {
                obj = j.f9194a;
            }
            Object obj2 = obj;
            j4.a aVar2 = this.f9172d;
            b bVar = this.f9173e;
            b.a aVar3 = this.f9174f;
            String str = this.f9175g;
            Bitmap.Config config = this.f9176h;
            if (config == null) {
                config = this.f9170b.f9117g;
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f9177i;
            int i10 = this.f9178j;
            if (i10 == 0) {
                i10 = this.f9170b.f9116f;
            }
            int i11 = i10;
            g<? extends h.a<?>, ? extends Class<?>> gVar = this.f9179k;
            e.a aVar4 = this.f9180l;
            List<? extends k4.b> list2 = this.m;
            c.a aVar5 = this.f9181n;
            if (aVar5 == null) {
                aVar5 = this.f9170b.f9115e;
            }
            c.a aVar6 = aVar5;
            q.a aVar7 = this.f9182o;
            q c3 = aVar7 != null ? aVar7.c() : null;
            if (c3 == null) {
                c3 = m4.c.f11191c;
            } else {
                Bitmap.Config[] configArr = m4.c.f11189a;
            }
            LinkedHashMap linkedHashMap = this.f9183p;
            if (linkedHashMap != null) {
                qVar = c3;
                oVar = new o(e9.c.o(linkedHashMap));
            } else {
                qVar = c3;
                oVar = null;
            }
            o oVar2 = oVar == null ? o.f9219b : oVar;
            boolean z10 = this.f9184q;
            Boolean bool = this.f9185r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f9170b.f9118h;
            Boolean bool2 = this.f9186s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f9170b.f9119i;
            boolean z11 = this.f9187t;
            int i12 = this.f9188u;
            if (i12 == 0) {
                i12 = this.f9170b.m;
            }
            int i13 = i12;
            int i14 = this.f9189v;
            if (i14 == 0) {
                i14 = this.f9170b.f9123n;
            }
            int i15 = i14;
            int i16 = this.f9190w;
            if (i16 == 0) {
                i16 = this.f9170b.f9124o;
            }
            int i17 = i16;
            c0 c0Var = this.f9191x;
            if (c0Var == null) {
                c0Var = this.f9170b.f9111a;
            }
            c0 c0Var2 = c0Var;
            c0 c0Var3 = this.f9192y;
            if (c0Var3 == null) {
                c0Var3 = this.f9170b.f9112b;
            }
            c0 c0Var4 = c0Var3;
            c0 c0Var5 = this.f9193z;
            if (c0Var5 == null) {
                c0Var5 = this.f9170b.f9113c;
            }
            c0 c0Var6 = c0Var5;
            c0 c0Var7 = this.A;
            if (c0Var7 == null) {
                c0Var7 = this.f9170b.f9114d;
            }
            c0 c0Var8 = c0Var7;
            Context context2 = this.f9169a;
            boolean z12 = z10;
            j jVar2 = this.J;
            if (jVar2 == null && (jVar2 = this.M) == null) {
                j4.a aVar8 = this.f9172d;
                aVar = aVar6;
                Context context3 = aVar8 instanceof j4.b ? ((j4.b) aVar8).a().getContext() : context2;
                while (true) {
                    if (context3 instanceof p) {
                        b10 = ((p) context3).b();
                        break;
                    } else if (!(context3 instanceof ContextWrapper)) {
                        b10 = null;
                        break;
                    } else {
                        context3 = ((ContextWrapper) context3).getBaseContext();
                    }
                }
                if (b10 == null) {
                    b10 = g.f9142b;
                }
                jVar = b10;
            } else {
                aVar = aVar6;
                jVar = jVar2;
            }
            f fVar3 = this.K;
            if (fVar3 == null) {
                f fVar4 = this.N;
                if (fVar4 == null) {
                    j4.a aVar9 = this.f9172d;
                    list = list2;
                    if (aVar9 instanceof j4.b) {
                        View a10 = ((j4.b) aVar9).a();
                        if (a10 instanceof ImageView) {
                            ImageView.ScaleType scaleType = ((ImageView) a10).getScaleType();
                            if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                                fVar2 = new i4.c(i4.e.f9572c);
                            }
                        }
                        fVar2 = new d(a10, true);
                    } else {
                        fVar2 = new i4.b(context2);
                    }
                    fVar = fVar2;
                } else {
                    list = list2;
                    fVar = fVar4;
                }
            } else {
                list = list2;
                fVar = fVar3;
            }
            int i18 = this.L;
            if (i18 == 0 && (i18 = this.O) == 0) {
                i4.g gVar2 = fVar3 instanceof i4.g ? (i4.g) fVar3 : null;
                if (gVar2 == null || (view = gVar2.a()) == null) {
                    j4.a aVar10 = this.f9172d;
                    j4.b bVar2 = aVar10 instanceof j4.b ? (j4.b) aVar10 : null;
                    view = bVar2 != null ? bVar2.a() : null;
                }
                int i19 = 2;
                if (view instanceof ImageView) {
                    Bitmap.Config[] configArr2 = m4.c.f11189a;
                    ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                    int i20 = scaleType2 == null ? -1 : c.a.f11192a[scaleType2.ordinal()];
                    if (!(i20 == 1 || i20 == 2 || i20 == 3 || i20 == 4)) {
                        i19 = 1;
                    }
                }
                i8 = i19;
            } else {
                i8 = i18;
            }
            m.a aVar11 = this.B;
            m mVar = aVar11 != null ? new m(e9.c.o(aVar11.f9211a)) : null;
            if (mVar == null) {
                mVar = m.f9209b;
            }
            m mVar2 = mVar;
            b.a aVar12 = this.C;
            Integer num = this.D;
            Drawable drawable = this.E;
            Integer num2 = this.F;
            Drawable drawable2 = this.G;
            Integer num3 = this.H;
            Drawable drawable3 = this.I;
            c cVar = r45;
            e.a aVar13 = aVar4;
            g<? extends h.a<?>, ? extends Class<?>> gVar3 = gVar;
            int i21 = i11;
            ColorSpace colorSpace2 = colorSpace;
            Bitmap.Config config3 = config2;
            String str2 = str;
            b.a aVar14 = aVar3;
            b bVar3 = bVar;
            j4.a aVar15 = aVar2;
            Object obj3 = obj2;
            c cVar2 = new c(this.J, this.K, this.L, this.f9191x, this.f9192y, this.f9193z, this.A, this.f9181n, this.f9178j, this.f9176h, this.f9185r, this.f9186s, this.f9188u, this.f9189v, this.f9190w);
            return new h(context, obj3, aVar15, bVar3, aVar14, str2, config3, colorSpace2, i21, gVar3, aVar13, list, aVar, qVar, oVar2, z12, booleanValue, booleanValue2, z11, i13, i15, i17, c0Var2, c0Var4, c0Var6, c0Var8, jVar, fVar, i8, mVar2, aVar12, num, drawable, num2, drawable2, num3, drawable3, cVar, this.f9170b);
        }

        public final void b(boolean z10) {
            int i8 = z10 ? 100 : 0;
            this.f9181n = i8 > 0 ? new a.C0206a(i8, 2) : c.a.f10980a;
        }

        public final void c(ImageView imageView) {
            this.f9172d = new ImageViewTarget(imageView);
            this.M = null;
            this.N = null;
            this.O = 0;
        }

        public a(h hVar, Context context) {
            this.f9169a = context;
            this.f9170b = hVar.M;
            this.f9171c = hVar.f9145b;
            this.f9172d = hVar.f9146c;
            this.f9173e = hVar.f9147d;
            this.f9174f = hVar.f9148e;
            this.f9175g = hVar.f9149f;
            c cVar = hVar.L;
            this.f9176h = cVar.f9134j;
            this.f9177i = hVar.f9151h;
            this.f9178j = cVar.f9133i;
            this.f9179k = hVar.f9153j;
            this.f9180l = hVar.f9154k;
            this.m = hVar.f9155l;
            this.f9181n = cVar.f9132h;
            this.f9182o = hVar.f9156n.d();
            this.f9183p = y.Y(hVar.f9157o.f9220a);
            this.f9184q = hVar.f9158p;
            this.f9185r = cVar.f9135k;
            this.f9186s = cVar.f9136l;
            this.f9187t = hVar.f9161s;
            this.f9188u = cVar.m;
            this.f9189v = cVar.f9137n;
            this.f9190w = cVar.f9138o;
            this.f9191x = cVar.f9128d;
            this.f9192y = cVar.f9129e;
            this.f9193z = cVar.f9130f;
            this.A = cVar.f9131g;
            m mVar = hVar.D;
            mVar.getClass();
            this.B = new m.a(mVar);
            this.C = hVar.E;
            this.D = hVar.F;
            this.E = hVar.G;
            this.F = hVar.H;
            this.G = hVar.I;
            this.H = hVar.J;
            this.I = hVar.K;
            this.J = cVar.f9125a;
            this.K = cVar.f9126b;
            this.L = cVar.f9127c;
            if (hVar.f9144a == context) {
                this.M = hVar.A;
                this.N = hVar.B;
                this.O = hVar.C;
                return;
            }
            this.M = null;
            this.N = null;
            this.O = 0;
        }
    }
}
