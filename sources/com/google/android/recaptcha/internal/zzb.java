package com.google.android.recaptcha.internal;

import ag.l0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzb {
    public static final Task zza(l0 l0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        l0Var.k0(new zza(taskCompletionSource, l0Var));
        return taskCompletionSource.getTask();
    }
}
