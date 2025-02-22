package e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l1;
import d2.d1;
import d2.i0;
import e.a;
import e.f;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class t extends a {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f7706a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f7707b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7708c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7709d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7710e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7711f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<a.b> f7712g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final a f7713h = new a();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            t tVar = t.this;
            Window.Callback callback = tVar.f7707b;
            Menu v3 = tVar.v();
            f fVar = v3 instanceof f ? (f) v3 : null;
            if (fVar != null) {
                fVar.y();
            }
            try {
                v3.clear();
                if (!callback.onCreatePanelMenu(0, v3) || !callback.onPreparePanel(0, (View) null, v3)) {
                    v3.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.x();
                }
            }
        }
    }

    public class b implements Toolbar.h {
        public b() {
        }
    }

    public final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7716a;

        public c() {
        }

        public final void c(f fVar, boolean z10) {
            if (!this.f7716a) {
                this.f7716a = true;
                t tVar = t.this;
                tVar.f7706a.h();
                tVar.f7707b.onPanelClosed(108, fVar);
                this.f7716a = false;
            }
        }

        public final boolean d(f fVar) {
            t.this.f7707b.onMenuOpened(108, fVar);
            return true;
        }
    }

    public final class d implements f.a {
        public d() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        public final void b(f fVar) {
            t tVar = t.this;
            boolean a10 = tVar.f7706a.a();
            Window.Callback callback = tVar.f7707b;
            if (a10) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, (View) null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    public class e implements f.b {
        public e() {
        }
    }

    public t(Toolbar toolbar, CharSequence charSequence, f.g gVar) {
        b bVar = new b();
        toolbar.getClass();
        l1 l1Var = new l1(toolbar, false);
        this.f7706a = l1Var;
        gVar.getClass();
        this.f7707b = gVar;
        l1Var.f1071l = gVar;
        toolbar.setOnMenuItemClickListener(bVar);
        l1Var.setWindowTitle(charSequence);
        this.f7708c = new e();
    }

    public final boolean a() {
        return this.f7706a.f();
    }

    public final boolean b() {
        l1 l1Var = this.f7706a;
        if (!l1Var.j()) {
            return false;
        }
        l1Var.collapseActionView();
        return true;
    }

    public final void c(boolean z10) {
        if (z10 != this.f7711f) {
            this.f7711f = z10;
            ArrayList<a.b> arrayList = this.f7712g;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.get(i8).a();
            }
        }
    }

    public final int d() {
        return this.f7706a.f1061b;
    }

    public final Context e() {
        return this.f7706a.getContext();
    }

    public final void f() {
        this.f7706a.p(8);
    }

    public final boolean g() {
        l1 l1Var = this.f7706a;
        Toolbar toolbar = l1Var.f1060a;
        a aVar = this.f7713h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = l1Var.f1060a;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.m(toolbar2, aVar);
        return true;
    }

    public final void h() {
    }

    public final void i() {
        this.f7706a.f1060a.removeCallbacks(this.f7713h);
    }

    public final boolean j(int i8, KeyEvent keyEvent) {
        Menu v3 = v();
        if (v3 == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        v3.setQwertyMode(z10);
        return v3.performShortcut(i8, keyEvent, 0);
    }

    public final boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    public final boolean l() {
        return this.f7706a.g();
    }

    public final void m(boolean z10) {
    }

    public final void n(boolean z10) {
        l1 l1Var = this.f7706a;
        l1Var.k((l1Var.f1061b & -5) | 4);
    }

    public final void o(Drawable drawable) {
        this.f7706a.t(drawable);
    }

    public final void p(boolean z10) {
    }

    public final void q(int i8) {
        l1 l1Var = this.f7706a;
        l1Var.setTitle(i8 != 0 ? l1Var.getContext().getText(i8) : null);
    }

    public final void r(String str) {
        this.f7706a.setTitle(str);
    }

    public final void s(CharSequence charSequence) {
        this.f7706a.setWindowTitle(charSequence);
    }

    public final void t() {
        this.f7706a.p(0);
    }

    public final Menu v() {
        boolean z10 = this.f7710e;
        l1 l1Var = this.f7706a;
        if (!z10) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = l1Var.f1060a;
            toolbar.f896m0 = cVar;
            toolbar.f897n0 = dVar;
            ActionMenuView actionMenuView = toolbar.f879a;
            if (actionMenuView != null) {
                actionMenuView.Q = cVar;
                actionMenuView.R = dVar;
            }
            this.f7710e = true;
        }
        return l1Var.f1060a.getMenu();
    }
}
