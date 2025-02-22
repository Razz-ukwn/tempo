package d2;

import ag.a0;
import ag.d0;
import ag.f0;
import ag.n1;
import ag.p2;
import ag.q0;
import ag.q1;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.q;
import androidx.fragment.app.z0;
import cb.b;
import com.google.android.gms.internal.measurement.aa;
import com.quickkonnect.silencio.R;
import ff.g;
import ff.m;
import ha.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.logging.Logger;
import jf.d;
import kf.a;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.x;
import q7.e2;
import q7.g2;
import rf.l;
import rf.p;
import sf.r;
import sf.u;
import sf.v;
import wg.b0;
import wg.c0;
import wg.e;
import wg.g0;
import wg.h0;
import wg.i0;
import wg.j0;
import wg.k;
import wg.s;
import wg.w;
import wg.y;
import wg.z;
import xg.f;
import xg.h;
import zf.j;
import zf.n;

public class f1 implements e1, c, e2 {
    public static final int[] B = {16842755, 16842961};

    /* renamed from: a  reason: collision with root package name */
    public static Thread f7212a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7213b = {R.attr.keylines, R.attr.statusBarBackground};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7214c = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ f1 f7215d = new f1();

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f7216e = {16842755, 16842960, 16842961};

    public static final boolean A(AssertionError assertionError) {
        Logger logger = w.f16803a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? n.A0(message, "getsockname failed") : false;
    }

