package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f974a;

    /* renamed from: b  reason: collision with root package name */
    public final j f975b;

    /* renamed from: c  reason: collision with root package name */
    public int f976c = -1;

    /* renamed from: d  reason: collision with root package name */
    public f1 f977d;

    /* renamed from: e  reason: collision with root package name */
    public f1 f978e;

    /* renamed from: f  reason: collision with root package name */
    public f1 f979f;

    public e(View view) {
        this.f974a = view;
        this.f975b = j.a();
    }

    public final void a() {
        View view = this.f974a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z10 = false;
            if (this.f977d != null) {
                if (this.f979f == null) {
                    this.f979f = new f1();
                }
                f1 f1Var = this.f979f;
                f1Var.f997a = null;
                f1Var.f1000d = false;
                f1Var.f998b = null;
                f1Var.f999c = false;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                ColorStateList g10 = i0.i.g(view);
                if (g10 != null) {
                    f1Var.f1000d = true;
                    f1Var.f997a = g10;
                }
                PorterDuff.Mode h3 = i0.i.h(view);
                if (h3 != null) {
                    f1Var.f999c = true;
                    f1Var.f998b = h3;
                }
                if (f1Var.f1000d || f1Var.f999c) {
                    j.e(background, f1Var, view.getDrawableState());
                    z10 = true;
                }
                if (z10) {
                    return;
                }
            }
            f1 f1Var2 = this.f978e;
            if (f1Var2 != null) {
                j.e(background, f1Var2, view.getDrawableState());
                return;
            }
            f1 f1Var3 = this.f977d;
            if (f1Var3 != null) {
                j.e(background, f1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        f1 f1Var = this.f978e;
        if (f1Var != null) {
            return f1Var.f997a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        f1 f1Var = this.f978e;
        if (f1Var != null) {
            return f1Var.f998b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r1.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            android.view.View r0 = r8.f974a
            android.content.Context r1 = r0.getContext()
            int[] r4 = cb.e.W
            androidx.appcompat.widget.h1 r1 = androidx.appcompat.widget.h1.m(r1, r9, r4, r10)
            android.view.View r2 = r8.f974a
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.f1015b
            r5 = r9
            r7 = r10
            d2.i0.m(r2, r3, r4, r5, r6, r7)
            r9 = 0
            boolean r10 = r1.l(r9)     // Catch:{ all -> 0x0065 }
            r2 = -1
            if (r10 == 0) goto L_0x0040
            int r9 = r1.i(r9, r2)     // Catch:{ all -> 0x0065 }
            r8.f976c = r9     // Catch:{ all -> 0x0065 }
            androidx.appcompat.widget.j r9 = r8.f975b     // Catch:{ all -> 0x0065 }
            android.content.Context r10 = r0.getContext()     // Catch:{ all -> 0x0065 }
            int r3 = r8.f976c     // Catch:{ all -> 0x0065 }
            monitor-enter(r9)     // Catch:{ all -> 0x0065 }
            androidx.appcompat.widget.v0 r4 = r9.f1027a     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r10 = r4.h(r10, r3)     // Catch:{ all -> 0x003d }
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x0040
            r8.g(r10)     // Catch:{ all -> 0x0065 }
            goto L_0x0040
        L_0x003d:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            throw r10     // Catch:{ all -> 0x0065 }
        L_0x0040:
            r9 = 1
            boolean r10 = r1.l(r9)     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x004e
            android.content.res.ColorStateList r9 = r1.b(r9)     // Catch:{ all -> 0x0065 }
            d2.i0.i.q(r0, r9)     // Catch:{ all -> 0x0065 }
        L_0x004e:
            r9 = 2
            boolean r10 = r1.l(r9)     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x0061
            int r9 = r1.h(r9, r2)     // Catch:{ all -> 0x0065 }
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.j0.b(r9, r10)     // Catch:{ all -> 0x0065 }
            d2.i0.i.r(r0, r9)     // Catch:{ all -> 0x0065 }
        L_0x0061:
            r1.n()
            return
        L_0x0065:
            r9 = move-exception
            r1.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f976c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i8) {
        ColorStateList colorStateList;
        this.f976c = i8;
        j jVar = this.f975b;
        if (jVar != null) {
            Context context = this.f974a.getContext();
            synchronized (jVar) {
                colorStateList = jVar.f1027a.h(context, i8);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f977d == null) {
                this.f977d = new f1();
            }
            f1 f1Var = this.f977d;
            f1Var.f997a = colorStateList;
            f1Var.f1000d = true;
        } else {
            this.f977d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f978e == null) {
            this.f978e = new f1();
        }
        f1 f1Var = this.f978e;
        f1Var.f997a = colorStateList;
        f1Var.f1000d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f978e == null) {
            this.f978e = new f1();
        }
        f1 f1Var = this.f978e;
        f1Var.f998b = mode;
        f1Var.f999c = true;
        a();
    }
}
