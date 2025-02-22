package q7;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.g0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import u6.q;

public abstract class i2 extends f0 implements j2 {
    public i2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean a(int i8, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        boolean z10 = false;
        switch (i8) {
            case 1:
                g0.b(parcel);
                ((h4) this).n((s) g0.a(parcel, s.CREATOR), (c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                g0.b(parcel);
                ((h4) this).e((w6) g0.a(parcel, w6.CREATOR), (c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                g0.b(parcel);
                ((h4) this).v((c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                s sVar = (s) g0.a(parcel, s.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                g0.b(parcel);
                h4 h4Var = (h4) this;
                q.i(sVar);
                q.f(readString);
                h4Var.M(readString, true);
                h4Var.c(new g1(2, h4Var, sVar, readString));
                parcel2.writeNoException();
                break;
            case 6:
                g0.b(parcel);
                ((h4) this).x((c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                c7 c7Var = (c7) g0.a(parcel, c7.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                g0.b(parcel);
                h4 h4Var2 = (h4) this;
                h4Var2.L(c7Var);
                String str = c7Var.f12948a;
                q.i(str);
                t6 t6Var = h4Var2.f13101a;
                try {
                    List<y6> list = (List) t6Var.h().o(new f4(h4Var2, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (y6 y6Var : list) {
                        if (z10 || !a7.W(y6Var.f13452c)) {
                            arrayList.add(new w6(y6Var));
                        }
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    t6Var.e().B.d(s2.r(str), e10, "Failed to get user properties. appId");
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                break;
            case 9:
                String readString2 = parcel.readString();
                g0.b(parcel);
                byte[] s10 = ((h4) this).s((s) g0.a(parcel, s.CREATOR), readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(s10);
                break;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                g0.b(parcel);
                ((h4) this).z(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                break;
            case ModuleDescriptor.MODULE_VERSION:
                g0.b(parcel);
                String G = ((h4) this).G((c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(G);
                break;
            case 12:
                g0.b(parcel);
                ((h4) this).r((c) g0.a(parcel, c.CREATOR), (c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                c cVar = (c) g0.a(parcel, c.CREATOR);
                g0.b(parcel);
                h4 h4Var3 = (h4) this;
                q.i(cVar);
                q.i(cVar.f12928c);
                q.f(cVar.f12926a);
                h4Var3.M(cVar.f12926a, true);
                h4Var3.c(new z3(0, h4Var3, new c(cVar)));
                parcel2.writeNoException();
                break;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = g0.f5282a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                g0.b(parcel);
                List m = ((h4) this).m(readString6, readString7, z10, (c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(m);
                break;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = g0.f5282a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                g0.b(parcel);
                List d10 = ((h4) this).d(readString8, readString9, readString10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(d10);
                break;
            case 16:
                g0.b(parcel);
                List t2 = ((h4) this).t(parcel.readString(), parcel.readString(), (c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(t2);
                break;
            case 17:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                g0.b(parcel);
                List o10 = ((h4) this).o(readString11, readString12, readString13);
                parcel2.writeNoException();
                parcel2.writeTypedList(o10);
                break;
            case 18:
                g0.b(parcel);
                ((h4) this).H((c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                g0.b(parcel);
                ((h4) this).D((Bundle) g0.a(parcel, Bundle.CREATOR), (c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                g0.b(parcel);
                ((h4) this).g((c7) g0.a(parcel, c7.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
