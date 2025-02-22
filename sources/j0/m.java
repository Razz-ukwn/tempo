package j0;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.quickkonnect.silencio.models.request.auth.LoginWithGoogleRequestModel;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;
import d2.f1;
import j6.p;
import java.util.concurrent.ScheduledFuture;
import jf.d;
import jf.f;
import k6.s;
import l6.b;
import sf.e;
import sf.j;
import wa.f0;
import xc.o;
import y9.a;
import y9.c;
import zd.h;

public final /* synthetic */ class m implements j, b.a, s.a, y9.b, OnSuccessListener, OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9708b;

    public /* synthetic */ m(Object obj, int i8) {
        this.f9707a = i8;
        this.f9708b = obj;
    }

    public final void a(a aVar) {
        v9.a aVar2 = (v9.a) this.f9708b;
        synchronized (aVar2) {
            if (aVar2.f16341b instanceof c) {
                aVar2.f16342c.add(aVar);
            }
            aVar2.f16341b.a(aVar);
        }
    }

    public final Object apply(Object obj) {
        s sVar = (s) this.f9708b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        a6.b bVar = s.B;
        sVar.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sVar.f10330b.a()).execute();
        return null;
    }

    public final Object b() {
        p pVar = (p) this.f9708b;
        for (d6.s b10 : pVar.f9854b.A()) {
            pVar.f9855c.b(b10, 1);
        }
        return null;
    }

    public final double e(double d10) {
        int i8 = this.f9707a;
        Object obj = this.f9708b;
        switch (i8) {
            case 0:
                u uVar = (u) obj;
                j.f(uVar, "this$0");
                return f1.o(uVar.f9725k.e(d10), (double) uVar.f9719e, (double) uVar.f9720f);
            default:
                v vVar = (v) obj;
                j.f(vVar, "$function");
                return d10 >= vVar.f9735e ? Math.pow((vVar.f9732b * d10) + vVar.f9733c, vVar.f9731a) : d10 * vVar.f9734d;
        }
    }

    public final void onComplete(Task task) {
        int i8 = this.f9707a;
        Object obj = this.f9708b;
        switch (i8) {
            case 7:
                ((ScheduledFuture) obj).cancel(false);
                return;
            default:
                LoginBottomSheet loginBottomSheet = (LoginBottomSheet) obj;
                int i10 = LoginBottomSheet.W0;
                j.f(loginBottomSheet, "this$0");
                j.f(task, "it");
                if (task.isSuccessful()) {
                    String a10 = h.a("FIRE_BASE_TOKEN");
                    LoginViewModel u02 = loginBottomSheet.u0();
                    LoginWithGoogleRequestModel loginWithGoogleRequestModel = new LoginWithGoogleRequestModel(((GoogleSignInAccount) task.getResult()).f4150d, "google", a10, (String) null, 8, (e) null);
                    u02.getClass();
                    cb.b.D(gc.b.o(u02), (f.b) null, 0, new o(u02, loginWithGoogleRequestModel, (d<? super o>) null), 3);
                    return;
                }
                Exception exception = task.getException();
                if (exception != null) {
                    exception.printStackTrace();
                }
                zd.d.d(loginBottomSheet, "Login Failed", "Something went wrong", "Ok", (String) null, false, xc.b.f17034a, xc.c.f17035a);
                return;
        }
    }

    public final void onSuccess(Object obj) {
        boolean booleanValue;
        boolean z10;
        f0 f0Var = (f0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.m;
        FirebaseMessaging.a aVar2 = ((FirebaseMessaging) this.f9708b).f6337g;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f6344c;
            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f6331a.j();
        }
        if (booleanValue) {
            if (f0Var.f16589h.a() != null) {
                synchronized (f0Var) {
                    z10 = f0Var.f16588g;
                }
                if (!z10) {
                    f0Var.f(0);
                }
            }
        }
    }
}
