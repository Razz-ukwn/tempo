package r6;

import android.content.Context;
import android.os.Binder;
import d.a;
import z6.g;

public final class s extends o {

    /* renamed from: b  reason: collision with root package name */
    public final Context f14084b;

    public s(Context context) {
        this.f14084b = context;
    }

    public final void c() {
        if (!g.a(this.f14084b, Binder.getCallingUid())) {
            throw new SecurityException(a.a("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
