package t;

import ag.k;
import ag.n1;
import ag.q1;
import android.util.Log;
import androidx.fragment.app.z0;
import b0.h;
import b0.i;
import ff.g;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.y0;
import rf.l;
import sf.j;

public final class z1 extends g0 {

    /* renamed from: s  reason: collision with root package name */
    public static final y0 f15295s = z0.a(x.b.f16812d);

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReference<Boolean> f15296t = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    public final d f15297a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15298b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public n1 f15299c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f15300d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f15301e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public LinkedHashSet f15302f = new LinkedHashSet();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15303g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f15304h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f15305i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f15306j = new LinkedHashMap();

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f15307k = new LinkedHashMap();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f15308l;
    public k<? super m> m;

    /* renamed from: n  reason: collision with root package name */
    public b f15309n;

    /* renamed from: o  reason: collision with root package name */
    public final y0 f15310o = z0.a(d.f15316c);

    /* renamed from: p  reason: collision with root package name */
    public final q1 f15311p;

    /* renamed from: q  reason: collision with root package name */
    public final jf.f f15312q;

    /* renamed from: r  reason: collision with root package name */
    public final c f15313r;

    public static final class a {
    }

    public static final class b {
        public b(Exception exc) {
        }
    }

    public final class c {
    }

    public enum d {
        f15314a,
        f15315b,
        f15316c,
        f15317d,
        f15318e,
        B;

        /* access modifiers changed from: public */
        d() {
        }
    }

    public static final class e extends sf.k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z1 f15319a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(z1 z1Var) {
            super(0);
            this.f15319a = z1Var;
        }

