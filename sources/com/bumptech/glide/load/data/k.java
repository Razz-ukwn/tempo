package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import s4.b;
import y4.v;

public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final v f4121a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f4122a;

        public a(b bVar) {
            this.f4122a = bVar;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final e b(Object obj) {
            return new k((InputStream) obj, this.f4122a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        v vVar = new v(inputStream, bVar);
        this.f4121a = vVar;
        vVar.mark(5242880);
    }

    public final Object a() {
        v vVar = this.f4121a;
        vVar.reset();
        return vVar;
    }

    public final void b() {
        this.f4121a.d();
    }
}
