package kg;

import androidx.fragment.app.z0;
import cb.d;
import d.a;
import d2.f1;
import gf.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jg.a0;
import jg.c0;
import jg.e0;
import jg.q;
import jg.r;
import jg.t;
import jg.v;
import wg.e;
import wg.h;
import wg.i;
import wg.i0;
import wg.x;
import zf.c;
import zf.n;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f10474a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f10475b = q.b.c(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final e0 f10476c;

    /* renamed from: d  reason: collision with root package name */
    public static final x f10477d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f10478e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f10479f = new c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final String f10480g;

    static {
        int i8;
        byte[] bArr = new byte[0];
        f10474a = bArr;
        e eVar = new e();
        eVar.write(bArr, 0, 0);
        long j10 = (long) 0;
        f10476c = new e0((t) null, j10, eVar);
        c(j10, j10, j10);
        new a0((t) null, bArr, 0, 0);
        i iVar = i.f16760d;
        i[] iVarArr = {i.a.a("efbbbf"), i.a.a("feff"), i.a.a("fffe"), i.a.a("0000ffff"), i.a.a("ffff0000")};
        ArrayList arrayList = new ArrayList(new j(iVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i10 = 0; i10 < 5; i10++) {
            i iVar2 = iVarArr[i10];
            arrayList2.add(-1);
        }
        Object[] array = arrayList2.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            ArrayList Q = d.Q(Arrays.copyOf(numArr, numArr.length));
            int i11 = 0;
            int i12 = 0;
            while (i11 < 5) {
                i iVar3 = iVarArr[i11];
                int i13 = i12 + 1;
                int size = arrayList.size();
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException(a.a("fromIndex (0) is greater than toIndex (", size, ")."));
                } else if (size <= size2) {
                    int i14 = size - 1;
                    int i15 = 0;
                    while (true) {
                        if (i15 > i14) {
                            i8 = -(i15 + 1);
                            break;
                        }
                        i8 = (i15 + i14) >>> 1;
                        int t2 = f1.t((Comparable) arrayList.get(i8), iVar3);
                        if (t2 >= 0) {
                            if (t2 <= 0) {
                                break;
                            }
                            i14 = i8 - 1;
                        } else {
                            i15 = i8 + 1;
                        }
                    }
                    Q.set(i8, Integer.valueOf(i12));
                    i11++;
                    i12 = i13;
                } else {
                    throw new IndexOutOfBoundsException(androidx.activity.result.d.b("toIndex (", size, ") is greater than size (", size2, ")."));
                }
            }
            if (((i) arrayList.get(0)).d() > 0) {
                int i16 = 0;
                while (i16 < arrayList.size()) {
                    i iVar4 = (i) arrayList.get(i16);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (i18 < arrayList.size()) {
                        i iVar5 = (i) arrayList.get(i18);
                        iVar5.getClass();
                        sf.j.f(iVar4, "prefix");
                        if (!iVar5.l(0, iVar4, iVar4.d())) {
                            continue;
                            break;
                        }
                        if (!(iVar5.d() != iVar4.d())) {
                            throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
                        } else if (((Number) Q.get(i18)).intValue() > ((Number) Q.get(i16)).intValue()) {
                            arrayList.remove(i18);
                            Q.remove(i18);
                        } else {
                            i18++;
                        }
                    }
                    i16 = i17;
                }
                e eVar2 = new e();
                x.a.a(0, eVar2, 0, arrayList, 0, arrayList.size(), Q);
                int[] iArr = new int[((int) (eVar2.f16752b / ((long) 4)))];
                int i19 = 0;
                while (!eVar2.y()) {
                    iArr[i19] = eVar2.readInt();
                    i19++;
                }
                Object[] copyOf = Arrays.copyOf(iVarArr, 5);
                sf.j.e(copyOf, "copyOf(this, size)");
                f10477d = new x((i[]) copyOf, iArr);
                TimeZone timeZone = TimeZone.getTimeZone("GMT");
                sf.j.c(timeZone);
                f10478e = timeZone;
                String O0 = n.O0("okhttp3.", v.class.getName());
                if (zf.j.r0(O0, "Client", false)) {
                    O0 = O0.substring(0, O0.length() - "Client".length());
                    sf.j.e(O0, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                f10480g = O0;
                return;
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final void A(IOException iOException, List list) {
        sf.j.f(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z0.c(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(r rVar, r rVar2) {
        sf.j.f(rVar, "<this>");
        sf.j.f(rVar2, "other");
        return sf.j.a(rVar.f10156d, rVar2.f10156d) && rVar.f10157e == rVar2.f10157e && sf.j.a(rVar.f10153a, rVar2.f10153a);
    }

    public static final int b(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(60);
        boolean z10 = true;
        if (millis <= 2147483647L) {
            if (millis == 0) {
                z10 = false;
            }
            if (z10) {
                return (int) millis;
            }
            throw new IllegalArgumentException(sf.j.k(" too small.", "timeout").toString());
        }
        throw new IllegalArgumentException(sf.j.k(" too large.", "timeout").toString());
    }

    public static final void c(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        sf.j.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!sf.j.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c3, int i8, int i10) {
        sf.j.f(str, "<this>");
        while (i8 < i10) {
            int i11 = i8 + 1;
            if (str.charAt(i8) == c3) {
                return i8;
            }
            i8 = i11;
        }
        return i10;
    }

    public static final int g(String str, int i8, int i10, String str2) {
        sf.j.f(str, "<this>");
        while (i8 < i10) {
            int i11 = i8 + 1;
            if (n.z0(str2, str.charAt(i8))) {
                return i8;
            }
            i8 = i11;
        }
        return i10;
    }

    public static final boolean h(i0 i0Var, TimeUnit timeUnit) {
        sf.j.f(i0Var, "<this>");
        sf.j.f(timeUnit, "timeUnit");
        try {
            return u(i0Var, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String str, Object... objArr) {
        sf.j.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        sf.j.e(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        sf.j.f(strArr, "<this>");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i8 = 0;
                while (i8 < length) {
                    String str = strArr[i8];
                    i8++;
                    int i10 = 0;
                    while (true) {
                        if (i10 < strArr2.length) {
                            int i11 = i10 + 1;
                            try {
                                if (comparator.compare(str, strArr2[i10]) == 0) {
                                    return true;
                                }
                                i10 = i11;
                            } catch (ArrayIndexOutOfBoundsException e10) {
                                throw new NoSuchElementException(e10.getMessage());
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(c0 c0Var) {
        String a10 = c0Var.B.a("Content-Length");
        if (a10 != null) {
            try {
                return Long.parseLong(a10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... tArr) {
        sf.j.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(d.P(Arrays.copyOf(objArr, objArr.length)));
        sf.j.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int i10 = i8 + 1;
            char charAt = str.charAt(i8);
            if (sf.j.h(charAt, 31) <= 0 || sf.j.h(charAt, 127) >= 0) {
                return i8;
            }
            i8 = i10;
        }
        return -1;
    }

    public static final int n(int i8, int i10, String str) {
        sf.j.f(str, "<this>");
        while (i8 < i10) {
            int i11 = i8 + 1;
            char charAt = str.charAt(i8);
            boolean z10 = false;
            if ((((charAt == 9 || charAt == 10) || charAt == 12) || charAt == 13) || charAt == ' ') {
                z10 = true;
            }
            if (!z10) {
                return i8;
            }
            i8 = i11;
        }
        return i10;
    }

    public static final int o(int i8, int i10, String str) {
        sf.j.f(str, "<this>");
        int i11 = i10 - 1;
        if (i8 <= i11) {
            while (true) {
                int i12 = i11 - 1;
                char charAt = str.charAt(i11);
                boolean z10 = false;
                if ((((charAt == 9 || charAt == 10) || charAt == 12) || charAt == 13) || charAt == ' ') {
                    z10 = true;
                }
                if (!z10) {
                    return i11 + 1;
                }
                if (i11 == i8) {
                    break;
                }
                i11 = i12;
            }
        }
        return i8;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        sf.j.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i8 = 0;
        while (i8 < length) {
            String str = strArr[i8];
            i8++;
            int length2 = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                String str2 = strArr2[i10];
                i10++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(String str) {
        sf.j.f(str, "name");
        return zf.j.s0(str, "Authorization", true) || zf.j.s0(str, "Cookie", true) || zf.j.s0(str, "Proxy-Authorization", true) || zf.j.s0(str, "Set-Cookie", true);
    }

    public static final int r(char c3) {
        boolean z10 = true;
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        char c10 = 'a';
        if (!('a' <= c3 && c3 < 'g')) {
            c10 = 'A';
            if ('A' > c3 || c3 >= 'G') {
                z10 = false;
            }
            if (!z10) {
                return -1;
            }
        }
        return (c3 - c10) + 10;
    }

    public static final Charset s(h hVar, Charset charset) {
        Charset charset2;
        sf.j.f(hVar, "<this>");
        sf.j.f(charset, "default");
        int w10 = hVar.w(f10477d);
        if (w10 == -1) {
            return charset;
        }
        if (w10 == 0) {
            Charset charset3 = StandardCharsets.UTF_8;
            sf.j.e(charset3, "UTF_8");
            return charset3;
        } else if (w10 == 1) {
            Charset charset4 = StandardCharsets.UTF_16BE;
            sf.j.e(charset4, "UTF_16BE");
            return charset4;
        } else if (w10 != 2) {
            if (w10 == 3) {
                zf.a.f17961a.getClass();
                charset2 = zf.a.f17964d;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32BE");
                    sf.j.e(charset2, "forName(\"UTF-32BE\")");
                    zf.a.f17964d = charset2;
                }
            } else if (w10 == 4) {
                zf.a.f17961a.getClass();
                charset2 = zf.a.f17963c;
                if (charset2 == null) {
                    charset2 = Charset.forName("UTF-32LE");
                    sf.j.e(charset2, "forName(\"UTF-32LE\")");
                    zf.a.f17963c = charset2;
                }
            } else {
                throw new AssertionError();
            }
            return charset2;
        } else {
            Charset charset5 = StandardCharsets.UTF_16LE;
            sf.j.e(charset5, "UTF_16LE");
            return charset5;
        }
    }

    public static final int t(h hVar) {
        sf.j.f(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean u(i0 i0Var, int i8, TimeUnit timeUnit) {
        sf.j.f(i0Var, "<this>");
        sf.j.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c3 = i0Var.b().e() ? i0Var.b().c() - nanoTime : Long.MAX_VALUE;
        i0Var.b().d(Math.min(c3, timeUnit.toNanos((long) i8)) + nanoTime);
        try {
            e eVar = new e();
            while (i0Var.a0(eVar, 8192) != -1) {
                eVar.j();
            }
            if (c3 == Long.MAX_VALUE) {
                i0Var.b().a();
            } else {
                i0Var.b().d(nanoTime + c3);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c3 == Long.MAX_VALUE) {
                i0Var.b().a();
            } else {
                i0Var.b().d(nanoTime + c3);
            }
            return false;
        } catch (Throwable th) {
            if (c3 == Long.MAX_VALUE) {
                i0Var.b().a();
            } else {
                i0Var.b().d(nanoTime + c3);
            }
            throw th;
        }
    }

    public static final q v(List<qg.c> list) {
        q.a aVar = new q.a();
        for (qg.c next : list) {
            aVar.b(next.f13623a.q(), next.f13624b.q());
        }
        return aVar.c();
    }

    public static final String w(r rVar, boolean z10) {
        sf.j.f(rVar, "<this>");
        String str = rVar.f10156d;
        if (n.A0(str, ":")) {
            str = "[" + str + ']';
        }
        int i8 = rVar.f10157e;
        if (!z10) {
            String str2 = rVar.f10153a;
            sf.j.f(str2, "scheme");
            if (i8 == (sf.j.a(str2, "http") ? 80 : sf.j.a(str2, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i8;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        sf.j.f(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(gf.q.P0(list));
        sf.j.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(int i8, String str) {
        Long l10;
        if (str == null) {
            l10 = null;
        } else {
            try {
                l10 = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i8;
            }
        }
        if (l10 == null) {
            return i8;
        }
        long longValue = l10.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String z(int i8, int i10, String str) {
        int n2 = n(i8, i10, str);
        String substring = str.substring(n2, o(n2, i10, str));
        sf.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
