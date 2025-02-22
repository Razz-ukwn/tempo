package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import cb.e;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f913a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f914b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<View> f915c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f916d;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.X, 0, 0);
        this.f914b = obtainStyledAttributes.getResourceId(2, -1);
        this.f913a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f913a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f916d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f913a, viewGroup, false);
            int i8 = this.f914b;
            if (i8 != -1) {
                inflate.setId(i8);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f915c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f914b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f916d;
    }

    public int getLayoutResource() {
        return this.f913a;
    }

    public final void onMeasure(int i8, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i8) {
        this.f914b = i8;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f916d = layoutInflater;
    }

    public void setLayoutResource(int i8) {
        this.f913a = i8;
    }

    public void setOnInflateListener(a aVar) {
    }

    public void setVisibility(int i8) {
        WeakReference<View> weakReference = this.f915c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i8);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i8);
        if (i8 == 0 || i8 == 4) {
            a();
        }
    }
}
