package aa;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f214a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f215b = 64;

    /* renamed from: c  reason: collision with root package name */
    public final int f216c;

    public b(int i8) {
        this.f216c = i8;
    }

    public final synchronized void a(Map<String, String> map) {
        String str;
        int i8 = 0;
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            if (str2 != null) {
                int i10 = this.f216c;
                String trim = str2.trim();
                if (trim.length() > i10) {
                    trim = trim.substring(0, i10);
                }
                if (this.f214a.size() >= this.f215b) {
                    if (!this.f214a.containsKey(trim)) {
                        i8++;
                    }
                }
                String str3 = (String) next.getValue();
                HashMap hashMap = this.f214a;
                if (str3 == null) {
                    str = "";
                } else {
                    int i11 = this.f216c;
                    str = str3.trim();
                    if (str.length() > i11) {
                        str = str.substring(0, i11);
                    }
                }
                hashMap.put(trim, str);
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
        if (i8 > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i8 + " entries when adding custom keys. Maximum allowable: " + this.f215b, (Throwable) null);
        }
    }
}
