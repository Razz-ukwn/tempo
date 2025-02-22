package ne;

import android.database.ContentObserver;
import android.os.Handler;
import oe.j;
import rf.l;

public final class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f11896a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(j jVar, Handler handler) {
        super(handler);
        this.f11896a = jVar;
    }

    public final void onChange(boolean z10) {
        this.f11896a.invoke(Boolean.valueOf(z10));
    }
}
