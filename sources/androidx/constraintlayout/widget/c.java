package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import java.util.HashMap;

public final class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public b f1696a;

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public b getConstraintSet() {
        if (this.f1696a == null) {
            this.f1696a = new b();
        }
        b bVar = this.f1696a;
        bVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, b.a> hashMap = bVar.f1609c;
        hashMap.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!bVar.f1608b || id2 != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id2))) {
                    hashMap.put(Integer.valueOf(id2), new b.a());
                }
                b.a aVar2 = hashMap.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof a) {
                        a aVar3 = (a) childAt;
                        aVar2.c(id2, aVar);
                        if (aVar3 instanceof Barrier) {
                            b.C0019b bVar2 = aVar2.f1613d;
                            bVar2.f1644h0 = 1;
                            Barrier barrier = (Barrier) aVar3;
                            bVar2.f1640f0 = barrier.getType();
                            bVar2.f1646i0 = barrier.getReferencedIds();
                            bVar2.f1642g0 = barrier.getMargin();
                        }
                    }
                    aVar2.c(id2, aVar);
                }
                i8++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1696a;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0  reason: collision with root package name */
        public final float f1697r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f1698s0;

        /* renamed from: t0  reason: collision with root package name */
        public final float f1699t0;

        /* renamed from: u0  reason: collision with root package name */
        public final float f1700u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f1701v0;

        /* renamed from: w0  reason: collision with root package name */
        public final float f1702w0;

        /* renamed from: x0  reason: collision with root package name */
        public final float f1703x0;

        /* renamed from: y0  reason: collision with root package name */
        public final float f1704y0;

        /* renamed from: z0  reason: collision with root package name */
        public final float f1705z0;

        public a() {
            this.f1697r0 = 1.0f;
            this.f1698s0 = false;
            this.f1699t0 = 0.0f;
            this.f1700u0 = 0.0f;
            this.f1701v0 = 0.0f;
            this.f1702w0 = 0.0f;
            this.f1703x0 = 1.0f;
            this.f1704y0 = 1.0f;
            this.f1705z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1697r0 = 1.0f;
            this.f1698s0 = false;
            this.f1699t0 = 0.0f;
            this.f1700u0 = 0.0f;
            this.f1701v0 = 0.0f;
            this.f1702w0 = 0.0f;
            this.f1703x0 = 1.0f;
            this.f1704y0 = 1.0f;
            this.f1705z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gf.f4586e);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 15) {
                    this.f1697r0 = obtainStyledAttributes.getFloat(index, this.f1697r0);
                } else if (index == 28) {
                    this.f1699t0 = obtainStyledAttributes.getFloat(index, this.f1699t0);
                    this.f1698s0 = true;
                } else if (index == 23) {
                    this.f1701v0 = obtainStyledAttributes.getFloat(index, this.f1701v0);
                } else if (index == 24) {
                    this.f1702w0 = obtainStyledAttributes.getFloat(index, this.f1702w0);
                } else if (index == 22) {
                    this.f1700u0 = obtainStyledAttributes.getFloat(index, this.f1700u0);
                } else if (index == 20) {
                    this.f1703x0 = obtainStyledAttributes.getFloat(index, this.f1703x0);
                } else if (index == 21) {
                    this.f1704y0 = obtainStyledAttributes.getFloat(index, this.f1704y0);
                } else if (index == 16) {
                    this.f1705z0 = obtainStyledAttributes.getFloat(index, this.f1705z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
