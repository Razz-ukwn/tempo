package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import e.s;
import f1.h;
import f1.i;
import ff.m;
import h0.g;
import i0.f;
import i0.o;
import i0.p;
import i0.q;
import i0.t;
import i0.u;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import rf.l;
import rf.p;
import s0.a1;
import s0.s0;
import sf.j;
import sf.k;

public final class e3 extends View implements a1 {
    public static final b K = b.f1285a;
    public static final a L = new a();
    public static Method M;
    public static Field N;
    public static boolean O;
    public static boolean P;
    public boolean B;
    public Rect C;
    public boolean D;
    public boolean E;
    public final s F = new s();
    public final w1<View> G = new w1<>(K);
    public long H = u.f9393a;
    public boolean I = true;
    public final long J;

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f1280a;

    /* renamed from: b  reason: collision with root package name */
    public final o1 f1281b;

    /* renamed from: c  reason: collision with root package name */
    public l<? super f, m> f1282c;

    /* renamed from: d  reason: collision with root package name */
    public rf.a<m> f1283d;

    /* renamed from: e  reason: collision with root package name */
    public final y1 f1284e;

    public static final class a extends ViewOutlineProvider {
        public final void getOutline(View view, Outline outline) {
            j.f(view, "view");
            j.f(outline, "outline");
            Outline b10 = ((e3) view).f1284e.b();
            j.c(b10);
            outline.set(b10);
        }
    }

