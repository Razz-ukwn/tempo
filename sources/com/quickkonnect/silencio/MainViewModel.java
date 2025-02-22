package com.quickkonnect.silencio;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.UpdateCheckResponse;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import java.util.List;
import kc.b;
import sf.j;
import zd.a;
import zd.g;

public final class MainViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final b f6667g;

    /* renamed from: h  reason: collision with root package name */
    public final mc.a f6668h;

    /* renamed from: i  reason: collision with root package name */
    public final LiveData<List<UserModel>> f6669i;

    /* renamed from: j  reason: collision with root package name */
    public final v<g<UpdateCheckResponse>> f6670j = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainViewModel(Application application, b bVar, mc.a aVar) {
        super(application);
        j.f(bVar, "userDao");
        j.f(aVar, "authDataSource");
        this.f6667g = bVar;
        this.f6668h = aVar;
        this.f6669i = bVar.b();
    }
}
