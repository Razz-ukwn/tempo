package b3;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

public abstract class h0<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final f f3066b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static final i f3067c = new i();

    /* renamed from: d  reason: collision with root package name */
    public static final e f3068d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final h f3069e = new h();

    /* renamed from: f  reason: collision with root package name */
    public static final g f3070f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final d f3071g = new d();

    /* renamed from: h  reason: collision with root package name */
    public static final c f3072h = new c();

    /* renamed from: i  reason: collision with root package name */
    public static final b f3073i = new b();

    /* renamed from: j  reason: collision with root package name */
    public static final a f3074j = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final k f3075k = new k();

    /* renamed from: l  reason: collision with root package name */
    public static final j f3076l = new j();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3077a;

    public static final class a extends h0<boolean[]> {
        public a() {
            super(true);
        }

        public final Object a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        public final String b() {
            return "boolean[]";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            sf.j.f(str, "key");
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    public static final class b extends h0<Boolean> {
        public b() {
            super(false);
        }

        public final Object a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        public final String b() {
            return "boolean";
        }

        public final Object c(String str) {
            boolean z10;
            sf.j.f(str, "value");
            if (sf.j.a(str, "true")) {
                z10 = true;
            } else if (sf.j.a(str, "false")) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            sf.j.f(str, "key");
            bundle.putBoolean(str, booleanValue);
        }
    }

    public static final class c extends h0<float[]> {
        public c() {
            super(true);
        }

        public final Object a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        public final String b() {
            return "float[]";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            sf.j.f(str, "key");
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    public static final class d extends h0<Float> {
        public d() {
            super(false);
        }

        public final Object a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        public final String b() {
            return "float";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public final void d(Bundle bundle, String str, Object obj) {
            float floatValue = ((Number) obj).floatValue();
            sf.j.f(str, "key");
            bundle.putFloat(str, floatValue);
        }
    }

    public static final class e extends h0<int[]> {
        public e() {
            super(true);
        }

        public final Object a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        public final String b() {
            return "integer[]";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            sf.j.f(str, "key");
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    public static final class f extends h0<Integer> {
        public f() {
            super(false);
        }

        public final Object a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        public final String b() {
            return "integer";
        }

        public final Object c(String str) {
            int i8;
            sf.j.f(str, "value");
            if (zf.j.x0(str, "0x", false)) {
                String substring = str.substring(2);
                sf.j.e(substring, "this as java.lang.String).substring(startIndex)");
                cb.b.s(16);
                i8 = Integer.parseInt(substring, 16);
            } else {
                i8 = Integer.parseInt(str);
            }
            return Integer.valueOf(i8);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            int intValue = ((Number) obj).intValue();
            sf.j.f(str, "key");
            bundle.putInt(str, intValue);
        }
    }

    public static final class g extends h0<long[]> {
        public g() {
            super(true);
        }

        public final Object a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        public final String b() {
            return "long[]";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            sf.j.f(str, "key");
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    public static final class h extends h0<Long> {
        public h() {
            super(false);
        }

        public final Object a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        public final String b() {
            return "long";
        }

        public final Object c(String str) {
            String str2;
            long j10;
            sf.j.f(str, "value");
            if (zf.j.r0(str, "L", false)) {
                str2 = str.substring(0, str.length() - 1);
                sf.j.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (zf.j.x0(str, "0x", false)) {
                String substring = str2.substring(2);
                sf.j.e(substring, "this as java.lang.String).substring(startIndex)");
                cb.b.s(16);
                j10 = Long.parseLong(substring, 16);
            } else {
                j10 = Long.parseLong(str2);
            }
            return Long.valueOf(j10);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            long longValue = ((Number) obj).longValue();
            sf.j.f(str, "key");
            bundle.putLong(str, longValue);
        }
    }

    public static final class i extends h0<Integer> {
        public i() {
            super(false);
        }

        public final Object a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        public final String b() {
            return "reference";
        }

        public final Object c(String str) {
            int i8;
            sf.j.f(str, "value");
            if (zf.j.x0(str, "0x", false)) {
                String substring = str.substring(2);
                sf.j.e(substring, "this as java.lang.String).substring(startIndex)");
                cb.b.s(16);
                i8 = Integer.parseInt(substring, 16);
            } else {
                i8 = Integer.parseInt(str);
            }
            return Integer.valueOf(i8);
        }

        public final void d(Bundle bundle, String str, Object obj) {
            int intValue = ((Number) obj).intValue();
            sf.j.f(str, "key");
            bundle.putInt(str, intValue);
        }
    }

    public static final class j extends h0<String[]> {
        public j() {
            super(true);
        }

        public final Object a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        public final String b() {
            return "string[]";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            sf.j.f(str, "key");
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    public static final class k extends h0<String> {
        public k() {
            super(true);
        }

        public final Object a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        public final String b() {
            return "string";
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            return str;
        }

        public final void d(Bundle bundle, String str, Object obj) {
            sf.j.f(str, "key");
            bundle.putString(str, (String) obj);
        }
    }

    public static final class l<D extends Enum<?>> extends p<D> {

        /* renamed from: n  reason: collision with root package name */
        public final Class<D> f3078n;

        public l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f3078n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        public final String b() {
            return this.f3078n.getName();
        }

        /* renamed from: f */
        public final D e(String str) {
            D d10;
            sf.j.f(str, "value");
            Class<D> cls = this.f3078n;
            D[] enumConstants = cls.getEnumConstants();
            sf.j.e(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i8];
                if (zf.j.s0(((Enum) d10).name(), str, true)) {
                    break;
                }
                i8++;
            }
            D d11 = (Enum) d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder c3 = androidx.activity.result.d.c("Enum value ", str, " not found for type ");
            c3.append(cls.getName());
            c3.append('.');
            throw new IllegalArgumentException(c3.toString());
        }
    }

    public static final class m<D extends Parcelable> extends h0<D[]> {
        public final Class<D[]> m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.m = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        public final Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        public final String b() {
            return this.m.getName();
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            sf.j.f(str, "key");
            this.m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !sf.j.a(m.class, obj.getClass())) {
                return false;
            }
            return sf.j.a(this.m, ((m) obj).m);
        }

        public final int hashCode() {
            return this.m.hashCode();
        }
    }

    public static final class n<D> extends h0<D> {
        public final Class<D> m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(Class<D> cls) {
            super(true);
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public final D a(Bundle bundle, String str) {
            return bundle.get(str);
        }

        public final String b() {
            return this.m.getName();
        }

        public final D c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public final void d(Bundle bundle, String str, D d10) {
            sf.j.f(str, "key");
            this.m.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !sf.j.a(n.class, obj.getClass())) {
                return false;
            }
            return sf.j.a(this.m, ((n) obj).m);
        }

        public final int hashCode() {
            return this.m.hashCode();
        }
    }

    public static final class o<D extends Serializable> extends h0<D[]> {
        public final Class<D[]> m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.m = Class.forName("[L" + cls.getName() + ';');
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        public final Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        public final String b() {
            return this.m.getName();
        }

        public final Object c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        public final void d(Bundle bundle, String str, Object obj) {
            ? r42 = (Serializable[]) obj;
            sf.j.f(str, "key");
            this.m.cast(r42);
            bundle.putSerializable(str, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !sf.j.a(o.class, obj.getClass())) {
                return false;
            }
            return sf.j.a(this.m, ((o) obj).m);
        }

        public final int hashCode() {
            return this.m.hashCode();
        }
    }

    public h0(boolean z10) {
        this.f3077a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t2);

    public final String toString() {
        return b();
    }

    public static class p<D extends Serializable> extends h0<D> {
        public final Class<D> m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.m = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        public final Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        public String b() {
            return this.m.getName();
        }

        public final void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            sf.j.f(str, "key");
            sf.j.f(serializable, "value");
            this.m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* renamed from: e */
        public D c(String str) {
            sf.j.f(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return sf.j.a(this.m, ((p) obj).m);
        }

        public final int hashCode() {
            return this.m.hashCode();
        }

        public p(Class cls, int i8) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
