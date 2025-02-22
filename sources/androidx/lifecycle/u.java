package androidx.lifecycle;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.platform.j3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.b;
import com.google.android.gms.internal.p000firebaseauthapi.bh;
import com.google.android.gms.internal.p000firebaseauthapi.ch;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import com.google.android.gms.internal.p000firebaseauthapi.m;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.mh;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.p;
import com.google.android.gms.internal.p000firebaseauthapi.th;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.x;
import com.google.android.gms.internal.p000firebaseauthapi.x0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import e9.i;
import ea.e;
import f9.c;
import java.io.File;
import java.io.FileInputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONObject;
import p4.d;
import r9.g0;
import s9.d0;
import s9.j;
import u6.q;
import x9.a;
import z9.f;

public final class u implements d, m, bh, w, Continuation, c, a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2323a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2324b;

    public u(j3 j3Var) {
        this.f2323a = 7;
        this.f2324b = j3Var;
    }

    public static void i(u uVar, x0 x0Var, j3 j3Var, w wVar) {
        if (x0Var.f5057a || !TextUtils.isEmpty(x0Var.H)) {
            q1.a aVar = new q1.a(x0Var.f5057a ? new Status(17012, (String) null) : j.a(x0Var.H), x0Var.a(), x0Var.f5061e, x0Var.J);
            j3Var.getClass();
            try {
                ((b) j3Var.f1338a).g(aVar);
            } catch (RemoteException e10) {
                ((x6.a) j3Var.f1339b).b("RemoteException when sending failure result with credential", e10, new Object[0]);
            }
        } else {
            uVar.g(new m0(x0Var.f5059c, x0Var.f5058b, Long.valueOf(x0Var.f5060d), "Bearer"), x0Var.C, x0Var.B, Boolean.valueOf(x0Var.D), x0Var.a(), j3Var, wVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ all -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[SYNTHETIC, Splitter:B:23:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[SYNTHETIC, Splitter:B:29:0x0057] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r5, java.io.File r6, p4.h r7) {
        /*
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.lang.Object r0 = r4.f2324b
            s4.b r0 = (s4.b) r0
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.c(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003a }
            r3.<init>(r6)     // Catch:{ IOException -> 0x003a }
        L_0x0019:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r2 = -1
            if (r6 == r2) goto L_0x0024
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            goto L_0x0019
        L_0x0024:
            r3.close()     // Catch:{ IOException -> 0x0035, all -> 0x0033 }
            r3.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            java.lang.Object r5 = r4.f2324b
            s4.b r5 = (s4.b) r5
            r5.put(r0)
            r1 = 1
            goto L_0x0053
        L_0x0033:
            r5 = move-exception
            goto L_0x0055
        L_0x0035:
            r5 = move-exception
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r5 = move-exception
            goto L_0x0054
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0038 }
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            java.lang.Object r5 = r4.f2324b
            s4.b r5 = (s4.b) r5
            r5.put(r0)
        L_0x0053:
            return r1
        L_0x0054:
            r3 = r2
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            r3.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            java.lang.Object r6 = r4.f2324b
            s4.b r6 = (s4.b) r6
            r6.put(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.u.a(java.lang.Object, java.io.File, p4.h):boolean");
    }

    public final JSONObject b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", (Throwable) null);
        }
        try {
            File file = (File) this.f2324b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(f.l(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e10) {
                    e = e10;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        f.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        f.a(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", (Throwable) null);
                }
                jSONObject = null;
            }
            f.a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
            Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
            f.a(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            f.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final void c(Bundle bundle) {
        ((o9.a) this.f2324b).b("clx", "_ae", bundle);
    }

    public final void d(n nVar) {
        m0 m0Var = (m0) nVar;
        j3 j3Var = (j3) this.f2324b;
        j3Var.getClass();
        try {
            ((b) j3Var.f1338a).a(m0Var);
        } catch (RemoteException e10) {
            ((x6.a) j3Var.f1339b).b("RemoteException when sending token result.", e10, new Object[0]);
        }
    }

    public final void f(String str, w wVar) {
        q.f(str);
        m0 w10 = m0.w(str);
        if (w10.y()) {
            wVar.d(w10);
            return;
        }
        ((x) this.f2324b).c(new j3(w10.f4723a), new r3.u(wVar, 0));
    }

    public final void g(m0 m0Var, String str, String str2, Boolean bool, g0 g0Var, j3 j3Var, w wVar) {
        q.i(wVar);
        q.i(j3Var);
        m0 m0Var2 = m0Var;
        ((x) this.f2324b).d(new u(m0Var2.f4724b), new th(j3Var, wVar, m0Var2, g0Var, bool, str2, str));
    }

    public final Object then(Task task) {
        switch (this.f2323a) {
            case 9:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2324b;
                com.google.android.gms.common.api.a aVar = k7.d.f10357k;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult((Location) task.getResult());
                    return null;
                }
                Exception exception = task.getException();
                exception.getClass();
                taskCompletionSource.trySetException(exception);
                return null;
            default:
                d0 d0Var = GenericIdpActivity.X;
                Uri.Builder buildUpon = ((Uri) this.f2324b).buildUpon();
                if (task.isSuccessful()) {
                    mh mhVar = (mh) task.getResult();
                    if (mhVar.a() != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(mhVar.a())));
                    }
                    buildUpon.fragment("fac=".concat(String.valueOf(mhVar.b())));
                } else {
                    Log.e("GenericIdpActivity", "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage())));
                }
                return buildUpon.build();
        }
    }

    public final Object zza() {
        Context context = (Context) ((e9.f) ((c) this.f2324b)).f7882a.f2324b;
        if (context != null) {
            return new i(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ u(dh dhVar) {
        this.f2323a = 6;
        this.f2324b = dhVar;
    }

    public /* synthetic */ u(Object obj, int i8) {
        this.f2323a = i8;
        this.f2324b = obj;
    }

    public u(p pVar) {
        this.f2323a = 8;
        this.f2324b = pVar;
    }

    public u(String str) {
        this.f2323a = 2;
        q.f(str);
        this.f2324b = str;
    }

    public u() {
        this.f2323a = 3;
        this.f2324b = new ArrayList();
    }

    public final Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ch chVar = ch.f4470b;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 3; i8++) {
            Provider provider = Security.getProvider(strArr[i8]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((dh) this.f2324b).b(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public u(int i8) {
        this.f2323a = i8;
        if (i8 == 5) {
            this.f2324b = new HashMap();
        } else if (i8 != 16) {
            this.f2324b = new HashMap();
        } else {
            this.f2324b = new LinkedHashSet();
        }
    }

    public u(e eVar) {
        this.f2323a = 14;
        this.f2324b = new File(eVar.f7904b, "com.crashlytics.settings.json");
    }

    /* renamed from: zza  reason: collision with other method in class */
    public final String m10zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", (String) this.f2324b);
        return jSONObject.toString();
    }

    /* renamed from: zza  reason: collision with other method in class */
    public final void m11zza(String str) {
        ((j3) this.f2324b).i(j.a(str));
    }
}
