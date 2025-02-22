package k0;

import androidx.fragment.app.z;
import b1.b;
import d2.f1;
import f1.c;
import h0.g;
import k0.a;

public interface e extends c {
    static void l(e eVar, long j10, float f10, float f11, long j11, long j12, h hVar) {
        eVar.v(j10, f10, f11, j11, j12, 1.0f, hVar, 3);
    }

    void a(long j10, long j11, long j12, float f10, int i8, b bVar, float f11, int i10);

    a.b p();

    long q() {
        return p().b();
    }

    long u() {
        long b10 = p().b();
        return f1.f(g.b(b10) / 2.0f, g.a(b10) / 2.0f);
    }

    void v(long j10, float f10, float f11, long j11, long j12, float f12, z zVar, int i8);
}
