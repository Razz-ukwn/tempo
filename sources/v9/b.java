package v9;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import o9.a;

public final class b implements a.C0234a {

    /* renamed from: a  reason: collision with root package name */
    public x9.b f16343a;

    /* renamed from: b  reason: collision with root package name */
    public x9.b f16344b;

    public final void a(int i8, Bundle bundle) {
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i8), bundle});
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, (Throwable) null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            x9.b bVar = "clx".equals(bundle2.getString("_o")) ? this.f16343a : this.f16344b;
            if (bVar != null) {
                bVar.b(bundle2, string);
            }
        }
    }
}
