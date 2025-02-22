package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

public final class g extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f5876a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5877b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5878c;

    public g() {
        Calendar d10 = f0.d((Calendar) null);
        this.f5876a = d10;
        this.f5877b = d10.getMaximum(7);
        this.f5878c = d10.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f5877b;
    }

    public final Object getItem(int i8) {
        int i10 = this.f5877b;
        if (i8 >= i10) {
            return null;
        }
        int i11 = i8 + this.f5878c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    public final long getItemId(int i8) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131493007(0x7f0c008f, float:1.8609482E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            int r7 = r5.f5878c
            int r6 = r6 + r7
            int r7 = r5.f5877b
            if (r6 <= r7) goto L_0x0020
            int r6 = r6 - r7
        L_0x0020:
            java.util.Calendar r7 = r5.f5876a
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            r3 = 4
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r8 = 2131951952(0x7f130150, float:1.9540333E38)
            java.lang.String r6 = r6.getString(r8)
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r7 = r7.getDisplayName(r2, r3, r4)
            r8[r1] = r7
            java.lang.String r6 = java.lang.String.format(r6, r8)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public g(int i8) {
        Calendar d10 = f0.d((Calendar) null);
        this.f5876a = d10;
        this.f5877b = d10.getMaximum(7);
        this.f5878c = i8;
    }
}
