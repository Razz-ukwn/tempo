package com.quickkonnect.silencio.ui.menu.profile.changepassword;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import jf.d;
import kc.b;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.y0;
import sd.h;
import sd.i;
import sf.j;
import zd.a;
import zd.g;

public final class ChangePasswordViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f7102g;

    /* renamed from: h  reason: collision with root package name */
    public final b f7103h;

    /* renamed from: i  reason: collision with root package name */
    public final y0 f7104i;

    /* renamed from: j  reason: collision with root package name */
    public final y0 f7105j;

    /* renamed from: k  reason: collision with root package name */
    public final y0 f7106k;

    /* renamed from: l  reason: collision with root package name */
    public final g0 f7107l;
    public final v<g<LoginWithPhoneResponseModel>> m = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangePasswordViewModel(Application application, b bVar, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        j.f(bVar, "userDao");
        this.f7102g = aVar;
        this.f7103h = bVar;
        y0 a10 = z0.a("");
        this.f7104i = a10;
        y0 a11 = z0.a("");
        this.f7105j = a11;
        y0 a12 = z0.a("");
        this.f7106k = a12;
        this.f7107l = new g0(new g0(a11, a12, new h((d<? super h>) null)), a10, new i((d<? super i>) null));
    }
}
