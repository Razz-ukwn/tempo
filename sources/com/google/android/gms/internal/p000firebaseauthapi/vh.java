package com.google.android.gms.internal.p000firebaseauthapi;

import ag.i0;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import c2.e;
import cb.d;
import da.a;
import ga.g;
import java.util.HashMap;
import org.json.JSONObject;
import s9.j;
import u6.q;
import z9.g0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.vh  reason: invalid package */
public final class vh implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5025a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5026b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5027c;

    public /* synthetic */ vh(u uVar, v0 v0Var, j3 j3Var) {
        this.f5027c = uVar;
        this.f5025a = v0Var;
        this.f5026b = j3Var;
    }

    public /* synthetic */ vh(String str, i0 i0Var) {
        d dVar = d.f3892c;
        if (str != null) {
            this.f5027c = dVar;
            this.f5026b = i0Var;
            this.f5025a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public static void a(a aVar, g gVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f8919a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.6");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f8920b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f8921c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f8922d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((g0) gVar.f8923e).c());
    }

    public static void b(a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f7388c.put(str, str2);
        }
    }

    public static HashMap c(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f8926h);
        hashMap.put("display_version", gVar.f8925g);
        hashMap.put("source", Integer.toString(gVar.f8927i));
        String str = gVar.f8924f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final void d(n nVar) {
        v0 v0Var = (v0) this.f5025a;
        v0Var.K = true;
        String str = ((m0) nVar).f4724b;
        v0Var.getClass();
        q.f(str);
        v0Var.f5002b = str;
        ((x) ((u) this.f5027c).f2324b).g(v0Var, new ph(this, (w) this));
    }

    public final JSONObject e(e eVar) {
        int i8 = eVar.f3659a;
        d dVar = (d) this.f5027c;
        dVar.j0("Settings response code was: " + i8);
        boolean z10 = i8 == 200 || i8 == 201 || i8 == 202 || i8 == 203;
        Object obj = this.f5025a;
        if (z10) {
            String str = (String) eVar.f3660b;
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                dVar.k0("Failed to parse settings JSON from " + ((String) obj), e10);
                dVar.k0("Settings response " + str, (Exception) null);
                return null;
            }
        } else {
            StringBuilder b10 = a1.b("Settings request failed; (status: ", i8, ") from ");
            b10.append((String) obj);
            String sb2 = b10.toString();
            if (!dVar.q(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", sb2, (Throwable) null);
            return null;
        }
    }

    public final void zza(String str) {
        ((j3) this.f5026b).i(j.a(str));
    }
}
