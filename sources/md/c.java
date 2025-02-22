package md;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;

public final /* synthetic */ class c implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11389a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f11390b;

    public /* synthetic */ c(MeasuringBottomSheet measuringBottomSheet, Bitmap bitmap) {
        this.f11389a = measuringBottomSheet;
        this.f11390b = bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r2 = r2.getCacheDir();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPixelCopyFinished(int r6) {
        /*
            r5 = this;
            android.graphics.Bitmap r0 = r5.f11390b
            int r1 = com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet.f6988h1
            com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet r1 = r5.f11389a
            java.lang.String r2 = "this$0"
            sf.j.f(r1, r2)
            if (r6 != 0) goto L_0x0065
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
            r6.<init>()     // Catch:{ Exception -> 0x0061 }
            androidx.fragment.app.x r2 = r1.o()     // Catch:{ Exception -> 0x0061 }
            r3 = 0
            if (r2 == 0) goto L_0x0024
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x0061 }
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0061 }
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            r6.append(r2)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = "/screen.jpeg"
            r6.append(r2)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0061 }
            r1.W0 = r6     // Catch:{ Exception -> 0x0061 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = r1.W0     // Catch:{ Exception -> 0x0061 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0061 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0061 }
            r4 = 60
            r0.compress(r2, r4, r6)     // Catch:{ Exception -> 0x0061 }
            r6.close()     // Catch:{ Exception -> 0x0061 }
            com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel r6 = r1.B0()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r0 = r1.W0     // Catch:{ Exception -> 0x0061 }
            r6.getClass()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r1 = "imageUrl"
            sf.j.f(r0, r1)     // Catch:{ Exception -> 0x0061 }
            ag.g0 r1 = gc.b.o(r6)     // Catch:{ Exception -> 0x0061 }
            md.z0 r2 = new md.z0     // Catch:{ Exception -> 0x0061 }
            r2.<init>(r6, r0, r3)     // Catch:{ Exception -> 0x0061 }
            r6 = 0
            r0 = 3
            cb.b.D(r1, r3, r6, r2, r0)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.c.onPixelCopyFinished(int):void");
    }
}
