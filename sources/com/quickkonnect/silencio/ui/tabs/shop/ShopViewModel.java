package com.quickkonnect.silencio.ui.tabs.shop;

import android.app.Application;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import mc.d;
import sf.j;
import zd.a;
import zd.g;

public final class ShopViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final d f7146g;

    /* renamed from: h  reason: collision with root package name */
    public final v<g<EarningsResponse>> f7147h = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShopViewModel(Application application, d dVar) {
        super(application);
        j.f(dVar, "tabsDataSource");
        this.f7146g = dVar;
    }
}
