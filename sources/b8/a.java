package b8;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import b1.b;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import v8.f;
import v8.i;
import v8.m;
import w1.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f3275a;

    /* renamed from: b  reason: collision with root package name */
    public i f3276b;

    /* renamed from: c  reason: collision with root package name */
    public int f3277c;

    /* renamed from: d  reason: collision with root package name */
    public int f3278d;

    /* renamed from: e  reason: collision with root package name */
    public int f3279e;

    /* renamed from: f  reason: collision with root package name */
    public int f3280f;

    /* renamed from: g  reason: collision with root package name */
    public int f3281g;

    /* renamed from: h  reason: collision with root package name */
    public int f3282h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f3283i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3284j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3285k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3286l;
    public f m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3287n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3288o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3289p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3290q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3291r = true;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f3292s;

    /* renamed from: t  reason: collision with root package name */
    public int f3293t;

    public a(MaterialButton materialButton, i iVar) {
        this.f3275a = materialButton;
        this.f3276b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f3292s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3292s.getNumberOfLayers() > 2 ? (m) this.f3292s.getDrawable(2) : (m) this.f3292s.getDrawable(1);
    }

    public final f b(boolean z10) {
        RippleDrawable rippleDrawable = this.f3292s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.f3292s.getDrawable(0)).getDrawable()).getDrawable(z10 ^ true ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f3276b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i8, int i10) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        MaterialButton materialButton = this.f3275a;
        int f10 = i0.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = i0.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f3279e;
        int i12 = this.f3280f;
        this.f3280f = i10;
        this.f3279e = i8;
        if (!this.f3288o) {
            e();
        }
        i0.e.k(materialButton, f10, (paddingTop + i8) - i11, e10, (paddingBottom + i10) - i12);
    }

    public final void e() {
        f fVar = new f(this.f3276b);
        MaterialButton materialButton = this.f3275a;
        fVar.j(materialButton.getContext());
        a.b.h(fVar, this.f3284j);
        PorterDuff.Mode mode = this.f3283i;
        if (mode != null) {
            a.b.i(fVar, mode);
        }
        ColorStateList colorStateList = this.f3285k;
        fVar.f16250a.f16266k = (float) this.f3282h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f16250a;
        if (bVar.f16259d != colorStateList) {
            bVar.f16259d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f3276b);
        fVar2.setTint(0);
        float f10 = (float) this.f3282h;
        int f11 = this.f3287n ? b.f(materialButton, R.attr.colorSurface) : 0;
        fVar2.f16250a.f16266k = f10;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(f11);
        f.b bVar2 = fVar2.f16250a;
        if (bVar2.f16259d != valueOf) {
            bVar2.f16259d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        f fVar3 = new f(this.f3276b);
        this.m = fVar3;
        a.b.g(fVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(s8.a.c(this.f3286l), new InsetDrawable(new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f3277c, this.f3279e, this.f3278d, this.f3280f), this.m);
        this.f3292s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b10 = b(false);
        if (b10 != null) {
            b10.l((float) this.f3293t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i8 = 0;
        f b10 = b(false);
        f b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.f3285k;
            b10.f16250a.f16266k = (float) this.f3282h;
            b10.invalidateSelf();
            f.b bVar = b10.f16250a;
            if (bVar.f16259d != colorStateList) {
                bVar.f16259d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f10 = (float) this.f3282h;
                if (this.f3287n) {
                    i8 = b.f(this.f3275a, R.attr.colorSurface);
                }
                b11.f16250a.f16266k = f10;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i8);
                f.b bVar2 = b11.f16250a;
                if (bVar2.f16259d != valueOf) {
                    bVar2.f16259d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
