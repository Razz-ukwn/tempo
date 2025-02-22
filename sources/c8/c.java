package c8;

import ag.n2;
import ag.v1;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import n8.a;
import v8.d;
import v8.f;
import v8.h;
import v8.i;
import w1.a;

public final class c {

    /* renamed from: y  reason: collision with root package name */
    public static final double f3845y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z  reason: collision with root package name */
    public static final ColorDrawable f3846z = (Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null);

    /* renamed from: a  reason: collision with root package name */
    public final MaterialCardView f3847a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3848b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final f f3849c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3850d;

    /* renamed from: e  reason: collision with root package name */
    public int f3851e;

    /* renamed from: f  reason: collision with root package name */
    public int f3852f;

    /* renamed from: g  reason: collision with root package name */
    public int f3853g;

    /* renamed from: h  reason: collision with root package name */
    public int f3854h;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f3855i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f3856j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3857k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3858l;
    public i m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f3859n;

    /* renamed from: o  reason: collision with root package name */
    public RippleDrawable f3860o;

    /* renamed from: p  reason: collision with root package name */
    public LayerDrawable f3861p;

    /* renamed from: q  reason: collision with root package name */
    public f f3862q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3863r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3864s;

    /* renamed from: t  reason: collision with root package name */
    public ValueAnimator f3865t;

    /* renamed from: u  reason: collision with root package name */
    public final TimeInterpolator f3866u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3867v;

    /* renamed from: w  reason: collision with root package name */
    public final int f3868w;

