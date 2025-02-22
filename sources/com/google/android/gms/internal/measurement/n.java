package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n extends i {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5408c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f5409d;

    /* renamed from: e  reason: collision with root package name */
    public final c f5410e;

    public n(n nVar) {
        super(nVar.f5319a);
        ArrayList arrayList = new ArrayList(nVar.f5408c.size());
        this.f5408c = arrayList;
        arrayList.addAll(nVar.f5408c);
        ArrayList arrayList2 = new ArrayList(nVar.f5409d.size());
        this.f5409d = arrayList2;
        arrayList2.addAll(nVar.f5409d);
        this.f5410e = nVar.f5410e;
    }

    public final o e(c cVar, List list) {
        t tVar;
        c l10 = this.f5410e.l();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f5408c;
            int size = arrayList.size();
            tVar = o.f5428j;
            if (i8 >= size) {
                break;
            }
            if (i8 < list.size()) {
                l10.p((String) arrayList.get(i8), cVar.m((o) list.get(i8)));
            } else {
                l10.p((String) arrayList.get(i8), tVar);
            }
            i8++;
        }
        Iterator it = this.f5409d.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            o m = l10.m(oVar);
            if (m instanceof p) {
                m = l10.m(oVar);
            }
            if (m instanceof g) {
                return ((g) m).f5280a;
            }
        }
        return tVar;
    }

    public final o zzd() {
        return new n(this);
    }

    public n(String str, ArrayList arrayList, List list, c cVar) {
        super(str);
        this.f5408c = new ArrayList();
        this.f5410e = cVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f5408c.add(((o) it.next()).zzi());
            }
        }
        this.f5409d = new ArrayList(list);
    }
}
