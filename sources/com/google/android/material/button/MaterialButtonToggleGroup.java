package com.google.android.material.button;

import ag.n2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.p;
import e2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import m8.s;
import m8.v;
import v8.i;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int G = 0;
    public boolean B = false;
    public boolean C;
    public boolean D;
    public final int E;
    public HashSet F = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5796a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final e f5797b = new e();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<d> f5798c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final a f5799d = new a();

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f5800e;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }

    public class b extends d2.a {
        public b() {
        }

        public final void d(View view, i iVar) {
            int i8;
            this.f7186a.onInitializeAccessibilityNodeInfo(view, iVar.f7779a);
            int i10 = MaterialButtonToggleGroup.G;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i11 = 0;
                i8 = 0;
                while (true) {
                    if (i11 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i11) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.d(i11)) {
                            i8++;
                        }
                        i11++;
                    }
                }
            }
            i8 = -1;
            iVar.l(i.d.a(0, 1, i8, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final v8.a f5803e = new v8.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final v8.c f5804a;

        /* renamed from: b  reason: collision with root package name */
        public final v8.c f5805b;

        /* renamed from: c  reason: collision with root package name */
        public final v8.c f5806c;

        /* renamed from: d  reason: collision with root package name */
        public final v8.c f5807d;

        public c(v8.c cVar, v8.c cVar2, v8.c cVar3, v8.c cVar4) {
            this.f5804a = cVar;
            this.f5805b = cVar3;
            this.f5806c = cVar4;
            this.f5807d = cVar2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(c9.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018221), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d10 = s.d(getContext(), attributeSet, n2.Q, R.attr.materialButtonToggleGroupStyle, 2132018221, new int[0]);
        setSingleSelection(d10.getBoolean(3, false));
        this.E = d10.getResourceId(1, -1);
        this.D = d10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (d(i8)) {
                return i8;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i8 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && d(i10)) {
                i8++;
            }
        }
        return i8;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            materialButton.setId(i0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5797b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i8 = firstVisibleChildIndex + 1; i8 < getChildCount(); i8++) {
                MaterialButton c3 = c(i8);
                int min = Math.min(c3.getStrokeWidth(), c(i8 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c3.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    p.g(layoutParams2, 0);
                    p.h(layoutParams2, -min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    p.h(layoutParams2, 0);
                }
                c3.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                p.g(layoutParams3, 0);
                p.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i8, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        v8.i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f5796a.add(new c(shapeAppearanceModel.f16281e, shapeAppearanceModel.f16284h, shapeAppearanceModel.f16282f, shapeAppearanceModel.f16283g));
        materialButton.setEnabled(isEnabled());
        i0.n(materialButton, new b());
    }

    public final void b(int i8, boolean z10) {
        if (i8 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i8);
            return;
        }
        HashSet hashSet = new HashSet(this.F);
        if (z10 && !hashSet.contains(Integer.valueOf(i8))) {
            if (this.C && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i8));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i8))) {
            if (!this.D || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i8));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i8) {
        return (MaterialButton) getChildAt(i8);
    }

    public final boolean d(int i8) {
        return getChildAt(i8).getVisibility() != 8;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5799d);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            treeMap.put(c(i8), Integer.valueOf(i8));
        }
        this.f5800e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.F;
        this.F = new HashSet(set);
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            int id2 = c(i8).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.B = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.B = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f5798c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i8 = 0; i8 < childCount; i8++) {
            MaterialButton c3 = c(i8);
            if (c3.getVisibility() != 8) {
                v8.i shapeAppearanceModel = c3.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                c cVar2 = (c) this.f5796a.get(i8);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    v8.a aVar2 = c.f5803e;
                    if (i8 == firstVisibleChildIndex) {
                        cVar = z10 ? v.c(this) ? new c(aVar2, aVar2, cVar2.f5805b, cVar2.f5806c) : new c(cVar2.f5804a, cVar2.f5807d, aVar2, aVar2) : new c(cVar2.f5804a, aVar2, cVar2.f5805b, aVar2);
                    } else if (i8 == lastVisibleChildIndex) {
                        cVar = z10 ? v.c(this) ? new c(cVar2.f5804a, cVar2.f5807d, aVar2, aVar2) : new c(aVar2, aVar2, cVar2.f5805b, cVar2.f5806c) : new c(aVar2, cVar2.f5807d, aVar2, cVar2.f5806c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.e(0.0f);
                    aVar.f(0.0f);
                    aVar.d(0.0f);
                    aVar.c(0.0f);
                } else {
                    aVar.f16293e = cVar2.f5804a;
                    aVar.f16296h = cVar2.f5807d;
                    aVar.f16294f = cVar2.f5805b;
                    aVar.f16295g = cVar2.f5806c;
                }
                c3.setShapeAppearanceModel(new v8.i(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.C || this.F.isEmpty()) {
            return -1;
        }
        return ((Integer) this.F.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            int id2 = c(i8).getId();
            if (this.F.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i8, int i10) {
        Integer[] numArr = this.f5800e;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.E;
        if (i8 != -1) {
            e(Collections.singleton(Integer.valueOf(i8)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.c.a(1, getVisibleButtonCount(), this.C ? 1 : 2).f7797a);
    }

    public final void onMeasure(int i8, int i10) {
        f();
        a();
        super.onMeasure(i8, i10);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f5796a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            c(i8).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.D = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            e(new HashSet());
        }
    }

    public void setSingleSelection(int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }
}
