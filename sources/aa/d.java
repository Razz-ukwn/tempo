package aa;

import android.util.Log;
import ea.e;
import j0.t;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import z9.f;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final e f220a;

    static {
        Charset.forName("UTF-8");
    }

    public d(e eVar) {
        this.f220a = eVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, (String) null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), (Throwable) null);
        }
    }

    public final Map<String, String> b(String str, boolean z10) {
        Exception e10;
        FileInputStream fileInputStream;
        e eVar = this.f220a;
        File b10 = z10 ? eVar.b(str, "internal-keys") : eVar.b(str, "keys");
        if (!b10.exists() || b10.length() == 0) {
            d(b10);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(b10);
            try {
                HashMap a10 = a(f.l(fileInputStream));
                f.a(fileInputStream, "Failed to close user metadata file.");
                return a10;
            } catch (Exception e11) {
                e10 = e11;
                try {
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
                    d(b10);
                    f.a(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    f.a(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e12) {
            Exception exc = e12;
            fileInputStream = null;
            e10 = exc;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e10);
            d(b10);
            f.a(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            f.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final String c(String str) {
        FileInputStream fileInputStream;
        File b10 = this.f220a.b(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!b10.exists() || b10.length() == 0) {
            String a10 = t.a("No userId set for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", a10, (Throwable) null);
            }
            d(b10);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(b10);
            try {
                JSONObject jSONObject = new JSONObject(f.l(fileInputStream));
                String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", (String) null) : null;
                String str2 = "Loaded userId " + optString + " for session " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, (Throwable) null);
                }
                f.a(fileInputStream, "Failed to close user metadata file.");
                return optString;
            } catch (Exception e10) {
                e = e10;
                try {
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    d(b10);
                    f.a(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    f.a(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
            d(b10);
            f.a(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            f.a(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
