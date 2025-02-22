package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.activity.j;
import androidx.lifecycle.a0;
import androidx.lifecycle.j;

public final class y implements p {
    public static final y E = new y();
    public final q B = new q(this);
    public final j C = new j(this, 3);
    public final b D = new b(this);

    /* renamed from: a  reason: collision with root package name */
    public int f2325a;

    /* renamed from: b  reason: collision with root package name */
    public int f2326b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2327c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2328d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f2329e;

    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            sf.j.f(activity, "activity");
            sf.j.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b implements a0.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f2330a;

        public b(y yVar) {
            this.f2330a = yVar;
        }

        public final void a() {
            y yVar = this.f2330a;
            int i8 = yVar.f2325a + 1;
            yVar.f2325a = i8;
            if (i8 == 1 && yVar.f2328d) {
                yVar.B.f(j.a.ON_START);
                yVar.f2328d = false;
            }
        }

        public final void b() {
        }

        public final void c() {
            this.f2330a.a();
        }
    }

    public final void a() {
        int i8 = this.f2326b + 1;
        this.f2326b = i8;
        if (i8 != 1) {
            return;
        }
        if (this.f2327c) {
            this.B.f(j.a.ON_RESUME);
            this.f2327c = false;
            return;
        }
        Handler handler = this.f2329e;
        sf.j.c(handler);
        handler.removeCallbacks(this.C);
    }

    public final j b() {
        return this.B;
    }
}
