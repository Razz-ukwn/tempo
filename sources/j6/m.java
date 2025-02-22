package j6;

import android.database.Cursor;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.u;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import d2.j1;
import d2.z;
import e2.d;
import g6.c;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import k6.s;
import l6.b;
import nc.e1;
import qa.a;
import rf.l;
import sf.j;
import z9.j0;

public final /* synthetic */ class m implements b.a, s.a, d, a.C0253a, Continuation, OnSuccessListener, z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9834a;

    public /* synthetic */ m(Object obj) {
        this.f9834a = obj;
    }

    public final j1 a(View view, j1 j1Var) {
        ProfileFragment profileFragment = (ProfileFragment) this.f9834a;
        int i8 = ProfileFragment.I0;
        j.f(profileFragment, "this$0");
        j.f(view, "v");
        j1.k kVar = j1Var.f7237a;
        boolean o10 = kVar.o(8);
        int i10 = kVar.f(8).f16124d;
        e1 e1Var = profileFragment.A0;
        if (e1Var != null) {
            ConstraintLayout constraintLayout = e1Var.V;
            if (o10) {
                constraintLayout.setPadding(0, 0, 0, i10);
            } else {
                constraintLayout.setPadding(0, 0, 0, 30);
            }
        }
        return j1Var;
    }

    public final Object apply(Object obj) {
        s sVar = (s) this.f9834a;
        Cursor cursor = (Cursor) obj;
        a6.b bVar = s.B;
        sVar.getClass();
        while (cursor.moveToNext()) {
            int i8 = cursor.getInt(0);
            sVar.c((long) i8, c.a.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final Object b() {
        return ((k6.c) this.f9834a).j();
    }

    public final void d(qa.b bVar) {
        v9.a aVar = (v9.a) this.f9834a;
        aVar.getClass();
        cb.d dVar = cb.d.f3892c;
        dVar.w("AnalyticsConnector now available.");
        o9.a aVar2 = (o9.a) bVar.get();
        u uVar = new u(aVar2, 13);
        v9.b bVar2 = new v9.b();
        o9.b a10 = aVar2.a("clx", bVar2);
        if (a10 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", (Throwable) null);
            }
            o9.b a11 = aVar2.a("crash", bVar2);
            if (a11 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", (Throwable) null);
            }
            a10 = a11;
        }
        if (a10 != null) {
            dVar.w("Registered Firebase Analytics listener.");
            r3.u uVar2 = new r3.u();
            x9.c cVar = new x9.c(uVar, TimeUnit.MILLISECONDS);
            synchronized (aVar) {
                Iterator it = aVar.f16342c.iterator();
                while (it.hasNext()) {
                    uVar2.a((y9.a) it.next());
                }
                bVar2.f16344b = uVar2;
                bVar2.f16343a = cVar;
                aVar.f16341b = uVar2;
                aVar.f16340a = cVar;
            }
            return;
        }
        dVar.k0("Could not register Firebase Analytics listener; a listener is already registered.", (Exception) null);
    }

    public final void onSuccess(Object obj) {
        l lVar = (l) this.f9834a;
        int i8 = MainActivity.f6650h0;
        j.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9834a;
        ExecutorService executorService = j0.f17848a;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        } else if (task.getException() == null) {
            return null;
        } else {
            taskCompletionSource.trySetException(task.getException());
            return null;
        }
    }
}
