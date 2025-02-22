package jg;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jg.t;
import kg.b;
import sf.j;
import wg.e;
import wg.g;

public final class o extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public static final t f10138c = t.a.a("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f10139a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f10140b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Charset f10141a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f10142b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f10143c = new ArrayList();
    }

    static {
        Pattern pattern = t.f10171d;
    }

    public o(ArrayList arrayList, ArrayList arrayList2) {
        j.f(arrayList, "encodedNames");
        j.f(arrayList2, "encodedValues");
        this.f10139a = b.x(arrayList);
        this.f10140b = b.x(arrayList2);
    }

    public final long a() {
        return d((g) null, true);
    }

    public final t b() {
        return f10138c;
    }

    public final void c(g gVar) {
        d(gVar, false);
    }

    public final long d(g gVar, boolean z10) {
        e eVar;
        if (z10) {
            eVar = new e();
        } else {
            j.c(gVar);
            eVar = gVar.a();
        }
        List<String> list = this.f10139a;
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                eVar.g0(38);
            }
            eVar.v0(list.get(i8));
            eVar.g0(61);
            eVar.v0(this.f10140b.get(i8));
            i8 = i10;
        }
        if (!z10) {
            return 0;
        }
        long j10 = eVar.f16752b;
        eVar.j();
        return j10;
    }
}
