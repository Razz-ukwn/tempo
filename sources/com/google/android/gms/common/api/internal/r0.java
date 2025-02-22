package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.d;
import h7.i;
import java.util.Set;
import r7.b;
import r7.e;
import r7.f;
import s7.d;

public final class r0 extends d implements d.a, d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final b f4322j = e.f14087a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4323b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f4324c;

    /* renamed from: e  reason: collision with root package name */
    public final b f4325e = f4322j;

    /* renamed from: f  reason: collision with root package name */
    public final Set f4326f;

    /* renamed from: g  reason: collision with root package name */
    public final u6.d f4327g;

    /* renamed from: h  reason: collision with root package name */
    public f f4328h;

    /* renamed from: i  reason: collision with root package name */
    public q0 f4329i;

    public r0(Context context, i iVar, u6.d dVar) {
        this.f4323b = context;
        this.f4324c = iVar;
        this.f4327g = dVar;
        this.f4326f = dVar.f15770b;
    }

    public final void a(t6.b bVar) {
        ((e0) this.f4329i).b(bVar);
    }

    public final void b(int i8) {
        this.f4328h.g();
    }

    public final void c() {
        this.f4328h.c(this);
    }
}
