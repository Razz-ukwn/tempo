package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d2.f1;
import u2.c;
import u2.d;

public final class d0 implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f1923a;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o0 f1924a;

        public a(o0 o0Var) {
            this.f1924a = o0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            o0 o0Var = this.f1924a;
            p pVar = o0Var.f2054c;
            o0Var.k();
            d1.f((ViewGroup) pVar.f2066d0.getParent(), d0.this.f1923a.H()).e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public d0(i0 i0Var) {
        this.f1923a = i0Var;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        o0 o0Var;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        i0 i0Var = this.f1923a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, i0Var);
        }
        p pVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1.f7216e);
        int i8 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z10 = p.class.isAssignableFrom(b0.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (z10) {
                if (view != null) {
                    i8 = view.getId();
                }
                if (i8 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    pVar = i0Var.C(resourceId);
                }
                if (pVar == null && string != null) {
                    pVar = i0Var.D(string);
                }
                if (pVar == null && i8 != -1) {
                    pVar = i0Var.C(i8);
                }
                if (pVar == null) {
                    b0 G = i0Var.G();
                    context.getClassLoader();
                    pVar = G.a(attributeValue);
                    pVar.K = true;
                    pVar.T = resourceId != 0 ? resourceId : i8;
                    pVar.U = i8;
                    pVar.V = string;
                    pVar.L = true;
                    pVar.P = i0Var;
                    c0<?> c0Var = i0Var.f1985u;
                    pVar.Q = c0Var;
                    pVar.Q(c0Var.f1915c, attributeSet, pVar.f2061b);
                    o0Var = i0Var.a(pVar);
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "Fragment " + pVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!pVar.L) {
                    pVar.L = true;
                    pVar.P = i0Var;
                    c0<?> c0Var2 = i0Var.f1985u;
                    pVar.Q = c0Var2;
                    pVar.Q(c0Var2.f1915c, attributeSet, pVar.f2061b);
                    o0Var = i0Var.f(pVar);
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + pVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i8) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                c.b bVar = c.f15701a;
                d dVar = new d(pVar, viewGroup);
                c.c(dVar);
                c.b a10 = c.a(pVar);
                if (a10.f15708a.contains(c.a.f15705d) && c.e(a10, pVar.getClass(), d.class)) {
                    c.b(a10, dVar);
                }
                pVar.f2064c0 = viewGroup;
                o0Var.k();
                o0Var.j();
                View view2 = pVar.f2066d0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (pVar.f2066d0.getTag() == null) {
                        pVar.f2066d0.setTag(string);
                    }
                    pVar.f2066d0.addOnAttachStateChangeListener(new a(o0Var));
                    return pVar.f2066d0;
                }
                throw new IllegalStateException(b2.c.a("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
