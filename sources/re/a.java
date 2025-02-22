package re;

import com.google.android.gms.internal.p000firebaseauthapi.j1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0266a<String, Pattern> f14246a;

    /* renamed from: re.a$a  reason: collision with other inner class name */
    public static class C0266a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final C0267a f14247a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14248b;

        /* renamed from: re.a$a$a  reason: collision with other inner class name */
        public class C0267a extends LinkedHashMap<K, V> {
            public C0267a(int i8) {
                super(i8, 0.75f, true);
            }

            public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                return size() > C0266a.this.f14248b;
            }
        }

        public C0266a(int i8) {
            this.f14248b = i8;
            this.f14247a = new C0267a(j1.a(i8, 4, 3, 1));
        }
    }

    public a(int i8) {
        this.f14246a = new C0266a<>(i8);
    }

    public final Pattern a(String str) {
        Object obj;
        C0266a<String, Pattern> aVar = this.f14246a;
        synchronized (aVar) {
            obj = aVar.f14247a.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            C0266a<String, Pattern> aVar2 = this.f14246a;
            synchronized (aVar2) {
                aVar2.f14247a.put(str, pattern);
            }
        }
        return pattern;
    }
}
