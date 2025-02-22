package hd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import com.google.android.material.bottomsheet.c;
import com.quickkonnect.silencio.ui.measure.claimcoin.place.indoor.ClaimCoinPlaceIndoorBottomSheet;
import d2.f1;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import ee.a;
import he.b;

public abstract class f extends c implements b {
    public ContextWrapper L0;
    public boolean M0;
    public volatile dagger.hilt.android.internal.managers.f N0;
    public final Object O0 = new Object();
    public boolean P0 = false;

    public f() {
    }

    public final void H(Activity activity) {
        this.f2062b0 = true;
        ContextWrapper contextWrapper = this.L0;
        f1.n(contextWrapper == null || dagger.hilt.android.internal.managers.f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t0();
        if (!this.P0) {
            this.P0 = true;
            ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet = (ClaimCoinPlaceIndoorBottomSheet) this;
            ((e) g()).m();
        }
    }

    public final void I(Context context) {
        super.I(context);
        t0();
        if (!this.P0) {
            this.P0 = true;
            ClaimCoinPlaceIndoorBottomSheet claimCoinPlaceIndoorBottomSheet = (ClaimCoinPlaceIndoorBottomSheet) this;
            ((e) g()).m();
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
                    this.N0 = new dagger.hilt.android.internal.managers.f(this);
                }
            }
        }
        return this.N0.g();
    }

    public final m0.b k() {
        return a.a(this, super.k());
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

    public f(int i8) {
        super(i8);
    }
}
