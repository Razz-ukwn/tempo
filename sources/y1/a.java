package y1;

import android.os.Build;
import android.os.ext.SdkExtensions;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f17113a = 0;

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    public static final class C0318a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f17114a = 0;

        static {
            SdkExtensions.getExtensionVersion(30);
            SdkExtensions.getExtensionVersion(31);
            SdkExtensions.getExtensionVersion(33);
            SdkExtensions.getExtensionVersion(1000000);
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            int i10 = C0318a.f17114a;
        }
        if (i8 >= 30) {
            int i11 = C0318a.f17114a;
        }
        if (i8 >= 30) {
            int i12 = C0318a.f17114a;
        }
        if (i8 >= 30) {
            int i13 = C0318a.f17114a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 >= r1) goto L_0x0030
            r1 = 32
            r3 = 0
            if (r0 < r1) goto L_0x002f
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x002b
        L_0x0017:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r4 = "Tiramisu"
            java.lang.String r1 = r4.toUpperCase(r1)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L_0x002b
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r3
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = r3
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.a.a():boolean");
    }
}
