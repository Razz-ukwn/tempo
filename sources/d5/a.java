package d5;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p4.h;
import r4.w;
import z4.b;

public final class a implements b<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f7298a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f7299b = 100;

    public final w<byte[]> d(w<Bitmap> wVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f7298a, this.f7299b, byteArrayOutputStream);
        wVar.c();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
