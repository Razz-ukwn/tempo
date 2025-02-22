package xg;

import androidx.fragment.app.q;
import j0.t;
import sf.j;
import wg.e;
import wg.i;
import wg.z;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final i f17098a = i.a.b("/");

    /* renamed from: b  reason: collision with root package name */
    public static final i f17099b = i.a.b("\\");

    /* renamed from: c  reason: collision with root package name */
    public static final i f17100c = i.a.b("/\\");

    /* renamed from: d  reason: collision with root package name */
    public static final i f17101d = i.a.b(".");

    /* renamed from: e  reason: collision with root package name */
    public static final i f17102e = i.a.b("..");

    static {
        i iVar = i.f16760d;
    }

    public static final int a(z zVar) {
        if (zVar.f16809a.d() == 0) {
            return -1;
        }
        i iVar = zVar.f16809a;
        boolean z10 = false;
        if (iVar.i(0) != ((byte) 47)) {
            byte b10 = (byte) 92;
            if (iVar.i(0) == b10) {
                if (iVar.d() > 2 && iVar.i(1) == b10) {
                    i iVar2 = f17099b;
                    j.f(iVar2, "other");
                    int f10 = iVar.f(iVar2.f16761a, 2);
                    return f10 == -1 ? iVar.d() : f10;
                }
            } else if (iVar.d() <= 2 || iVar.i(1) != ((byte) 58) || iVar.i(2) != b10) {
                return -1;
            } else {
                char i8 = (char) iVar.i(0);
                if (!('a' <= i8 && i8 < '{')) {
                    if ('A' <= i8 && i8 < '[') {
                        z10 = true;
                    }
                    if (!z10) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 1;
    }

    public static final z b(z zVar, z zVar2, boolean z10) {
        j.f(zVar, "<this>");
        j.f(zVar2, "child");
        if ((a(zVar2) != -1) || zVar2.e() != null) {
            return zVar2;
        }
        i c3 = c(zVar);
        if (c3 == null && (c3 = c(zVar2)) == null) {
            c3 = f(z.f16808b);
        }
        e eVar = new e();
        eVar.f0(zVar.f16809a);
        if (eVar.f16752b > 0) {
            eVar.f0(c3);
        }
        eVar.f0(zVar2.f16809a);
        return d(eVar, z10);
    }

    public static final i c(z zVar) {
        i iVar = zVar.f16809a;
        i iVar2 = f17098a;
        if (i.g(iVar, iVar2) != -1) {
            return iVar2;
        }
        i iVar3 = f17099b;
        if (i.g(zVar.f16809a, iVar3) != -1) {
            return iVar3;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (('A' <= r4 && r4 < '[') != false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final wg.z d(wg.e r17, boolean r18) {
        /*
            r0 = r17
            wg.e r1 = new wg.e
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = r3
        L_0x000a:
            wg.i r5 = f17098a
            boolean r5 = r0.K(r5)
            if (r5 != 0) goto L_0x0155
            wg.i r5 = f17099b
            boolean r6 = r0.K(r5)
            if (r6 == 0) goto L_0x001c
            goto L_0x0155
        L_0x001c:
            r6 = 2
            r7 = 1
            if (r4 < r6) goto L_0x0028
            boolean r6 = sf.j.a(r2, r5)
            if (r6 == 0) goto L_0x0028
            r6 = r7
            goto L_0x0029
        L_0x0028:
            r6 = r3
        L_0x0029:
            wg.i r8 = f17100c
            r9 = -1
            r11 = 0
            if (r6 == 0) goto L_0x003c
            sf.j.c(r2)
            r1.f0(r2)
            r1.f0(r2)
            goto L_0x00ad
        L_0x003c:
            if (r4 <= 0) goto L_0x0046
            sf.j.c(r2)
            r1.f0(r2)
            goto L_0x00ad
        L_0x0046:
            long r13 = r0.F(r8)
            if (r2 != 0) goto L_0x005f
            int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = wg.z.f16808b
            wg.i r2 = f(r2)
            goto L_0x005f
        L_0x0057:
            byte r2 = r0.z(r13)
            wg.i r2 = e(r2)
        L_0x005f:
            boolean r4 = sf.j.a(r2, r5)
            r9 = 2
            if (r4 != 0) goto L_0x0068
            goto L_0x009b
        L_0x0068:
            long r4 = r0.f16752b
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x006f
            goto L_0x009b
        L_0x006f:
            r4 = 1
            byte r4 = r0.z(r4)
            r5 = 58
            byte r5 = (byte) r5
            if (r4 == r5) goto L_0x007b
            goto L_0x009b
        L_0x007b:
            byte r4 = r0.z(r11)
            char r4 = (char) r4
            r5 = 97
            if (r5 > r4) goto L_0x008a
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 >= r5) goto L_0x008a
            r5 = r7
            goto L_0x008b
        L_0x008a:
            r5 = r3
        L_0x008b:
            if (r5 != 0) goto L_0x009d
            r5 = 65
            if (r5 > r4) goto L_0x0097
            r5 = 91
            if (r4 >= r5) goto L_0x0097
            r4 = r7
            goto L_0x0098
        L_0x0097:
            r4 = r3
        L_0x0098:
            if (r4 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r4 = r3
            goto L_0x009e
        L_0x009d:
            r4 = r7
        L_0x009e:
            if (r4 == 0) goto L_0x00ad
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00aa
            r4 = 3
            r1.B(r0, r4)
            goto L_0x00ad
        L_0x00aa:
            r1.B(r0, r9)
        L_0x00ad:
            long r4 = r1.f16752b
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b5
            r4 = r7
            goto L_0x00b6
        L_0x00b5:
            r4 = r3
        L_0x00b6:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00bb:
            boolean r9 = r17.y()
            wg.i r10 = f17101d
            if (r9 != 0) goto L_0x012b
            long r13 = r0.F(r8)
            r15 = -1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x00d2
            wg.i r9 = r17.Q()
            goto L_0x00d9
        L_0x00d2:
            wg.i r9 = r0.k(r13)
            r17.readByte()
        L_0x00d9:
            wg.i r13 = f17102e
            boolean r14 = sf.j.a(r9, r13)
            if (r14 == 0) goto L_0x0119
            if (r4 == 0) goto L_0x00e9
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L_0x00bb
        L_0x00e9:
            if (r18 == 0) goto L_0x0115
            if (r4 != 0) goto L_0x00fe
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L_0x0115
            java.lang.Object r10 = gf.q.B0(r5)
            boolean r10 = sf.j.a(r10, r13)
            if (r10 == 0) goto L_0x00fe
            goto L_0x0115
        L_0x00fe:
            if (r6 == 0) goto L_0x0106
            int r9 = r5.size()
            if (r9 == r7) goto L_0x00bb
        L_0x0106:
            boolean r9 = r5.isEmpty()
            if (r9 == 0) goto L_0x010d
            goto L_0x00bb
        L_0x010d:
            int r9 = cb.d.H(r5)
            r5.remove(r9)
            goto L_0x00bb
        L_0x0115:
            r5.add(r9)
            goto L_0x00bb
        L_0x0119:
            boolean r10 = sf.j.a(r9, r10)
            if (r10 != 0) goto L_0x00bb
            wg.i r10 = wg.i.f16760d
            boolean r10 = sf.j.a(r9, r10)
            if (r10 != 0) goto L_0x00bb
            r5.add(r9)
            goto L_0x00bb
        L_0x012b:
            int r0 = r5.size()
        L_0x012f:
            if (r3 >= r0) goto L_0x0142
            if (r3 <= 0) goto L_0x0136
            r1.f0(r2)
        L_0x0136:
            java.lang.Object r4 = r5.get(r3)
            wg.i r4 = (wg.i) r4
            r1.f0(r4)
            int r3 = r3 + 1
            goto L_0x012f
        L_0x0142:
            long r2 = r1.f16752b
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x014b
            r1.f0(r10)
        L_0x014b:
            wg.z r0 = new wg.z
            wg.i r1 = r1.Q()
            r0.<init>(r1)
            return r0
        L_0x0155:
            byte r5 = r17.readByte()
            if (r2 != 0) goto L_0x015f
            wg.i r2 = e(r5)
        L_0x015f:
            int r4 = r4 + 1
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.k.d(wg.e, boolean):wg.z");
    }

    public static final i e(byte b10) {
        if (b10 == 47) {
            return f17098a;
        }
        if (b10 == 92) {
            return f17099b;
        }
        throw new IllegalArgumentException(q.a("not a directory separator: ", b10));
    }

    public static final i f(String str) {
        if (j.a(str, "/")) {
            return f17098a;
        }
        if (j.a(str, "\\")) {
            return f17099b;
        }
        throw new IllegalArgumentException(t.a("not a directory separator: ", str));
    }
}
