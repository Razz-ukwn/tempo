package d7;

import android.os.IBinder;
import android.os.Parcel;
import c7.a;
import c7.b;
import h7.a;

public final class f extends a {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
    }

    public final c7.a L(b bVar, String str, int i8) {
        Parcel b10 = b();
        j7.a.c(b10, bVar);
        b10.writeString(str);
        b10.writeInt(i8);
        Parcel a10 = a(b10, 2);
        c7.a O = a.C0059a.O(a10.readStrongBinder());
        a10.recycle();
        return O;
    }

    public final c7.a M(b bVar, String str, int i8, b bVar2) {
        Parcel b10 = b();
        j7.a.c(b10, bVar);
        b10.writeString(str);
        b10.writeInt(i8);
        j7.a.c(b10, bVar2);
        Parcel a10 = a(b10, 8);
        c7.a O = a.C0059a.O(a10.readStrongBinder());
        a10.recycle();
        return O;
    }

    public final c7.a N(b bVar, String str, int i8) {
        Parcel b10 = b();
        j7.a.c(b10, bVar);
        b10.writeString(str);
        b10.writeInt(i8);
        Parcel a10 = a(b10, 4);
        c7.a O = a.C0059a.O(a10.readStrongBinder());
        a10.recycle();
        return O;
    }

    public final c7.a O(b bVar, String str, boolean z10, long j10) {
        Parcel b10 = b();
        j7.a.c(b10, bVar);
        b10.writeString(str);
        b10.writeInt(z10 ? 1 : 0);
        b10.writeLong(j10);
        Parcel a10 = a(b10, 7);
        c7.a O = a.C0059a.O(a10.readStrongBinder());
        a10.recycle();
        return O;
    }
}