    public static final class b extends k implements p<View, Matrix, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1285a = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            Matrix matrix = (Matrix) obj2;
            j.f(view, "view");
            j.f(matrix, "matrix");
            matrix.set(view.getMatrix());
            return m.f8717a;
        }
    }

    public static final class c {
        @SuppressLint({"BanUncheckedReflection"})
        public static void a(View view) {
            Class<String> cls = String.class;
            Class<Class> cls2 = Class.class;
            j.f(view, "view");
            try {
                if (!e3.O) {
                    e3.O = true;
                    Class<View> cls3 = View.class;
                    if (Build.VERSION.SDK_INT < 28) {
                        e3.M = cls3.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        e3.N = cls3.getDeclaredField("mRecreateDisplayList");
                    } else {
                        e3.M = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                        e3.N = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                    }
                    Method method = e3.M;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = e3.N;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = e3.N;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = e3.M;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                e3.P = true;
            }
        }
    }

    public static final class d {
        public static final long a(View view) {
            j.f(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e3(AndroidComposeView androidComposeView, o1 o1Var, l lVar, s0.h hVar) {
        super(androidComposeView.getContext());
        j.f(androidComposeView, "ownerView");
        j.f(lVar, "drawBlock");
        j.f(hVar, "invalidateParentLayer");
        this.f1280a = androidComposeView;
        this.f1281b = o1Var;
        this.f1282c = lVar;
        this.f1283d = hVar;
        this.f1284e = new y1(androidComposeView.getDensity());
        setWillNotDraw(false);
        o1Var.addView(this);
        this.J = (long) View.generateViewId();
    }

    private final o getManualClipPath() {
        if (getClipToOutline()) {
            y1 y1Var = this.f1284e;
            if (!(!y1Var.f1520h)) {
                y1Var.e();
                return y1Var.f1518f;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            this.f1280a.F(this, z10);
        }
    }

    public final void a(h0.b bVar, boolean z10) {
        w1<View> w1Var = this.G;
        if (z10) {
            float[] a10 = w1Var.a(this);
            if (a10 != null) {
                b7.a.z(a10, bVar);
                return;
            }
            bVar.f9064a = 0.0f;
            bVar.f9065b = 0.0f;
            bVar.f9066c = 0.0f;
            bVar.f9067d = 0.0f;
            return;
        }
        b7.a.z(w1Var.b(this), bVar);
    }

    public final void b(f fVar) {
        j.f(fVar, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.E = z10;
        if (z10) {
            fVar.n();
        }
        this.f1281b.a(fVar, this, getDrawingTime());
        if (this.E) {
            fVar.d();
        }
    }

    public final boolean c(long j10) {
        float b10 = h0.c.b(j10);
        float c3 = h0.c.c(j10);
        if (this.B) {
            return 0.0f <= b10 && b10 < ((float) getWidth()) && 0.0f <= c3 && c3 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f1284e.c(j10);
        }
        return true;
    }

    public final void d(long j10) {
        int i8 = (int) (j10 >> 32);
        int a10 = i.a(j10);
        if (i8 != getWidth() || a10 != getHeight()) {
            long j11 = this.H;
            int i10 = u.f9394b;
            float f10 = (float) i8;
            setPivotX(Float.intBitsToFloat((int) (j11 >> 32)) * f10);
            float f11 = (float) a10;
            setPivotY(Float.intBitsToFloat((int) (this.H & 4294967295L)) * f11);
            long f12 = cb.c.f(f10, f11);
            y1 y1Var = this.f1284e;
            long j12 = y1Var.f1516d;
            int i11 = g.f9088d;
            if (!(j12 == f12)) {
                y1Var.f1516d = f12;
                y1Var.f1519g = true;
            }
            setOutlineProvider(y1Var.b() != null ? L : null);
            layout(getLeft(), getTop(), getLeft() + i8, getTop() + a10);
            j();
            this.G.c();
        }
    }

    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f1280a;
        androidComposeView.P = true;
        this.f1282c = null;
        this.f1283d = null;
        androidComposeView.H(this);
        this.f1281b.removeViewInLayout(this);
    }

    public final void dispatchDraw(Canvas canvas) {
        j.f(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        s sVar = this.F;
        Object obj = sVar.f7705a;
        Canvas canvas2 = ((i0.a) obj).f9359a;
        i0.a aVar = (i0.a) obj;
        aVar.getClass();
        aVar.f9359a = canvas;
        Object obj2 = sVar.f7705a;
        i0.a aVar2 = (i0.a) obj2;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            aVar2.c();
            this.f1284e.a(aVar2);
            z10 = true;
        }
        l<? super f, m> lVar = this.f1282c;
        if (lVar != null) {
            lVar.invoke(aVar2);
        }
        if (z10) {
            aVar2.l();
        }
        ((i0.a) obj2).p(canvas2);
    }

    public final void e(s0.h hVar, l lVar) {
        j.f(lVar, "drawBlock");
        j.f(hVar, "invalidateParentLayer");
        this.f1281b.addView(this);
        this.B = false;
        this.E = false;
        this.H = u.f9393a;
        this.f1282c = lVar;
        this.f1283d = hVar;
    }

    public final void f(long j10) {
        int i8 = h.f8036c;
        int i10 = (int) (j10 >> 32);
        int left = getLeft();
        w1<View> w1Var = this.G;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            w1Var.c();
        }
        int a10 = h.a(j10);
        if (a10 != getTop()) {
            offsetTopAndBottom(a10 - getTop());
            w1Var.c();
        }
    }

    public final void forceLayout() {
    }

    public final void g() {
        if (this.D && !P) {
            setInvalidated(false);
            c.a(this);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final o1 getContainer() {
        return this.f1281b;
    }

    public long getLayerId() {
        return this.J;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f1280a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f1280a);
        }
        return -1;
    }

    public final void h(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, t tVar, boolean z10, long j11, long j12, int i8, f1.j jVar, f1.c cVar) {
        rf.a<m> aVar;
        t tVar2 = tVar;
        int i10 = i8;
        j.f(tVar2, "shape");
        j.f(jVar, "layoutDirection");
        j.f(cVar, "density");
        this.H = j10;
        setScaleX(f10);
        float f20 = f11;
        setScaleY(f11);
        float f21 = f12;
        setAlpha(f12);
        setTranslationX(f13);
        setTranslationY(f14);
        setElevation(f15);
        setRotation(f18);
        setRotationX(f16);
        setRotationY(f17);
        long j13 = this.H;
        int i11 = u.f9394b;
        setPivotX(Float.intBitsToFloat((int) (j13 >> 32)) * ((float) getWidth()));
        setPivotY(Float.intBitsToFloat((int) (this.H & 4294967295L)) * ((float) getHeight()));
        setCameraDistancePx(f19);
        p.a aVar2 = i0.p.f9383a;
        boolean z11 = true;
        this.B = z10 && tVar2 == aVar2;
        j();
        boolean z12 = getManualClipPath() != null;
        setClipToOutline(z10 && tVar2 != aVar2);
        boolean d10 = this.f1284e.d(tVar, getAlpha(), getClipToOutline(), getElevation(), jVar, cVar);
        setOutlineProvider(this.f1284e.b() != null ? L : null);
        boolean z13 = getManualClipPath() != null;
        if (z12 != z13 || (z13 && d10)) {
            invalidate();
        }
        if (!this.E && getElevation() > 0.0f && (aVar = this.f1283d) != null) {
            aVar.d();
        }
        this.G.c();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            g3 g3Var = g3.f1291a;
            g3Var.a(this, androidx.databinding.a.l(j11));
            g3Var.b(this, androidx.databinding.a.l(j12));
        }
        if (i12 >= 31) {
            i3.f1334a.a(this, (q) null);
        }
        if (i10 == 1) {
            setLayerType(2, (Paint) null);
        } else {
            if (i10 == 2) {
                setLayerType(0, (Paint) null);
                z11 = false;
            } else {
                setLayerType(0, (Paint) null);
            }
        }
        this.I = z11;
    }

    public final boolean hasOverlappingRendering() {
        return this.I;
    }

    public final long i(boolean z10, long j10) {
        w1<View> w1Var = this.G;
        if (!z10) {
            return b7.a.y(w1Var.b(this), j10);
        }
        float[] a10 = w1Var.a(this);
        if (a10 != null) {
            return b7.a.y(a10, j10);
        }
        int i8 = h0.c.f9071e;
        return h0.c.f9069c;
    }

    public final void invalidate() {
        if (!this.D) {
            setInvalidated(true);
            super.invalidate();
            this.f1280a.invalidate();
        }
    }

    public final void j() {
        Rect rect;
        if (this.B) {
            Rect rect2 = this.C;
            if (rect2 == null) {
                this.C = new Rect(0, 0, getWidth(), getHeight());
            } else {
                j.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.C;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * ((float) getResources().getDisplayMetrics().densityDpi));
    }
}
