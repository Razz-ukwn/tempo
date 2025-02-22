package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import cb.b;
import e.s;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import m9.f;
import o.a;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p  reason: invalid package */
public final class p extends x {

    /* renamed from: a  reason: collision with root package name */
    public j f4789a = null;

    /* renamed from: b  reason: collision with root package name */
    public k f4790b = null;

    /* renamed from: c  reason: collision with root package name */
    public j f4791c = null;

    /* renamed from: d  reason: collision with root package name */
    public final o f4792d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4793e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4794f;

    /* renamed from: g  reason: collision with root package name */
    public q f4795g;

    public p(f fVar, o oVar) {
        b0 b0Var;
        b0 b0Var2;
        this.f4793e = fVar;
        fVar.a();
        String str = fVar.f11333c.f11343a;
        this.f4794f = str;
        this.f4792d = oVar;
        String u7 = m.u("firebear.secureToken");
        if (TextUtils.isEmpty(u7)) {
            a aVar = c0.f4437a;
            synchronized (aVar) {
                b0Var2 = (b0) aVar.getOrDefault(str, null);
            }
            if (b0Var2 == null) {
                u7 = "https://".concat("securetoken.googleapis.com/v1");
            } else {
                throw null;
            }
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(u7)));
        }
        if (this.f4791c == null) {
            this.f4791c = new j(u7, j());
        }
        String u10 = m.u("firebear.identityToolkit");
        if (TextUtils.isEmpty(u10)) {
            u10 = c0.a(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(u10)));
        }
        if (this.f4789a == null) {
            this.f4789a = new j(u10, j());
        }
        String u11 = m.u("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(u11)) {
            a aVar2 = c0.f4437a;
            synchronized (aVar2) {
                b0Var = (b0) aVar2.getOrDefault(str, null);
            }
            if (b0Var == null) {
                u11 = "https://".concat("identitytoolkit.googleapis.com/v2");
            } else {
                throw null;
            }
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(u11)));
        }
        if (this.f4790b == null) {
            this.f4790b = new k(u11, j());
        }
        a aVar3 = c0.f4438b;
        synchronized (aVar3) {
            if (aVar3.containsKey(str)) {
                ((List) aVar3.getOrDefault(str, null)).add(new WeakReference(this));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(this));
                aVar3.put(str, arrayList);
            }
        }
    }

    public final void b(e0 e0Var, rh rhVar) {
        j jVar = this.f4789a;
        b.P(jVar.a("/emailLinkSignin", this.f4794f), e0Var, rhVar, f0.class, jVar.f4627b);
    }

    public final void c(j3 j3Var, w wVar) {
        j jVar = this.f4791c;
        b.P(jVar.a("/token", this.f4794f), j3Var, wVar, m0.class, jVar.f4627b);
    }

    public final void d(u uVar, w wVar) {
        j jVar = this.f4789a;
        b.P(jVar.a("/getAccountInfo", this.f4794f), uVar, wVar, g0.class, jVar.f4627b);
    }

    public final void e(k0 k0Var, s sVar) {
        k kVar = this.f4790b;
        String str = kVar.a("/recaptchaConfig", this.f4794f) + "&clientType=" + ((String) k0Var.f4675b) + "&version=" + ((String) k0Var.f4676c);
        q qVar = kVar.f4627b;
        Class<l0> cls = l0.class;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            qVar.a(httpURLConnection);
            b.Q(httpURLConnection, sVar, cls);
        } catch (SocketTimeoutException unused) {
            sVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            sVar.zza("<<Network Error>>");
        } catch (IOException e10) {
            sVar.zza(e10.getMessage());
        }
    }

    public final void f(q0 q0Var, sh shVar) {
        j jVar = this.f4789a;
        b.P(jVar.a("/setAccountInfo", this.f4794f), q0Var, shVar, r0.class, jVar.f4627b);
    }

    public final void g(v0 v0Var, w wVar) {
        q.i(v0Var);
        j jVar = this.f4789a;
        b.P(jVar.a("/verifyAssertion", this.f4794f), v0Var, wVar, x0.class, jVar.f4627b);
    }

    public final void h(y0 y0Var, j3 j3Var) {
        j jVar = this.f4789a;
        b.P(jVar.a("/verifyPassword", this.f4794f), y0Var, j3Var, z0.class, jVar.f4627b);
    }

    public final void i(a1 a1Var, w wVar) {
        q.i(a1Var);
        j jVar = this.f4789a;
        b.P(jVar.a("/verifyPhoneNumber", this.f4794f), a1Var, wVar, b1.class, jVar.f4627b);
    }

    public final q j() {
        if (this.f4795g == null) {
            String format = String.format("X%s", new Object[]{Integer.toString(this.f4792d.f4766a)});
            f fVar = this.f4793e;
            fVar.a();
            this.f4795g = new q(fVar.f11331a, fVar, format);
        }
        return this.f4795g;
    }
}
