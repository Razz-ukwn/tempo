package s4;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l5.l;

public final class i implements c {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f14684j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final j f14685a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f14686b;

    /* renamed from: c  reason: collision with root package name */
    public final a f14687c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final long f14688d;

    /* renamed from: e  reason: collision with root package name */
    public long f14689e;

    /* renamed from: f  reason: collision with root package name */
    public int f14690f;

    /* renamed from: g  reason: collision with root package name */
    public int f14691g;

    /* renamed from: h  reason: collision with root package name */
    public int f14692h;

    /* renamed from: i  reason: collision with root package name */
    public int f14693i;

    public static final class a {
    }

    public i(long j10) {
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f14688d = j10;
        this.f14685a = lVar;
        this.f14686b = unmodifiableSet;
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i8) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i8);
        }
        if (i8 >= 40 || i8 >= 20) {
            b();
        } else if (i8 >= 20 || i8 == 15) {
            h(this.f14688d / 2);
        }
    }

    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0);
    }

    public final Bitmap c(int i8, int i10, Bitmap.Config config) {
        Bitmap g10 = g(i8, i10, config);
        if (g10 != null) {
            return g10;
        }
        if (config == null) {
            config = f14684j;
        }
        return Bitmap.createBitmap(i8, i10, config);
    }

    public final synchronized void d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((l) this.f14685a).getClass();
                        if (((long) l.c(bitmap)) <= this.f14688d) {
                            if (this.f14686b.contains(bitmap.getConfig())) {
                                ((l) this.f14685a).getClass();
                                int c3 = l.c(bitmap);
                                ((l) this.f14685a).f(bitmap);
                                this.f14687c.getClass();
                                this.f14692h++;
                                this.f14689e += (long) c3;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Log.v("LruBitmapPool", "Put bitmap in pool=" + ((l) this.f14685a).e(bitmap));
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    f();
                                }
                                h(this.f14688d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((l) this.f14685a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f14686b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final Bitmap e(int i8, int i10, Bitmap.Config config) {
        Bitmap g10 = g(i8, i10, config);
        if (g10 != null) {
            g10.eraseColor(0);
            return g10;
        }
        if (config == null) {
            config = f14684j;
        }
        return Bitmap.createBitmap(i8, i10, config);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f14690f + ", misses=" + this.f14691g + ", puts=" + this.f14692h + ", evictions=" + this.f14693i + ", currentSize=" + this.f14689e + ", maxSize=" + this.f14688d + "\nStrategy=" + this.f14685a);
    }

    public final synchronized Bitmap g(int i8, int i10, Bitmap.Config config) {
        Bitmap b10;
        try {
            if (config != Bitmap.Config.HARDWARE) {
                b10 = ((l) this.f14685a).b(i8, i10, config != null ? config : f14684j);
                int i11 = 8;
                if (b10 == null) {
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                        ((l) this.f14685a).getClass();
                        char[] cArr = l.f11007a;
                        int i12 = i8 * i10;
                        int i13 = l.a.f11010a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                        sb2.append(l.c((i13 != 1 ? (i13 == 2 || i13 == 3) ? 2 : i13 != 4 ? 4 : 8 : 1) * i12, config));
                        Log.d("LruBitmapPool", sb2.toString());
                    }
                    this.f14691g++;
                } else {
                    this.f14690f++;
                    long j10 = this.f14689e;
                    ((l) this.f14685a).getClass();
                    this.f14689e = j10 - ((long) l.c(b10));
                    this.f14687c.getClass();
                    b10.setHasAlpha(true);
                    b10.setPremultiplied(true);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb3 = new StringBuilder("Get bitmap=");
                    ((l) this.f14685a).getClass();
                    char[] cArr2 = l.f11007a;
                    int i14 = i8 * i10;
                    int i15 = l.a.f11010a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                    if (i15 == 1) {
                        i11 = 1;
                    } else if (i15 == 2 || i15 == 3) {
                        i11 = 2;
                    } else if (i15 != 4) {
                        i11 = 4;
                    }
                    sb3.append(l.c(i11 * i14, config));
                    Log.v("LruBitmapPool", sb3.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    f();
                }
            } else {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized void h(long j10) {
        while (this.f14689e > j10) {
            l lVar = (l) this.f14685a;
            Bitmap c3 = lVar.f14700b.c();
            if (c3 != null) {
                lVar.a(Integer.valueOf(l.c(c3)), c3);
            }
            if (c3 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f14689e = 0;
                return;
            }
            this.f14687c.getClass();
            long j11 = this.f14689e;
            ((l) this.f14685a).getClass();
            this.f14689e = j11 - ((long) l.c(c3));
            this.f14693i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((l) this.f14685a).e(c3));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c3.recycle();
        }
    }
}
