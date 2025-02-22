package v4;

import android.text.TextUtils;
import androidx.activity.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f16173b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f16174c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f16175b;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<h>> f16176a = f16175b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = property.charAt(i8);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f16175b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f16177a;

        public b(String str) {
            this.f16177a = str;
        }

        public final String a() {
            return this.f16177a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f16177a.equals(((b) obj).f16177a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16177a.hashCode();
        }

        public final String toString() {
            return g.a(new StringBuilder("StringHeaderFactory{value='"), this.f16177a, "'}");
        }
    }

    public i(Map<String, List<h>> map) {
        this.f16173b = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        if (this.f16174c == null) {
            synchronized (this) {
                if (this.f16174c == null) {
                    this.f16174c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f16174c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f16173b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                String a10 = ((h) list.get(i8)).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i8 != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(next.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f16173b.equals(((i) obj).f16173b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16173b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f16173b + '}';
    }
}
