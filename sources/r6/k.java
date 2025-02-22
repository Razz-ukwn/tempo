package r6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.f0;
import g7.d;

public final class k extends l {
    public k(f0 f0Var) {
        super(f0Var);
    }

    public final /* bridge */ /* synthetic */ h b(Status status) {
        return status;
    }

    public final void i(a.e eVar) {
        g gVar = (g) eVar;
        r rVar = (r) gVar.x();
        j jVar = new j(this);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(rVar.f8895b);
        int i8 = d.f8898a;
        obtain.writeStrongBinder(jVar);
        GoogleSignInOptions googleSignInOptions = gVar.B;
        if (googleSignInOptions == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            googleSignInOptions.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.f8894a.transact(103, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
