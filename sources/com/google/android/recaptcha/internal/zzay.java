package com.google.android.recaptcha.internal;

import ag.g0;
import android.content.Context;
import cb.b;
import d2.f1;
import ff.g;
import ff.m;
import gf.q;
import gf.y;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jf.d;
import jf.f;
import kf.a;
import sf.e;

public final class zzay implements zzas {
    public static final zzat zza = new zzat((e) null);
    private final zzbb zzb;
    private final g0 zzc;
    private final zzbj zzd;
    private final Map zze;
    private final Map zzf = y.S(new g(39, zzbs.zza), new g(34, zzck.zza), new g(35, zzcw.zza), new g(25, zzcb.zza), new g(37, zzcu.zza), new g(21, zzbk.zza), new g(22, zzct.zza), new g(23, zzcl.zza), new g(24, zzby.zza), new g(1, zzco.zza), new g(2, zzbr.zza), new g(38, zzcs.zza), new g(3, zzcc.zza), new g(4, zzcd.zza), new g(17, zzbx.zza), new g(32, zzbl.zza), new g(5, zzcf.zza), new g(31, zzbm.zza), new g(36, zzbn.zza), new g(16, zzbt.zza), new g(26, zzcp.zza), new g(6, zzce.zza), new g(27, zzcn.zza), new g(8, zzci.zza), new g(9, zzcj.zza), new g(10, zzcg.zza), new g(11, zzch.zza), new g(12, zzcq.zza), new g(13, zzcr.zza), new g(30, zzbo.zza), new g(15, zzbp.zza), new g(20, zzbq.zza), new g(7, zzcm.zza), new g(18, zzbv.zza), new g(19, zzbw.zza), new g(40, zzcv.zza));
    private final zzcz zzg;

    public zzay(zzbb zzbb, g0 g0Var, Context context, zzn zzn) {
        zzbb zzbb2 = zzbb;
        this.zzb = zzbb2;
        this.zzc = g0Var;
        zzbj zzbj = new zzbj(zzbb2, zzn);
        this.zzd = zzbj;
        this.zze = zzbj.zzd().zzc();
        zzcz zzcz = new zzcz();
        this.zzg = zzcz;
        this.zzd.zzg(3, context);
        this.zzd.zzg(4, zzcz);
    }

    /* access modifiers changed from: private */
    public final zzna zzg(String str, List list) {
        if (str.length() != 0) {
            try {
                zzcy zzcy = new zzcy((short) this.zzg.zza(q.N0(list)), 255);
                StringBuilder sb2 = new StringBuilder(str.length());
                for (int i8 = 0; i8 < str.length(); i8++) {
                    sb2.append((char) (str.charAt(i8) ^ zzcy.zza()));
                }
                return zzna.zzg(zzek.zzh().zzj(sb2.toString()));
            } catch (Exception e10) {
                throw new zzs(3, 18, e10);
            }
        } else {
            throw new zzs(3, 17, (Throwable) null);
        }
    }

    /* access modifiers changed from: private */
    public final Object zzh(List list, zzbh zzbh, d dVar) {
        Object v3 = f1.v(new zzav(zzbh, list, this, (d) null), dVar);
        return v3 == a.f10464a ? v3 : m.f8717a;
    }

    /* access modifiers changed from: private */
    public final Object zzi(Exception exc, zzbh zzbh, d dVar) {
        Object v3 = f1.v(new zzaw(exc, zzbh, this, (d) null), dVar);
        return v3 == a.f10464a ? v3 : m.f8717a;
    }

    /* access modifiers changed from: private */
    public final void zzj(zznm zznm, zzbh zzbh) {
        zzdt zzb2 = zzdt.zzb();
        int zzb3 = zzbh.zzb();
        zzca zzca = (zzca) this.zzf.get(Integer.valueOf(zznm.zzf()));
        if (zzca != null) {
            int zzg2 = zznm.zzg();
            zznl[] zznlArr = (zznl[]) zznm.zzj().toArray(new zznl[0]);
            zzca.zza(zzg2, zzbh, (zznl[]) Arrays.copyOf(zznlArr, zznlArr.length));
            if (zzb3 == zzbh.zzb()) {
                zzbh.zzi(zzbh.zzb() + 1);
            }
            zzb2.zzf();
            long zza2 = zzb2.zza(TimeUnit.MICROSECONDS);
            zzj zzj = zzj.zza;
            int zzk = zznm.zzk();
            if (zzk != 1) {
                zzj.zza(zzk - 2, zza2);
                zznm.zzk();
                zznm.zzg();
                q.A0(zznm.zzj(), (String) null, (String) null, (String) null, new zzau(this), 31);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzs(5, 2, (Throwable) null);
    }

    public final void zza(String str) {
        b.D(this.zzc, (f.b) null, 0, new zzax(new zzbh(this.zzd), this, str, (d) null), 3);
    }
}
