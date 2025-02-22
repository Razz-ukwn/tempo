package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

public final class e4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5254a = 1;

    public e4() {
        super((Handler) null);
    }

    public final void onChange(boolean z10) {
        switch (this.f5254a) {
            case 0:
                g4.f5287d.set(true);
                return;
            default:
                z4.f5619h.incrementAndGet();
                return;
        }
    }

    public e4(int i8) {
        super((Handler) null);
    }
}
