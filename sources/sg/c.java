package sg;

import gf.y;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import jg.v;
import mg.d;
import qg.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f14962a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f14963b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<v> cls = v.class;
        Package packageR = cls.getPackage();
        String name = packageR == null ? null : packageR.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(cls.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f14963b = y.W(linkedHashMap);
    }
}
