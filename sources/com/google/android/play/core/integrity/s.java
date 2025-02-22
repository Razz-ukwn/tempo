package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import l9.k;
import l9.m;
import l9.q;
import l9.v;

final class s extends k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f6294a;

    /* renamed from: b  reason: collision with root package name */
    private final m f6295b = new m("OnRequestIntegrityTokenCallback");

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f6296c;

    public s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f6294a = tVar;
        this.f6296c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        v vVar = this.f6294a.f6297a;
        TaskCompletionSource taskCompletionSource = this.f6296c;
        synchronized (vVar.f11029f) {
            vVar.f11028e.remove(taskCompletionSource);
        }
        synchronized (vVar.f11029f) {
            if (vVar.f11034k.get() <= 0 || vVar.f11034k.decrementAndGet() <= 0) {
                vVar.a().post(new q(vVar));
            } else {
                vVar.f11025b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
            }
        }
        this.f6295b.a("onRequestIntegrityToken", new Object[0]);
        int i8 = bundle.getInt("error");
        if (i8 != 0) {
            this.f6296c.trySetException(new IntegrityServiceException(i8, (Throwable) null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f6296c.trySetException(new IntegrityServiceException(-100, (Throwable) null));
            return;
        }
        TaskCompletionSource taskCompletionSource2 = this.f6296c;
        d dVar = new d();
        dVar.a(string);
        taskCompletionSource2.trySetResult(dVar.b());
    }
}
