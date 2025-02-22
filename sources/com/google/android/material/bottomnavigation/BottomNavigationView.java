package com.google.android.material.bottomnavigation;

import ag.n2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.h1;
import com.quickkonnect.silencio.R;
import m8.s;
import m8.v;
import o8.g;
import z7.c;

public class BottomNavigationView extends g {

    @Deprecated
    public interface a extends g.a {
    }

    @Deprecated
    public interface b extends g.b {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h1 e10 = s.e(getContext(), attributeSet, n2.E, R.attr.bottomNavigationStyle, 2132017999, new int[0]);
        setItemHorizontalTranslationEnabled(e10.a(2, true));
        if (e10.l(0)) {
            setMinimumHeight(e10.d(0, 0));
        }
        e10.a(1, true);
        e10.n();
        v.a(this, new c());
    }

    public int getMaxItemCount() {
        return 5;
    }

    public final void onMeasure(int i8, int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i8, i10);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        z7.b bVar = (z7.b) getMenuView();
        if (bVar.f17784i0 != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
