package com.google.android.recaptcha;

import ag.g0;
import android.app.Application;
import android.webkit.WebView;
import cb.b;
import com.google.android.recaptcha.internal.zzaa;
import com.google.android.recaptcha.internal.zzq;
import com.google.android.recaptcha.internal.zzv;
import ff.m;
import jf.d;
import kf.a;
import lf.i;
import rf.p;

public final class Recaptcha$getClient$2$1 extends i implements p<g0, d<? super zzaa>, Object> {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$2$1(Application application, String str, long j10, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    public final d create(Object obj, d dVar) {
        return new Recaptcha$getClient$2$1(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Recaptcha$getClient$2$1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.zza;
        b.J(obj);
        if (i8 == 0) {
            zzv zzv = zzaa.zza;
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj = zzv.zza(application, str, j10, new zzq("https://www.recaptcha.net/recaptcha/api3"), (WebView) null, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
