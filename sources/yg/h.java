package yg;

import yg.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.a.C0325a f17474a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f17475b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Throwable f17476c;

    public /* synthetic */ h(i.a.C0325a aVar, d dVar, Throwable th) {
        this.f17474a = aVar;
        this.f17475b = dVar;
        this.f17476c = th;
    }

    public final void run() {
        this.f17475b.b(i.a.this, this.f17476c);
    }
}
