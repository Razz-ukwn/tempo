package k6;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j0.f;
import k6.s;
import wa.x;

public final /* synthetic */ class l implements s.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f10313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10314b;

    public /* synthetic */ l(Object obj, Object obj2) {
        this.f10313a = obj;
        this.f10314b = obj2;
    }

    public final Object apply(Object obj) {
        s sVar = (s) this.f10313a;
        sVar.getClass();
        Long q10 = s.q((SQLiteDatabase) obj, (d6.s) this.f10314b);
        if (q10 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) s.D(sVar.p().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{q10.toString()}), new f(5));
    }

    public final Object then(Task task) {
        x xVar = (x) this.f10313a;
        String str = (String) this.f10314b;
        synchronized (xVar) {
            xVar.f16655b.remove(str);
        }
        return task;
    }
}
