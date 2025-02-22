package p8;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;
import p8.b;

public abstract class l extends Drawable implements Animatable {
    public static final a G = new a();
    public ArrayList B;
    public boolean C;
    public float D;
    public final Paint E = new Paint();
    public int F;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12513a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12514b;

    /* renamed from: c  reason: collision with root package name */
    public a f12515c;

    /* renamed from: d  reason: collision with root package name */
    public ValueAnimator f12516d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f12517e;

    public class a extends Property<l, Float> {
        public a() {
            super(Float.class, "growFraction");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((l) obj).b());
        }

        public final void set(Object obj, Object obj2) {
            l lVar = (l) obj;
            float floatValue = ((Float) obj2).floatValue();
            if (lVar.D != floatValue) {
                lVar.D = floatValue;
                lVar.invalidateSelf();
            }
        }
    }

    public l(Context context, h hVar) {
        this.f12513a = context;
        this.f12514b = hVar;
        this.f12515c = new a();
        setAlpha(255);
    }

    public final float b() {
        c cVar = this.f12514b;
        boolean z10 = true;
        if (!(cVar.f12488e != 0)) {
            if (cVar.f12489f == 0) {
                z10 = false;
            }
            if (!z10) {
                return 1.0f;
            }
        }
        return this.D;
    }

    public final boolean c(boolean z10, boolean z11, boolean z12) {
        a aVar = this.f12515c;
        ContentResolver contentResolver = this.f12513a.getContentResolver();
        aVar.getClass();
        return d(z10, z11, z12 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator = this.f12516d;
        a aVar = G;
        if (valueAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, new float[]{0.0f, 1.0f});
            this.f12516d = ofFloat;
            ofFloat.setDuration(500);
            this.f12516d.setInterpolator(v7.a.f16229b);
            ValueAnimator valueAnimator2 = this.f12516d;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                this.f12516d = valueAnimator2;
                valueAnimator2.addListener(new j(this));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.f12517e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, new float[]{1.0f, 0.0f});
            this.f12517e = ofFloat2;
            ofFloat2.setDuration(500);
            this.f12517e.setInterpolator(v7.a.f16229b);
            ValueAnimator valueAnimator3 = this.f12517e;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                this.f12517e = valueAnimator3;
                valueAnimator3.addListener(new k(this));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        boolean z13 = false;
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator4 = z10 ? this.f12516d : this.f12517e;
        ValueAnimator valueAnimator5 = z10 ? this.f12517e : this.f12516d;
        if (!z12) {
            if (valueAnimator5.isRunning()) {
                boolean z14 = this.C;
                this.C = true;
                valueAnimator5.cancel();
                this.C = z14;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z15 = this.C;
                this.C = true;
                valueAnimator4.end();
                this.C = z15;
            }
            return super.setVisible(z10, false);
        } else if (z12 && valueAnimator4.isRunning()) {
            return false;
        } else {
            boolean z16 = !z10 || super.setVisible(z10, false);
            c cVar = this.f12514b;
            if (!z10 ? cVar.f12489f != 0 : cVar.f12488e != 0) {
                z13 = true;
            }
            if (!z13) {
                boolean z17 = this.C;
                this.C = true;
                valueAnimator4.end();
                this.C = z17;
                return z16;
            }
            if (z11 || !valueAnimator4.isPaused()) {
                valueAnimator4.start();
            } else {
                valueAnimator4.resume();
            }
            return z16;
        }
    }

    public final void e(b.d dVar) {
        ArrayList arrayList = this.B;
        if (arrayList != null && arrayList.contains(dVar)) {
            this.B.remove(dVar);
            if (this.B.isEmpty()) {
                this.B = null;
            }
        }
    }

    public final int getAlpha() {
        return this.F;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        ValueAnimator valueAnimator = this.f12516d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        ValueAnimator valueAnimator2 = this.f12517e;
        return valueAnimator2 != null && valueAnimator2.isRunning();
    }

    public final void setAlpha(int i8) {
        this.F = i8;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.E.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        return c(z10, z11, true);
    }

    public final void start() {
        d(true, true, false);
    }

    public final void stop() {
        d(false, true, false);
    }
}
