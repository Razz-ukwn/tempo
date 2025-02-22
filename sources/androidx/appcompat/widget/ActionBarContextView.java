package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.c;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public class ActionBarContextView extends a {
    public CharSequence E;
    public CharSequence F;
    public View G;
    public View H;
    public View I;
    public LinearLayout J;
    public TextView K;
    public TextView L;
    public final int M;
    public final int N;
    public boolean O;
    public final int P;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.a f799a;

        public a(h.a aVar) {
            this.f799a = aVar;
        }

        public final void onClick(View view) {
            this.f799a.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903071(0x7f03001f, float:1.741295E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = cb.e.f3899e
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = f.a.a(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            java.util.WeakHashMap<android.view.View, d2.d1> r0 = d2.i0.f7217a
            d2.i0.d.q(r3, r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.M = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.N = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f921e = r4
            r4 = 2
            r0 = 2131492869(0x7f0c0005, float:1.8609202E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.P = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void f(h.a aVar) {
        View view = this.G;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.P, this, false);
            this.G = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.G);
        }
        View findViewById = this.G.findViewById(R.id.action_mode_close_button);
        this.H = findViewById;
        findViewById.setOnClickListener(new a(aVar));
        f e10 = aVar.e();
        c cVar = this.f920d;
        if (cVar != null) {
            cVar.b();
            c.a aVar2 = cVar.Q;
            if (aVar2 != null && aVar2.b()) {
                aVar2.f783j.dismiss();
            }
        }
        c cVar2 = new c(getContext());
        this.f920d = cVar2;
        cVar2.I = true;
        cVar2.J = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e10.b(this.f920d, this.f918b);
        c cVar3 = this.f920d;
        k kVar = cVar3.D;
        if (kVar == null) {
            k kVar2 = (k) cVar3.f693d.inflate(cVar3.B, this, false);
            cVar3.D = kVar2;
            kVar2.b(cVar3.f692c);
            cVar3.d(true);
        }
        k kVar3 = cVar3.D;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f919c = actionMenuView;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.q(actionMenuView, (Drawable) null);
        addView(this.f919c, layoutParams);
    }

    public final void g() {
        if (this.J == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.J = linearLayout;
            this.K = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.L = (TextView) this.J.findViewById(R.id.action_bar_subtitle);
            int i8 = this.M;
            if (i8 != 0) {
                this.K.setTextAppearance(getContext(), i8);
            }
            int i10 = this.N;
            if (i10 != 0) {
                this.L.setTextAppearance(getContext(), i10);
            }
        }
        this.K.setText(this.E);
        this.L.setText(this.F);
        boolean z10 = !TextUtils.isEmpty(this.E);
        boolean z11 = !TextUtils.isEmpty(this.F);
        int i11 = 0;
        this.L.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.J;
        if (!z10 && !z11) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (this.J.getParent() == null) {
            addView(this.J);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public final void h() {
        removeAllViews();
        this.I = null;
        this.f919c = null;
        this.f920d = null;
        View view = this.H;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f920d;
        if (cVar != null) {
            cVar.b();
            c.a aVar = this.f920d.Q;
            if (aVar != null && aVar.b()) {
                aVar.f783j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        boolean a10 = q1.a(this);
        int paddingRight = a10 ? (i11 - i8) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.G;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            int i13 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = a10 ? paddingRight - i13 : paddingRight + i13;
            int d10 = a.d(i15, paddingTop, paddingTop2, this.G, a10) + i15;
            paddingRight = a10 ? d10 - i14 : d10 + i14;
        }
        LinearLayout linearLayout = this.J;
        if (!(linearLayout == null || this.I != null || linearLayout.getVisibility() == 8)) {
            paddingRight += a.d(paddingRight, paddingTop, paddingTop2, this.J, a10);
        }
        View view2 = this.I;
        if (view2 != null) {
            a.d(paddingRight, paddingTop, paddingTop2, view2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i11 - i8) - getPaddingRight();
        ActionMenuView actionMenuView = this.f919c;
        if (actionMenuView != null) {
            a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a10);
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11 = 1073741824;
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i10) != 0) {
            int size = View.MeasureSpec.getSize(i8);
            int i12 = this.f921e;
            if (i12 <= 0) {
                i12 = View.MeasureSpec.getSize(i10);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i13 = i12 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
            View view = this.G;
            if (view != null) {
                int c3 = a.c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
                paddingLeft = c3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f919c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a.c(this.f919c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.J;
            if (linearLayout != null && this.I == null) {
                if (this.O) {
                    this.J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.J.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.J.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = a.c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.I;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i14 = layoutParams.width;
                int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i14 >= 0) {
                    paddingLeft = Math.min(i14, paddingLeft);
                }
                int i16 = layoutParams.height;
                if (i16 == -2) {
                    i11 = Integer.MIN_VALUE;
                }
                if (i16 >= 0) {
                    i13 = Math.min(i16, i13);
                }
                this.I.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i11));
            }
            if (this.f921e <= 0) {
                int childCount = getChildCount();
                int i17 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i17) {
                        i17 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i17);
                return;
            }
            setMeasuredDimension(size, i12);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public void setContentHeight(int i8) {
        this.f921e = i8;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.I;
        if (view2 != null) {
            removeView(view2);
        }
        this.I = view;
        if (!(view == null || (linearLayout = this.J) == null)) {
            removeView(linearLayout);
            this.J = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.F = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.E = charSequence;
        g();
        i0.o(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.O) {
            requestLayout();
        }
        this.O = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
