package s6;

import android.util.Log;

public final class g extends ClassLoader {
    public final Class<?> loadClass(String str, boolean z10) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z10);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return h.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return h.class;
    }
}
