package com.quickkonnect.silencio.ui.tabs.home;

import android.app.Application;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import com.quickkonnect.silencio.models.response.tabs.HomeDashboardResponseModel;
import jf.f;
import mc.d;
import sf.j;
import td.k;
import zd.a;
import zd.g;

public final class HomeViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final d f7115g;

    /* renamed from: h  reason: collision with root package name */
    public final mc.a f7116h;

    /* renamed from: i  reason: collision with root package name */
    public final v<g<EarningsResponse>> f7117i = new v<>(new g.c());

    /* renamed from: j  reason: collision with root package name */
    public final v<g<HomeDashboardResponseModel>> f7118j = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel(Application application, d dVar, mc.a aVar) {
        super(application);
        j.f(dVar, "tabsDataSource");
        j.f(aVar, "authDataSource");
        this.f7115g = dVar;
        this.f7116h = aVar;
        b.D(gc.b.o(this), (f.b) null, 0, new k(this, (jf.d<? super k>) null), 3);
    }
}
