package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.n0;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import e2.i;
import h2.l;
import java.util.WeakHashMap;
import m8.f;
import u1.f;
import w1.a;

public class NavigationMenuItemView extends f implements k.a {

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f6005e0 = {16842912};
    public int R;
    public boolean S;
    public boolean T;
    public final CheckedTextView U;
    public FrameLayout V;
    public h W;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f6006a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6007b0;

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f6008c0;

    /* renamed from: d0  reason: collision with root package name */
    public final a f6009d0;

    public class a extends d2.a {
        public a() {
        }

        public final void d(View view, i iVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f7186a;
            AccessibilityNodeInfo accessibilityNodeInfo = iVar.f7779a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.T);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.V == null) {
                this.V = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.V.removeAllViews();
            this.V.addView(view);
        }
    }

    public final void c(h hVar) {
        StateListDrawable stateListDrawable;
        this.W = hVar;
        int i8 = hVar.f748a;
        if (i8 > 0) {
            setId(i8);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6005e0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f752e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f763q);
        m1.a(this, hVar.f764r);
        h hVar2 = this.W;
        if (!(hVar2.f752e == null && hVar2.getIcon() == null && this.W.getActionView() != null)) {
            z10 = false;
        }
        CheckedTextView checkedTextView = this.U;
        if (z10) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.V;
            if (frameLayout != null) {
                n0.a aVar = (n0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.V.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.V;
        if (frameLayout2 != null) {
            n0.a aVar2 = (n0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.V.setLayoutParams(aVar2);
        }
    }

    public h getItemData() {
        return this.W;
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        h hVar = this.W;
        if (hVar != null && hVar.isCheckable() && this.W.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6005e0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.T != z10) {
            this.T = z10;
            this.f6009d0.h(this.U, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.U;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z10 ? 1 : 0);
    }

    public void setHorizontalPadding(int i8) {
        setPadding(i8, getPaddingTop(), i8, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f6007b0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.f6006a0);
            }
            int i8 = this.R;
            drawable.setBounds(0, 0, i8, i8);
        } else if (this.S) {
            if (this.f6008c0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = u1.f.f15671a;
                Drawable a10 = f.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.f6008c0 = a10;
                if (a10 != null) {
                    int i10 = this.R;
                    a10.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f6008c0;
        }
        l.b.e(this.U, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i8) {
        this.U.setCompoundDrawablePadding(i8);
    }

    public void setIconSize(int i8) {
        this.R = i8;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f6006a0 = colorStateList;
        this.f6007b0 = colorStateList != null;
        h hVar = this.W;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i8) {
        this.U.setMaxLines(i8);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.S = z10;
    }

    public void setTextAppearance(int i8) {
        this.U.setTextAppearance(i8);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.U.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.U.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f6009d0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.U = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        i0.n(checkedTextView, aVar);
    }
}
