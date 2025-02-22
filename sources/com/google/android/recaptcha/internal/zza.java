package com.google.android.recaptcha.internal;

import ag.l0;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ff.m;
import java.util.concurrent.CancellationException;
import rf.l;
import sf.k;

final class zza extends k implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ l0 zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zza(TaskCompletionSource taskCompletionSource, l0 l0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = l0Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable s10 = this.zzb.s();
            if (s10 == null) {
                this.zza.setResult(this.zzb.j());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = s10 instanceof Exception ? (Exception) s10 : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(s10);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return m.f8717a;
    }
}
