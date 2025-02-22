package com.quickkonnect.silencio.ui.auth.login;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import jf.d;
import kc.b;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.y0;
import sf.j;
import xc.n;
import zd.a;
import zd.g;

public final class LoginViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6791g;

    /* renamed from: h  reason: collision with root package name */
    public final b f6792h;

    /* renamed from: i  reason: collision with root package name */
    public final y0 f6793i;

    /* renamed from: j  reason: collision with root package name */
    public final y0 f6794j;

    /* renamed from: k  reason: collision with root package name */
    public final g0 f6795k;

    /* renamed from: l  reason: collision with root package name */
    public final v<g<LoginWithPhoneResponseModel>> f6796l = new v<>();
    public final v<g<LoginWithPhoneResponseModel>> m = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModel(Application application, b bVar, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        j.f(bVar, "userDao");
        this.f6791g = aVar;
        this.f6792h = bVar;
        y0 a10 = z0.a("");
        this.f6793i = a10;
        y0 a11 = z0.a("");
        this.f6794j = a11;
        this.f6795k = new g0(a10, a11, new n((d<? super n>) null));
    }
}
