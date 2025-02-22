package s9;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f14818a;

    static {
        HashMap hashMap = new HashMap();
        f14818a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap hashMap = f14818a;
                if (hashMap.containsKey(string)) {
                    return j.a(((String) hashMap.get(string)) + ":" + string2);
                }
            }
            return j.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            String localizedMessage = e10.getLocalizedMessage();
            return j.a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }
}
