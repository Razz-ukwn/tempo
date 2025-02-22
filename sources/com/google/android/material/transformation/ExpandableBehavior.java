package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f6242a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f6243a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f6244b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k8.a f6245c;

        public a(View view, int i8, k8.a aVar) {
            this.f6243a = view;
            this.f6244b = i8;
            this.f6245c = aVar;
        }

        public final boolean onPreDraw() {
            View view = this.f6243a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f6242a == this.f6244b) {
                k8.a aVar = this.f6245c;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public abstract boolean b(View view, View view2);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r3.f6242a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6) {
        /*
            r3 = this;
            k8.a r6 = (k8.a) r6
            boolean r4 = r6.a()
            r0 = 2
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0016
            int r4 = r3.f6242a
            if (r4 == 0) goto L_0x0014
            if (r4 != r0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x001b
        L_0x0014:
            r4 = r2
            goto L_0x001b
        L_0x0016:
            int r4 = r3.f6242a
            if (r4 != r2) goto L_0x0012
            goto L_0x0014
        L_0x001b:
            if (r4 == 0) goto L_0x0031
            boolean r4 = r6.a()
            if (r4 == 0) goto L_0x0024
            r0 = r2
        L_0x0024:
            r3.f6242a = r0
            r4 = r6
            android.view.View r4 = (android.view.View) r4
            boolean r6 = r6.a()
            r3.s(r4, r5, r6, r2)
            return r2
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r5 = r4.f6242a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
            boolean r7 = d2.i0.g.c(r6)
            r0 = 0
            if (r7 != 0) goto L_0x0058
            java.util.ArrayList r5 = r5.d(r6)
            int r7 = r5.size()
            r1 = r0
        L_0x0012:
            if (r1 >= r7) goto L_0x0026
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r4.b(r6, r2)
            if (r3 == 0) goto L_0x0023
            k8.a r2 = (k8.a) r2
            goto L_0x0027
        L_0x0023:
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0058
            boolean r5 = r2.a()
            r7 = 2
            r1 = 1
            if (r5 == 0) goto L_0x003c
            int r5 = r4.f6242a
            if (r5 == 0) goto L_0x003a
            if (r5 != r7) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r5 = r0
            goto L_0x0041
        L_0x003a:
            r5 = r1
            goto L_0x0041
        L_0x003c:
            int r5 = r4.f6242a
            if (r5 != r1) goto L_0x0038
            goto L_0x003a
        L_0x0041:
            if (r5 == 0) goto L_0x0058
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x004a
            r7 = r1
        L_0x004a:
            r4.f6242a = r7
            android.view.ViewTreeObserver r5 = r6.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$a r1 = new com.google.android.material.transformation.ExpandableBehavior$a
            r1.<init>(r6, r7, r2)
            r5.addOnPreDrawListener(r1)
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public abstract void s(View view, View view2, boolean z10, boolean z11);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
