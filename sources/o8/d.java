package o8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import e2.i;
import java.util.HashSet;
import java.util.WeakHashMap;
import m8.q;
import v8.i;
import z7.b;

public abstract class d extends ViewGroup implements k {

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f12221c0 = {16842912};

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f12222d0 = {-16842910};
    public a[] B;
    public int C = 0;
    public int D = 0;
    public ColorStateList E;
    public int F;
    public ColorStateList G;
    public final ColorStateList H = c();
    public int I;
    public int J;
    public Drawable K;
    public ColorStateList L;
    public int M;
    public final SparseArray<x7.a> N = new SparseArray<>(5);
    public int O = -1;
    public int P = -1;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public i U;
    public boolean V = false;
    public ColorStateList W;

    /* renamed from: a  reason: collision with root package name */
    public final r3.a f12223a;

    /* renamed from: a0  reason: collision with root package name */
    public e f12224a0;

    /* renamed from: b  reason: collision with root package name */
    public final a f12225b;

    /* renamed from: b0  reason: collision with root package name */
    public f f12226b0;

    /* renamed from: c  reason: collision with root package name */
    public final c2.f f12227c = new c2.f(5);

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f12228d = new SparseArray<>(5);

    /* renamed from: e  reason: collision with root package name */
    public int f12229e;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f12230a;

        public a(b bVar) {
            this.f12230a = bVar;
        }

