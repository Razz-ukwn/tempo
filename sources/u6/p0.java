package u6;

import android.os.IBinder;
import android.os.Parcel;
import c7.b;
import h7.a;
import t6.a0;
import t6.c0;
import t6.y;

public final class p0 extends a implements r0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
    }

    public final boolean F(c0 c0Var, b bVar) {
        Parcel b10 = b();
        int i8 = j7.a.f9861a;
        boolean z10 = true;
        b10.writeInt(1);
        c0Var.writeToParcel(b10, 0);
        j7.a.c(b10, bVar);
        Parcel a10 = a(b10, 5);
        if (a10.readInt() == 0) {
            z10 = false;
        }
        a10.recycle();
        return z10;
    }

    public final a0 J(y yVar) {
        Parcel b10 = b();
        int i8 = j7.a.f9861a;
        b10.writeInt(1);
        yVar.writeToParcel(b10, 0);
        Parcel a10 = a(b10, 6);
        a0 a0Var = (a0) j7.a.a(a10, a0.CREATOR);
        a10.recycle();
        return a0Var;
    }

    public final boolean zzi() {
        Parcel a10 = a(b(), 7);
        int i8 = j7.a.f9861a;
        boolean z10 = a10.readInt() != 0;
        a10.recycle();
        return z10;
    }
}
