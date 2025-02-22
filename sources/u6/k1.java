package u6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import h7.a;

public final class k1 extends a implements j {
    public k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
    }

    public final Account zzb() {
        Parcel a10 = a(b(), 2);
        Account account = (Account) j7.a.a(a10, Account.CREATOR);
        a10.recycle();
        return account;
    }
}
