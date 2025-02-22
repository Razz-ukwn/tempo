package e;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.j3;
import androidx.fragment.app.z0;
import cb.c;
import com.google.android.gms.internal.p000firebaseauthapi.aa;
import com.google.android.gms.internal.p000firebaseauthapi.ag;
import com.google.android.gms.internal.p000firebaseauthapi.b;
import com.google.android.gms.internal.p000firebaseauthapi.de;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.google.android.gms.internal.p000firebaseauthapi.ec;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.l0;
import com.google.android.gms.internal.p000firebaseauthapi.mh;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.q9;
import com.google.android.gms.internal.p000firebaseauthapi.r;
import com.google.android.gms.internal.p000firebaseauthapi.s0;
import com.google.android.gms.internal.p000firebaseauthapi.tb;
import com.google.android.gms.internal.p000firebaseauthapi.u9;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.w9;
import com.google.android.gms.internal.p000firebaseauthapi.x1;
import com.google.android.gms.internal.p000firebaseauthapi.y1;
import com.google.android.gms.internal.p000firebaseauthapi.zf;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.RecaptchaActivity;
import ga.e;
import ga.h;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import javax.crypto.Mac;
import o5.d;
import org.json.JSONObject;
import q7.q5;
import q7.s2;
import q7.t6;
import q7.x3;
import q7.z3;
import q7.z6;
import s9.j;
import t.w2;
import u6.k;
import x6.a;

public final class s implements s0, u9, ec, w, OnTokenCanceledListener, z6, OnFailureListener, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7705a;

    public /* synthetic */ s(j3 j3Var) {
        this.f7705a = j3Var;
    }

    public /* synthetic */ s(e6 e6Var) {
        this.f7705a = e6Var;
    }

    public /* synthetic */ s(Object obj) {
        this.f7705a = obj;
    }

    public final Iterator a(w2 w2Var, CharSequence charSequence) {
        return new r(w2Var, charSequence, new jf(((zf) ((de) this.f7705a)).f5137a.matcher(charSequence)));
    }

    public final void b(String str, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        Object obj = this.f7705a;
        if (isEmpty) {
            x3 x3Var = ((t6) obj).H;
            if (x3Var != null) {
                s2 s2Var = x3Var.E;
                x3.l(s2Var);
                s2Var.B.c("_err", "AppId not known when logging event");
                return;
            }
            return;
        }
        ((t6) obj).h().q(new q5(this, str, bundle));
    }

    public final byte[] c(byte[] bArr, w9 w9Var) {
        byte[] bArr2 = w9Var.zza().f4722a;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        byte[] k10 = z0.k(bArr3, bArr);
        byte[] bArr4 = w9Var.zzb().f4722a;
        int length2 = bArr4.length;
        byte[] bArr5 = new byte[length2];
        System.arraycopy(bArr4, 0, bArr5, 0, length2);
        byte[] l10 = z0.l(bArr, bArr5);
        byte[] l11 = z0.l(aa.m, aa.f4387b);
        q9 q9Var = (q9) this.f7705a;
        int macLength = Mac.getInstance(q9Var.f4842a).getMacLength();
        return q9Var.b(q9Var.c(z0.l(aa.f4399o, l11, "eae_prk".getBytes(tb.f4952a), k10), (byte[]) null), aa.c("shared_secret", l10, l11, macLength), macLength);
    }

    public final void d(n nVar) {
        l0 l0Var = (l0) nVar;
        j3 j3Var = (j3) this.f7705a;
        j3Var.getClass();
        try {
            ((b) j3Var.f1338a).e(l0Var);
        } catch (RemoteException e10) {
            ((a) j3Var.f1339b).b("RemoteException when sending get recaptcha config response.", e10, new Object[0]);
        }
    }

    public final i0.a e() {
        return (i0.a) this.f7705a;
    }

    public final void f() {
        d dVar = (d) this.f7705a;
        dVar.f12183b.cancel();
        View view = dVar.f12182a;
        if (view.getVisibility() == 4) {
            view.setVisibility(0);
            dVar.a();
            dVar.f12184c.start();
        }
    }

    public final ga.b g(JSONObject jSONObject) {
        e eVar;
        int i8 = jSONObject.getInt("settings_version");
        if (i8 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i8 + ". Using default settings values.", (Throwable) null);
            eVar = new ga.a();
        } else {
            eVar = new h();
        }
        return eVar.a((c) this.f7705a, jSONObject);
    }

    public final void h(ag agVar) {
        Object obj = this.f7705a;
        try {
            OutputStream outputStream = (OutputStream) obj;
            agVar.getClass();
            int zzs = agVar.zzs();
            Logger logger = y1.f5090b;
            if (zzs > 4096) {
                zzs = 4096;
            }
            x1 x1Var = new x1(outputStream, zzs);
            agVar.i(x1Var);
            if (x1Var.f5064f > 0) {
                x1Var.F();
            }
        } finally {
            ((OutputStream) obj).close();
        }
    }

    public final void onCanceled() {
        try {
            ((k) this.f7705a).cancel();
        } catch (RemoteException unused) {
        }
    }

    public final void onFailure(Exception exc) {
        long j10;
        if (exc instanceof m9.h) {
            a aVar = s9.k.f14839e;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            s9.k kVar = (s9.k) ((z3) this.f7705a).f13464b;
            int i8 = (int) kVar.f14841b;
            if (i8 == 30 || i8 == 60 || i8 == 120 || i8 == 240 || i8 == 480) {
                long j11 = kVar.f14841b;
                j10 = j11 + j11;
            } else {
                j10 = i8 != 960 ? 30 : 960;
            }
            kVar.f14841b = j10;
            kVar.f14840a = (kVar.f14841b * 1000) + System.currentTimeMillis();
            long j12 = kVar.f14840a;
            aVar.e("Scheduling refresh for " + j12, new Object[0]);
            kVar.f14842c.postDelayed(kVar.f14843d, kVar.f14841b * 1000);
        }
    }

    public final Object then(Task task) {
        ExecutorService executorService = RecaptchaActivity.V;
        Uri.Builder buildUpon = ((Uri) this.f7705a).buildUpon();
        if (task.isSuccessful()) {
            mh mhVar = (mh) task.getResult();
            if (mhVar.a() != null) {
                Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(mhVar.a())));
            }
            buildUpon.fragment("fac=".concat(String.valueOf(mhVar.b())));
        } else {
            Log.e("RecaptchaActivity", "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage())));
        }
        return buildUpon.build();
    }

    public final void zza(String str) {
        ((j3) this.f7705a).i(j.a(str));
    }

    public final byte[] zzb() {
        if (Arrays.equals(((q9) this.f7705a).a(), aa.f4391f)) {
            return aa.f4387b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    public s() {
        this.f7705a = new i0.a();
    }
}
