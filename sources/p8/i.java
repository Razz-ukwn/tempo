package p8;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import b1.b;
import java.util.ArrayList;
import p2.a;
import p2.d;
import p2.e;
import p8.c;

public final class i<S extends c> extends l {
    public static final a M = new a();
    public m<S> H;
    public final e I;
    public final d J;
    public float K;
    public boolean L = false;

    public class a extends p2.c {
        public a() {
            super("indicatorLevel");
        }

        public final float c(Object obj) {
            return ((i) obj).K * 10000.0f;
        }

        public final void e(float f10, Object obj) {
            i iVar = (i) obj;
            iVar.K = f10 / 10000.0f;
            iVar.invalidateSelf();
        }
    }

    public i(Context context, h hVar, d dVar) {
        super(context, hVar);
        this.H = dVar;
        dVar.f12519b = this;
        e eVar = new e();
        this.I = eVar;
        eVar.f12432b = (double) 1.0f;
        eVar.f12433c = false;
        eVar.f12431a = Math.sqrt((double) 50.0f);
        eVar.f12433c = false;
        d dVar2 = new d(this);
        this.J = dVar2;
        dVar2.f12428r = eVar;
        if (this.D != 1.0f) {
            this.D = 1.0f;
            invalidateSelf();
        }
    }

    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean d10 = super.d(z10, z11, z12);
        a aVar = this.f12515c;
        ContentResolver contentResolver = this.f12513a.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == 0.0f) {
            this.L = true;
        } else {
            this.L = false;
            float f11 = 50.0f / f10;
            e eVar = this.I;
            eVar.getClass();
            if (f11 > 0.0f) {
                eVar.f12431a = Math.sqrt((double) f11);
                eVar.f12433c = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return d10;
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.H.c(canvas, getBounds(), b());
            m<S> mVar = this.H;
            Paint paint = this.E;
            mVar.b(canvas, paint);
            Canvas canvas2 = canvas;
            this.H.a(canvas2, paint, 0.0f, this.K, b.b(this.f12514b.f12486c[0], this.F));
            canvas.restore();
        }
    }

    public final int getIntrinsicHeight() {
        return ((d) this.H).d();
    }

    public final int getIntrinsicWidth() {
        return ((d) this.H).d();
    }

    public final void jumpToCurrentState() {
        this.J.c();
        this.K = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public final boolean onLevelChange(int i8) {
        boolean z10 = this.L;
        d dVar = this.J;
        if (z10) {
            dVar.c();
            this.K = ((float) i8) / 10000.0f;
            invalidateSelf();
        } else {
            dVar.f12415b = this.K * 10000.0f;
            dVar.f12416c = true;
            float f10 = (float) i8;
            if (dVar.f12419f) {
                dVar.f12429s = f10;
            } else {
                if (dVar.f12428r == null) {
                    dVar.f12428r = new e(f10);
                }
                e eVar = dVar.f12428r;
                double d10 = (double) f10;
                eVar.f12439i = d10;
                double d11 = (double) ((float) d10);
                if (d11 <= ((double) Float.MAX_VALUE)) {
                    float f11 = dVar.f12420g;
                    if (d11 >= ((double) f11)) {
                        double abs = Math.abs((double) (dVar.f12422i * 0.75f));
                        eVar.f12434d = abs;
                        eVar.f12435e = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            boolean z11 = dVar.f12419f;
                            if (!z11 && !z11) {
                                dVar.f12419f = true;
                                if (!dVar.f12416c) {
                                    dVar.f12415b = dVar.f12418e.c(dVar.f12417d);
                                }
                                float f12 = dVar.f12415b;
                                if (f12 > Float.MAX_VALUE || f12 < f11) {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                                ThreadLocal<p2.a> threadLocal = p2.a.f12398f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new p2.a());
                                }
                                p2.a aVar = threadLocal.get();
                                ArrayList<a.b> arrayList = aVar.f12400b;
                                if (arrayList.size() == 0) {
                                    if (aVar.f12402d == null) {
                                        aVar.f12402d = new a.d(aVar.f12401c);
                                    }
                                    a.d dVar2 = aVar.f12402d;
                                    dVar2.f12406b.postFrameCallback(dVar2.f12407c);
                                }
                                if (!arrayList.contains(dVar)) {
                                    arrayList.add(dVar);
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
            }
        }
        return true;
    }
}
