package ga;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.u;
import cb.c;
import com.google.android.gms.internal.p000firebaseauthapi.vh;
import com.google.android.gms.tasks.TaskCompletionSource;
import e.s;
import h0.e;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import q.g;
import z9.c0;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8910a;

    /* renamed from: b  reason: collision with root package name */
    public final g f8911b;

    /* renamed from: c  reason: collision with root package name */
    public final s f8912c;

    /* renamed from: d  reason: collision with root package name */
    public final c f8913d;

    /* renamed from: e  reason: collision with root package name */
    public final u f8914e;

    /* renamed from: f  reason: collision with root package name */
    public final vh f8915f;

    /* renamed from: g  reason: collision with root package name */
    public final c0 f8916g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<b> f8917h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<b>> f8918i = new AtomicReference<>(new TaskCompletionSource());

    public d(Context context, g gVar, c cVar, s sVar, u uVar, vh vhVar, c0 c0Var) {
        AtomicReference<b> atomicReference = new AtomicReference<>();
        this.f8917h = atomicReference;
        this.f8910a = context;
        this.f8911b = gVar;
        this.f8913d = cVar;
        this.f8912c = sVar;
        this.f8914e = uVar;
        this.f8915f = vhVar;
        this.f8916g = c0Var;
        atomicReference.set(a.b(cVar));
    }

    public static void c(JSONObject jSONObject, String str) {
        StringBuilder c3 = e.c(str);
        c3.append(jSONObject.toString());
        String sb2 = c3.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, (Throwable) null);
        }
    }

    public final b a(int i8) {
        b bVar = null;
        try {
            if (g.b(2, i8)) {
                return null;
            }
            JSONObject b10 = this.f8914e.b();
            if (b10 != null) {
                b g10 = this.f8912c.g(b10);
                if (g10 != null) {
                    c(b10, "Loaded cached settings: ");
                    this.f8913d.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!g.b(3, i8)) {
                        if (g10.f8901c < currentTimeMillis) {
                            if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                                return null;
                            }
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", (Throwable) null);
                            return null;
                        }
                    }
                    try {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Returning cached settings.", (Throwable) null);
                        }
                        return g10;
                    } catch (Exception e10) {
                        e = e10;
                        bVar = g10;
                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return bVar;
                    }
                } else {
                    Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                return null;
            } else {
                Log.d("FirebaseCrashlytics", "No cached settings data found.", (Throwable) null);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
            return bVar;
        }
    }

    public final b b() {
        return this.f8917h.get();
    }
}
