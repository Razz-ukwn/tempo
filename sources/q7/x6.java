package q7;

import ag.m;
import android.os.Parcel;
import android.os.Parcelable;
import v6.b;

public final class x6 implements Parcelable.Creator {
    public static void a(w6 w6Var, Parcel parcel) {
        int s10 = m.s(parcel, 20293);
        m.j(parcel, 1, w6Var.f13409a);
        m.n(parcel, 2, w6Var.f13410b);
        m.k(parcel, 3, w6Var.f13411c);
        m.l(parcel, 4, w6Var.f13412d);
        m.n(parcel, 6, w6Var.f13413e);
        m.n(parcel, 7, w6Var.B);
        Double d10 = w6Var.C;
        if (d10 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d10.doubleValue());
        }
        m.E(parcel, s10);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i8 = b.j(parcel2, readInt);
                    break;
                case 2:
                    str = b.c(parcel2, readInt);
                    break;
                case 3:
                    j10 = b.k(parcel2, readInt);
                    break;
                case 4:
                    l10 = b.l(parcel2, readInt);
                    break;
                case 5:
                    int m = b.m(parcel2, readInt);
                    if (m != 0) {
                        b.p(parcel2, m, 4);
                        f10 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f10 = null;
                        break;
                    }
                case 6:
                    str2 = b.c(parcel2, readInt);
                    break;
                case 7:
                    str3 = b.c(parcel2, readInt);
                    break;
                case 8:
                    int m10 = b.m(parcel2, readInt);
                    if (m10 != 0) {
                        b.p(parcel2, m10, 8);
                        d10 = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d10 = null;
                        break;
                    }
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new w6(i8, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new w6[i8];
    }
}
