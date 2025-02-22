package dagger.hilt.android.internal.managers;

import fe.a;
import he.b;
import jc.g;
import jc.l;

public final class d implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile g f7402a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7403b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final e f7404c;

    public d(l.a aVar) {
        this.f7404c = aVar;
    }

    public final Object g() {
        if (this.f7402a == null) {
            synchronized (this.f7403b) {
                if (this.f7402a == null) {
                    this.f7402a = new g(new a(l.this));
                }
            }
        }
        return this.f7402a;
    }
}
