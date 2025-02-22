package com.quickkonnect.silencio.ui.menu.profile;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import java.util.List;
import kc.b;
import kotlinx.coroutines.flow.y0;
import sf.j;
import zd.a;
import zd.g;

public final class ProfileViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f7089g;

    /* renamed from: h  reason: collision with root package name */
    public final b f7090h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<List<UserModel>> f7091i;

    /* renamed from: j  reason: collision with root package name */
    public final y0 f7092j = z0.a("");

    /* renamed from: k  reason: collision with root package name */
    public final y0 f7093k = z0.a("");

    /* renamed from: l  reason: collision with root package name */
    public final v<g<LoginWithPhoneResponseModel>> f7094l = new v<>();
    public final v<g<BaseResponse>> m = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel(Application application, b bVar, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        j.f(bVar, "userDao");
        this.f7089g = aVar;
        this.f7090h = bVar;
        this.f7091i = bVar.b();
    }
}
