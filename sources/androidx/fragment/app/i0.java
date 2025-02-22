package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.a1;
import androidx.fragment.app.p;
import androidx.fragment.app.q0;
import androidx.lifecycle.j;
import androidx.lifecycle.p0;
import com.quickkonnect.silencio.R;
import d2.q;
import d2.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import s1.x;
import s1.y;

public abstract class i0 {
    public androidx.activity.result.f A;
    public androidx.activity.result.f B;
    public androidx.activity.result.f C;
    public ArrayDeque<l> D = new ArrayDeque<>();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<a> J;
    public ArrayList<Boolean> K;
    public ArrayList<p> L;
    public l0 M;
    public final f N = new f();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f1966a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1967b;

    /* renamed from: c  reason: collision with root package name */
    public final j1.c f1968c = new j1.c(1);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f1969d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<p> f1970e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f1971f = new d0(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1972g;

    /* renamed from: h  reason: collision with root package name */
    public final b f1973h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1974i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, c> f1975j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f1976k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f1977l = Collections.synchronizedMap(new HashMap());
    public final e0 m = new e0(this);

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<m0> f1978n = new CopyOnWriteArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final f0 f1979o = new f0(this);

    /* renamed from: p  reason: collision with root package name */
    public final g0 f1980p = new g0(this);

    /* renamed from: q  reason: collision with root package name */
    public final u f1981q = new u(this, 1);

    /* renamed from: r  reason: collision with root package name */
    public final v f1982r = new v(this, 1);

    /* renamed from: s  reason: collision with root package name */
    public final c f1983s = new c();

    /* renamed from: t  reason: collision with root package name */
    public int f1984t = -1;

    /* renamed from: u  reason: collision with root package name */
    public c0<?> f1985u;

    /* renamed from: v  reason: collision with root package name */
    public z f1986v;

    /* renamed from: w  reason: collision with root package name */
    public p f1987w;

    /* renamed from: x  reason: collision with root package name */
    public p f1988x;

    /* renamed from: y  reason: collision with root package name */
    public final d f1989y = new d();

    /* renamed from: z  reason: collision with root package name */
    public final e f1990z = new e();

    public class a implements androidx.activity.result.b<Map<String, Boolean>> {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void a(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                iArr[i8] = ((Boolean) arrayList.get(i8)).booleanValue() ? 0 : -1;
            }
            i0 i0Var = i0.this;
            l pollFirst = i0Var.D.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            j1.c cVar = i0Var.f1968c;
            String str = pollFirst.f1999a;
            if (cVar.e(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    public class b extends androidx.activity.n {
        public b() {
            super(false);
        }

        public final void a() {
            i0 i0Var = i0.this;
            i0Var.x(true);
            if (i0Var.f1973h.f601a) {
                i0Var.R();
            } else {
                i0Var.f1972g.b();
            }
        }
    }

    public class c implements t {
        public c() {
        }

        public final boolean a(MenuItem menuItem) {
            return i0.this.o(menuItem);
        }

        public final void b(Menu menu) {
            i0.this.p();
        }

        public final void c(Menu menu, MenuInflater menuInflater) {
            i0.this.j(menu, menuInflater);
        }

        public final void d(Menu menu) {
            i0.this.s(menu);
        }
    }

    public class d extends b0 {
        public d() {
        }

        public final p a(String str) {
            Context context = i0.this.f1985u.f1915c;
            Object obj = p.f2058u0;
            try {
                return (p) b0.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e10) {
                throw new p.d(b2.c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (IllegalAccessException e11) {
                throw new p.d(b2.c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new p.d(b2.c.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new p.d(b2.c.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    public class e implements h1 {
    }

    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            i0.this.x(true);
        }
    }

    public class g implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f1996a;

        public g(p pVar) {
            this.f1996a = pVar;
        }

        public final void a(i0 i0Var, p pVar) {
            this.f1996a.getClass();
        }
    }

    public class h implements androidx.activity.result.b<androidx.activity.result.a> {
        public h() {
        }

        public final void a(Object obj) {
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            i0 i0Var = i0.this;
            l pollFirst = i0Var.D.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            j1.c cVar = i0Var.f1968c;
            String str = pollFirst.f1999a;
            p e10 = cVar.e(str);
            if (e10 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            e10.G(pollFirst.f2000b, aVar.f609a, aVar.f610b);
        }
    }

    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        public final void a(Object obj) {
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            i0 i0Var = i0.this;
            l pollFirst = i0Var.D.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            j1.c cVar = i0Var.f1968c;
            String str = pollFirst.f1999a;
            p e10 = cVar.e(str);
            if (e10 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            e10.G(pollFirst.f2000b, aVar.f609a, aVar.f610b);
        }
    }

    public static class j extends c.a<androidx.activity.result.i, androidx.activity.result.a> {
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.i iVar = (androidx.activity.result.i) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = iVar.f630b;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = iVar.f629a;
                    sf.j.f(intentSender, "intentSender");
                    iVar = new androidx.activity.result.i(intentSender, (Intent) null, iVar.f631c, iVar.f632d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
            if (i0.J(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        public final Object c(Intent intent, int i8) {
            return new androidx.activity.result.a(intent, i8);
        }
    }

    public static abstract class k {
    }

    public interface m {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class n implements m {

        /* renamed from: a  reason: collision with root package name */
        public final String f2001a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2002b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2003c;

        public n(String str, int i8, int i10) {
            this.f2001a = str;
            this.f2002b = i8;
            this.f2003c = i10;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            p pVar = i0.this.f1988x;
            if (pVar != null && this.f2002b < 0 && this.f2001a == null && pVar.p().R()) {
                return false;
            }
            return i0.this.T(arrayList, arrayList2, this.f2001a, this.f2002b, this.f2003c);
        }
    }

    public class o implements m {

        /* renamed from: a  reason: collision with root package name */
        public final String f2005a;

        public o(String str) {
            this.f2005a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fa, code lost:
            r3.add(r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(java.util.ArrayList<androidx.fragment.app.a> r11, java.util.ArrayList<java.lang.Boolean> r12) {
            /*
                r10 = this;
                androidx.fragment.app.i0 r0 = androidx.fragment.app.i0.this
                java.util.Map<java.lang.String, androidx.fragment.app.c> r1 = r0.f1975j
                java.lang.String r2 = r10.f2005a
                java.lang.Object r1 = r1.remove(r2)
                androidx.fragment.app.c r1 = (androidx.fragment.app.c) r1
                r2 = 0
                if (r1 != 0) goto L_0x0011
                goto L_0x0113
            L_0x0011:
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Iterator r4 = r11.iterator()
            L_0x001a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0046
                java.lang.Object r5 = r4.next()
                androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
                boolean r6 = r5.f1900t
                if (r6 == 0) goto L_0x001a
                java.util.ArrayList<androidx.fragment.app.q0$a> r5 = r5.f2106a
                java.util.Iterator r5 = r5.iterator()
            L_0x0030:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x001a
                java.lang.Object r6 = r5.next()
                androidx.fragment.app.q0$a r6 = (androidx.fragment.app.q0.a) r6
                androidx.fragment.app.p r6 = r6.f2122b
                if (r6 == 0) goto L_0x0030
                java.lang.String r7 = r6.B
                r3.put(r7, r6)
                goto L_0x0030
            L_0x0046:
                java.util.HashMap r4 = new java.util.HashMap
                java.util.List<java.lang.String> r5 = r1.f1912a
                int r6 = r5.size()
                r4.<init>(r6)
                java.util.Iterator r5 = r5.iterator()
            L_0x0055:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L_0x008e
                java.lang.Object r6 = r5.next()
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r3.get(r6)
                androidx.fragment.app.p r7 = (androidx.fragment.app.p) r7
                if (r7 == 0) goto L_0x006f
                java.lang.String r6 = r7.B
                r4.put(r6, r7)
                goto L_0x0055
            L_0x006f:
                j1.c r7 = r0.f1968c
                r8 = 0
                androidx.fragment.app.n0 r6 = r7.k(r6, r8)
                if (r6 == 0) goto L_0x0055
                androidx.fragment.app.b0 r7 = r0.G()
                androidx.fragment.app.c0<?> r8 = r0.f1985u
                android.content.Context r8 = r8.f1915c
                java.lang.ClassLoader r8 = r8.getClassLoader()
                androidx.fragment.app.p r6 = r6.a(r7, r8)
                java.lang.String r7 = r6.B
                r4.put(r7, r6)
                goto L_0x0055
            L_0x008e:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.List<androidx.fragment.app.b> r1 = r1.f1913b
                java.util.Iterator r1 = r1.iterator()
            L_0x0099:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x00fe
                java.lang.Object r5 = r1.next()
                androidx.fragment.app.b r5 = (androidx.fragment.app.b) r5
                r5.getClass()
                androidx.fragment.app.a r6 = new androidx.fragment.app.a
                r6.<init>((androidx.fragment.app.i0) r0)
                r5.a(r6)
                r7 = r2
            L_0x00b1:
                java.util.ArrayList<java.lang.String> r8 = r5.f1905b
                int r9 = r8.size()
                if (r7 >= r9) goto L_0x00fa
                java.lang.Object r8 = r8.get(r7)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x00f7
                java.lang.Object r9 = r4.get(r8)
                androidx.fragment.app.p r9 = (androidx.fragment.app.p) r9
                if (r9 == 0) goto L_0x00d4
                java.util.ArrayList<androidx.fragment.app.q0$a> r8 = r6.f2106a
                java.lang.Object r8 = r8.get(r7)
                androidx.fragment.app.q0$a r8 = (androidx.fragment.app.q0.a) r8
                r8.f2122b = r9
                goto L_0x00f7
            L_0x00d4:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                java.lang.String r0 = "Restoring FragmentTransaction "
                r12.<init>(r0)
                java.lang.String r0 = r5.B
                r12.append(r0)
                java.lang.String r0 = " failed due to missing saved state for Fragment ("
                r12.append(r0)
                r12.append(r8)
                java.lang.String r0 = ")"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                r11.<init>(r12)
                throw r11
            L_0x00f7:
                int r7 = r7 + 1
                goto L_0x00b1
            L_0x00fa:
                r3.add(r6)
                goto L_0x0099
            L_0x00fe:
                java.util.Iterator r0 = r3.iterator()
            L_0x0102:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0113
                java.lang.Object r1 = r0.next()
                androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
                r1.a(r11, r12)
                r2 = 1
                goto L_0x0102
            L_0x0113:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i0.o.a(java.util.ArrayList, java.util.ArrayList):boolean");
        }
    }

    public class p implements m {

        /* renamed from: a  reason: collision with root package name */
        public final String f2007a;

        public p(String str) {
            this.f2007a = str;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            String str;
            int i8;
            i0 i0Var = i0.this;
            String str2 = this.f2007a;
            int B = i0Var.B(str2, -1, true);
            if (B < 0) {
                return false;
            }
            int i10 = B;
            while (i10 < i0Var.f1969d.size()) {
                a aVar = i0Var.f1969d.get(i10);
                if (aVar.f2120p) {
                    i10++;
                } else {
                    i0Var.h0(new IllegalArgumentException("saveBackStack(\"" + str2 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i11 = B;
            while (true) {
                int i12 = 2;
                if (i11 < i0Var.f1969d.size()) {
                    a aVar2 = i0Var.f1969d.get(i11);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator<q0.a> it = aVar2.f2106a.iterator();
                    while (it.hasNext()) {
                        q0.a next = it.next();
                        p pVar = next.f2122b;
                        if (pVar != null) {
                            if (!next.f2123c || (i8 = next.f2121a) == 1 || i8 == i12 || i8 == 8) {
                                hashSet.add(pVar);
                                hashSet2.add(pVar);
                            }
                            int i13 = next.f2121a;
                            if (i13 == 1 || i13 == 2) {
                                hashSet3.add(pVar);
                            }
                            i12 = 2;
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder c3 = androidx.activity.result.d.c("saveBackStack(\"", str2, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        if (hashSet2.size() == 1) {
                            str = " " + hashSet2.iterator().next();
                        } else {
                            str = "s " + hashSet2;
                        }
                        c3.append(str);
                        c3.append(" in ");
                        c3.append(aVar2);
                        c3.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        i0Var.h0(new IllegalArgumentException(c3.toString()));
                        throw null;
                    }
                    i11++;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        p pVar2 = (p) arrayDeque.removeFirst();
                        if (pVar2.Y) {
                            StringBuilder c10 = androidx.activity.result.d.c("saveBackStack(\"", str2, "\") must not contain retained fragments. Found ");
                            c10.append(hashSet.contains(pVar2) ? "direct reference to retained " : "retained child ");
                            c10.append("fragment ");
                            c10.append(pVar2);
                            i0Var.h0(new IllegalArgumentException(c10.toString()));
                            throw null;
                        }
                        Iterator it2 = pVar2.R.f1968c.g().iterator();
                        while (it2.hasNext()) {
                            p pVar3 = (p) it2.next();
                            if (pVar3 != null) {
                                arrayDeque.addLast(pVar3);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((p) it3.next()).B);
                    }
                    ArrayList arrayList4 = new ArrayList(i0Var.f1969d.size() - B);
                    for (int i14 = B; i14 < i0Var.f1969d.size(); i14++) {
                        arrayList4.add((Object) null);
                    }
                    c cVar = new c(arrayList3, arrayList4);
                    for (int size = i0Var.f1969d.size() - 1; size >= B; size--) {
                        a remove = i0Var.f1969d.remove(size);
                        a aVar3 = new a(remove);
                        ArrayList<q0.a> arrayList5 = aVar3.f2106a;
                        int size2 = arrayList5.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            q0.a aVar4 = arrayList5.get(size2);
                            if (aVar4.f2123c) {
                                if (aVar4.f2121a == 8) {
                                    aVar4.f2123c = false;
                                    size2--;
                                    arrayList5.remove(size2);
                                } else {
                                    int i15 = aVar4.f2122b.U;
                                    aVar4.f2121a = 2;
                                    aVar4.f2123c = false;
                                    for (int i16 = size2 - 1; i16 >= 0; i16--) {
                                        q0.a aVar5 = arrayList5.get(i16);
                                        if (aVar5.f2123c && aVar5.f2122b.U == i15) {
                                            arrayList5.remove(i16);
                                            size2--;
                                        }
                                    }
                                }
                            }
                        }
                        arrayList4.set(size - B, new b(aVar3));
                        remove.f1900t = true;
                        arrayList.add(remove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    i0Var.f1975j.put(str2, cVar);
                    return true;
                }
            }
        }
    }

    public static boolean J(int i8) {
        return Log.isLoggable("FragmentManager", i8);
    }

    public static boolean K(p pVar) {
        boolean z10;
        if (pVar.Z && pVar.f2060a0) {
            return true;
        }
        Iterator it = pVar.R.f1968c.g().iterator();
        boolean z11 = false;
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            p pVar2 = (p) it.next();
            if (pVar2 != null) {
                z11 = K(pVar2);
                continue;
            }
            if (z11) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    public static boolean M(p pVar) {
        if (pVar == null) {
            return true;
        }
        return pVar.f2060a0 && (pVar.P == null || M(pVar.S));
    }

    public static boolean N(p pVar) {
        if (pVar == null) {
            return true;
        }
        i0 i0Var = pVar.P;
        return pVar.equals(i0Var.f1988x) && N(i0Var.f1987w);
    }

    public static void f0(p pVar) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + pVar);
        }
        if (pVar.W) {
            pVar.W = false;
            pVar.f2071h0 = !pVar.f2071h0;
        }
    }

    public final p A(String str) {
        return this.f1968c.c(str);
    }

    public final int B(String str, int i8, boolean z10) {
        ArrayList<a> arrayList = this.f1969d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i8 >= 0) {
            int size = this.f1969d.size() - 1;
            while (size >= 0) {
                a aVar = this.f1969d.get(size);
                if ((str != null && str.equals(aVar.f2114i)) || (i8 >= 0 && i8 == aVar.f1899s)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z10) {
                while (size > 0) {
                    a aVar2 = this.f1969d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.f2114i)) && (i8 < 0 || i8 != aVar2.f1899s)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f1969d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z10) {
            return 0;
        } else {
            return this.f1969d.size() - 1;
        }
    }

    public final p C(int i8) {
        j1.c cVar = this.f1968c;
        ArrayList arrayList = (ArrayList) cVar.f9755a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                p pVar = (p) arrayList.get(size);
                if (pVar != null && pVar.T == i8) {
                    return pVar;
                }
            } else {
                for (o0 o0Var : ((HashMap) cVar.f9756b).values()) {
                    if (o0Var != null) {
                        p pVar2 = o0Var.f2054c;
                        if (pVar2.T == i8) {
                            return pVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final p D(String str) {
        j1.c cVar = this.f1968c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) cVar.f9755a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                p pVar = (p) arrayList.get(size);
                if (pVar != null && str.equals(pVar.V)) {
                    return pVar;
                }
            }
        }
        if (str != null) {
            for (o0 o0Var : ((HashMap) cVar.f9756b).values()) {
                if (o0Var != null) {
                    p pVar2 = o0Var.f2054c;
                    if (str.equals(pVar2.V)) {
                        return pVar2;
                    }
                }
            }
        } else {
            cVar.getClass();
        }
        return null;
    }

    public final p E(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        p A2 = A(string);
        if (A2 != null) {
            return A2;
        }
        h0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public final ViewGroup F(p pVar) {
        ViewGroup viewGroup = pVar.f2064c0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pVar.U > 0 && this.f1986v.z()) {
            View r10 = this.f1986v.r(pVar.U);
            if (r10 instanceof ViewGroup) {
                return (ViewGroup) r10;
            }
        }
        return null;
    }

    public final b0 G() {
        p pVar = this.f1987w;
        return pVar != null ? pVar.P.G() : this.f1989y;
    }

    public final h1 H() {
        p pVar = this.f1987w;
        return pVar != null ? pVar.P.H() : this.f1990z;
    }

    public final void I(p pVar) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + pVar);
        }
        if (!pVar.W) {
            pVar.W = true;
            pVar.f2071h0 = true ^ pVar.f2071h0;
            e0(pVar);
        }
    }

    public final boolean L() {
        p pVar = this.f1987w;
        if (pVar == null) {
            return true;
        }
        return pVar.C() && this.f1987w.u().L();
    }

    public final boolean O() {
        return this.F || this.G;
    }

    public final void P(int i8, boolean z10) {
        Object obj;
        c0<?> c0Var;
        if (this.f1985u == null && i8 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i8 != this.f1984t) {
            this.f1984t = i8;
            j1.c cVar = this.f1968c;
            Iterator it = ((ArrayList) cVar.f9755a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                obj = cVar.f9756b;
                if (!hasNext) {
                    break;
                }
                o0 o0Var = (o0) ((HashMap) obj).get(((p) it.next()).B);
                if (o0Var != null) {
                    o0Var.k();
                }
            }
            Iterator it2 = ((HashMap) obj).values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                o0 o0Var2 = (o0) it2.next();
                if (o0Var2 != null) {
                    o0Var2.k();
                    p pVar = o0Var2.f2054c;
                    if (pVar.I && !pVar.E()) {
                        z11 = true;
                    }
                    if (z11) {
                        if (pVar.J && !((HashMap) cVar.f9757c).containsKey(pVar.B)) {
                            o0Var2.p();
                        }
                        cVar.j(o0Var2);
                    }
                }
            }
            g0();
            if (this.E && (c0Var = this.f1985u) != null && this.f1984t == 7) {
                c0Var.J();
                this.E = false;
            }
        }
    }

    public final void Q() {
        if (this.f1985u != null) {
            this.F = false;
            this.G = false;
            this.M.f2026i = false;
            for (p pVar : this.f1968c.h()) {
                if (pVar != null) {
                    pVar.R.Q();
                }
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i8, int i10) {
        x(false);
        w(true);
        p pVar = this.f1988x;
        if (pVar != null && i8 < 0 && pVar.p().R()) {
            return true;
        }
        boolean T = T(this.J, this.K, (String) null, i8, i10);
        if (T) {
            this.f1967b = true;
            try {
                W(this.J, this.K);
            } finally {
                d();
            }
        }
        i0();
        if (this.I) {
            this.I = false;
            g0();
        }
        this.f1968c.b();
        return T;
    }

    public final boolean T(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i8, int i10) {
        int B2 = B(str, i8, (i10 & 1) != 0);
        if (B2 < 0) {
            return false;
        }
        for (int size = this.f1969d.size() - 1; size >= B2; size--) {
            arrayList.add(this.f1969d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(Bundle bundle, String str, p pVar) {
        if (pVar.P == this) {
            bundle.putString(str, pVar.B);
        } else {
            h0(new IllegalStateException(q.b("Fragment ", pVar, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void V(p pVar) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + pVar + " nesting=" + pVar.O);
        }
        boolean z10 = !pVar.E();
        if (!pVar.X || z10) {
            j1.c cVar = this.f1968c;
            synchronized (((ArrayList) cVar.f9755a)) {
                ((ArrayList) cVar.f9755a).remove(pVar);
            }
            pVar.H = false;
            if (K(pVar)) {
                this.E = true;
            }
            pVar.I = true;
            e0(pVar);
        }
    }

    public final void W(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i8 = 0;
                int i10 = 0;
                while (i8 < size) {
                    if (!arrayList.get(i8).f2120p) {
                        if (i10 != i8) {
                            z(arrayList, arrayList2, i10, i8);
                        }
                        i10 = i8 + 1;
                        if (arrayList2.get(i8).booleanValue()) {
                            while (i10 < size && arrayList2.get(i10).booleanValue() && !arrayList.get(i10).f2120p) {
                                i10++;
                            }
                        }
                        z(arrayList, arrayList2, i8, i10);
                        i8 = i10 - 1;
                    }
                    i8++;
                }
                if (i10 != size) {
                    z(arrayList, arrayList2, i10, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void X(Parcelable parcelable) {
        e0 e0Var;
        int i8;
        o0 o0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String next : bundle3.keySet()) {
            if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                bundle2.setClassLoader(this.f1985u.f1915c.getClassLoader());
                this.f1976k.put(next.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String next2 : bundle3.keySet()) {
            if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                bundle.setClassLoader(this.f1985u.f1915c.getClassLoader());
                arrayList.add((n0) bundle.getParcelable("state"));
            }
        }
        j1.c cVar = this.f1968c;
        HashMap hashMap = (HashMap) cVar.f9757c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            hashMap.put(n0Var.f2047b, n0Var);
        }
        k0 k0Var = (k0) bundle3.getParcelable("state");
        if (k0Var != null) {
            Object obj = cVar.f9756b;
            ((HashMap) obj).clear();
            Iterator<String> it2 = k0Var.f2013a.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                e0Var = this.m;
                if (!hasNext) {
                    break;
                }
                n0 k10 = cVar.k(it2.next(), (n0) null);
                if (k10 != null) {
                    p pVar = this.M.f2021d.get(k10.f2047b);
                    if (pVar != null) {
                        if (J(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + pVar);
                        }
                        o0Var = new o0(e0Var, cVar, pVar, k10);
                    } else {
                        o0Var = new o0(this.m, this.f1968c, this.f1985u.f1915c.getClassLoader(), G(), k10);
                    }
                    p pVar2 = o0Var.f2054c;
                    pVar2.P = this;
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + pVar2.B + "): " + pVar2);
                    }
                    o0Var.m(this.f1985u.f1915c.getClassLoader());
                    cVar.i(o0Var);
                    o0Var.f2056e = this.f1984t;
                }
            }
            l0 l0Var = this.M;
            l0Var.getClass();
            Iterator it3 = new ArrayList(l0Var.f2021d.values()).iterator();
            while (true) {
                i8 = 0;
                if (!it3.hasNext()) {
                    break;
                }
                p pVar3 = (p) it3.next();
                if (((HashMap) obj).get(pVar3.B) != null) {
                    i8 = 1;
                }
                if (i8 == 0) {
                    if (J(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + pVar3 + " that was not found in the set of active Fragments " + k0Var.f2013a);
                    }
                    this.M.g(pVar3);
                    pVar3.P = this;
                    o0 o0Var2 = new o0(e0Var, cVar, pVar3);
                    o0Var2.f2056e = 1;
                    o0Var2.k();
                    pVar3.I = true;
                    o0Var2.k();
                }
            }
            ArrayList<String> arrayList2 = k0Var.f2014b;
            ((ArrayList) cVar.f9755a).clear();
            if (arrayList2 != null) {
                for (String next3 : arrayList2) {
                    p c3 = cVar.c(next3);
                    if (c3 != null) {
                        if (J(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + c3);
                        }
                        cVar.a(c3);
                    } else {
                        throw new IllegalStateException(b2.c.a("No instantiated fragment for (", next3, ")"));
                    }
                }
            }
            if (k0Var.f2015c != null) {
                this.f1969d = new ArrayList<>(k0Var.f2015c.length);
                int i10 = 0;
                while (true) {
                    b[] bVarArr = k0Var.f2015c;
                    if (i10 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i10];
                    bVar.getClass();
                    a aVar = new a(this);
                    bVar.a(aVar);
                    aVar.f1899s = bVar.C;
                    int i11 = 0;
                    while (true) {
                        ArrayList<String> arrayList3 = bVar.f1905b;
                        if (i11 >= arrayList3.size()) {
                            break;
                        }
                        String str = arrayList3.get(i11);
                        if (str != null) {
                            aVar.f2106a.get(i11).f2122b = A(str);
                        }
                        i11++;
                    }
                    aVar.f(1);
                    if (J(2)) {
                        StringBuilder b10 = a1.b("restoreAllState: back stack #", i10, " (index ");
                        b10.append(aVar.f1899s);
                        b10.append("): ");
                        b10.append(aVar);
                        Log.v("FragmentManager", b10.toString());
                        PrintWriter printWriter = new PrintWriter(new a1());
                        aVar.k("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f1969d.add(aVar);
                    i10++;
                }
            } else {
                this.f1969d = null;
            }
            this.f1974i.set(k0Var.f2016d);
            String str2 = k0Var.f2017e;
            if (str2 != null) {
                p A2 = A(str2);
                this.f1988x = A2;
                q(A2);
            }
            ArrayList<String> arrayList4 = k0Var.B;
            if (arrayList4 != null) {
                while (i8 < arrayList4.size()) {
                    this.f1975j.put(arrayList4.get(i8), k0Var.C.get(i8));
                    i8++;
                }
            }
            this.D = new ArrayDeque<>(k0Var.D);
        }
    }

    public final Bundle Y() {
        int i8;
        b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d1 d1Var = (d1) it.next();
            if (d1Var.f1930e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                d1Var.f1930e = false;
                d1Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((d1) it2.next()).e();
        }
        x(true);
        this.F = true;
        this.M.f2026i = true;
        j1.c cVar = this.f1968c;
        cVar.getClass();
        HashMap hashMap = (HashMap) cVar.f9756b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (o0 o0Var : hashMap.values()) {
            if (o0Var != null) {
                o0Var.p();
                p pVar = o0Var.f2054c;
                arrayList2.add(pVar.B);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + pVar + ": " + pVar.f2061b);
                }
            }
        }
        j1.c cVar2 = this.f1968c;
        cVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) cVar2.f9757c).values());
        if (!arrayList3.isEmpty()) {
            j1.c cVar3 = this.f1968c;
            synchronized (((ArrayList) cVar3.f9755a)) {
                bVarArr = null;
                if (((ArrayList) cVar3.f9755a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(((ArrayList) cVar3.f9755a).size());
                    Iterator it3 = ((ArrayList) cVar3.f9755a).iterator();
                    while (it3.hasNext()) {
                        p pVar2 = (p) it3.next();
                        arrayList.add(pVar2.B);
                        if (J(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + pVar2.B + "): " + pVar2);
                        }
                    }
                }
            }
            ArrayList<a> arrayList4 = this.f1969d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                bVarArr = new b[size];
                for (i8 = 0; i8 < size; i8++) {
                    bVarArr[i8] = new b(this.f1969d.get(i8));
                    if (J(2)) {
                        StringBuilder b10 = a1.b("saveAllState: adding back stack #", i8, ": ");
                        b10.append(this.f1969d.get(i8));
                        Log.v("FragmentManager", b10.toString());
                    }
                }
            }
            k0 k0Var = new k0();
            k0Var.f2013a = arrayList2;
            k0Var.f2014b = arrayList;
            k0Var.f2015c = bVarArr;
            k0Var.f2016d = this.f1974i.get();
            p pVar3 = this.f1988x;
            if (pVar3 != null) {
                k0Var.f2017e = pVar3.B;
            }
            k0Var.B.addAll(this.f1975j.keySet());
            k0Var.C.addAll(this.f1975j.values());
            k0Var.D = new ArrayList<>(this.D);
            bundle.putParcelable("state", k0Var);
            for (String next : this.f1976k.keySet()) {
                bundle.putBundle(j0.t.a("result_", next), this.f1976k.get(next));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                n0 n0Var = (n0) it4.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", n0Var);
                bundle.putBundle("fragment_" + n0Var.f2047b, bundle2);
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final p.f Z(p pVar) {
        Bundle o10;
        o0 o0Var = (o0) ((HashMap) this.f1968c.f9756b).get(pVar.B);
        if (o0Var != null) {
            p pVar2 = o0Var.f2054c;
            if (pVar2.equals(pVar)) {
                if (pVar2.f2059a <= -1 || (o10 = o0Var.o()) == null) {
                    return null;
                }
                return new p.f(o10);
            }
        }
        h0(new IllegalStateException(q.b("Fragment ", pVar, " is not currently in the FragmentManager")));
        throw null;
    }

    public final o0 a(p pVar) {
        String str = pVar.f2073j0;
        if (str != null) {
            u2.c.d(pVar, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + pVar);
        }
        o0 f10 = f(pVar);
        pVar.P = this;
        j1.c cVar = this.f1968c;
        cVar.i(f10);
        if (!pVar.X) {
            cVar.a(pVar);
            pVar.I = false;
            if (pVar.f2066d0 == null) {
                pVar.f2071h0 = false;
            }
            if (K(pVar)) {
                this.E = true;
            }
        }
        return f10;
    }

    public final void a0() {
        synchronized (this.f1966a) {
            boolean z10 = true;
            if (this.f1966a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1985u.f1916d.removeCallbacks(this.N);
                this.f1985u.f1916d.post(this.N);
                i0();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.activity.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: androidx.fragment.app.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: androidx.fragment.app.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: androidx.fragment.app.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.c0<?> r4, androidx.fragment.app.z r5, androidx.fragment.app.p r6) {
        /*
            r3 = this;
            androidx.fragment.app.c0<?> r0 = r3.f1985u
            if (r0 != 0) goto L_0x015b
            r3.f1985u = r4
            r3.f1986v = r5
            r3.f1987w = r6
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.m0> r5 = r3.f1978n
            if (r6 == 0) goto L_0x0017
            androidx.fragment.app.i0$g r0 = new androidx.fragment.app.i0$g
            r0.<init>(r6)
            r5.add(r0)
            goto L_0x0021
        L_0x0017:
            boolean r0 = r4 instanceof androidx.fragment.app.m0
            if (r0 == 0) goto L_0x0021
            r0 = r4
            androidx.fragment.app.m0 r0 = (androidx.fragment.app.m0) r0
            r5.add(r0)
        L_0x0021:
            androidx.fragment.app.p r5 = r3.f1987w
            if (r5 == 0) goto L_0x0028
            r3.i0()
        L_0x0028:
            boolean r5 = r4 instanceof androidx.activity.p
            if (r5 == 0) goto L_0x003d
            r5 = r4
            androidx.activity.p r5 = (androidx.activity.p) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.d()
            r3.f1972g = r0
            if (r6 == 0) goto L_0x0038
            r5 = r6
        L_0x0038:
            androidx.fragment.app.i0$b r1 = r3.f1973h
            r0.a(r5, r1)
        L_0x003d:
            if (r6 == 0) goto L_0x005e
            androidx.fragment.app.i0 r4 = r6.P
            androidx.fragment.app.l0 r4 = r4.M
            java.util.HashMap<java.lang.String, androidx.fragment.app.l0> r5 = r4.f2022e
            java.lang.String r0 = r6.B
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.l0 r0 = (androidx.fragment.app.l0) r0
            if (r0 != 0) goto L_0x005b
            androidx.fragment.app.l0 r0 = new androidx.fragment.app.l0
            boolean r4 = r4.f2024g
            r0.<init>(r4)
            java.lang.String r4 = r6.B
            r5.put(r4, r0)
        L_0x005b:
            r3.M = r0
            goto L_0x0082
        L_0x005e:
            boolean r5 = r4 instanceof androidx.lifecycle.p0
            if (r5 == 0) goto L_0x007a
            androidx.lifecycle.p0 r4 = (androidx.lifecycle.p0) r4
            androidx.lifecycle.o0 r4 = r4.s()
            androidx.lifecycle.m0 r5 = new androidx.lifecycle.m0
            androidx.fragment.app.l0$a r0 = androidx.fragment.app.l0.f2020j
            r5.<init>((androidx.lifecycle.o0) r4, (androidx.lifecycle.m0.b) r0)
            java.lang.Class<androidx.fragment.app.l0> r4 = androidx.fragment.app.l0.class
            androidx.lifecycle.j0 r4 = r5.a(r4)
            androidx.fragment.app.l0 r4 = (androidx.fragment.app.l0) r4
            r3.M = r4
            goto L_0x0082
        L_0x007a:
            androidx.fragment.app.l0 r4 = new androidx.fragment.app.l0
            r5 = 0
            r4.<init>(r5)
            r3.M = r4
        L_0x0082:
            androidx.fragment.app.l0 r4 = r3.M
            boolean r5 = r3.O()
            r4.f2026i = r5
            androidx.fragment.app.l0 r4 = r3.M
            j1.c r5 = r3.f1968c
            r5.f9758d = r4
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof l3.b
            if (r5 == 0) goto L_0x00b1
            if (r6 != 0) goto L_0x00b1
            l3.b r4 = (l3.b) r4
            androidx.savedstate.a r4 = r4.w()
            androidx.fragment.app.h0 r5 = new androidx.fragment.app.h0
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.c(r0, r5)
            android.os.Bundle r4 = r4.a(r0)
            if (r4 == 0) goto L_0x00b1
            r3.X(r4)
        L_0x00b1:
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof androidx.activity.result.h
            if (r5 == 0) goto L_0x0117
            androidx.activity.result.h r4 = (androidx.activity.result.h) r4
            androidx.activity.result.g r4 = r4.q()
            if (r6 == 0) goto L_0x00cd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.B
            java.lang.String r1 = ":"
            java.lang.String r5 = androidx.activity.g.a(r5, r0, r1)
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r5 = ""
        L_0x00cf:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r5 = j0.t.a(r0, r5)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = h4.a.c(r5, r0)
            c.e r1 = new c.e
            r1.<init>()
            androidx.fragment.app.i0$h r2 = new androidx.fragment.app.i0$h
            r2.<init>()
            androidx.activity.result.f r0 = r4.d(r0, r1, r2)
            r3.A = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = h4.a.c(r5, r0)
            androidx.fragment.app.i0$j r1 = new androidx.fragment.app.i0$j
            r1.<init>()
            androidx.fragment.app.i0$i r2 = new androidx.fragment.app.i0$i
            r2.<init>()
            androidx.activity.result.f r0 = r4.d(r0, r1, r2)
            r3.B = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r5 = h4.a.c(r5, r0)
            c.c r0 = new c.c
            r0.<init>()
            androidx.fragment.app.i0$a r1 = new androidx.fragment.app.i0$a
            r1.<init>()
            androidx.activity.result.f r4 = r4.d(r5, r0, r1)
            r3.C = r4
        L_0x0117:
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof t1.c
            if (r5 == 0) goto L_0x0124
            t1.c r4 = (t1.c) r4
            androidx.fragment.app.f0 r5 = r3.f1979o
            r4.i(r5)
        L_0x0124:
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof t1.d
            if (r5 == 0) goto L_0x0131
            t1.d r4 = (t1.d) r4
            androidx.fragment.app.g0 r5 = r3.f1980p
            r4.u(r5)
        L_0x0131:
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof s1.x
            if (r5 == 0) goto L_0x013e
            s1.x r4 = (s1.x) r4
            androidx.fragment.app.u r5 = r3.f1981q
            r4.E(r5)
        L_0x013e:
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof s1.y
            if (r5 == 0) goto L_0x014b
            s1.y r4 = (s1.y) r4
            androidx.fragment.app.v r5 = r3.f1982r
            r4.B(r5)
        L_0x014b:
            androidx.fragment.app.c0<?> r4 = r3.f1985u
            boolean r5 = r4 instanceof d2.q
            if (r5 == 0) goto L_0x015a
            if (r6 != 0) goto L_0x015a
            d2.q r4 = (d2.q) r4
            androidx.fragment.app.i0$c r5 = r3.f1983s
            r4.x(r5)
        L_0x015a:
            return
        L_0x015b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i0.b(androidx.fragment.app.c0, androidx.fragment.app.z, androidx.fragment.app.p):void");
    }

    public final void b0(p pVar, boolean z10) {
        ViewGroup F2 = F(pVar);
        if (F2 != null && (F2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) F2).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void c(p pVar) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + pVar);
        }
        if (pVar.X) {
            pVar.X = false;
            if (!pVar.H) {
                this.f1968c.a(pVar);
                if (J(2)) {
                    Log.v("FragmentManager", "add from attach: " + pVar);
                }
                if (K(pVar)) {
                    this.E = true;
                }
            }
        }
    }

    public final void c0(p pVar, j.b bVar) {
        if (!pVar.equals(A(pVar.B)) || !(pVar.Q == null || pVar.P == this)) {
            throw new IllegalArgumentException("Fragment " + pVar + " is not an active fragment of FragmentManager " + this);
        }
        pVar.f2074k0 = bVar;
    }

    public final void d() {
        this.f1967b = false;
        this.K.clear();
        this.J.clear();
    }

    public final void d0(p pVar) {
        if (pVar == null || (pVar.equals(A(pVar.B)) && (pVar.Q == null || pVar.P == this))) {
            p pVar2 = this.f1988x;
            this.f1988x = pVar;
            q(pVar2);
            q(this.f1988x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + pVar + " is not an active fragment of FragmentManager " + this);
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1968c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((o0) it.next()).f2054c.f2064c0;
            if (viewGroup != null) {
                hashSet.add(d1.f(viewGroup, H()));
            }
        }
        return hashSet;
    }

    public final void e0(p pVar) {
        ViewGroup F2 = F(pVar);
        if (F2 != null) {
            p.c cVar = pVar.f2070g0;
            boolean z10 = false;
            if ((cVar == null ? 0 : cVar.f2090e) + (cVar == null ? 0 : cVar.f2089d) + (cVar == null ? 0 : cVar.f2088c) + (cVar == null ? 0 : cVar.f2087b) > 0) {
                if (F2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F2.setTag(R.id.visible_removing_fragment_view_tag, pVar);
                }
                p pVar2 = (p) F2.getTag(R.id.visible_removing_fragment_view_tag);
                p.c cVar2 = pVar.f2070g0;
                if (cVar2 != null) {
                    z10 = cVar2.f2086a;
                }
                if (pVar2.f2070g0 != null) {
                    pVar2.n().f2086a = z10;
                }
            }
        }
    }

    public final o0 f(p pVar) {
        String str = pVar.B;
        j1.c cVar = this.f1968c;
        o0 o0Var = (o0) ((HashMap) cVar.f9756b).get(str);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(this.m, cVar, pVar);
        o0Var2.m(this.f1985u.f1915c.getClassLoader());
        o0Var2.f2056e = this.f1984t;
        return o0Var2;
    }

    public final void g(p pVar) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + pVar);
        }
        if (!pVar.X) {
            pVar.X = true;
            if (pVar.H) {
                if (J(2)) {
                    Log.v("FragmentManager", "remove from detach: " + pVar);
                }
                j1.c cVar = this.f1968c;
                synchronized (((ArrayList) cVar.f9755a)) {
                    ((ArrayList) cVar.f9755a).remove(pVar);
                }
                pVar.H = false;
                if (K(pVar)) {
                    this.E = true;
                }
                e0(pVar);
            }
        }
    }

    public final void g0() {
        Iterator it = this.f1968c.f().iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            p pVar = o0Var.f2054c;
            if (pVar.f2068e0) {
                if (this.f1967b) {
                    this.I = true;
                } else {
                    pVar.f2068e0 = false;
                    o0Var.k();
                }
            }
        }
    }

    public final void h(boolean z10, Configuration configuration) {
        if (!z10 || !(this.f1985u instanceof t1.c)) {
            for (p pVar : this.f1968c.h()) {
                if (pVar != null) {
                    pVar.onConfigurationChanged(configuration);
                    if (z10) {
                        pVar.R.h(true, configuration);
                    }
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final void h0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a1());
        c0<?> c0Var = this.f1985u;
        if (c0Var != null) {
            try {
                c0Var.F(printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                u("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    public final boolean i() {
        if (this.f1984t < 1) {
            return false;
        }
        for (p pVar : this.f1968c.h()) {
            if (pVar != null) {
                if (!pVar.W ? pVar.R.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = r4.f1973h;
        r1 = r4.f1969d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r1 <= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (N(r4.f1987w) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0.f601a = r2;
        r0 = r0.f603c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.i0$m> r0 = r4.f1966a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.i0$m> r1 = r4.f1966a     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            r2 = 1
            if (r1 != 0) goto L_0x001c
            androidx.fragment.app.i0$b r1 = r4.f1973h     // Catch:{ all -> 0x0018 }
            r1.f601a = r2     // Catch:{ all -> 0x0018 }
            rf.a<ff.m> r1 = r1.f603c     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            r1.d()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r1 = move-exception
            goto L_0x0040
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            androidx.fragment.app.i0$b r0 = r4.f1973h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f1969d
            r3 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r1.size()
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            if (r1 <= 0) goto L_0x0035
            androidx.fragment.app.p r1 = r4.f1987w
            boolean r1 = N(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r0.f601a = r2
            rf.a<ff.m> r0 = r0.f603c
            if (r0 == 0) goto L_0x003f
            r0.d()
        L_0x003f:
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i0.i0():void");
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        boolean z10;
        boolean z11;
        if (this.f1984t < 1) {
            return false;
        }
        ArrayList<p> arrayList = null;
        boolean z12 = false;
        for (p pVar : this.f1968c.h()) {
            if (pVar != null && M(pVar)) {
                if (!pVar.W) {
                    if (!pVar.Z || !pVar.f2060a0) {
                        z11 = false;
                    } else {
                        pVar.K(menu, menuInflater);
                        z11 = true;
                    }
                    z10 = z11 | pVar.R.j(menu, menuInflater);
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(pVar);
                    z12 = true;
                }
            }
        }
        if (this.f1970e != null) {
            for (int i8 = 0; i8 < this.f1970e.size(); i8++) {
                p pVar2 = this.f1970e.get(i8);
                if (arrayList == null || !arrayList.contains(pVar2)) {
                    pVar2.getClass();
                }
            }
        }
        this.f1970e = arrayList;
        return z12;
    }

    public final void k() {
        boolean z10 = true;
        this.H = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((d1) it.next()).e();
        }
        c0<?> c0Var = this.f1985u;
        boolean z11 = c0Var instanceof p0;
        j1.c cVar = this.f1968c;
        if (z11) {
            z10 = ((l0) cVar.f9758d).f2025h;
        } else {
            Context context = c0Var.f1915c;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (c cVar2 : this.f1975j.values()) {
                for (String next : cVar2.f1912a) {
                    l0 l0Var = (l0) cVar.f9758d;
                    l0Var.getClass();
                    if (J(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + next);
                    }
                    l0Var.f(next);
                }
            }
        }
        t(-1);
        c0<?> c0Var2 = this.f1985u;
        if (c0Var2 instanceof t1.d) {
            ((t1.d) c0Var2).n(this.f1980p);
        }
        c0<?> c0Var3 = this.f1985u;
        if (c0Var3 instanceof t1.c) {
            ((t1.c) c0Var3).o(this.f1979o);
        }
        c0<?> c0Var4 = this.f1985u;
        if (c0Var4 instanceof x) {
            ((x) c0Var4).v(this.f1981q);
        }
        c0<?> c0Var5 = this.f1985u;
        if (c0Var5 instanceof y) {
            ((y) c0Var5).p(this.f1982r);
        }
        c0<?> c0Var6 = this.f1985u;
        if (c0Var6 instanceof q) {
            ((q) c0Var6).C(this.f1983s);
        }
        this.f1985u = null;
        this.f1986v = null;
        this.f1987w = null;
        if (this.f1972g != null) {
            Iterator<androidx.activity.a> it2 = this.f1973h.f602b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f1972g = null;
        }
        androidx.activity.result.f fVar = this.A;
        if (fVar != null) {
            fVar.b();
            this.B.b();
            this.C.b();
        }
    }

    public final void l(boolean z10) {
        if (!z10 || !(this.f1985u instanceof t1.d)) {
            for (p pVar : this.f1968c.h()) {
                if (pVar != null) {
                    pVar.onLowMemory();
                    if (z10) {
                        pVar.R.l(true);
                    }
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void m(boolean z10, boolean z11) {
        if (!z11 || !(this.f1985u instanceof x)) {
            for (p pVar : this.f1968c.h()) {
                if (pVar != null && z11) {
                    pVar.R.m(z10, true);
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void n() {
        Iterator it = this.f1968c.g().iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar != null) {
                pVar.D();
                pVar.R.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f1984t < 1) {
            return false;
        }
        for (p pVar : this.f1968c.h()) {
            if (pVar != null) {
                if (!pVar.W ? (!pVar.Z || !pVar.f2060a0 || !pVar.R(menuItem)) ? pVar.R.o(menuItem) : true : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f1984t >= 1) {
            for (p pVar : this.f1968c.h()) {
                if (pVar != null && !pVar.W) {
                    pVar.R.p();
                }
            }
        }
    }

    public final void q(p pVar) {
        if (pVar != null && pVar.equals(A(pVar.B))) {
            pVar.P.getClass();
            boolean N2 = N(pVar);
            Boolean bool = pVar.G;
            if (bool == null || bool.booleanValue() != N2) {
                pVar.G = Boolean.valueOf(N2);
                pVar.U(N2);
                j0 j0Var = pVar.R;
                j0Var.i0();
                j0Var.q(j0Var.f1988x);
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (!z11 || !(this.f1985u instanceof y)) {
            for (p pVar : this.f1968c.h()) {
                if (pVar != null && z11) {
                    pVar.R.r(z10, true);
                }
            }
            return;
        }
        h0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean s(Menu menu) {
        boolean z10;
        boolean z11;
        if (this.f1984t < 1) {
            return false;
        }
        boolean z12 = false;
        for (p pVar : this.f1968c.h()) {
            if (pVar != null && M(pVar)) {
                if (!pVar.W) {
                    if (!pVar.Z || !pVar.f2060a0) {
                        z11 = false;
                    } else {
                        pVar.T(menu);
                        z11 = true;
                    }
                    z10 = pVar.R.s(menu) | z11;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z12 = true;
                }
            }
        }
        return z12;
    }

    /* JADX INFO: finally extract failed */
    public final void t(int i8) {
        try {
            this.f1967b = true;
            for (o0 o0Var : ((HashMap) this.f1968c.f9756b).values()) {
                if (o0Var != null) {
                    o0Var.f2056e = i8;
                }
            }
            P(i8, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((d1) it.next()).e();
            }
            this.f1967b = false;
            x(true);
        } catch (Throwable th) {
            this.f1967b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        p pVar = this.f1987w;
        if (pVar != null) {
            sb2.append(pVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1987w)));
            sb2.append("}");
        } else {
            c0<?> c0Var = this.f1985u;
            if (c0Var != null) {
                sb2.append(c0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1985u)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String c3 = h4.a.c(str, "    ");
        j1.c cVar = this.f1968c;
        cVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) cVar.f9756b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o0 o0Var : hashMap.values()) {
                printWriter.print(str);
                if (o0Var != null) {
                    p pVar = o0Var.f2054c;
                    printWriter.println(pVar);
                    pVar.m(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) cVar.f9755a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size3; i8++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(((p) arrayList.get(i8)).toString());
            }
        }
        ArrayList<p> arrayList2 = this.f1970e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f1970e.get(i10).toString());
            }
        }
        ArrayList<a> arrayList3 = this.f1969d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f1969d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(c3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1974i.get());
        synchronized (this.f1966a) {
            int size4 = this.f1966a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size4; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f1966a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1985u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1986v);
        if (this.f1987w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1987w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1984t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void v(m mVar, boolean z10) {
        if (!z10) {
            if (this.f1985u == null) {
                if (this.H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1966a) {
            if (this.f1985u != null) {
                this.f1966a.add(mVar);
                a0();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void w(boolean z10) {
        if (this.f1967b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1985u == null) {
            if (this.H) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1985u.f1916d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z10 && O()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.J == null) {
            this.J = new ArrayList<>();
            this.K = new ArrayList<>();
        }
    }

    public final boolean x(boolean z10) {
        boolean z11;
        w(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<a> arrayList = this.J;
            ArrayList<Boolean> arrayList2 = this.K;
            synchronized (this.f1966a) {
                if (this.f1966a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size = this.f1966a.size();
                        z11 = false;
                        for (int i8 = 0; i8 < size; i8++) {
                            z11 |= this.f1966a.get(i8).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f1966a.clear();
                        this.f1985u.f1916d.removeCallbacks(this.N);
                    }
                }
            }
            if (z11) {
                z12 = true;
                this.f1967b = true;
                try {
                    W(this.J, this.K);
                } finally {
                    d();
                }
            } else {
                i0();
                if (this.I) {
                    this.I = false;
                    g0();
                }
                this.f1968c.b();
                return z12;
            }
        }
    }

    public final void y(m mVar, boolean z10) {
        if (!z10 || (this.f1985u != null && !this.H)) {
            w(z10);
            if (mVar.a(this.J, this.K)) {
                this.f1967b = true;
                try {
                    W(this.J, this.K);
                } finally {
                    d();
                }
            }
            i0();
            if (this.I) {
                this.I = false;
                g0();
            }
            this.f1968c.b();
        }
    }

    public final void z(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i10) {
        ViewGroup viewGroup;
        j1.c cVar;
        j1.c cVar2;
        j1.c cVar3;
        int i11;
        int i12;
        int i13;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i14 = i8;
        int i15 = i10;
        boolean z10 = arrayList3.get(i14).f2120p;
        ArrayList<p> arrayList5 = this.L;
        if (arrayList5 == null) {
            this.L = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<p> arrayList6 = this.L;
        j1.c cVar4 = this.f1968c;
        arrayList6.addAll(cVar4.h());
        p pVar = this.f1988x;
        int i16 = i14;
        boolean z11 = false;
        while (true) {
            int i17 = 1;
            if (i16 < i15) {
                a aVar = arrayList3.get(i16);
                if (!arrayList4.get(i16).booleanValue()) {
                    ArrayList<p> arrayList7 = this.L;
                    int i18 = 0;
                    while (true) {
                        ArrayList<q0.a> arrayList8 = aVar.f2106a;
                        if (i18 < arrayList8.size()) {
                            q0.a aVar2 = arrayList8.get(i18);
                            int i19 = aVar2.f2121a;
                            if (i19 != i17) {
                                if (i19 != 2) {
                                    if (i19 == 3 || i19 == 6) {
                                        arrayList7.remove(aVar2.f2122b);
                                        p pVar2 = aVar2.f2122b;
                                        if (pVar2 == pVar) {
                                            arrayList8.add(i18, new q0.a(9, pVar2));
                                            i18++;
                                            cVar3 = cVar4;
                                            i11 = 1;
                                            pVar = null;
                                        }
                                    } else if (i19 == 7) {
                                        cVar3 = cVar4;
                                        i11 = 1;
                                    } else if (i19 == 8) {
                                        arrayList8.add(i18, new q0.a(9, pVar, 0));
                                        aVar2.f2123c = true;
                                        i18++;
                                        pVar = aVar2.f2122b;
                                    }
                                    cVar3 = cVar4;
                                    i11 = 1;
                                } else {
                                    p pVar3 = aVar2.f2122b;
                                    int i20 = pVar3.U;
                                    int size = arrayList7.size() - 1;
                                    boolean z12 = false;
                                    while (size >= 0) {
                                        j1.c cVar5 = cVar4;
                                        p pVar4 = arrayList7.get(size);
                                        if (pVar4.U != i20) {
                                            i12 = i20;
                                        } else if (pVar4 == pVar3) {
                                            i12 = i20;
                                            z12 = true;
                                        } else {
                                            if (pVar4 == pVar) {
                                                i12 = i20;
                                                i13 = 0;
                                                arrayList8.add(i18, new q0.a(9, pVar4, 0));
                                                i18++;
                                                pVar = null;
                                            } else {
                                                i12 = i20;
                                                i13 = 0;
                                            }
                                            q0.a aVar3 = new q0.a(3, pVar4, i13);
                                            aVar3.f2124d = aVar2.f2124d;
                                            aVar3.f2126f = aVar2.f2126f;
                                            aVar3.f2125e = aVar2.f2125e;
                                            aVar3.f2127g = aVar2.f2127g;
                                            arrayList8.add(i18, aVar3);
                                            arrayList7.remove(pVar4);
                                            i18++;
                                            pVar = pVar;
                                        }
                                        size--;
                                        ArrayList<a> arrayList9 = arrayList;
                                        i20 = i12;
                                        cVar4 = cVar5;
                                    }
                                    cVar3 = cVar4;
                                    i11 = 1;
                                    if (z12) {
                                        arrayList8.remove(i18);
                                        i18--;
                                    } else {
                                        aVar2.f2121a = 1;
                                        aVar2.f2123c = true;
                                        arrayList7.add(pVar3);
                                    }
                                }
                                i18 += i11;
                                ArrayList<Boolean> arrayList10 = arrayList2;
                                int i21 = i8;
                                i17 = i11;
                                cVar4 = cVar3;
                                ArrayList<a> arrayList11 = arrayList;
                            } else {
                                cVar3 = cVar4;
                                i11 = i17;
                            }
                            arrayList7.add(aVar2.f2122b);
                            i18 += i11;
                            ArrayList<Boolean> arrayList102 = arrayList2;
                            int i212 = i8;
                            i17 = i11;
                            cVar4 = cVar3;
                            ArrayList<a> arrayList112 = arrayList;
                        } else {
                            cVar2 = cVar4;
                        }
                    }
                } else {
                    cVar2 = cVar4;
                    int i22 = 1;
                    ArrayList<p> arrayList12 = this.L;
                    ArrayList<q0.a> arrayList13 = aVar.f2106a;
                    int size2 = arrayList13.size() - 1;
                    while (size2 >= 0) {
                        q0.a aVar4 = arrayList13.get(size2);
                        int i23 = aVar4.f2121a;
                        if (i23 != i22) {
                            if (i23 != 3) {
                                switch (i23) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        pVar = null;
                                        break;
                                    case 9:
                                        pVar = aVar4.f2122b;
                                        break;
                                    case 10:
                                        aVar4.f2129i = aVar4.f2128h;
                                        break;
                                }
                            }
                            arrayList12.add(aVar4.f2122b);
                            size2--;
                            i22 = 1;
                        }
                        arrayList12.remove(aVar4.f2122b);
                        size2--;
                        i22 = 1;
                    }
                }
                z11 = z11 || aVar.f2112g;
                i16++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                int i24 = i8;
                cVar4 = cVar2;
            } else {
                j1.c cVar6 = cVar4;
                this.L.clear();
                if (!z10 && this.f1984t >= 1) {
                    for (int i25 = i8; i25 < i15; i25++) {
                        Iterator<q0.a> it = arrayList.get(i25).f2106a.iterator();
                        while (it.hasNext()) {
                            p pVar5 = it.next().f2122b;
                            if (pVar5 == null || pVar5.P == null) {
                                cVar = cVar6;
                            } else {
                                cVar = cVar6;
                                cVar.i(f(pVar5));
                            }
                            cVar6 = cVar;
                        }
                        j1.c cVar7 = cVar6;
                    }
                }
                ArrayList<a> arrayList14 = arrayList;
                for (int i26 = i8; i26 < i15; i26++) {
                    a aVar5 = arrayList14.get(i26);
                    if (arrayList2.get(i26).booleanValue()) {
                        aVar5.f(-1);
                        ArrayList<q0.a> arrayList15 = aVar5.f2106a;
                        for (int size3 = arrayList15.size() - 1; size3 >= 0; size3--) {
                            q0.a aVar6 = arrayList15.get(size3);
                            p pVar6 = aVar6.f2122b;
                            if (pVar6 != null) {
                                pVar6.J = aVar5.f1900t;
                                if (pVar6.f2070g0 != null) {
                                    pVar6.n().f2086a = true;
                                }
                                int i27 = aVar5.f2111f;
                                int i28 = 8194;
                                int i29 = 4097;
                                if (i27 != 4097) {
                                    if (i27 != 8194) {
                                        i28 = 8197;
                                        i29 = 4100;
                                        if (i27 != 8197) {
                                            if (i27 == 4099) {
                                                i29 = 4099;
                                            } else if (i27 != 4100) {
                                                i28 = 0;
                                            }
                                        }
                                    }
                                    i28 = i29;
                                }
                                if (!(pVar6.f2070g0 == null && i28 == 0)) {
                                    pVar6.n();
                                    pVar6.f2070g0.f2091f = i28;
                                }
                                ArrayList<String> arrayList16 = aVar5.f2119o;
                                ArrayList<String> arrayList17 = aVar5.f2118n;
                                pVar6.n();
                                p.c cVar8 = pVar6.f2070g0;
                                cVar8.f2092g = arrayList16;
                                cVar8.f2093h = arrayList17;
                            }
                            int i30 = aVar6.f2121a;
                            i0 i0Var = aVar5.f1897q;
                            switch (i30) {
                                case 1:
                                    pVar6.g0(aVar6.f2124d, aVar6.f2125e, aVar6.f2126f, aVar6.f2127g);
                                    i0Var.b0(pVar6, true);
                                    i0Var.V(pVar6);
                                    break;
                                case 3:
                                    pVar6.g0(aVar6.f2124d, aVar6.f2125e, aVar6.f2126f, aVar6.f2127g);
                                    i0Var.a(pVar6);
                                    break;
                                case 4:
                                    pVar6.g0(aVar6.f2124d, aVar6.f2125e, aVar6.f2126f, aVar6.f2127g);
                                    i0Var.getClass();
                                    f0(pVar6);
                                    break;
                                case 5:
                                    pVar6.g0(aVar6.f2124d, aVar6.f2125e, aVar6.f2126f, aVar6.f2127g);
                                    i0Var.b0(pVar6, true);
                                    i0Var.I(pVar6);
                                    break;
                                case 6:
                                    pVar6.g0(aVar6.f2124d, aVar6.f2125e, aVar6.f2126f, aVar6.f2127g);
                                    i0Var.c(pVar6);
                                    break;
                                case 7:
                                    pVar6.g0(aVar6.f2124d, aVar6.f2125e, aVar6.f2126f, aVar6.f2127g);
                                    i0Var.b0(pVar6, true);
                                    i0Var.g(pVar6);
                                    break;
                                case 8:
                                    i0Var.d0((p) null);
                                    break;
                                case 9:
                                    i0Var.d0(pVar6);
                                    break;
                                case 10:
                                    i0Var.c0(pVar6, aVar6.f2128h);
                                    break;
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar6.f2121a);
                            }
                        }
                        continue;
                    } else {
                        aVar5.f(1);
                        ArrayList<q0.a> arrayList18 = aVar5.f2106a;
                        int size4 = arrayList18.size();
                        for (int i31 = 0; i31 < size4; i31++) {
                            q0.a aVar7 = arrayList18.get(i31);
                            p pVar7 = aVar7.f2122b;
                            if (pVar7 != null) {
                                pVar7.J = aVar5.f1900t;
                                if (pVar7.f2070g0 != null) {
                                    pVar7.n().f2086a = false;
                                }
                                int i32 = aVar5.f2111f;
                                if (!(pVar7.f2070g0 == null && i32 == 0)) {
                                    pVar7.n();
                                    pVar7.f2070g0.f2091f = i32;
                                }
                                ArrayList<String> arrayList19 = aVar5.f2118n;
                                ArrayList<String> arrayList20 = aVar5.f2119o;
                                pVar7.n();
                                p.c cVar9 = pVar7.f2070g0;
                                cVar9.f2092g = arrayList19;
                                cVar9.f2093h = arrayList20;
                            }
                            int i33 = aVar7.f2121a;
                            i0 i0Var2 = aVar5.f1897q;
                            switch (i33) {
                                case 1:
                                    pVar7.g0(aVar7.f2124d, aVar7.f2125e, aVar7.f2126f, aVar7.f2127g);
                                    i0Var2.b0(pVar7, false);
                                    i0Var2.a(pVar7);
                                    break;
                                case 3:
                                    pVar7.g0(aVar7.f2124d, aVar7.f2125e, aVar7.f2126f, aVar7.f2127g);
                                    i0Var2.V(pVar7);
                                    break;
                                case 4:
                                    pVar7.g0(aVar7.f2124d, aVar7.f2125e, aVar7.f2126f, aVar7.f2127g);
                                    i0Var2.I(pVar7);
                                    break;
                                case 5:
                                    pVar7.g0(aVar7.f2124d, aVar7.f2125e, aVar7.f2126f, aVar7.f2127g);
                                    i0Var2.b0(pVar7, false);
                                    f0(pVar7);
                                    break;
                                case 6:
                                    pVar7.g0(aVar7.f2124d, aVar7.f2125e, aVar7.f2126f, aVar7.f2127g);
                                    i0Var2.g(pVar7);
                                    break;
                                case 7:
                                    pVar7.g0(aVar7.f2124d, aVar7.f2125e, aVar7.f2126f, aVar7.f2127g);
                                    i0Var2.b0(pVar7, false);
                                    i0Var2.c(pVar7);
                                    break;
                                case 8:
                                    i0Var2.d0(pVar7);
                                    break;
                                case 9:
                                    i0Var2.d0((p) null);
                                    break;
                                case 10:
                                    i0Var2.c0(pVar7, aVar7.f2129i);
                                    break;
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar7.f2121a);
                            }
                        }
                        continue;
                    }
                }
                ArrayList<Boolean> arrayList21 = arrayList2;
                boolean booleanValue = arrayList21.get(i15 - 1).booleanValue();
                for (int i34 = i8; i34 < i15; i34++) {
                    a aVar8 = arrayList14.get(i34);
                    if (booleanValue) {
                        for (int size5 = aVar8.f2106a.size() - 1; size5 >= 0; size5--) {
                            p pVar8 = aVar8.f2106a.get(size5).f2122b;
                            if (pVar8 != null) {
                                f(pVar8).k();
                            }
                        }
                    } else {
                        Iterator<q0.a> it2 = aVar8.f2106a.iterator();
                        while (it2.hasNext()) {
                            p pVar9 = it2.next().f2122b;
                            if (pVar9 != null) {
                                f(pVar9).k();
                            }
                        }
                    }
                }
                P(this.f1984t, true);
                HashSet hashSet = new HashSet();
                for (int i35 = i8; i35 < i15; i35++) {
                    Iterator<q0.a> it3 = arrayList14.get(i35).f2106a.iterator();
                    while (it3.hasNext()) {
                        p pVar10 = it3.next().f2122b;
                        if (!(pVar10 == null || (viewGroup = pVar10.f2064c0) == null)) {
                            hashSet.add(d1.f(viewGroup, H()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    d1 d1Var = (d1) it4.next();
                    d1Var.f1929d = booleanValue;
                    d1Var.g();
                    d1Var.c();
                }
                for (int i36 = i8; i36 < i15; i36++) {
                    a aVar9 = arrayList14.get(i36);
                    if (arrayList21.get(i36).booleanValue() && aVar9.f1899s >= 0) {
                        aVar9.f1899s = -1;
                    }
                    aVar9.getClass();
                }
                return;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f1999a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2000b;

        public class a implements Parcelable.Creator<l> {
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            public final Object[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(int i8, String str) {
            this.f1999a = str;
            this.f2000b = i8;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f1999a);
            parcel.writeInt(this.f2000b);
        }

        public l(Parcel parcel) {
            this.f1999a = parcel.readString();
            this.f2000b = parcel.readInt();
        }
    }
}
