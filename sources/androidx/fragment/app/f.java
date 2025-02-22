package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.d1;
import y1.e;

public final class f implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1.b f1950b;

    public f(Animator animator, d1.b bVar) {
        this.f1949a = animator;
        this.f1950b = bVar;
    }

    public final void onCancel() {
        this.f1949a.end();
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f1950b + " has been canceled.");
        }
    }
}
