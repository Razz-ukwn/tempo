package b4;

import android.net.Uri;
import b4.h;
import h4.l;
import sf.j;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3217a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3218b;

    public static final class a implements h.a<Uri> {
        public final h a(Object obj, l lVar) {
            Uri uri = (Uri) obj;
            if (!j.a(uri.getScheme(), "content")) {
                return null;
            }
            return new d(uri, lVar);
        }
    }

    public d(Uri uri, l lVar) {
        this.f3217a = uri;
        this.f3218b = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(jf.d<? super b4.g> r12) {
        /*
            r11 = this;
            h4.l r12 = r11.f3218b
            android.content.Context r0 = r12.f9195a
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = r11.f3217a
            java.lang.String r2 = r1.getAuthority()
            java.lang.String r3 = "com.android.contacts"
            boolean r2 = sf.j.a(r2, r3)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r1.getLastPathSegment()
            java.lang.String r5 = "display_photo"
            boolean r2 = sf.j.a(r2, r5)
            if (r2 == 0) goto L_0x0026
            r2 = r4
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            r5 = 3
            java.lang.String r6 = "'."
            r7 = 0
            if (r2 == 0) goto L_0x0058
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r2 = r0.openAssetFileDescriptor(r1, r2)
            if (r2 == 0) goto L_0x0039
            java.io.FileInputStream r7 = r2.createInputStream()
        L_0x0039:
            if (r7 == 0) goto L_0x003d
            goto L_0x00f1
        L_0x003d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find a contact photo associated with '"
            r12.<init>(r0)
            r12.append(r1)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        L_0x0058:
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r2 < r8) goto L_0x00eb
            java.lang.String r2 = r1.getAuthority()
            java.lang.String r8 = "media"
            boolean r2 = sf.j.a(r2, r8)
            if (r2 != 0) goto L_0x006b
            goto L_0x0092
        L_0x006b:
            java.util.List r2 = r1.getPathSegments()
            int r8 = r2.size()
            if (r8 < r5) goto L_0x0092
            int r9 = r8 + -3
            java.lang.Object r9 = r2.get(r9)
            java.lang.String r10 = "audio"
            boolean r9 = sf.j.a(r9, r10)
            if (r9 == 0) goto L_0x0092
            int r8 = r8 + -2
            java.lang.Object r2 = r2.get(r8)
            java.lang.String r8 = "albums"
            boolean r2 = sf.j.a(r2, r8)
            if (r2 == 0) goto L_0x0092
            r3 = r4
        L_0x0092:
            if (r3 == 0) goto L_0x00eb
            i4.e r2 = r12.f9198d
            i4.a r3 = r2.f9573a
            boolean r8 = r3 instanceof i4.a.C0176a
            if (r8 == 0) goto L_0x009f
            i4.a$a r3 = (i4.a.C0176a) r3
            goto L_0x00a0
        L_0x009f:
            r3 = r7
        L_0x00a0:
            if (r3 == 0) goto L_0x00c2
            i4.a r2 = r2.f9574b
            boolean r8 = r2 instanceof i4.a.C0176a
            if (r8 == 0) goto L_0x00ab
            i4.a$a r2 = (i4.a.C0176a) r2
            goto L_0x00ac
        L_0x00ab:
            r2 = r7
        L_0x00ac:
            if (r2 == 0) goto L_0x00c2
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r4)
            android.graphics.Point r4 = new android.graphics.Point
            int r3 = r3.f9566a
            int r2 = r2.f9566a
            r4.<init>(r3, r2)
            java.lang.String r2 = "android.content.extra.SIZE"
            r8.putParcelable(r2, r4)
            goto L_0x00c3
        L_0x00c2:
            r8 = r7
        L_0x00c3:
            android.content.res.AssetFileDescriptor r2 = r0.openTypedAssetFile(r1, "image/*", r8, (android.os.CancellationSignal) null)
            if (r2 == 0) goto L_0x00cd
            java.io.FileInputStream r7 = r2.createInputStream()
        L_0x00cd:
            if (r7 == 0) goto L_0x00d0
            goto L_0x00f1
        L_0x00d0:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find a music thumbnail associated with '"
            r12.<init>(r0)
            r12.append(r1)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        L_0x00eb:
            java.io.InputStream r7 = r0.openInputStream(r1)
            if (r7 == 0) goto L_0x0118
        L_0x00f1:
            b4.l r2 = new b4.l
            wg.s r3 = d2.f1.J(r7)
            wg.c0 r3 = d2.f1.j(r3)
            y3.c r4 = new y3.c
            r4.<init>()
            y3.m r6 = new y3.m
            android.graphics.Bitmap$Config[] r7 = m4.c.f11189a
            android.content.Context r12 = r12.f9195a
            java.io.File r12 = r12.getCacheDir()
            r12.mkdirs()
            r6.<init>(r3, r12, r4)
            java.lang.String r12 = r0.getType(r1)
            r2.<init>(r6, r12, r5)
            return r2
        L_0x0118:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to open '"
            r12.<init>(r0)
            r12.append(r1)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.d.a(jf.d):java.lang.Object");
    }
}
