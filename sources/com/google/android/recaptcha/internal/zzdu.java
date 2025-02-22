package com.google.android.recaptcha.internal;

import h0.e;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzdu {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i8 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String b10 = e.b(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(b10), e10);
                    str2 = "<" + b10 + " threw " + e10.getClass().getName() + ">";
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i8 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                sb2.append(str, i11, str.length());
            } else {
                sb2.append(str, i11, indexOf);
                sb2.append(objArr[i8]);
                i11 = indexOf + 2;
                i8++;
            }
        }
        sb2.append(str, i11, str.length());
        if (i8 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i8]);
            for (int i12 = i8 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
