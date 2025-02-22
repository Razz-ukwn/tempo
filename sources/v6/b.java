package v6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.g;
import androidx.activity.result.d;
import androidx.fragment.app.q;
import java.util.ArrayList;

public final class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i8) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m);
        return readBundle;
    }

    public static <T extends Parcelable> T b(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        T t2 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m);
        return t2;
    }

    public static String c(Parcel parcel, int i8) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m);
        return readString;
    }

    public static ArrayList<String> d(Parcel parcel, int i8) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m);
        return createStringArrayList;
    }

    public static <T> T[] e(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m);
        return createTypedArray;
    }

    public static <T> ArrayList<T> f(Parcel parcel, int i8, Parcelable.Creator<T> creator) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m);
        return createTypedArrayList;
    }

    public static void g(Parcel parcel, int i8) {
        if (parcel.dataPosition() != i8) {
            throw new a(q.a("Overread allowed size end=", i8), parcel);
        }
    }

    public static boolean h(Parcel parcel, int i8) {
        q(parcel, i8, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder i(Parcel parcel, int i8) {
        int m = m(parcel, i8);
        int dataPosition = parcel.dataPosition();
        if (m == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m);
        return readStrongBinder;
    }

    public static int j(Parcel parcel, int i8) {
        q(parcel, i8, 4);
        return parcel.readInt();
    }

    public static long k(Parcel parcel, int i8) {
        q(parcel, i8, 8);
        return parcel.readLong();
    }

    public static Long l(Parcel parcel, int i8) {
        int m = m(parcel, i8);
        if (m == 0) {
            return null;
        }
        p(parcel, m, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int m(Parcel parcel, int i8) {
        return (i8 & -65536) != -65536 ? (char) (i8 >> 16) : parcel.readInt();
    }

    public static void n(Parcel parcel, int i8) {
        parcel.setDataPosition(parcel.dataPosition() + m(parcel, i8));
    }

    public static int o(Parcel parcel) {
        int readInt = parcel.readInt();
        int m = m(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 == 20293) {
            int i8 = m + dataPosition;
            if (i8 >= dataPosition && i8 <= parcel.dataSize()) {
                return i8;
            }
            throw new a(d.a("Size read is invalid start=", dataPosition, " end=", i8), parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void p(Parcel parcel, int i8, int i10) {
        if (i8 != i10) {
            String hexString = Integer.toHexString(i8);
            StringBuilder sb2 = new StringBuilder("Expected size ");
            sb2.append(i10);
            sb2.append(" got ");
            sb2.append(i8);
            sb2.append(" (0x");
            throw new a(g.a(sb2, hexString, ")"), parcel);
        }
    }

    public static void q(Parcel parcel, int i8, int i10) {
        int m = m(parcel, i8);
        if (m != i10) {
            String hexString = Integer.toHexString(m);
            StringBuilder sb2 = new StringBuilder("Expected size ");
            sb2.append(i10);
            sb2.append(" got ");
            sb2.append(m);
            sb2.append(" (0x");
            throw new a(g.a(sb2, hexString, ")"), parcel);
        }
    }
}
