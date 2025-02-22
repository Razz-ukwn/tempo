package q7;

import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.d3;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.s3;
import com.google.android.gms.internal.measurement.t3;
import com.google.android.gms.internal.measurement.u3;
import com.google.android.gms.internal.measurement.v3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.a;

public final class f7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13007a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13008b;

    /* renamed from: c  reason: collision with root package name */
    public final t3 f13009c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f13010d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f13011e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f13012f;

    /* renamed from: g  reason: collision with root package name */
    public final a f13013g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f13014h;

    public /* synthetic */ f7(b bVar, String str) {
        this.f13014h = bVar;
        this.f13007a = str;
        this.f13008b = true;
        this.f13010d = new BitSet();
        this.f13011e = new BitSet();
        this.f13012f = new a();
        this.f13013g = new a();
    }

    public final b3 a(int i8) {
        ArrayList arrayList;
        List list;
        a3 u7 = b3.u();
        u7.l();
        b3.y((b3) u7.f5179b, i8);
        u7.l();
        b3.B((b3) u7.f5179b, this.f13008b);
        t3 t3Var = this.f13009c;
        if (t3Var != null) {
            u7.l();
            b3.A((b3) u7.f5179b, t3Var);
        }
        s3 x10 = t3.x();
        ArrayList E = v6.E(this.f13010d);
        x10.l();
        t3.G((t3) x10.f5179b, E);
        ArrayList E2 = v6.E(this.f13011e);
        x10.l();
        t3.E((t3) x10.f5179b, E2);
        Map map = this.f13012f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer intValue : map.keySet()) {
                int intValue2 = intValue.intValue();
                Long l10 = (Long) map.get(Integer.valueOf(intValue2));
                if (l10 != null) {
                    c3 v3 = d3.v();
                    v3.l();
                    d3.x((d3) v3.f5179b, intValue2);
                    long longValue = l10.longValue();
                    v3.l();
                    d3.y((d3) v3.f5179b, longValue);
                    arrayList.add((d3) v3.j());
                }
            }
        }
        if (arrayList != null) {
            x10.l();
            t3.I((t3) x10.f5179b, arrayList);
        }
        a aVar = this.f13013g;
        if (aVar == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(aVar.f12032c);
            Iterator it = ((a.c) aVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                u3 w10 = v3.w();
                int intValue3 = num.intValue();
                w10.l();
                v3.z((v3) w10.f5179b, intValue3);
                List list2 = (List) aVar.getOrDefault(num, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    w10.l();
                    v3.A((v3) w10.f5179b, list2);
                }
                arrayList2.add((v3) w10.j());
            }
            list = arrayList2;
        }
        x10.l();
        t3.K((t3) x10.f5179b, list);
        u7.l();
        b3.z((b3) u7.f5179b, (t3) x10.j());
        return (b3) u7.j();
    }

    public final void b(i7 i7Var) {
        int a10 = i7Var.a();
        Boolean bool = i7Var.f13129c;
        if (bool != null) {
            bool.booleanValue();
            this.f13011e.set(a10, true);
        }
        Boolean bool2 = i7Var.f13130d;
        if (bool2 != null) {
            this.f13010d.set(a10, bool2.booleanValue());
        }
        if (i7Var.f13131e != null) {
            Integer valueOf = Integer.valueOf(a10);
            Map map = this.f13012f;
            Long l10 = (Long) map.get(valueOf);
            long longValue = i7Var.f13131e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                map.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (i7Var.f13132f != null) {
            a aVar = this.f13013g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) aVar.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                aVar.put(valueOf2, list);
            }
            if (i7Var.c()) {
                list.clear();
            }
            ma.a();
            b bVar = this.f13014h;
            f fVar = ((x3) bVar.f13121a).C;
            f2 f2Var = g2.Y;
            String str = this.f13007a;
            if (fVar.r(str, f2Var) && i7Var.b()) {
                list.clear();
            }
            ma.a();
            if (((x3) bVar.f13121a).C.r(str, f2Var)) {
                Long valueOf3 = Long.valueOf(i7Var.f13132f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(i7Var.f13132f.longValue() / 1000));
        }
    }

    public f7(b bVar, String str, t3 t3Var, BitSet bitSet, BitSet bitSet2, a aVar, a aVar2) {
        this.f13014h = bVar;
        this.f13007a = str;
        this.f13010d = bitSet;
        this.f13011e = bitSet2;
        this.f13012f = aVar;
        this.f13013g = new a();
        Iterator it = ((a.c) aVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) aVar2.getOrDefault(num, null));
            this.f13013g.put(num, arrayList);
        }
        this.f13008b = false;
        this.f13009c = t3Var;
    }
}
