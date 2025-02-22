package ke;

import android.view.View;
import ke.f;
import me.e;

public final class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10444a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10445b;

    public g(f fVar, e eVar) {
        this.f10444a = fVar;
        this.f10445b = eVar;
    }

    public final void onClick(View view) {
        f.a aVar = this.f10444a.f10439e;
        if (aVar != null) {
            aVar.e(this.f10445b);
        }
    }
}
