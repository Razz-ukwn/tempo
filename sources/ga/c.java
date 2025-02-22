package ga;

import ag.i0;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.lifecycle.u;
import cb.d;
import com.google.android.gms.internal.p000firebaseauthapi.vh;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import da.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;
import z9.f;

public final class c implements SuccessContinuation<Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f8909a;

    public c(d dVar) {
        this.f8909a = dVar;
    }

    public final Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Exception e10;
        Void voidR = (Void) obj;
        d dVar = this.f8909a;
        vh vhVar = dVar.f8915f;
        g gVar = dVar.f8911b;
        Object obj2 = vhVar.f5025a;
        Object obj3 = vhVar.f5027c;
        FileWriter fileWriter2 = null;
        try {
            HashMap c3 = vh.c(gVar);
            ((i0) vhVar.f5026b).getClass();
            a aVar = new a((String) obj2, c3);
            HashMap hashMap = aVar.f7388c;
            hashMap.put("User-Agent", "Crashlytics Android SDK/18.3.6");
            hashMap.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            vh.a(aVar, gVar);
            ((d) obj3).w("Requesting settings from " + ((String) obj2));
            ((d) obj3).j0("Settings query params were: " + c3);
            jSONObject = vhVar.e(aVar.b());
        } catch (IOException e11) {
            if (((d) obj3).q(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e11);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            b g10 = dVar.f8912c.g(jSONObject);
            long j10 = g10.f8901c;
            u uVar = dVar.f8914e;
            uVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable) null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) uVar.f2324b);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e12) {
                    e10 = e12;
                }
            } catch (Exception e13) {
                e10 = e13;
                fileWriter = null;
                try {
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e10);
                    f.a(fileWriter, "Failed to close settings writer.");
                    d.c(jSONObject, "Loaded settings: ");
                    String str = gVar.f8924f;
                    SharedPreferences.Editor edit = dVar.f8910a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    dVar.f8917h.set(g10);
                    dVar.f8918i.get().trySetResult(g10);
                    return Tasks.forResult(null);
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    f.a(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                f.a(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            f.a(fileWriter, "Failed to close settings writer.");
            d.c(jSONObject, "Loaded settings: ");
            String str2 = gVar.f8924f;
            SharedPreferences.Editor edit2 = dVar.f8910a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            dVar.f8917h.set(g10);
            dVar.f8918i.get().trySetResult(g10);
        }
        return Tasks.forResult(null);
    }
}
