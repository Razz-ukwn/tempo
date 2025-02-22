package com.google.android.recaptcha.internal;

import ag.g0;
import ag.l;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import cb.b;
import com.google.android.recaptcha.RecaptchaAction;
import e9.c;
import ff.m;
import jf.d;
import kf.a;
import lf.i;
import rf.p;

final class zzde extends i implements p {
    Object zza;
    Object zzb;
    Object zzc;
    int zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzdi zzf;
    final /* synthetic */ String zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzde(RecaptchaAction recaptchaAction, zzdi zzdi, String str, d dVar) {
        super(2, dVar);
        this.zze = recaptchaAction;
        this.zzf = zzdi;
        this.zzg = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzde(this.zze, this.zzf, this.zzg, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzde) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.zzd;
        b.J(obj);
        if (i8 == 0) {
            zzdi zzdi = this.zzf;
            String str = this.zzg;
            RecaptchaAction recaptchaAction = this.zze;
            this.zza = zzdi;
            this.zzb = str;
            this.zzc = recaptchaAction;
            this.zzd = 1;
            l lVar = new l(1, c.g(this));
            lVar.t();
            zzdi.zzk.put(str, lVar);
            zzmr zzf2 = zzms.zzf();
            zzf2.zze(str);
            zzf2.zzd(recaptchaAction.getAction());
            byte[] zzd2 = ((zzms) zzf2.zzj()).zzd();
            String zzi = zzek.zzh().zzi(zzd2, 0, zzd2.length);
            zzai zzai = zzai.zza;
            zzai.zzc(new zzaf(zzln.EXECUTE_NATIVE, zzdi.zzg, zzdi.zzh, str, (String) null), zzdi.zze, zzdi.zzf);
            WebView zzb2 = zzdi.zzb();
            zzb2.evaluateJavascript("recaptcha.m.Main.execute(\"" + zzi + "\")", (ValueCallback) null);
            obj = lVar.s();
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
