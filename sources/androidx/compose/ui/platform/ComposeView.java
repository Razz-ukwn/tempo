package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import cb.b;
import cb.d;
import ff.m;
import rf.p;
import sf.j;
import sf.k;
import t.b3;
import t.e0;
import t.h;
import t.i;
import t.n1;
import t.y1;

public final class ComposeView extends a {
    public final n1 E = d.R((Object) null, b3.f14997a);
    public boolean F;

    public static final class a extends k implements p<h, Integer, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComposeView f1224a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1225b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComposeView composeView, int i8) {
            super(2);
            this.f1224a = composeView;
            this.f1225b = i8;
        }

        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int L = b.L(this.f1225b | 1);
            this.f1224a.a((h) obj, L);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void a(h hVar, int i8) {
        i g10 = hVar.g(420213850);
        e0.b bVar = e0.f15020a;
        p pVar = (p) this.E.getValue();
        if (pVar != null) {
            pVar.invoke(g10, 0);
        }
        y1 G = g10.G();
        if (G != null) {
            G.f15286d = new a(this, i8);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }

    public final void setContent(p<? super h, ? super Integer, m> pVar) {
        j.f(pVar, "content");
        boolean z10 = true;
        this.F = true;
        this.E.setValue(pVar);
        if (isAttachedToWindow()) {
            if (this.f1251d == null && !isAttachedToWindow()) {
                z10 = false;
            }
            if (z10) {
                c();
                return;
            }
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
    }
}
