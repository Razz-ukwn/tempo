package jg;

import cb.d;
import ff.g;
import gf.t;
import gf.y;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jg.c;
import jg.q;
import kg.b;
import sf.j;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final r f10219a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10220b;

    /* renamed from: c  reason: collision with root package name */
    public final q f10221c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f10222d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f10223e;

    /* renamed from: f  reason: collision with root package name */
    public c f10224f;

    public x(r rVar, String str, q qVar, b0 b0Var, Map<Class<?>, ? extends Object> map) {
        j.f(str, "method");
        this.f10219a = rVar;
        this.f10220b = str;
        this.f10221c = qVar;
        this.f10222d = b0Var;
        this.f10223e = map;
    }

    public final c a() {
        c cVar = this.f10224f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.f10031n;
        c b10 = c.b.b(this.f10221c);
        this.f10224f = b10;
        return b10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f10220b);
        sb2.append(", url=");
        sb2.append(this.f10219a);
        q qVar = this.f10221c;
        if (qVar.f10150a.length / 2 != 0) {
            sb2.append(", headers=[");
            int i8 = 0;
            for (Object next : qVar) {
                int i10 = i8 + 1;
                if (i8 >= 0) {
                    g gVar = (g) next;
                    String str = (String) gVar.f8706a;
                    String str2 = (String) gVar.f8707b;
                    if (i8 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(str);
                    sb2.append(':');
                    sb2.append(str2);
                    i8 = i10;
                } else {
                    d.i0();
                    throw null;
                }
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f10223e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public r f10225a;

        /* renamed from: b  reason: collision with root package name */
        public String f10226b;

        /* renamed from: c  reason: collision with root package name */
        public q.a f10227c;

        /* renamed from: d  reason: collision with root package name */
        public b0 f10228d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f10229e;

        public a() {
            this.f10229e = new LinkedHashMap();
            this.f10226b = "GET";
            this.f10227c = new q.a();
        }

        public final x a() {
            Map map;
            r rVar = this.f10225a;
            if (rVar != null) {
                String str = this.f10226b;
                q c3 = this.f10227c.c();
                b0 b0Var = this.f10228d;
                Map<Class<?>, Object> map2 = this.f10229e;
                byte[] bArr = b.f10474a;
                j.f(map2, "<this>");
                if (map2.isEmpty()) {
                    map = t.f8979a;
                } else {
                    map = Collections.unmodifiableMap(new LinkedHashMap(map2));
                    j.e(map, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
                }
                return new x(rVar, str, c3, b0Var, map);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void b(c cVar) {
            j.f(cVar, "cacheControl");
            String cVar2 = cVar.toString();
            if (cVar2.length() == 0) {
                this.f10227c.d("Cache-Control");
            } else {
                c("Cache-Control", cVar2);
            }
        }

        public final void c(String str, String str2) {
            j.f(str2, "value");
            q.a aVar = this.f10227c;
            aVar.getClass();
            q.b.a(str);
            q.b.b(str2, str);
            aVar.d(str);
            aVar.b(str, str2);
        }

        public final void d(String str, b0 b0Var) {
            j.f(str, "method");
            boolean z10 = false;
            if (str.length() > 0) {
                if (b0Var == null) {
                    if (j.a(str, "POST") || j.a(str, "PUT") || j.a(str, "PATCH") || j.a(str, "PROPPATCH") || j.a(str, "REPORT")) {
                        z10 = true;
                    }
                    if (!(!z10)) {
                        throw new IllegalArgumentException(b2.c.a("method ", str, " must have a request body.").toString());
                    }
                } else if (!androidx.databinding.a.k(str)) {
                    throw new IllegalArgumentException(b2.c.a("method ", str, " must not have a request body.").toString());
                }
                this.f10226b = str;
                this.f10228d = b0Var;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final void e(Class cls, Object obj) {
            j.f(cls, "type");
            if (obj == null) {
                this.f10229e.remove(cls);
                return;
            }
            if (this.f10229e.isEmpty()) {
                this.f10229e = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.f10229e;
            Object cast = cls.cast(obj);
            j.c(cast);
            map.put(cls, cast);
        }

        public a(x xVar) {
            LinkedHashMap linkedHashMap;
            this.f10229e = new LinkedHashMap();
            this.f10225a = xVar.f10219a;
            this.f10226b = xVar.f10220b;
            this.f10228d = xVar.f10222d;
            Map<Class<?>, Object> map = xVar.f10223e;
            if (map.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = y.Y(map);
            }
            this.f10229e = linkedHashMap;
            this.f10227c = xVar.f10221c.d();
        }
    }
}
