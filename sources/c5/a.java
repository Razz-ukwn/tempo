package c5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import c5.c;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import l5.l;
import o4.d;
import o4.e;
import p4.h;
import p4.j;
import r4.w;
import s4.c;

public final class a implements j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0057a f3716f = new C0057a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f3717g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f3718a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f3719b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3720c = f3717g;

    /* renamed from: d  reason: collision with root package name */
    public final C0057a f3721d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3722e;

    /* renamed from: c5.a$a  reason: collision with other inner class name */
    public static class C0057a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f3723a = new ArrayDeque(0);

        public b() {
            char[] cArr = l.f11007a;
        }
    }

    public a(Context context, List<ImageHeaderParser> list, c cVar, s4.b bVar) {
        C0057a aVar = f3716f;
        this.f3718a = context.getApplicationContext();
        this.f3719b = list;
        this.f3721d = aVar;
        this.f3722e = new b(cVar, bVar);
    }

    public static int d(o4.c cVar, int i8, int i10) {
        int min = Math.min(cVar.f12148g / i10, cVar.f12147f / i8);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i8 + "x" + i10 + "], actual dimens: [" + cVar.f12147f + "x" + cVar.f12148g + "]");
        }
        return max;
    }

    public final w a(Object obj, int i8, int i10, h hVar) {
        d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f3720c;
        synchronized (bVar) {
            d dVar2 = (d) bVar.f3723a.poll();
            if (dVar2 == null) {
                dVar2 = new d();
            }
            dVar = dVar2;
            dVar.f12154b = null;
            Arrays.fill(dVar.f12153a, (byte) 0);
            dVar.f12155c = new o4.c();
            dVar.f12156d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f12154b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f12154b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            a5.j c3 = c(byteBuffer, i8, i10, dVar, hVar);
            b bVar2 = this.f3720c;
            synchronized (bVar2) {
                dVar.f12154b = null;
                dVar.f12155c = null;
                bVar2.f3723a.offer(dVar);
            }
            return c3;
        } catch (Throwable th) {
            b bVar3 = this.f3720c;
            synchronized (bVar3) {
                dVar.f12154b = null;
                dVar.f12155c = null;
                bVar3.f3723a.offer(dVar);
                throw th;
            }
        }
    }

    public final boolean b(Object obj, h hVar) {
        return !((Boolean) hVar.c(g.f3754b)).booleanValue() && com.bumptech.glide.load.a.b(this.f3719b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    public final a5.j c(ByteBuffer byteBuffer, int i8, int i10, d dVar, h hVar) {
        int i11 = l5.h.f10997b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            o4.c b10 = dVar.b();
            if (b10.f12144c > 0) {
                if (b10.f12143b == 0) {
                    Bitmap.Config config = hVar.c(g.f3753a) == p4.b.f12452b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int d10 = d(b10, i8, i10);
                    C0057a aVar = this.f3721d;
                    b bVar = this.f3722e;
                    aVar.getClass();
                    e eVar = new e(bVar, b10, byteBuffer, d10);
                    eVar.h(config);
                    eVar.b();
                    Bitmap a10 = eVar.a();
                    if (a10 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + l5.h.a(elapsedRealtimeNanos));
                        }
                        return null;
                    }
                    e eVar2 = r9;
                    e eVar3 = new e(com.bumptech.glide.b.b(this.f3718a), eVar, i8, i10, x4.b.f16962b, a10);
                    return new a5.j(new c(new c.a(eVar2)), 1);
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + l5.h.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + l5.h.a(elapsedRealtimeNanos));
            }
        }
    }
}
