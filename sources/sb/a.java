package sb;

import androidx.activity.result.b;

public final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14878a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14879b;

    public /* synthetic */ a(Object obj, int i8) {
        this.f14878a = i8;
        this.f14879b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0258, code lost:
        if (r8 != null) goto L_0x025a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = 1
            int r0 = r1.f14878a
            r3 = 0
            java.lang.String r4 = "this$0"
            java.lang.Object r5 = r1.f14879b
            switch(r0) {
                case 0: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x00cf
        L_0x000f:
            sb.e r5 = (sb.e) r5
            r0 = r24
            java.util.Map r0 = (java.util.Map) r0
            int r6 = sb.e.C0
            sf.j.f(r5, r4)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            r4 = r2
        L_0x0023:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0040
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r6.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x003e
            goto L_0x0022
        L_0x003e:
            r4 = r3
            goto L_0x0023
        L_0x0040:
            r0 = 2
            if (r4 == 0) goto L_0x0061
            r4 = 2131296558(0x7f09012e, float:1.8211036E38)
            android.view.View r6 = r5.u0(r4)
            com.lassi.presentation.cameraview.controls.CameraView r6 = (com.lassi.presentation.cameraview.controls.CameraView) r6
            com.lassi.presentation.cameraview.controls.g r6 = r6.I
            int r6 = r6.D
            if (r6 < r0) goto L_0x0054
            r6 = r2
            goto L_0x0055
        L_0x0054:
            r6 = r3
        L_0x0055:
            if (r6 != 0) goto L_0x0061
            android.view.View r0 = r5.u0(r4)
            com.lassi.presentation.cameraview.controls.CameraView r0 = (com.lassi.presentation.cameraview.controls.CameraView) r0
            r0.h()
            goto L_0x00ce
        L_0x0061:
            rb.a r4 = rb.a.V
            int r4 = r4.F
            r6 = 33
            if (r4 != r0) goto L_0x0071
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r6) goto L_0x0071
            r0 = 2131951702(0x7f130056, float:1.9539826E38)
            goto L_0x0088
        L_0x0071:
            if (r4 != r0) goto L_0x007b
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x007b
            r0 = 2131951701(0x7f130055, float:1.9539824E38)
            goto L_0x0088
        L_0x007b:
            if (r4 != r2) goto L_0x0085
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x0085
            r0 = 2131951703(0x7f130057, float:1.9539828E38)
            goto L_0x0088
        L_0x0085:
            r0 = 2131951704(0x7f130058, float:1.953983E38)
        L_0x0088:
            androidx.appcompat.app.b$a r2 = new androidx.appcompat.app.b$a
            android.content.Context r4 = r5.e0()
            r6 = 2132018298(0x7f14047a, float:1.9674899E38)
            r2.<init>(r4, r6)
            androidx.appcompat.app.AlertController$b r4 = r2.f681a
            android.content.Context r6 = r4.f661a
            java.lang.CharSequence r0 = r6.getText(r0)
            r4.f666f = r0
            r4.f671k = r3
            sb.c r0 = new sb.c
            r0.<init>(r5, r3)
            android.content.Context r6 = r4.f661a
            r7 = 2131952010(0x7f13018a, float:1.954045E38)
            java.lang.CharSequence r6 = r6.getText(r7)
            r4.f667g = r6
            r4.f668h = r0
            sb.d r0 = new sb.d
            r0.<init>(r5, r3)
            android.content.Context r5 = r4.f661a
            r6 = 2131951705(0x7f130059, float:1.9539832E38)
            java.lang.CharSequence r5 = r5.getText(r6)
            r4.f669i = r5
            r4.f670j = r0
            androidx.appcompat.app.b r0 = r2.a()
            r0.setCancelable(r3)
            r0.show()
        L_0x00ce:
            return
        L_0x00cf:
            com.lassi.presentation.mediadirectory.LassiMediaPickerActivity r5 = (com.lassi.presentation.mediadirectory.LassiMediaPickerActivity) r5
            r0 = r24
            java.util.List r0 = (java.util.List) r0
            int r6 = com.lassi.presentation.mediadirectory.LassiMediaPickerActivity.f6646b0
            sf.j.f(r5, r4)
            if (r0 == 0) goto L_0x0288
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = gf.m.n0(r0)
            r6.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
        L_0x00f0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r7.next()
            android.net.Uri r0 = (android.net.Uri) r0
            nb.b r15 = new nb.b
            r9 = 0
            r20 = 0
            r21 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r22 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r12 = 0
            r8 = r15
            r2 = r15
            r15 = r16
            r16 = r17
            r18 = r19
            r19 = r22
            r8.<init>(r9, r11, r12, r13, r15, r16, r18, r19)
            java.lang.String r8 = "uri"
            sf.j.f(r0, r8)
            android.content.ContentResolver r8 = r5.getContentResolver()
            r10 = 0
            r13 = 0
            r9 = r0
            r11 = r20
            r12 = r21
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)
            r14 = 0
            if (r8 == 0) goto L_0x013f
            java.lang.String r9 = "_display_name"
            int r9 = r8.getColumnIndex(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0140
        L_0x013f:
            r9 = r14
        L_0x0140:
            if (r8 == 0) goto L_0x0145
            r8.moveToFirst()
        L_0x0145:
            if (r9 == 0) goto L_0x0150
            int r9 = r9.intValue()
            java.lang.String r9 = r8.getString(r9)
            goto L_0x0151
        L_0x0150:
            r9 = r14
        L_0x0151:
            if (r8 == 0) goto L_0x0156
            r8.close()
        L_0x0156:
            r2.f11619b = r9
            r2.C = r3
            android.content.ContentResolver r8 = r5.getContentResolver()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r0
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)
            if (r8 == 0) goto L_0x0174
            java.lang.String r9 = "_size"
            int r9 = r8.getColumnIndex(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0175
        L_0x0174:
            r9 = r14
        L_0x0175:
            if (r8 == 0) goto L_0x017a
            r8.moveToFirst()
        L_0x017a:
            if (r9 == 0) goto L_0x0189
            int r9 = r9.intValue()
            long r9 = r8.getLong(r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x018a
        L_0x0189:
            r9 = r14
        L_0x018a:
            if (r8 == 0) goto L_0x018f
            r8.close()
        L_0x018f:
            if (r9 == 0) goto L_0x0196
            long r8 = r9.longValue()
            goto L_0x0198
        L_0x0196:
            r8 = 0
        L_0x0198:
            r2.B = r8
            java.lang.String r8 = r0.getPath()
            if (r8 == 0) goto L_0x01ab
            java.lang.String r9 = "file://"
            boolean r8 = zf.n.A0(r8, r9)
            r9 = 1
            if (r8 != r9) goto L_0x01ac
            r8 = r9
            goto L_0x01ad
        L_0x01ab:
            r9 = 1
        L_0x01ac:
            r8 = r3
        L_0x01ad:
            if (r8 == 0) goto L_0x01b8
            java.lang.String r0 = r0.getPath()
            sf.j.c(r0)
            goto L_0x0266
        L_0x01b8:
            java.lang.String r8 = r0.getScheme()
            java.lang.String r10 = "content"
            boolean r8 = sf.j.a(r8, r10)
            if (r8 == 0) goto L_0x01d5
            android.webkit.MimeTypeMap r8 = android.webkit.MimeTypeMap.getSingleton()
            android.content.ContentResolver r10 = r5.getContentResolver()
            java.lang.String r10 = r10.getType(r0)
            java.lang.String r8 = r8.getExtensionFromMimeType(r10)
            goto L_0x01ee
        L_0x01d5:
            java.lang.String r8 = r0.getPath()
            if (r8 == 0) goto L_0x01ed
            java.io.File r10 = new java.io.File
            r10.<init>(r8)
            android.net.Uri r8 = android.net.Uri.fromFile(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r8)
            goto L_0x01ee
        L_0x01ed:
            r8 = r14
        L_0x01ee:
            if (r8 != 0) goto L_0x01f2
            java.lang.String r8 = ""
        L_0x01f2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "file"
            r10.<init>(r11)
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.append(r11)
            r11 = 46
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.io.File r10 = new java.io.File
            java.io.File r11 = r5.getCacheDir()
            r10.<init>(r11, r8)
            r10.createNewFile()
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x024e, all -> 0x024b }
            r8.<init>(r10)     // Catch:{ Exception -> 0x024e, all -> 0x024b }
            android.content.ContentResolver r11 = r5.getContentResolver()     // Catch:{ Exception -> 0x0249 }
            java.io.InputStream r11 = r11.openInputStream(r0)     // Catch:{ Exception -> 0x0249 }
            if (r11 == 0) goto L_0x0239
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0244, all -> 0x0242 }
        L_0x022f:
            int r12 = r11.read(r0)     // Catch:{ Exception -> 0x0244, all -> 0x0242 }
            if (r12 <= 0) goto L_0x0239
            r8.write(r0, r3, r12)     // Catch:{ Exception -> 0x0244, all -> 0x0242 }
            goto L_0x022f
        L_0x0239:
            r8.flush()     // Catch:{ Exception -> 0x0244, all -> 0x0242 }
            if (r11 == 0) goto L_0x025a
            r11.close()
            goto L_0x025a
        L_0x0242:
            r0 = move-exception
            goto L_0x0277
        L_0x0244:
            r0 = move-exception
            r14 = r11
            goto L_0x0250
        L_0x0247:
            r0 = move-exception
            goto L_0x0276
        L_0x0249:
            r0 = move-exception
            goto L_0x0250
        L_0x024b:
            r0 = move-exception
            r2 = r14
            goto L_0x027a
        L_0x024e:
            r0 = move-exception
            r8 = r14
        L_0x0250:
            r0.printStackTrace()     // Catch:{ all -> 0x0247 }
            if (r14 == 0) goto L_0x0258
            r14.close()
        L_0x0258:
            if (r8 == 0) goto L_0x025d
        L_0x025a:
            r8.close()
        L_0x025d:
            java.lang.String r0 = r10.getPath()
            java.lang.String r8 = "getFileFromContentUri(co…xt, uri, uniqueName).path"
            sf.j.e(r0, r8)
        L_0x0266:
            r2.f11620c = r0
            boolean r0 = r4.add(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.add(r0)
            r2 = r9
            goto L_0x00f0
        L_0x0276:
            r11 = r14
        L_0x0277:
            r14 = r8
            r2 = r14
            r14 = r11
        L_0x027a:
            if (r14 == 0) goto L_0x027f
            r14.close()
        L_0x027f:
            if (r2 == 0) goto L_0x0284
            r2.close()
        L_0x0284:
            throw r0
        L_0x0285:
            r5.S(r4)
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.a.a(java.lang.Object):void");
    }
}
