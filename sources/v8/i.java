package v8;

import ag.n2;
import ag.v1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import b1.b;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final v1 f16277a;

    /* renamed from: b  reason: collision with root package name */
    public final v1 f16278b;

    /* renamed from: c  reason: collision with root package name */
    public final v1 f16279c;

    /* renamed from: d  reason: collision with root package name */
    public final v1 f16280d;

    /* renamed from: e  reason: collision with root package name */
    public final c f16281e;

    /* renamed from: f  reason: collision with root package name */
    public final c f16282f;

    /* renamed from: g  reason: collision with root package name */
    public final c f16283g;

    /* renamed from: h  reason: collision with root package name */
    public final c f16284h;

    /* renamed from: i  reason: collision with root package name */
    public final e f16285i;

    /* renamed from: j  reason: collision with root package name */
    public final e f16286j;

    /* renamed from: k  reason: collision with root package name */
    public final e f16287k;

    /* renamed from: l  reason: collision with root package name */
    public final e f16288l;

    public i(a aVar) {
        this.f16277a = aVar.f16289a;
        this.f16278b = aVar.f16290b;
        this.f16279c = aVar.f16291c;
        this.f16280d = aVar.f16292d;
        this.f16281e = aVar.f16293e;
        this.f16282f = aVar.f16294f;
        this.f16283g = aVar.f16295g;
        this.f16284h = aVar.f16296h;
        this.f16285i = aVar.f16297i;
        this.f16286j = aVar.f16298j;
        this.f16287k = aVar.f16299k;
        this.f16288l = aVar.f16300l;
    }

    public static a a(Context context, int i8, int i10, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i8);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(n2.f459g0);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            c c3 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c3);
            c c11 = c(obtainStyledAttributes, 9, c3);
            c c12 = c(obtainStyledAttributes, 7, c3);
            c c13 = c(obtainStyledAttributes, 6, c3);
            a aVar2 = new a();
            v1 c14 = b.c(i12);
            aVar2.f16289a = c14;
            float b10 = a.b(c14);
            if (b10 != -1.0f) {
                aVar2.e(b10);
            }
            aVar2.f16293e = c10;
            v1 c15 = b.c(i13);
            aVar2.f16290b = c15;
            float b11 = a.b(c15);
            if (b11 != -1.0f) {
                aVar2.f(b11);
            }
            aVar2.f16294f = c11;
            v1 c16 = b.c(i14);
            aVar2.f16291c = c16;
            float b12 = a.b(c16);
            if (b12 != -1.0f) {
                aVar2.d(b12);
            }
            aVar2.f16295g = c12;
            v1 c17 = b.c(i15);
            aVar2.f16292d = c17;
            float b13 = a.b(c17);
            if (b13 != -1.0f) {
                aVar2.c(b13);
            }
            aVar2.f16296h = c13;
            return aVar2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i8, int i10) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.W, i8, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i8, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue == null) {
            return cVar;
        }
        int i10 = peekValue.type;
        return i10 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i10 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        Class<e> cls = e.class;
        boolean z10 = this.f16288l.getClass().equals(cls) && this.f16286j.getClass().equals(cls) && this.f16285i.getClass().equals(cls) && this.f16287k.getClass().equals(cls);
        float a10 = this.f16281e.a(rectF);
        return z10 && ((this.f16282f.a(rectF) > a10 ? 1 : (this.f16282f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f16284h.a(rectF) > a10 ? 1 : (this.f16284h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f16283g.a(rectF) > a10 ? 1 : (this.f16283g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f16278b instanceof h) && (this.f16277a instanceof h) && (this.f16279c instanceof h) && (this.f16280d instanceof h));
    }

    public final i e(float f10) {
        a aVar = new a(this);
        aVar.e(f10);
        aVar.f(f10);
        aVar.d(f10);
        aVar.c(f10);
        return new i(aVar);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public v1 f16289a = new h();

        /* renamed from: b  reason: collision with root package name */
        public v1 f16290b = new h();

        /* renamed from: c  reason: collision with root package name */
        public v1 f16291c = new h();

        /* renamed from: d  reason: collision with root package name */
        public v1 f16292d = new h();

        /* renamed from: e  reason: collision with root package name */
        public c f16293e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f16294f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f16295g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f16296h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public final e f16297i = new e();

        /* renamed from: j  reason: collision with root package name */
        public final e f16298j = new e();

        /* renamed from: k  reason: collision with root package name */
        public final e f16299k = new e();

        /* renamed from: l  reason: collision with root package name */
        public final e f16300l = new e();

        public a() {
        }

        public static float b(v1 v1Var) {
            if (v1Var instanceof h) {
                return ((h) v1Var).L;
            }
            if (v1Var instanceof d) {
                return ((d) v1Var).L;
            }
            return -1.0f;
        }

        public final i a() {
            return new i(this);
        }

        public final void c(float f10) {
            this.f16296h = new a(f10);
        }

        public final void d(float f10) {
            this.f16295g = new a(f10);
        }

        public final void e(float f10) {
            this.f16293e = new a(f10);
        }

        public final void f(float f10) {
            this.f16294f = new a(f10);
        }

        public a(i iVar) {
            this.f16289a = iVar.f16277a;
            this.f16290b = iVar.f16278b;
            this.f16291c = iVar.f16279c;
            this.f16292d = iVar.f16280d;
            this.f16293e = iVar.f16281e;
            this.f16294f = iVar.f16282f;
            this.f16295g = iVar.f16283g;
            this.f16296h = iVar.f16284h;
            this.f16297i = iVar.f16285i;
            this.f16298j = iVar.f16286j;
            this.f16299k = iVar.f16287k;
            this.f16300l = iVar.f16288l;
        }
    }

    public i() {
        this.f16277a = new h();
        this.f16278b = new h();
        this.f16279c = new h();
        this.f16280d = new h();
        this.f16281e = new a(0.0f);
        this.f16282f = new a(0.0f);
        this.f16283g = new a(0.0f);
        this.f16284h = new a(0.0f);
        this.f16285i = new e();
        this.f16286j = new e();
        this.f16287k = new e();
        this.f16288l = new e();
    }
}
