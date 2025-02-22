package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.b;
import com.google.android.material.appbar.AppBarLayout;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import m8.t;
import v8.f;

public final class SearchBar extends Toolbar {

    /* renamed from: t0  reason: collision with root package name */
    public Drawable f6014t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f6015u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f6016v0;

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton a10 = t.a(this);
        if (a10 != null) {
            a10.setClickable(!z10);
            a10.setFocusable(!z10);
            Drawable background = a10.getBackground();
            if (background != null) {
                this.f6014t0 = background;
            }
            a10.setBackgroundDrawable(z10 ? null : this.f6014t0);
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        return i0.i.i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.f6015u0;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    public final void k(int i8) {
        super.k(i8);
        this.f6015u0 = i8;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.l(this, (f) null);
        throw null;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f10267a);
        setText((CharSequence) aVar.f6018c);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a((Toolbar.i) super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f6018c = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f6016v0 = z10;
        if (getLayoutParams() instanceof AppBarLayout.c) {
            AppBarLayout.c cVar = (AppBarLayout.c) getLayoutParams();
            if (this.f6016v0) {
                if (cVar.f5684a == 0) {
                    cVar.f5684a = 53;
                }
            } else if (cVar.f5684a == 53) {
                cVar.f5684a = 0;
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i8) {
        if (getStrokeColor() != i8) {
            ColorStateList.valueOf(i8);
            throw null;
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            throw null;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: g  reason: collision with root package name */
        public boolean f6017g = false;

        public ScrollingViewBehavior() {
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.d(coordinatorLayout, view, view2);
            if (!this.f6017g && (view2 instanceof AppBarLayout)) {
                this.f6017g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class a extends k2.a {
        public static final Parcelable.Creator<a> CREATOR = new C0076a();

        /* renamed from: c  reason: collision with root package name */
        public String f6018c;

        /* renamed from: com.google.android.material.search.SearchBar$a$a  reason: collision with other inner class name */
        public class C0076a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new a[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6018c = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeString(this.f6018c);
        }

        public a(Toolbar.i iVar) {
            super(iVar);
        }
    }

    public void setHint(int i8) {
        throw null;
    }

    public void setText(int i8) {
        throw null;
    }
}
