package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class t0 extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f4333b;

    public t0(int i8, TaskCompletionSource taskCompletionSource) {
        super(i8);
        this.f4333b = taskCompletionSource;
    }

    public final void a(Status status) {
        this.f4333b.trySetException(new b(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f4333b.trySetException(runtimeException);
    }

    public final void c(b0 b0Var) {
        try {
            h(b0Var);
        } catch (DeadObjectException e10) {
            a(z0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(z0.e(e11));
        } catch (RuntimeException e12) {
            this.f4333b.trySetException(e12);
        }
    }

    public abstract void h(b0 b0Var);
}
