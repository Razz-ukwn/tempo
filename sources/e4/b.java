package e4;

import android.net.Uri;
import java.io.File;

public final class b implements d<Uri, File> {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (((java.lang.String) gf.q.v0(r5.getPathSegments())) != null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r5, h4.l r6) {
        /*
            r4 = this;
            android.net.Uri r5 = (android.net.Uri) r5
            android.graphics.Bitmap$Config[] r6 = m4.c.f11189a
            java.lang.String r6 = r5.getScheme()
            java.lang.String r0 = "file"
            boolean r6 = sf.j.a(r6, r0)
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0026
            java.util.List r6 = r5.getPathSegments()
            java.lang.Object r6 = gf.q.v0(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r3 = "android_asset"
            boolean r6 = sf.j.a(r6, r3)
            if (r6 == 0) goto L_0x0026
            r6 = r1
            goto L_0x0027
        L_0x0026:
            r6 = r2
        L_0x0027:
            if (r6 != 0) goto L_0x0067
            java.lang.String r6 = r5.getScheme()
            if (r6 == 0) goto L_0x0038
            boolean r6 = sf.j.a(r6, r0)
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r6 = r2
            goto L_0x0039
        L_0x0038:
            r6 = r1
        L_0x0039:
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = r5.getPath()
            if (r6 != 0) goto L_0x0043
            java.lang.String r6 = ""
        L_0x0043:
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x0057
            char r6 = r6.charAt(r2)
            r0 = 47
            boolean r6 = cb.b.w(r6, r0, r2)
            if (r6 == 0) goto L_0x0057
            r6 = r1
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            if (r6 == 0) goto L_0x0067
            java.util.List r6 = r5.getPathSegments()
            java.lang.Object r6 = gf.q.v0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            r6 = 0
            if (r1 != 0) goto L_0x006c
            goto L_0x0088
        L_0x006c:
            java.lang.String r0 = r5.getScheme()
            if (r0 != 0) goto L_0x0073
            goto L_0x007f
        L_0x0073:
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.scheme(r6)
            android.net.Uri r5 = r5.build()
        L_0x007f:
            java.io.File r6 = new java.io.File
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
        L_0x0088:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.a(java.lang.Object, h4.l):java.lang.Object");
    }
}
