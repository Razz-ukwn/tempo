package com.google.android.recaptcha.internal;

import ag.k;
import android.webkit.JavascriptInterface;
import cb.b;
import ff.m;
import java.util.concurrent.TimeUnit;

public final class zzdc {
    final /* synthetic */ zzdi zza;
    private Long zzb;
    private final zzdt zzc = zzdt.zzb();

    public zzdc(zzdi zzdi) {
        this.zza = zzdi;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(String str) {
        zzb();
        zzmq zzg = zzmq.zzg(zzek.zzh().zzj(str));
        zzg.zzi().name();
        zzg.zzk();
        k kVar = (k) this.zza.zzk.remove(zzg.zzj());
        String zzk = zzg.zzk();
        if (zzk == null || zzk.length() == 0) {
            zzg.zzi().name();
            zzg zzg2 = zzh.zza;
            zzh zza2 = zzg.zza(zzg.zzi());
            zzg.zzj();
            if (kVar != null) {
                kVar.resumeWith(b.u(zza2));
            }
        } else if (kVar != null) {
            kVar.resumeWith(zzg.zzk());
        }
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzmu zzg = zzmu.zzg(zzek.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzmw.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (!this.zza.zzm().d0(m.f8717a)) {
                this.zza.zzm().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        zzg zzg2 = zzh.zza;
        zzh zza2 = zzg.zza(zzg.zzi());
        this.zza.zzm().hashCode();
        this.zza.zzm().E0(zza2);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
