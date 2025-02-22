package yg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jg.q;
import jg.r;
import jg.t;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Method f17410a;

    /* renamed from: b  reason: collision with root package name */
    public final r f17411b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17412c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17413d;

    /* renamed from: e  reason: collision with root package name */
    public final q f17414e;

    /* renamed from: f  reason: collision with root package name */
    public final t f17415f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17416g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17417h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17418i;

    /* renamed from: j  reason: collision with root package name */
    public final x<?>[] f17419j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f17420k;

    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f17421x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f17422y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final c0 f17423a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f17424b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f17425c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f17426d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f17427e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f17428f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f17429g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f17430h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f17431i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f17432j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f17433k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f17434l;
        public boolean m;

        /* renamed from: n  reason: collision with root package name */
        public String f17435n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f17436o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f17437p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f17438q;

        /* renamed from: r  reason: collision with root package name */
        public String f17439r;

        /* renamed from: s  reason: collision with root package name */
        public q f17440s;

        /* renamed from: t  reason: collision with root package name */
        public t f17441t;

        /* renamed from: u  reason: collision with root package name */
        public LinkedHashSet f17442u;

        /* renamed from: v  reason: collision with root package name */
        public x<?>[] f17443v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f17444w;

        public a(c0 c0Var, Method method) {
            this.f17423a = c0Var;
            this.f17424b = method;
            this.f17425c = method.getAnnotations();
            this.f17427e = method.getGenericParameterTypes();
            this.f17426d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f17435n;
            Method method = this.f17424b;
            if (str3 == null) {
                this.f17435n = str;
                this.f17436o = z10;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    Pattern pattern = f17421x;
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (pattern.matcher(substring).find()) {
                            throw g0.i(method, (Exception) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f17439r = str2;
                    Matcher matcher = pattern.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f17442u = linkedHashSet;
                    return;
                }
                return;
            }
            throw g0.i(method, (Exception) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i8, Type type) {
            if (g0.g(type)) {
                throw g0.j(this.f17424b, i8, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public a0(a aVar) {
        this.f17410a = aVar.f17424b;
        this.f17411b = aVar.f17423a.f17450c;
        this.f17412c = aVar.f17435n;
        this.f17413d = aVar.f17439r;
        this.f17414e = aVar.f17440s;
        this.f17415f = aVar.f17441t;
        this.f17416g = aVar.f17436o;
        this.f17417h = aVar.f17437p;
        this.f17418i = aVar.f17438q;
        this.f17419j = aVar.f17443v;
        this.f17420k = aVar.f17444w;
    }
}
