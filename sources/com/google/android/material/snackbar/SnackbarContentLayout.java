package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import n8.a;
import x8.h;

public class SnackbarContentLayout extends LinearLayout implements h {

    /* renamed from: a  reason: collision with root package name */
    public TextView f6084a;

    /* renamed from: b  reason: collision with root package name */
    public Button f6085b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeInterpolator f6086c;

    /* renamed from: d  reason: collision with root package name */
    public int f6087d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6086c = a.d(context, R.attr.motionEasingEmphasizedInterpolator, v7.a.f16229b);
    }

    public final boolean a(int i8, int i10, int i11) {
        boolean z10;
        if (i8 != getOrientation()) {
            setOrientation(i8);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6084a.getPaddingTop() == i10 && this.f6084a.getPaddingBottom() == i11) {
            return z10;
        }
        TextView textView = this.f6084a;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.e.g(textView)) {
            i0.e.k(textView, i0.e.f(textView), i10, i0.e.e(textView), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f6085b;
    }

    public TextView getMessageView() {
        return this.f6084a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6084a = (TextView) findViewById(R.id.snackbar_text);
        this.f6085b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (a(0, r0, r0) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099788(0x7f06008c, float:1.781194E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099787(0x7f06008b, float:1.7811937E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f6084a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L_0x0032
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L_0x0032
            r3 = r1
            goto L_0x0033
        L_0x0032:
            r3 = r4
        L_0x0033:
            if (r3 == 0) goto L_0x004c
            int r5 = r7.f6087d
            if (r5 <= 0) goto L_0x004c
            android.widget.Button r5 = r7.f6085b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f6087d
            if (r5 <= r6) goto L_0x004c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x004c:
            if (r3 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = r4
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            super.onMeasure(r8, r9)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i8) {
        this.f6087d = i8;
    }
}
