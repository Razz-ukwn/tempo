package com.google.android.gms.common.api.internal;

import android.os.Handler;
import h7.i;
import java.util.concurrent.Executor;

public final /* synthetic */ class w implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f4335a;

    public /* synthetic */ w(i iVar) {
        this.f4335a = iVar;
    }

    public final void execute(Runnable runnable) {
        this.f4335a.post(runnable);
    }
}
