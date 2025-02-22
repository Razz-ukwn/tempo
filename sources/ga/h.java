package ga;

import cb.c;
import ga.b;
import org.json.JSONObject;

public final class h implements e {
    public final b a(c cVar, JSONObject jSONObject) {
        long j10;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.optInt("settings_version", 0);
        int optInt = jSONObject2.optInt("cache_duration", 3600);
        double optDouble = jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject2.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60);
        b.C0158b bVar = jSONObject2.has("session") ? new b.C0158b(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new b.C0158b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject3 = jSONObject2.getJSONObject("features");
        b.a aVar = new b.a(jSONObject3.optBoolean("collect_reports", true), jSONObject3.optBoolean("collect_anrs", false), jSONObject3.optBoolean("collect_build_ids", false));
        long j11 = (long) optInt;
        if (jSONObject2.has("expires_at")) {
            j10 = jSONObject2.optLong("expires_at");
        } else {
            cVar.getClass();
            j10 = (j11 * 1000) + System.currentTimeMillis();
        }
        return new b(j10, bVar, aVar, optDouble, optDouble2, optInt2);
    }
}
