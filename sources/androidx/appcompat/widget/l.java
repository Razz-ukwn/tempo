package androidx.appcompat.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.compose.ui.platform.j3;
import androidx.emoji2.text.f;
import androidx.lifecycle.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.p000firebaseauthapi.b;
import com.google.android.gms.internal.p000firebaseauthapi.b1;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.google.android.gms.internal.p000firebaseauthapi.lh;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.android.gms.internal.p000firebaseauthapi.n;
import com.google.android.gms.internal.p000firebaseauthapi.qh;
import com.google.android.gms.internal.p000firebaseauthapi.w;
import com.google.android.gms.internal.p000firebaseauthapi.w9;
import com.google.android.gms.internal.p000firebaseauthapi.x0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.quickkonnect.silencio.R;
import j1.c;
import j9.p;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q7.i6;
import r2.a;
import r2.e;
import r2.g;
import r9.g0;
import r9.r;
import s1.i;
import s6.h;
import s6.x;
import s9.j;
import t1.a;
import u6.q;

public final class l implements Continuation, OnCompleteListener, w9, w, a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1057a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1058b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1059c;

    public /* synthetic */ l(int i8, Object obj, Object obj2) {
        this.f1057a = i8;
        this.f1058b = obj;
        this.f1059c = obj2;
    }

    public final c a(o oVar) {
        ((c) this.f1058b).p((String) this.f1059c, oVar);
        return (c) this.f1058b;
    }

    public final KeyListener b(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((a) this.f1059c).f13768a.getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
    }

    public final String c(String str) {
        int identifier = ((Resources) this.f1058b).getIdentifier(str, "string", (String) this.f1059c);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f1058b).getString(identifier);
    }

    public final void d(n nVar) {
        int i8 = this.f1057a;
        Object obj = this.f1059c;
        switch (i8) {
            case 8:
                b1 b1Var = (b1) nVar;
                if (!TextUtils.isEmpty(b1Var.f4414e)) {
                    Status status = new Status(17025, (String) null);
                    j3 j3Var = (j3) ((f3.a) obj).f8048b;
                    r rVar = new r((String) null, (String) null, false, b1Var.B, true, b1Var.f4414e, (String) null);
                    j3Var.getClass();
                    try {
                        ((b) j3Var.f1338a).f(status, rVar);
                        return;
                    } catch (RemoteException e10) {
                        ((x6.a) j3Var.f1339b).b("RemoteException when sending failure result.", e10, new Object[0]);
                        return;
                    }
                } else {
                    m0 m0Var = new m0(b1Var.f4411b, b1Var.f4410a, Long.valueOf(b1Var.f4412c), "Bearer");
                    f3.a aVar = (f3.a) obj;
                    Boolean valueOf = Boolean.valueOf(b1Var.f4413d);
                    ((u) aVar.f8049c).g(m0Var, (String) null, "phone", valueOf, (g0) null, (j3) aVar.f8048b, (w) this.f1058b);
                    return;
                }
            default:
                x0 x0Var = (x0) nVar;
                if (!(!TextUtils.isEmpty(x0Var.L))) {
                    u.i((u) obj, x0Var, (j3) this.f1058b, this);
                    return;
                } else {
                    ((j3) this.f1058b).h(new qh(x0Var.L, x0Var.K, x0Var.a()));
                    return;
                }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e(AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1058b).getContext().obtainStyledAttributes(attributeSet, cb.e.F, i8, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            g(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection f(InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = (a) this.f1059c;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0258a aVar2 = aVar.f13768a;
        aVar2.getClass();
        return inputConnection instanceof r2.c ? inputConnection : new r2.c(aVar2.f13769a, inputConnection, editorInfo);
    }

    public final void g(boolean z10) {
        g gVar = ((a) this.f1059c).f13768a.f13770b;
        if (gVar.f13790d != z10) {
            if (gVar.f13789c != null) {
                f a10 = f.a();
                g.a aVar = gVar.f13789c;
                a10.getClass();
                b7.a.q(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f1824a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f1825b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f13790d = z10;
            if (z10) {
                g.a(gVar.f13787a, f.a().b());
            }
        }
    }

    public final void onComplete(Task task) {
        switch (this.f1057a) {
            case 3:
                ((s) this.f1059c).f4331b.remove((TaskCompletionSource) this.f1058b);
                return;
            case 12:
                p pVar = (p) this.f1058b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1059c;
                synchronized (pVar.f9887f) {
                    pVar.f9886e.remove(taskCompletionSource);
                }
                return;
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f1058b;
                String str = (String) this.f1059c;
                recaptchaActivity.getClass();
                if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
                    List<ResolveInfo> queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent.putExtra("com.android.browser.application_id", str);
                        intent.addFlags(1073741824);
                        intent.addFlags(268435456);
                        recaptchaActivity.startActivity(intent);
                        return;
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        i.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                        intent2.putExtras(bundle);
                    }
                    intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent2.putExtras(new Bundle());
                    intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(268435456);
                    intent2.setData((Uri) task.getResult());
                    Object obj = t1.a.f15323a;
                    a.C0282a.b(recaptchaActivity, intent2, (Bundle) null);
                    return;
                }
                Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                recaptchaActivity.f((Status) null);
                return;
        }
    }

    public final Object then(Task task) {
        s6.c cVar = (s6.c) this.f1058b;
        Bundle bundle = (Bundle) this.f1059c;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? task : cVar.a(bundle).onSuccessTask(x.f14798a, gf.K);
    }

    public final lh zza() {
        return (lh) this.f1058b;
    }

    public final void zza(String str) {
        switch (this.f1057a) {
            case 8:
                ((w) this.f1058b).zza(str);
                return;
            default:
                ((j3) this.f1058b).i(j.a(str));
                return;
        }
    }

    public final lh zzb() {
        return (lh) this.f1059c;
    }

    public l(IBinder iBinder) {
        String str;
        this.f1057a = 1;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f1058b = new Messenger(iBinder);
            this.f1059c = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f1059c = new h(iBinder);
            this.f1058b = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    public l(c1 c1Var, AlertDialog alertDialog) {
        this.f1057a = 4;
        this.f1059c = c1Var;
        this.f1058b = alertDialog;
    }

    public /* synthetic */ l(Object obj, Object obj2, int i8) {
        this.f1057a = i8;
        this.f1059c = obj;
        this.f1058b = obj2;
    }

    public l(String str) {
        this.f1057a = 7;
        this.f1058b = str;
        this.f1059c = "RECAPTCHA_ENTERPRISE";
    }

    public l(i6 i6Var) {
        this.f1057a = 11;
        this.f1059c = i6Var;
    }

    public l(Context context) {
        this.f1057a = 5;
        q.i(context);
        Resources resources = context.getResources();
        this.f1058b = resources;
        this.f1059c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public l(byte[] bArr, byte[] bArr2) {
        this.f1057a = 6;
        this.f1058b = lh.a(bArr);
        this.f1059c = lh.a(bArr2);
    }

    public l(EditText editText) {
        this.f1057a = 0;
        this.f1058b = editText;
        this.f1059c = new r2.a(editText);
    }
}
