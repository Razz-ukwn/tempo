package com.google.android.recaptcha.internal;

import ag.g0;
import android.content.Context;
import cb.b;
import e9.c;
import gf.a0;
import gf.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import jf.d;
import jf.f;
import sf.e;
import sf.j;
import yf.h;

public final class zzao implements zzaj {
    public static final zzak zza = new zzak((e) null);
    /* access modifiers changed from: private */
    public static Timer zzb;
    private final zzap zzc;
    /* access modifiers changed from: private */
    public final g0 zzd;
    /* access modifiers changed from: private */
    public final zzad zze;

    public /* synthetic */ zzao(Context context, zzap zzap, g0 g0Var, int i8, e eVar) {
        g0 zza2 = zzp.zza();
        this.zzc = zzap;
        this.zzd = zza2;
        zzad zzc2 = zzad.zzc;
        zzc2 = zzc2 == null ? new zzad(context, (e) null) : zzc2;
        zzad.zzc = zzc2;
        this.zze = zzc2;
        zzh();
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        Iterator it;
        List zzd2 = this.zze.zzd();
        j.f(zzd2, "<this>");
        if ((zzd2 instanceof RandomAccess) && (zzd2 instanceof List)) {
            List list = zzd2;
            int size = list.size();
            arrayList = new ArrayList<>((size / 20) + (size % 20 == 0 ? 0 : 1));
            int i8 = 0;
            while (true) {
                if (!(i8 >= 0 && i8 < size)) {
                    break;
                }
                int i10 = size - i8;
                if (20 <= i10) {
                    i10 = 20;
                }
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    arrayList2.add(list.get(i11 + i8));
                }
                arrayList.add(arrayList2);
                i8 += 20;
            }
        } else {
            arrayList = new ArrayList<>();
            Iterator it2 = zzd2.iterator();
            j.f(it2, "iterator");
            if (!it2.hasNext()) {
                it = r.f8977a;
            } else {
                a0 a0Var = new a0(20, 20, it2, false, true, (d<? super a0>) null);
                h hVar = new h();
                hVar.f17387c = c.e(hVar, hVar, a0Var);
                it = hVar;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
        }
        for (List<zzae> it3 : arrayList) {
            zzlq zzi = zzlr.zzi();
            ArrayList arrayList3 = new ArrayList();
            for (zzae zzae : it3) {
                try {
                    zzmy zzk = zzmy.zzk(zzek.zzg().zzj(zzae.zzc()));
                    int zzH = zzk.zzH();
                    int i12 = zzH - 1;
                    if (zzH != 0) {
                        if (i12 == 0) {
                            zzi.zzp(zzk.zzf());
                        } else if (i12 == 1) {
                            zzi.zzq(zzk.zzg());
                        }
                        arrayList3.add(zzae);
                    } else {
                        throw null;
                    }
                } catch (Exception unused) {
                    this.zze.zzf(zzae);
                }
            }
            if (zzi.zze() + zzi.zzd() != 0) {
                if (this.zzc.zza(((zzlr) zzi.zzj()).zzd())) {
                    this.zze.zza(arrayList3);
                }
            }
        }
    }

    private final void zzh() {
        if (zzb == null) {
            Timer timer = new Timer();
            zzb = timer;
            timer.schedule(new zzal(this), 120000, 120000);
        }
    }

    public final void zzf(zzmy zzmy) {
        b.D(this.zzd, (f.b) null, 0, new zzan(zzmy, this, (d) null), 3);
        zzh();
    }
}
