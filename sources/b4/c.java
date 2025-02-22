package b4;

import android.content.Context;
import android.graphics.Bitmap;
import b4.h;
import h4.l;
import java.io.File;
import java.nio.ByteBuffer;
import jf.d;
import wg.e;
import y3.k;
import y3.m;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f3215a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3216b;

    public static final class a implements h.a<ByteBuffer> {
        public final h a(Object obj, l lVar) {
            return new c((ByteBuffer) obj, lVar);
        }
    }

    public c(ByteBuffer byteBuffer, l lVar) {
        this.f3215a = byteBuffer;
        this.f3216b = lVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object a(d<? super g> dVar) {
        ByteBuffer byteBuffer = this.f3215a;
        try {
            e eVar = new e();
            eVar.write(byteBuffer);
            byteBuffer.position(0);
            Context context = this.f3216b.f9195a;
            Bitmap.Config[] configArr = m4.c.f11189a;
            File cacheDir = context.getCacheDir();
            cacheDir.mkdirs();
            return new l(new m(eVar, cacheDir, (k.a) null), (String) null, 2);
        } catch (Throwable th) {
            byteBuffer.position(0);
            throw th;
        }
    }
}
