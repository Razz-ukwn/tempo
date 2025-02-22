package j6;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import k6.q;
import l6.b;
import wa.l;

public final /* synthetic */ class k implements b.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9830b;

    public /* synthetic */ k(Object obj, Object obj2) {
        this.f9829a = obj;
        this.f9830b = obj2;
    }

    public final Object b() {
        ((n) this.f9829a).f9837c.i((Iterable) this.f9830b);
        return null;
    }

    public final Object then(Task task) {
        Context context = (Context) this.f9829a;
        Intent intent = (Intent) this.f9830b;
        Object obj = l.f16623c;
        return ((Integer) task.getResult()).intValue() != 402 ? task : l.a(context, intent).continueWith(new j.b(2), new q(5));
    }
}