        public final Object d() {
            k<m> o10;
            z1 z1Var = this.f15319a;
            synchronized (z1Var.f15298b) {
                o10 = z1Var.o();
                if (((d) z1Var.f15310o.getValue()).compareTo(d.f15315b) <= 0) {
                    Throwable th = z1Var.f15300d;
                    CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                    cancellationException.initCause(th);
                    throw cancellationException;
                }
            }
            if (o10 != null) {
                o10.resumeWith(m.f8717a);
            }
            return m.f8717a;
        }
    }

    public static final class f extends sf.k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z1 f15320a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(z1 z1Var) {
            super(1);
            this.f15320a = z1Var;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
            cancellationException.initCause(th);
            z1 z1Var = this.f15320a;
            synchronized (z1Var.f15298b) {
                n1 n1Var = z1Var.f15299c;
                if (n1Var != null) {
                    z1Var.f15310o.setValue(d.f15315b);
                    n1Var.e(cancellationException);
                    z1Var.m = null;
                    n1Var.k0(new a2(z1Var, th));
                } else {
                    z1Var.f15300d = cancellationException;
                    z1Var.f15310o.setValue(d.f15314a);
                    m mVar = m.f8717a;
                }
            }
            return m.f8717a;
        }
    }

    static {
        new a();
    }

    public z1(jf.f fVar) {
        j.f(fVar, "effectCoroutineContext");
        d dVar = new d(new e(this));
        this.f15297a = dVar;
        q1 q1Var = new q1((n1) fVar.d(n1.b.f447a));
        q1Var.k0(new f(this));
        this.f15311p = q1Var;
        this.f15312q = fVar.n0(dVar).n0(q1Var);
        this.f15313r = new c();
    }

    public static final m0 k(z1 z1Var, m0 m0Var, u.c cVar) {
        b0.b y10;
        h i8;
        if (m0Var.q() || m0Var.j()) {
            return null;
        }
        d2 d2Var = new d2(m0Var);
        g2 g2Var = new g2(m0Var, cVar);
        h i10 = b0.m.i();
        b0.b bVar = i10 instanceof b0.b ? (b0.b) i10 : null;
        if (bVar == null || (y10 = bVar.y(d2Var, g2Var)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            i8 = y10.i();
            boolean z10 = true;
            if (!(cVar.f15634a > 0)) {
                z10 = false;
            }
            if (z10) {
                m0Var.g(new c2(m0Var, cVar));
            }
            boolean v3 = m0Var.v();
            h.o(i8);
            m(y10);
            if (!v3) {
                m0Var = null;
            }
            return m0Var;
        } catch (Throwable th) {
            m(y10);
            throw th;
        }
    }

    public static final void l(z1 z1Var) {
        LinkedHashSet linkedHashSet = z1Var.f15302f;
        if (!linkedHashSet.isEmpty()) {
            ArrayList arrayList = z1Var.f15301e;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((m0) arrayList.get(i8)).m(linkedHashSet);
                if (((d) z1Var.f15310o.getValue()).compareTo(d.f15315b) <= 0) {
                    break;
                }
            }
            z1Var.f15302f = new LinkedHashSet();
            if (z1Var.o() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    public static void m(b0.b bVar) {
        try {
            if (bVar.t() instanceof i.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            bVar.c();
        }
    }

    public static final void r(ArrayList arrayList, z1 z1Var, m0 m0Var) {
        arrayList.clear();
        synchronized (z1Var.f15298b) {
            Iterator it = z1Var.f15305i.iterator();
            while (it.hasNext()) {
                i1 i1Var = (i1) it.next();
                if (j.a(i1Var.f15121c, m0Var)) {
                    arrayList.add(i1Var);
                    it.remove();
                }
            }
            m mVar = m.f8717a;
        }
    }

    public static /* synthetic */ void u(z1 z1Var, Exception exc, boolean z10, int i8) {
        if ((i8 & 4) != 0) {
            z10 = false;
        }
        z1Var.t(exc, (m0) null, z10);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [b0.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(t.m0 r8, z.a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "composition"
            sf.j.f(r8, r0)
            boolean r0 = r8.q()
            r1 = 1
            t.d2 r2 = new t.d2     // Catch:{ Exception -> 0x009a }
            r2.<init>(r8)     // Catch:{ Exception -> 0x009a }
            t.g2 r3 = new t.g2     // Catch:{ Exception -> 0x009a }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x009a }
            b0.h r5 = b0.m.i()     // Catch:{ Exception -> 0x009a }
            boolean r6 = r5 instanceof b0.b     // Catch:{ Exception -> 0x009a }
            if (r6 == 0) goto L_0x0020
            r4 = r5
            b0.b r4 = (b0.b) r4     // Catch:{ Exception -> 0x009a }
        L_0x0020:
            if (r4 == 0) goto L_0x008e
            b0.b r2 = r4.y(r2, r3)     // Catch:{ Exception -> 0x009a }
            if (r2 == 0) goto L_0x008e
            b0.h r3 = r2.i()     // Catch:{ all -> 0x0083 }
            r8.k(r9)     // Catch:{ all -> 0x0085 }
            ff.m r9 = ff.m.f8717a     // Catch:{ all -> 0x0085 }
            b0.h.o(r3)     // Catch:{ all -> 0x0083 }
            m(r2)     // Catch:{ Exception -> 0x009a }
            if (r0 != 0) goto L_0x0040
            b0.h r9 = b0.m.i()
            r9.l()
        L_0x0040:
            java.lang.Object r9 = r7.f15298b
            monitor-enter(r9)
            kotlinx.coroutines.flow.y0 r2 = r7.f15310o     // Catch:{ all -> 0x0080 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0080 }
            t.z1$d r2 = (t.z1.d) r2     // Catch:{ all -> 0x0080 }
            t.z1$d r3 = t.z1.d.f15315b     // Catch:{ all -> 0x0080 }
            int r2 = r2.compareTo(r3)     // Catch:{ all -> 0x0080 }
            if (r2 <= 0) goto L_0x0060
            java.util.ArrayList r2 = r7.f15301e     // Catch:{ all -> 0x0080 }
            boolean r2 = r2.contains(r8)     // Catch:{ all -> 0x0080 }
            if (r2 != 0) goto L_0x0060
            java.util.ArrayList r2 = r7.f15301e     // Catch:{ all -> 0x0080 }
            r2.add(r8)     // Catch:{ all -> 0x0080 }
        L_0x0060:
            monitor-exit(r9)
            r7.q(r8)     // Catch:{ Exception -> 0x007b }
            r8.p()     // Catch:{ Exception -> 0x0074 }
            r8.h()     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x0073
            b0.h r8 = b0.m.i()
            r8.l()
        L_0x0073:
            return
        L_0x0074:
            r8 = move-exception
            r9 = 0
            r0 = 6
            u(r7, r8, r9, r0)
            return
        L_0x007b:
            r9 = move-exception
            r7.t(r9, r8, r1)
            return
        L_0x0080:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L_0x0083:
            r9 = move-exception
            goto L_0x008a
        L_0x0085:
            r9 = move-exception
            b0.h.o(r3)     // Catch:{ all -> 0x0083 }
            throw r9     // Catch:{ all -> 0x0083 }
        L_0x008a:
            m(r2)     // Catch:{ Exception -> 0x009a }
            throw r9     // Catch:{ Exception -> 0x009a }
        L_0x008e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x009a }
            java.lang.String r0 = "Cannot create a mutable snapshot of an read-only snapshot"
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009a }
            r9.<init>(r0)     // Catch:{ Exception -> 0x009a }
            throw r9     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            r9 = move-exception
            r7.t(r9, r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z1.a(t.m0, z.a):void");
    }

    public final void b(i1 i1Var) {
        synchronized (this.f15298b) {
            LinkedHashMap linkedHashMap = this.f15306j;
            g1<Object> g1Var = i1Var.f15119a;
            j.f(linkedHashMap, "<this>");
            Object obj = linkedHashMap.get(g1Var);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(g1Var, obj);
            }
            ((List) obj).add(i1Var);
        }
    }

    public final void c() {
    }

    public final void d() {
    }

    public final jf.f e() {
        return this.f15312q;
    }

    public final void f(m0 m0Var) {
        k<m> kVar;
        j.f(m0Var, "composition");
        synchronized (this.f15298b) {
            if (!this.f15303g.contains(m0Var)) {
                this.f15303g.add(m0Var);
                kVar = o();
            } else {
                kVar = null;
            }
        }
        if (kVar != null) {
            kVar.resumeWith(m.f8717a);
        }
    }

    public final void g(i1 i1Var, h1 h1Var) {
        synchronized (this.f15298b) {
            this.f15307k.put(i1Var, h1Var);
            m mVar = m.f8717a;
        }
    }

    public final h1 h(i1 i1Var) {
        h1 h1Var;
        j.f(i1Var, "reference");
        synchronized (this.f15298b) {
            h1Var = (h1) this.f15307k.remove(i1Var);
        }
        return h1Var;
    }

    public final void i(Set<Object> set) {
    }

    public final void j(m0 m0Var) {
        j.f(m0Var, "composition");
        synchronized (this.f15298b) {
            this.f15301e.remove(m0Var);
            this.f15303g.remove(m0Var);
            this.f15304h.remove(m0Var);
            m mVar = m.f8717a;
        }
    }

    public final void n() {
        synchronized (this.f15298b) {
            if (((d) this.f15310o.getValue()).compareTo(d.f15318e) >= 0) {
                this.f15310o.setValue(d.f15315b);
            }
            m mVar = m.f8717a;
        }
        this.f15311p.e((CancellationException) null);
    }

    public final k<m> o() {
        y0 y0Var = this.f15310o;
        int compareTo = ((d) y0Var.getValue()).compareTo(d.f15315b);
        ArrayList arrayList = this.f15305i;
        ArrayList arrayList2 = this.f15304h;
        ArrayList arrayList3 = this.f15303g;
        if (compareTo <= 0) {
            this.f15301e.clear();
            this.f15302f = new LinkedHashSet();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.f15308l = null;
            k<? super m> kVar = this.m;
            if (kVar != null) {
                kVar.n((Throwable) null);
            }
            this.m = null;
            this.f15309n = null;
            return null;
        }
        b bVar = this.f15309n;
        d dVar = d.B;
        d dVar2 = d.f15316c;
        if (bVar == null) {
            n1 n1Var = this.f15299c;
            d dVar3 = this.f15297a;
            if (n1Var == null) {
                this.f15302f = new LinkedHashSet();
                arrayList3.clear();
                if (dVar3.a()) {
                    dVar2 = d.f15317d;
                }
            } else {
                dVar2 = ((arrayList3.isEmpty() ^ true) || (this.f15302f.isEmpty() ^ true) || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || dVar3.a()) ? dVar : d.f15318e;
            }
        }
        y0Var.setValue(dVar2);
        if (dVar2 != dVar) {
            return null;
        }
        k<? super m> kVar2 = this.m;
        this.m = null;
        return kVar2;
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f15298b) {
            z10 = true;
            if (!(!this.f15302f.isEmpty()) && !(!this.f15303g.isEmpty()) && !this.f15297a.a()) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = new java.util.ArrayList();
        r(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        s(r0, (u.c<java.lang.Object>) null);
        r(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(t.m0 r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f15298b
            monitor-enter(r0)
            java.util.ArrayList r1 = r7.f15305i     // Catch:{ all -> 0x0040 }
            int r2 = r1.size()     // Catch:{ all -> 0x0040 }
            r3 = 0
            r4 = r3
        L_0x000b:
            r5 = 1
            if (r4 >= r2) goto L_0x0021
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0040 }
            t.i1 r6 = (t.i1) r6     // Catch:{ all -> 0x0040 }
            t.m0 r6 = r6.f15121c     // Catch:{ all -> 0x0040 }
            boolean r6 = sf.j.a(r6, r8)     // Catch:{ all -> 0x0040 }
            if (r6 == 0) goto L_0x001e
            r3 = r5
            goto L_0x0021
        L_0x001e:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0021:
            if (r3 != 0) goto L_0x0025
            monitor-exit(r0)
            return
        L_0x0025:
            ff.m r1 = ff.m.f8717a     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r(r0, r7, r8)
        L_0x0030:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r7.s(r0, r1)
            r(r0, r7, r8)
            goto L_0x0030
        L_0x003f:
            return
        L_0x0040:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t.z1.q(t.m0):void");
    }

    public final List<m0> s(List<i1> list, u.c<Object> cVar) {
        b0.b y10;
        h i8;
        ArrayList arrayList;
        Object obj;
        z1 z1Var = this;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i1 i1Var = list.get(i10);
            m0 m0Var = i1Var.f15121c;
            Object obj2 = hashMap.get(m0Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(m0Var, obj2);
            }
            ((ArrayList) obj2).add(i1Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            m0 m0Var2 = (m0) entry.getKey();
            List list2 = (List) entry.getValue();
            e0.f(!m0Var2.q());
            d2 d2Var = new d2(m0Var2);
            g2 g2Var = new g2(m0Var2, cVar);
            h i11 = b0.m.i();
            b0.b bVar = i11 instanceof b0.b ? (b0.b) i11 : null;
            if (bVar == null || (y10 = bVar.y(d2Var, g2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                i8 = y10.i();
                synchronized (z1Var.f15298b) {
                    arrayList = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        i1 i1Var2 = (i1) list2.get(i12);
                        LinkedHashMap linkedHashMap = z1Var.f15306j;
                        g1<Object> g1Var = i1Var2.f15119a;
                        j.f(linkedHashMap, "<this>");
                        List list3 = (List) linkedHashMap.get(g1Var);
                        if (list3 == null) {
                            obj = null;
                        } else if (!list3.isEmpty()) {
                            Object remove = list3.remove(0);
                            if (list3.isEmpty()) {
                                linkedHashMap.remove(g1Var);
                            }
                            obj = remove;
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                        arrayList.add(new g(i1Var2, obj));
                        i12++;
                        z1Var = this;
                    }
                }
                m0Var2.f(arrayList);
                m mVar = m.f8717a;
                h.o(i8);
                m(y10);
                z1Var = this;
            } catch (Throwable th) {
                m(y10);
                throw th;
            }
        }
        return q.O0(hashMap.keySet());
    }

    public final void t(Exception exc, m0 m0Var, boolean z10) {
        Boolean bool = f15296t.get();
        j.e(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof g)) {
            throw exc;
        }
        synchronized (this.f15298b) {
            int i8 = a.f14979a;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            this.f15304h.clear();
            this.f15303g.clear();
            this.f15302f = new LinkedHashSet();
            this.f15305i.clear();
            this.f15306j.clear();
            this.f15307k.clear();
            this.f15309n = new b(exc);
            if (m0Var != null) {
                ArrayList arrayList = this.f15308l;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f15308l = arrayList;
                }
                if (!arrayList.contains(m0Var)) {
                    arrayList.add(m0Var);
                }
                this.f15301e.remove(m0Var);
            }
            o();
        }
    }
}
