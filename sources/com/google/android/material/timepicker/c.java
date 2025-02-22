package com.google.android.material.timepicker;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import v8.f;
import v8.g;
import v8.i;

public class c extends ConstraintLayout {
    public final b M;
    public int N;
    public f O;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            view.setId(i0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.M;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public void i() {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!hashMap.containsKey(i10)) {
                    hashMap.put(i10, new ArrayList());
                }
                ((List) hashMap.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(((float) this.N) * 0.66f) : this.N;
            float f10 = 0.0f;
            for (View id2 : list) {
                int id3 = id2.getId();
                HashMap<Integer, b.a> hashMap2 = bVar.f1609c;
                if (!hashMap2.containsKey(Integer.valueOf(id3))) {
                    hashMap2.put(Integer.valueOf(id3), new b.a());
                }
                b.C0019b bVar2 = hashMap2.get(Integer.valueOf(id3)).f1613d;
                bVar2.f1668z = R.id.circle_center;
                bVar2.A = round;
                bVar2.B = f10;
                f10 += 360.0f / ((float) list.size());
            }
        }
        bVar.a(this);
        setConstraintSet((androidx.constraintlayout.widget.b) null);
        requestLayout();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        i();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            androidx.activity.b bVar = this.M;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public final void setBackgroundColor(int i8) {
        this.O.m(ColorStateList.valueOf(i8));
    }

    public c(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f fVar = new f();
        this.O = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f16250a.f16256a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.f16293e = gVar;
        aVar.f16294f = gVar;
        aVar.f16295g = gVar;
        aVar.f16296h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.O.m(ColorStateList.valueOf(-1));
        f fVar2 = this.O;
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.f455d0, i8, 0);
        this.N = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.M = new androidx.activity.b(this, 9);
        obtainStyledAttributes.recycle();
    }
}
