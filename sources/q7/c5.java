package q7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class c5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d5 f12942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12943b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f12944c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f12945d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f12946e;

    public /* synthetic */ c5(d5 d5Var, int i8, IOException iOException, byte[] bArr, Map map) {
        this.f12942a = d5Var;
        this.f12943b = i8;
        this.f12944c = iOException;
        this.f12945d = bArr;
        this.f12946e = map;
    }

    public final void run() {
        x3 x3Var = (x3) this.f12942a.f12967c.f13864a;
        a7 a7Var = x3Var.H;
        int i8 = this.f12943b;
        Exception exc = this.f12944c;
        s2 s2Var = x3Var.E;
        if (!(i8 == 200 || i8 == 204)) {
            if (i8 == 304) {
                i8 = 304;
            }
            x3.l(s2Var);
            s2Var.E.d(Integer.valueOf(i8), exc, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (exc == null) {
            g3 g3Var = x3Var.D;
            x3.j(g3Var);
            g3Var.N.a(true);
            byte[] bArr = this.f12945d;
            if (bArr == null || bArr.length == 0) {
                x3.l(s2Var);
                s2Var.I.b("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    x3.l(s2Var);
                    s2Var.I.b("Deferred Deep Link is empty.");
                    return;
                }
                x3.j(a7Var);
                k4 k4Var = a7Var.f13121a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = ((x3) k4Var).f13419a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        x3Var.L.p("auto", "_cmp", bundle);
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = ((x3) k4Var).f13419a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    ((x3) k4Var).f13419a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                s2 s2Var2 = ((x3) k4Var).E;
                                x3.l(s2Var2);
                                s2Var2.B.c(e10, "Failed to persist Deferred Deep Link. exception");
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                x3.l(s2Var);
                s2Var.E.d(optString2, optString, "Deferred Deep Link validation failed. gclid, deep link");
                return;
            } catch (JSONException e11) {
                x3.l(s2Var);
                s2Var.B.c(e11, "Failed to parse the Deferred Deep Link response. exception");
                return;
            }
        }
        x3.l(s2Var);
        s2Var.E.d(Integer.valueOf(i8), exc, "Network Request for Deferred Deep Link failed. response, exception");
    }
}
