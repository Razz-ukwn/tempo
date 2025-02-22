package p8;

import ag.n2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.Arrays;
import m8.s;
import p8.c;

public abstract class b<S extends c> extends ProgressBar {
    public a B;
    public boolean C = false;
    public int D = 4;
    public final a E;
    public final C0245b F;
    public final c G;
    public final d H;

    /* renamed from: a  reason: collision with root package name */
    public final S f12475a;

    /* renamed from: b  reason: collision with root package name */
    public int f12476b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12477c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12478d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12479e;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12480a;

        public a(CircularProgressIndicator circularProgressIndicator) {
            this.f12480a = circularProgressIndicator;
        }

        public final void run() {
            b bVar = this.f12480a;
            if (bVar.f12479e > 0) {
                SystemClock.uptimeMillis();
            }
            bVar.setVisibility(0);
        }
    }

    /* renamed from: p8.b$b  reason: collision with other inner class name */
    public class C0245b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12481a;

        public C0245b(CircularProgressIndicator circularProgressIndicator) {
            this.f12481a = circularProgressIndicator;
        }

        public final void run() {
            b bVar = this.f12481a;
            boolean z10 = false;
            ((l) bVar.getCurrentDrawable()).c(false, false, true);
            if ((bVar.getProgressDrawable() == null || !bVar.getProgressDrawable().isVisible()) && (bVar.getIndeterminateDrawable() == null || !bVar.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                bVar.setVisibility(4);
            }
            bVar.getClass();
        }
    }

    public class c extends s3.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f12482b;

        public c(CircularProgressIndicator circularProgressIndicator) {
            this.f12482b = circularProgressIndicator;
        }

        public final void a(Drawable drawable) {
            b bVar = this.f12482b;
            bVar.setIndeterminate(false);
            bVar.a(bVar.f12476b, bVar.f12477c);
        }
    }

    public class d extends s3.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f12483b;

        public d(CircularProgressIndicator circularProgressIndicator) {
            this.f12483b = circularProgressIndicator;
        }

        public final void a(Drawable drawable) {
            b bVar = this.f12483b;
            if (!bVar.C) {
                bVar.setVisibility(bVar.D);
            }
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132018257), attributeSet, R.attr.circularProgressIndicatorStyle);
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this;
        this.E = new a(circularProgressIndicator);
        this.F = new C0245b(circularProgressIndicator);
        this.G = new c(circularProgressIndicator);
        this.H = new d(circularProgressIndicator);
        Context context2 = getContext();
        this.f12475a = new h(context2, attributeSet);
        TypedArray d10 = s.d(context2, attributeSet, n2.D, R.attr.circularProgressIndicatorStyle, 2132018208, new int[0]);
        d10.getInt(5, -1);
        this.f12479e = Math.min(d10.getInt(3, -1), 1000);
        d10.recycle();
        this.B = new a();
        this.f12478d = true;
    }

    private m<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().H;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().H;
        }
    }

    public final void a(int i8, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i8);
            if (getProgressDrawable() != null && !z10) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f12476b = i8;
            this.f12477c = z10;
            this.C = true;
            if (getIndeterminateDrawable().isVisible()) {
                a aVar = this.B;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().I.h();
                    return;
                }
            }
            this.G.a(getIndeterminateDrawable());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (getWindowVisibility() == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, d2.d1> r0 = d2.i0.f7217a
            boolean r0 = d2.i0.g.b(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0034
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0034
            r0 = r4
        L_0x0010:
            int r2 = r0.getVisibility()
            r3 = 1
            if (r2 == 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0028
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            r0 = r3
            goto L_0x002d
        L_0x0026:
            r0 = r1
            goto L_0x002d
        L_0x0028:
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto L_0x0031
            goto L_0x0024
        L_0x002d:
            if (r0 == 0) goto L_0x0034
            r1 = r3
            goto L_0x0034
        L_0x0031:
            android.view.View r0 = (android.view.View) r0
            goto L_0x0010
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.b.b():boolean");
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f12475a.f12489f;
    }

    public int[] getIndicatorColor() {
        return this.f12475a.f12486c;
    }

    public int getShowAnimationBehavior() {
        return this.f12475a.f12488e;
    }

    public int getTrackColor() {
        return this.f12475a.f12487d;
    }

    public int getTrackCornerRadius() {
        return this.f12475a.f12485b;
    }

    public int getTrackThickness() {
        return this.f12475a.f12484a;
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().I.g(this.G);
        }
        i progressDrawable = getProgressDrawable();
        d dVar = this.H;
        if (progressDrawable != null) {
            i progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.B == null) {
                progressDrawable2.B = new ArrayList();
            }
            if (!progressDrawable2.B.contains(dVar)) {
                progressDrawable2.B.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            n indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.B == null) {
                indeterminateDrawable.B = new ArrayList();
            }
            if (!indeterminateDrawable.B.contains(dVar)) {
                indeterminateDrawable.B.add(dVar);
            }
        }
        if (b()) {
            if (this.f12479e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.F);
        removeCallbacks(this.E);
        ((l) getCurrentDrawable()).c(false, false, false);
        n indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.H;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(dVar);
            getIndeterminateDrawable().I.j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(dVar);
        }
        super.onDetachedFromWindow();
    }

    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public final synchronized void onMeasure(int i8, int i10) {
        m currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            setMeasuredDimension(((d) currentDrawingDelegate).d() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i8) : ((d) currentDrawingDelegate).d() + getPaddingLeft() + getPaddingRight(), ((d) currentDrawingDelegate).d() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i10) : ((d) currentDrawingDelegate).d() + getPaddingTop() + getPaddingBottom());
        }
    }

    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        boolean z10 = i8 == 0;
        if (this.f12478d) {
            ((l) getCurrentDrawable()).c(b(), false, z10);
        }
    }

    public final void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        if (this.f12478d) {
            ((l) getCurrentDrawable()).c(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.B = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f12515c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f12515c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i8) {
        this.f12475a.f12489f = i8;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z10) {
        if (z10 != isIndeterminate()) {
            l lVar = (l) getCurrentDrawable();
            if (lVar != null) {
                lVar.c(false, false, false);
            }
            super.setIndeterminate(z10);
            l lVar2 = (l) getCurrentDrawable();
            if (lVar2 != null) {
                lVar2.c(b(), false, false);
            }
            if ((lVar2 instanceof n) && b()) {
                ((n) lVar2).I.i();
            }
            this.C = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof n) {
            ((l) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{b1.b.e(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f12475a.f12486c = iArr;
            getIndeterminateDrawable().I.f();
            invalidate();
        }
    }

    public synchronized void setProgress(int i8) {
        if (!isIndeterminate()) {
            a(i8, false);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof i) {
            i iVar = (i) drawable;
            iVar.c(false, false, false);
            super.setProgressDrawable(iVar);
            iVar.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i8) {
        this.f12475a.f12488e = i8;
        invalidate();
    }

    public void setTrackColor(int i8) {
        S s10 = this.f12475a;
        if (s10.f12487d != i8) {
            s10.f12487d = i8;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i8) {
        S s10 = this.f12475a;
        if (s10.f12485b != i8) {
            s10.f12485b = Math.min(i8, s10.f12484a / 2);
        }
    }

    public void setTrackThickness(int i8) {
        S s10 = this.f12475a;
        if (s10.f12484a != i8) {
            s10.f12484a = i8;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i8) {
        if (i8 == 0 || i8 == 4 || i8 == 8) {
            this.D = i8;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public n<S> getIndeterminateDrawable() {
        return (n) super.getIndeterminateDrawable();
    }

    public i<S> getProgressDrawable() {
        return (i) super.getProgressDrawable();
    }
}
