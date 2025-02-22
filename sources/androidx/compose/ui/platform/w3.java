package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.quickkonnect.silencio.R;
import ff.m;
import java.util.Set;
import rf.p;
import sf.k;
import t.e0;
import t.h;
import t.l0;
import t.t0;
import t.v1;
import tf.a;
import tf.d;
import z.b;

public final class w3 extends k implements p<h, Integer, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f1498a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p<h, Integer, m> f1499b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w3(WrappedComposition wrappedComposition, p<? super h, ? super Integer, m> pVar) {
        super(2);
        this.f1498a = wrappedComposition;
        this.f1499b = pVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
            e0.b bVar = e0.f15020a;
            WrappedComposition wrappedComposition = this.f1498a;
            Object tag = wrappedComposition.f1241a.getTag(R.id.inspection_slot_table_set);
            Set set = (tag instanceof Set) && (!(tag instanceof a) || (tag instanceof d)) ? (Set) tag : null;
            AndroidComposeView androidComposeView = wrappedComposition.f1241a;
            if (set == null) {
                ViewParent parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (tag2 instanceof Set) && (!(tag2 instanceof a) || (tag2 instanceof d)) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(hVar.e());
                hVar.a();
            }
            t0.b(androidComposeView, new u3(wrappedComposition, (jf.d<? super u3>) null), hVar);
            l0.a(new v1[]{c0.a.f3657a.b(set)}, b.b(hVar, -1193460702, new v3(wrappedComposition, this.f1499b)), hVar, 56);
        } else {
            hVar.j();
        }
        return m.f8717a;
    }
}
