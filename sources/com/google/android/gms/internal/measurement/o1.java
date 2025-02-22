package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class o1 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f5439a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5439a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
