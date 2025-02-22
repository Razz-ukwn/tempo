package z3;

import ag.g0;
import androidx.fragment.app.z0;
import d2.f1;
import ff.m;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jf.f;
import kotlinx.coroutines.internal.e;
import lf.i;
import rf.p;
import sf.j;
import wg.b0;
import wg.g;
import wg.u;
import wg.z;
import zf.n;

public final class b implements Closeable, Flushable {
    public static final zf.c M = new zf.c("[a-z0-9_-]{1,120}");
    public final LinkedHashMap<String, C0332b> B;
    public final e C;
    public long D;
    public int E;
    public g F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final c L;

    /* renamed from: a  reason: collision with root package name */
    public final z f17691a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17692b;

    /* renamed from: c  reason: collision with root package name */
    public final z f17693c;

    /* renamed from: d  reason: collision with root package name */
    public final z f17694d;

    /* renamed from: e  reason: collision with root package name */
    public final z f17695e;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C0332b f17696a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17697b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f17698c = new boolean[2];

        public a(C0332b bVar) {
            this.f17696a = bVar;
            b.this.getClass();
        }

        public final void a(boolean z10) {
            b bVar = b.this;
            synchronized (bVar) {
                if (!this.f17697b) {
                    if (j.a(this.f17696a.f17706g, this)) {
                        b.c(bVar, this, z10);
                    }
                    this.f17697b = true;
                    m mVar = m.f8717a;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
        }

        public final z b(int i8) {
            z zVar;
            b bVar = b.this;
            synchronized (bVar) {
                if (!this.f17697b) {
                    this.f17698c[i8] = true;
                    z zVar2 = this.f17696a.f17703d.get(i8);
                    c cVar = bVar.L;
                    z zVar3 = zVar2;
                    if (!cVar.f(zVar3)) {
                        m4.c.a(cVar.k(zVar3));
                    }
                    zVar = zVar2;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            }
            return zVar;
        }
    }

    /* renamed from: z3.b$b  reason: collision with other inner class name */
    public final class C0332b {

        /* renamed from: a  reason: collision with root package name */
        public final String f17700a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f17701b = new long[2];

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<z> f17702c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<z> f17703d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17704e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f17705f;

        /* renamed from: g  reason: collision with root package name */
        public a f17706g;

        /* renamed from: h  reason: collision with root package name */
        public int f17707h;

        public C0332b(String str) {
            this.f17700a = str;
            b.this.getClass();
            b.this.getClass();
            this.f17702c = new ArrayList<>(2);
            b.this.getClass();
            this.f17703d = new ArrayList<>(2);
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            b.this.getClass();
            for (int i8 = 0; i8 < 2; i8++) {
                sb2.append(i8);
                this.f17702c.add(b.this.f17691a.c(sb2.toString()));
                sb2.append(".tmp");
                this.f17703d.add(b.this.f17691a.c(sb2.toString()));
                sb2.setLength(length);
            }
        }

        public final c a() {
            if (!this.f17704e || this.f17706g != null || this.f17705f) {
                return null;
            }
            ArrayList<z> arrayList = this.f17702c;
            int size = arrayList.size();
            int i8 = 0;
            while (true) {
                b bVar = b.this;
                if (i8 < size) {
                    if (!bVar.L.f(arrayList.get(i8))) {
                        try {
                            bVar.F(this);
                        } catch (IOException unused) {
                        }
                        return null;
                    }
                    i8++;
                } else {
                    this.f17707h++;
                    return new c(this);
                }
            }
        }
    }

    public final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final C0332b f17709a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17710b;

        public c(C0332b bVar) {
            this.f17709a = bVar;
        }

        public final z c(int i8) {
            if (!this.f17710b) {
                return this.f17709a.f17702c.get(i8);
            }
            throw new IllegalStateException("snapshot is closed".toString());
        }

        public final void close() {
            if (!this.f17710b) {
                this.f17710b = true;
                b bVar = b.this;
                synchronized (bVar) {
                    C0332b bVar2 = this.f17709a;
                    int i8 = bVar2.f17707h - 1;
                    bVar2.f17707h = i8;
                    if (i8 == 0 && bVar2.f17705f) {
                        zf.c cVar = b.M;
                        bVar.F(bVar2);
                    }
                    m mVar = m.f8717a;
                }
            }
        }
    }

    @lf.e(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class d extends i implements p<g0, jf.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17712a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar, jf.d<? super d> dVar) {
            super(2, dVar);
            this.f17712a = bVar;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            return new d(this.f17712a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:7|8|9|10|11|12|13|(1:15)(1:16)|(1:18)) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r4.K = true;
            r4.F = d2.f1.i(new wg.d());
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0025 */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0014=Splitter:B:10:0x0014, B:12:0x0016=Splitter:B:12:0x0016, B:24:0x0036=Splitter:B:24:0x0036} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                cb.b.J(r4)
                z3.b r4 = r3.f17712a
                monitor-enter(r4)
                boolean r0 = r4.H     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x0036
                boolean r0 = r4.I     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x000f
                goto L_0x0036
            L_0x000f:
                r0 = 1
                r4.K()     // Catch:{ IOException -> 0x0014 }
                goto L_0x0016
            L_0x0014:
                r4.J = r0     // Catch:{ all -> 0x003a }
            L_0x0016:
                int r1 = r4.E     // Catch:{ IOException -> 0x0025 }
                r2 = 2000(0x7d0, float:2.803E-42)
                if (r1 < r2) goto L_0x001e
                r1 = r0
                goto L_0x001f
            L_0x001e:
                r1 = 0
            L_0x001f:
                if (r1 == 0) goto L_0x0032
                r4.Q()     // Catch:{ IOException -> 0x0025 }
                goto L_0x0032
            L_0x0025:
                r4.K = r0     // Catch:{ all -> 0x003a }
                wg.d r0 = new wg.d     // Catch:{ all -> 0x003a }
                r0.<init>()     // Catch:{ all -> 0x003a }
                wg.b0 r0 = d2.f1.i(r0)     // Catch:{ all -> 0x003a }
                r4.F = r0     // Catch:{ all -> 0x003a }
            L_0x0032:
                monitor-exit(r4)
                ff.m r4 = ff.m.f8717a
                return r4
            L_0x0036:
                ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x003a }
                monitor-exit(r4)
                return r0
            L_0x003a:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(u uVar, z zVar, kotlinx.coroutines.scheduling.b bVar, long j10) {
        this.f17691a = zVar;
        this.f17692b = j10;
        if (j10 > 0) {
            this.f17693c = zVar.c("journal");
            this.f17694d = zVar.c("journal.tmp");
            this.f17695e = zVar.c("journal.bkp");
            this.B = new LinkedHashMap<>(0, 0.75f, true);
            this.C = f1.e(f.a.a(cb.d.f(), bVar.I0(1)));
            this.L = new c(uVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void L(String str) {
        zf.c cVar = M;
        cVar.getClass();
        j.f(str, "input");
        if (!cVar.f17974a.matcher(str).matches()) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0112, code lost:
        if (r1 != false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(z3.b r9, z3.b.a r10, boolean r11) {
        /*
            monitor-enter(r9)
            z3.b$b r0 = r10.f17696a     // Catch:{ all -> 0x0125 }
            z3.b$a r1 = r0.f17706g     // Catch:{ all -> 0x0125 }
            boolean r1 = sf.j.a(r1, r10)     // Catch:{ all -> 0x0125 }
            if (r1 == 0) goto L_0x0119
            r1 = 0
            r2 = 2
            if (r11 == 0) goto L_0x008f
            boolean r3 = r0.f17705f     // Catch:{ all -> 0x0125 }
            if (r3 != 0) goto L_0x008f
            r3 = r1
        L_0x0014:
            if (r3 >= r2) goto L_0x0035
            boolean[] r4 = r10.f17698c     // Catch:{ all -> 0x0125 }
            boolean r4 = r4[r3]     // Catch:{ all -> 0x0125 }
            if (r4 == 0) goto L_0x0032
            z3.c r4 = r9.L     // Catch:{ all -> 0x0125 }
            java.util.ArrayList<wg.z> r5 = r0.f17703d     // Catch:{ all -> 0x0125 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0125 }
            wg.z r5 = (wg.z) r5     // Catch:{ all -> 0x0125 }
            boolean r4 = r4.f(r5)     // Catch:{ all -> 0x0125 }
            if (r4 != 0) goto L_0x0032
            r10.a(r1)     // Catch:{ all -> 0x0125 }
            monitor-exit(r9)
            goto L_0x0118
        L_0x0032:
            int r3 = r3 + 1
            goto L_0x0014
        L_0x0035:
            r10 = r1
        L_0x0036:
            if (r10 >= r2) goto L_0x00a2
            java.util.ArrayList<wg.z> r3 = r0.f17703d     // Catch:{ all -> 0x0125 }
            java.lang.Object r3 = r3.get(r10)     // Catch:{ all -> 0x0125 }
            wg.z r3 = (wg.z) r3     // Catch:{ all -> 0x0125 }
            java.util.ArrayList<wg.z> r4 = r0.f17702c     // Catch:{ all -> 0x0125 }
            java.lang.Object r4 = r4.get(r10)     // Catch:{ all -> 0x0125 }
            wg.z r4 = (wg.z) r4     // Catch:{ all -> 0x0125 }
            z3.c r5 = r9.L     // Catch:{ all -> 0x0125 }
            boolean r5 = r5.f(r3)     // Catch:{ all -> 0x0125 }
            if (r5 == 0) goto L_0x0056
            z3.c r5 = r9.L     // Catch:{ all -> 0x0125 }
            r5.b(r3, r4)     // Catch:{ all -> 0x0125 }
            goto L_0x006d
        L_0x0056:
            z3.c r3 = r9.L     // Catch:{ all -> 0x0125 }
            java.util.ArrayList<wg.z> r5 = r0.f17702c     // Catch:{ all -> 0x0125 }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ all -> 0x0125 }
            wg.z r5 = (wg.z) r5     // Catch:{ all -> 0x0125 }
            boolean r6 = r3.f(r5)     // Catch:{ all -> 0x0125 }
            if (r6 != 0) goto L_0x006d
            wg.g0 r3 = r3.k(r5)     // Catch:{ all -> 0x0125 }
            m4.c.a(r3)     // Catch:{ all -> 0x0125 }
        L_0x006d:
            long[] r3 = r0.f17701b     // Catch:{ all -> 0x0125 }
            r5 = r3[r10]     // Catch:{ all -> 0x0125 }
            z3.c r3 = r9.L     // Catch:{ all -> 0x0125 }
            wg.k r3 = r3.h(r4)     // Catch:{ all -> 0x0125 }
            java.lang.Long r3 = r3.f16776d     // Catch:{ all -> 0x0125 }
            if (r3 == 0) goto L_0x0080
            long r3 = r3.longValue()     // Catch:{ all -> 0x0125 }
            goto L_0x0082
        L_0x0080:
            r3 = 0
        L_0x0082:
            long[] r7 = r0.f17701b     // Catch:{ all -> 0x0125 }
            r7[r10] = r3     // Catch:{ all -> 0x0125 }
            long r7 = r9.D     // Catch:{ all -> 0x0125 }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.D = r7     // Catch:{ all -> 0x0125 }
            int r10 = r10 + 1
            goto L_0x0036
        L_0x008f:
            r10 = r1
        L_0x0090:
            if (r10 >= r2) goto L_0x00a2
            z3.c r3 = r9.L     // Catch:{ all -> 0x0125 }
            java.util.ArrayList<wg.z> r4 = r0.f17703d     // Catch:{ all -> 0x0125 }
            java.lang.Object r4 = r4.get(r10)     // Catch:{ all -> 0x0125 }
            wg.z r4 = (wg.z) r4     // Catch:{ all -> 0x0125 }
            r3.e(r4)     // Catch:{ all -> 0x0125 }
            int r10 = r10 + 1
            goto L_0x0090
        L_0x00a2:
            r10 = 0
            r0.f17706g = r10     // Catch:{ all -> 0x0125 }
            boolean r10 = r0.f17705f     // Catch:{ all -> 0x0125 }
            if (r10 == 0) goto L_0x00ae
            r9.F(r0)     // Catch:{ all -> 0x0125 }
            monitor-exit(r9)
            goto L_0x0118
        L_0x00ae:
            int r10 = r9.E     // Catch:{ all -> 0x0125 }
            r2 = 1
            int r10 = r10 + r2
            r9.E = r10     // Catch:{ all -> 0x0125 }
            wg.g r10 = r9.F     // Catch:{ all -> 0x0125 }
            sf.j.c(r10)     // Catch:{ all -> 0x0125 }
            r3 = 32
            r4 = 10
            if (r11 != 0) goto L_0x00dc
            boolean r11 = r0.f17704e     // Catch:{ all -> 0x0125 }
            if (r11 == 0) goto L_0x00c4
            goto L_0x00dc
        L_0x00c4:
            java.util.LinkedHashMap<java.lang.String, z3.b$b> r11 = r9.B     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = r0.f17700a     // Catch:{ all -> 0x0125 }
            r11.remove(r5)     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = "REMOVE"
            r10.M(r11)     // Catch:{ all -> 0x0125 }
            r10.writeByte(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = r0.f17700a     // Catch:{ all -> 0x0125 }
            r10.M(r11)     // Catch:{ all -> 0x0125 }
            r10.writeByte(r4)     // Catch:{ all -> 0x0125 }
            goto L_0x0100
        L_0x00dc:
            r0.f17704e = r2     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = "CLEAN"
            r10.M(r11)     // Catch:{ all -> 0x0125 }
            r10.writeByte(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r11 = r0.f17700a     // Catch:{ all -> 0x0125 }
            r10.M(r11)     // Catch:{ all -> 0x0125 }
            long[] r11 = r0.f17701b     // Catch:{ all -> 0x0125 }
            int r0 = r11.length     // Catch:{ all -> 0x0125 }
            r5 = r1
        L_0x00ef:
            if (r5 >= r0) goto L_0x00fd
            r6 = r11[r5]     // Catch:{ all -> 0x0125 }
            wg.g r8 = r10.writeByte(r3)     // Catch:{ all -> 0x0125 }
            r8.A0(r6)     // Catch:{ all -> 0x0125 }
            int r5 = r5 + 1
            goto L_0x00ef
        L_0x00fd:
            r10.writeByte(r4)     // Catch:{ all -> 0x0125 }
        L_0x0100:
            r10.flush()     // Catch:{ all -> 0x0125 }
            long r10 = r9.D     // Catch:{ all -> 0x0125 }
            long r3 = r9.f17692b     // Catch:{ all -> 0x0125 }
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0114
            int r10 = r9.E     // Catch:{ all -> 0x0125 }
            r11 = 2000(0x7d0, float:2.803E-42)
            if (r10 < r11) goto L_0x0112
            r1 = r2
        L_0x0112:
            if (r1 == 0) goto L_0x0117
        L_0x0114:
            r9.q()     // Catch:{ all -> 0x0125 }
        L_0x0117:
            monitor-exit(r9)
        L_0x0118:
            return
        L_0x0119:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0125 }
            r11.<init>(r10)     // Catch:{ all -> 0x0125 }
            throw r11     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.b.c(z3.b, z3.b$a, boolean):void");
    }

    public final void D(String str) {
        String str2;
        int F0 = n.F0(str, ' ', 0, false, 6);
        if (F0 != -1) {
            int i8 = F0 + 1;
            int F02 = n.F0(str, ' ', i8, false, 4);
            LinkedHashMap<String, C0332b> linkedHashMap = this.B;
            if (F02 == -1) {
                str2 = str.substring(i8);
                j.e(str2, "this as java.lang.String).substring(startIndex)");
                if (F0 == 6 && zf.j.x0(str, "REMOVE", false)) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i8, F02);
                j.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            C0332b bVar = linkedHashMap.get(str2);
            if (bVar == null) {
                bVar = new C0332b(str2);
                linkedHashMap.put(str2, bVar);
            }
            C0332b bVar2 = bVar;
            if (F02 != -1 && F0 == 5 && zf.j.x0(str, "CLEAN", false)) {
                String substring = str.substring(F02 + 1);
                j.e(substring, "this as java.lang.String).substring(startIndex)");
                List R0 = n.R0(substring, new char[]{' '});
                bVar2.f17704e = true;
                bVar2.f17706g = null;
                int size = R0.size();
                b.this.getClass();
                if (size == 2) {
                    try {
                        int size2 = R0.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            bVar2.f17701b[i10] = Long.parseLong((String) R0.get(i10));
                        }
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + R0);
                    }
                } else {
                    throw new IOException("unexpected journal line: " + R0);
                }
            } else if (F02 == -1 && F0 == 5 && zf.j.x0(str, "DIRTY", false)) {
                bVar2.f17706g = new a(bVar2);
            } else if (F02 != -1 || F0 != 4 || !zf.j.x0(str, "READ", false)) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    public final void F(C0332b bVar) {
        g gVar;
        int i8 = bVar.f17707h;
        String str = bVar.f17700a;
        if (i8 > 0 && (gVar = this.F) != null) {
            gVar.M("DIRTY");
            gVar.writeByte(32);
            gVar.M(str);
            gVar.writeByte(10);
            gVar.flush();
        }
        boolean z10 = true;
        if (bVar.f17707h > 0 || bVar.f17706g != null) {
            bVar.f17705f = true;
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.L.e(bVar.f17702c.get(i10));
            long j10 = this.D;
            long[] jArr = bVar.f17701b;
            this.D = j10 - jArr[i10];
            jArr[i10] = 0;
        }
        this.E++;
        g gVar2 = this.F;
        if (gVar2 != null) {
            gVar2.M("REMOVE");
            gVar2.writeByte(32);
            gVar2.M(str);
            gVar2.writeByte(10);
        }
        this.B.remove(str);
        if (this.E < 2000) {
            z10 = false;
        }
        if (z10) {
            q();
        }
    }

    public final void K() {
        boolean z10;
        do {
            z10 = false;
            if (this.D > this.f17692b) {
                Iterator<C0332b> it = this.B.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0332b next = it.next();
                    if (!next.f17705f) {
                        F(next);
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                this.J = false;
                return;
            }
        } while (z10);
    }

    public final synchronized void Q() {
        m mVar;
        g gVar = this.F;
        if (gVar != null) {
            gVar.close();
        }
        b0 i8 = f1.i(this.L.k(this.f17694d));
        Throwable th = null;
        try {
            i8.M("libcore.io.DiskLruCache");
            i8.writeByte(10);
            i8.M("1");
            i8.writeByte(10);
            i8.A0((long) 1);
            i8.writeByte(10);
            i8.A0((long) 2);
            i8.writeByte(10);
            i8.writeByte(10);
            for (C0332b next : this.B.values()) {
                if (next.f17706g != null) {
                    i8.M("DIRTY");
                    i8.writeByte(32);
                    i8.M(next.f17700a);
                    i8.writeByte(10);
                } else {
                    i8.M("CLEAN");
                    i8.writeByte(32);
                    i8.M(next.f17700a);
                    for (long A0 : next.f17701b) {
                        i8.writeByte(32);
                        i8.A0(A0);
                    }
                    i8.writeByte(10);
                }
            }
            mVar = m.f8717a;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            mVar = null;
            th = th3;
        }
        try {
            i8.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            } else {
                z0.c(th, th4);
            }
        }
        if (th == null) {
            j.c(mVar);
            if (this.L.f(this.f17693c)) {
                this.L.b(this.f17693c, this.f17695e);
                this.L.b(this.f17694d, this.f17693c);
                this.L.e(this.f17695e);
            } else {
                this.L.b(this.f17694d, this.f17693c);
            }
            this.F = s();
            this.E = 0;
            this.G = false;
            this.K = false;
        } else {
            throw th;
        }
    }

    public final synchronized void close() {
        if (this.H) {
            if (!this.I) {
                Object[] array = this.B.values().toArray(new C0332b[0]);
                j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (C0332b bVar : (C0332b[]) array) {
                    a aVar = bVar.f17706g;
                    if (aVar != null) {
                        C0332b bVar2 = aVar.f17696a;
                        if (j.a(bVar2.f17706g, aVar)) {
                            bVar2.f17705f = true;
                        }
                    }
                }
                K();
                f1.l(this.C);
                g gVar = this.F;
                j.c(gVar);
                gVar.close();
                this.F = null;
                this.I = true;
                return;
            }
        }
        this.I = true;
    }

    public final void d() {
        if (!(!this.I)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized a e(String str) {
        d();
        L(str);
        p();
        C0332b bVar = this.B.get(str);
        if ((bVar != null ? bVar.f17706g : null) != null) {
            return null;
        }
        if (bVar != null) {
            if (bVar.f17707h != 0) {
                return null;
            }
        }
        if (!this.J) {
            if (!this.K) {
                g gVar = this.F;
                j.c(gVar);
                gVar.M("DIRTY");
                gVar.writeByte(32);
                gVar.M(str);
                gVar.writeByte(10);
                gVar.flush();
                if (this.G) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new C0332b(str);
                    this.B.put(str, bVar);
                }
                a aVar = new a(bVar);
                bVar.f17706g = aVar;
                return aVar;
            }
        }
        q();
        return null;
    }

    public final synchronized void flush() {
        if (this.H) {
            d();
            K();
            g gVar = this.F;
            j.c(gVar);
            gVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized z3.b.c j(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.d()     // Catch:{ all -> 0x004a }
            L(r5)     // Catch:{ all -> 0x004a }
            r4.p()     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap<java.lang.String, z3.b$b> r0 = r4.B     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x004a }
            z3.b$b r0 = (z3.b.C0332b) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0047
            z3.b$c r0 = r0.a()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x001b
            goto L_0x0047
        L_0x001b:
            int r1 = r4.E     // Catch:{ all -> 0x004a }
            r2 = 1
            int r1 = r1 + r2
            r4.E = r1     // Catch:{ all -> 0x004a }
            wg.g r1 = r4.F     // Catch:{ all -> 0x004a }
            sf.j.c(r1)     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "READ"
            r1.M(r3)     // Catch:{ all -> 0x004a }
            r3 = 32
            r1.writeByte(r3)     // Catch:{ all -> 0x004a }
            r1.M(r5)     // Catch:{ all -> 0x004a }
            r5 = 10
            r1.writeByte(r5)     // Catch:{ all -> 0x004a }
            int r5 = r4.E     // Catch:{ all -> 0x004a }
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r5 < r1) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r4.q()     // Catch:{ all -> 0x004a }
        L_0x0045:
            monitor-exit(r4)
            return r0
        L_0x0047:
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x004a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.b.j(java.lang.String):z3.b$c");
    }

    public final synchronized void p() {
        if (!this.H) {
            this.L.e(this.f17694d);
            if (this.L.f(this.f17695e)) {
                if (this.L.f(this.f17693c)) {
                    this.L.e(this.f17695e);
                } else {
                    this.L.b(this.f17695e, this.f17693c);
                }
            }
            if (this.L.f(this.f17693c)) {
                try {
                    z();
                    u();
                    this.H = true;
                    return;
                } catch (IOException unused) {
                    close();
                    cb.b.v(this.L, this.f17691a);
                    this.I = false;
                } catch (Throwable th) {
                    this.I = false;
                    throw th;
                }
            }
            Q();
            this.H = true;
        }
    }

    public final void q() {
        cb.b.D(this.C, (f.b) null, 0, new d(this, (jf.d<? super d>) null), 3);
    }

    public final b0 s() {
        c cVar = this.L;
        cVar.getClass();
        z zVar = this.f17693c;
        j.f(zVar, "file");
        return f1.i(new e(cVar.f16787b.a(zVar), new d(this)));
    }

    public final void u() {
        Iterator<C0332b> it = this.B.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            C0332b next = it.next();
            int i8 = 0;
            if (next.f17706g == null) {
                while (i8 < 2) {
                    j10 += next.f17701b[i8];
                    i8++;
                }
            } else {
                next.f17706g = null;
                while (i8 < 2) {
                    c cVar = this.L;
                    cVar.e(next.f17702c.get(i8));
                    cVar.e(next.f17703d.get(i8));
                    i8++;
                }
                it.remove();
            }
        }
        this.D = j10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|(1:21)(1:22)|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r13.E = r11 - r13.B.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (r2.y() == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r13.F = s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r0 = ff.m.f8717a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z() {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            z3.c r2 = r13.L
            wg.z r3 = r13.f17693c
            wg.i0 r2 = r2.l(r3)
            wg.c0 r2 = d2.f1.j(r2)
            r3 = 0
            java.lang.String r4 = r2.j0()     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r2.j0()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r2.j0()     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = r2.j0()     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = r2.j0()     // Catch:{ all -> 0x00ab }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = sf.j.a(r9, r4)     // Catch:{ all -> 0x00ab }
            if (r9 == 0) goto L_0x007c
            java.lang.String r9 = "1"
            boolean r9 = sf.j.a(r9, r5)     // Catch:{ all -> 0x00ab }
            if (r9 == 0) goto L_0x007c
            r9 = 1
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00ab }
            boolean r10 = sf.j.a(r10, r6)     // Catch:{ all -> 0x00ab }
            if (r10 == 0) goto L_0x007c
            r10 = 2
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00ab }
            boolean r10 = sf.j.a(r10, r7)     // Catch:{ all -> 0x00ab }
            if (r10 == 0) goto L_0x007c
            int r10 = r8.length()     // Catch:{ all -> 0x00ab }
            r11 = 0
            if (r10 <= 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r9 = r11
        L_0x0054:
            if (r9 != 0) goto L_0x007c
        L_0x0056:
            java.lang.String r0 = r2.j0()     // Catch:{ EOFException -> 0x0060 }
            r13.D(r0)     // Catch:{ EOFException -> 0x0060 }
            int r11 = r11 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, z3.b$b> r0 = r13.B     // Catch:{ all -> 0x00ab }
            int r0 = r0.size()     // Catch:{ all -> 0x00ab }
            int r11 = r11 - r0
            r13.E = r11     // Catch:{ all -> 0x00ab }
            boolean r0 = r2.y()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0073
            r13.Q()     // Catch:{ all -> 0x00ab }
            goto L_0x0079
        L_0x0073:
            wg.b0 r0 = r13.s()     // Catch:{ all -> 0x00ab }
            r13.F = r0     // Catch:{ all -> 0x00ab }
        L_0x0079:
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x007c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r10.<init>(r1)     // Catch:{ all -> 0x00ab }
            r10.append(r4)     // Catch:{ all -> 0x00ab }
            r10.append(r0)     // Catch:{ all -> 0x00ab }
            r10.append(r5)     // Catch:{ all -> 0x00ab }
            r10.append(r0)     // Catch:{ all -> 0x00ab }
            r10.append(r6)     // Catch:{ all -> 0x00ab }
            r10.append(r0)     // Catch:{ all -> 0x00ab }
            r10.append(r7)     // Catch:{ all -> 0x00ab }
            r10.append(r0)     // Catch:{ all -> 0x00ab }
            r10.append(r8)     // Catch:{ all -> 0x00ab }
            r0 = 93
            r10.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x00ab }
            r9.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r9     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            r12 = r3
            r3 = r0
            r0 = r12
        L_0x00af:
            r2.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00bb
        L_0x00b3:
            r1 = move-exception
            if (r3 != 0) goto L_0x00b8
            r3 = r1
            goto L_0x00bb
        L_0x00b8:
            androidx.fragment.app.z0.c(r3, r1)
        L_0x00bb:
            if (r3 != 0) goto L_0x00c1
            sf.j.c(r0)
            return
        L_0x00c1:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.b.z():void");
    }
}
