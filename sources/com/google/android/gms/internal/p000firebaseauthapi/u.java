package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u  reason: invalid package */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f4967a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f4968b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f4969c;

    public /* synthetic */ u(v vVar, t tVar, TaskCompletionSource taskCompletionSource) {
        this.f4967a = vVar;
        this.f4968b = tVar;
        this.f4969c = taskCompletionSource;
    }

    public final void run() {
        this.f4968b.c(this.f4969c, this.f4967a.f4999a);
    }
}
