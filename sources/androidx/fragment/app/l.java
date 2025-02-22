package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.d1;
import androidx.fragment.app.m;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.c f2018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1.b f2019b;

    public l(m.c cVar, d1.b bVar) {
        this.f2018a = cVar;
        this.f2019b = bVar;
    }

    public final void run() {
        this.f2018a.a();
        if (i0.J(2)) {
            Log.v("FragmentManager", "Transition for operation " + this.f2019b + "has completed");
        }
    }
}
