package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.quickkonnect.silencio.R;
import d2.z0;
import java.util.Iterator;
import sf.j;
import t.f0;
import yf.k;

public final class a3 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f1257a;

    public a3(a aVar) {
        this.f1257a = aVar;
    }

    public final void onViewAttachedToWindow(View view) {
        j.f(view, "v");
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean z10;
        j.f(view, "v");
        a aVar = this.f1257a;
        j.f(aVar, "<this>");
        Iterator it = k.o0(aVar.getParent(), z0.E).iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            ViewParent viewParent = (ViewParent) it.next();
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                j.f(view2, "<this>");
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null) {
                    z10 = bool.booleanValue();
                }
                if (z10) {
                    z10 = true;
                    break;
                }
            }
        }
        if (!z10) {
            f0 f0Var = aVar.f1250c;
            if (f0Var != null) {
                ((WrappedComposition) f0Var).a();
            }
            aVar.f1250c = null;
            aVar.requestLayout();
        }
    }
}
