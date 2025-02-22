package com.quickkonnect.silencio.ui.measure.result;

import android.app.Application;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import mc.b;
import sf.j;
import zd.a;
import zd.g;

public final class ResultViewModel extends a {

    /* renamed from: g  reason: collision with root package name */
    public final b f7064g;

    /* renamed from: h  reason: collision with root package name */
    public final v<g<StopRecordingResponseModel>> f7065h = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResultViewModel(Application application, b bVar) {
        super(application);
        j.f(bVar, "measureDataSource");
        this.f7064g = bVar;
    }
}
