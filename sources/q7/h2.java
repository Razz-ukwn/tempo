package q7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.g0;
import java.util.ArrayList;
import java.util.List;

public final class h2 extends e0 implements j2 {
    public h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void D(Bundle bundle, c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, bundle);
        g0.c(a10, c7Var);
        c(a10, 19);
    }

    public final String G(c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, c7Var);
        Parcel b10 = b(a10, 11);
        String readString = b10.readString();
        b10.recycle();
        return readString;
    }

    public final void H(c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, c7Var);
        c(a10, 18);
    }

    public final List d(String str, String str2, String str3, boolean z10) {
        Parcel a10 = a();
        a10.writeString((String) null);
        a10.writeString(str2);
        a10.writeString(str3);
        ClassLoader classLoader = g0.f5282a;
        a10.writeInt(z10 ? 1 : 0);
        Parcel b10 = b(a10, 15);
        ArrayList<w6> createTypedArrayList = b10.createTypedArrayList(w6.CREATOR);
        b10.recycle();
        return createTypedArrayList;
    }

    public final void e(w6 w6Var, c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, w6Var);
        g0.c(a10, c7Var);
        c(a10, 2);
    }

    public final void g(c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, c7Var);
        c(a10, 20);
    }

    public final List m(String str, String str2, boolean z10, c7 c7Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        ClassLoader classLoader = g0.f5282a;
        a10.writeInt(z10 ? 1 : 0);
        g0.c(a10, c7Var);
        Parcel b10 = b(a10, 14);
        ArrayList<w6> createTypedArrayList = b10.createTypedArrayList(w6.CREATOR);
        b10.recycle();
        return createTypedArrayList;
    }

    public final void n(s sVar, c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, sVar);
        g0.c(a10, c7Var);
        c(a10, 1);
    }

    public final List o(String str, String str2, String str3) {
        Parcel a10 = a();
        a10.writeString((String) null);
        a10.writeString(str2);
        a10.writeString(str3);
        Parcel b10 = b(a10, 17);
        ArrayList<c> createTypedArrayList = b10.createTypedArrayList(c.CREATOR);
        b10.recycle();
        return createTypedArrayList;
    }

    public final void r(c cVar, c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, cVar);
        g0.c(a10, c7Var);
        c(a10, 12);
    }

    public final byte[] s(s sVar, String str) {
        Parcel a10 = a();
        g0.c(a10, sVar);
        a10.writeString(str);
        Parcel b10 = b(a10, 9);
        byte[] createByteArray = b10.createByteArray();
        b10.recycle();
        return createByteArray;
    }

    public final List t(String str, String str2, c7 c7Var) {
        Parcel a10 = a();
        a10.writeString(str);
        a10.writeString(str2);
        g0.c(a10, c7Var);
        Parcel b10 = b(a10, 16);
        ArrayList<c> createTypedArrayList = b10.createTypedArrayList(c.CREATOR);
        b10.recycle();
        return createTypedArrayList;
    }

    public final void v(c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, c7Var);
        c(a10, 4);
    }

    public final void x(c7 c7Var) {
        Parcel a10 = a();
        g0.c(a10, c7Var);
        c(a10, 6);
    }

    public final void z(long j10, String str, String str2, String str3) {
        Parcel a10 = a();
        a10.writeLong(j10);
        a10.writeString(str);
        a10.writeString(str2);
        a10.writeString(str3);
        c(a10, 10);
    }
}
