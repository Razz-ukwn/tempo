package wa;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.appcompat.widget.l;
import androidx.compose.ui.platform.b3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g3.d;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import m9.f;
import oa.h;
import qa.b;
import ra.j;
import s6.c;
import s6.t;
import s6.u;
import s6.v;
import s6.x;
import ya.g;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final f f16632a;

    /* renamed from: b  reason: collision with root package name */
    public final s f16633b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16634c;

    /* renamed from: d  reason: collision with root package name */
    public final b<g> f16635d;

    /* renamed from: e  reason: collision with root package name */
    public final b<h> f16636e;

    /* renamed from: f  reason: collision with root package name */
    public final ra.f f16637f;

    public p(f fVar, s sVar, b<g> bVar, b<h> bVar2, ra.f fVar2) {
        fVar.a();
        c cVar = new c(fVar.f11331a);
        this.f16632a = fVar;
        this.f16633b = sVar;
        this.f16634c = cVar;
        this.f16635d = bVar;
        this.f16636e = bVar2;
        this.f16637f = fVar2;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new d(1), new j0.p(this, 6));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i8;
        String str3;
        String str4;
        String str5;
        int b10;
        PackageInfo b11;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        f fVar = this.f16632a;
        fVar.a();
        bundle.putString("gmp_app_id", fVar.f11333c.f11344b);
        s sVar = this.f16633b;
        synchronized (sVar) {
            if (sVar.f16644d == 0 && (b11 = sVar.b("com.google.android.gms")) != null) {
                sVar.f16644d = b11.versionCode;
            }
            i8 = sVar.f16644d;
        }
        bundle.putString("gmsv", Integer.toString(i8));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        s sVar2 = this.f16633b;
        synchronized (sVar2) {
            if (sVar2.f16642b == null) {
                sVar2.d();
            }
            str3 = sVar2.f16642b;
        }
        bundle.putString("app_ver", str3);
        s sVar3 = this.f16633b;
        synchronized (sVar3) {
            if (sVar3.f16643c == null) {
                sVar3.d();
            }
            str4 = sVar3.f16643c;
        }
        bundle.putString("app_ver_name", str4);
        f fVar2 = this.f16632a;
        fVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fVar2.f11332b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a10 = ((j) Tasks.await(this.f16637f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f16637f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        h hVar = this.f16636e.get();
        g gVar = this.f16635d.get();
        if (hVar != null && gVar != null && (b10 = hVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(q.g.c(b10)));
            bundle.putString("Firebase-Client", gVar.a());
        }
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        int i8;
        int i10;
        PackageInfo packageInfo;
        try {
            b(str, str2, bundle);
            c cVar = this.f16634c;
            v vVar = cVar.f14754c;
            synchronized (vVar) {
                if (vVar.f14794b == 0) {
                    try {
                        packageInfo = b7.c.a(vVar.f14793a).b(0, "com.google.android.gms");
                    } catch (PackageManager.NameNotFoundException e10) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                        sb2.append("Failed to find package ");
                        sb2.append(valueOf);
                        Log.w("Metadata", sb2.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        vVar.f14794b = packageInfo.versionCode;
                    }
                }
                i8 = vVar.f14794b;
            }
            if (i8 < 12000000) {
                return cVar.f14754c.a() != 0 ? cVar.a(bundle).continueWithTask(x.f14798a, new l(2, (Object) cVar, (Object) bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            u h3 = u.h(cVar.f14753b);
            synchronized (h3) {
                i10 = h3.f14789a;
                h3.f14789a = i10 + 1;
            }
            return h3.i(new t(i10, bundle)).continueWith(x.f14798a, b3.H);
        } catch (InterruptedException | ExecutionException e11) {
            return Tasks.forException(e11);
        }
    }
}
