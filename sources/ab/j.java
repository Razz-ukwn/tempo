package ab;

import ab.b;
import ab.v;
import ab.x;
import cb.o;
import db.d;
import db.q;
import db.r;
import fb.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final o f261a = o.B;

    /* renamed from: b  reason: collision with root package name */
    public final v.a f262b = v.f277a;

    /* renamed from: c  reason: collision with root package name */
    public final b.a f263c = b.f242a;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f264d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f265e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f266f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final int f267g;

    /* renamed from: h  reason: collision with root package name */
    public final int f268h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f269i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f270j;

    /* renamed from: k  reason: collision with root package name */
    public final x.a f271k;

    /* renamed from: l  reason: collision with root package name */
    public final x.b f272l;
    public final LinkedList<w> m;

    public j() {
        int i8 = i.f246o;
        this.f267g = 2;
        this.f268h = 2;
        this.f269i = true;
        this.f270j = true;
        this.f271k = x.f279a;
        this.f272l = x.f280b;
        this.m = new LinkedList<>();
    }

    public final i a() {
        int i8;
        r rVar;
        r rVar2;
        ArrayList arrayList = this.f265e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f266f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z10 = d.f8671a;
        d.a.C0119a aVar = d.a.f7418b;
        int i10 = this.f267g;
        if (!(i10 == 2 || (i8 = this.f268h) == 2)) {
            db.d dVar = new db.d(aVar, i10, i8);
            r rVar3 = q.f7460a;
            r rVar4 = new r(Date.class, dVar);
            if (z10) {
                d.b bVar = fb.d.f8673c;
                bVar.getClass();
                rVar = new r(bVar.f7419a, new db.d(bVar, i10, i8));
                d.a aVar2 = fb.d.f8672b;
                aVar2.getClass();
                rVar2 = new r(aVar2.f7419a, new db.d(aVar2, i10, i8));
            } else {
                rVar = null;
                rVar2 = null;
            }
            arrayList3.add(rVar4);
            if (z10) {
                arrayList3.add(rVar);
                arrayList3.add(rVar2);
            }
        }
        return new i(this.f261a, this.f263c, new HashMap(this.f264d), this.f269i, this.f270j, this.f262b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f271k, this.f272l, new ArrayList(this.m));
    }
}
