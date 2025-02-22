package r3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13847a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<o.a<ViewGroup, ArrayList<k>>>> f13848b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<ViewGroup> f13849c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final k f13850a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f13851b;

        /* renamed from: r3.o$a$a  reason: collision with other inner class name */
        public class C0260a extends n {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ o.a f13852a;

            public C0260a(o.a aVar) {
                this.f13852a = aVar;
            }

            public final void c(k kVar) {
                ((ArrayList) this.f13852a.getOrDefault(a.this.f13851b, null)).remove(kVar);
                kVar.z(this);
            }
        }

        public a(ViewGroup viewGroup, k kVar) {
            this.f13850a = kVar;
            this.f13851b = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: r3.r} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0237  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01e3 A[EDGE_INSN: B:139:0x01e3->B:87:0x01e3 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r2 = r0.f13851b
                android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                r2.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = r3.o.f13849c
                boolean r1 = r1.remove(r2)
                r7 = 1
                if (r1 != 0) goto L_0x0018
                return r7
            L_0x0018:
                o.a r1 = r3.o.b()
                r3 = 0
                java.lang.Object r4 = r1.getOrDefault(r2, r3)
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                if (r4 != 0) goto L_0x002e
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r1.put(r2, r4)
                goto L_0x003a
            L_0x002e:
                int r5 = r4.size()
                if (r5 <= 0) goto L_0x003a
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r4)
                goto L_0x003b
            L_0x003a:
                r5 = r3
            L_0x003b:
                r3.k r8 = r0.f13850a
                r4.add(r8)
                r3.o$a$a r4 = new r3.o$a$a
                r4.<init>(r1)
                r8.a(r4)
                r1 = 0
                r8.k(r2, r1)
                if (r5 == 0) goto L_0x0062
                java.util.Iterator r4 = r5.iterator()
            L_0x0052:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0062
                java.lang.Object r5 = r4.next()
                r3.k r5 = (r3.k) r5
                r5.B(r2)
                goto L_0x0052
            L_0x0062:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r8.G = r4
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r8.H = r4
                j1.c r4 = r8.C
                j1.c r5 = r8.D
                o.a r6 = new o.a
                java.lang.Object r9 = r4.f9755a
                o.a r9 = (o.a) r9
                r6.<init>((o.a) r9)
                o.a r9 = new o.a
                java.lang.Object r10 = r5.f9755a
                o.a r10 = (o.a) r10
                r9.<init>((o.a) r10)
                r10 = r1
            L_0x0087:
                int[] r11 = r8.F
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01e3
                r11 = r11[r10]
                if (r11 == r7) goto L_0x01a3
                r12 = 2
                if (r11 == r12) goto L_0x0150
                r12 = 3
                if (r11 == r12) goto L_0x00fb
                r12 = 4
                if (r11 == r12) goto L_0x009d
            L_0x0099:
                r16 = r2
                goto L_0x01da
            L_0x009d:
                java.lang.Object r11 = r4.f9757c
                o.d r11 = (o.d) r11
                java.lang.Object r12 = r5.f9757c
                o.d r12 = (o.d) r12
                int r13 = r11.k()
                r14 = r1
            L_0x00aa:
                if (r14 >= r13) goto L_0x0099
                java.lang.Object r15 = r11.l(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x00f1
                boolean r16 = r8.w(r15)
                if (r16 == 0) goto L_0x00f1
                r16 = r2
                long r1 = r11.h(r14)
                java.lang.Object r1 = r12.g(r3, r1)
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x00f3
                boolean r2 = r8.w(r1)
                if (r2 == 0) goto L_0x00f3
                java.lang.Object r2 = r6.getOrDefault(r15, r3)
                r3.r r2 = (r3.r) r2
                java.lang.Object r17 = r9.getOrDefault(r1, r3)
                r7 = r17
                r3.r r7 = (r3.r) r7
                if (r2 == 0) goto L_0x00f3
                if (r7 == 0) goto L_0x00f3
                java.util.ArrayList<r3.r> r3 = r8.G
                r3.add(r2)
                java.util.ArrayList<r3.r> r2 = r8.H
                r2.add(r7)
                r6.remove(r15)
                r9.remove(r1)
                goto L_0x00f3
            L_0x00f1:
                r16 = r2
            L_0x00f3:
                int r14 = r14 + 1
                r2 = r16
                r1 = 0
                r3 = 0
                r7 = 1
                goto L_0x00aa
            L_0x00fb:
                r16 = r2
                java.lang.Object r1 = r4.f9756b
                android.util.SparseArray r1 = (android.util.SparseArray) r1
                java.lang.Object r2 = r5.f9756b
                android.util.SparseArray r2 = (android.util.SparseArray) r2
                int r3 = r1.size()
                r7 = 0
            L_0x010a:
                if (r7 >= r3) goto L_0x01da
                java.lang.Object r11 = r1.valueAt(r7)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x014d
                boolean r12 = r8.w(r11)
                if (r12 == 0) goto L_0x014d
                int r12 = r1.keyAt(r7)
                java.lang.Object r12 = r2.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x014d
                boolean r13 = r8.w(r12)
                if (r13 == 0) goto L_0x014d
                r13 = 0
                java.lang.Object r14 = r6.getOrDefault(r11, r13)
                r3.r r14 = (r3.r) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                r3.r r15 = (r3.r) r15
                if (r14 == 0) goto L_0x014d
                if (r15 == 0) goto L_0x014d
                java.util.ArrayList<r3.r> r13 = r8.G
                r13.add(r14)
                java.util.ArrayList<r3.r> r13 = r8.H
                r13.add(r15)
                r6.remove(r11)
                r9.remove(r12)
            L_0x014d:
                int r7 = r7 + 1
                goto L_0x010a
            L_0x0150:
                r16 = r2
                java.lang.Object r1 = r4.f9758d
                o.a r1 = (o.a) r1
                java.lang.Object r2 = r5.f9758d
                o.a r2 = (o.a) r2
                int r3 = r1.f12032c
                r7 = 0
            L_0x015d:
                if (r7 >= r3) goto L_0x01da
                java.lang.Object r11 = r1.m(r7)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01a0
                boolean r12 = r8.w(r11)
                if (r12 == 0) goto L_0x01a0
                java.lang.Object r12 = r1.i(r7)
                r13 = 0
                java.lang.Object r12 = r2.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01a0
                boolean r14 = r8.w(r12)
                if (r14 == 0) goto L_0x01a0
                java.lang.Object r14 = r6.getOrDefault(r11, r13)
                r3.r r14 = (r3.r) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                r3.r r15 = (r3.r) r15
                if (r14 == 0) goto L_0x01a0
                if (r15 == 0) goto L_0x01a0
                java.util.ArrayList<r3.r> r13 = r8.G
                r13.add(r14)
                java.util.ArrayList<r3.r> r13 = r8.H
                r13.add(r15)
                r6.remove(r11)
                r9.remove(r12)
            L_0x01a0:
                int r7 = r7 + 1
                goto L_0x015d
            L_0x01a3:
                r16 = r2
                int r1 = r6.f12032c
            L_0x01a7:
                int r1 = r1 + -1
                if (r1 < 0) goto L_0x01da
                java.lang.Object r2 = r6.i(r1)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x01a7
                boolean r3 = r8.w(r2)
                if (r3 == 0) goto L_0x01a7
                java.lang.Object r2 = r9.remove(r2)
                r3.r r2 = (r3.r) r2
                if (r2 == 0) goto L_0x01a7
                android.view.View r3 = r2.f13860b
                boolean r3 = r8.w(r3)
                if (r3 == 0) goto L_0x01a7
                java.lang.Object r3 = r6.k(r1)
                r3.r r3 = (r3.r) r3
                java.util.ArrayList<r3.r> r7 = r8.G
                r7.add(r3)
                java.util.ArrayList<r3.r> r3 = r8.H
                r3.add(r2)
                goto L_0x01a7
            L_0x01da:
                int r10 = r10 + 1
                r2 = r16
                r1 = 0
                r3 = 0
                r7 = 1
                goto L_0x0087
            L_0x01e3:
                r16 = r2
                r1 = 0
            L_0x01e6:
                int r2 = r6.f12032c
                if (r1 >= r2) goto L_0x0206
                java.lang.Object r2 = r6.m(r1)
                r3.r r2 = (r3.r) r2
                android.view.View r3 = r2.f13860b
                boolean r3 = r8.w(r3)
                if (r3 == 0) goto L_0x0203
                java.util.ArrayList<r3.r> r3 = r8.G
                r3.add(r2)
                java.util.ArrayList<r3.r> r2 = r8.H
                r3 = 0
                r2.add(r3)
            L_0x0203:
                int r1 = r1 + 1
                goto L_0x01e6
            L_0x0206:
                r1 = 0
            L_0x0207:
                int r2 = r9.f12032c
                if (r1 >= r2) goto L_0x0227
                java.lang.Object r2 = r9.m(r1)
                r3.r r2 = (r3.r) r2
                android.view.View r3 = r2.f13860b
                boolean r3 = r8.w(r3)
                if (r3 == 0) goto L_0x0224
                java.util.ArrayList<r3.r> r3 = r8.H
                r3.add(r2)
                java.util.ArrayList<r3.r> r2 = r8.G
                r3 = 0
                r2.add(r3)
            L_0x0224:
                int r1 = r1 + 1
                goto L_0x0207
            L_0x0227:
                o.a r1 = r3.k.r()
                int r2 = r1.f12032c
                r3.z r3 = r3.v.f13865a
                android.view.WindowId r3 = r16.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x0235:
                if (r2 < 0) goto L_0x02aa
                java.lang.Object r4 = r1.i(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02a6
                r5 = 0
                java.lang.Object r6 = r1.getOrDefault(r4, r5)
                r3.k$b r6 = (r3.k.b) r6
                if (r6 == 0) goto L_0x02a6
                android.view.View r5 = r6.f13839a
                if (r5 == 0) goto L_0x02a6
                r3.e0 r7 = r6.f13842d
                boolean r9 = r7 instanceof r3.d0
                if (r9 == 0) goto L_0x025e
                r3.d0 r7 = (r3.d0) r7
                android.view.WindowId r7 = r7.f13822a
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x025e
                r7 = 1
                goto L_0x025f
            L_0x025e:
                r7 = 0
            L_0x025f:
                if (r7 == 0) goto L_0x02a6
                r7 = 1
                r3.r r9 = r8.u(r5, r7)
                r3.r r10 = r8.q(r5, r7)
                if (r9 != 0) goto L_0x027d
                if (r10 != 0) goto L_0x027d
                j1.c r7 = r8.D
                java.lang.Object r7 = r7.f9755a
                o.a r7 = (o.a) r7
                r11 = 0
                java.lang.Object r5 = r7.getOrDefault(r5, r11)
                r10 = r5
                r3.r r10 = (r3.r) r10
                goto L_0x027e
            L_0x027d:
                r11 = 0
            L_0x027e:
                if (r9 != 0) goto L_0x0282
                if (r10 == 0) goto L_0x028e
            L_0x0282:
                r3.k r5 = r6.f13843e
                r3.r r6 = r6.f13841c
                boolean r5 = r5.v(r6, r10)
                if (r5 == 0) goto L_0x028e
                r5 = 1
                goto L_0x028f
            L_0x028e:
                r5 = 0
            L_0x028f:
                if (r5 == 0) goto L_0x02a7
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02a2
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x029e
                goto L_0x02a2
            L_0x029e:
                r1.remove(r4)
                goto L_0x02a7
            L_0x02a2:
                r4.cancel()
                goto L_0x02a7
            L_0x02a6:
                r11 = 0
            L_0x02a7:
                int r2 = r2 + -1
                goto L_0x0235
            L_0x02aa:
                j1.c r3 = r8.C
                j1.c r4 = r8.D
                java.util.ArrayList<r3.r> r5 = r8.G
                java.util.ArrayList<r3.r> r6 = r8.H
                r1 = r8
                r2 = r16
                r1.o(r2, r3, r4, r5, r6)
                r8.C()
                r1 = 1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.o.a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f13851b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            o.f13849c.remove(viewGroup);
            ArrayList orDefault = o.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).B(viewGroup);
                }
            }
            this.f13850a.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, k kVar) {
        ArrayList<ViewGroup> arrayList = f13849c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            if (i0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (kVar == null) {
                    kVar = f13847a;
                }
                k m = kVar.clone();
                ArrayList orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).y(viewGroup);
                    }
                }
                if (m != null) {
                    m.k(viewGroup, true);
                }
                if (((j) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (m != null) {
                        a aVar = new a(viewGroup, m);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static o.a<ViewGroup, ArrayList<k>> b() {
        o.a<ViewGroup, ArrayList<k>> aVar;
        ThreadLocal<WeakReference<o.a<ViewGroup, ArrayList<k>>>> threadLocal = f13848b;
        WeakReference weakReference = threadLocal.get();
        if (weakReference != null && (aVar = (o.a) weakReference.get()) != null) {
            return aVar;
        }
        o.a<ViewGroup, ArrayList<k>> aVar2 = new o.a<>();
        threadLocal.set(new WeakReference(aVar2));
        return aVar2;
    }
}
