package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.y;
import i.f;

public final class x extends m0 {
    public final /* synthetic */ y.g F;
    public final /* synthetic */ y G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(y yVar, View view, y.g gVar) {
        super(view);
        this.G = yVar;
        this.F = gVar;
    }

    public final f b() {
        return this.F;
    }

    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        y yVar = this.G;
        if (yVar.getInternalPopup().a()) {
            return true;
        }
        yVar.B.n(y.c.b(yVar), y.c.a(yVar));
        return true;
    }
}
