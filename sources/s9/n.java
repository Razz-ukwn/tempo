package s9;

import com.google.android.gms.internal.p000firebaseauthapi.oh;
import java.util.HashMap;
import java.util.Map;
import q7.o6;
import x6.a;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14853a = new a("GetTokenResultFactory", new String[0]);

    public static o6 a(String str) {
        Map map;
        try {
            map = o.b(str);
        } catch (oh e10) {
            f14853a.b("Error parsing token claims", e10, new Object[0]);
            map = new HashMap();
        }
        return new o6(str, map);
    }
}
