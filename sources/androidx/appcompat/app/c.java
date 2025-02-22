package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.p1;
import androidx.fragment.app.x;
import androidx.lifecycle.s0;
import b3.l0;
import b7.a;
import com.quickkonnect.silencio.R;
import e.b;
import e.d;
import e.e;
import e.f;
import e.r;
import s1.a;
import s1.c0;
import s1.l;
import sf.j;

public class c extends x implements d {
    public f U;

    public c() {
        this.f551e.f10968b.c("androidx:appcompat", new b(this));
        G(new e.c(this));
    }

    public final void D() {
    }

    public final void H() {
        s0.c(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        j.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        l0.d(getWindow().getDecorView(), this);
        a.B(getWindow().getDecorView(), this);
    }

    public final e K() {
        if (this.U == null) {
            r.a aVar = e.f7616a;
            this.U = new f(this, (Window) null, this, this);
        }
        return this.U;
    }

    public final e.a L() {
        return K().i();
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        K().c(view, layoutParams);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(K().d(context));
    }

    public final void closeOptionsMenu() {
        e.a L = L();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (L == null || !L.a()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        e.a L = L();
        if (keyCode != 82 || L == null || !L.k(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final <T extends View> T findViewById(int i8) {
        return K().e(i8);
    }

    public final MenuInflater getMenuInflater() {
        return K().h();
    }

    public final Resources getResources() {
        int i8 = p1.f1112a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        K().k();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K().m(configuration);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        K().o();
    }

    public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
        return super.onKeyDown(i8, keyEvent);
    }

    public final boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        e.a L = L();
        if (menuItem.getItemId() != 16908332 || L == null || (L.d() & 4) == 0) {
            return false;
        }
        Intent a10 = l.a(this);
        if (a10 == null) {
            return false;
        }
        if (l.a.c(this, a10)) {
            c0 c0Var = new c0(this);
            Intent a11 = l.a(this);
            if (a11 == null) {
                a11 = l.a(this);
            }
            if (a11 != null) {
                ComponentName component = a11.getComponent();
                if (component == null) {
                    component = a11.resolveActivity(c0Var.f14477b.getPackageManager());
                }
                c0Var.a(component);
                c0Var.f14476a.add(a11);
            }
            c0Var.b();
            try {
                int i10 = s1.a.f14472c;
                a.C0273a.a(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            l.a.b(this, a10);
            return true;
        }
    }

    public final boolean onMenuOpened(int i8, Menu menu) {
        return super.onMenuOpened(i8, menu);
    }

    public final void onPanelClosed(int i8, Menu menu) {
        super.onPanelClosed(i8, menu);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((f) K()).J();
    }

    public final void onPostResume() {
        super.onPostResume();
        K().p();
    }

    public void onStart() {
        super.onStart();
        K().q();
    }

    public void onStop() {
        super.onStop();
        K().r();
    }

    public final void onTitleChanged(CharSequence charSequence, int i8) {
        super.onTitleChanged(charSequence, i8);
        K().z(charSequence);
    }

    public final void openOptionsMenu() {
        e.a L = L();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (L == null || !L.l()) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i8) {
        H();
        K().u(i8);
    }

    public final void setTheme(int i8) {
        super.setTheme(i8);
        K().y(i8);
    }

    public final void t() {
    }

    public final void z() {
    }

    public void setContentView(View view) {
        H();
        K().v(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        K().w(view, layoutParams);
    }
}
