package w4;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.ArrayDeque;
import p4.g;
import p4.h;
import v4.f;
import v4.l;
import v4.m;
import v4.n;
import v4.o;
import v4.r;

public final class a implements n<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f16475b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<f, f> f16476a;

    /* renamed from: w4.a$a  reason: collision with other inner class name */
    public static class C0304a implements o<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<f, f> f16477a = new m<>();

        public final n<f, InputStream> a(r rVar) {
            return new a(this.f16477a);
        }
    }

    public a(m<f, f> mVar) {
        this.f16476a = mVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        f fVar = (f) obj;
        m<f, f> mVar = this.f16476a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar);
            l lVar = mVar.f16183a;
            Object a11 = lVar.a(a10);
            ArrayDeque arrayDeque = m.a.f16184d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            f fVar2 = (f) a11;
            if (fVar2 == null) {
                lVar.d(m.a.a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new n.a(fVar, new j(fVar, ((Integer) hVar.c(f16475b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        f fVar = (f) obj;
        return true;
    }
}
