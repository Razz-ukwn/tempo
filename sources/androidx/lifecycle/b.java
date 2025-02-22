package androidx.lifecycle;

import android.app.Application;
import sf.j;

public class b extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final Application f2240d;

    public b(Application application) {
        j.f(application, "application");
        this.f2240d = application;
    }

    public final <T extends Application> T e() {
        T t2 = this.f2240d;
        j.d(t2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t2;
    }
}
