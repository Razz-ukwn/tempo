package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import i.d;
import java.util.WeakHashMap;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f774a;

    /* renamed from: b  reason: collision with root package name */
    public final f f775b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f776c;

    /* renamed from: d  reason: collision with root package name */
    public final int f777d;

    /* renamed from: e  reason: collision with root package name */
    public final int f778e;

    /* renamed from: f  reason: collision with root package name */
    public View f779f;

    /* renamed from: g  reason: collision with root package name */
    public int f780g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f781h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f782i;

    /* renamed from: j  reason: collision with root package name */
    public d f783j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f784k;

    /* renamed from: l  reason: collision with root package name */
    public final a f785l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public final void onDismiss() {
            i.this.c();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(Context context, f fVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z10);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.j, i.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v10, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.d a() {
        /*
            r14 = this;
            i.d r0 = r14.f783j
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "window"
            android.content.Context r1 = r14.f774a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            androidx.appcompat.view.menu.i.b.a(r0, r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0045
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f774a
            android.view.View r3 = r14.f779f
            int r4 = r14.f777d
            int r5 = r14.f778e
            boolean r6 = r14.f776c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0057
        L_0x0045:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r10 = r14.f774a
            androidx.appcompat.view.menu.f r12 = r14.f775b
            android.view.View r11 = r14.f779f
            int r8 = r14.f777d
            int r9 = r14.f778e
            boolean r13 = r14.f776c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0057:
            androidx.appcompat.view.menu.f r1 = r14.f775b
            r0.n(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f785l
            r0.t(r1)
            android.view.View r1 = r14.f779f
            r0.p(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f782i
            r0.f(r1)
            boolean r1 = r14.f781h
            r0.q(r1)
            int r1 = r14.f780g
            r0.r(r1)
            r14.f783j = r0
        L_0x0077:
            i.d r0 = r14.f783j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.i.a():i.d");
    }

    public final boolean b() {
        d dVar = this.f783j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f783j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f784k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i8, int i10, boolean z10, boolean z11) {
        d a10 = a();
        a10.u(z11);
        if (z10) {
            int i11 = this.f780g;
            View view = this.f779f;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if ((Gravity.getAbsoluteGravity(i11, i0.e.d(view)) & 7) == 5) {
                i8 -= this.f779f.getWidth();
            }
            a10.s(i8);
            a10.v(i10);
            int i12 = (int) ((this.f774a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f9356a = new Rect(i8 - i12, i10 - i12, i8 + i12, i10 + i12);
        }
        a10.b();
    }

    public i(int i8, int i10, Context context, View view, f fVar, boolean z10) {
        this.f780g = 8388611;
        this.f785l = new a();
        this.f774a = context;
        this.f775b = fVar;
        this.f779f = view;
        this.f776c = z10;
        this.f777d = i8;
        this.f778e = i10;
    }
}