        public final void onClick(View view) {
            h itemData = ((a) view).getItemData();
            d dVar = this.f12230a;
            if (!dVar.f12226b0.q(itemData, dVar.f12224a0, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public d(Context context) {
        super(context);
        if (isInEditMode()) {
            this.f12223a = null;
        } else {
            r3.a aVar = new r3.a();
            this.f12223a = aVar;
            aVar.O(0);
            aVar.D((long) n8.a.c(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            aVar.F(n8.a.d(getContext(), R.attr.motionEasingStandard, v7.a.f16229b));
            aVar.L(new q());
        }
        this.f12225b = new a((b) this);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.s(this, 1);
    }

    private a getNewItem() {
        a aVar = (a) this.f12227c.b();
        return aVar == null ? e(getContext()) : aVar;
    }

    private void setBadgeIfNeeded(a aVar) {
        x7.a aVar2;
        int id2 = aVar.getId();
        if ((id2 != -1) && (aVar2 = this.N.get(id2)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        removeAllViews();
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    this.f12227c.a(aVar);
                    if (aVar.f12212c0 != null) {
                        ImageView imageView = aVar.I;
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            x7.a aVar2 = aVar.f12212c0;
                            if (aVar2 != null) {
                                if (aVar2.d() != null) {
                                    aVar2.d().setForeground((Drawable) null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        aVar.f12212c0 = null;
                    }
                    aVar.N = null;
                    aVar.T = 0.0f;
                    aVar.f12207a = false;
                }
            }
        }
        if (this.f12226b0.size() == 0) {
            this.C = 0;
            this.D = 0;
            this.B = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < this.f12226b0.size(); i8++) {
            hashSet.add(Integer.valueOf(this.f12226b0.getItem(i8).getItemId()));
        }
        int i10 = 0;
        while (true) {
            SparseArray<x7.a> sparseArray = this.N;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i10);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i10++;
        }
        this.B = new a[this.f12226b0.size()];
        int i11 = this.f12229e;
        boolean z10 = i11 != -1 ? i11 == 0 : this.f12226b0.l().size() > 3;
        for (int i12 = 0; i12 < this.f12226b0.size(); i12++) {
            this.f12224a0.f12232b = true;
            this.f12226b0.getItem(i12).setCheckable(true);
            this.f12224a0.f12232b = false;
            a newItem = getNewItem();
            this.B[i12] = newItem;
            newItem.setIconTintList(this.E);
            newItem.setIconSize(this.F);
            newItem.setTextColor(this.H);
            newItem.setTextAppearanceInactive(this.I);
            newItem.setTextAppearanceActive(this.J);
            newItem.setTextColor(this.G);
            int i13 = this.O;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.P;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            newItem.setActiveIndicatorWidth(this.R);
            newItem.setActiveIndicatorHeight(this.S);
            newItem.setActiveIndicatorMarginHorizontal(this.T);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.V);
            newItem.setActiveIndicatorEnabled(this.Q);
            Drawable drawable = this.K;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.M);
            }
            newItem.setItemRippleColor(this.L);
            newItem.setShifting(z10);
            newItem.setLabelVisibilityMode(this.f12229e);
            h hVar = (h) this.f12226b0.getItem(i12);
            newItem.c(hVar);
            newItem.setItemPosition(i12);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f12228d;
            int i15 = hVar.f748a;
            newItem.setOnTouchListener(sparseArray2.get(i15));
            newItem.setOnClickListener(this.f12225b);
            int i16 = this.C;
            if (i16 != 0 && i15 == i16) {
                this.D = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f12226b0.size() - 1, this.D);
        this.D = min;
        this.f12226b0.getItem(min).setChecked(true);
    }

    public final void b(f fVar) {
        this.f12226b0 = fVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList b10 = t1.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i8 = typedValue.data;
        int defaultColor = b10.getDefaultColor();
        int[] iArr = f12222d0;
        return new ColorStateList(new int[][]{iArr, f12221c0, ViewGroup.EMPTY_STATE_SET}, new int[]{b10.getColorForState(iArr, defaultColor), i8, defaultColor});
    }

    public final v8.f d() {
        if (this.U == null || this.W == null) {
            return null;
        }
        v8.f fVar = new v8.f(this.U);
        fVar.m(this.W);
        return fVar;
    }

    public abstract z7.a e(Context context);

    public SparseArray<x7.a> getBadgeDrawables() {
        return this.N;
    }

    public ColorStateList getIconTintList() {
        return this.E;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.W;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.Q;
    }

    public int getItemActiveIndicatorHeight() {
        return this.S;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.T;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.U;
    }

    public int getItemActiveIndicatorWidth() {
        return this.R;
    }

    public Drawable getItemBackground() {
        a[] aVarArr = this.B;
        return (aVarArr == null || aVarArr.length <= 0) ? this.K : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.M;
    }

    public int getItemIconSize() {
        return this.F;
    }

    public int getItemPaddingBottom() {
        return this.P;
    }

    public int getItemPaddingTop() {
        return this.O;
    }

    public ColorStateList getItemRippleColor() {
        return this.L;
    }

    public int getItemTextAppearanceActive() {
        return this.J;
    }

    public int getItemTextAppearanceInactive() {
        return this.I;
    }

    public ColorStateList getItemTextColor() {
        return this.G;
    }

    public int getLabelVisibilityMode() {
        return this.f12229e;
    }

    public f getMenu() {
        return this.f12226b0;
    }

    public int getSelectedItemId() {
        return this.C;
    }

    public int getSelectedItemPosition() {
        return this.D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.c.a(1, this.f12226b0.l().size(), 1).f7797a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.E = colorStateList;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.Q = z10;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorEnabled : aVarArr) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i8) {
        this.S = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorHeight : aVarArr) {
                activeIndicatorHeight.setActiveIndicatorHeight(i8);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i8) {
        this.T = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorMarginHorizontal : aVarArr) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i8);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.V = z10;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorResizeable : aVarArr) {
                activeIndicatorResizeable.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(v8.i iVar) {
        this.U = iVar;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorDrawable : aVarArr) {
                activeIndicatorDrawable.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i8) {
        this.R = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a activeIndicatorWidth : aVarArr) {
                activeIndicatorWidth.setActiveIndicatorWidth(i8);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.K = drawable;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i8) {
        this.M = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i8);
            }
        }
    }

    public void setItemIconSize(int i8) {
        this.F = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a iconSize : aVarArr) {
                iconSize.setIconSize(i8);
            }
        }
    }

    public void setItemPaddingBottom(int i8) {
        this.P = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a itemPaddingBottom : aVarArr) {
                itemPaddingBottom.setItemPaddingBottom(i8);
            }
        }
    }

    public void setItemPaddingTop(int i8) {
        this.O = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a itemPaddingTop : aVarArr) {
                itemPaddingTop.setItemPaddingTop(i8);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a itemRippleColor : aVarArr) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i8) {
        this.J = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i8);
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i8) {
        this.I = i8;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i8);
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        a[] aVarArr = this.B;
        if (aVarArr != null) {
            for (a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i8) {
        this.f12229e = i8;
    }

    public void setPresenter(e eVar) {
        this.f12224a0 = eVar;
    }
}
