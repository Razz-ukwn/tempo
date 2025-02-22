package qg;

import kg.b;
import sf.j;
import wg.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f13645a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final i f13646b = i.a.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f13647c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f13648d = new String[64];

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f13649e;

    static {
        i iVar = i.f16760d;
        String[] strArr = new String[256];
        int i8 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            j.e(binaryString, "toBinaryString(it)");
            String replace = b.i("%8s", binaryString).replace(' ', '0');
            j.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i10] = replace;
        }
        f13649e = strArr;
        String[] strArr2 = f13648d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[9] = j.k("|PADDED", "END_STREAM");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i11 = 0;
        while (i11 < 3) {
            int i12 = iArr2[i11];
            i11++;
            int i13 = iArr[0];
            String[] strArr3 = f13648d;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        int length = f13648d.length;
        while (i8 < length) {
            int i15 = i8 + 1;
            String[] strArr4 = f13648d;
            if (strArr4[i8] == null) {
                strArr4[i8] = f13649e[i8];
            }
            i8 = i15;
        }
    }

    public static String a(boolean z10, int i8, int i10, int i11, int i12) {
        String str;
        String str2;
        String[] strArr = f13647c;
        String i13 = i11 < strArr.length ? strArr[i11] : b.i("0x%02x", Integer.valueOf(i11));
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr2 = f13649e;
            if (!(i11 == 2 || i11 == 3)) {
                if (i11 == 4 || i11 == 6) {
                    str = i12 == 1 ? "ACK" : strArr2[i12];
                } else if (!(i11 == 7 || i11 == 8)) {
                    String[] strArr3 = f13648d;
                    if (i12 < strArr3.length) {
                        str2 = strArr3[i12];
                        j.c(str2);
                    } else {
                        str2 = strArr2[i12];
                    }
                    str = (i11 != 5 || (i12 & 4) == 0) ? (i11 != 0 || (i12 & 32) == 0) ? str2 : zf.j.v0(str2, "PRIORITY", "COMPRESSED") : zf.j.v0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i12];
        }
        return b.i("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i8), Integer.valueOf(i10), i13, str);
    }
}
