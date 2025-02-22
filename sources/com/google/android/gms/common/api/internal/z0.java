package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f4345a;

    public z0(int i8) {
        this.f4345a = i8;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(b0 b0Var);

    public abstract void d(s sVar, boolean z10);
}
