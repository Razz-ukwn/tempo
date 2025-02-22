package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import d2.d1;
import d2.i0;
import e2.i;
import java.util.WeakHashMap;
import l2.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public l2.c f5713a;

    /* renamed from: b  reason: collision with root package name */
    public b f5714b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5715c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5716d;

    /* renamed from: e  reason: collision with root package name */
    public int f5717e = 2;

    /* renamed from: f  reason: collision with root package name */
    public final float f5718f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public float f5719g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f5720h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    public final a f5721i = new a();

    public class a extends c.C0205c {

        /* renamed from: a  reason: collision with root package name */
        public int f5722a;

        /* renamed from: b  reason: collision with root package name */
        public int f5723b = -1;

        public a() {
        }

        public final int a(View view, int i8) {
            int i10;
            int i11;
            int i12;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            boolean z10 = i0.e.d(view) == 1;
            int i13 = SwipeDismissBehavior.this.f5717e;
            if (i13 != 0) {
                if (i13 != 1) {
                    i11 = this.f5722a - view.getWidth();
                    i10 = view.getWidth() + this.f5722a;
                } else if (z10) {
                    i11 = this.f5722a;
                    i12 = view.getWidth();
                } else {
                    i11 = this.f5722a - view.getWidth();
                    i10 = this.f5722a;
                }
                return Math.min(Math.max(i11, i8), i10);
            } else if (z10) {
                i11 = this.f5722a - view.getWidth();
                i10 = this.f5722a;
                return Math.min(Math.max(i11, i8), i10);
            } else {
                i11 = this.f5722a;
                i12 = view.getWidth();
            }
            i10 = i12 + i11;
            return Math.min(Math.max(i11, i8), i10);
        }

        public final int b(View view, int i8) {
            return view.getTop();
        }

        public final int c(View view) {
            return view.getWidth();
        }

        public final void g(View view, int i8) {
            this.f5723b = i8;
            this.f5722a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f5716d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f5716d = false;
            }
        }

        public final void h(int i8) {
            b bVar = SwipeDismissBehavior.this.f5714b;
            if (bVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((e) bVar).f6092a;
                if (i8 == 0) {
                    g b10 = g.b();
                    BaseTransientBottomBar.c cVar = baseTransientBottomBar.f6073s;
                    synchronized (b10.f6095a) {
                        if (b10.c(cVar)) {
                            g.c cVar2 = b10.f6097c;
                            if (cVar2.f6102c) {
                                cVar2.f6102c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                } else if (i8 == 1 || i8 == 2) {
                    g b11 = g.b();
                    BaseTransientBottomBar.c cVar3 = baseTransientBottomBar.f6073s;
                    synchronized (b11.f6095a) {
                        if (b11.c(cVar3)) {
                            g.c cVar4 = b11.f6097c;
                            if (!cVar4.f6102c) {
                                cVar4.f6102c = true;
                                b11.f6096b.removeCallbacksAndMessages(cVar4);
                            }
                        }
                    }
                }
            }
        }

        public final void i(View view, int i8, int i10) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = ((float) view.getWidth()) * swipeDismissBehavior.f5719g;
            float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f5720h;
            float abs = (float) Math.abs(i8 - this.f5722a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f5722a) >= java.lang.Math.round(((float) r9.getWidth()) * r3.f5718f)) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f5723b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, d2.d1> r5 = d2.i0.f7217a
                int r5 = d2.i0.e.d(r9)
                if (r5 != r2) goto L_0x001a
                r5 = r2
                goto L_0x001b
            L_0x001a:
                r5 = r4
            L_0x001b:
                int r6 = r3.f5717e
                r7 = 2
                if (r6 != r7) goto L_0x0021
                goto L_0x0052
            L_0x0021:
                if (r6 != 0) goto L_0x002d
                if (r5 == 0) goto L_0x002a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0054
                goto L_0x0052
            L_0x002a:
                if (r1 <= 0) goto L_0x0054
                goto L_0x0052
            L_0x002d:
                if (r6 != r2) goto L_0x0054
                if (r5 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0054
                goto L_0x0052
            L_0x0034:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L_0x0054
                goto L_0x0052
            L_0x0039:
                int r1 = r9.getLeft()
                int r5 = r8.f5722a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r3.f5718f
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L_0x0054
            L_0x0052:
                r1 = r2
                goto L_0x0055
            L_0x0054:
                r1 = r4
            L_0x0055:
                if (r1 == 0) goto L_0x006b
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L_0x0066
                int r10 = r9.getLeft()
                int r0 = r8.f5722a
                if (r10 >= r0) goto L_0x0064
                goto L_0x0066
            L_0x0064:
                int r0 = r0 + r11
                goto L_0x006e
            L_0x0066:
                int r10 = r8.f5722a
                int r0 = r10 - r11
                goto L_0x006e
            L_0x006b:
                int r0 = r8.f5722a
                r2 = r4
            L_0x006e:
                l2.c r10 = r3.f5713a
                int r11 = r9.getTop()
                boolean r10 = r10.q(r0, r11)
                if (r10 == 0) goto L_0x0085
                com.google.android.material.behavior.SwipeDismissBehavior$c r10 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, d2.d1> r11 = d2.i0.f7217a
                d2.i0.d.m(r9, r10)
                goto L_0x0090
            L_0x0085:
                if (r2 == 0) goto L_0x0090
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = r3.f5714b
                if (r10 == 0) goto L_0x0090
                com.google.android.material.snackbar.e r10 = (com.google.android.material.snackbar.e) r10
                r10.a(r9)
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        public final boolean k(View view, int i8) {
            int i10 = this.f5723b;
            return (i10 == -1 || i10 == i8) && SwipeDismissBehavior.this.s(view);
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f5725a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5726b;

        public c(View view, boolean z10) {
            this.f5725a = view;
            this.f5726b = z10;
        }

        public final void run() {
            b bVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            l2.c cVar = swipeDismissBehavior.f5713a;
            View view = this.f5725a;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.m(view, this);
            } else if (this.f5726b && (bVar = swipeDismissBehavior.f5714b) != null) {
                ((e) bVar).a(view);
            }
        }
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10 = this.f5715c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.i(v3, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5715c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5715c = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f5713a == null) {
            this.f5713a = new l2.c(coordinatorLayout.getContext(), coordinatorLayout, this.f5721i);
        }
        return !this.f5716d && this.f5713a.r(motionEvent);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i8) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.d.c(v3) == 0) {
            i0.d.s(v3, 1);
            i0.k(v3, 1048576);
            i0.h(v3, 0);
            if (s(v3)) {
                i0.l(v3, i.a.f7790n, new a(this));
            }
        }
        return false;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        if (this.f5713a == null) {
            return false;
        }
        if (this.f5716d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5713a.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
