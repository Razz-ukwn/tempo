package gc;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f8937b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f8938c;

    public c(e eVar, String str, Bundle bundle) {
        this.f8938c = eVar;
        this.f8936a = str;
        this.f8937b = bundle;
    }

    public final void run() {
        e eVar = this.f8938c;
        String str = this.f8936a;
        Bundle bundle = this.f8937b;
        eVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        String encodeToString = Base64.encodeToString(marshall, 0);
        eVar.f8950k.edit().putString(String.format("bundle_%s", new Object[]{str}), encodeToString).apply();
        this.f8938c.f8946g.remove(this);
        if (this.f8938c.f8946g.isEmpty() && this.f8938c.f8944e != null) {
            this.f8938c.f8944e.countDown();
        }
    }
}
