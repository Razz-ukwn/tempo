package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v7.g;
import v7.h;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f6248c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f6249d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f6250e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f6251f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f6252g;

    /* renamed from: h  reason: collision with root package name */
    public float f6253h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6254a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f6255b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f6256c;

        public a(boolean z10, View view, View view2) {
            this.f6254a = z10;
            this.f6255b = view;
            this.f6256c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f6254a) {
                this.f6255b.setVisibility(4);
                View view = this.f6256c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f6254a) {
                this.f6255b.setVisibility(0);
                View view = this.f6256c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f6257a;

        /* renamed from: b  reason: collision with root package name */
        public cb.b f6258b;
    }

    public FabTransformationBehavior() {
    }

    public static Pair u(float f10, float f11, boolean z10, b bVar) {
        h hVar;
        h hVar2;
        int i8;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVar2 = bVar.f6257a.c("translationXLinear");
            hVar = bVar.f6257a.c("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i8 <= 0)) {
            hVar2 = bVar.f6257a.c("translationXCurveDownwards");
            hVar = bVar.f6257a.c("translationYCurveDownwards");
        } else {
            hVar2 = bVar.f6257a.c("translationXCurveUpwards");
            hVar = bVar.f6257a.c("translationYCurveUpwards");
        }
        return new Pair(hVar2, hVar);
    }

    public static float x(b bVar, h hVar, float f10) {
        long j10 = hVar.f16242a;
        h c3 = bVar.f6257a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c3.f16242a + c3.f16243b) + 17) - j10)) / ((float) hVar.f16243b));
        LinearInterpolator linearInterpolator = v7.a.f16228a;
        return a2.b.b(0.0f, f10, interpolation, f10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r4 = ((com.google.android.material.floatingactionbutton.FloatingActionButton) r4).getExpandedComponentIdHint();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.View r3, android.view.View r4) {
        /*
            r2 = this;
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x001e
            boolean r0 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r0 == 0) goto L_0x001c
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r4 = r4.getExpandedComponentIdHint()
            if (r4 == 0) goto L_0x001a
            int r3 = r3.getId()
            if (r4 != r3) goto L_0x001c
        L_0x001a:
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            return r3
        L_0x001e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View):boolean");
    }

    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f1723h == 0) {
            fVar.f1723h = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03f2 A[LOOP:1: B:115:0x03f0->B:116:0x03f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet t(android.view.View r26, android.view.View r27, boolean r28, boolean r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            android.content.Context r4 = r27.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.z(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r26.getTranslationX()
            r0.f6252g = r5
            float r5 = r26.getTranslationY()
            r0.f6253h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, d2.d1> r7 = d2.i0.f7217a
            float r7 = d2.i0.i.i(r27)
            float r8 = d2.i0.i.i(r26)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r29 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            v7.g r11 = r4.f6257a
            java.lang.String r12 = "elevation"
            v7.h r11 = r11.c(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f6249d
            cb.b r11 = r4.f6258b
            float r11 = r0.v(r1, r2, r11)
            cb.b r12 = r4.f6258b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            v7.h r14 = (v7.h) r14
            java.lang.Object r13 = r13.second
            v7.h r13 = (v7.h) r13
            android.graphics.RectF r15 = r0.f6250e
            android.graphics.Rect r8 = r0.f6248c
            if (r3 == 0) goto L_0x00c8
            if (r29 != 0) goto L_0x008c
            float r10 = -r11
            r2.setTranslationX(r10)
            float r10 = -r12
            r2.setTranslationY(r10)
        L_0x008c:
            android.util.Property r10 = android.view.View.TRANSLATION_X
            r18 = r6
            float[] r6 = new float[r9]
            r16 = 0
            r17 = 0
            r6[r17] = r16
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r10, r6)
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            r19 = r6
            float[] r6 = new float[r9]
            r6[r17] = r16
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r10, r6)
            float r10 = -r11
            float r11 = -r12
            float r10 = x(r4, r14, r10)
            float r11 = x(r4, r13, r11)
            r2.getWindowVisibleDisplayFrame(r8)
            r7.set(r8)
            r0.y(r2, r15)
            r15.offset(r10, r11)
            r15.intersect(r7)
            r7.set(r15)
            r10 = r6
            r6 = r19
            goto L_0x00e2
        L_0x00c8:
            r18 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r10 = new float[r9]
            float r11 = -r11
            r17 = 0
            r10[r17] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r10)
            android.util.Property r10 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r17] = r12
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r2, r10, r11)
        L_0x00e2:
            r14.a(r6)
            r13.a(r10)
            r5.add(r6)
            r5.add(r10)
            float r6 = r7.width()
            float r10 = r7.height()
            cb.b r11 = r4.f6258b
            float r11 = r0.v(r1, r2, r11)
            cb.b r12 = r4.f6258b
            float r12 = r0.w(r1, r2, r12)
            android.util.Pair r13 = u(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            v7.h r14 = (v7.h) r14
            java.lang.Object r13 = r13.second
            v7.h r13 = (v7.h) r13
            r19 = r11
            android.util.Property r11 = android.view.View.TRANSLATION_X
            r20 = r12
            float[] r12 = new float[r9]
            if (r3 == 0) goto L_0x011b
            r9 = r19
            goto L_0x011d
        L_0x011b:
            float r9 = r0.f6252g
        L_0x011d:
            r17 = 0
            r12[r17] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r1, r11, r12)
            android.util.Property r11 = android.view.View.TRANSLATION_Y
            r21 = r10
            r12 = 1
            float[] r10 = new float[r12]
            if (r3 == 0) goto L_0x0131
            r12 = r20
            goto L_0x0133
        L_0x0131:
            float r12 = r0.f6253h
        L_0x0133:
            r10[r17] = r12
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r1, r11, r10)
            r14.a(r9)
            r13.a(r10)
            r5.add(r9)
            r5.add(r10)
            boolean r9 = r2 instanceof f8.d
            if (r9 == 0) goto L_0x01a7
            boolean r10 = r1 instanceof android.widget.ImageView
            if (r10 != 0) goto L_0x014e
            goto L_0x01a7
        L_0x014e:
            r10 = r2
            f8.d r10 = (f8.d) r10
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            android.graphics.drawable.Drawable r11 = r11.getDrawable()
            if (r11 != 0) goto L_0x015b
            goto L_0x01a7
        L_0x015b:
            r11.mutate()
            r12 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0177
            if (r29 != 0) goto L_0x0167
            r11.setAlpha(r12)
        L_0x0167:
            v7.d r12 = v7.d.f16235a
            r13 = 1
            int[] r14 = new int[r13]
            r17 = 0
            r14[r17] = r17
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofInt(r11, r12, r14)
            r20 = r6
            goto L_0x0186
        L_0x0177:
            r13 = 1
            r17 = 0
            v7.d r14 = v7.d.f16235a
            r20 = r6
            int[] r6 = new int[r13]
            r6[r17] = r12
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofInt(r11, r14, r6)
        L_0x0186:
            com.google.android.material.transformation.a r6 = new com.google.android.material.transformation.a
            r6.<init>(r2)
            r12.addUpdateListener(r6)
            v7.g r6 = r4.f6257a
            java.lang.String r13 = "iconFade"
            v7.h r6 = r6.c(r13)
            r6.a(r12)
            r5.add(r12)
            com.google.android.material.transformation.b r6 = new com.google.android.material.transformation.b
            r6.<init>(r10, r11)
            r10 = r18
            r10.add(r6)
            goto L_0x01ab
        L_0x01a7:
            r20 = r6
            r10 = r18
        L_0x01ab:
            if (r9 != 0) goto L_0x01b3
            r23 = r4
            r15 = r9
            r1 = r10
            goto L_0x030d
        L_0x01b3:
            r11 = r2
            f8.d r11 = (f8.d) r11
            cb.b r12 = r4.f6258b
            r0.y(r1, r7)
            float r13 = r0.f6252g
            float r14 = r0.f6253h
            r7.offset(r13, r14)
            r0.y(r2, r15)
            float r12 = r0.v(r1, r2, r12)
            float r12 = -r12
            r13 = 0
            r15.offset(r12, r13)
            float r12 = r7.centerX()
            float r13 = r15.left
            float r12 = r12 - r13
            cb.b r13 = r4.f6258b
            r0.y(r1, r7)
            float r14 = r0.f6252g
            float r6 = r0.f6253h
            r7.offset(r14, r6)
            r0.y(r2, r15)
            float r6 = r0.w(r1, r2, r13)
            float r6 = -r6
            r13 = 0
            r15.offset(r13, r6)
            float r6 = r7.centerY()
            float r7 = r15.top
            float r6 = r6 - r7
            r7 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r7 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r7
            boolean r13 = d2.i0.g.c(r7)
            if (r13 != 0) goto L_0x03ff
            int r7 = r8.width()
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            v7.g r8 = r4.f6257a
            java.lang.String r13 = "expansion"
            v7.h r8 = r8.c(r13)
            if (r3 == 0) goto L_0x028c
            if (r29 != 0) goto L_0x0219
            f8.d$d r15 = new f8.d$d
            r15.<init>(r12, r6, r7)
            r11.setRevealInfo(r15)
        L_0x0219:
            if (r29 == 0) goto L_0x0221
            f8.d$d r7 = r11.getRevealInfo()
            float r7 = r7.f8608c
        L_0x0221:
            r15 = 0
            float r13 = r15 - r12
            float r14 = r15 - r6
            double r0 = (double) r13
            double r13 = (double) r14
            r15 = r9
            r24 = r10
            double r9 = java.lang.Math.hypot(r0, r13)
            float r9 = (float) r9
            float r10 = r20 - r12
            r20 = r4
            double r3 = (double) r10
            double r13 = java.lang.Math.hypot(r3, r13)
            float r10 = (float) r13
            float r13 = r21 - r6
            double r13 = (double) r13
            double r3 = java.lang.Math.hypot(r3, r13)
            float r3 = (float) r3
            double r0 = java.lang.Math.hypot(r0, r13)
            float r0 = (float) r0
            int r1 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            goto L_0x0265
        L_0x0254:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x025e
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x025e
            r9 = r10
            goto L_0x0265
        L_0x025e:
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0264
            r9 = r3
            goto L_0x0265
        L_0x0264:
            r9 = r0
        L_0x0265:
            android.animation.AnimatorSet r0 = f8.b.a(r11, r12, r6, r9)
            com.google.android.material.transformation.c r1 = new com.google.android.material.transformation.c
            r1.<init>(r11)
            r0.addListener(r1)
            long r3 = r8.f16242a
            int r1 = (int) r12
            int r6 = (int) r6
            r9 = 0
            int r12 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0288
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r6, r7, r7)
            r1.setStartDelay(r9)
            r1.setDuration(r3)
            r5.add(r1)
        L_0x0288:
            r23 = r20
            goto L_0x02fd
        L_0x028c:
            r20 = r4
            r15 = r9
            r24 = r10
            f8.d$d r0 = r11.getRevealInfo()
            float r0 = r0.f8608c
            android.animation.AnimatorSet r1 = f8.b.a(r11, r12, r6, r7)
            long r3 = r8.f16242a
            int r9 = (int) r12
            int r6 = (int) r6
            r12 = 0
            int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x02b2
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r9, r6, r0, r0)
            r0.setStartDelay(r12)
            r0.setDuration(r3)
            r5.add(r0)
        L_0x02b2:
            r0 = r20
            v7.g r3 = r0.f6257a
            o.f<java.lang.String, v7.h> r3 = r3.f16240a
            int r4 = r3.f12032c
            r13 = r12
            r10 = 0
        L_0x02bc:
            if (r10 >= r4) goto L_0x02e0
            java.lang.Object r12 = r3.m(r10)
            v7.h r12 = (v7.h) r12
            r20 = r3
            r21 = r4
            long r3 = r12.f16242a
            r23 = r0
            r22 = r1
            long r0 = r12.f16243b
            long r3 = r3 + r0
            long r13 = java.lang.Math.max(r13, r3)
            int r10 = r10 + 1
            r3 = r20
            r4 = r21
            r1 = r22
            r0 = r23
            goto L_0x02bc
        L_0x02e0:
            r23 = r0
            r22 = r1
            long r0 = r8.f16242a
            long r3 = r8.f16243b
            long r0 = r0 + r3
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02fb
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r2, r9, r6, r7, r7)
            r3.setStartDelay(r0)
            long r13 = r13 - r0
            r3.setDuration(r13)
            r5.add(r3)
        L_0x02fb:
            r0 = r22
        L_0x02fd:
            r8.a(r0)
            r5.add(r0)
            f8.a r0 = new f8.a
            r0.<init>(r11)
            r1 = r24
            r1.add(r0)
        L_0x030d:
            if (r15 != 0) goto L_0x0314
            r6 = r28
            r3 = r23
            goto L_0x0368
        L_0x0314:
            r0 = r2
            f8.d r0 = (f8.d) r0
            java.util.WeakHashMap<android.view.View, d2.d1> r3 = d2.i0.f7217a
            android.content.res.ColorStateList r3 = d2.i0.i.g(r26)
            if (r3 == 0) goto L_0x032c
            int[] r4 = r26.getDrawableState()
            int r6 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r4, r6)
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r6 = r28
            if (r6 == 0) goto L_0x0347
            if (r29 != 0) goto L_0x033a
            r0.setCircularRevealScrimColor(r3)
        L_0x033a:
            f8.d$c r3 = f8.d.c.f8605a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r3, r8)
            goto L_0x0353
        L_0x0347:
            r7 = 1
            r9 = 0
            f8.d$c r4 = f8.d.c.f8605a
            int[] r8 = new int[r7]
            r8[r9] = r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
        L_0x0353:
            v7.b r3 = v7.b.f16233a
            r0.setEvaluator(r3)
            r3 = r23
            v7.g r4 = r3.f6257a
            java.lang.String r7 = "color"
            v7.h r4 = r4.c(r7)
            r4.a(r0)
            r5.add(r0)
        L_0x0368:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x036e
            goto L_0x03d9
        L_0x036e:
            r4 = 2131297001(0x7f0902e9, float:1.8211935E38)
            android.view.View r4 = r2.findViewById(r4)
            if (r4 == 0) goto L_0x0381
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x037f
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x039e
        L_0x037f:
            r0 = 0
            goto L_0x039e
        L_0x0381:
            boolean r4 = r2 instanceof d9.c
            if (r4 != 0) goto L_0x0390
            boolean r4 = r2 instanceof d9.b
            if (r4 == 0) goto L_0x038a
            goto L_0x0390
        L_0x038a:
            if (r0 == 0) goto L_0x037f
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x039e
        L_0x0390:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4 = 0
            android.view.View r0 = r0.getChildAt(r4)
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x037f
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x039e:
            if (r0 != 0) goto L_0x03a1
            goto L_0x03d9
        L_0x03a1:
            if (r6 == 0) goto L_0x03be
            if (r29 != 0) goto L_0x03af
            v7.c r4 = v7.c.f16234a
            r7 = 0
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r4.set(r0, r7)
        L_0x03af:
            v7.c r4 = v7.c.f16234a
            r7 = 1
            float[] r7 = new float[r7]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r7[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r7)
            goto L_0x03cb
        L_0x03be:
            r7 = 1
            r9 = 0
            v7.c r4 = v7.c.f16234a
            float[] r7 = new float[r7]
            r8 = 0
            r7[r9] = r8
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r4, r7)
        L_0x03cb:
            v7.g r3 = r3.f6257a
            java.lang.String r4 = "contentFade"
            v7.h r3 = r3.c(r4)
            r3.a(r0)
            r5.add(r0)
        L_0x03d9:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            cb.c.k(r0, r5)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r26
            r3.<init>(r6, r2, r4)
            r0.addListener(r3)
            int r2 = r1.size()
            r10 = 0
        L_0x03f0:
            if (r10 >= r2) goto L_0x03fe
            java.lang.Object r3 = r1.get(r10)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r10 = r10 + 1
            goto L_0x03f0
        L_0x03fe:
            return r0
        L_0x03ff:
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            r2 = 0
            r8.set(r2, r2, r0, r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, cb.b bVar) {
        RectF rectF = this.f6249d;
        RectF rectF2 = this.f6250e;
        y(view, rectF);
        rectF.offset(this.f6252g, this.f6253h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, cb.b bVar) {
        RectF rectF = this.f6249d;
        RectF rectF2 = this.f6250e;
        y(view, rectF);
        rectF.offset(this.f6252g, this.f6253h);
        y(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f6251f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public abstract b z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
