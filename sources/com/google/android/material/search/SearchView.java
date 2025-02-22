package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.quickkonnect.silencio.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;

public final class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public SearchBar f6019a;

    /* renamed from: b  reason: collision with root package name */
    public int f6020b;

    /* renamed from: c  reason: collision with root package name */
    public c f6021c;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (!(searchView.f6019a != null) && (view2 instanceof SearchBar)) {
                searchView.setupWithSearchBar((SearchBar) view2);
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class a extends k2.a {
        public static final Parcelable.Creator<a> CREATOR = new C0077a();

        /* renamed from: c  reason: collision with root package name */
        public String f6022c;

        /* renamed from: d  reason: collision with root package name */
        public int f6023d;

        /* renamed from: com.google.android.material.search.SearchView$a$a  reason: collision with other inner class name */
        public class C0077a implements Parcelable.ClassLoaderCreator<a> {
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

        public a() {
            throw null;
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6022c = parcel.readString();
            this.f6023d = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeString(this.f6022c);
            parcel.writeInt(this.f6023d);
        }
    }

    public interface b {
        void a();
    }

    public enum c {
        ;

        /* access modifiers changed from: public */
        c() {
        }
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f6019a;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
    }

    private void setUpHeaderLayout(int i8) {
        if (i8 != -1) {
            LayoutInflater.from(getContext()).inflate(i8, (ViewGroup) null, false);
            throw null;
        }
    }

    private void setUpStatusBarSpacer(int i8) {
        throw null;
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
    }

    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f6021c;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f6020b;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1.b.k(this);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f6020b = activityWindow.getAttributes().softInputMode;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f10267a);
        setText((CharSequence) aVar.f6022c);
        setVisible(aVar.f6023d == 0);
    }

    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            Editable text = getText();
            if (text != null) {
                text.toString();
            }
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void setAnimatedNavigationIcon(boolean z10) {
    }

    public void setAutoShowKeyboard(boolean z10) {
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z10) {
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            new HashMap(viewGroup.getChildCount());
        }
        int i8 = 0;
        while (i8 < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i8) == this) {
                i8++;
            } else {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        throw null;
    }

    public void setTransitionState(c cVar) {
        if (!this.f6021c.equals(cVar)) {
            this.f6021c = cVar;
            for (b a10 : new LinkedHashSet((Collection) null)) {
                a10.a();
            }
        }
    }

    public void setUseWindowInsetsController(boolean z10) {
    }

    public void setVisible(boolean z10) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f6019a = searchBar;
        throw null;
    }

    public void setHint(int i8) {
        throw null;
    }

    public void setText(int i8) {
        throw null;
    }
}
