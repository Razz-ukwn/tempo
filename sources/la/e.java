package la;

import ja.d;
import ja.f;
import ja.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public final class e implements ka.a<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f11042e = new a(0);

    /* renamed from: f  reason: collision with root package name */
    public static final b f11043f = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final c f11044g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final a f11045h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11046a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f11047b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11048c = f11042e;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11049d = false;

    public static final class a implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f11050a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f11050a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public final void a(Object obj, Object obj2) {
            ((g) obj2).b(f11050a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f11046a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f11047b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f11043f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f11044g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f11045h);
        hashMap.remove(cls3);
    }

    public final ka.a a(Class cls, d dVar) {
        this.f11046a.put(cls, dVar);
        this.f11047b.remove(cls);
        return this;
    }
}
