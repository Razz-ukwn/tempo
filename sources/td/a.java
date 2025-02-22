package td;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import com.quickkonnect.silencio.ui.tabs.home.HomeFragment;
import d2.f1;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.managers.f;
import he.b;

public abstract class a extends p implements b {

    /* renamed from: v0  reason: collision with root package name */
    public ContextWrapper f15607v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f15608w0;

    /* renamed from: x0  reason: collision with root package name */
    public volatile f f15609x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Object f15610y0 = new Object();

    /* renamed from: z0  reason: collision with root package name */
    public boolean f15611z0 = false;

    public a() {
    }

    public final void H(Activity activity) {
        this.f2062b0 = true;
        ContextWrapper contextWrapper = this.f15607v0;
        f1.n(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        n0();
        if (!this.f15611z0) {
            this.f15611z0 = true;
            HomeFragment homeFragment = (HomeFragment) this;
            ((h) g()).y();
        }
    }

    public final void I(Context context) {
        super.I(context);
        n0();
        if (!this.f15611z0) {
            this.f15611z0 = true;
            HomeFragment homeFragment = (HomeFragment) this;
            ((h) g()).y();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new ViewComponentManager$FragmentContextWrapper(P, (p) this));
    }

    public final Object g() {
        if (this.f15609x0 == null) {
            synchronized (this.f15610y0) {
                if (this.f15609x0 == null) {
                    this.f15609x0 = new f(this);
                }
            }
        }
        return this.f15609x0.g();
    }

    public final m0.b k() {
        return ee.a.a(this, super.k());
    }

    public final void n0() {
        if (this.f15607v0 == null) {
            this.f15607v0 = new ViewComponentManager$FragmentContextWrapper(super.q(), (p) this);
            this.f15608w0 = ce.a.a(super.q());
        }
    }

    public final Context q() {
        if (super.q() == null && !this.f15608w0) {
            return null;
        }
        n0();
        return this.f15607v0;
    }

    public a(int i8) {
        super(i8);
    }
}
