package j0;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import bh.a;
import cd.u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.quickkonnect.silencio.models.request.auth.RegisterWithGoogleRequestModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import com.quickkonnect.silencio.ui.auth.register.RegisterViewModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import g6.c;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import jf.f;
import k6.d;
import k6.s;
import l6.b;
import rf.l;
import sf.e;
import sf.j;
import wa.i0;
import wa.j0;
import z9.g;
import z9.r;
import zd.h;
import zf.n;

public final /* synthetic */ class p implements j, b.a, s.a, Continuation, OnCompleteListener, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9713b;

    public /* synthetic */ p(Object obj, int i8) {
        this.f9712a = i8;
        this.f9713b = obj;
    }

    public final Object apply(Object obj) {
        s sVar = (s) this.f9713b;
        Cursor cursor = (Cursor) obj;
        a6.b bVar = s.B;
        sVar.getClass();
        while (cursor.moveToNext()) {
            int i8 = cursor.getInt(0);
            sVar.c((long) i8, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public final Object b() {
        return Integer.valueOf(((d) this.f9713b).g());
    }

    public final double e(double d10) {
        v vVar = (v) this.f9713b;
        j.f(vVar, "$function");
        double d11 = vVar.f9735e;
        double d12 = vVar.f9734d;
        return d10 >= d11 * d12 ? (Math.pow(d10, 1.0d / vVar.f9731a) - vVar.f9733c) / vVar.f9732b : d10 / d12;
    }

    public final void onComplete(Task task) {
        String str;
        Task task2 = task;
        int i8 = this.f9712a;
        Object obj = this.f9713b;
        switch (i8) {
            case 7:
                int i10 = i0.f16611b;
                ((j0.a) obj).f16620b.trySetResult(null);
                return;
            case 8:
                RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) obj;
                int i11 = RegisterBottomSheet.X0;
                j.f(registerBottomSheet, "this$0");
                j.f(task2, "it");
                if (task.isSuccessful()) {
                    String a10 = h.a("FIRE_BASE_TOKEN");
                    registerBottomSheet.W0 = task2;
                    androidx.appcompat.app.b bVar = registerBottomSheet.V0;
                    if (bVar != null) {
                        bVar.show();
                        RegisterViewModel v02 = registerBottomSheet.v0();
                        String str2 = ((GoogleSignInAccount) task.getResult()).G;
                        String str3 = ((GoogleSignInAccount) task.getResult()).H;
                        String str4 = ((GoogleSignInAccount) task.getResult()).f4150d;
                        String str5 = ((GoogleSignInAccount) task.getResult()).f4150d;
                        if (str5 == null || (str = (String) n.S0(str5, new String[]{"@"}).get(0)) == null) {
                            str = "";
                        }
                        RegisterWithGoogleRequestModel registerWithGoogleRequestModel = new RegisterWithGoogleRequestModel(str2, str3, "google", str4, str, registerBottomSheet.u0().f3989a.getReferreId(), a10, (String) null, 128, (e) null);
                        v02.getClass();
                        cb.b.D(gc.b.o(v02), (f.b) null, 0, new u(v02, registerWithGoogleRequestModel, (jf.d<? super u>) null), 3);
                        return;
                    }
                    j.l("loadingAlert");
                    throw null;
                }
                zd.d.d(registerBottomSheet, "Registration Failed", "Something went wrong", "Ok", (String) null, false, cd.b.f3968a, cd.c.f3969a);
                Exception exception = task.getException();
                if (exception != null) {
                    exception.printStackTrace();
                }
                Exception exception2 = task.getException();
                if (exception2 != null) {
                    v9.e eVar = (v9.e) m9.f.d().b(v9.e.class);
                    if (eVar != null) {
                        z9.p pVar = eVar.f16349a.f17901g;
                        Thread currentThread = Thread.currentThread();
                        pVar.getClass();
                        r rVar = new r(pVar, System.currentTimeMillis(), exception2, currentThread);
                        g gVar = pVar.f17866d;
                        gVar.getClass();
                        gVar.a(new z9.h(rVar));
                        return;
                    }
                    throw new NullPointerException("FirebaseCrashlytics component is not present.");
                }
                return;
            default:
                rf.p pVar2 = (rf.p) obj;
                j.f(pVar2, "$callback");
                j.f(task2, "task");
                if (!task.isSuccessful()) {
                    a.f3654a.b("Fetching FCM registration token failed", task.getException());
                    return;
                }
                String str6 = (String) task.getResult();
                a.f3654a.a(t.a("fcm token===", str6), new Object[0]);
                String a11 = h.a("FIRE_BASE_TOKEN");
                if (!j.a(a11, str6)) {
                    j.e(str6, "token");
                    pVar2.invoke(a11, str6);
                } else {
                    j.e(str6, "token");
                    pVar2.invoke(str6, str6);
                }
                h.c("FIRE_BASE_TOKEN", str6);
                return;
        }
    }

    public final void onSuccess(Object obj) {
        l lVar = (l) this.f9713b;
        int i8 = MeasuringBottomSheet.f6988h1;
        j.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public final Object then(Task task) {
        int i8 = this.f9712a;
        Object obj = this.f9713b;
        switch (i8) {
            case 4:
                ExecutorService executorService = z9.j0.f17848a;
                ((CountDownLatch) obj).countDown();
                return null;
            default:
                ((wa.p) obj).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    } else if (string2 != null) {
                        throw new IOException(string2);
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
        }
    }
}
