package com.quickkonnect.silencio.ui.auth.createaccount;

import android.app.Application;
import androidx.fragment.app.z0;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.NickNameResponse;
import jf.d;
import kc.b;
import kotlinx.coroutines.flow.g0;
import kotlinx.coroutines.flow.y0;
import sf.j;
import tc.r;
import tc.s;
import tc.t;
import zd.a;
import zd.g;

public final class CreateAccountViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f6726g;

    /* renamed from: h  reason: collision with root package name */
    public final b f6727h;

    /* renamed from: i  reason: collision with root package name */
    public final y0 f6728i;

    /* renamed from: j  reason: collision with root package name */
    public final y0 f6729j;

    /* renamed from: k  reason: collision with root package name */
    public final y0 f6730k;

    /* renamed from: l  reason: collision with root package name */
    public final y0 f6731l;
    public final g0 m;

    /* renamed from: n  reason: collision with root package name */
    public final v<g<NickNameResponse>> f6732n = new v<>();

    /* renamed from: o  reason: collision with root package name */
    public final y0 f6733o = z0.a("");

    /* renamed from: p  reason: collision with root package name */
    public final v<g<LoginWithPhoneResponseModel>> f6734p = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateAccountViewModel(Application application, b bVar, mc.a aVar) {
        super(application);
        j.f(aVar, "authDataSource");
        j.f(bVar, "userDao");
        this.f6726g = aVar;
        this.f6727h = bVar;
        y0 a10 = z0.a("");
        this.f6728i = a10;
        y0 a11 = z0.a("");
        this.f6729j = a11;
        y0 a12 = z0.a("");
        this.f6730k = a12;
        y0 a13 = z0.a(Boolean.FALSE);
        this.f6731l = a13;
        this.m = new g0(new g0(new g0(a10, a11, new r((d<? super r>) null)), a12, new s((d<? super s>) null)), a13, new t((d<? super t>) null));
    }
}
