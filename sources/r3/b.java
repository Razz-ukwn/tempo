package r3;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import d2.d1;
import d2.i0;
import java.util.HashMap;
import java.util.WeakHashMap;

public final class b extends k {
    public static final String[] T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C0259b U = new C0259b();
    public static final c V = new c();
    public static final d W = new d();
    public static final e X = new e();
    public static final f Y = new f();

    public class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f13793a = new Rect();

        public a() {
            super(PointF.class, "boundsOrigin");
        }

        public final Object get(Object obj) {
            Rect rect = this.f13793a;
            ((Drawable) obj).copyBounds(rect);
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            Rect rect = this.f13793a;
            drawable.copyBounds(rect);
            rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(rect);
        }
    }

    /* renamed from: r3.b$b  reason: collision with other inner class name */
    public class C0259b extends Property<i, PointF> {
        public C0259b() {
            super(PointF.class, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f13796a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f13797b = round;
            int i8 = iVar.f13801f + 1;
            iVar.f13801f = i8;
            if (i8 == iVar.f13802g) {
                v.a(iVar.f13800e, iVar.f13796a, round, iVar.f13798c, iVar.f13799d);
                iVar.f13801f = 0;
                iVar.f13802g = 0;
            }
        }
    }

    public class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f13798c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f13799d = round;
            int i8 = iVar.f13802g + 1;
            iVar.f13802g = i8;
            if (iVar.f13801f == i8) {
                v.a(iVar.f13800e, iVar.f13796a, iVar.f13797b, iVar.f13798c, round);
                iVar.f13801f = 0;
                iVar.f13802g = 0;
            }
        }
    }

    public class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            v.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            v.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            v.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f13794a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f13795b;

        public h(ViewGroup viewGroup) {
            this.f13795b = viewGroup;
        }

        public final void a() {
            t.a(this.f13795b, false);
        }

        public final void b() {
            t.a(this.f13795b, false);
            this.f13794a = true;
        }

        public final void c(k kVar) {
            if (!this.f13794a) {
                t.a(this.f13795b, false);
            }
            kVar.z(this);
        }

        public final void d() {
            t.a(this.f13795b, true);
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f13796a;

        /* renamed from: b  reason: collision with root package name */
        public int f13797b;

        /* renamed from: c  reason: collision with root package name */
        public int f13798c;

        /* renamed from: d  reason: collision with root package name */
        public int f13799d;

        /* renamed from: e  reason: collision with root package name */
        public final View f13800e;

        /* renamed from: f  reason: collision with root package name */
        public int f13801f;

        /* renamed from: g  reason: collision with root package name */
        public int f13802g;

        public i(View view) {
            this.f13800e = view;
        }
    }

    static {
        new a();
    }

    public final void L(r rVar) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        View view = rVar.f13860b;
        if (i0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = rVar.f13859a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    public final void g(r rVar) {
        L(rVar);
    }

    public final void j(r rVar) {
        L(rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator n(android.view.ViewGroup r19, r3.r r20, r3.r r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0131
            if (r2 != 0) goto L_0x000c
            goto L_0x0131
        L_0x000c:
            java.util.HashMap r1 = r1.f13859a
            java.util.HashMap r4 = r2.f13859a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r6 = r1.get(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r5 = r4.get(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r6 == 0) goto L_0x012f
            if (r5 != 0) goto L_0x0024
            goto L_0x012f
        L_0x0024:
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r6 = r1.get(r5)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            java.lang.Object r5 = r4.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r7 = r6.left
            int r8 = r5.left
            int r9 = r6.top
            int r10 = r5.top
            int r11 = r6.right
            int r12 = r5.right
            int r6 = r6.bottom
            int r5 = r5.bottom
            int r13 = r11 - r7
            int r14 = r6 - r9
            int r15 = r12 - r8
            int r3 = r5 - r10
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r4.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r4 = 1
            if (r13 == 0) goto L_0x005d
            if (r14 != 0) goto L_0x0061
        L_0x005d:
            if (r15 == 0) goto L_0x0072
            if (r3 == 0) goto L_0x0072
        L_0x0061:
            if (r7 != r8) goto L_0x0069
            if (r9 == r10) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r16 = 0
            goto L_0x006b
        L_0x0069:
            r16 = r4
        L_0x006b:
            if (r11 != r12) goto L_0x006f
            if (r6 == r5) goto L_0x0074
        L_0x006f:
            int r16 = r16 + 1
            goto L_0x0074
        L_0x0072:
            r16 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x007c
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x0080
        L_0x007c:
            if (r1 != 0) goto L_0x0082
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            int r16 = r16 + 1
        L_0x0082:
            r0 = r16
            if (r0 <= 0) goto L_0x012b
            android.view.View r1 = r2.f13860b
            r3.v.a(r1, r7, r9, r11, r6)
            r2 = 2
            if (r0 != r2) goto L_0x00e7
            if (r13 != r15) goto L_0x00a6
            if (r14 != r3) goto L_0x00a6
            r0 = r18
            androidx.fragment.app.z r2 = r0.P
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r2 = r2.l(r3, r5, r6, r7)
            r3.b$f r3 = Y
            r5 = 0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r1, r3, r5, r2)
            goto L_0x0111
        L_0x00a6:
            r0 = r18
            r3.b$i r3 = new r3.b$i
            r3.<init>(r1)
            androidx.fragment.app.z r13 = r0.P
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.l(r7, r9, r8, r10)
            r3.b$b r8 = U
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            androidx.fragment.app.z r8 = r0.P
            float r10 = (float) r11
            float r6 = (float) r6
            float r11 = (float) r12
            float r5 = (float) r5
            android.graphics.Path r5 = r8.l(r10, r6, r11, r5)
            r3.b$c r6 = V
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r8 = 0
            r2[r8] = r7
            r2[r4] = r5
            r6.playTogether(r2)
            r3.b$g r2 = new r3.b$g
            r2.<init>(r3)
            r6.addListener(r2)
            r2 = r6
            goto L_0x0111
        L_0x00e7:
            r0 = r18
            if (r7 != r8) goto L_0x0100
            if (r9 == r10) goto L_0x00ee
            goto L_0x0100
        L_0x00ee:
            androidx.fragment.app.z r2 = r0.P
            float r3 = (float) r11
            float r6 = (float) r6
            float r7 = (float) r12
            float r5 = (float) r5
            android.graphics.Path r2 = r2.l(r3, r6, r7, r5)
            r3.b$d r3 = W
            r5 = 0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r1, r3, r5, r2)
            goto L_0x0111
        L_0x0100:
            r5 = 0
            androidx.fragment.app.z r2 = r0.P
            float r3 = (float) r7
            float r6 = (float) r9
            float r7 = (float) r8
            float r8 = (float) r10
            android.graphics.Path r2 = r2.l(r3, r6, r7, r8)
            r3.b$e r3 = X
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r1, r3, r5, r2)
        L_0x0111:
            android.view.ViewParent r3 = r1.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x012a
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3.t.a(r1, r4)
            r3.b$h r3 = new r3.b$h
            r3.<init>(r1)
            r0.a(r3)
        L_0x012a:
            return r2
        L_0x012b:
            r0 = r18
            r1 = 0
            return r1
        L_0x012f:
            r1 = 0
            return r1
        L_0x0131:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.b.n(android.view.ViewGroup, r3.r, r3.r):android.animation.Animator");
    }

    public final String[] t() {
        return T;
    }
}
