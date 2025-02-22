package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;

public final class u extends v {
    public u() {
        this.f5552a.add(d0.BITWISE_AND);
        this.f5552a.add(d0.BITWISE_LEFT_SHIFT);
        this.f5552a.add(d0.BITWISE_NOT);
        this.f5552a.add(d0.BITWISE_OR);
        this.f5552a.add(d0.BITWISE_RIGHT_SHIFT);
        this.f5552a.add(d0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f5552a.add(d0.BITWISE_XOR);
    }

    public final o a(String str, c cVar, ArrayList arrayList) {
        d0 d0Var = d0.ADD;
        switch (f4.e(str).ordinal()) {
            case 4:
                f4.h("BITWISE_AND", 2, arrayList);
                return new h(Double.valueOf((double) (f4.b(cVar.m((o) arrayList.get(0)).zzh().doubleValue()) & f4.b(cVar.m((o) arrayList.get(1)).zzh().doubleValue()))));
            case 5:
                f4.h("BITWISE_LEFT_SHIFT", 2, arrayList);
                return new h(Double.valueOf((double) (f4.b(cVar.m((o) arrayList.get(0)).zzh().doubleValue()) << ((int) (f4.d(cVar.m((o) arrayList.get(1)).zzh().doubleValue()) & 31)))));
            case 6:
                f4.h("BITWISE_NOT", 1, arrayList);
                return new h(Double.valueOf((double) (~f4.b(cVar.m((o) arrayList.get(0)).zzh().doubleValue()))));
            case 7:
                f4.h("BITWISE_OR", 2, arrayList);
                return new h(Double.valueOf((double) (f4.b(cVar.m((o) arrayList.get(0)).zzh().doubleValue()) | f4.b(cVar.m((o) arrayList.get(1)).zzh().doubleValue()))));
            case 8:
                f4.h("BITWISE_RIGHT_SHIFT", 2, arrayList);
                return new h(Double.valueOf((double) (f4.b(cVar.m((o) arrayList.get(0)).zzh().doubleValue()) >> ((int) (f4.d(cVar.m((o) arrayList.get(1)).zzh().doubleValue()) & 31)))));
            case 9:
                f4.h("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, arrayList);
                return new h(Double.valueOf((double) (f4.d(cVar.m((o) arrayList.get(0)).zzh().doubleValue()) >>> ((int) (f4.d(cVar.m((o) arrayList.get(1)).zzh().doubleValue()) & 31)))));
            case 10:
                f4.h("BITWISE_XOR", 2, arrayList);
                return new h(Double.valueOf((double) (f4.b(cVar.m((o) arrayList.get(0)).zzh().doubleValue()) ^ f4.b(cVar.m((o) arrayList.get(1)).zzh().doubleValue()))));
            default:
                b(str);
                throw null;
        }
    }
}
