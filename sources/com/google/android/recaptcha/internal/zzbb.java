package com.google.android.recaptcha.internal;

import ag.g0;
import android.webkit.WebView;
import cb.b;
import jf.d;
import jf.f;

public final class zzbb {
    /* access modifiers changed from: private */
    public final WebView zza;
    private final g0 zzb;

    public zzbb(WebView webView, g0 g0Var) {
        this.zza = webView;
        this.zzb = g0Var;
    }

    public final void zzb(String str, String... strArr) {
        b.D(this.zzb, (f.b) null, 0, new zzba(strArr, this, str, (d) null), 3);
    }
}
