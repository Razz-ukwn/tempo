package d2;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f7189a;

    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(m mVar) {
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.f7189a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f7189a = aVar;
    }
}
