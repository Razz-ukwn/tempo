package com.google.android.gms.internal.measurement;

import b3.w;
import j1.c;
import java.util.Collections;
import java.util.TreeMap;

public final class od {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f5455a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f5456b = new TreeMap();

    public final void a(c cVar, w wVar) {
        f7 f7Var = new f7(wVar);
        TreeMap treeMap = this.f5455a;
        for (Integer num : treeMap.keySet()) {
            b a10 = ((b) wVar.f3198c).clone();
            o e10 = ((n) treeMap.get(num)).e(cVar, Collections.singletonList(f7Var));
            int b10 = e10 instanceof h ? f4.b(e10.zzh().doubleValue()) : -1;
            if (b10 == 2 || b10 == -1) {
                wVar.f3198c = a10;
            }
        }
        TreeMap treeMap2 = this.f5456b;
        for (Integer num2 : treeMap2.keySet()) {
            o e11 = ((n) treeMap2.get(num2)).e(cVar, Collections.singletonList(f7Var));
            if (e11 instanceof h) {
                f4.b(e11.zzh().doubleValue());
            }
        }
    }
}
