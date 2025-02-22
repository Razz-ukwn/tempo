package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.v;
import java.util.ArrayList;
import m9.f;
import r9.b;
import r9.m;
import s9.l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t  reason: invalid package */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f4926a;

    /* renamed from: b  reason: collision with root package name */
    public final s f4927b = new s(this);

    /* renamed from: c  reason: collision with root package name */
    public f f4928c;

    /* renamed from: d  reason: collision with root package name */
    public m f4929d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4930e;

    /* renamed from: f  reason: collision with root package name */
    public l f4931f;

    /* renamed from: g  reason: collision with root package name */
    public v f4932g;

    /* renamed from: h  reason: collision with root package name */
    public m0 f4933h;

    /* renamed from: i  reason: collision with root package name */
    public h0 f4934i;

    /* renamed from: j  reason: collision with root package name */
    public b f4935j;

    /* renamed from: k  reason: collision with root package name */
    public qh f4936k;

    /* renamed from: l  reason: collision with root package name */
    public l0 f4937l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public Object f4938n;

    public t(int i8) {
        new ArrayList();
        this.f4926a = i8;
    }

    public abstract String a();

    public abstract void b();

    public abstract void c(TaskCompletionSource taskCompletionSource, c cVar);

    public final void d(f fVar) {
        if (fVar != null) {
            this.f4928c = fVar;
            return;
        }
        throw new NullPointerException("firebaseApp cannot be null");
    }

    public final void e(Status status) {
        this.m = true;
        this.f4932g.f((Object) null, status);
    }

    public final void f(Object obj) {
        this.m = true;
        this.f4938n = obj;
        this.f4932g.f(obj, (Status) null);
    }
}
