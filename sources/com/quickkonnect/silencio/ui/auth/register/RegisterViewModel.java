package com.quickkonnect.silencio.ui.auth.register;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import kc.b;
import kotlinx.coroutines.flow.y0;
import sf.j;
import zd.a;
import zd.g;

public final class RegisterViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6862g;

    /* renamed from: h  reason: collision with root package name */
    public final b f6863h;

    /* renamed from: i  reason: collision with root package name */
    public final v<g<LoginWithPhoneResponseModel>> f6864i = new v<>();

    /* renamed from: j  reason: collision with root package name */
    public final v<g<BaseResponse>> f6865j = new v<>();

    /* renamed from: k  reason: collision with root package name */
    public final y0 f6866k;

    /* renamed from: l  reason: collision with root package name */
    public final y0 f6867l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterViewModel(Application application, b bVar, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        j.f(bVar, "userDao");
        this.f6862g = aVar;
        this.f6863h = bVar;
        Boolean bool = Boolean.FALSE;
        this.f6866k = z0.a(bool);
        this.f6867l = z0.a(bool);
    }
}
