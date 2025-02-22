package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.d1;
import androidx.fragment.app.p;
import androidx.lifecycle.j;
import androidx.lifecycle.q;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import j1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import u2.c;
import u2.g;
import y2.b;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f2052a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2053b;

    /* renamed from: c  reason: collision with root package name */
    public final p f2054c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2055d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2056e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2057a;

        public a(View view) {
            this.f2057a = view;
        }

        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f2057a;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.h.c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public o0(e0 e0Var, c cVar, p pVar) {
        this.f2052a = e0Var;
        this.f2053b = cVar;
        this.f2054c = pVar;
    }

    public final void a() {
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + pVar);
        }
        Bundle bundle = pVar.f2061b;
        pVar.R.Q();
        pVar.f2059a = 3;
        pVar.f2062b0 = false;
        pVar.F(bundle);
        if (pVar.f2062b0) {
            if (i0.J(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + pVar);
            }
            View view = pVar.f2066d0;
            if (view != null) {
                Bundle bundle2 = pVar.f2061b;
                SparseArray<Parcelable> sparseArray = pVar.f2063c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    pVar.f2063c = null;
                }
                if (pVar.f2066d0 != null) {
                    y0 y0Var = pVar.f2076m0;
                    y0Var.f2173e.b(pVar.f2065d);
                    pVar.f2065d = null;
                }
                pVar.f2062b0 = false;
                pVar.a0(bundle2);
                if (!pVar.f2062b0) {
                    throw new i1(q.b("Fragment ", pVar, " did not call through to super.onViewStateRestored()"));
                } else if (pVar.f2066d0 != null) {
                    pVar.f2076m0.a(j.a.ON_CREATE);
                }
            }
            pVar.f2061b = null;
            j0 j0Var = pVar.R;
            j0Var.F = false;
            j0Var.G = false;
            j0Var.M.f2026i = false;
            j0Var.t(4);
            this.f2052a.a(false);
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        View view;
        View view2;
        c cVar = this.f2053b;
        cVar.getClass();
        p pVar = this.f2054c;
        ViewGroup viewGroup = pVar.f2064c0;
        int i8 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) cVar.f9755a;
            int indexOf = arrayList.indexOf(pVar);
            int i10 = indexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        p pVar2 = (p) arrayList.get(indexOf);
                        if (pVar2.f2064c0 == viewGroup && (view = pVar2.f2066d0) != null) {
                            i8 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    p pVar3 = (p) arrayList.get(i10);
                    if (pVar3.f2064c0 == viewGroup && (view2 = pVar3.f2066d0) != null) {
                        i8 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        pVar.f2064c0.addView(pVar.f2066d0, i8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.o0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.i0.J(r0)
            androidx.fragment.app.p r1 = r7.f2054c
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L_0x001c:
            androidx.fragment.app.p r0 = r1.D
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            r4 = 0
            j1.c r5 = r7.f2053b
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.B
            java.lang.Object r5 = r5.f9756b
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.o0 r0 = (androidx.fragment.app.o0) r0
            if (r0 == 0) goto L_0x0041
            androidx.fragment.app.p r2 = r1.D
            java.lang.String r2 = r2.B
            r1.E = r2
            r1.D = r4
            r4 = r0
            goto L_0x0087
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            androidx.fragment.app.p r1 = r1.D
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r0 = r1.E
            if (r0 == 0) goto L_0x0087
            java.lang.Object r4 = r5.f9756b
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            r4 = r0
            androidx.fragment.app.o0 r4 = (androidx.fragment.app.o0) r4
            if (r4 == 0) goto L_0x0070
            goto L_0x0087
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r1.E
            java.lang.String r1 = androidx.activity.g.a(r4, r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x0087:
            if (r4 == 0) goto L_0x008c
            r4.k()
        L_0x008c:
            androidx.fragment.app.i0 r0 = r1.P
            androidx.fragment.app.c0<?> r2 = r0.f1985u
            r1.Q = r2
            androidx.fragment.app.p r0 = r0.f1987w
            r1.S = r0
            androidx.fragment.app.e0 r0 = r7.f2052a
            r2 = 0
            r0.g(r2)
            java.util.ArrayList<androidx.fragment.app.p$e> r3 = r1.f2082s0
            java.util.Iterator r4 = r3.iterator()
        L_0x00a2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.p$e r5 = (androidx.fragment.app.p.e) r5
            r5.a()
            goto L_0x00a2
        L_0x00b2:
            r3.clear()
            androidx.fragment.app.j0 r3 = r1.R
            androidx.fragment.app.c0<?> r4 = r1.Q
            androidx.fragment.app.z r5 = r1.j()
            r3.b(r4, r5, r1)
            r1.f2059a = r2
            r1.f2062b0 = r2
            androidx.fragment.app.c0<?> r3 = r1.Q
            android.content.Context r3 = r3.f1915c
            r1.I(r3)
            boolean r3 = r1.f2062b0
            if (r3 == 0) goto L_0x00f8
            androidx.fragment.app.i0 r3 = r1.P
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.m0> r4 = r3.f1978n
            java.util.Iterator r4 = r4.iterator()
        L_0x00d7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00e7
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.m0 r5 = (androidx.fragment.app.m0) r5
            r5.a(r3, r1)
            goto L_0x00d7
        L_0x00e7:
            androidx.fragment.app.j0 r1 = r1.R
            r1.F = r2
            r1.G = r2
            androidx.fragment.app.l0 r3 = r1.M
            r3.f2026i = r2
            r1.t(r2)
            r0.b(r2)
            return
        L_0x00f8:
            androidx.fragment.app.i1 r0 = new androidx.fragment.app.i1
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.String r1 = androidx.fragment.app.q.b(r6, r1, r2)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0.c():void");
    }

    public final int d() {
        d1.b bVar;
        p pVar = this.f2054c;
        if (pVar.P == null) {
            return pVar.f2059a;
        }
        int i8 = this.f2056e;
        int ordinal = pVar.f2074k0.ordinal();
        int i10 = 0;
        if (ordinal == 1) {
            i8 = Math.min(i8, 0);
        } else if (ordinal == 2) {
            i8 = Math.min(i8, 1);
        } else if (ordinal == 3) {
            i8 = Math.min(i8, 5);
        } else if (ordinal != 4) {
            i8 = Math.min(i8, -1);
        }
        if (pVar.K) {
            if (pVar.L) {
                i8 = Math.max(this.f2056e, 2);
                View view = pVar.f2066d0;
                if (view != null && view.getParent() == null) {
                    i8 = Math.min(i8, 2);
                }
            } else {
                i8 = this.f2056e < 4 ? Math.min(i8, pVar.f2059a) : Math.min(i8, 1);
            }
        }
        if (!pVar.H) {
            i8 = Math.min(i8, 1);
        }
        ViewGroup viewGroup = pVar.f2064c0;
        if (viewGroup != null) {
            d1 f10 = d1.f(viewGroup, pVar.u().H());
            f10.getClass();
            d1.b d10 = f10.d(pVar);
            if (d10 != null) {
                i10 = d10.f1933b;
            }
            Iterator<d1.b> it = f10.f1928c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.f1934c.equals(pVar) && !bVar.f1937f) {
                    break;
                }
            }
            if (bVar != null && (i10 == 0 || i10 == 1)) {
                i10 = bVar.f1933b;
            }
        }
        if (i10 == 2) {
            i8 = Math.min(i8, 6);
        } else if (i10 == 3) {
            i8 = Math.max(i8, 3);
        } else if (pVar.I) {
            i8 = pVar.E() ? Math.min(i8, 1) : Math.min(i8, -1);
        }
        if (pVar.f2068e0 && pVar.f2059a < 5) {
            i8 = Math.min(i8, 4);
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i8 + " for " + pVar);
        }
        return i8;
    }

    public final void e() {
        Parcelable parcelable;
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "moveto CREATED: " + pVar);
        }
        if (!pVar.f2072i0) {
            e0 e0Var = this.f2052a;
            e0Var.h(false);
            Bundle bundle = pVar.f2061b;
            pVar.R.Q();
            pVar.f2059a = 1;
            pVar.f2062b0 = false;
            pVar.f2075l0.a(new Fragment$6(pVar));
            pVar.f2079p0.b(bundle);
            pVar.J(bundle);
            pVar.f2072i0 = true;
            if (pVar.f2062b0) {
                pVar.f2075l0.f(j.a.ON_CREATE);
                e0Var.c(false);
                return;
            }
            throw new i1(q.b("Fragment ", pVar, " did not call through to super.onCreate()"));
        }
        Bundle bundle2 = pVar.f2061b;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            pVar.R.X(parcelable);
            j0 j0Var = pVar.R;
            j0Var.F = false;
            j0Var.G = false;
            j0Var.M.f2026i = false;
            j0Var.t(1);
        }
        pVar.f2059a = 1;
    }

    public final void f() {
        String str;
        p pVar = this.f2054c;
        if (!pVar.K) {
            if (i0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + pVar);
            }
            LayoutInflater P = pVar.P(pVar.f2061b);
            ViewGroup viewGroup = pVar.f2064c0;
            if (viewGroup == null) {
                int i8 = pVar.U;
                if (i8 == 0) {
                    viewGroup = null;
                } else if (i8 != -1) {
                    viewGroup = (ViewGroup) pVar.P.f1986v.r(i8);
                    if (viewGroup == null) {
                        if (!pVar.M) {
                            try {
                                str = pVar.v().getResourceName(pVar.U);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(pVar.U) + " (" + str + ") for fragment " + pVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        c.b bVar = u2.c.f15701a;
                        g gVar = new g(pVar, viewGroup);
                        u2.c.c(gVar);
                        c.b a10 = u2.c.a(pVar);
                        if (a10.f15708a.contains(c.a.B) && u2.c.e(a10, pVar.getClass(), g.class)) {
                            u2.c.b(a10, gVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(q.b("Cannot create fragment ", pVar, " for a container view with no id"));
                }
            }
            pVar.f2064c0 = viewGroup;
            pVar.b0(P, viewGroup, pVar.f2061b);
            View view = pVar.f2066d0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                pVar.f2066d0.setTag(R.id.fragment_container_view_tag, pVar);
                if (viewGroup != null) {
                    b();
                }
                if (pVar.W) {
                    pVar.f2066d0.setVisibility(8);
                }
                View view2 = pVar.f2066d0;
                WeakHashMap<View, d2.d1> weakHashMap = i0.f7217a;
                if (i0.g.b(view2)) {
                    i0.h.c(pVar.f2066d0);
                } else {
                    View view3 = pVar.f2066d0;
                    view3.addOnAttachStateChangeListener(new a(view3));
                }
                pVar.Z(pVar.f2066d0);
                pVar.R.t(2);
                this.f2052a.m(pVar, pVar.f2066d0, false);
                int visibility = pVar.f2066d0.getVisibility();
                pVar.n().f2097l = pVar.f2066d0.getAlpha();
                if (pVar.f2064c0 != null && visibility == 0) {
                    View findFocus = pVar.f2066d0.findFocus();
                    if (findFocus != null) {
                        pVar.n().m = findFocus;
                        if (i0.J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + pVar);
                        }
                    }
                    pVar.f2066d0.setAlpha(0.0f);
                }
            }
            pVar.f2059a = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.i0.J(r0)
            androidx.fragment.app.p r1 = r9.f2054c
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L_0x001c:
            boolean r0 = r1.I
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002a
            boolean r0 = r1.E()
            if (r0 != 0) goto L_0x002a
            r0 = r2
            goto L_0x002b
        L_0x002a:
            r0 = r3
        L_0x002b:
            r4 = 0
            j1.c r5 = r9.f2053b
            if (r0 == 0) goto L_0x0039
            boolean r6 = r1.J
            if (r6 != 0) goto L_0x0039
            java.lang.String r6 = r1.B
            r5.k(r6, r4)
        L_0x0039:
            if (r0 != 0) goto L_0x0057
            java.lang.Object r6 = r5.f9758d
            androidx.fragment.app.l0 r6 = (androidx.fragment.app.l0) r6
            java.util.HashMap<java.lang.String, androidx.fragment.app.p> r7 = r6.f2021d
            java.lang.String r8 = r1.B
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L_0x004a
            goto L_0x0051
        L_0x004a:
            boolean r7 = r6.f2024g
            if (r7 == 0) goto L_0x0051
            boolean r6 = r6.f2025h
            goto L_0x0052
        L_0x0051:
            r6 = r2
        L_0x0052:
            if (r6 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r6 = r3
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            if (r6 == 0) goto L_0x00e4
            androidx.fragment.app.c0<?> r6 = r1.Q
            boolean r7 = r6 instanceof androidx.lifecycle.p0
            if (r7 == 0) goto L_0x0067
            java.lang.Object r2 = r5.f9758d
            androidx.fragment.app.l0 r2 = (androidx.fragment.app.l0) r2
            boolean r2 = r2.f2025h
            goto L_0x0074
        L_0x0067:
            android.content.Context r6 = r6.f1915c
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 == 0) goto L_0x0074
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r6 = r6.isChangingConfigurations()
            r2 = r2 ^ r6
        L_0x0074:
            if (r0 == 0) goto L_0x007a
            boolean r0 = r1.J
            if (r0 == 0) goto L_0x007c
        L_0x007a:
            if (r2 == 0) goto L_0x0083
        L_0x007c:
            java.lang.Object r0 = r5.f9758d
            androidx.fragment.app.l0 r0 = (androidx.fragment.app.l0) r0
            r0.e(r1)
        L_0x0083:
            androidx.fragment.app.j0 r0 = r1.R
            r0.k()
            androidx.lifecycle.q r0 = r1.f2075l0
            androidx.lifecycle.j$a r2 = androidx.lifecycle.j.a.ON_DESTROY
            r0.f(r2)
            r1.f2059a = r3
            r1.f2062b0 = r3
            r1.f2072i0 = r3
            r1.M()
            boolean r0 = r1.f2062b0
            if (r0 == 0) goto L_0x00d6
            androidx.fragment.app.e0 r0 = r9.f2052a
            r0.d(r3)
            java.util.ArrayList r0 = r5.f()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.o0 r2 = (androidx.fragment.app.o0) r2
            if (r2 == 0) goto L_0x00a9
            java.lang.String r3 = r1.B
            androidx.fragment.app.p r2 = r2.f2054c
            java.lang.String r6 = r2.E
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00a9
            r2.D = r1
            r2.E = r4
            goto L_0x00a9
        L_0x00c8:
            java.lang.String r0 = r1.E
            if (r0 == 0) goto L_0x00d2
            androidx.fragment.app.p r0 = r5.c(r0)
            r1.D = r0
        L_0x00d2:
            r5.j(r9)
            goto L_0x00f6
        L_0x00d6:
            androidx.fragment.app.i1 r0 = new androidx.fragment.app.i1
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onDestroy()"
            java.lang.String r1 = androidx.fragment.app.q.b(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x00e4:
            java.lang.String r0 = r1.E
            if (r0 == 0) goto L_0x00f4
            androidx.fragment.app.p r0 = r5.c(r0)
            if (r0 == 0) goto L_0x00f4
            boolean r2 = r0.Y
            if (r2 == 0) goto L_0x00f4
            r1.D = r0
        L_0x00f4:
            r1.f2059a = r3
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0.g():void");
    }

    public final void h() {
        View view;
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + pVar);
        }
        ViewGroup viewGroup = pVar.f2064c0;
        if (!(viewGroup == null || (view = pVar.f2066d0) == null)) {
            viewGroup.removeView(view);
        }
        pVar.R.t(1);
        if (pVar.f2066d0 != null) {
            y0 y0Var = pVar.f2076m0;
            y0Var.c();
            if (y0Var.f2172d.f2304d.compareTo(j.b.f2279c) >= 0) {
                pVar.f2076m0.a(j.a.ON_DESTROY);
            }
        }
        pVar.f2059a = 1;
        pVar.f2062b0 = false;
        pVar.N();
        if (pVar.f2062b0) {
            o.g<b.a> gVar = y2.a.a(pVar).f17124b.f17133d;
            int j10 = gVar.j();
            for (int i8 = 0; i8 < j10; i8++) {
                gVar.k(i8).l();
            }
            pVar.N = false;
            this.f2052a.n(false);
            pVar.f2064c0 = null;
            pVar.f2066d0 = null;
            pVar.f2076m0 = null;
            pVar.f2077n0.k(null);
            pVar.L = false;
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + pVar);
        }
        pVar.f2059a = -1;
        boolean z10 = false;
        pVar.f2062b0 = false;
        pVar.O();
        if (pVar.f2062b0) {
            j0 j0Var = pVar.R;
            if (!j0Var.H) {
                j0Var.k();
                pVar.R = new j0();
            }
            this.f2052a.e(false);
            pVar.f2059a = -1;
            pVar.Q = null;
            pVar.S = null;
            pVar.P = null;
            boolean z11 = true;
            if (pVar.I && !pVar.E()) {
                z10 = true;
            }
            if (!z10) {
                l0 l0Var = (l0) this.f2053b.f9758d;
                if (l0Var.f2021d.containsKey(pVar.B) && l0Var.f2024g) {
                    z11 = l0Var.f2025h;
                }
                if (!z11) {
                    return;
                }
            }
            if (i0.J(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + pVar);
            }
            pVar.B();
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        p pVar = this.f2054c;
        if (pVar.K && pVar.L && !pVar.N) {
            if (i0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + pVar);
            }
            pVar.b0(pVar.P(pVar.f2061b), (ViewGroup) null, pVar.f2061b);
            View view = pVar.f2066d0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                pVar.f2066d0.setTag(R.id.fragment_container_view_tag, pVar);
                if (pVar.W) {
                    pVar.f2066d0.setVisibility(8);
                }
                pVar.Z(pVar.f2066d0);
                pVar.R.t(2);
                this.f2052a.m(pVar, pVar.f2066d0, false);
                pVar.f2059a = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f2055d;
        p pVar = this.f2054c;
        if (!z10) {
            try {
                this.f2055d = true;
                boolean z11 = false;
                while (true) {
                    int d10 = d();
                    int i8 = pVar.f2059a;
                    j1.c cVar = this.f2053b;
                    if (d10 != i8) {
                        if (d10 <= i8) {
                            switch (i8 - 1) {
                                case IntegrityErrorCode.API_NOT_AVAILABLE /*-1*/:
                                    i();
                                    break;
                                case 0:
                                    if (pVar.J) {
                                        if (((n0) ((HashMap) cVar.f9757c).get(pVar.B)) == null) {
                                            p();
                                        }
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    pVar.f2059a = 1;
                                    break;
                                case 2:
                                    pVar.L = false;
                                    pVar.f2059a = 2;
                                    break;
                                case 3:
                                    if (i0.J(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + pVar);
                                    }
                                    if (pVar.J) {
                                        p();
                                    } else if (pVar.f2066d0 != null && pVar.f2063c == null) {
                                        q();
                                    }
                                    if (!(pVar.f2066d0 == null || (viewGroup2 = pVar.f2064c0) == null)) {
                                        d1 f10 = d1.f(viewGroup2, pVar.u().H());
                                        f10.getClass();
                                        if (i0.J(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + pVar);
                                        }
                                        f10.a(1, 3, this);
                                    }
                                    pVar.f2059a = 3;
                                    break;
                                case 4:
                                    s();
                                    break;
                                case 5:
                                    pVar.f2059a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i8 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(pVar.f2066d0 == null || (viewGroup3 = pVar.f2064c0) == null)) {
                                        d1 f11 = d1.f(viewGroup3, pVar.u().H());
                                        int b10 = g1.b(pVar.f2066d0.getVisibility());
                                        f11.getClass();
                                        if (i0.J(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + pVar);
                                        }
                                        f11.a(b10, 2, this);
                                    }
                                    pVar.f2059a = 4;
                                    break;
                                case 5:
                                    r();
                                    break;
                                case 6:
                                    pVar.f2059a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z11 = true;
                    } else {
                        if (!z11 && i8 == -1 && pVar.I && !pVar.E() && !pVar.J) {
                            if (i0.J(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + pVar);
                            }
                            ((l0) cVar.f9758d).e(pVar);
                            cVar.j(this);
                            if (i0.J(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + pVar);
                            }
                            pVar.B();
                        }
                        if (pVar.f2071h0) {
                            if (!(pVar.f2066d0 == null || (viewGroup = pVar.f2064c0) == null)) {
                                d1 f12 = d1.f(viewGroup, pVar.u().H());
                                if (pVar.W) {
                                    f12.getClass();
                                    if (i0.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + pVar);
                                    }
                                    f12.a(3, 1, this);
                                } else {
                                    f12.getClass();
                                    if (i0.J(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + pVar);
                                    }
                                    f12.a(2, 1, this);
                                }
                            }
                            i0 i0Var = pVar.P;
                            if (i0Var != null && pVar.H && i0.K(pVar)) {
                                i0Var.E = true;
                            }
                            pVar.f2071h0 = false;
                            pVar.R.n();
                        }
                        this.f2055d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f2055d = false;
                throw th;
            }
        } else if (i0.J(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + pVar);
        }
    }

    public final void l() {
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "movefrom RESUMED: " + pVar);
        }
        pVar.R.t(5);
        if (pVar.f2066d0 != null) {
            pVar.f2076m0.a(j.a.ON_PAUSE);
        }
        pVar.f2075l0.f(j.a.ON_PAUSE);
        pVar.f2059a = 6;
        pVar.f2062b0 = false;
        pVar.S();
        if (pVar.f2062b0) {
            this.f2052a.f(false);
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        p pVar = this.f2054c;
        Bundle bundle = pVar.f2061b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            pVar.f2063c = pVar.f2061b.getSparseParcelableArray("android:view_state");
            pVar.f2065d = pVar.f2061b.getBundle("android:view_registry_state");
            pVar.E = pVar.f2061b.getString("android:target_state");
            if (pVar.E != null) {
                pVar.F = pVar.f2061b.getInt("android:target_req_state", 0);
            }
            Boolean bool = pVar.f2067e;
            if (bool != null) {
                pVar.f2069f0 = bool.booleanValue();
                pVar.f2067e = null;
            } else {
                pVar.f2069f0 = pVar.f2061b.getBoolean("android:user_visible_hint", true);
            }
            if (!pVar.f2069f0) {
                pVar.f2068e0 = true;
            }
        }
    }

    public final void n() {
        boolean z10;
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "moveto RESUMED: " + pVar);
        }
        p.c cVar = pVar.f2070g0;
        View view = cVar == null ? null : cVar.m;
        if (view != null) {
            if (view != pVar.f2066d0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z10 = false;
                        break;
                    } else if (parent == pVar.f2066d0) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z10 = true;
            if (z10) {
                boolean requestFocus = view.requestFocus();
                if (i0.J(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(view);
                    sb2.append(" ");
                    sb2.append(requestFocus ? "succeeded" : "failed");
                    sb2.append(" on Fragment ");
                    sb2.append(pVar);
                    sb2.append(" resulting in focused view ");
                    sb2.append(pVar.f2066d0.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        pVar.n().m = null;
        pVar.R.Q();
        pVar.R.x(true);
        pVar.f2059a = 7;
        pVar.f2062b0 = false;
        pVar.V();
        if (pVar.f2062b0) {
            q qVar = pVar.f2075l0;
            j.a aVar = j.a.ON_RESUME;
            qVar.f(aVar);
            if (pVar.f2066d0 != null) {
                pVar.f2076m0.f2172d.f(aVar);
            }
            j0 j0Var = pVar.R;
            j0Var.F = false;
            j0Var.G = false;
            j0Var.M.f2026i = false;
            j0Var.t(7);
            this.f2052a.i(false);
            pVar.f2061b = null;
            pVar.f2063c = null;
            pVar.f2065d = null;
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        p pVar = this.f2054c;
        pVar.W(bundle);
        pVar.f2079p0.c(bundle);
        bundle.putParcelable("android:support:fragments", pVar.R.Y());
        this.f2052a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (pVar.f2066d0 != null) {
            q();
        }
        if (pVar.f2063c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", pVar.f2063c);
        }
        if (pVar.f2065d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", pVar.f2065d);
        }
        if (!pVar.f2069f0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", pVar.f2069f0);
        }
        return bundle;
    }

    public final void p() {
        p pVar = this.f2054c;
        n0 n0Var = new n0(pVar);
        if (pVar.f2059a <= -1 || n0Var.I != null) {
            n0Var.I = pVar.f2061b;
        } else {
            Bundle o10 = o();
            n0Var.I = o10;
            if (pVar.E != null) {
                if (o10 == null) {
                    n0Var.I = new Bundle();
                }
                n0Var.I.putString("android:target_state", pVar.E);
                int i8 = pVar.F;
                if (i8 != 0) {
                    n0Var.I.putInt("android:target_req_state", i8);
                }
            }
        }
        this.f2053b.k(pVar.B, n0Var);
    }

    public final void q() {
        p pVar = this.f2054c;
        if (pVar.f2066d0 != null) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + pVar + " with view " + pVar.f2066d0);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            pVar.f2066d0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                pVar.f2063c = sparseArray;
            }
            Bundle bundle = new Bundle();
            pVar.f2076m0.f2173e.c(bundle);
            if (!bundle.isEmpty()) {
                pVar.f2065d = bundle;
            }
        }
    }

    public final void r() {
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "moveto STARTED: " + pVar);
        }
        pVar.R.Q();
        pVar.R.x(true);
        pVar.f2059a = 5;
        pVar.f2062b0 = false;
        pVar.X();
        if (pVar.f2062b0) {
            q qVar = pVar.f2075l0;
            j.a aVar = j.a.ON_START;
            qVar.f(aVar);
            if (pVar.f2066d0 != null) {
                pVar.f2076m0.f2172d.f(aVar);
            }
            j0 j0Var = pVar.R;
            j0Var.F = false;
            j0Var.G = false;
            j0Var.M.f2026i = false;
            j0Var.t(5);
            this.f2052a.k(false);
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onStart()"));
    }

    public final void s() {
        boolean J = i0.J(3);
        p pVar = this.f2054c;
        if (J) {
            Log.d("FragmentManager", "movefrom STARTED: " + pVar);
        }
        j0 j0Var = pVar.R;
        j0Var.G = true;
        j0Var.M.f2026i = true;
        j0Var.t(4);
        if (pVar.f2066d0 != null) {
            pVar.f2076m0.a(j.a.ON_STOP);
        }
        pVar.f2075l0.f(j.a.ON_STOP);
        pVar.f2059a = 4;
        pVar.f2062b0 = false;
        pVar.Y();
        if (pVar.f2062b0) {
            this.f2052a.l(false);
            return;
        }
        throw new i1(q.b("Fragment ", pVar, " did not call through to super.onStop()"));
    }

    public o0(e0 e0Var, j1.c cVar, ClassLoader classLoader, b0 b0Var, n0 n0Var) {
        this.f2052a = e0Var;
        this.f2053b = cVar;
        p a10 = n0Var.a(b0Var, classLoader);
        this.f2054c = a10;
        if (i0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public o0(e0 e0Var, j1.c cVar, p pVar, n0 n0Var) {
        this.f2052a = e0Var;
        this.f2053b = cVar;
        this.f2054c = pVar;
        pVar.f2063c = null;
        pVar.f2065d = null;
        pVar.O = 0;
        pVar.L = false;
        pVar.H = false;
        p pVar2 = pVar.D;
        pVar.E = pVar2 != null ? pVar2.B : null;
        pVar.D = null;
        Bundle bundle = n0Var.I;
        if (bundle != null) {
            pVar.f2061b = bundle;
        } else {
            pVar.f2061b = new Bundle();
        }
    }
}
