package jc;

import android.app.Application;
import com.quickkonnect.silencio.MyApplication;
import dagger.hilt.android.internal.managers.d;
import dagger.hilt.android.internal.managers.e;
import he.b;

public abstract class l extends Application implements b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9955a = false;

    /* renamed from: b  reason: collision with root package name */
    public final d f9956b = new d(new a());

    public class a implements e {
        public a() {
        }
    }

    public final Object g() {
        return this.f9956b.g();
    }

    public void onCreate() {
        if (!this.f9955a) {
            this.f9955a = true;
            MyApplication myApplication = (MyApplication) this;
            ((a0) g()).b();
        }
        super.onCreate();
    }
}
