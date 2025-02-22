package pf;

import d2.f1;
import java.io.File;
import sf.j;
import zf.n;

public class a extends f1 {
    public static final String R(File file) {
        j.f(file, "<this>");
        String name = file.getName();
        j.e(name, "name");
        return n.W0(name, '.', "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File S(java.io.File r7) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "image_cache"
            r0.<init>(r1)
            java.lang.String r1 = r0.getPath()
            java.lang.String r2 = "path"
            sf.j.e(r1, r2)
            char r2 = java.io.File.separatorChar
            r3 = 0
            r4 = 4
            int r2 = zf.n.F0(r1, r2, r3, r3, r4)
            r5 = 1
            if (r2 != 0) goto L_0x0041
            int r2 = r1.length()
            if (r2 <= r5) goto L_0x003f
            char r2 = r1.charAt(r5)
            char r6 = java.io.File.separatorChar
            if (r2 != r6) goto L_0x003f
            r2 = 2
            int r2 = zf.n.F0(r1, r6, r2, r3, r4)
            if (r2 < 0) goto L_0x003f
            char r6 = java.io.File.separatorChar
            int r2 = r2 + r5
            int r2 = zf.n.F0(r1, r6, r2, r3, r4)
            if (r2 < 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            int r1 = r1.length()
            goto L_0x005f
        L_0x003f:
            r1 = r5
            goto L_0x005f
        L_0x0041:
            r4 = 58
            if (r2 <= 0) goto L_0x0050
            int r6 = r2 + -1
            char r6 = r1.charAt(r6)
            if (r6 != r4) goto L_0x0050
        L_0x004d:
            int r1 = r2 + 1
            goto L_0x005f
        L_0x0050:
            r6 = -1
            if (r2 != r6) goto L_0x005e
            boolean r2 = zf.n.B0(r1, r4)
            if (r2 == 0) goto L_0x005e
            int r1 = r1.length()
            goto L_0x005f
        L_0x005e:
            r1 = r3
        L_0x005f:
            if (r1 <= 0) goto L_0x0063
            r1 = r5
            goto L_0x0064
        L_0x0063:
            r1 = r3
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x00ad
        L_0x0067:
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "this.toString()"
            sf.j.e(r7, r1)
            int r1 = r7.length()
            if (r1 != 0) goto L_0x0077
            r3 = r5
        L_0x0077:
            if (r3 != 0) goto L_0x0098
            char r1 = java.io.File.separatorChar
            boolean r1 = zf.n.B0(r7, r1)
            if (r1 == 0) goto L_0x0082
            goto L_0x0098
        L_0x0082:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r7 = h0.e.c(r7)
            char r2 = java.io.File.separatorChar
            r7.append(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r1.<init>(r7)
            goto L_0x00ac
        L_0x0098:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7)
        L_0x00ac:
            r0 = r1
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.a.S(java.io.File):java.io.File");
    }
}
