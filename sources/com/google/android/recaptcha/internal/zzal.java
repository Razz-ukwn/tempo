package com.google.android.recaptcha.internal;

import cb.b;
import java.util.TimerTask;
import jf.d;
import jf.f;

public final class zzal extends TimerTask {
    final /* synthetic */ zzao zza;

    public zzal(zzao zzao) {
        this.zza = zzao;
    }

    public final void run() {
        b.D(this.zza.zzd, (f.b) null, 0, new zzam(this.zza, (d) null), 3);
    }
}
