package k6;

import a6.b;
import android.database.Cursor;
import d6.h;
import d6.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k6.s;

public final /* synthetic */ class p implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f10324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f10325b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d6.s f10326c;

    public /* synthetic */ p(s sVar, ArrayList arrayList, d6.s sVar2) {
        this.f10324a = sVar;
        this.f10325b = arrayList;
        this.f10326c = sVar2;
    }

    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        s sVar = this.f10324a;
        sVar.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            h.a aVar = new h.a();
            aVar.f7336f = new HashMap();
            aVar.d(cursor.getString(1));
            aVar.f7334d = Long.valueOf(cursor.getLong(2));
            aVar.f7335e = Long.valueOf(cursor.getLong(3));
            if (z10) {
                String string = cursor.getString(4);
                aVar.c(new m(string == null ? s.B : new b(string), cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                aVar.c(new m(string2 == null ? s.B : new b(string2), (byte[]) s.D(sVar.p().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), new q(0))));
            }
            if (!cursor.isNull(6)) {
                aVar.f7332b = Integer.valueOf(cursor.getInt(6));
            }
            this.f10325b.add(new b(j10, this.f10326c, aVar.b()));
        }
        return null;
    }
}
