package yg;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import jg.b0;
import jg.q;
import jg.u;
import yg.a;

public abstract class x<T> {

    public static final class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17518a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17519b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, b0> f17520c;

        public a(Method method, int i8, f<T, b0> fVar) {
            this.f17518a = method;
            this.f17519b = i8;
            this.f17520c = fVar;
        }

        public final void a(z zVar, T t2) {
            int i8 = this.f17519b;
            Method method = this.f17518a;
            if (t2 != null) {
                try {
                    zVar.f17572k = this.f17520c.a(t2);
                } catch (IOException e10) {
                    throw g0.k(method, e10, i8, "Unable to convert " + t2 + " to RequestBody", new Object[0]);
                }
            } else {
                throw g0.j(method, i8, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class b<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f17521a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f17522b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17523c;

        public b(String str, boolean z10) {
            a.d dVar = a.d.f17407a;
            Objects.requireNonNull(str, "name == null");
            this.f17521a = str;
            this.f17522b = dVar;
            this.f17523c = z10;
        }

        public final void a(z zVar, T t2) {
            String a10;
            if (t2 != null && (a10 = this.f17522b.a(t2)) != null) {
                zVar.a(this.f17521a, a10, this.f17523c);
            }
        }
    }

    public static final class c<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17524a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17525b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17526c;

        public c(Method method, int i8, boolean z10) {
            this.f17524a = method;
            this.f17525b = i8;
            this.f17526c = z10;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i8 = this.f17525b;
            Method method = this.f17524a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.a(str, obj2, this.f17526c);
                            } else {
                                throw g0.j(method, i8, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw g0.j(method, i8, b2.c.a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.j(method, i8, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.j(method, i8, "Field map was null.", new Object[0]);
        }
    }

    public static final class d<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f17527a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f17528b;

        public d(String str) {
            a.d dVar = a.d.f17407a;
            Objects.requireNonNull(str, "name == null");
            this.f17527a = str;
            this.f17528b = dVar;
        }

        public final void a(z zVar, T t2) {
            String a10;
            if (t2 != null && (a10 = this.f17528b.a(t2)) != null) {
                zVar.b(this.f17527a, a10);
            }
        }
    }

    public static final class e<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17529a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17530b;

        public e(Method method, int i8) {
            this.f17529a = method;
            this.f17530b = i8;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i8 = this.f17530b;
            Method method = this.f17529a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.b(str, value.toString());
                        } else {
                            throw g0.j(method, i8, b2.c.a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.j(method, i8, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.j(method, i8, "Header map was null.", new Object[0]);
        }
    }

    public static final class f extends x<q> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17531a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17532b;

        public f(int i8, Method method) {
            this.f17531a = method;
            this.f17532b = i8;
        }

        public final void a(z zVar, Object obj) {
            q qVar = (q) obj;
            if (qVar != null) {
                q.a aVar = zVar.f17567f;
                aVar.getClass();
                int length = qVar.f10150a.length / 2;
                for (int i8 = 0; i8 < length; i8++) {
                    aVar.b(qVar.c(i8), qVar.e(i8));
                }
                return;
            }
            int i10 = this.f17532b;
            throw g0.j(this.f17531a, i10, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class g<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17533a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17534b;

        /* renamed from: c  reason: collision with root package name */
        public final q f17535c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, b0> f17536d;

        public g(Method method, int i8, q qVar, f<T, b0> fVar) {
            this.f17533a = method;
            this.f17534b = i8;
            this.f17535c = qVar;
            this.f17536d = fVar;
        }

        public final void a(z zVar, T t2) {
            if (t2 != null) {
                try {
                    b0 a10 = this.f17536d.a(t2);
                    u.a aVar = zVar.f17570i;
                    aVar.getClass();
                    sf.j.f(a10, "body");
                    aVar.f10187c.add(u.c.a.a(this.f17535c, a10));
                } catch (IOException e10) {
                    throw g0.j(this.f17533a, this.f17534b, "Unable to convert " + t2 + " to RequestBody", e10);
                }
            }
        }
    }

    public static final class h<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17537a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17538b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T, b0> f17539c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17540d;

        public h(Method method, int i8, f<T, b0> fVar, String str) {
            this.f17537a = method;
            this.f17538b = i8;
            this.f17539c = fVar;
            this.f17540d = str;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i8 = this.f17538b;
            Method method = this.f17537a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            q c3 = q.b.c("Content-Disposition", b2.c.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f17540d);
                            b0 a10 = this.f17539c.a(value);
                            u.a aVar = zVar.f17570i;
                            aVar.getClass();
                            sf.j.f(a10, "body");
                            aVar.f10187c.add(u.c.a.a(c3, a10));
                        } else {
                            throw g0.j(method, i8, b2.c.a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.j(method, i8, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.j(method, i8, "Part map was null.", new Object[0]);
        }
    }

    public static final class i<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17541a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17542b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17543c;

        /* renamed from: d  reason: collision with root package name */
        public final f<T, String> f17544d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f17545e;

        public i(Method method, int i8, String str, boolean z10) {
            a.d dVar = a.d.f17407a;
            this.f17541a = method;
            this.f17542b = i8;
            Objects.requireNonNull(str, "name == null");
            this.f17543c = str;
            this.f17544d = dVar;
            this.f17545e = z10;
        }

        public final void a(z zVar, T t2) {
            String str;
            int i8;
            boolean z10;
            int i10;
            z zVar2 = zVar;
            T t10 = t2;
            String str2 = this.f17543c;
            if (t10 != null) {
                String a10 = this.f17544d.a(t10);
                if (zVar2.f17564c != null) {
                    int length = a10.length();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            str = a10;
                            break;
                        }
                        int codePointAt = a10.codePointAt(i11);
                        i8 = 47;
                        z10 = this.f17545e;
                        i10 = -1;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z10 && (codePointAt == 47 || codePointAt == 37))) {
                            wg.e eVar = new wg.e();
                            eVar.q0(0, i11, a10);
                            wg.e eVar2 = null;
                        } else {
                            i11 += Character.charCount(codePointAt);
                        }
                    }
                    wg.e eVar3 = new wg.e();
                    eVar3.q0(0, i11, a10);
                    wg.e eVar22 = null;
                    while (i11 < length) {
                        int codePointAt2 = a10.codePointAt(i11);
                        if (!z10 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i10 || (!z10 && (codePointAt2 == i8 || codePointAt2 == 37))) {
                                if (eVar22 == null) {
                                    eVar22 = new wg.e();
                                }
                                eVar22.w0(codePointAt2);
                                while (!eVar22.y()) {
                                    byte readByte = eVar22.readByte() & 255;
                                    eVar3.g0(37);
                                    char[] cArr = z.f17561l;
                                    eVar3.g0(cArr[(readByte >> 4) & 15]);
                                    eVar3.g0(cArr[readByte & 15]);
                                }
                            } else {
                                eVar3.w0(codePointAt2);
                            }
                        }
                        i11 += Character.charCount(codePointAt2);
                        i8 = 47;
                        i10 = -1;
                    }
                    str = eVar3.X();
                    String replace = zVar2.f17564c.replace("{" + str2 + "}", str);
                    if (!z.m.matcher(replace).matches()) {
                        zVar2.f17564c = replace;
                        return;
                    }
                    throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(a10));
                }
                throw new AssertionError();
            }
            throw g0.j(this.f17541a, this.f17542b, b2.c.a("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
    }

    public static final class j<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f17546a;

        /* renamed from: b  reason: collision with root package name */
        public final f<T, String> f17547b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17548c;

        public j(String str, boolean z10) {
            a.d dVar = a.d.f17407a;
            Objects.requireNonNull(str, "name == null");
            this.f17546a = str;
            this.f17547b = dVar;
            this.f17548c = z10;
        }

        public final void a(z zVar, T t2) {
            String a10;
            if (t2 != null && (a10 = this.f17547b.a(t2)) != null) {
                zVar.c(this.f17546a, a10, this.f17548c);
            }
        }
    }

    public static final class k<T> extends x<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17549a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17550b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17551c;

        public k(Method method, int i8, boolean z10) {
            this.f17549a = method;
            this.f17550b = i8;
            this.f17551c = z10;
        }

        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            int i8 = this.f17550b;
            Method method = this.f17549a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.c(str, obj2, this.f17551c);
                            } else {
                                throw g0.j(method, i8, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw g0.j(method, i8, b2.c.a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw g0.j(method, i8, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw g0.j(method, i8, "Query map was null", new Object[0]);
        }
    }

    public static final class l<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f17552a;

        public l(boolean z10) {
            this.f17552a = z10;
        }

        public final void a(z zVar, T t2) {
            if (t2 != null) {
                zVar.c(t2.toString(), (String) null, this.f17552a);
            }
        }
    }

    public static final class m extends x<u.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f17553a = new m();

        public final void a(z zVar, Object obj) {
            u.c cVar = (u.c) obj;
            if (cVar != null) {
                u.a aVar = zVar.f17570i;
                aVar.getClass();
                aVar.f10187c.add(cVar);
            }
        }
    }

    public static final class n extends x<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f17554a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17555b;

        public n(int i8, Method method) {
            this.f17554a = method;
            this.f17555b = i8;
        }

        public final void a(z zVar, Object obj) {
            if (obj != null) {
                zVar.f17564c = obj.toString();
                return;
            }
            int i8 = this.f17555b;
            throw g0.j(this.f17554a, i8, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class o<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f17556a;

        public o(Class<T> cls) {
            this.f17556a = cls;
        }

        public final void a(z zVar, T t2) {
            zVar.f17566e.e(this.f17556a, t2);
        }
    }

    public abstract void a(z zVar, T t2);
}
