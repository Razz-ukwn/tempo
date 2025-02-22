package com.google.android.material.bottomsheet;

import a8.d;
import a8.e;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.h1;
import d2.i0;
import d2.i1;
import d2.j1;
import d2.u1;
import e.m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v8.f;

public final class b extends m {
    public BottomSheetBehavior<FrameLayout> B;
    public FrameLayout C;
    public CoordinatorLayout D;
    public FrameLayout E;
    public boolean F;
    public boolean G;
    public boolean H;
    public C0071b I;
    public final boolean J;
    public final a K;

    public class a extends BottomSheetBehavior.c {
        public a() {
        }

        public final void b(View view) {
        }

        public final void c(View view, int i8) {
            if (i8 == 5) {
                b.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    public static class C0071b extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final Boolean f5789a;

        /* renamed from: b  reason: collision with root package name */
        public final j1 f5790b;

        /* renamed from: c  reason: collision with root package name */
        public Window f5791c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5792d;

        public C0071b(FrameLayout frameLayout, j1 j1Var) {
            ColorStateList colorStateList;
            this.f5790b = j1Var;
            f fVar = BottomSheetBehavior.w(frameLayout).f5758i;
            if (fVar != null) {
                colorStateList = fVar.f16250a.f16258c;
            } else {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                colorStateList = i0.i.g(frameLayout);
            }
            if (colorStateList != null) {
                this.f5789a = Boolean.valueOf(b1.b.g(colorStateList.getDefaultColor()));
            } else if (frameLayout.getBackground() instanceof ColorDrawable) {
                this.f5789a = Boolean.valueOf(b1.b.g(((ColorDrawable) frameLayout.getBackground()).getColor()));
            } else {
                this.f5789a = null;
            }
        }

        public final void a(View view) {
            d(view);
        }

        public final void b(View view) {
            d(view);
        }

        public final void c(View view, int i8) {
            d(view);
        }

        public final void d(View view) {
            int top = view.getTop();
            j1 j1Var = this.f5790b;
            if (top < j1Var.d()) {
                Window window = this.f5791c;
                if (window != null) {
                    Boolean bool = this.f5789a;
                    new u1(window, window.getDecorView()).f7275a.d(bool == null ? this.f5792d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), j1Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f5791c;
                if (window2 != null) {
                    new u1(window2, window2.getDecorView()).f7275a.d(this.f5792d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.f5791c != window) {
                this.f5791c = window;
                if (window != null) {
                    this.f5792d = new u1(window, window.getDecorView()).f7275a.b();
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x001b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130903157(0x7f030075, float:1.7413124E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0018
            int r5 = r5.resourceId
            goto L_0x001b
        L_0x0018:
            r5 = 2132017726(0x7f14023e, float:1.9673739E38)
        L_0x001b:
            r3.<init>(r4, r5)
            r3.F = r0
            r3.G = r0
            com.google.android.material.bottomsheet.b$a r4 = new com.google.android.material.bottomsheet.b$a
            r4.<init>()
            r3.K = r4
            e.e r4 = r3.e()
            r4.t(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 0
            r1 = 2130903564(0x7f03020c, float:1.741395E38)
            r5[r0] = r1
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r0, r0)
            r3.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.b.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        h();
        super.cancel();
    }

    public final void g() {
        if (this.C == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.C = frameLayout;
            this.D = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.C.findViewById(R.id.design_bottom_sheet);
            this.E = frameLayout2;
            BottomSheetBehavior<FrameLayout> w10 = BottomSheetBehavior.w(frameLayout2);
            this.B = w10;
            ArrayList<BottomSheetBehavior.c> arrayList = w10.W;
            a aVar = this.K;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.B.A(this.F);
        }
    }

    public final BottomSheetBehavior<FrameLayout> h() {
        if (this.B == null) {
            g();
        }
        return this.B;
    }

    public final FrameLayout i(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.C.findViewById(R.id.coordinator);
        if (i8 != 0 && view == null) {
            view = getLayoutInflater().inflate(i8, coordinatorLayout, false);
        }
        if (this.J) {
            FrameLayout frameLayout = this.E;
            a aVar = new a(this);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.i.u(frameLayout, aVar);
        }
        this.E.removeAllViews();
        if (layoutParams == null) {
            this.E.addView(view);
        } else {
            this.E.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
        i0.n(this.E, new e(this));
        this.E.setOnTouchListener(new a8.f());
        return this.C;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.J && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.C;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.D;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            boolean z11 = !z10;
            if (Build.VERSION.SDK_INT >= 30) {
                i1.a(window, z11);
            } else {
                h1.a(window, z11);
            }
            C0071b bVar = this.I;
            if (bVar != null) {
                bVar.e(window);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        C0071b bVar = this.I;
        if (bVar != null) {
            bVar.e((Window) null);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.B;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L == 5) {
            bottomSheetBehavior.C(4);
        }
    }

    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.F != z10) {
            this.F = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.B;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A(z10);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.F) {
            this.F = true;
        }
        this.G = z10;
        this.H = true;
    }

    public final void setContentView(int i8) {
        super.setContentView((View) i((View) null, i8, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) i(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) i(view, 0, layoutParams));
    }
}
