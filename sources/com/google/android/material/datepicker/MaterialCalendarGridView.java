package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import c2.c;
import com.quickkonnect.silencio.R;
import d2.i0;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f5842a = f0.d((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5843b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (r.v0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f5843b = r.w0(getContext(), R.attr.nestedScrollable);
        i0.n(this, new q());
    }

    /* renamed from: a */
    public final x getAdapter() {
        return (x) super.getAdapter();
    }

    public final View b(int i8) {
        return getChildAt(i8 - getFirstVisiblePosition());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x a10 = getAdapter();
        d<?> dVar = a10.f5932b;
        c cVar = a10.f5934d;
        int max = Math.max(a10.b(), getFirstVisiblePosition());
        int min = Math.min((a10.b() + a10.f5931a.f5930e) - 1, getLastVisiblePosition());
        a10.getItem(max);
        a10.getItem(min);
        for (c<Long, Long> cVar2 : dVar.g()) {
            cVar2.getClass();
        }
    }

    public final void onFocusChanged(boolean z10, int i8, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i8, rect);
        } else if (i8 == 33) {
            x a10 = getAdapter();
            setSelection((a10.b() + a10.f5931a.f5930e) - 1);
        } else if (i8 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i8, rect);
        }
    }

    public final boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (!super.onKeyDown(i8, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i8) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public final void onMeasure(int i8, int i10) {
        if (this.f5843b) {
            super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i8, i10);
    }

    public final void setSelection(int i8) {
        if (i8 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i8);
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof x) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), x.class.getCanonicalName()}));
        }
    }
}
