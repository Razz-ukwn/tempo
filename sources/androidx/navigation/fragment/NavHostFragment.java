package androidx.navigation.fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.b3;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import b3.d0;
import b3.e0;
import b3.l;
import b3.l0;
import b3.m;
import b3.t;
import com.quickkonnect.silencio.R;
import d3.c;
import d3.d;
import gf.k;
import gf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import m9.b;
import sf.j;

public class NavHostFragment extends p {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public d0 f2339v0;

    /* renamed from: w0  reason: collision with root package name */
    public Boolean f2340w0;

    /* renamed from: x0  reason: collision with root package name */
    public View f2341x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f2342y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2343z0;

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (this.f2343z0) {
            a aVar = new a(u());
            aVar.n(this);
            aVar.g();
        }
    }

    public final void J(Bundle bundle) {
        Bundle bundle2;
        androidx.lifecycle.j b10;
        Bundle bundle3 = bundle;
        Context e02 = e0();
        d0 d0Var = new d0(e02);
        this.f2339v0 = d0Var;
        if (!j.a(this, d0Var.m)) {
            androidx.lifecycle.p pVar = d0Var.m;
            l lVar = d0Var.f3117r;
            if (!(pVar == null || (b10 = pVar.b()) == null)) {
                b10.c(lVar);
            }
            d0Var.m = this;
            this.f2075l0.a(lVar);
        }
        while (true) {
            if (!(e02 instanceof ContextWrapper)) {
                break;
            } else if (e02 instanceof androidx.activity.p) {
                d0 d0Var2 = this.f2339v0;
                j.c(d0Var2);
                OnBackPressedDispatcher d10 = ((androidx.activity.p) e02).d();
                j.e(d10, "context as OnBackPressed…).onBackPressedDispatcher");
                if (!j.a(d10, d0Var2.f3113n)) {
                    androidx.lifecycle.p pVar2 = d0Var2.m;
                    if (pVar2 != null) {
                        m.e eVar = d0Var2.f3118s;
                        Iterator<androidx.activity.a> it = eVar.f602b.iterator();
                        while (it.hasNext()) {
                            it.next().cancel();
                        }
                        d0Var2.f3113n = d10;
                        d10.a(pVar2, eVar);
                        androidx.lifecycle.j b11 = pVar2.b();
                        l lVar2 = d0Var2.f3117r;
                        b11.c(lVar2);
                        b11.a(lVar2);
                    } else {
                        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                    }
                }
            } else {
                e02 = ((ContextWrapper) e02).getBaseContext();
                j.e(e02, "context.baseContext");
            }
        }
        d0 d0Var3 = this.f2339v0;
        j.c(d0Var3);
        Boolean bool = this.f2340w0;
        d0Var3.f3119t = bool != null && bool.booleanValue();
        d0Var3.x();
        Bundle bundle4 = null;
        this.f2340w0 = null;
        d0 d0Var4 = this.f2339v0;
        j.c(d0Var4);
        o0 s10 = s();
        t tVar = d0Var4.f3114o;
        t.a aVar = t.f3172e;
        Class cls = t.class;
        if (!j.a(tVar, (t) new m0(s10, (m0.b) aVar, 0).a(cls))) {
            if (d0Var4.f3107g.isEmpty()) {
                d0Var4.f3114o = (t) new m0(s10, (m0.b) aVar, 0).a(cls);
            } else {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
        }
        d0 d0Var5 = this.f2339v0;
        j.c(d0Var5);
        Context e03 = e0();
        i0 p10 = p();
        j.e(p10, "childFragmentManager");
        c cVar = new c(e03, p10);
        b3.o0 o0Var = d0Var5.f3120u;
        o0Var.a(cVar);
        Context e04 = e0();
        i0 p11 = p();
        j.e(p11, "childFragmentManager");
        int i8 = this.T;
        if (i8 == 0 || i8 == -1) {
            i8 = R.id.nav_host_fragment_container;
        }
        o0Var.a(new d(e04, p11, i8));
        if (bundle3 != null) {
            bundle2 = bundle3.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle3.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f2343z0 = true;
                a aVar2 = new a(u());
                aVar2.n(this);
                aVar2.g();
            }
            this.f2342y0 = bundle3.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            d0 d0Var6 = this.f2339v0;
            j.c(d0Var6);
            bundle2.setClassLoader(d0Var6.f3101a.getClassLoader());
            d0Var6.f3104d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            d0Var6.f3105e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = d0Var6.f3112l;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    d0Var6.f3111k.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                    i10++;
                    i11++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        j.e(str, "id");
                        k kVar = new k(parcelableArray.length);
                        int i12 = 0;
                        while (true) {
                            if (!(i12 < parcelableArray.length)) {
                                linkedHashMap.put(str, kVar);
                                break;
                            }
                            int i13 = i12 + 1;
                            try {
                                Parcelable parcelable = parcelableArray[i12];
                                if (parcelable != null) {
                                    kVar.addLast((b3.k) parcelable);
                                    i12 = i13;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                                }
                            } catch (ArrayIndexOutOfBoundsException e10) {
                                throw new NoSuchElementException(e10.getMessage());
                            }
                        }
                    }
                }
            }
            d0Var6.f3106f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f2342y0 != 0) {
            d0 d0Var7 = this.f2339v0;
            j.c(d0Var7);
            d0Var7.u(((e0) d0Var7.B.getValue()).b(this.f2342y0), (Bundle) null);
        } else {
            Bundle bundle5 = this.C;
            int i14 = bundle5 != null ? bundle5.getInt("android-support-nav:fragment:graphId") : 0;
            if (bundle5 != null) {
                bundle4 = bundle5.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i14 != 0) {
                d0 d0Var8 = this.f2339v0;
                j.c(d0Var8);
                d0Var8.u(((e0) d0Var8.B.getValue()).b(i14), bundle4);
            }
        }
        super.J(bundle);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        j.e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i8 = this.T;
        if (i8 == 0 || i8 == -1) {
            i8 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i8);
        return fragmentContainerView;
    }

    public final void N() {
        this.f2062b0 = true;
        View view = this.f2341x0;
        if (view != null && l0.b(view) == this.f2339v0) {
            view.setTag(R.id.nav_controller_view_tag, (Object) null);
        }
        this.f2341x0 = null;
    }

    public final void Q(Context context, AttributeSet attributeSet, Bundle bundle) {
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        super.Q(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f11321b);
        j.e(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2342y0 = resourceId;
        }
        ff.m mVar = ff.m.f8717a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b3.f1263c);
        j.e(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f2343z0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public final void U(boolean z10) {
        d0 d0Var = this.f2339v0;
        if (d0Var != null) {
            d0Var.f3119t = z10;
            d0Var.x();
            return;
        }
        this.f2340w0 = Boolean.valueOf(z10);
    }

    public final void W(Bundle bundle) {
        Bundle bundle2;
        d0 d0Var = this.f2339v0;
        j.c(d0Var);
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : y.W(d0Var.f3120u.f3152a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h3 = ((b3.m0) entry.getValue()).h();
            if (h3 != null) {
                arrayList.add(str);
                bundle3.putBundle(str, h3);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        k<b3.j> kVar = d0Var.f3107g;
        if (!kVar.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[kVar.f8975c];
            Iterator<b3.j> it = kVar.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                parcelableArr[i8] = new b3.k(it.next());
                i8++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = d0Var.f3111k;
        if (!linkedHashMap.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                iArr[i10] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i10++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = d0Var.f3112l;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                k kVar2 = (k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[kVar2.f8975c];
                Iterator it2 = kVar2.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        parcelableArr2[i11] = (b3.k) next;
                        i11 = i12;
                    } else {
                        cb.d.i0();
                        throw null;
                    }
                }
                bundle2.putParcelableArray(j0.t.a("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (d0Var.f3106f) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", d0Var.f3106f);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f2343z0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i13 = this.f2342y0;
        if (i13 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i13);
        }
    }

    public final void Z(View view) {
        j.f(view, "view");
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, this.f2339v0);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.f2341x0 = view2;
                    if (view2.getId() == this.T) {
                        View view3 = this.f2341x0;
                        j.c(view3);
                        view3.setTag(R.id.nav_controller_view_tag, this.f2339v0);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
