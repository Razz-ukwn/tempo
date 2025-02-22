package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.p;
import androidx.lifecycle.j;
import androidx.lifecycle.n;

public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f7389a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f7390b;

    /* renamed from: c  reason: collision with root package name */
    public final n f7391c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, p pVar) {
        super(context);
        context.getClass();
        AnonymousClass1 r22 = new n() {
            public final void d(androidx.lifecycle.p pVar, j.a aVar) {
                if (aVar == j.a.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    viewComponentManager$FragmentContextWrapper.getClass();
                    viewComponentManager$FragmentContextWrapper.f7389a = null;
                    viewComponentManager$FragmentContextWrapper.f7390b = null;
                }
            }
        };
        this.f7391c = r22;
        this.f7389a = null;
        pVar.getClass();
        pVar.f2075l0.a(r22);
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7390b == null) {
            if (this.f7389a == null) {
                this.f7389a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f7390b = this.f7389a.cloneInContext(this);
        }
        return this.f7390b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewComponentManager$FragmentContextWrapper(android.view.LayoutInflater r2, androidx.fragment.app.p r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.f7391c = r0
            r1.f7389a = r2
            r3.getClass()
            androidx.lifecycle.q r2 = r3.f2075l0
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.<init>(android.view.LayoutInflater, androidx.fragment.app.p):void");
    }
}
