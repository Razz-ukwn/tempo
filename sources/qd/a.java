package qd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import com.quickkonnect.silencio.ui.menu.history.detail.HistoryDetailsFragment;
import d2.f1;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.managers.f;
import he.b;

public abstract class a extends p implements b {

    /* renamed from: v0  reason: collision with root package name */
    public ContextWrapper f13501v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f13502w0;

    /* renamed from: x0  reason: collision with root package name */
    public volatile f f13503x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Object f13504y0 = new Object();

    /* renamed from: z0  reason: collision with root package name */
    public boolean f13505z0 = false;

    public a() {
    }

    public final void H(Activity activity) {
        this.f2062b0 = true;
        ContextWrapper contextWrapper = this.f13501v0;
        f1.n(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        n0();
        if (!this.f13505z0) {
            this.f13505z0 = true;
            HistoryDetailsFragment historyDetailsFragment = (HistoryDetailsFragment) this;
            ((c) g()).c();
        }
    }

    public final void I(Context context) {
        super.I(context);
        n0();
        if (!this.f13505z0) {
            this.f13505z0 = true;
            HistoryDetailsFragment historyDetailsFragment = (HistoryDetailsFragment) this;
            ((c) g()).c();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new ViewComponentManager$FragmentContextWrapper(P, (p) this));
    }

    public final Object g() {
        if (this.f13503x0 == null) {
            synchronized (this.f13504y0) {
                if (this.f13503x0 == null) {
                    this.f13503x0 = new f(this);
                }
            }
        }
        return this.f13503x0.g();
    }

    public final m0.b k() {
        return ee.a.a(this, super.k());
    }

    public final void n0() {
        if (this.f13501v0 == null) {
            this.f13501v0 = new ViewComponentManager$FragmentContextWrapper(super.q(), (p) this);
            this.f13502w0 = ce.a.a(super.q());
        }
    }

    public final Context q() {
        if (super.q() == null && !this.f13502w0) {
            return null;
        }
        n0();
        return this.f13501v0;
    }

    public a(int i8) {
        super(i8);
    }
}
