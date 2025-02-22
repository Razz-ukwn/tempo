package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.m1;
import cb.e;

public class ActionMenuItemView extends d0 implements k.a, View.OnClickListener, ActionMenuView.a {
    public h D;
    public CharSequence E;
    public Drawable F;
    public f.b G;
    public a H;
    public b I;
    public boolean J = m();
    public boolean K;
    public final int L;
    public int M;
    public final int N;

    public class a extends m0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final i.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.I;
            if (bVar == null || (aVar = c.this.Q) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.f$b r1 = r0.G
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.h r0 = r0.D
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                i.f r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.a()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f3898d, 0, 0);
        this.L = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.N = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.M = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return l();
    }

    public final boolean b() {
        return l() && this.D.getIcon() == null;
    }

    public final void c(h hVar) {
        this.D = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f748a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.H == null) {
            this.H = new a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public h getItemData() {
        return this.D;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        return i8 >= 480 || (i8 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.E);
        if (this.F != null) {
            if (!((this.D.f771y & 4) == 4) || (!this.J && !this.K)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.E : null);
        CharSequence charSequence2 = this.D.f763q;
        if (TextUtils.isEmpty(charSequence2)) {
            setContentDescription(z12 ? null : this.D.f752e);
        } else {
            setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.D.f764r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z12) {
                charSequence = this.D.f752e;
            }
            m1.a(this, charSequence);
            return;
        }
        m1.a(this, charSequence3);
    }

    public final void onClick(View view) {
        f.b bVar = this.G;
        if (bVar != null) {
            bVar.a(this.D);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.J = m();
        n();
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        boolean l10 = l();
        if (l10 && (i11 = this.M) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i8, i10);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.L;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i10);
        }
        if (!l10 && this.F != null) {
            super.setPadding((getMeasuredWidth() - this.F.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.D.hasSubMenu() || (aVar = this.H) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            h hVar = this.D;
            if (hVar != null) {
                f fVar = hVar.f760n;
                fVar.f732k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i8 = this.N;
            if (intrinsicWidth > i8) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i8) / ((float) intrinsicWidth)));
                intrinsicWidth = i8;
            }
            if (intrinsicHeight > i8) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i8) / ((float) intrinsicHeight)));
            } else {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i8);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.G = bVar;
    }

    public final void setPadding(int i8, int i10, int i11, int i12) {
        this.M = i8;
        super.setPadding(i8, i10, i11, i12);
    }

    public void setPopupCallback(b bVar) {
        this.I = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.E = charSequence;
        n();
    }
}
