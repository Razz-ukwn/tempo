package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import java.util.Arrays;
import java.util.HashMap;
import l1.d;
import l1.i;

public abstract class a extends View {
    public String B;
    public View[] C = null;
    public final HashMap<Integer, String> D = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int[] f1599a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    public int f1600b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1601c;

    /* renamed from: d  reason: collision with root package name */
    public i f1602d;

    /* renamed from: e  reason: collision with root package name */
    public String f1603e;

    public a(Context context) {
        super(context);
        this.f1601c = context;
        i((AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00a7
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00a7
        L_0x000a:
            android.content.Context r0 = r5.f1601c
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0021
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0021:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.I
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x004f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.I
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            int r3 = r5.h(r1, r6)
        L_0x0064:
            if (r3 != 0) goto L_0x0070
            java.lang.Class<o1.d> r1 = o1.d.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0070 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            if (r3 != 0) goto L_0x0080
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0080:
            if (r3 == 0) goto L_0x008f
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.D
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.d(r3)
            goto L_0x00a7
        L_0x008f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.c(java.lang.String):void");
    }

    public final void d(int i8) {
        if (i8 != getId()) {
            int i10 = this.f1600b + 1;
            int[] iArr = this.f1599a;
            if (i10 > iArr.length) {
                this.f1599a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1599a;
            int i11 = this.f1600b;
            iArr2[i11] = i8;
            this.f1600b = i11 + 1;
        }
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f1601c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = constraintLayout.getChildAt(i8);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        d(childAt.getId());
                    }
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i8 = 0; i8 < this.f1600b; i8++) {
            View view = constraintLayout.f1542a.get(this.f1599a[i8]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1599a, this.f1600b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1601c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gf.f4584c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1603e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.B = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(d dVar, boolean z10) {
    }

    public final void k() {
        if (this.f1602d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).f1579q0 = this.f1602d;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1603e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.B;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i8, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1603e = str;
        if (str != null) {
            int i8 = 0;
            this.f1600b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i8);
                if (indexOf == -1) {
                    c(str.substring(i8));
                    return;
                } else {
                    c(str.substring(i8, indexOf));
                    i8 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.B = str;
        if (str != null) {
            int i8 = 0;
            this.f1600b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i8);
                if (indexOf == -1) {
                    e(str.substring(i8));
                    return;
                } else {
                    e(str.substring(i8, indexOf));
                    i8 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1603e = null;
        this.f1600b = 0;
        for (int d10 : iArr) {
            d(d10);
        }
    }

    public final void setTag(int i8, Object obj) {
        super.setTag(i8, obj);
        if (obj == null && this.f1603e == null) {
            d(i8);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1601c = context;
        i(attributeSet);
    }
}
