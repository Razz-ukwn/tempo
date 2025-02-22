package y3;

import java.io.File;
import m4.c;
import sf.j;
import wg.h;
import wg.l;
import wg.u;
import y3.k;

public final class m extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f17163a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17164b;

    /* renamed from: c  reason: collision with root package name */
    public h f17165c;

    public m(h hVar, File file, k.a aVar) {
        this.f17163a = aVar;
        this.f17165c = hVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    public final k.a c() {
        return this.f17163a;
    }

    public final synchronized void close() {
        this.f17164b = true;
        h hVar = this.f17165c;
        if (hVar != null) {
            c.a(hVar);
        }
    }

    public final synchronized h d() {
        h hVar;
        if (!this.f17164b) {
            hVar = this.f17165c;
            if (hVar == null) {
                u uVar = l.f16785a;
                j.c((Object) null);
                throw null;
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
        return hVar;
    }
}
