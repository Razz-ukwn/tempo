package y4;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import p4.h;
import p4.j;
import r4.w;
import y4.r;

public final class u implements j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f17238a;

    public u(l lVar) {
        this.f17238a = lVar;
    }

    public final w a(Object obj, int i8, int i10, h hVar) {
        l lVar = this.f17238a;
        return lVar.a(new r.c((ParcelFileDescriptor) obj, lVar.f17209d, lVar.f17208c), i8, i10, hVar, l.f17204k);
    }

    public final boolean b(Object obj, h hVar) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if (!((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912)) {
            return false;
        }
        this.f17238a.getClass();
        return true;
    }
}
