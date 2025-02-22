package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import cb.d;
import he.b;

public final class a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile jc.b f7393a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7394b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Activity f7395c;

    /* renamed from: d  reason: collision with root package name */
    public final c f7396d;

    /* renamed from: dagger.hilt.android.internal.managers.a$a  reason: collision with other inner class name */
    public interface C0116a {
        jc.a b();
    }

    public a(Activity activity) {
        this.f7395c = activity;
        this.f7396d = new c((ComponentActivity) activity);
    }

    public final Object a() {
        Activity activity = this.f7395c;
        if (!(activity.getApplication() instanceof b)) {
            if (Application.class.equals(activity.getApplication().getClass())) {
                throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
            }
            throw new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + activity.getApplication().getClass());
        }
        jc.a b10 = ((C0116a) d.E(C0116a.class, this.f7396d)).b();
        b10.getClass();
        b10.getClass();
        return new jc.b(b10.f9897a, b10.f9898b);
    }

    public final Object g() {
        if (this.f7393a == null) {
            synchronized (this.f7394b) {
                if (this.f7393a == null) {
                    this.f7393a = (jc.b) a();
                }
            }
        }
        return this.f7393a;
    }
}
