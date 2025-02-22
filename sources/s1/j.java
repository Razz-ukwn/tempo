package s1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a0;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import d2.o;
import o.f;

public class j extends Activity implements p, o.a {

    /* renamed from: a  reason: collision with root package name */
    public final q f14494a = new q(this);

    public j() {
        new f();
    }

    public androidx.lifecycle.j b() {
        return this.f14494a;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o.a(decorView, keyEvent)) {
            return o.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i8 = a0.f2238b;
        a0.b.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        j.b bVar = j.b.f2279c;
        q qVar = this.f14494a;
        qVar.getClass();
        qVar.e("markState");
        qVar.h(bVar);
        super.onSaveInstanceState(bundle);
    }

    public final boolean y(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