    public static final int B(int i8) {
        if (i8 < 0) {
            return i8;
        }
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((((float) i8) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Object C(Object obj, i iVar) {
        if (obj == null) {
            return iVar;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(iVar);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(iVar);
        return arrayList;
    }

    public static final f D(c0 c0Var) {
        Long l10;
        short s10;
        long j10;
        c0 c0Var2 = c0Var;
        int l02 = c0Var.l0();
        if (l02 == 33639248) {
            c0Var2.skip(4);
            short d10 = c0Var.d() & 65535;
            if ((d10 & 1) == 0) {
                short d11 = c0Var.d() & 65535;
                short d12 = c0Var.d() & 65535;
                short d13 = c0Var.d() & 65535;
                if (d12 == -1) {
                    l10 = null;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((d13 >> 9) & 127) + 1980, ((d13 >> 5) & 15) - 1, d13 & 31, (d12 >> 11) & 31, (d12 >> 5) & 63, (d12 & 31) << 1);
                    l10 = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
                Long l11 = l10;
                c0Var.l0();
                u uVar = new u();
                uVar.f14956a = ((long) c0Var.l0()) & 4294967295L;
                u uVar2 = new u();
                uVar2.f14956a = ((long) c0Var.l0()) & 4294967295L;
                short d14 = c0Var.d() & 65535;
                short d15 = c0Var.d() & 65535;
                c0Var2.skip(8);
                u uVar3 = new u();
                uVar3.f14956a = ((long) c0Var.l0()) & 4294967295L;
                String e10 = c0Var2.e((long) (c0Var.d() & 65535));
                if (!n.z0(e10, 0)) {
                    if (uVar2.f14956a == 4294967295L) {
                        j10 = ((long) 8) + 0;
                        s10 = d11;
                    } else {
                        s10 = d11;
                        j10 = 0;
                    }
                    if (uVar.f14956a == 4294967295L) {
                        j10 += (long) 8;
                    }
                    if (uVar3.f14956a == 4294967295L) {
                        j10 += (long) 8;
                    }
                    long j11 = j10;
                    r rVar = new r();
                    Long l12 = l11;
                    h hVar = r0;
                    u uVar4 = uVar2;
                    u uVar5 = uVar2;
                    r rVar2 = rVar;
                    String str = e10;
                    u uVar6 = uVar3;
                    h hVar2 = new h(rVar, j11, uVar4, c0Var, uVar, uVar3);
                    E(c0Var2, d14, hVar);
                    if (j11 <= 0 || rVar2.f14953a) {
                        String e11 = c0Var2.e((long) d15);
                        String str2 = z.f16808b;
                        String str3 = str;
                        return new f(z.a.a("/", false).c(str3), j.r0(str3, "/", false), e11, uVar.f14956a, uVar5.f14956a, s10, l12, uVar6.f14956a);
                    }
                    throw new IOException("bad zip: zip64 extra required but absent");
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + x(d10));
        }
        throw new IOException("bad zip: expected " + x(33639248) + " but was " + x(l02));
    }

    public static final void E(c0 c0Var, int i8, p pVar) {
        long j10 = (long) i8;
        while (j10 != 0) {
            if (j10 >= 4) {
                short d10 = c0Var.d() & 65535;
                long d11 = ((long) c0Var.d()) & 65535;
                long j11 = j10 - ((long) 4);
                if (j11 >= d11) {
                    c0Var.z0(d11);
                    e eVar = c0Var.f16741b;
                    long j12 = eVar.f16752b;
                    pVar.invoke(Integer.valueOf(d10), Long.valueOf(d11));
                    long j13 = (eVar.f16752b + d11) - j12;
                    int i10 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
                    if (i10 >= 0) {
                        if (i10 > 0) {
                            eVar.skip(j13);
                        }
                        j10 = j11 - d11;
                    } else {
                        throw new IOException(q.a("unsupported zip: too many bytes processed for ", d10));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final k F(c0 c0Var, k kVar) {
        v vVar = new v();
        vVar.f14957a = kVar != null ? kVar.f16778f : null;
        v vVar2 = new v();
        v vVar3 = new v();
        int l02 = c0Var.l0();
        if (l02 == 67324752) {
            c0Var.skip(2);
            short d10 = c0Var.d() & 65535;
            if ((d10 & 1) == 0) {
                c0Var.skip(18);
                short d11 = c0Var.d() & 65535;
                c0Var.skip(((long) c0Var.d()) & 65535);
                if (kVar == null) {
                    c0Var.skip((long) d11);
                    return null;
                }
                E(c0Var, d11, new xg.i(c0Var, vVar, vVar2, vVar3));
                return new k(kVar.f16773a, kVar.f16774b, (z) null, kVar.f16776d, (Long) vVar3.f14957a, (Long) vVar.f14957a, (Long) vVar2.f14957a);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + x(d10));
        }
        throw new IOException("bad zip: expected " + x(67324752) + " but was " + x(l02));
    }

    public static final void G(q0 q0Var, d dVar, boolean z10) {
        Object j10 = q0Var.j();
        Throwable e10 = q0Var.e(j10);
        Object u7 = e10 != null ? b.u(e10) : q0Var.f(j10);
        if (z10) {
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) dVar;
            d<T> dVar2 = fVar.f10710e;
            jf.f context = dVar2.getContext();
            Object c3 = x.c(context, fVar.C);
            p2<?> c10 = c3 != x.f10740a ? a0.c(dVar2, context, c3) : null;
            try {
                fVar.f10710e.resumeWith(u7);
                m mVar = m.f8717a;
            } finally {
                if (c10 == null || c10.D0()) {
                    x.a(context, c3);
                }
            }
        } else {
            dVar.resumeWith(u7);
        }
    }

    public static final wg.b H(Socket socket) {
        Logger logger = w.f16803a;
        h0 h0Var = new h0(socket);
        OutputStream outputStream = socket.getOutputStream();
        sf.j.e(outputStream, "getOutputStream()");
        return new wg.b(h0Var, new y(outputStream, h0Var));
    }

    public static final wg.c I(Socket socket) {
        Logger logger = w.f16803a;
        h0 h0Var = new h0(socket);
        InputStream inputStream = socket.getInputStream();
        sf.j.e(inputStream, "getInputStream()");
        return new wg.c(h0Var, new s(inputStream, h0Var));
    }

    public static final s J(InputStream inputStream) {
        Logger logger = w.f16803a;
        sf.j.f(inputStream, "<this>");
        return new s(inputStream, new j0());
    }

    public static final wf.d K(wf.f fVar, int i8) {
        sf.j.f(fVar, "<this>");
        boolean z10 = i8 > 0;
        Integer valueOf = Integer.valueOf(i8);
        sf.j.f(valueOf, "step");
        if (z10) {
            if (fVar.f16716c <= 0) {
                i8 = -i8;
            }
            return new wf.d(fVar.f16714a, fVar.f16715b, i8);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final long L(String str, long j10, long j11, long j12) {
        String str2;
        int i8 = kotlinx.coroutines.internal.w.f10739a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j10;
        }
        Long q02 = zf.i.q0(str2);
        if (q02 != null) {
            long longValue = q02.longValue();
            if (j11 <= longValue && longValue <= j12) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int M(String str, int i8, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 1;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return (int) L(str, (long) i8, (long) i10, (long) i11);
    }

    public static final String N(String str) {
        sf.j.f(str, "<this>");
        int i8 = 0;
        int i10 = -1;
        if (n.A0(str, ":")) {
            InetAddress w10 = (!j.x0(str, "[", false) || !j.r0(str, "]", false)) ? w(0, str.length(), str) : w(1, str.length() - 1, str);
            if (w10 == null) {
                return null;
            }
            byte[] address = w10.getAddress();
            if (address.length == 16) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < address.length) {
                    int i13 = i11;
                    while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                        i13 += 2;
                    }
                    int i14 = i13 - i11;
                    if (i14 > i12 && i14 >= 4) {
                        i10 = i11;
                        i12 = i14;
                    }
                    i11 = i13 + 2;
                }
                e eVar = new e();
                while (i8 < address.length) {
                    if (i8 == i10) {
                        eVar.g0(58);
                        i8 += i12;
                        if (i8 == 16) {
                            eVar.g0(58);
                        }
                    } else {
                        if (i8 > 0) {
                            eVar.g0(58);
                        }
                        byte b10 = address[i8];
                        byte[] bArr = kg.b.f10474a;
                        eVar.m0((long) (((b10 & 255) << 8) | (address[i8 + 1] & 255)));
                        i8 += 2;
                    }
                }
                return eVar.X();
            } else if (address.length == 4) {
                return w10.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                sf.j.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                sf.j.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                sf.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        break;
                    }
                    int i16 = i15 + 1;
                    char charAt = lowerCase.charAt(i15);
                    if (sf.j.h(charAt, 31) <= 0) {
                        break;
                    } else if (sf.j.h(charAt, 127) >= 0) {
                        break;
                    } else if (n.F0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i15 = i16;
                    }
                }
                i8 = 1;
                if (i8 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static final Map O(Map map) {
        sf.j.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        sf.j.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final wf.f P(int i8, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new wf.f(i8, i10 - 1);
        }
        wf.f fVar = wf.f.f16721d;
        return wf.f.f16721d;
    }

    /* JADX INFO: finally extract failed */
    public static final Object Q(jf.f fVar, Object obj, Object obj2, p pVar, d dVar) {
        Object c3 = x.c(fVar, obj2);
        try {
            dg.v vVar = new dg.v(dVar, fVar);
            sf.y.c(2, pVar);
            Object invoke = pVar.invoke(obj, vVar);
            x.a(fVar, c3);
            if (invoke == a.f10464a) {
                sf.j.f(dVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            x.a(fVar, c3);
            throw th;
        }
    }

    public static final kotlinx.coroutines.internal.e e(jf.f fVar) {
        if (fVar.d(n1.b.f447a) == null) {
            fVar = fVar.n0(new q1((n1) null));
        }
        return new kotlinx.coroutines.internal.e(fVar);
    }

    public static final long f(float f10, float f11) {
        long floatToIntBits = (long) Float.floatToIntBits(f10);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f11)) & 4294967295L) | (floatToIntBits << 32);
        int i8 = h0.c.f9071e;
        return floatToIntBits2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(kotlinx.coroutines.flow.c1 r4, rf.q r5, java.lang.Throwable r6, jf.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.m
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.m r0 = (kotlinx.coroutines.flow.m) r0
            int r1 = r0.f10587c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10587c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.m r0 = new kotlinx.coroutines.flow.m
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10586b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10587c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Throwable r6 = r0.f10585a
            cb.b.J(r7)     // Catch:{ all -> 0x0042 }
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            cb.b.J(r7)
            r0.f10585a = r6     // Catch:{ all -> 0x0042 }
            r0.f10587c = r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r4 = r5.e(r4, r6, r0)     // Catch:{ all -> 0x0042 }
            if (r4 != r1) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            ff.m r1 = ff.m.f8717a
        L_0x0041:
            return r1
        L_0x0042:
            r4 = move-exception
            if (r6 == 0) goto L_0x004a
            if (r6 == r4) goto L_0x004a
            androidx.fragment.app.z0.c(r4, r6)
        L_0x004a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.f1.g(kotlinx.coroutines.flow.c1, rf.q, java.lang.Throwable, jf.d):java.lang.Object");
    }

    public static final void h(LinearLayout linearLayout, List list, String str) {
        sf.j.f(linearLayout, "linearLayout");
        sf.j.f(list, "selectedList");
        sf.j.f(str, "placeText");
        if (list.contains(str)) {
            linearLayout.setBackgroundResource(R.drawable.bg_card_selected);
        } else {
            linearLayout.setBackgroundResource(0);
        }
    }

    public static final b0 i(g0 g0Var) {
        sf.j.f(g0Var, "<this>");
        return new b0(g0Var);
    }

    public static final c0 j(i0 i0Var) {
        sf.j.f(i0Var, "<this>");
        return new c0(i0Var);
    }

    public static final LinkedHashMap k(ArrayList arrayList) {
        String str = z.f16808b;
        z a10 = z.a.a("/", false);
        LinkedHashMap T = gf.y.T(new g(a10, new f(a10)));
        for (f fVar : gf.q.J0(arrayList, new xg.g())) {
            if (((f) T.put(fVar.f17080a, fVar)) == null) {
                while (true) {
                    z b10 = fVar.f17080a.b();
                    if (b10 == null) {
                        break;
                    }
                    f fVar2 = (f) T.get(b10);
                    z zVar = fVar.f17080a;
                    if (fVar2 != null) {
                        fVar2.f17087h.add(zVar);
                        break;
                    }
                    f fVar3 = new f(b10);
                    T.put(b10, fVar3);
                    fVar3.f17087h.add(zVar);
                    fVar = fVar3;
                }
            }
        }
        return T;
    }

    public static void l(kotlinx.coroutines.internal.e eVar) {
        n1 n1Var = (n1) eVar.f10708a.d(n1.b.f447a);
        if (n1Var != null) {
            n1Var.e((CancellationException) null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + eVar).toString());
    }

    public static final void m(cg.s sVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        sVar.e(cancellationException);
    }

    public static void n(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final double o(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static final float p(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static final int q(int i8, int i10, int i11) {
        if (i10 <= i11) {
            return i8 < i10 ? i10 : i8 > i11 ? i11 : i8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static final int r(int i8, wf.f fVar) {
        sf.j.f(fVar, "range");
        if (fVar instanceof wf.b) {
            Comparable valueOf = Integer.valueOf(i8);
            wf.b bVar = (wf.b) fVar;
            sf.j.f(valueOf, "<this>");
            if (!bVar.isEmpty()) {
                if (bVar.a(valueOf, bVar.b()) && !bVar.a(bVar.b(), valueOf)) {
                    valueOf = bVar.b();
                } else if (bVar.a(bVar.c(), valueOf) && !bVar.a(valueOf, bVar.c())) {
                    valueOf = bVar.c();
                }
                return ((Number) valueOf).intValue();
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
        } else if (!fVar.isEmpty()) {
            return i8 < ((Number) fVar.b()).intValue() ? ((Number) fVar.b()).intValue() : i8 > ((Number) fVar.c()).intValue() ? ((Number) fVar.c()).intValue() : i8;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
        }
    }

    public static final p001if.a s(l... lVarArr) {
        if (lVarArr.length > 0) {
            return new p001if.a(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void u(int i8, int i10) {
        if (i8 > i10) {
            throw new IndexOutOfBoundsException(androidx.activity.result.d.b("toIndex (", i8, ") is greater than size (", i10, ")."));
        }
    }

    public static final Object v(p pVar, d dVar) {
        kotlinx.coroutines.internal.s sVar = new kotlinx.coroutines.internal.s(dVar, dVar.getContext());
        return cb.d.h0(sVar, sVar, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress w(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = 0
            r5 = -1
            r6 = r17
            r7 = r4
            r8 = r5
            r9 = r8
        L_0x000f:
            r10 = 0
            if (r6 >= r0) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r0) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = zf.j.w0(r6, r1, r14, r4)
            if (r14 == 0) goto L_0x0033
            if (r8 == r5) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = zf.j.w0(r6, r1, r11, r4)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = zf.j.w0(r6, r1, r11, r4)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r0) goto L_0x009c
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r4
            goto L_0x00a2
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r1.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r4
            r14 = r9
        L_0x0061:
            if (r14 >= r0) goto L_0x008b
            char r4 = r1.charAt(r14)
            r2 = 48
            int r16 = sf.j.h(r4, r2)
            if (r16 < 0) goto L_0x008b
            r5 = 57
            int r5 = sf.j.h(r4, r5)
            if (r5 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r4
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r0) goto L_0x00c2
            char r4 = r1.charAt(r6)
            int r4 = kg.b.r(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r13) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = 0
            r5 = -1
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f4
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f4:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.f1.w(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String x(int i8) {
        b.s(16);
        String num = Integer.toString(i8, 16);
        sf.j.e(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    public static final t y(Object obj) {
        if (obj != b1.b.B) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void z(jf.f fVar, Throwable th) {
        try {
            d0 d0Var = (d0) fVar.d(d0.a.f411a);
            if (d0Var != null) {
                d0Var.T(fVar, th);
            } else {
                f0.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                z0.c(runtimeException, th);
                th = runtimeException;
            }
            f0.a(fVar, th);
        }
    }

    public void b(View view) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement[] c(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x000d:
            int r7 = r15.length
            if (r4 >= r7) goto L_0x0066
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x0054
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            r11 = r3
        L_0x0027:
            if (r11 >= r10) goto L_0x003c
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0039
        L_0x0037:
            r9 = r3
            goto L_0x003d
        L_0x0039:
            int r11 = r11 + 1
            goto L_0x0027
        L_0x003c:
            r9 = r2
        L_0x003d:
            if (r9 != 0) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L_0x0050
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L_0x0050:
            int r8 = r8 + -1
            int r8 = r8 + r4
            goto L_0x005c
        L_0x0054:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L_0x005c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto L_0x000d
        L_0x0066:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L_0x006f
            return r0
        L_0x006f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.f1.c(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    public void d() {
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zza());
    }
}
