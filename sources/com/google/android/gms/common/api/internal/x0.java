package com.google.android.gms.common.api.internal;

import ag.d;
import ag.i0;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.appcompat.widget.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class x0 extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final p f4338b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f4339c;

    /* renamed from: d  reason: collision with root package name */
    public final i0 f4340d;

    public x0(int i8, s0 s0Var, TaskCompletionSource taskCompletionSource, i0 i0Var) {
        super(i8);
        this.f4339c = taskCompletionSource;
        this.f4338b = s0Var;
        this.f4340d = i0Var;
        if (i8 == 2 && s0Var.f4313b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f4340d.getClass();
        this.f4339c.trySetException(d.f(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f4339c.trySetException(runtimeException);
    }

    public final void c(b0 b0Var) {
        TaskCompletionSource taskCompletionSource = this.f4339c;
        try {
            p pVar = this.f4338b;
            ((s0) pVar).f4332d.f4315a.c(b0Var.f4218b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(z0.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    public final void d(s sVar, boolean z10) {
        Map map = sVar.f4331b;
        Boolean valueOf = Boolean.valueOf(z10);
        TaskCompletionSource taskCompletionSource = this.f4339c;
        map.put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new l((Object) sVar, (Object) taskCompletionSource, 3));
    }

    public final boolean f(b0 b0Var) {
        return this.f4338b.f4313b;
    }

    public final t6.d[] g(b0 b0Var) {
        return this.f4338b.f4312a;
    }
}
