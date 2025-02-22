package com.google.android.material.datepicker;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.quickkonnect.silencio.R;
import r8.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f5863a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5864b;

    /* renamed from: c  reason: collision with root package name */
    public final b f5865c;

    /* renamed from: d  reason: collision with root package name */
    public final b f5866d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5867e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5868f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5869g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f5870h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.c(R.attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, n2.R);
        this.f5863a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f5869g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f5864b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f5865c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = r8.c.a(context, obtainStyledAttributes, 6);
        this.f5866d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f5867e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f5868f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f5870h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
