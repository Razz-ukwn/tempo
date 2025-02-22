package j6;

import android.content.Context;
import d6.h;
import d6.p;
import d6.s;
import e6.e;
import e6.m;
import j0.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import k6.c;
import k6.d;
import k6.i;
import l6.b;
import m6.a;
import ma.g;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9835a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9836b;

    /* renamed from: c  reason: collision with root package name */
    public final d f9837c;

    /* renamed from: d  reason: collision with root package name */
    public final r f9838d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f9839e;

    /* renamed from: f  reason: collision with root package name */
    public final b f9840f;

    /* renamed from: g  reason: collision with root package name */
    public final a f9841g;

    /* renamed from: h  reason: collision with root package name */
    public final a f9842h;

    /* renamed from: i  reason: collision with root package name */
    public final c f9843i;

    public n(Context context, e eVar, d dVar, r rVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f9835a = context;
        this.f9836b = eVar;
        this.f9837c = dVar;
        this.f9838d = rVar;
        this.f9839e = executor;
        this.f9840f = bVar;
        this.f9841g = aVar;
        this.f9842h = aVar2;
        this.f9843i = cVar;
    }

    public final void a(s sVar, int i8) {
        e6.b bVar;
        s sVar2 = sVar;
        m a10 = this.f9836b.a(sVar.b());
        new e6.b(1, 0);
        long j10 = 0;
        while (true) {
            boolean z10 = false;
            h hVar = new h(this, sVar2, 0);
            b bVar2 = this.f9840f;
            if (((Boolean) bVar2.d(hVar)).booleanValue()) {
                Iterable<i> iterable = (Iterable) bVar2.d(new i(this, sVar2));
                if (iterable.iterator().hasNext()) {
                    if (a10 == null) {
                        h6.a.a(sVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                        bVar = new e6.b(3, -1);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (i a11 : iterable) {
                            arrayList.add(a11.a());
                        }
                        if (sVar.c() != null) {
                            c cVar = this.f9843i;
                            Objects.requireNonNull(cVar);
                            g6.a aVar = (g6.a) bVar2.d(new m(cVar));
                            h.a aVar2 = new h.a();
                            aVar2.f7336f = new HashMap();
                            aVar2.f7334d = Long.valueOf(this.f9841g.a());
                            aVar2.f7335e = Long.valueOf(this.f9842h.a());
                            aVar2.d("GDT_CLIENT_METRICS");
                            a6.b bVar3 = new a6.b("proto");
                            aVar.getClass();
                            g gVar = p.f7356a;
                            gVar.getClass();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                gVar.a(aVar, byteArrayOutputStream);
                            } catch (IOException unused) {
                            }
                            aVar2.c(new d6.m(bVar3, byteArrayOutputStream.toByteArray()));
                            arrayList.add(a10.a(aVar2.b()));
                        }
                        bVar = a10.b(new e6.a(arrayList, sVar.c()));
                    }
                    if (bVar.f7848a == 2) {
                        bVar2.d(new j(this, iterable, sVar, j10));
                        this.f9838d.a(sVar2, i8 + 1, true);
                        return;
                    }
                    bVar2.d(new k(this, iterable));
                    int i10 = bVar.f7848a;
                    if (i10 == 1) {
                        j10 = Math.max(j10, bVar.f7849b);
                        if (sVar.c() != null) {
                            z10 = true;
                        }
                        if (z10) {
                            bVar2.d(new q(this));
                        }
                    } else if (i10 == 4) {
                        HashMap hashMap = new HashMap();
                        for (i a12 : iterable) {
                            String g10 = a12.a().g();
                            if (!hashMap.containsKey(g10)) {
                                hashMap.put(g10, 1);
                            } else {
                                hashMap.put(g10, Integer.valueOf(((Integer) hashMap.get(g10)).intValue() + 1));
                            }
                        }
                        bVar2.d(new h(this, hashMap, 1));
                    }
                } else {
                    return;
                }
            } else {
                bVar2.d(new l(this, sVar2, j10));
                return;
            }
        }
    }
}
