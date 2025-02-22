package y4;

import android.graphics.Bitmap;
import l5.l;
import p4.h;
import p4.j;
import r4.w;

public final class z implements j<Bitmap, Bitmap> {

    public static final class a implements w<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f17252a;

        public a(Bitmap bitmap) {
            this.f17252a = bitmap;
        }

        public final int a() {
            return l.c(this.f17252a);
        }

        public final void c() {
        }

        public final Class<Bitmap> d() {
            return Bitmap.class;
        }

        public final Object get() {
            return this.f17252a;
        }
    }

    public final w a(Object obj, int i8, int i10, h hVar) {
        return new a((Bitmap) obj);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, h hVar) {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }
}
