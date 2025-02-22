package com.google.android.recaptcha.internal;

import ag.g0;
import cb.b;
import ff.m;
import jf.d;
import lf.i;
import rf.p;

final class zzo extends i implements p {
    public zzo(d dVar) {
        super(2, dVar);
    }

    public final d create(Object obj, d dVar) {
        return new zzo(dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        return new zzo((d) obj2).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        Thread.currentThread().setPriority(8);
        return m.f8717a;
    }
}
