package m8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class i implements androidx.appcompat.view.menu.j {
    public LayoutInflater B;
    public int C = 0;
    public ColorStateList D;
    public int E = 0;
    public ColorStateList F;
    public ColorStateList G;
    public Drawable H;
    public RippleDrawable I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S = true;
    public int T;
    public int U;
    public int V;
    public int W = -1;
    public final a X = new a();

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f11260a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f11261b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.view.menu.f f11262c;

    /* renamed from: d  reason: collision with root package name */
    public int f11263d;

    /* renamed from: e  reason: collision with root package name */
    public c f11264e;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            i iVar = i.this;
            c cVar = iVar.f11264e;
            boolean z10 = true;
            if (cVar != null) {
                cVar.B = true;
            }
            androidx.appcompat.view.menu.h itemData = navigationMenuItemView.getItemData();
            boolean q10 = iVar.f11262c.q(itemData, iVar, 0);
            if (itemData == null || !itemData.isCheckable() || !q10) {
                z10 = false;
            } else {
                iVar.f11264e.q(itemData);
            }
            c cVar2 = iVar.f11264e;
            if (cVar2 != null) {
                cVar2.B = false;
            }
            if (z10) {
                iVar.d(false);
            }
        }
    }

    public static class b extends l {
        public b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    public class c extends RecyclerView.e<l> {
        public boolean B;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<e> f11266d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f11267e;

        public c() {
            p();
        }

        public final int d() {
            return this.f11266d.size();
        }

        public final long e(int i8) {
            return (long) i8;
        }

        public final int f(int i8) {
            e eVar = this.f11266d.get(i8);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).f11270a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void i(RecyclerView.b0 b0Var, int i8) {
            int f10 = f(i8);
            ArrayList<e> arrayList = this.f11266d;
            View view = ((l) b0Var).f2440a;
            i iVar = i.this;
            if (f10 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                navigationMenuItemView.setIconTintList(iVar.G);
                int i10 = iVar.E;
                if (i10 != 0) {
                    navigationMenuItemView.setTextAppearance(i10);
                }
                ColorStateList colorStateList = iVar.F;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = iVar.H;
                Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                i0.d.q(navigationMenuItemView, newDrawable);
                RippleDrawable rippleDrawable = iVar.I;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                g gVar = (g) arrayList.get(i8);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f11271b);
                int i11 = iVar.J;
                int i12 = iVar.K;
                navigationMenuItemView.setPadding(i11, i12, i11, i12);
                navigationMenuItemView.setIconPadding(iVar.L);
                if (iVar.R) {
                    navigationMenuItemView.setIconSize(iVar.M);
                }
                navigationMenuItemView.setMaxLines(iVar.T);
                navigationMenuItemView.c(gVar.f11270a);
                i0.n(navigationMenuItemView, new j(this, i8, false));
            } else if (f10 == 1) {
                TextView textView = (TextView) view;
                textView.setText(((g) arrayList.get(i8)).f11270a.f752e);
                int i13 = iVar.C;
                if (i13 != 0) {
                    textView.setTextAppearance(i13);
                }
                textView.setPadding(iVar.P, textView.getPaddingTop(), iVar.Q, textView.getPaddingBottom());
                ColorStateList colorStateList2 = iVar.D;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                i0.n(textView, new j(this, i8, true));
            } else if (f10 == 2) {
                f fVar = (f) arrayList.get(i8);
                view.setPadding(iVar.N, fVar.f11268a, iVar.O, fVar.f11269b);
            } else if (f10 == 3) {
                i0.n(view, new j(this, i8, true));
            }
        }

        public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
            RecyclerView.b0 b0Var;
            i iVar = i.this;
            if (i8 == 0) {
                b0Var = new C0214i(iVar.B, recyclerView, iVar.X);
            } else if (i8 == 1) {
                b0Var = new k(iVar.B, recyclerView);
            } else if (i8 == 2) {
                b0Var = new j(iVar.B, recyclerView);
            } else if (i8 != 3) {
                return null;
            } else {
                return new b(iVar.f11261b);
            }
            return b0Var;
        }

        public final void n(RecyclerView.b0 b0Var) {
            l lVar = (l) b0Var;
            if (lVar instanceof C0214i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f2440a;
                FrameLayout frameLayout = navigationMenuItemView.V;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.U.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public final void p() {
            boolean z10;
            if (!this.B) {
                this.B = true;
                ArrayList<e> arrayList = this.f11266d;
                arrayList.clear();
                arrayList.add(new d());
                i iVar = i.this;
                int size = iVar.f11262c.l().size();
                boolean z11 = false;
                int i8 = -1;
                int i10 = 0;
                boolean z12 = false;
                int i11 = 0;
                while (i10 < size) {
                    androidx.appcompat.view.menu.h hVar = iVar.f11262c.l().get(i10);
                    if (hVar.isChecked()) {
                        q(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.f(z11);
                    }
                    if (hVar.hasSubMenu()) {
                        m mVar = hVar.f761o;
                        if (mVar.hasVisibleItems()) {
                            if (i10 != 0) {
                                arrayList.add(new f(iVar.V, z11 ? 1 : 0));
                            }
                            arrayList.add(new g(hVar));
                            int size2 = mVar.size();
                            int i12 = z11;
                            int i13 = i12;
                            while (i12 < size2) {
                                androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) mVar.getItem(i12);
                                if (hVar2.isVisible()) {
                                    if (i13 == 0 && hVar2.getIcon() != null) {
                                        i13 = 1;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.f(z11);
                                    }
                                    if (hVar.isChecked()) {
                                        q(hVar);
                                    }
                                    arrayList.add(new g(hVar2));
                                }
                                i12++;
                                z11 = false;
                            }
                            if (i13 != 0) {
                                int size3 = arrayList.size();
                                for (int size4 = arrayList.size(); size4 < size3; size4++) {
                                    ((g) arrayList.get(size4)).f11271b = true;
                                }
                            }
                        }
                        z10 = true;
                    } else {
                        int i14 = hVar.f749b;
                        if (i14 != i8) {
                            i11 = arrayList.size();
                            z12 = hVar.getIcon() != null;
                            if (i10 != 0) {
                                i11++;
                                int i15 = iVar.V;
                                arrayList.add(new f(i15, i15));
                            }
                        } else if (!z12 && hVar.getIcon() != null) {
                            int size5 = arrayList.size();
                            for (int i16 = i11; i16 < size5; i16++) {
                                ((g) arrayList.get(i16)).f11271b = true;
                            }
                            z10 = true;
                            z12 = true;
                            g gVar = new g(hVar);
                            gVar.f11271b = z12;
                            arrayList.add(gVar);
                            i8 = i14;
                        }
                        z10 = true;
                        g gVar2 = new g(hVar);
                        gVar2.f11271b = z12;
                        arrayList.add(gVar2);
                        i8 = i14;
                    }
                    i10++;
                    boolean z13 = z10;
                    z11 = false;
                }
                this.B = z11;
            }
        }

        public final void q(androidx.appcompat.view.menu.h hVar) {
            if (this.f11267e != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.f11267e;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f11267e = hVar;
                hVar.setChecked(true);
            }
        }
    }

    public static class d implements e {
    }

    public interface e {
    }

    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f11268a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11269b;

        public f(int i8, int i10) {
            this.f11268a = i8;
            this.f11269b = i10;
        }
    }

    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f11270a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11271b;

        public g(androidx.appcompat.view.menu.h hVar) {
            this.f11270a = hVar;
        }
    }

    public class h extends y {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        public final void d(View view, e2.i iVar) {
            int i8;
            int i10;
            super.d(view, iVar);
            i iVar2 = i.this;
            if (iVar2.f11261b.getChildCount() == 0) {
                i10 = 0;
                i8 = 0;
            } else {
                i10 = 0;
                i8 = 1;
            }
            while (i10 < iVar2.f11264e.d()) {
                int f10 = iVar2.f11264e.f(i10);
                if (f10 == 0 || f10 == 1) {
                    i8++;
                }
                i10++;
            }
            iVar.f7779a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i8, 1, false));
        }
    }

    /* renamed from: m8.i$i  reason: collision with other inner class name */
    public static class C0214i extends l {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0214i(android.view.LayoutInflater r3, androidx.recyclerview.widget.RecyclerView r4, m8.i.a r5) {
            /*
                r2 = this;
                r0 = 2131492944(0x7f0c0050, float:1.8609354E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m8.i.C0214i.<init>(android.view.LayoutInflater, androidx.recyclerview.widget.RecyclerView, m8.i$a):void");
        }
    }

    public static class j extends l {
        public j(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, recyclerView, false));
        }
    }

    public static class k extends l {
        public k(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, recyclerView, false));
        }
    }

    public static abstract class l extends RecyclerView.b0 {
        public l(View view) {
            super(view);
        }
    }

    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
    }

    public final void d(boolean z10) {
        c cVar = this.f11264e;
        if (cVar != null) {
            cVar.p();
            cVar.g();
        }
    }

    public final boolean e() {
        return false;
    }

    public final boolean g(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public final int getId() {
        return this.f11263d;
    }

    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.B = LayoutInflater.from(context);
        this.f11262c = fVar;
        this.V = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void i(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        l lVar;
        androidx.appcompat.view.menu.h hVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f11260a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f11264e;
                cVar.getClass();
                int i8 = bundle2.getInt("android:menu:checked", 0);
                ArrayList<e> arrayList = cVar.f11266d;
                if (i8 != 0) {
                    cVar.B = true;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        e eVar = arrayList.get(i10);
                        if ((eVar instanceof g) && (hVar2 = ((g) eVar).f11270a) != null && hVar2.f748a == i8) {
                            cVar.q(hVar2);
                            break;
                        }
                        i10++;
                    }
                    cVar.B = false;
                    cVar.p();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        e eVar2 = arrayList.get(i11);
                        if (!(!(eVar2 instanceof g) || (hVar = ((g) eVar2).f11270a) == null || (actionView = hVar.getActionView()) == null || (lVar = (l) sparseParcelableArray2.get(hVar.f748a)) == null)) {
                            actionView.restoreHierarchyState(lVar);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f11261b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final boolean k(m mVar) {
        return false;
    }

    public final Parcelable l() {
        Bundle bundle = new Bundle();
        if (this.f11260a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f11260a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f11264e;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.h hVar = cVar.f11267e;
            if (hVar != null) {
                bundle2.putInt("android:menu:checked", hVar.f748a);
            }
            SparseArray sparseArray2 = new SparseArray();
            ArrayList<e> arrayList = cVar.f11266d;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar = arrayList.get(i8);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h hVar2 = ((g) eVar).f11270a;
                    View actionView = hVar2 != null ? hVar2.getActionView() : null;
                    if (actionView != null) {
                        l lVar = new l();
                        actionView.saveHierarchyState(lVar);
                        sparseArray2.put(hVar2.f748a, lVar);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f11261b != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f11261b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }
}
