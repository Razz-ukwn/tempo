package z3;

import ff.m;
import java.io.IOException;
import rf.l;
import wg.g0;
import wg.n;

public final class e extends n {

    /* renamed from: b  reason: collision with root package name */
    public final l<IOException, m> f17714b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17715c;

    public e(g0 g0Var, d dVar) {
        super(g0Var);
        this.f17714b = dVar;
    }

    public final void B(wg.e eVar, long j10) {
        if (this.f17715c) {
            eVar.skip(j10);
            return;
        }
        try {
            super.B(eVar, j10);
        } catch (IOException e10) {
            this.f17715c = true;
            this.f17714b.invoke(e10);
        }
    }

    public final void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f17715c = true;
            this.f17714b.invoke(e10);
        }
    }

    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f17715c = true;
            this.f17714b.invoke(e10);
        }
    }
}
