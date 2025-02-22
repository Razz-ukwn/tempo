package com.google.android.play.core.integrity;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import l9.m;
import l9.n;
import l9.w;

final class r extends n {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f6289a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Long f6290b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6291c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f6292d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f6293e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(t tVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f6293e = tVar;
        this.f6289a = bArr;
        this.f6290b = l10;
        this.f6291c = taskCompletionSource2;
        this.f6292d = integrityTokenRequest;
    }

    public final void a(Exception exc) {
        if (exc instanceof w) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.IInterface, l9.j] */
    public final void b() {
        try {
            t tVar = this.f6293e;
            tVar.f6297a.m.A(t.a(tVar, this.f6289a, this.f6290b), new s(this.f6293e, this.f6291c));
        } catch (RemoteException e10) {
            m c3 = this.f6293e.f6298b;
            Object[] objArr = {this.f6292d};
            c3.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", m.b(c3.f11019a, "requestIntegrityToken(%s)", objArr), e10);
            }
            this.f6291c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
