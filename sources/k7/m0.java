package k7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import h7.a;

public final class m0 extends a implements n0 {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    public final void C(s sVar, h hVar) {
        Parcel b10 = b();
        e.c(b10, sVar);
        b10.writeStrongBinder(hVar);
        c(b10, 89);
    }

    public final void j(s sVar, LocationRequest locationRequest, h hVar) {
        Parcel b10 = b();
        e.c(b10, sVar);
        e.c(b10, locationRequest);
        b10.writeStrongBinder(hVar);
        c(b10, 88);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u6.k l(n7.a r4, k7.i r5) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.b()
            k7.e.c(r0, r4)
            r0.writeStrongBinder(r5)
            android.os.Parcel r4 = android.os.Parcel.obtain()
            android.os.IBinder r5 = r3.f9270b     // Catch:{ RuntimeException -> 0x0040 }
            r1 = 0
            r2 = 87
            r5.transact(r2, r0, r4, r1)     // Catch:{ RuntimeException -> 0x0040 }
            r4.readException()     // Catch:{ RuntimeException -> 0x0040 }
            r0.recycle()
            android.os.IBinder r5 = r4.readStrongBinder()
            int r0 = u6.k.a.f15835b
            if (r5 != 0) goto L_0x0026
            r5 = 0
            goto L_0x003a
        L_0x0026:
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r1 = r0 instanceof u6.k
            if (r1 == 0) goto L_0x0034
            r5 = r0
            u6.k r5 = (u6.k) r5
            goto L_0x003a
        L_0x0034:
            u6.l1 r0 = new u6.l1
            r0.<init>(r5)
            r5 = r0
        L_0x003a:
            r4.recycle()
            return r5
        L_0x003e:
            r4 = move-exception
            goto L_0x0045
        L_0x0040:
            r5 = move-exception
            r4.recycle()     // Catch:{ all -> 0x003e }
            throw r5     // Catch:{ all -> 0x003e }
        L_0x0045:
            r0.recycle()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m0.l(n7.a, k7.i):u6.k");
    }

    public final void y(w wVar) {
        Parcel b10 = b();
        e.c(b10, wVar);
        c(b10, 59);
    }
}
