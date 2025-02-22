package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b2.c;
import com.quickkonnect.silencio.R;
import d2.f1;
import d2.i0;
import d2.j1;
import java.util.ArrayList;
import java.util.Iterator;
import sf.j;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1893a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1894b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1895c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1896d = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    public final void a(View view) {
        if (this.f1894b.contains(view)) {
            this.f1893a.add(view);
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        j.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof p ? (p) tag : null) != null) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        j1 j1Var;
        j.f(windowInsets, "insets");
        j1 h3 = j1.h(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1895c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            j.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j1Var = j1.h(onApplyWindowInsets, (View) null);
        } else {
            j1Var = i0.i(this, h3);
        }
        j.e(j1Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!j1Var.f7237a.m()) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                i0.b(getChildAt(i8), j1Var);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        j.f(canvas, "canvas");
        if (this.f1896d) {
            for (View drawChild : this.f1893a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        j.f(canvas, "canvas");
        j.f(view, "child");
        if (this.f1896d) {
            ArrayList arrayList = this.f1893a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void endViewTransition(View view) {
        j.f(view, "view");
        this.f1894b.remove(view);
        if (this.f1893a.remove(view)) {
            this.f1896d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends p> F getFragment() {
        x xVar;
        p pVar;
        i0 i0Var;
        View view = this;
        while (true) {
            xVar = null;
            if (view == null) {
                pVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            pVar = tag instanceof p ? (p) tag : null;
            if (pVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (pVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof x) {
                    xVar = (x) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (xVar != null) {
                i0Var = xVar.I();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (pVar.C()) {
            i0Var = pVar.p();
        } else {
            throw new IllegalStateException("The Fragment " + pVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return i0Var.C(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j.f(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                j.e(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        j.f(view, "view");
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i8) {
        View childAt = getChildAt(i8);
        j.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i8);
    }

    public final void removeViewInLayout(View view) {
        j.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i8, int i10) {
        int i11 = i8 + i10;
        for (int i12 = i8; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            j.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i8, i10);
    }

    public final void removeViewsInLayout(int i8, int i10) {
        int i11 = i8 + i10;
        for (int i12 = i8; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            j.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i8, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f1896d = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        j.f(onApplyWindowInsetsListener, "listener");
        this.f1895c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        j.f(view, "view");
        if (view.getParent() == this) {
            this.f1894b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        j.f(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1.B, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, i0 i0Var) {
        super(context, attributeSet);
        View view;
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        j.f(i0Var, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1.B, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        p C = i0Var.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(c.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            b0 G = i0Var.G();
            context.getClassLoader();
            p a10 = G.a(classAttribute);
            j.e(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.Q(context, attributeSet, (Bundle) null);
            a aVar = new a(i0Var);
            aVar.f2120p = true;
            a10.f2064c0 = this;
            aVar.d(getId(), a10, string, 1);
            if (!aVar.f2112g) {
                aVar.f2113h = false;
                aVar.f1897q.y(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = i0Var.f1968c.f().iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            p pVar = o0Var.f2054c;
            if (pVar.U == getId() && (view = pVar.f2066d0) != null && view.getParent() == null) {
                pVar.f2064c0 = this;
                o0Var.b();
            }
        }
    }
}