    /* renamed from: x  reason: collision with root package name */
    public float f3869x = 0.0f;

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f3847a = materialCardView;
        f fVar = new f(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, 2132018201);
        this.f3849c = fVar;
        fVar.j(materialCardView.getContext());
        fVar.o();
        i iVar = fVar.f16250a.f16256a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, n2.G, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            aVar.e(dimension);
            aVar.f(dimension);
            aVar.d(dimension);
            aVar.c(dimension);
        }
        this.f3850d = new f();
        h(new i(aVar));
        this.f3866u = a.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, v7.a.f16228a);
        this.f3867v = a.c(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f3868w = a.c(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(v1 v1Var, float f10) {
        if (v1Var instanceof h) {
            return (float) ((1.0d - f3845y) * ((double) f10));
        }
        if (v1Var instanceof d) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        v1 v1Var = this.m.f16277a;
        f fVar = this.f3849c;
        return Math.max(Math.max(b(v1Var, fVar.i()), b(this.m.f16278b, fVar.f16250a.f16256a.f16282f.a(fVar.h()))), Math.max(b(this.m.f16279c, fVar.f16250a.f16256a.f16283g.a(fVar.h())), b(this.m.f16280d, fVar.f16250a.f16256a.f16284h.a(fVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f3860o == null) {
            int[] iArr = s8.a.f14809a;
            this.f3862q = new f(this.m);
            this.f3860o = new RippleDrawable(this.f3857k, (Drawable) null, this.f3862q);
        }
        if (this.f3861p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f3860o, this.f3850d, this.f3856j});
            this.f3861p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f3861p;
    }

    public final b d(Drawable drawable) {
        int i8;
        int i10;
        MaterialCardView materialCardView = this.f3847a;
        if (materialCardView.getUseCompatPadding()) {
            float f10 = 0.0f;
            int ceil = (int) Math.ceil((double) ((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)));
            float maxCardElevation = materialCardView.getMaxCardElevation();
            if (i()) {
                f10 = a();
            }
            i10 = (int) Math.ceil((double) (maxCardElevation + f10));
            i8 = ceil;
        } else {
            i10 = 0;
            i8 = 0;
        }
        return new b(drawable, i10, i8, i10, i8);
    }

    public final void e(int i8, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f3861p != null) {
            MaterialCardView materialCardView = this.f3847a;
            boolean z10 = false;
            if (materialCardView.getUseCompatPadding()) {
                float f10 = 0.0f;
                i12 = (int) Math.ceil((double) (((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f));
                float maxCardElevation = materialCardView.getMaxCardElevation();
                if (i()) {
                    f10 = a();
                }
                i11 = (int) Math.ceil((double) ((maxCardElevation + f10) * 2.0f));
            } else {
                i12 = 0;
                i11 = 0;
            }
            int i15 = this.f3853g;
            int i16 = (i15 & 8388613) == 8388613 ? ((i8 - this.f3851e) - this.f3852f) - i11 : this.f3851e;
            int i17 = (i15 & 80) == 80 ? this.f3851e : ((i10 - this.f3851e) - this.f3852f) - i12;
            int i18 = (i15 & 8388613) == 8388613 ? this.f3851e : ((i8 - this.f3851e) - this.f3852f) - i11;
            if ((i15 & 80) == 80) {
                z10 = true;
            }
            int i19 = z10 ? ((i10 - this.f3851e) - this.f3852f) - i12 : this.f3851e;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.e.d(materialCardView) == 1) {
                i14 = i18;
                i13 = i16;
            } else {
                i13 = i18;
                i14 = i16;
            }
            this.f3861p.setLayerInset(2, i14, i19, i13, i17);
        }
    }

    public final void f(boolean z10, boolean z11) {
        Drawable drawable = this.f3856j;
        if (drawable != null) {
            int i8 = 0;
            float f10 = 0.0f;
            if (z11) {
                if (z10) {
                    f10 = 1.0f;
                }
                float f11 = z10 ? 1.0f - this.f3869x : this.f3869x;
                ValueAnimator valueAnimator = this.f3865t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f3865t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f3869x, f10});
                this.f3865t = ofFloat;
                ofFloat.addUpdateListener(new a(this, 0));
                this.f3865t.setInterpolator(this.f3866u);
                this.f3865t.setDuration((long) (((float) (z10 ? this.f3867v : this.f3868w)) * f11));
                this.f3865t.start();
                return;
            }
            if (z10) {
                i8 = 255;
            }
            drawable.setAlpha(i8);
            if (z10) {
                f10 = 1.0f;
            }
            this.f3869x = f10;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3856j = mutate;
            a.b.h(mutate, this.f3858l);
            f(this.f3847a.isChecked(), false);
        } else {
            this.f3856j = f3846z;
        }
        LayerDrawable layerDrawable = this.f3861p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f3856j);
        }
    }

    public final void h(i iVar) {
        this.m = iVar;
        f fVar = this.f3849c;
        fVar.setShapeAppearanceModel(iVar);
        fVar.R = !fVar.k();
        f fVar2 = this.f3850d;
        if (fVar2 != null) {
            fVar2.setShapeAppearanceModel(iVar);
        }
        f fVar3 = this.f3862q;
        if (fVar3 != null) {
            fVar3.setShapeAppearanceModel(iVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f3847a;
        return materialCardView.getPreventCornerOverlap() && this.f3849c.k() && materialCardView.getUseCompatPadding();
    }

    public final void j() {
        MaterialCardView materialCardView = this.f3847a;
        boolean z10 = true;
        if (!(materialCardView.getPreventCornerOverlap() && !this.f3849c.k()) && !i()) {
            z10 = false;
        }
        float f10 = 0.0f;
        float a10 = z10 ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f10 = (float) ((1.0d - f3845y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i8 = (int) (a10 - f10);
        Rect rect = this.f3848b;
        materialCardView.f1172c.set(rect.left + i8, rect.top + i8, rect.right + i8, rect.bottom + i8);
        CardView.C.m(materialCardView.f1174e);
    }

    public final void k() {
        boolean z10 = this.f3863r;
        MaterialCardView materialCardView = this.f3847a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f3849c));
        }
        materialCardView.setForeground(d(this.f3855i));
    }
}
