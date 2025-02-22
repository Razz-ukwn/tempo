package androidx.compose.ui.platform;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.p000firebaseauthapi.a9;
import com.google.android.gms.internal.p000firebaseauthapi.b;
import com.google.android.gms.internal.p000firebaseauthapi.b9;
import com.google.android.gms.internal.p000firebaseauthapi.i5;
import com.google.android.gms.internal.p000firebaseauthapi.j5;
import com.google.android.gms.internal.p000firebaseauthapi.m;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.qh;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.z0;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import e.s;
import f9.c;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k7.f;
import k7.g;
import k7.i;
import k7.n0;
import k7.r;
import org.json.JSONObject;
import p4.h;
import p4.k;
import r9.g0;
import s9.j;
import t.x2;
import t1.a;
import u6.q;
import y4.d;

public final class j3 implements k, m, w, n, OnTokenCanceledListener, c, OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public Object f1338a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1339b;

    public /* synthetic */ j3() {
        this.f1338a = null;
        this.f1339b = a9.f4384d;
    }

    public /* synthetic */ j3(i5 i5Var) {
        this.f1338a = i5Var;
        this.f1339b = null;
    }

    public /* synthetic */ j3(j5 j5Var) {
        this.f1338a = null;
        this.f1339b = j5Var;
    }

    public /* synthetic */ j3(Object obj, Object obj2) {
        this.f1338a = obj;
        this.f1339b = obj2;
    }

    public final boolean a(Object obj, File file, h hVar) {
        return ((k) this.f1339b).a(new d(((BitmapDrawable) ((r4.w) obj).get()).getBitmap(), (s4.c) this.f1338a), file, hVar);
    }

    public final o b(j1.c cVar, o oVar) {
        f4.c(cVar);
        if (!(oVar instanceof p)) {
            return oVar;
        }
        p pVar = (p) oVar;
        ArrayList arrayList = pVar.f5458b;
        String str = pVar.f5457a;
        return (((Map) this.f1338a).containsKey(str) ? (v) ((Map) this.f1338a).get(str) : (x) this.f1339b).a(str, cVar, arrayList);
    }

    public final void c(a.e eVar, Object obj) {
        n7.a aVar = (n7.a) this.f1338a;
        CancellationToken cancellationToken = (CancellationToken) this.f1339b;
        r rVar = (r) eVar;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
        a aVar2 = k7.d.f10357k;
        rVar.getClass();
        if (rVar.G(n7.h.f11609a)) {
            u6.k l10 = ((n0) rVar.x()).l(aVar, new i(taskCompletionSource));
            if (cancellationToken != null) {
                cancellationToken.onCanceledRequested(new s((Object) l10));
                return;
            }
            return;
        }
        com.google.android.gms.common.api.internal.i iVar = new com.google.android.gms.common.api.internal.i(new f(rVar, taskCompletionSource));
        i.a aVar3 = iVar.f4275c;
        aVar3.getClass();
        g gVar = new g(iVar, taskCompletionSource);
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        LocationRequest.a aVar4 = new LocationRequest.a(aVar.f11601c, 0);
        aVar4.c(0);
        long j10 = aVar.f11602d;
        q.b(j10 > 0, "durationMillis must be greater than 0");
        aVar4.f5649e = j10;
        aVar4.b(aVar.f11600b);
        long j11 = aVar.f11599a;
        q.b(j11 == -1 || j11 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
        aVar4.f5653i = j11;
        aVar4.m = aVar.f11603e;
        aVar4.d(aVar.B);
        aVar4.f5652h = true;
        String str = aVar.C;
        if (Build.VERSION.SDK_INT < 30) {
            aVar4.f5656l = str;
        }
        aVar4.f5657n = aVar.D;
        rVar.H(gVar, aVar4.a(), taskCompletionSource2);
        taskCompletionSource2.getTask().addOnCompleteListener(new x2(taskCompletionSource, 6));
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new j3((Object) rVar, (Object) aVar3));
        }
    }

    public final void d(com.google.android.gms.internal.p000firebaseauthapi.n nVar) {
        z0 z0Var = (z0) nVar;
        if (!TextUtils.isEmpty(z0Var.f5118e)) {
            ((j3) this.f1338a).h(new qh(z0Var.f5118e, z0Var.f5117d, (g0) null));
            return;
        }
        m0 m0Var = new m0(z0Var.f5115b, z0Var.f5114a, Long.valueOf(z0Var.f5116c), "Bearer");
        Boolean bool = Boolean.FALSE;
        ((u) this.f1339b).g(m0Var, (String) null, (String) null, bool, (g0) null, (j3) this.f1338a, this);
    }

    public final p4.c e(h hVar) {
        return ((k) this.f1339b).e(hVar);
    }

    public final void f(v vVar) {
        Iterator it = vVar.f5552a.iterator();
        while (it.hasNext()) {
            ((Map) this.f1338a).put(Integer.valueOf(((d0) it.next()).f5243a).toString(), vVar);
        }
    }

    public final b9 g() {
        Integer num = (Integer) this.f1338a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (((a9) this.f1339b) != null) {
            return new b9(num.intValue(), (a9) this.f1339b);
        } else {
            throw new GeneralSecurityException("Variant is not set");
        }
    }

    public final void h(qh qhVar) {
        try {
            ((b) this.f1338a).b(qhVar);
        } catch (RemoteException e10) {
            ((x6.a) this.f1339b).b("RemoteException when sending failure result for mfa", e10, new Object[0]);
        }
    }

    public final void i(Status status) {
        try {
            ((b) this.f1338a).c(status);
        } catch (RemoteException e10) {
            ((x6.a) this.f1339b).b("RemoteException when sending failure result.", e10, new Object[0]);
        }
    }

    public final void onCanceled() {
        try {
            ((r) this.f1338a).F((i.a) this.f1339b, true, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }

    public final void onComplete(Task task) {
        GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f1338a;
        String str = (String) this.f1339b;
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                intent.putExtra("com.android.browser.application_id", str);
                Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                genericIdpActivity.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                s1.i.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                intent2.putExtras(bundle);
            }
            intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent2.putExtras(new Bundle());
            intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            intent2.setData((Uri) task.getResult());
            Object obj = t1.a.f15323a;
            a.C0282a.b(genericIdpActivity, intent2, (Bundle) null);
            return;
        }
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        genericIdpActivity.f((Status) null);
    }

    public final Object zza() {
        Context context = (Context) ((e9.f) ((c) this.f1338a)).f7882a.f2324b;
        if (context != null) {
            return new e9.h(context, (e9.i) ((c) this.f1339b).zza());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ j3(Object obj, Object obj2, int i8) {
        this.f1339b = obj;
        this.f1338a = obj2;
    }

    public /* synthetic */ j3(com.google.android.gms.internal.p000firebaseauthapi.s sVar, x6.a aVar) {
        q.i(sVar);
        this.f1338a = sVar;
        q.i(aVar);
        this.f1339b = aVar;
    }

    public j3(String str) {
        this.f1338a = "refresh_token";
        q.f(str);
        this.f1339b = str;
    }

    public j3(int i8) {
        if (i8 == 2) {
            this.f1338a = new AtomicReference();
            this.f1339b = new o.a();
        } else if (i8 != 11) {
            this.f1338a = new u.d(new Reference[16]);
            this.f1339b = new ReferenceQueue();
        } else {
            this.f1338a = new HashMap();
            this.f1339b = new x(1);
            f(new com.google.android.gms.internal.measurement.u());
            f(new com.google.android.gms.internal.measurement.w(0));
            f(new x(0));
            f(new com.google.android.gms.internal.measurement.w(1));
            f(new b0());
            f(new com.google.android.gms.internal.measurement.w(2));
            f(new c0());
        }
    }

    /* renamed from: zza  reason: collision with other method in class */
    public final String m0zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", (String) this.f1338a);
        jSONObject.put("refreshToken", (String) this.f1339b);
        return jSONObject.toString();
    }

    public final void zza(String str) {
        ((j3) this.f1338a).i(j.a(str));
    }
}
