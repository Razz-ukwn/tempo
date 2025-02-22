package s9;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.la;
import com.google.android.gms.internal.p000firebaseauthapi.oh;
import com.google.android.gms.internal.p000firebaseauthapi.s0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import t.w2;
import t.x2;
import u6.q;
import x6.a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14854a = new a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            Object obj = jSONArray.get(i8);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        q.f(str);
        List k10 = new w2((s0) new x2(new la('.'), 2)).k(str);
        int size = k10.size();
        a aVar = f14854a;
        if (size < 2) {
            aVar.c("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) k10.get(1);
        try {
            o.a c3 = c(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return c3 == null ? new HashMap() : c3;
        } catch (UnsupportedEncodingException e10) {
            aVar.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static o.a c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new oh(e10);
        }
    }

    public static o.a d(JSONObject jSONObject) {
        o.a aVar = new o.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
