package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.Arrays;
import java.util.Comparator;

public final class z implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f5615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f5616b;

    public z(i iVar, c cVar) {
        this.f5615a = iVar;
        this.f5616b = cVar;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        if (oVar instanceof t) {
            return !(oVar2 instanceof t) ? 1 : 0;
        }
        if (oVar2 instanceof t) {
            return -1;
        }
        i iVar = this.f5615a;
        if (iVar == null) {
            return oVar.zzi().compareTo(oVar2.zzi());
        }
        return (int) f4.a(iVar.e(this.f5616b, Arrays.asList(new o[]{oVar, oVar2})).zzh().doubleValue());
    }
}
