package y3;

import d2.f1;
import java.io.Closeable;
import m4.c;
import wg.c0;
import wg.h;
import wg.l;
import wg.z;
import y3.k;

public final class j extends k {
    public boolean B;
    public c0 C;

    /* renamed from: a  reason: collision with root package name */
    public final z f17157a;

    /* renamed from: b  reason: collision with root package name */
    public final l f17158b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17159c;

    /* renamed from: d  reason: collision with root package name */
    public final Closeable f17160d;

    /* renamed from: e  reason: collision with root package name */
    public final k.a f17161e = null;

    public j(z zVar, l lVar, String str, Closeable closeable) {
        this.f17157a = zVar;
        this.f17158b = lVar;
        this.f17159c = str;
        this.f17160d = closeable;
    }

    public final k.a c() {
        return this.f17161e;
    }

    public final synchronized void close() {
        this.B = true;
        c0 c0Var = this.C;
        if (c0Var != null) {
            c.a(c0Var);
        }
        Closeable closeable = this.f17160d;
        if (closeable != null) {
            c.a(closeable);
        }
    }

    public final synchronized h d() {
        if (!this.B) {
            c0 c0Var = this.C;
            if (c0Var != null) {
                return c0Var;
            }
            c0 j10 = f1.j(this.f17158b.l(this.f17157a));
            this.C = j10;
            return j10;
        }
        throw new IllegalStateException("closed".toString());
    }
}
