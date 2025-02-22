package com.google.android.recaptcha.internal;

import ag.g0;
import ag.s;
import android.os.Build;
import cb.b;
import ff.h;
import ff.m;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import jf.d;
import jf.f;
import kf.a;
import lf.i;
import rf.p;

final class zzdh extends i implements p {
    int zza;
    final /* synthetic */ zzdi zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdh(zzdi zzdi, d dVar) {
        super(2, dVar);
        this.zzb = zzdi;
    }

    public final d create(Object obj, d dVar) {
        return new zzdh(this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.zza;
        b.J(obj);
        if (i8 == 0) {
            zzt zzt = zzt.zza;
            String zza2 = zzt.zza(this.zzb.zze);
            String zzj = this.zzb.zzd;
            String packageName = this.zzb.zze.getPackageName();
            String zzi = this.zzb.zzh;
            int i10 = Build.VERSION.SDK_INT;
            String encode = URLEncoder.encode(zzj, "UTF-8");
            String encode2 = URLEncoder.encode(packageName, "UTF-8");
            String encode3 = URLEncoder.encode(zza2, "UTF-8");
            String encode4 = URLEncoder.encode("18.2.1", "UTF-8");
            String encode5 = URLEncoder.encode(zzi, "UTF-8");
            byte[] bytes = ("k=" + encode + "&pk=" + encode2 + "&mst=" + encode3 + "&msv=" + encode4 + "&msi=" + encode5 + "&mov=" + i10).getBytes(Charset.forName("UTF-8"));
            zzai zzai = zzai.zza;
            zzai.zzc(new zzaf(zzln.INIT_NATIVE, this.zzb.zzg, this.zzb.zzh, this.zzb.zzh, (String) null), this.zzb.zze, this.zzb.zzf);
            zzai.zzb(new zzaf(zzln.INIT_NETWORK, this.zzb.zzg, this.zzb.zzh, this.zzb.zzh, (String) null), this.zzb.zzd, new zzr());
            b.D(zzp.zza(), (f.b) null, 0, new zzdg(this.zzb, zza2, (d) null), 3);
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzdi zzdi = this.zzb;
            zzdi.zzb().postUrl(zzdi.zzf.zza(), bytes);
            new Integer(this.zzb.zzm().hashCode());
            s zzm = this.zzb.zzm();
            this.zza = 1;
            if (zzm.u(this) == aVar) {
                return aVar;
            }
        }
        return new h(m.f8717a);
    }
}
