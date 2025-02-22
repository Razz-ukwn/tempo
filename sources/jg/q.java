package jg;

import ff.g;
import gf.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import og.c;
import sf.j;
import zf.n;

public final class q implements Iterable<g<? extends String, ? extends String>>, tf.a {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f10150a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10151a = new ArrayList(20);

        public final void a(String str, String str2) {
            j.f(str, "name");
            j.f(str2, "value");
            b.a(str);
            b.b(str2, str);
            b(str, str2);
        }

        public final void b(String str, String str2) {
            j.f(str, "name");
            j.f(str2, "value");
            ArrayList arrayList = this.f10151a;
            arrayList.add(str);
            arrayList.add(n.Z0(str2).toString());
        }

        public final q c() {
            Object[] array = this.f10151a.toArray(new String[0]);
            if (array != null) {
                return new q((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final void d(String str) {
            int i8 = 0;
            while (true) {
                ArrayList arrayList = this.f10151a;
                if (i8 < arrayList.size()) {
                    if (zf.j.s0(str, (String) arrayList.get(i8), true)) {
                        arrayList.remove(i8);
                        arrayList.remove(i8);
                        i8 -= 2;
                    }
                    i8 += 2;
                } else {
                    return;
                }
            }
        }
    }

    public static final class b {
        public static void a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i8 = 0;
                while (i8 < length) {
                    int i10 = i8 + 1;
                    char charAt = str.charAt(i8);
                    if ('!' <= charAt && charAt < 127) {
                        i8 = i10;
                    } else {
                        throw new IllegalArgumentException(kg.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i8), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[LOOP:0: B:1:0x0006->B:20:0x005b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void b(java.lang.String r7, java.lang.String r8) {
            /*
                int r0 = r7.length()
                r1 = 0
                r2 = r1
            L_0x0006:
                if (r2 >= r0) goto L_0x005d
                int r3 = r2 + 1
                char r4 = r7.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L_0x0023
                r5 = 32
                if (r5 > r4) goto L_0x001d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L_0x001d
                r5 = r6
                goto L_0x001e
            L_0x001d:
                r5 = r1
            L_0x001e:
                if (r5 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = r1
                goto L_0x0024
            L_0x0023:
                r5 = r6
            L_0x0024:
                if (r5 != 0) goto L_0x005b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r8
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = kg.b.i(r1, r0)
                boolean r8 = kg.b.q(r8)
                if (r8 == 0) goto L_0x0047
                java.lang.String r7 = ""
                goto L_0x004d
            L_0x0047:
                java.lang.String r8 = ": "
                java.lang.String r7 = sf.j.k(r7, r8)
            L_0x004d:
                java.lang.String r7 = sf.j.k(r7, r0)
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L_0x005b:
                r2 = r3
                goto L_0x0006
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.q.b.b(java.lang.String, java.lang.String):void");
        }

        public static q c(String... strArr) {
            int i8 = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    String str = strArr2[i10];
                    if (str != null) {
                        strArr2[i10] = n.Z0(str).toString();
                        i10 = i11;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int A = cb.b.A(0, strArr2.length - 1, 2);
                if (A >= 0) {
                    while (true) {
                        int i12 = i8 + 2;
                        String str2 = strArr2[i8];
                        String str3 = strArr2[i8 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i8 == A) {
                            break;
                        }
                        i8 = i12;
                    }
                }
                return new q(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public q(String[] strArr) {
        this.f10150a = strArr;
    }

    public final String a(String str) {
        j.f(str, "name");
        String[] strArr = this.f10150a;
        int length = strArr.length - 2;
        int A = cb.b.A(length, 0, -2);
        if (A <= length) {
            while (true) {
                int i8 = length - 2;
                if (zf.j.s0(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == A) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public final Date b(String str) {
        String a10 = a(str);
        if (a10 == null) {
            return null;
        }
        return c.a(a10);
    }

    public final String c(int i8) {
        return this.f10150a[i8 * 2];
    }

    public final a d() {
        a aVar = new a();
        ArrayList arrayList = aVar.f10151a;
        j.f(arrayList, "<this>");
        String[] strArr = this.f10150a;
        j.f(strArr, "elements");
        arrayList.addAll(l.R(strArr));
        return aVar;
    }

    public final String e(int i8) {
        return this.f10150a[(i8 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            if (Arrays.equals(this.f10150a, ((q) obj).f10150a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10150a);
    }

    public final Iterator<g<String, String>> iterator() {
        int length = this.f10150a.length / 2;
        g[] gVarArr = new g[length];
        for (int i8 = 0; i8 < length; i8++) {
            gVarArr[i8] = new g(c(i8), e(i8));
        }
        return new sf.a(gVarArr);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f10150a.length / 2;
        int i8 = 0;
        while (i8 < length) {
            int i10 = i8 + 1;
            String c3 = c(i8);
            String e10 = e(i8);
            sb2.append(c3);
            sb2.append(": ");
            if (kg.b.q(c3)) {
                e10 = "██";
            }
            sb2.append(e10);
            sb2.append("\n");
            i8 = i10;
        }
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
