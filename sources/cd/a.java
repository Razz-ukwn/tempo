package cd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import com.google.android.material.bottomsheet.c;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import d2.f1;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.managers.f;
import he.b;

public abstract class a extends c implements b {
    public ContextWrapper L0;
    public boolean M0;
    public volatile f N0;
    public final Object O0 = new Object();
    public boolean P0 = false;

    public a() {
    }

    public final void H(Activity activity) {
        this.f2062b0 = true;
        ContextWrapper contextWrapper = this.L0;
        f1.n(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t0();
        if (!this.P0) {
            this.P0 = true;
            RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) this;
            ((t) g()).t();
        }
    }

    public final void I(Context context) {
        super.I(context);
        t0();
        if (!this.P0) {
            this.P0 = true;
            RegisterBottomSheet registerBottomSheet = (RegisterBottomSheet) this;
            ((t) g()).t();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new ViewComponentManager$FragmentContextWrapper(P, (p) this));
    }

    public final Object g() {
        if (this.N0 == null) {
            synchronized (this.O0) {
                if (this.N0 == null) {
                    this.N0 = new f(this);
                }
            }
        }
        return this.N0.g();
    }

    public final m0.b k() {
        return ee.a.a(this, super.k());
    }

    public final Context q() {
        if (super.q() == null && !this.M0) {
            return null;
        }
        t0();
        return this.L0;
    }

    public final void t0() {
        if (this.L0 == null) {
            this.L0 = new ViewComponentManager$FragmentContextWrapper(super.q(), (p) this);
            this.M0 = ce.a.a(super.q());
        }
    }

    public a(int i8) {
        super(i8);
    }
}
