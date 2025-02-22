package c5;

import ag.b1;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import c5.e;
import java.util.ArrayList;

public final class c extends Drawable implements e.b, Animatable {
    public int B;
    public final int C;
    public boolean D;
    public Paint E;
    public Rect F;

    /* renamed from: a  reason: collision with root package name */
    public final a f3726a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3727b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3728c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3729d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3730e;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final e f3731a;

        public a(e eVar) {
            this.f3731a = eVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f3730e = true;
        this.C = -1;
        b1.b(aVar);
        this.f3726a = aVar;
    }

    public final void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        e eVar = this.f3726a.f3731a;
        e.a aVar = eVar.f3741i;
        if ((aVar != null ? aVar.f3750e : -1) == eVar.f3733a.c() - 1) {
            this.B++;
        }
        int i8 = this.C;
        if (i8 != -1 && this.B >= i8) {
            stop();
        }
    }

    public final void b() {
        b1.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f3729d);
        a aVar = this.f3726a;
        if (aVar.f3731a.f3733a.c() == 1) {
            invalidateSelf();
        } else if (!this.f3727b) {
            this.f3727b = true;
            e eVar = aVar.f3731a;
            if (!eVar.f3742j) {
                ArrayList arrayList = eVar.f3735c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !eVar.f3738f) {
                        eVar.f3738f = true;
                        eVar.f3742j = false;
                        eVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.f3729d) {
            if (this.D) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.F == null) {
                    this.F = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.F);
                this.D = false;
            }
            e eVar = this.f3726a.f3731a;
            e.a aVar = eVar.f3741i;
            Bitmap bitmap = aVar != null ? aVar.C : eVar.f3744l;
            if (this.F == null) {
                this.F = new Rect();
            }
            Rect rect = this.F;
            if (this.E == null) {
                this.E = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.E);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f3726a;
    }

    public final int getIntrinsicHeight() {
        return this.f3726a.f3731a.f3748q;
    }

    public final int getIntrinsicWidth() {
        return this.f3726a.f3731a.f3747p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f3727b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.D = true;
    }

    public final void setAlpha(int i8) {
        if (this.E == null) {
            this.E = new Paint(2);
        }
        this.E.setAlpha(i8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.E == null) {
            this.E = new Paint(2);
        }
        this.E.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        b1.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f3729d);
        this.f3730e = z10;
        if (!z10) {
            this.f3727b = false;
            e eVar = this.f3726a.f3731a;
            ArrayList arrayList = eVar.f3735c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                eVar.f3738f = false;
            }
        } else if (this.f3728c) {
            b();
        }
        return super.setVisible(z10, z11);
    }

    public final void start() {
        this.f3728c = true;
        this.B = 0;
        if (this.f3730e) {
            b();
        }
    }

    public final void stop() {
        this.f3728c = false;
        this.f3727b = false;
        e eVar = this.f3726a.f3731a;
        ArrayList arrayList = eVar.f3735c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            eVar.f3738f = false;
        }
    }
}
