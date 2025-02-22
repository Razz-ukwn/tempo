package com.google.android.recaptcha.internal;

import ag.g0;
import android.webkit.ValueCallback;
import cb.b;
import ff.m;
import gf.q;
import java.util.ArrayList;
import jf.d;
import lf.i;
import rf.l;
import rf.p;

final class zzba extends i implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzbb zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzba(String[] strArr, zzbb zzbb, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzbb;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzba(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzba) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        ArrayList arrayList = new ArrayList(r1);
        for (String str : this.zza) {
            arrayList.add("\"" + str + "\"");
        }
        this.zzb.zza.evaluateJavascript(this.zzc + "(" + q.A0(arrayList, ",", (String) null, (String) null, (l) null, 62) + ")", (ValueCallback) null);
        return m.f8717a;
    }
}
