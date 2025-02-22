package p4;

import java.security.MessageDigest;
import l5.b;
import p4.g;

public final class h implements f {

    /* renamed from: b  reason: collision with root package name */
    public final b f12464b = new b();

    public final void a(MessageDigest messageDigest) {
        int i8 = 0;
        while (true) {
            b bVar = this.f12464b;
            if (i8 < bVar.f12032c) {
                g gVar = (g) bVar.i(i8);
                Object m = this.f12464b.m(i8);
                g.b<T> bVar2 = gVar.f12461b;
                if (gVar.f12463d == null) {
                    gVar.f12463d = gVar.f12462c.getBytes(f.f12458a);
                }
                bVar2.a(gVar.f12463d, m, messageDigest);
                i8++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        b bVar = this.f12464b;
        return bVar.containsKey(gVar) ? bVar.getOrDefault(gVar, null) : gVar.f12460a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f12464b.equals(((h) obj).f12464b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12464b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f12464b + '}';
    }
}
