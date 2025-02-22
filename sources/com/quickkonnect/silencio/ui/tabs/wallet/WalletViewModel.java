package com.quickkonnect.silencio.ui.tabs.wallet;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.models.response.tabs.EarningsResponse;
import com.quickkonnect.silencio.models.response.tabs.FriendListResponse;
import java.util.List;
import kc.b;
import mc.d;
import sf.j;
import zd.a;
import zd.g;

public final class WalletViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final d f7155g;

    /* renamed from: h  reason: collision with root package name */
    public final b f7156h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<List<UserModel>> f7157i;

    /* renamed from: j  reason: collision with root package name */
    public final v<g<EarningsResponse>> f7158j = new v<>(new g.c());

    /* renamed from: k  reason: collision with root package name */
    public final v<g<FriendListResponse>> f7159k = new v<>();

    /* renamed from: l  reason: collision with root package name */
    public final v<g<BaseResponse>> f7160l = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletViewModel(Application application, d dVar, b bVar) {
        super(application);
        j.f(dVar, "tabsDataSource");
        j.f(bVar, "userDao");
        this.f7155g = dVar;
        this.f7156h = bVar;
        this.f7157i = bVar.b();
    }
}
