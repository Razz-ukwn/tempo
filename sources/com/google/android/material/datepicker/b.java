package com.google.android.material.datepicker;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import b7.a;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import r8.c;
import v8.f;
import v8.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f5856a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f5857b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f5858c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f5859d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5860e;

    /* renamed from: f  reason: collision with root package name */
    public final i f5861f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i8, i iVar, Rect rect) {
        a.p(rect.left);
        a.p(rect.top);
        a.p(rect.right);
        a.p(rect.bottom);
        this.f5856a = rect;
        this.f5857b = colorStateList2;
        this.f5858c = colorStateList;
        this.f5859d = colorStateList3;
        this.f5860e = i8;
        this.f5861f = iVar;
    }

    public static b a(Context context, int i8) {
        a.o(i8 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, n2.S);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        i iVar = new i(i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new v8.a((float) 0)));
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, iVar, rect);
    }

    public final void b(TextView textView) {
        f fVar = new f();
        f fVar2 = new f();
        i iVar = this.f5861f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.m(this.f5858c);
        fVar.f16250a.f16266k = (float) this.f5860e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f16250a;
        ColorStateList colorStateList = bVar.f16259d;
        ColorStateList colorStateList2 = this.f5859d;
        if (colorStateList != colorStateList2) {
            bVar.f16259d = colorStateList2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateList3 = this.f5857b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), fVar, fVar2);
        Rect rect = this.f5856a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.q(textView, insetDrawable);
    }
}
