package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import w1.a;

public final class c extends androidx.appcompat.view.menu.a {
    public d F;
    public Drawable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final SparseBooleanArray O = new SparseBooleanArray();
    public e P;
    public a Q;
    public C0013c R;
    public b S;
    public final f T = new f();
    public int U;

    public class a extends i {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false);
            boolean z10 = false;
            if (!((mVar.A.f770x & 32) == 32 ? true : z10)) {
                View view2 = c.this.F;
                this.f779f = view2 == null ? (View) c.this.D : view2;
            }
            f fVar = c.this.T;
            this.f782i = fVar;
            i.d dVar = this.f783j;
            if (dVar != null) {
                dVar.f(fVar);
            }
        }

        public final void c() {
            c cVar = c.this;
            cVar.Q = null;
            cVar.U = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class C0013c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final e f951a;

        public C0013c(e eVar) {
            this.f951a = eVar;
        }

        public final void run() {
            f.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f692c;
            if (!(fVar == null || (aVar = fVar.f726e) == null)) {
                aVar.b(fVar);
            }
            View view = (View) cVar.D;
            if (!(view == null || view.getWindowToken() == null)) {
                e eVar = this.f951a;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f779f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    cVar.P = eVar;
                }
            }
            cVar.R = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends m0 {
            public a(View view) {
                super(view);
            }

            public final i.f b() {
                e eVar = c.this.P;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public final boolean c() {
                c.this.n();
                return true;
            }

            public final boolean d() {
                c cVar = c.this;
                if (cVar.R != null) {
                    return false;
                }
                cVar.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            m1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        public final boolean setFrame(int i8, int i10, int i11, int i12) {
            boolean frame = super.setFrame(i8, i10, i11, i12);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f780g = 8388613;
            f fVar2 = c.this.T;
            this.f782i = fVar2;
            i.d dVar2 = this.f783j;
            if (dVar2 != null) {
                dVar2.f(fVar2);
            }
        }

        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f692c;
            if (fVar != null) {
                fVar.c(true);
            }
            cVar.P = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f694e;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }

        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f692c) {
                return false;
            }
            cVar.U = ((m) fVar).A.f748a;
            j.a aVar = cVar.f694e;
            if (aVar != null) {
                return aVar.d(fVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f955a;

        public class a implements Parcelable.Creator<g> {
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            public final Object[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f955a);
        }

        public g(Parcel parcel) {
            this.f955a = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context);
    }

    public final View a(h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i8 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f693d.inflate(this.C, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.D);
            if (this.S == null) {
                this.S = new b();
            }
            actionMenuItemView.setPopupCallback(this.S);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i8 = 8;
        }
        actionView.setVisibility(i8);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        k kVar;
        C0013c cVar = this.R;
        if (cVar == null || (kVar = this.D) == null) {
            e eVar = this.P;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f783j.dismiss();
            }
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.R = null;
        return true;
    }

    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        b();
        a aVar = this.Q;
        if (aVar != null && aVar.b()) {
            aVar.f783j.dismiss();
        }
        j.a aVar2 = this.f694e;
        if (aVar2 != null) {
            aVar2.c(fVar, z10);
        }
    }

    public final void d(boolean z10) {
        k kVar;
        int i8;
        boolean z11;
        ViewGroup viewGroup = (ViewGroup) this.D;
        ArrayList<h> arrayList = null;
        boolean z12 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f692c;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l10 = this.f692c.l();
                int size = l10.size();
                i8 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = l10.get(i10);
                    if ((hVar.f770x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i8);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View a10 = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.D).addView(a10, i8);
                        }
                        i8++;
                    }
                }
            } else {
                i8 = 0;
            }
            while (i8 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i8) == this.F) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i8);
                    z11 = true;
                }
                if (!z11) {
                    i8++;
                }
            }
        }
        ((View) this.D).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f692c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.f730i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                d2.b bVar = arrayList2.get(i11).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f692c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f731j;
        }
        if (this.I && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z12 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.F == null) {
                this.F = new d(this.f690a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.F.getParent();
            if (viewGroup3 != this.D) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.F);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.D;
                d dVar = this.F;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                cVar.gravity = 16;
                cVar.f809a = true;
                actionMenuView.addView(dVar, cVar);
            }
        } else {
            d dVar2 = this.F;
            if (dVar2 != null && dVar2.getParent() == (kVar = this.D)) {
                ((ViewGroup) kVar).removeView(this.F);
            }
        }
        ((ActionMenuView) this.D).setOverflowReserved(this.I);
    }

    public final boolean e() {
        int i8;
        ArrayList<h> arrayList;
        int i10;
        boolean z10;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f692c;
        if (fVar != null) {
            arrayList = fVar.l();
            i8 = arrayList.size();
        } else {
            i8 = 0;
            arrayList = null;
        }
        int i11 = cVar.M;
        int i12 = cVar.L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.D;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i8) {
                break;
            }
            h hVar = arrayList.get(i13);
            int i16 = hVar.f771y;
            if ((i16 & 2) == 2) {
                i14++;
            } else {
                if ((i16 & 1) == 1) {
                    i15++;
                } else {
                    z11 = true;
                }
            }
            if (cVar.N && hVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (cVar.I && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = cVar.O;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i8) {
            h hVar2 = arrayList.get(i18);
            int i20 = hVar2.f771y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = hVar2.f749b;
            if (z12) {
                View a10 = cVar.a(hVar2, (View) null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                hVar2.g(z10);
            } else {
                if ((i20 & true) == z10 ? z10 : false) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View a11 = cVar.a(hVar2, (View) null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        int i22 = 0;
                        while (i22 < i18) {
                            h hVar3 = arrayList.get(i22);
                            if (hVar3.f749b == i21) {
                                if ((hVar3.f770x & 32) == 32) {
                                    i17++;
                                }
                                hVar3.g(false);
                            }
                            i22++;
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    hVar2.g(z14);
                } else {
                    hVar2.g(false);
                    i18++;
                    i10 = 2;
                    cVar = this;
                    z10 = true;
                }
            }
            i18++;
            i10 = 2;
            cVar = this;
            z10 = true;
        }
        return z10;
    }

    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f691b = context;
        LayoutInflater.from(context);
        this.f692c = fVar;
        Resources resources = context.getResources();
        if (!this.J) {
            this.I = true;
        }
        int i8 = 2;
        this.K = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i8 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i8 = 4;
        } else if (i10 >= 360) {
            i8 = 3;
        }
        this.M = i8;
        int i12 = this.K;
        if (this.I) {
            if (this.F == null) {
                d dVar = new d(this.f690a);
                this.F = dVar;
                if (this.H) {
                    dVar.setImageDrawable(this.G);
                    this.G = null;
                    this.H = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.F.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.F.getMeasuredWidth();
        } else {
            this.F = null;
        }
        this.L = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final void i(Parcelable parcelable) {
        int i8;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i8 = ((g) parcelable).f955a) > 0 && (findItem = this.f692c.findItem(i8)) != null) {
            k((m) findItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.P;
        return eVar != null && eVar.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.f r2 = r0.f793z
            androidx.appcompat.view.menu.f r3 = r8.f692c
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.k r2 = r8.D
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            int r3 = r2.getChildCount()
            r4 = r1
        L_0x001f:
            if (r4 >= r3) goto L_0x0038
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.k.a
            if (r6 == 0) goto L_0x0035
            r6 = r5
            androidx.appcompat.view.menu.k$a r6 = (androidx.appcompat.view.menu.k.a) r6
            androidx.appcompat.view.menu.h r6 = r6.getItemData()
            androidx.appcompat.view.menu.h r7 = r0.A
            if (r6 != r7) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 != 0) goto L_0x003c
            return r1
        L_0x003c:
            androidx.appcompat.view.menu.h r0 = r9.A
            int r0 = r0.f748a
            r8.U = r0
            int r0 = r9.size()
            r2 = r1
        L_0x0047:
            r3 = 1
            if (r2 >= r0) goto L_0x005f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x005c
            r0 = r3
            goto L_0x0060
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005f:
            r0 = r1
        L_0x0060:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f691b
            r2.<init>(r4, r9, r5)
            r8.Q = r2
            r2.f781h = r0
            i.d r2 = r2.f783j
            if (r2 == 0) goto L_0x0072
            r2.q(r0)
        L_0x0072:
            androidx.appcompat.widget.c$a r0 = r8.Q
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007c
        L_0x007a:
            r1 = r3
            goto L_0x0085
        L_0x007c:
            android.view.View r2 = r0.f779f
            if (r2 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r0.d(r1, r1, r1, r1)
            goto L_0x007a
        L_0x0085:
            if (r1 == 0) goto L_0x008f
            androidx.appcompat.view.menu.j$a r0 = r8.f694e
            if (r0 == 0) goto L_0x008e
            r0.d(r9)
        L_0x008e:
            return r3
        L_0x008f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.k(androidx.appcompat.view.menu.m):boolean");
    }

    public final Parcelable l() {
        g gVar = new g();
        gVar.f955a = this.U;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.I || j() || (fVar = this.f692c) == null || this.D == null || this.R != null) {
            return false;
        }
        fVar.i();
        if (fVar.f731j.isEmpty()) {
            return false;
        }
        C0013c cVar = new C0013c(new e(this.f691b, this.f692c, this.F));
        this.R = cVar;
        ((View) this.D).post(cVar);
        return true;
    }
}
