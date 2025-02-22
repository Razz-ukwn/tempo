package q7;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u6.q;

public final class c3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12934a = "default_event_parameters";

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f12935b = new Bundle();

    /* renamed from: c  reason: collision with root package name */
    public Bundle f12936c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g3 f12937d;

    public c3(g3 g3Var) {
        this.f12937d = g3Var;
        q.f("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5 = ((q7.x3) r0.f13121a).E;
        q7.x3.l(r5);
        r5.B.b("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a2 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a A[Catch:{ NumberFormatException | JSONException -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a() {
        /*
            r12 = this;
            android.os.Bundle r0 = r12.f12936c
            if (r0 == 0) goto L_0x0006
            goto L_0x00d1
        L_0x0006:
            q7.g3 r0 = r12.f12937d
            android.content.SharedPreferences r1 = r0.m()
            java.lang.String r2 = r12.f12934a
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x00c9
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b9 }
            r2.<init>()     // Catch:{ JSONException -> 0x00b9 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b9 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00b9 }
            r1 = 0
            r4 = r1
        L_0x0021:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00b9 }
            if (r4 >= r5) goto L_0x00b6
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            java.lang.String r6 = "n"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            java.lang.String r7 = "t"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            int r8 = r7.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            r9 = 100
            r10 = 2
            r11 = 1
            if (r8 == r9) goto L_0x005e
            r9 = 108(0x6c, float:1.51E-43)
            if (r8 == r9) goto L_0x0054
            r9 = 115(0x73, float:1.61E-43)
            if (r8 == r9) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r8 = "s"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = r1
            goto L_0x0069
        L_0x0054:
            java.lang.String r8 = "l"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = r10
            goto L_0x0069
        L_0x005e:
            java.lang.String r8 = "d"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0068
            r8 = r11
            goto L_0x0069
        L_0x0068:
            r8 = -1
        L_0x0069:
            java.lang.String r9 = "v"
            if (r8 == 0) goto L_0x009a
            if (r8 == r11) goto L_0x008e
            if (r8 == r10) goto L_0x0082
            q7.k4 r5 = r0.f13121a     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            q7.s2 r5 = r5.E     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            q7.x3.l(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            q7.q2 r5 = r5.B     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            java.lang.String r6 = "Unrecognized persisted bundle type. Type"
            r5.c(r7, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            goto L_0x00b2
        L_0x0082:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            r2.putLong(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            goto L_0x00b2
        L_0x008e:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            r2.putDouble(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            goto L_0x00b2
        L_0x009a:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            r2.putString(r6, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a2 }
            goto L_0x00b2
        L_0x00a2:
            q7.k4 r5 = r0.f13121a     // Catch:{ JSONException -> 0x00b9 }
            q7.x3 r5 = (q7.x3) r5     // Catch:{ JSONException -> 0x00b9 }
            q7.s2 r5 = r5.E     // Catch:{ JSONException -> 0x00b9 }
            q7.x3.l(r5)     // Catch:{ JSONException -> 0x00b9 }
            q7.q2 r5 = r5.B     // Catch:{ JSONException -> 0x00b9 }
            java.lang.String r6 = "Error reading value from SharedPreferences. Value dropped"
            r5.b(r6)     // Catch:{ JSONException -> 0x00b9 }
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x00b6:
            r12.f12936c = r2     // Catch:{ JSONException -> 0x00b9 }
            goto L_0x00c9
        L_0x00b9:
            q7.k4 r0 = r0.f13121a
            q7.x3 r0 = (q7.x3) r0
            q7.s2 r0 = r0.E
            q7.x3.l(r0)
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            q7.q2 r0 = r0.B
            r0.b(r1)
        L_0x00c9:
            android.os.Bundle r0 = r12.f12936c
            if (r0 != 0) goto L_0x00d1
            android.os.Bundle r0 = r12.f12935b
            r12.f12936c = r0
        L_0x00d1:
            android.os.Bundle r0 = r12.f12936c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.c3.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        g3 g3Var = this.f12937d;
        SharedPreferences.Editor edit = g3Var.m().edit();
        int size = bundle.size();
        String str = this.f12934a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            s2 s2Var = ((x3) g3Var.f13121a).E;
                            x3.l(s2Var);
                            s2Var.B.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        s2 s2Var2 = ((x3) g3Var.f13121a).E;
                        x3.l(s2Var2);
                        s2Var2.B.c(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f12936c = bundle;
    }
}
