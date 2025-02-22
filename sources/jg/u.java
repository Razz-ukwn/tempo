package jg;

import h0.e;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import jg.q;
import jg.t;
import sf.j;
import wg.g;
import wg.i;

public final class u extends b0 {

    /* renamed from: e  reason: collision with root package name */
    public static final t f10176e = t.a.a("multipart/mixed");

    /* renamed from: f  reason: collision with root package name */
    public static final t f10177f = t.a.a("multipart/form-data");

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f10178g = {58, 32};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f10179h = {13, 10};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f10180i = {45, 45};

    /* renamed from: a  reason: collision with root package name */
    public final i f10181a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f10182b;

    /* renamed from: c  reason: collision with root package name */
    public final t f10183c;

    /* renamed from: d  reason: collision with root package name */
    public long f10184d = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f10185a;

        /* renamed from: b  reason: collision with root package name */
        public t f10186b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f10187c;

        public a() {
            this(0);
        }

        public a(int i8) {
            String uuid = UUID.randomUUID().toString();
            j.e(uuid, "randomUUID().toString()");
            i iVar = i.f16760d;
            this.f10185a = i.a.b(uuid);
            this.f10186b = u.f10176e;
            this.f10187c = new ArrayList();
        }

        public final void a(String str, String str2) {
            j.f(str2, "value");
            byte[] bytes = str2.getBytes(zf.a.f17962b);
            j.e(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            kg.b.c((long) bytes.length, (long) 0, (long) length);
            this.f10187c.add(c.a.b(str, (String) null, new a0((t) null, bytes, length, 0)));
        }

        public final u b() {
            ArrayList arrayList = this.f10187c;
            if (!arrayList.isEmpty()) {
                return new u(this.f10185a, this.f10186b, kg.b.x(arrayList));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final void c(t tVar) {
            j.f(tVar, "type");
            if (j.a(tVar.f10174b, "multipart")) {
                this.f10186b = tVar;
                return;
            }
            throw new IllegalArgumentException(j.k(tVar, "multipart != ").toString());
        }
    }

    public static final class b {
        public static void a(String str, StringBuilder sb2) {
            j.f(str, "key");
            sb2.append('\"');
            int length = str.length();
            int i8 = 0;
            while (i8 < length) {
                int i10 = i8 + 1;
                char charAt = str.charAt(i8);
                if (charAt == 10) {
                    sb2.append("%0A");
                } else if (charAt == 13) {
                    sb2.append("%0D");
                } else if (charAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(charAt);
                }
                i8 = i10;
            }
            sb2.append('\"');
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final q f10188a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f10189b;

        public static final class a {
            public static c a(q qVar, b0 b0Var) {
                j.f(b0Var, "body");
                String str = null;
                boolean z10 = true;
                if ((qVar == null ? null : qVar.a("Content-Type")) == null) {
                    if (qVar != null) {
                        str = qVar.a("Content-Length");
                    }
                    if (str != null) {
                        z10 = false;
                    }
                    if (z10) {
                        return new c(qVar, b0Var);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public static c b(String str, String str2, b0 b0Var) {
                StringBuilder c3 = e.c("form-data; name=");
                t tVar = u.f10176e;
                b.a(str, c3);
                if (str2 != null) {
                    c3.append("; filename=");
                    b.a(str2, c3);
                }
                String sb2 = c3.toString();
                j.e(sb2, "StringBuilder().apply(builderAction).toString()");
                q.a aVar = new q.a();
                q.b.a("Content-Disposition");
                aVar.b("Content-Disposition", sb2);
                return a(aVar.c(), b0Var);
            }
        }

        public c(q qVar, b0 b0Var) {
            this.f10188a = qVar;
            this.f10189b = b0Var;
        }
    }

    static {
        Pattern pattern = t.f10171d;
        t.a.a("multipart/alternative");
        t.a.a("multipart/digest");
        t.a.a("multipart/parallel");
    }

    public u(i iVar, t tVar, List<c> list) {
        j.f(iVar, "boundaryByteString");
        j.f(tVar, "type");
        this.f10181a = iVar;
        this.f10182b = list;
        Pattern pattern = t.f10171d;
        this.f10183c = t.a.a(tVar + "; boundary=" + iVar.q());
    }

    public final long a() {
        long j10 = this.f10184d;
        if (j10 != -1) {
            return j10;
        }
        long d10 = d((g) null, true);
        this.f10184d = d10;
        return d10;
    }

    public final t b() {
        return this.f10183c;
    }

    public final void c(g gVar) {
        d(gVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: wg.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: wg.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: wg.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: wg.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: wg.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: wg.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(wg.g r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            wg.e r1 = new wg.e
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List<jg.u$c> r3 = r0.f10182b
            int r4 = r3.size()
            r6 = 0
            r8 = 0
        L_0x0018:
            wg.i r9 = r0.f10181a
            byte[] r10 = f10180i
            byte[] r11 = f10179h
            if (r8 >= r4) goto L_0x00a5
            int r12 = r8 + 1
            java.lang.Object r8 = r3.get(r8)
            jg.u$c r8 = (jg.u.c) r8
            jg.q r13 = r8.f10188a
            sf.j.c(r1)
            r1.write(r10)
            r1.O(r9)
            r1.write(r11)
            if (r13 == 0) goto L_0x005d
            java.lang.String[] r9 = r13.f10150a
            int r9 = r9.length
            int r9 = r9 / 2
            r10 = 0
        L_0x003e:
            if (r10 >= r9) goto L_0x005d
            int r14 = r10 + 1
            java.lang.String r15 = r13.c(r10)
            wg.g r15 = r1.M(r15)
            byte[] r5 = f10178g
            wg.g r5 = r15.write(r5)
            java.lang.String r10 = r13.e(r10)
            wg.g r5 = r5.M(r10)
            r5.write(r11)
            r10 = r14
            goto L_0x003e
        L_0x005d:
            jg.b0 r5 = r8.f10189b
            jg.t r8 = r5.b()
            if (r8 == 0) goto L_0x0074
            java.lang.String r9 = "Content-Type: "
            wg.g r9 = r1.M(r9)
            java.lang.String r8 = r8.f10173a
            wg.g r8 = r9.M(r8)
            r8.write(r11)
        L_0x0074:
            long r8 = r5.a()
            r13 = -1
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x008c
            java.lang.String r10 = "Content-Length: "
            wg.g r10 = r1.M(r10)
            wg.g r10 = r10.A0(r8)
            r10.write(r11)
            goto L_0x0095
        L_0x008c:
            if (r18 == 0) goto L_0x0095
            sf.j.c(r2)
            r2.j()
            return r13
        L_0x0095:
            r1.write(r11)
            if (r18 == 0) goto L_0x009c
            long r6 = r6 + r8
            goto L_0x009f
        L_0x009c:
            r5.c(r1)
        L_0x009f:
            r1.write(r11)
            r8 = r12
            goto L_0x0018
        L_0x00a5:
            sf.j.c(r1)
            r1.write(r10)
            r1.O(r9)
            r1.write(r10)
            r1.write(r11)
            if (r18 == 0) goto L_0x00bf
            sf.j.c(r2)
            long r3 = r2.f16752b
            long r6 = r6 + r3
            r2.j()
        L_0x00bf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.u.d(wg.g, boolean):long");
    }
}
