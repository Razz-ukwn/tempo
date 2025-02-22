package a5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l5.l;
import p4.h;
import p4.j;
import r4.w;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f105a;

    /* renamed from: b  reason: collision with root package name */
    public final s4.b f106b;

    public static final class a implements w<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final AnimatedImageDrawable f107a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f107a = animatedImageDrawable;
        }

        public final int a() {
            AnimatedImageDrawable animatedImageDrawable = this.f107a;
            int a10 = animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            char[] cArr = l.f11007a;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i8 = l.a.f11010a[config.ordinal()];
            int i10 = 1;
            if (i8 != 1) {
                if (i8 == 2 || i8 == 3) {
                    i10 = 2;
                } else {
                    i10 = 4;
                    if (i8 == 4) {
                        i10 = 8;
                    }
                }
            }
            return i10 * a10 * 2;
        }

        public final void c() {
            AnimatedImageDrawable animatedImageDrawable = this.f107a;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        public final Class<Drawable> d() {
            return Drawable.class;
        }

        public final Object get() {
            return this.f107a;
        }
    }

    public static final class b implements j<ByteBuffer, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final f f108a;

        public b(f fVar) {
            this.f108a = fVar;
        }

        public final w a(Object obj, int i8, int i10, h hVar) {
            ImageDecoder.Source d10 = ImageDecoder.createSource((ByteBuffer) obj);
            this.f108a.getClass();
            return f.a(d10, i8, i10, hVar);
        }

        public final boolean b(Object obj, h hVar) {
            return com.bumptech.glide.load.a.b(this.f108a.f105a, (ByteBuffer) obj) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }
    }

    public static final class c implements j<InputStream, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        public final f f109a;

        public c(f fVar) {
            this.f109a = fVar;
        }

        public final w a(Object obj, int i8, int i10, h hVar) {
            ImageDecoder.Source d10 = ImageDecoder.createSource(l5.a.b((InputStream) obj));
            this.f109a.getClass();
            return f.a(d10, i8, i10, hVar);
        }

        public final boolean b(Object obj, h hVar) {
            f fVar = this.f109a;
            return com.bumptech.glide.load.a.c(fVar.f106b, (InputStream) obj, fVar.f105a) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }
    }

    public f(List<ImageHeaderParser> list, s4.b bVar) {
        this.f105a = list;
        this.f106b = bVar;
    }

    public static a a(ImageDecoder.Source source, int i8, int i10, h hVar) {
        Drawable a10 = ImageDecoder.decodeDrawable(source, new x4.a(i8, i10, hVar));
        if (a10 instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) a10);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + a10);
    }
}
