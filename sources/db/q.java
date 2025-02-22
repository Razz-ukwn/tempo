package db;

import androidx.appcompat.widget.a1;
import cb.r;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class q {
    public static final u A;
    public static final u B = new u();

    /* renamed from: a  reason: collision with root package name */
    public static final r f7460a = new r(Class.class, new ab.z(new k()));

    /* renamed from: b  reason: collision with root package name */
    public static final r f7461b = new r(BitSet.class, new ab.z(new v()));

    /* renamed from: c  reason: collision with root package name */
    public static final x f7462c = new x();

    /* renamed from: d  reason: collision with root package name */
    public static final s f7463d;

    /* renamed from: e  reason: collision with root package name */
    public static final s f7464e = new s(Byte.TYPE, Byte.class, new y());

    /* renamed from: f  reason: collision with root package name */
    public static final s f7465f = new s(Short.TYPE, Short.class, new z());

    /* renamed from: g  reason: collision with root package name */
    public static final s f7466g = new s(Integer.TYPE, Integer.class, new a0());

    /* renamed from: h  reason: collision with root package name */
    public static final r f7467h = new r(AtomicInteger.class, new ab.z(new b0()));

    /* renamed from: i  reason: collision with root package name */
    public static final r f7468i = new r(AtomicBoolean.class, new ab.z(new c0()));

    /* renamed from: j  reason: collision with root package name */
    public static final r f7469j = new r(AtomicIntegerArray.class, new ab.z(new a()));

    /* renamed from: k  reason: collision with root package name */
    public static final b f7470k = new b();

    /* renamed from: l  reason: collision with root package name */
    public static final s f7471l = new s(Character.TYPE, Character.class, new e());
    public static final g m = new g();

    /* renamed from: n  reason: collision with root package name */
    public static final h f7472n = new h();

    /* renamed from: o  reason: collision with root package name */
    public static final i f7473o = new i();

    /* renamed from: p  reason: collision with root package name */
    public static final r f7474p;

    /* renamed from: q  reason: collision with root package name */
    public static final r f7475q = new r(StringBuilder.class, new j());

    /* renamed from: r  reason: collision with root package name */
    public static final r f7476r = new r(StringBuffer.class, new l());

    /* renamed from: s  reason: collision with root package name */
    public static final r f7477s = new r(URL.class, new m());

    /* renamed from: t  reason: collision with root package name */
    public static final r f7478t = new r(URI.class, new n());

    /* renamed from: u  reason: collision with root package name */
    public static final u f7479u = new u(InetAddress.class, new o());

    /* renamed from: v  reason: collision with root package name */
    public static final r f7480v = new r(UUID.class, new p());

    /* renamed from: w  reason: collision with root package name */
    public static final r f7481w = new r(Currency.class, new ab.z(new C0120q()));

    /* renamed from: x  reason: collision with root package name */
    public static final t f7482x = new t(new r());

    /* renamed from: y  reason: collision with root package name */
    public static final r f7483y = new r(Locale.class, new s());

    /* renamed from: z  reason: collision with root package name */
    public static final t f7484z;

    public class a extends ab.a0<AtomicIntegerArray> {
        public final Object a(hb.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.F()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.T()));
                } catch (NumberFormatException e10) {
                    throw new ab.u((Exception) e10);
                }
            }
            aVar.p();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i8 = 0; i8 < size; i8++) {
                atomicIntegerArray.set(i8, ((Integer) arrayList.get(i8)).intValue());
            }
            return atomicIntegerArray;
        }

        public final void b(hb.b bVar, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            bVar.d();
            int length = atomicIntegerArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                bVar.K((long) atomicIntegerArray.get(i8));
            }
            bVar.p();
        }
    }

    public class a0 extends ab.a0<Number> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.T());
            } catch (NumberFormatException e10) {
                throw new ab.u((Exception) e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((Number) obj);
        }
    }

    public class b extends ab.a0<Number> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                return Long.valueOf(aVar.X());
            } catch (NumberFormatException e10) {
                throw new ab.u((Exception) e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((Number) obj);
        }
    }

    public class b0 extends ab.a0<AtomicInteger> {
        public final Object a(hb.a aVar) {
            try {
                return new AtomicInteger(aVar.T());
            } catch (NumberFormatException e10) {
                throw new ab.u((Exception) e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.K((long) ((AtomicInteger) obj).get());
        }
    }

    public class c extends ab.a0<Number> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return Float.valueOf((float) aVar.R());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((Number) obj);
        }
    }

    public class c0 extends ab.a0<AtomicBoolean> {
        public final Object a(hb.a aVar) {
            return new AtomicBoolean(aVar.Q());
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.T(((AtomicBoolean) obj).get());
        }
    }

    public class d extends ab.a0<Number> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return Double.valueOf(aVar.R());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((Number) obj);
        }
    }

    public static final class d0<T extends Enum<T>> extends ab.a0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f7485a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f7486b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f7487c = new HashMap();

        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f7488a;

            public a(Class cls) {
                this.f7488a = cls;
            }

            public final Object run() {
                Field[] declaredFields = this.f7488a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public d0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    String str = enumR.toString();
                    bb.b bVar = (bb.b) field.getAnnotation(bb.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.f7485a.put(put, enumR);
                        }
                    }
                    this.f7485a.put(name, enumR);
                    this.f7486b.put(str, enumR);
                    this.f7487c.put(enumR, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String f02 = aVar.f0();
            Enum enumR = (Enum) this.f7485a.get(f02);
            return enumR == null ? (Enum) this.f7486b.get(f02) : enumR;
        }

        public final void b(hb.b bVar, Object obj) {
            Enum enumR = (Enum) obj;
            bVar.R(enumR == null ? null : (String) this.f7487c.get(enumR));
        }
    }

    public class e extends ab.a0<Character> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String f02 = aVar.f0();
            if (f02.length() == 1) {
                return Character.valueOf(f02.charAt(0));
            }
            StringBuilder c3 = androidx.activity.result.d.c("Expecting character, got: ", f02, "; at ");
            c3.append(aVar.D());
            throw new ab.u(c3.toString());
        }

        public final void b(hb.b bVar, Object obj) {
            Character ch = (Character) obj;
            bVar.R(ch == null ? null : String.valueOf(ch));
        }
    }

    public class f extends ab.a0<String> {
        public final Object a(hb.a aVar) {
            int k02 = aVar.k0();
            if (k02 != 9) {
                return k02 == 8 ? Boolean.toString(aVar.Q()) : aVar.f0();
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.R((String) obj);
        }
    }

    public class g extends ab.a0<BigDecimal> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String f02 = aVar.f0();
            try {
                return new BigDecimal(f02);
            } catch (NumberFormatException e10) {
                StringBuilder c3 = androidx.activity.result.d.c("Failed parsing '", f02, "' as BigDecimal; at path ");
                c3.append(aVar.D());
                throw new ab.u(c3.toString(), e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((BigDecimal) obj);
        }
    }

    public class h extends ab.a0<BigInteger> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String f02 = aVar.f0();
            try {
                return new BigInteger(f02);
            } catch (NumberFormatException e10) {
                StringBuilder c3 = androidx.activity.result.d.c("Failed parsing '", f02, "' as BigInteger; at path ");
                c3.append(aVar.D());
                throw new ab.u(c3.toString(), e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((BigInteger) obj);
        }
    }

    public class i extends ab.a0<cb.q> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return new cb.q(aVar.f0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((cb.q) obj);
        }
    }

    public class j extends ab.a0<StringBuilder> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return new StringBuilder(aVar.f0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            StringBuilder sb2 = (StringBuilder) obj;
            bVar.R(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends ab.a0<Class> {
        public final Object a(hb.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final void b(hb.b bVar, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }

    public class l extends ab.a0<StringBuffer> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return new StringBuffer(aVar.f0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            bVar.R(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class m extends ab.a0<URL> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
            } else {
                String f02 = aVar.f0();
                if (!"null".equals(f02)) {
                    return new URL(f02);
                }
            }
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            URL url = (URL) obj;
            bVar.R(url == null ? null : url.toExternalForm());
        }
    }

    public class n extends ab.a0<URI> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
            } else {
                try {
                    String f02 = aVar.f0();
                    if (!"null".equals(f02)) {
                        return new URI(f02);
                    }
                } catch (URISyntaxException e10) {
                    throw new ab.o((Exception) e10);
                }
            }
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            URI uri = (URI) obj;
            bVar.R(uri == null ? null : uri.toASCIIString());
        }
    }

    public class o extends ab.a0<InetAddress> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return InetAddress.getByName(aVar.f0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            bVar.R(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class p extends ab.a0<UUID> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            String f02 = aVar.f0();
            try {
                return UUID.fromString(f02);
            } catch (IllegalArgumentException e10) {
                StringBuilder c3 = androidx.activity.result.d.c("Failed parsing '", f02, "' as UUID; at path ");
                c3.append(aVar.D());
                throw new ab.u(c3.toString(), e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            UUID uuid = (UUID) obj;
            bVar.R(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: db.q$q  reason: collision with other inner class name */
    public class C0120q extends ab.a0<Currency> {
        public final Object a(hb.a aVar) {
            String f02 = aVar.f0();
            try {
                return Currency.getInstance(f02);
            } catch (IllegalArgumentException e10) {
                StringBuilder c3 = androidx.activity.result.d.c("Failed parsing '", f02, "' as Currency; at path ");
                c3.append(aVar.D());
                throw new ab.u(c3.toString(), e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.R(((Currency) obj).getCurrencyCode());
        }
    }

    public class r extends ab.a0<Calendar> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            aVar.d();
            int i8 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (aVar.k0() != 4) {
                String Y = aVar.Y();
                int T = aVar.T();
                if ("year".equals(Y)) {
                    i8 = T;
                } else if ("month".equals(Y)) {
                    i10 = T;
                } else if ("dayOfMonth".equals(Y)) {
                    i11 = T;
                } else if ("hourOfDay".equals(Y)) {
                    i12 = T;
                } else if ("minute".equals(Y)) {
                    i13 = T;
                } else if ("second".equals(Y)) {
                    i14 = T;
                }
            }
            aVar.q();
            return new GregorianCalendar(i8, i10, i11, i12, i13, i14);
        }

        public final void b(hb.b bVar, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                bVar.z();
                return;
            }
            bVar.e();
            bVar.s("year");
            bVar.K((long) calendar.get(1));
            bVar.s("month");
            bVar.K((long) calendar.get(2));
            bVar.s("dayOfMonth");
            bVar.K((long) calendar.get(5));
            bVar.s("hourOfDay");
            bVar.K((long) calendar.get(11));
            bVar.s("minute");
            bVar.K((long) calendar.get(12));
            bVar.s("second");
            bVar.K((long) calendar.get(13));
            bVar.q();
        }
    }

    public class s extends ab.a0<Locale> {
        public final Object a(hb.a aVar) {
            String str = null;
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.f0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        public final void b(hb.b bVar, Object obj) {
            Locale locale = (Locale) obj;
            bVar.R(locale == null ? null : locale.toString());
        }
    }

    public class t extends ab.a0<ab.n> {
        public static ab.n c(hb.a aVar, int i8) {
            if (i8 != 0) {
                int i10 = i8 - 1;
                if (i10 == 5) {
                    return new ab.s(aVar.f0());
                }
                if (i10 == 6) {
                    return new ab.s((Number) new cb.q(aVar.f0()));
                }
                if (i10 == 7) {
                    return new ab.s(Boolean.valueOf(aVar.Q()));
                }
                if (i10 == 8) {
                    aVar.d0();
                    return ab.p.f274a;
                }
                throw new IllegalStateException("Unexpected token: ".concat(h0.e.d(i8)));
            }
            throw null;
        }

        public static ab.n d(hb.a aVar, int i8) {
            if (i8 != 0) {
                int i10 = i8 - 1;
                if (i10 == 0) {
                    aVar.c();
                    return new ab.l();
                } else if (i10 != 2) {
                    return null;
                } else {
                    aVar.d();
                    return new ab.q();
                }
            } else {
                throw null;
            }
        }

        public static void e(ab.n nVar, hb.b bVar) {
            if (nVar == null || (nVar instanceof ab.p)) {
                bVar.z();
                return;
            }
            boolean z10 = nVar instanceof ab.s;
            if (!z10) {
                boolean z11 = nVar instanceof ab.l;
                if (z11) {
                    bVar.d();
                    if (z11) {
                        Iterator<ab.n> it = ((ab.l) nVar).iterator();
                        while (it.hasNext()) {
                            e(it.next(), bVar);
                        }
                        bVar.p();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + nVar);
                }
                boolean z12 = nVar instanceof ab.q;
                if (z12) {
                    bVar.e();
                    if (z12) {
                        cb.r rVar = cb.r.this;
                        r.e<K, V> eVar = rVar.f3937e.f3947d;
                        int i8 = rVar.f3936d;
                        while (true) {
                            r.e<K, V> eVar2 = rVar.f3937e;
                            if (!(eVar != eVar2)) {
                                bVar.q();
                                return;
                            } else if (eVar == eVar2) {
                                throw new NoSuchElementException();
                            } else if (rVar.f3936d == i8) {
                                r.e<K, V> eVar3 = eVar.f3947d;
                                bVar.s((String) eVar.B);
                                e((ab.n) eVar.C, bVar);
                                eVar = eVar3;
                            } else {
                                throw new ConcurrentModificationException();
                            }
                        }
                    } else {
                        throw new IllegalStateException("Not a JSON Object: " + nVar);
                    }
                } else {
                    throw new IllegalArgumentException("Couldn't write " + nVar.getClass());
                }
            } else if (z10) {
                ab.s sVar = (ab.s) nVar;
                Serializable serializable = sVar.f276a;
                if (serializable instanceof Number) {
                    bVar.Q(sVar.b());
                } else if (serializable instanceof Boolean) {
                    bVar.T(sVar.a());
                } else {
                    bVar.R(sVar.c());
                }
            } else {
                throw new IllegalStateException("Not a JSON Primitive: " + nVar);
            }
        }

        public final Object a(hb.a aVar) {
            ab.n nVar;
            ab.n nVar2;
            if (aVar instanceof f) {
                f fVar = (f) aVar;
                int k02 = fVar.k0();
                if (k02 == 5 || k02 == 2 || k02 == 4 || k02 == 10) {
                    throw new IllegalStateException("Unexpected " + h0.e.d(k02) + " when reading a JsonElement.");
                }
                ab.n nVar3 = (ab.n) fVar.E0();
                fVar.v0();
                return nVar3;
            }
            int k03 = aVar.k0();
            ab.n d10 = d(aVar, k03);
            if (d10 == null) {
                return c(aVar, k03);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.F()) {
                    String Y = d10 instanceof ab.q ? aVar.Y() : null;
                    int k04 = aVar.k0();
                    ab.n d11 = d(aVar, k04);
                    boolean z10 = d11 != null;
                    if (d11 == null) {
                        d11 = c(aVar, k04);
                    }
                    if (d10 instanceof ab.l) {
                        ab.l lVar = (ab.l) d10;
                        if (d11 == null) {
                            lVar.getClass();
                            nVar2 = ab.p.f274a;
                        } else {
                            nVar2 = d11;
                        }
                        lVar.f273a.add(nVar2);
                    } else {
                        ab.q qVar = (ab.q) d10;
                        if (d11 == null) {
                            qVar.getClass();
                            nVar = ab.p.f274a;
                        } else {
                            nVar = d11;
                        }
                        qVar.f275a.put(Y, nVar);
                    }
                    if (z10) {
                        arrayDeque.addLast(d10);
                        d10 = d11;
                    }
                } else {
                    if (d10 instanceof ab.l) {
                        aVar.p();
                    } else {
                        aVar.q();
                    }
                    if (arrayDeque.isEmpty()) {
                        return d10;
                    }
                    d10 = (ab.n) arrayDeque.removeLast();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void b(hb.b bVar, Object obj) {
            e((ab.n) obj, bVar);
        }
    }

    public class u implements ab.b0 {
        public final <T> ab.a0<T> a(ab.i iVar, gb.a<T> aVar) {
            Class cls = aVar.f8928a;
            Class<Enum> cls2 = Enum.class;
            if (!cls2.isAssignableFrom(cls) || cls == cls2) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new d0(cls);
        }
    }

    public class v extends ab.a0<BitSet> {
        public final Object a(hb.a aVar) {
            boolean z10;
            BitSet bitSet = new BitSet();
            aVar.c();
            int k02 = aVar.k0();
            int i8 = 0;
            while (k02 != 2) {
                int c3 = q.g.c(k02);
                if (c3 == 5 || c3 == 6) {
                    int T = aVar.T();
                    if (T == 0) {
                        z10 = false;
                    } else if (T == 1) {
                        z10 = true;
                    } else {
                        StringBuilder b10 = a1.b("Invalid bitset value ", T, ", expected 0 or 1; at path ");
                        b10.append(aVar.D());
                        throw new ab.u(b10.toString());
                    }
                } else if (c3 == 7) {
                    z10 = aVar.Q();
                } else {
                    throw new ab.u("Invalid bitset value type: " + h0.e.d(k02) + "; at path " + aVar.u());
                }
                if (z10) {
                    bitSet.set(i8);
                }
                i8++;
                k02 = aVar.k0();
            }
            aVar.p();
            return bitSet;
        }

        public final void b(hb.b bVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            bVar.d();
            int length = bitSet.length();
            for (int i8 = 0; i8 < length; i8++) {
                bVar.K(bitSet.get(i8) ? 1 : 0);
            }
            bVar.p();
        }
    }

    public class w extends ab.a0<Boolean> {
        public final Object a(hb.a aVar) {
            int k02 = aVar.k0();
            if (k02 != 9) {
                return k02 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.f0())) : Boolean.valueOf(aVar.Q());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.L((Boolean) obj);
        }
    }

    public class x extends ab.a0<Boolean> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() != 9) {
                return Boolean.valueOf(aVar.f0());
            }
            aVar.d0();
            return null;
        }

        public final void b(hb.b bVar, Object obj) {
            Boolean bool = (Boolean) obj;
            bVar.R(bool == null ? "null" : bool.toString());
        }
    }

    public class y extends ab.a0<Number> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                int T = aVar.T();
                if (T <= 255 && T >= -128) {
                    return Byte.valueOf((byte) T);
                }
                StringBuilder b10 = a1.b("Lossy conversion from ", T, " to byte; at path ");
                b10.append(aVar.D());
                throw new ab.u(b10.toString());
            } catch (NumberFormatException e10) {
                throw new ab.u((Exception) e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((Number) obj);
        }
    }

    public class z extends ab.a0<Number> {
        public final Object a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            try {
                int T = aVar.T();
                if (T <= 65535 && T >= -32768) {
                    return Short.valueOf((short) T);
                }
                StringBuilder b10 = a1.b("Lossy conversion from ", T, " to short; at path ");
                b10.append(aVar.D());
                throw new ab.u(b10.toString());
            } catch (NumberFormatException e10) {
                throw new ab.u((Exception) e10);
            }
        }

        public final void b(hb.b bVar, Object obj) {
            bVar.Q((Number) obj);
        }
    }

    static {
        w wVar = new w();
        f7463d = new s(Boolean.TYPE, Boolean.class, wVar);
        new c();
        new d();
        f fVar = new f();
        f7474p = new r(String.class, fVar);
        t tVar = new t();
        f7484z = tVar;
        A = new u(ab.n.class, tVar);
    }
}
