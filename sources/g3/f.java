package g3;

import androidx.activity.g;
import androidx.fragment.app.q;
import c4.a;
import cb.d;
import h0.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f8819a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8820b = {112, 114, 109, 0};

    public static byte[] a(b[] bVarArr, byte[] bArr) {
        int i8 = 0;
        int i10 = 0;
        for (b bVar : bVarArr) {
            i10 += (((((bVar.f8811g * 2) + 8) - 1) & -8) / 8) + (bVar.f8809e * 2) + b(bVar.f8805a, bVar.f8806b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f8810f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, g.f8823c)) {
            int length = bVarArr.length;
            while (i8 < length) {
                b bVar2 = bVarArr[i8];
                l(byteArrayOutputStream, bVar2, b(bVar2.f8805a, bVar2.f8806b, bArr));
                n(byteArrayOutputStream, bVar2);
                k(byteArrayOutputStream, bVar2);
                m(byteArrayOutputStream, bVar2);
                i8++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bVar3.f8805a, bVar3.f8806b, bArr));
            }
            int length2 = bVarArr.length;
            while (i8 < length2) {
                b bVar4 = bVarArr[i8];
                n(byteArrayOutputStream, bVar4);
                k(byteArrayOutputStream, bVar4);
                m(byteArrayOutputStream, bVar4);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = g.f8825e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g.f8824d;
        String str3 = "!";
        String str4 = (!equals && !Arrays.equals(bArr, bArr3)) ? str3 : ":";
        if (str.length() <= 0) {
            if (str3.equals(str4)) {
                return str2.replace(":", str3);
            }
            if (":".equals(str4)) {
                str2 = str2.replace(str3, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str3) || str2.contains(":")) {
                if (str3.equals(str4)) {
                    return str2.replace(":", str3);
                }
                if (":".equals(str4)) {
                    str2 = str2.replace(str3, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder c3 = e.c(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                return g.a(c3, str3, str2);
            }
        }
    }

    public static int c(int i8, int i10, int i11) {
        if (i8 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i8 == 2) {
            return i10;
        } else {
            if (i8 == 4) {
                return i10 + i11;
            }
            throw new IllegalStateException(q.a("Unexpected flag: ", i8));
        }
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i8) {
        int[] iArr = new int[i8];
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 += d.a0(byteArrayInputStream);
            iArr[i11] = i10;
        }
        return iArr;
    }

    public static b[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = g.f8826f;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(g.f8821a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int Z = (int) d.Z(fileInputStream, 1);
                byte[] Y = d.Y(fileInputStream, (int) d.Z(fileInputStream, 4), (int) d.Z(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Y);
                    try {
                        b[] f10 = f(byteArrayInputStream, Z, bVarArr);
                        byteArrayInputStream.close();
                        return f10;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, g.f8827g)) {
            int a02 = d.a0(fileInputStream);
            byte[] Y2 = d.Y(fileInputStream, (int) d.Z(fileInputStream, 4), (int) d.Z(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Y2);
                try {
                    b[] g10 = g(byteArrayInputStream2, bArr2, a02, bVarArr);
                    byteArrayInputStream2.close();
                    return g10;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static b[] f(ByteArrayInputStream byteArrayInputStream, int i8, b[] bVarArr) {
        int i10 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i8 == bVarArr.length) {
            String[] strArr = new String[i8];
            int[] iArr = new int[i8];
            for (int i11 = 0; i11 < i8; i11++) {
                int a02 = d.a0(byteArrayInputStream);
                iArr[i11] = d.a0(byteArrayInputStream);
                strArr[i11] = new String(d.X(byteArrayInputStream, a02), StandardCharsets.UTF_8);
            }
            while (i10 < i8) {
                b bVar = bVarArr[i10];
                if (bVar.f8806b.equals(strArr[i10])) {
                    int i12 = iArr[i10];
                    bVar.f8809e = i12;
                    bVar.f8812h = d(byteArrayInputStream, i12);
                    i10++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i8, b[] bVarArr) {
        b bVar;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i8 == bVarArr.length) {
            int i10 = 0;
            while (i10 < i8) {
                d.a0(byteArrayInputStream);
                String str = new String(d.X(byteArrayInputStream, d.a0(byteArrayInputStream)), StandardCharsets.UTF_8);
                long Z = d.Z(byteArrayInputStream, 4);
                int a02 = d.a0(byteArrayInputStream);
                if (bVarArr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i11].f8806b.equals(substring)) {
                            bVar = bVarArr[i11];
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    bVar.f8808d = Z;
                    int[] d10 = d(byteArrayInputStream, a02);
                    if (Arrays.equals(bArr, g.f8825e)) {
                        bVar.f8809e = a02;
                        bVar.f8812h = d10;
                    }
                    i10++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, g.f8822b)) {
            int Z = (int) d.Z(fileInputStream, 1);
            byte[] Y = d.Y(fileInputStream, (int) d.Z(fileInputStream, 4), (int) d.Z(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Y);
                try {
                    b[] i8 = i(byteArrayInputStream, str, Z);
                    byteArrayInputStream.close();
                    return i8;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static b[] i(ByteArrayInputStream byteArrayInputStream, String str, int i8) {
        TreeMap<Integer, Integer> treeMap;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i10 = i8;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int a02 = d.a0(byteArrayInputStream);
            int a03 = d.a0(byteArrayInputStream);
            long Z = d.Z(byteArrayInputStream2, 4);
            String str2 = str;
            bVarArr[i11] = new b(str2, new String(d.X(byteArrayInputStream2, a02), StandardCharsets.UTF_8), d.Z(byteArrayInputStream2, 4), a03, (int) Z, (int) d.Z(byteArrayInputStream2, 4), new int[a03], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i10) {
            b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available() - bVar.f8810f;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f8813i;
                if (available2 <= available) {
                    break;
                }
                i13 += d.a0(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int a04 = d.a0(byteArrayInputStream); a04 > 0; a04--) {
                    d.a0(byteArrayInputStream);
                    int Z2 = (int) d.Z(byteArrayInputStream2, 1);
                    if (!(Z2 == 6 || Z2 == 7)) {
                        while (Z2 > 0) {
                            d.Z(byteArrayInputStream2, 1);
                            for (int Z3 = (int) d.Z(byteArrayInputStream2, 1); Z3 > 0; Z3--) {
                                d.a0(byteArrayInputStream);
                            }
                            Z2--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f8812h = d(byteArrayInputStream2, bVar.f8809e);
                int i14 = bVar.f8811g;
                BitSet valueOf = BitSet.valueOf(d.X(byteArrayInputStream2, ((((i14 * 2) + 8) - 1) & -8) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = 2;
                    if (!valueOf.get(c(2, i15, i14))) {
                        i16 = 0;
                    }
                    if (valueOf.get(c(4, i15, i14))) {
                        i16 |= 4;
                    }
                    if (i16 != 0) {
                        Integer num = treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | num.intValue()));
                    }
                }
                i12++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    /* JADX INFO: finally extract failed */
    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        Throwable th;
        Throwable th2;
        ArrayList arrayList;
        int i8;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th3;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        b[] bVarArr2 = bVarArr;
        byte[] bArr3 = g.f8821a;
        int i10 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                d.m0(byteArrayOutputStream5, bVarArr2.length);
                int i11 = 2;
                int i12 = 2;
                for (b bVar : bVarArr2) {
                    d.l0(byteArrayOutputStream5, bVar.f8807c, 4);
                    d.l0(byteArrayOutputStream5, bVar.f8808d, 4);
                    d.l0(byteArrayOutputStream5, (long) bVar.f8811g, 4);
                    String b10 = b(bVar.f8805a, bVar.f8806b, bArr3);
                    int length = b10.getBytes(StandardCharsets.UTF_8).length;
                    d.m0(byteArrayOutputStream5, length);
                    i12 = i12 + 4 + 4 + 4 + 2 + (length * 1);
                    byteArrayOutputStream5.write(b10.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i12 == byteArray.length) {
                    h hVar = new h(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(hVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < bVarArr2.length) {
                        try {
                            b bVar2 = bVarArr2[i13];
                            d.m0(byteArrayOutputStream6, i13);
                            d.m0(byteArrayOutputStream6, bVar2.f8809e);
                            i14 = i14 + 2 + 2 + (bVar2.f8809e * 2);
                            k(byteArrayOutputStream6, bVar2);
                            i13++;
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i14 == byteArray2.length) {
                        h hVar2 = new h(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(hVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < bVarArr2.length) {
                            try {
                                b bVar3 = bVarArr2[i15];
                                int i17 = i10;
                                for (Map.Entry<Integer, Integer> value : bVar3.f8813i.entrySet()) {
                                    i17 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream2, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream3, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                d.m0(byteArrayOutputStream7, i15);
                                int length2 = byteArray3.length + i11 + byteArray4.length;
                                int i18 = i16 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                d.l0(byteArrayOutputStream7, (long) length2, 4);
                                d.m0(byteArrayOutputStream7, i17);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i16 = i18 + length2;
                                i15++;
                                arrayList3 = arrayList4;
                                i10 = 0;
                                i11 = 2;
                            } catch (Throwable th6) {
                                Throwable th7 = th6;
                                try {
                                    byteArrayOutputStream7.close();
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                }
                                throw th7;
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i16 == byteArray5.length) {
                            h hVar3 = new h(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(hVar3);
                            long j10 = (long) 4;
                            long size = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
                            d.l0(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                h hVar4 = (h) arrayList2.get(i19);
                                d.l0(byteArrayOutputStream4, a.b(hVar4.f8828a), 4);
                                d.l0(byteArrayOutputStream4, size, 4);
                                boolean z10 = hVar4.f8830c;
                                byte[] bArr4 = hVar4.f8829b;
                                if (z10) {
                                    byte[] u7 = d.u(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(u7);
                                    d.l0(byteArrayOutputStream4, (long) u7.length, 4);
                                    d.l0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    i8 = u7.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    d.l0(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    d.l0(byteArrayOutputStream4, 0, 4);
                                    i8 = bArr4.length;
                                }
                                size += (long) i8;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th9) {
                th.addSuppressed(th9);
            }
        } else {
            byte[] bArr5 = g.f8822b;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] a10 = a(bVarArr2, bArr5);
                d.l0(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                d.l0(byteArrayOutputStream4, (long) a10.length, 4);
                byte[] u10 = d.u(a10);
                d.l0(byteArrayOutputStream4, (long) u10.length, 4);
                byteArrayOutputStream4.write(u10);
                return true;
            }
            byte[] bArr6 = g.f8824d;
            if (Arrays.equals(bArr2, bArr6)) {
                d.l0(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                for (b bVar4 : bVarArr2) {
                    String b11 = b(bVar4.f8805a, bVar4.f8806b, bArr6);
                    d.m0(byteArrayOutputStream4, b11.getBytes(StandardCharsets.UTF_8).length);
                    d.m0(byteArrayOutputStream4, bVar4.f8812h.length);
                    d.l0(byteArrayOutputStream4, (long) (bVar4.f8813i.size() * 4), 4);
                    d.l0(byteArrayOutputStream4, bVar4.f8807c, 4);
                    byteArrayOutputStream4.write(b11.getBytes(StandardCharsets.UTF_8));
                    for (Integer intValue : bVar4.f8813i.keySet()) {
                        d.m0(byteArrayOutputStream4, intValue.intValue());
                        d.m0(byteArrayOutputStream4, 0);
                    }
                    for (int m02 : bVar4.f8812h) {
                        d.m0(byteArrayOutputStream4, m02);
                    }
                }
                return true;
            }
            byte[] bArr7 = g.f8823c;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] a11 = a(bVarArr2, bArr7);
                d.l0(byteArrayOutputStream4, (long) bVarArr2.length, 1);
                d.l0(byteArrayOutputStream4, (long) a11.length, 4);
                byte[] u11 = d.u(a11);
                d.l0(byteArrayOutputStream4, (long) u11.length, 4);
                byteArrayOutputStream4.write(u11);
                return true;
            }
            byte[] bArr8 = g.f8825e;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            d.m0(byteArrayOutputStream4, bVarArr2.length);
            for (b bVar5 : bVarArr2) {
                String b12 = b(bVar5.f8805a, bVar5.f8806b, bArr8);
                d.m0(byteArrayOutputStream4, b12.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = bVar5.f8813i;
                d.m0(byteArrayOutputStream4, treeMap.size());
                d.m0(byteArrayOutputStream4, bVar5.f8812h.length);
                d.l0(byteArrayOutputStream4, bVar5.f8807c, 4);
                byteArrayOutputStream4.write(b12.getBytes(StandardCharsets.UTF_8));
                for (Integer intValue2 : treeMap.keySet()) {
                    d.m0(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int m03 : bVar5.f8812h) {
                    d.m0(byteArrayOutputStream4, m03);
                }
            }
            return true;
        }
        throw th3;
        throw th;
        throw th4;
        throw th2;
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i8 = 0;
        for (int valueOf : bVar.f8812h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            d.m0(byteArrayOutputStream, valueOf2.intValue() - i8);
            i8 = valueOf2.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        d.m0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        d.m0(byteArrayOutputStream, bVar.f8809e);
        d.l0(byteArrayOutputStream, (long) bVar.f8810f, 4);
        d.l0(byteArrayOutputStream, bVar.f8807c, 4);
        d.l0(byteArrayOutputStream, (long) bVar.f8811g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((((bVar.f8811g * 2) + 8) - 1) & -8) / 8)];
        for (Map.Entry next : bVar.f8813i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            int i8 = intValue2 & 2;
            int i10 = bVar.f8811g;
            if (i8 != 0) {
                int c3 = c(2, intValue, i10);
                int i11 = c3 / 8;
                bArr[i11] = (byte) ((1 << (c3 % 8)) | bArr[i11]);
            }
            if ((intValue2 & 4) != 0) {
                int c10 = c(4, intValue, i10);
                int i12 = c10 / 8;
                bArr[i12] = (byte) ((1 << (c10 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i8 = 0;
        for (Map.Entry next : bVar.f8813i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                d.m0(byteArrayOutputStream, intValue - i8);
                d.m0(byteArrayOutputStream, 0);
                i8 = intValue;
            }
        }
    }
}
