package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class v<S> extends b0<S> {

    /* renamed from: w0  reason: collision with root package name */
    public int f5922w0;

    /* renamed from: x0  reason: collision with root package name */
    public d<S> f5923x0;

    /* renamed from: y0  reason: collision with root package name */
    public a f5924y0;

    public class a extends a0<S> {
        public a() {
        }

        public final void a(S s10) {
            Iterator<a0<S>> it = v.this.f5862v0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (bundle == null) {
            bundle = this.C;
        }
        this.f5922w0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f5923x0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f5924y0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(q(), this.f5922w0));
        d<S> dVar = this.f5923x0;
        new a();
        return dVar.r();
    }

    public final void W(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f5922w0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f5923x0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5924y0);
    }
}
