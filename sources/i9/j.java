package i9;

import android.os.Bundle;
import android.os.Process;
import androidx.activity.result.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f9631a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        d.b("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (j.class) {
            hashMap = f9631a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
        }
        if (hashMap.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
        }
        return bundle;
    }
}
