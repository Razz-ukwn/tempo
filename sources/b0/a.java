package b0;

import b0.m;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import rf.l;
import sf.j;
import sf.k;

public final class a extends b {

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    public static final class C0032a extends k implements l<Object, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List<l<Object, m>> f2882a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0032a(ArrayList arrayList) {
            super(1);
            this.f2882a = arrayList;
        }

        public final Object invoke(Object obj) {
            j.f(obj, "state");
            List<l<Object, m>> list = this.f2882a;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                list.get(i8).invoke(obj);
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements l<k, b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l<Object, m> f2883a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<Object, m> f2884b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l<Object, m> lVar, l<Object, m> lVar2) {
            super(1);
            this.f2883a = lVar;
            this.f2884b = lVar2;
        }

        public final Object invoke(Object obj) {
            int i8;
            k kVar = (k) obj;
            j.f(kVar, "invalid");
            synchronized (m.f2942c) {
                i8 = m.f2944e;
                m.f2944e = i8 + 1;
            }
            return new b(i8, kVar, this.f2883a, this.f2884b);
        }
    }

    public static final class c extends k implements l<k, f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l<Object, m> f2885a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(l<Object, m> lVar) {
            super(1);
            this.f2885a = lVar;
        }

        public final Object invoke(Object obj) {
            int i8;
            k kVar = (k) obj;
            j.f(kVar, "invalid");
            synchronized (m.f2942c) {
                i8 = m.f2944e;
                m.f2944e = i8 + 1;
            }
            return new f(i8, kVar, this.f2885a);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int r6, b0.k r7) {
        /*
            r5 = this;
            java.lang.Object r0 = b0.m.f2942c
            monitor-enter(r0)
            java.util.ArrayList r1 = b0.m.f2947h     // Catch:{ all -> 0x0033 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0033 }
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L_0x0013
            java.util.ArrayList r1 = gf.q.P0(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x0014
        L_0x0013:
            r1 = r4
        L_0x0014:
            if (r1 == 0) goto L_0x002d
            int r2 = r1.size()     // Catch:{ all -> 0x0033 }
            if (r2 != r3) goto L_0x0022
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            rf.l r2 = (rf.l) r2     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x002e
            b0.a$a r2 = new b0.a$a     // Catch:{ all -> 0x0033 }
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            goto L_0x002e
        L_0x002d:
            r2 = r4
        L_0x002e:
            monitor-exit(r0)
            r5.<init>(r6, r7, r4, r2)
            return
        L_0x0033:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a.<init>(int, b0.k):void");
    }

    public final void c() {
        synchronized (m.f2942c) {
            int i8 = this.f2913d;
            if (i8 >= 0) {
                m.r(i8);
                this.f2913d = -1;
            }
            m mVar = m.f8717a;
        }
    }

    public final void j(h hVar) {
        j.f(hVar, "snapshot");
        v.a();
        throw null;
    }

    public final void k(h hVar) {
        j.f(hVar, "snapshot");
        v.a();
        throw null;
    }

    public final void l() {
        m.a();
    }

    public final h r(l<Object, m> lVar) {
        c cVar = new c(lVar);
        m.a aVar = m.f2940a;
        return (h) m.f(new o(cVar));
    }

    public final i t() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    public final b y(l<Object, ff.m> lVar, l<Object, ff.m> lVar2) {
        b bVar = new b(lVar, lVar2);
        m.a aVar = m.f2940a;
        return (b) ((h) m.f(new o(bVar)));
    }
}
