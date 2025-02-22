package xd;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import com.quickkonnect.silencio.ui.tabs.shop.ShopFragment;
import d2.f1;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.android.internal.managers.f;
import he.b;

public abstract class a extends p implements b {

    /* renamed from: v0  reason: collision with root package name */
    public ContextWrapper f17060v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f17061w0;

    /* renamed from: x0  reason: collision with root package name */
    public volatile f f17062x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Object f17063y0 = new Object();

    /* renamed from: z0  reason: collision with root package name */
    public boolean f17064z0 = false;

    public a() {
    }

    public final void H(Activity activity) {
        this.f2062b0 = true;
        ContextWrapper contextWrapper = this.f17060v0;
        f1.n(contextWrapper == null || f.b(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        n0();
        if (!this.f17064z0) {
            this.f17064z0 = true;
            ShopFragment shopFragment = (ShopFragment) this;
            ((e) g()).B();
        }
    }

    public final void I(Context context) {
        super.I(context);
        n0();
        if (!this.f17064z0) {
            this.f17064z0 = true;
            ShopFragment shopFragment = (ShopFragment) this;
            ((e) g()).B();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new ViewComponentManager$FragmentContextWrapper(P, (p) this));
    }

    public final Object g() {
        if (this.f17062x0 == null) {
            synchronized (this.f17063y0) {
                if (this.f17062x0 == null) {
                    this.f17062x0 = new f(this);
                }
            }
        }
        return this.f17062x0.g();
    }

    public final m0.b k() {
        return ee.a.a(this, super.k());
    }

    public final void n0() {
        if (this.f17060v0 == null) {
            this.f17060v0 = new ViewComponentManager$FragmentContextWrapper(super.q(), (p) this);
            this.f17061w0 = ce.a.a(super.q());
        }
    }

    public final Context q() {
        if (super.q() == null && !this.f17061w0) {
            return null;
        }
        n0();
        return this.f17060v0;
    }

    public a(int i8) {
        super(i8);
    }
}
