package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import ff.g;
import gf.y;
import java.util.Map;
import sf.e;

public final class zzh extends Exception {
    public static final zzg zza = new zzg((e) null);
    /* access modifiers changed from: private */
    public static final Map zzb;
    private final zzf zzc;
    private final zzd zzd;
    private final Map zze = y.S(new g(zzf.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, (String) null, 2, (e) null)), new g(zzf.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, (String) null, 2, (e) null)), new g(zzf.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, (String) null, 2, (e) null)), new g(zzf.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, (String) null, 2, (e) null)), new g(zzf.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, (String) null, 2, (e) null)), new g(zzf.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, (String) null, 2, (e) null)));

    static {
        zzmw zzmw = zzmw.JS_INTERNAL_ERROR;
        zzf zzf = zzf.zzc;
        zzb = y.S(new g(zzmw.JS_NETWORK_ERROR, new zzh(zzf.zze, zzd.zzm)), new g(zzmw, new zzh(zzf, zzd.zzk)), new g(zzmw.JS_INVALID_SITE_KEY, new zzh(zzf.zzf, zzd.zzn)), new g(zzmw.JS_INVALID_SITE_KEY_TYPE, new zzh(zzf.zzg, zzd.zzo)), new g(zzmw.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzh(zzf.zzh, zzd.zzp)), new g(zzmw.JS_INVALID_ACTION, new zzh(zzf.zzi, zzd.zzq)), new g(zzmw.JS_PROGRAM_ERROR, new zzh(zzf, zzd.zzv)));
    }

    public zzh(zzf zzf, zzd zzd2) {
        this.zzc = zzf;
        this.zzd = zzd2;
    }

    public final zzd zza() {
        return this.zzd;
    }

    public final zzf zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        RecaptchaException recaptchaException = (RecaptchaException) this.zze.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.UNKNOWN_ERROR, (String) null, 2, (e) null) : recaptchaException;
    }
}
