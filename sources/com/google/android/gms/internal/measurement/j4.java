package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

public final class j4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k4 f5337a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var) {
        super((Handler) null);
        this.f5337a = k4Var;
    }

    public final void onChange(boolean z10) {
        k4 k4Var = this.f5337a;
        synchronized (k4Var.f5354e) {
            k4Var.f5355f = null;
            k4Var.f5352c.run();
        }
        synchronized (k4Var) {
            Iterator it = k4Var.f5356g.iterator();
            while (it.hasNext()) {
                ((l4) it.next()).zza();
            }
        }
    }
}
