package j6;

import a6.d;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import d6.h;
import ff.m;
import j0.q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import k6.e;
import k6.s;
import l6.b;
import qa.a;
import sb.h;
import sf.j;
import sf.v;

public final /* synthetic */ class i implements b.a, s.a, a.C0253a, ve.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9823a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9824b;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f9824b = obj;
        this.f9823a = obj2;
    }

    public final void accept(Object obj) {
        Uri fromFile;
        v vVar = (v) this.f9824b;
        h hVar = (h) this.f9823a;
        m mVar = (m) obj;
        j.f(vVar, "$image");
        j.f(hVar, "this$0");
        File file = (File) vVar.f14957a;
        if (file != null && (fromFile = Uri.fromFile(file)) != null) {
            hVar.f14895f.i(fromFile);
        }
    }

    public final Object apply(Object obj) {
        s sVar = (s) this.f9824b;
        d6.s sVar2 = (d6.s) this.f9823a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        e eVar = sVar.f10332d;
        ArrayList u7 = sVar.u(sQLiteDatabase, sVar2, eVar.c());
        for (d dVar : d.values()) {
            if (dVar != sVar2.d()) {
                int c3 = eVar.c() - u7.size();
                if (c3 <= 0) {
                    break;
                }
                u7.addAll(sVar.u(sQLiteDatabase, sVar2.e(dVar), c3));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < u7.size(); i8++) {
            sb2.append(((k6.i) u7.get(i8)).b());
            if (i8 < u7.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        s.D(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new q(hashMap));
        ListIterator listIterator = u7.listIterator();
        while (listIterator.hasNext()) {
            k6.i iVar = (k6.i) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(iVar.b()))) {
                h.a i10 = iVar.a().i();
                for (s.b bVar : (Set) hashMap.get(Long.valueOf(iVar.b()))) {
                    i10.a(bVar.f10334a, bVar.f10335b);
                }
                listIterator.set(new k6.b(iVar.b(), iVar.c(), i10.b()));
            }
        }
        return u7;
    }

    public final Object b() {
        return ((n) this.f9824b).f9837c.r0((d6.s) this.f9823a);
    }

    public final void d(qa.b bVar) {
        ((a.C0253a) this.f9824b).d(bVar);
        ((a.C0253a) this.f9823a).d(bVar);
    }
}
