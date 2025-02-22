package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v  reason: invalid package */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public c f4999a;

    /* renamed from: b  reason: collision with root package name */
    public ExecutorService f5000b;

    public final Task a(t tVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f5000b.execute(new u(this, tVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
