package a5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p4.h;
import p4.j;
import r4.w;

public final class k implements j<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f113a;

    public k(Context context) {
        this.f113a = context.getApplicationContext();
    }

    public final /* bridge */ /* synthetic */ w a(Object obj, int i8, int i10, h hVar) {
        return c((Uri) obj);
    }

    public final boolean b(Object obj, h hVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r4.w c(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            android.content.Context r1 = r7.f113a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            android.content.Context r0 = r1.createPackageContext(r0, r3)     // Catch:{ NameNotFoundException -> 0x0017 }
            goto L_0x0023
        L_0x0017:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00b6
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.util.List r2 = r8.getPathSegments()
            int r4 = r2.size()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x006e
            java.util.List r2 = r8.getPathSegments()
            java.lang.String r4 = r8.getAuthority()
            java.lang.Object r5 = r2.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.Resources r6 = r0.getResources()
            int r4 = r6.getIdentifier(r2, r5, r4)
            if (r4 != 0) goto L_0x0057
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r6 = "android"
            int r4 = r4.getIdentifier(r2, r5, r6)
        L_0x0057:
            if (r4 == 0) goto L_0x005a
            goto L_0x0084
        L_0x005a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find resource id for: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x006e:
            int r2 = r2.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r2 != r6) goto L_0x00a4
            java.util.List r2 = r8.getPathSegments()
            java.lang.Object r2 = r2.get(r3)     // Catch:{ NumberFormatException -> 0x0091 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0091 }
            int r4 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0091 }
        L_0x0084:
            r8 = 0
            android.graphics.drawable.Drawable r0 = a5.g.a(r1, r0, r4, r8)
            if (r0 == 0) goto L_0x0090
            a5.j r8 = new a5.j
            r8.<init>(r0, r3)
        L_0x0090:
            return r8
        L_0x0091:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x00b6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to obtain context or unrecognized Uri format for: "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.k.c(android.net.Uri):r4.w");
    }
}
