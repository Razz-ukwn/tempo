package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.Iterator;
import m8.n;

public class d {
    public static final int A = R.attr.motionDurationMedium1;
    public static final int B = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] C = {16842919, 16842910};
    public static final int[] D = {16843623, 16842908, 16842910};
    public static final int[] E = {16842908, 16842910};
    public static final int[] F = {16843623, 16842910};
    public static final int[] G = {16842910};
    public static final int[] H = new int[0];

    /* renamed from: x  reason: collision with root package name */
    public static final v2.a f5961x = v7.a.f16230c;

    /* renamed from: y  reason: collision with root package name */
    public static final int f5962y = R.attr.motionDurationLong2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f5963z = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: a  reason: collision with root package name */
    public v8.i f5964a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5965b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5966c = true;

    /* renamed from: d  reason: collision with root package name */
    public float f5967d;

    /* renamed from: e  reason: collision with root package name */
    public float f5968e;

    /* renamed from: f  reason: collision with root package name */
    public float f5969f;

    /* renamed from: g  reason: collision with root package name */
    public Animator f5970g;

    /* renamed from: h  reason: collision with root package name */
    public v7.g f5971h;

    /* renamed from: i  reason: collision with root package name */
    public v7.g f5972i;

    /* renamed from: j  reason: collision with root package name */
    public float f5973j;

    /* renamed from: k  reason: collision with root package name */
    public float f5974k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f5975l;
    public int m = 0;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f5976n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f5977o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<f> f5978p;

    /* renamed from: q  reason: collision with root package name */
    public final FloatingActionButton f5979q;

    /* renamed from: r  reason: collision with root package name */
    public final u8.b f5980r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f5981s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final RectF f5982t = new RectF();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f5983u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final Matrix f5984v = new Matrix();

    /* renamed from: w  reason: collision with root package name */
    public l8.b f5985w;

    public class a extends v7.f {
        public a() {
        }

        public final Object evaluate(float f10, Object obj, Object obj2) {
            d.this.f5974k = f10;
            float[] fArr = this.f16237a;
            ((Matrix) obj).getValues(fArr);
            float[] fArr2 = this.f16238b;
            ((Matrix) obj2).getValues(fArr2);
            for (int i8 = 0; i8 < 9; i8++) {
                float f11 = fArr2[i8];
                float f12 = fArr[i8];
                fArr2[i8] = a2.b.b(f11, f12, f10, f12);
            }
            Matrix matrix = this.f16239c;
            matrix.setValues(fArr2);
            return matrix;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f5987a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f5988b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f5989c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f5990d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f5991e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f5992f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f5993g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f5994h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f5987a = f10;
            this.f5988b = f11;
            this.f5989c = f12;
            this.f5990d = f13;
            this.f5991e = f14;
            this.f5992f = f15;
            this.f5993g = f16;
            this.f5994h = matrix;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f5979q.setAlpha(v7.a.a(this.f5987a, this.f5988b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.f5979q;
            float f10 = this.f5990d;
            float f11 = this.f5989c;
            floatingActionButton.setScaleX(((f10 - f11) * floatValue) + f11);
            FloatingActionButton floatingActionButton2 = dVar.f5979q;
            float f12 = this.f5991e;
            floatingActionButton2.setScaleY(((f10 - f12) * floatValue) + f12);
            float f13 = this.f5993g;
            float f14 = this.f5992f;
            dVar.f5974k = a2.b.b(f13, f14, floatValue, f14);
            float b10 = a2.b.b(f13, f14, floatValue, f14);
            Matrix matrix = this.f5994h;
            dVar.a(b10, matrix);
            dVar.f5979q.setImageMatrix(matrix);
        }
    }

    public class c extends i {
        public c(l8.c cVar) {
            super(cVar);
        }

        public final float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    public class C0074d extends i {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f5996c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0074d(l8.c cVar) {
            super(cVar);
            this.f5996c = cVar;
        }

        public final float a() {
            d dVar = this.f5996c;
            return dVar.f5967d + dVar.f5968e;
        }
    }

    public class e extends i {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f5997c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(l8.c cVar) {
            super(cVar);
            this.f5997c = cVar;
        }

        public final float a() {
            d dVar = this.f5997c;
            return dVar.f5967d + dVar.f5969f;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
    }

    public class h extends i {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f5998c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(l8.c cVar) {
            super(cVar);
            this.f5998c = cVar;
        }

        public final float a() {
            return this.f5998c.f5967d;
        }
    }

    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5999a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f6000b;

        public i(l8.c cVar) {
            this.f6000b = cVar;
        }

        public abstract float a();

        public final void onAnimationEnd(Animator animator) {
            this.f6000b.getClass();
            this.f5999a = false;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z10 = this.f5999a;
            d dVar = this.f6000b;
            if (!z10) {
                dVar.getClass();
                a();
                this.f5999a = true;
            }
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f5979q = floatingActionButton;
        this.f5980r = bVar;
        n nVar = new n();
        l8.c cVar = (l8.c) this;
        nVar.a(C, d(new e(cVar)));
        nVar.a(D, d(new C0074d(cVar)));
        nVar.a(E, d(new C0074d(cVar)));
        nVar.a(F, d(new C0074d(cVar)));
        nVar.a(G, d(new h(cVar)));
        nVar.a(H, d(new c(cVar)));
        this.f5973j = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f5961x);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f5979q.getDrawable();
        if (drawable != null && this.f5975l != 0) {
            RectF rectF = this.f5982t;
            RectF rectF2 = this.f5983u;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i8 = this.f5975l;
            rectF2.set(0.0f, 0.0f, (float) i8, (float) i8);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i10 = this.f5975l;
            matrix.postScale(f10, f10, ((float) i10) / 2.0f, ((float) i10) / 2.0f);
        }
    }

    public final AnimatorSet b(v7.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f5979q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, new float[]{f11});
        gVar.c("scale").a(ofFloat2);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 == 26) {
            ofFloat2.setEvaluator(new l8.a());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, new float[]{f11});
        gVar.c("scale").a(ofFloat3);
        if (i8 == 26) {
            ofFloat3.setEvaluator(new l8.a());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f5984v;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new v7.e(), new a(), new Matrix[]{new Matrix(matrix)});
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        cb.c.k(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i8, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        FloatingActionButton floatingActionButton = this.f5979q;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f5974k, f12, new Matrix(this.f5984v)));
        arrayList.add(ofFloat);
        cb.c.k(animatorSet, arrayList);
        animatorSet.setDuration((long) n8.a.c(floatingActionButton.getContext(), i8, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(n8.a.d(floatingActionButton.getContext(), i10, v7.a.f16229b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i8 = 0;
        if (this.f5965b) {
            i8 = (0 - this.f5979q.getSizeDimension()) / 2;
        }
        float e10 = this.f5966c ? e() + this.f5969f : 0.0f;
        int max = Math.max(i8, (int) Math.ceil((double) e10));
        int max2 = Math.max(i8, (int) Math.ceil((double) (e10 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i(int[] iArr) {
        throw null;
    }

    public void j(float f10, float f11, float f12) {
        throw null;
    }

    public final void k() {
        ArrayList<f> arrayList = this.f5978p;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void l() {
        throw null;
    }

    public void m() {
        throw null;
    }

    public final void n() {
        f(this.f5981s);
        b7.a.q((Object) null, "Didn't initialize content background");
        throw null;
    }
}
