package ga;

import cb.c;
import ga.b;
import org.json.JSONObject;

public final class a implements e {
    public static b b(c cVar) {
        b.C0158b bVar = new b.C0158b(8);
        b.a aVar = new b.a(true, false, false);
        cVar.getClass();
        return new b(System.currentTimeMillis() + ((long) 3600000), bVar, aVar, 10.0d, 1.2d, 60);
    }

    public final b a(c cVar, JSONObject jSONObject) {
        return b(cVar);
    }
}
