package kc;

import android.database.Cursor;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import e9.c;
import gc.b;
import i3.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class d implements Callable<List<UserModel>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10408a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f10409b;

    public d(c cVar, r rVar) {
        this.f10409b = cVar;
        this.f10408a = rVar;
    }

    public final Object call() {
        String str;
        int i8;
        String str2;
        int i10;
        Cursor i11 = c.i(this.f10409b.f10404a, this.f10408a);
        try {
            int k10 = b.k(i11, "uuid");
            int k11 = b.k(i11, "id");
            int k12 = b.k(i11, "firstName");
            int k13 = b.k(i11, "lastName");
            int k14 = b.k(i11, "email");
            int k15 = b.k(i11, "nickName");
            int k16 = b.k(i11, "type");
            int k17 = b.k(i11, "registrationType");
            int k18 = b.k(i11, "countryCode");
            int k19 = b.k(i11, "phone");
            int k20 = b.k(i11, "walletBalance");
            int k21 = b.k(i11, "recordingTime");
            int k22 = b.k(i11, "recordingCount");
            int k23 = b.k(i11, "avgTime");
            int k24 = b.k(i11, "lastLogin");
            int k25 = b.k(i11, "authToken");
            int k26 = b.k(i11, "inviteCode");
            int k27 = b.k(i11, "profileImg");
            int k28 = b.k(i11, "createdAt");
            int i12 = k23;
            ArrayList arrayList = new ArrayList(i11.getCount());
            while (i11.moveToNext()) {
                int i13 = i11.getInt(k10);
                String string = i11.isNull(k11) ? null : i11.getString(k11);
                String string2 = i11.isNull(k12) ? null : i11.getString(k12);
                String string3 = i11.isNull(k13) ? null : i11.getString(k13);
                String string4 = i11.isNull(k14) ? null : i11.getString(k14);
                String string5 = i11.isNull(k15) ? null : i11.getString(k15);
                String string6 = i11.isNull(k16) ? null : i11.getString(k16);
                String string7 = i11.isNull(k17) ? null : i11.getString(k17);
                String string8 = i11.isNull(k18) ? null : i11.getString(k18);
                String string9 = i11.isNull(k19) ? null : i11.getString(k19);
                String string10 = i11.isNull(k20) ? null : i11.getString(k20);
                String string11 = i11.isNull(k21) ? null : i11.getString(k21);
                if (i11.isNull(k22)) {
                    i8 = i12;
                    str = null;
                } else {
                    str = i11.getString(k22);
                    i8 = i12;
                }
                String string12 = i11.isNull(i8) ? null : i11.getString(i8);
                int i14 = k24;
                int i15 = k10;
                int i16 = i14;
                String string13 = i11.isNull(i16) ? null : i11.getString(i16);
                int i17 = k25;
                int i18 = i16;
                int i19 = i17;
                String string14 = i11.isNull(i19) ? null : i11.getString(i19);
                int i20 = k26;
                int i21 = i19;
                int i22 = i20;
                String string15 = i11.isNull(i22) ? null : i11.getString(i22);
                int i23 = k27;
                int i24 = i22;
                int i25 = i23;
                String string16 = i11.isNull(i25) ? null : i11.getString(i25);
                int i26 = k28;
                int i27 = i25;
                int i28 = i26;
                if (i11.isNull(i28)) {
                    i10 = i28;
                    str2 = null;
                } else {
                    str2 = i11.getString(i28);
                    i10 = i28;
                }
                arrayList.add(new UserModel(i13, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, str, string12, string13, string14, string15, string16, str2));
                k10 = i15;
                k24 = i18;
                k25 = i21;
                k26 = i24;
                k27 = i27;
                k28 = i10;
                i12 = i8;
            }
            return arrayList;
        } finally {
            i11.close();
        }
    }

    public final void finalize() {
        this.f10408a.j();
    }
}
