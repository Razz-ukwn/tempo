package y4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import l5.a;
import p4.h;
import p4.j;
import r4.w;

public final class s implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final c f17235a = new c();

    public final w a(Object obj, int i8, int i10, h hVar) {
        return this.f17235a.a(ImageDecoder.createSource(a.b((InputStream) obj)), i8, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
