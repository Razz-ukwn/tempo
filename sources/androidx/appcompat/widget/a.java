package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.e1;
import d2.i0;

public abstract class a extends ViewGroup {
    public d1 B;
    public boolean C;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public final C0012a f917a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f918b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f919c;

    /* renamed from: d  reason: collision with root package name */
    public c f920d;

    /* renamed from: e  reason: collision with root package name */
    public int f921e;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0012a implements e1 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f922a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f923b;

        public C0012a() {
        }

        public final void a() {
            if (!this.f922a) {
                a aVar = a.this;
                aVar.B = null;
                a.super.setVisibility(this.f923b);
            }
        }

        public final void b(View view) {
            this.f922a = true;
        }

        public final void d() {
            a.super.setVisibility(0);
            this.f922a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i8, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i10);
        return Math.max(0, (i8 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i8, int i10, int i11, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z10) {
            view.layout(i8 - measuredWidth, i12, i8, measuredHeight + i12);
        } else {
            view.layout(i8, i12, i8 + measuredWidth, measuredHeight + i12);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final d1 e(int i8, long j10) {
        d1 d1Var = this.B;
        if (d1Var != null) {
            d1Var.b();
        }
        C0012a aVar = this.f917a;
        if (i8 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            d1 a10 = i0.a(this);
            a10.a(1.0f);
            a10.c(j10);
            a.this.B = a10;
            aVar.f923b = i8;
            a10.d(aVar);
            return a10;
        }
        d1 a11 = i0.a(this);
        a11.a(0.0f);
        a11.c(j10);
        a.this.B = a11;
        aVar.f923b = i8;
        a11.d(aVar);
        return a11;
    }

    public int getAnimatedVisibility() {
        return this.B != null ? this.f917a.f923b : getVisibility();
    }

    public int getContentHeight() {
        return this.f921e;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, e.f3895b, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f920d;
        if (cVar != null) {
            Configuration configuration2 = cVar.f691b.getResources().getConfiguration();
            int i8 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            cVar.M = (configuration2.smallestScreenWidthDp > 600 || i8 > 600 || (i8 > 960 && i10 > 720) || (i8 > 720 && i10 > 960)) ? 5 : (i8 >= 500 || (i8 > 640 && i10 > 480) || (i8 > 480 && i10 > 640)) ? 4 : i8 >= 360 ? 3 : 2;
            f fVar = cVar.f692c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setContentHeight(int i8) {
        this.f921e = i8;
        requestLayout();
    }

    public void setVisibility(int i8) {
        if (i8 != getVisibility()) {
            d1 d1Var = this.B;
            if (d1Var != null) {
                d1Var.b();
            }
            super.setVisibility(i8);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f917a = new C0012a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f918b = context;
        } else {
            this.f918b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
