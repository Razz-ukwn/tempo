package j0;

import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.quickkonnect.silencio.ui.tabs.map.MapFragment;
import j6.n;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import k6.s;
import l6.b;
import o8.g;
import qa.a;
import rf.l;
import sf.j;
import z9.j0;

public final /* synthetic */ class q implements j, g.b, b.a, s.a, a.C0253a, Continuation, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9714a;

    public /* synthetic */ q(Object obj) {
        this.f9714a = obj;
    }

    public final Object apply(Object obj) {
        Map map = (Map) this.f9714a;
        Cursor cursor = (Cursor) obj;
        a6.b bVar = s.B;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new s.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public final Object b() {
        ((n) this.f9714a).f9843i.e();
        return null;
    }

    public final void d(qa.b bVar) {
        w9.b bVar2 = (w9.b) this.f9714a;
        bVar2.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", (Throwable) null);
        }
        bVar2.f16532b.set((w9.a) bVar.get());
    }

    public final double e(double d10) {
        v vVar = (v) this.f9714a;
        j.f(vVar, "$function");
        double d11 = vVar.f9735e;
        double d12 = vVar.f9734d;
        return d10 >= d11 * d12 ? (Math.pow(d10 - vVar.f9736f, 1.0d / vVar.f9731a) - vVar.f9733c) / vVar.f9732b : (d10 - vVar.f9737g) / d12;
    }

    public final void onSuccess(Object obj) {
        l lVar = (l) this.f9714a;
        int i8 = MapFragment.B0;
        j.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f9714a;
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
