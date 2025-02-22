package t9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f15448a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<u<? super T>> f15449b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<l> f15450c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15451d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15452e;

    /* renamed from: f  reason: collision with root package name */
    public final e<T> f15453f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<Class<?>> f15454g;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public String f15455a = null;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f15456b;

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f15457c;

        /* renamed from: d  reason: collision with root package name */
        public int f15458d;

        /* renamed from: e  reason: collision with root package name */
        public int f15459e;

        /* renamed from: f  reason: collision with root package name */
        public e<T> f15460f;

        /* renamed from: g  reason: collision with root package name */
        public final HashSet f15461g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f15456b = hashSet;
            this.f15457c = new HashSet();
            int i8 = 0;
            this.f15458d = 0;
            this.f15459e = 0;
            this.f15461g = new HashSet();
            hashSet.add(u.a(cls));
            int length = clsArr.length;
            while (i8 < length) {
                Class cls2 = clsArr[i8];
                if (cls2 != null) {
                    this.f15456b.add(u.a(cls2));
                    i8++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
        }

        public final void a(l lVar) {
            if (!this.f15456b.contains(lVar.f15479a)) {
                this.f15457c.add(lVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            if (this.f15460f != null) {
                return new b(this.f15455a, new HashSet(this.f15456b), new HashSet(this.f15457c), this.f15458d, this.f15459e, this.f15460f, this.f15461g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i8) {
            if (this.f15458d == 0) {
                this.f15458d = i8;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public b(String str, Set<u<? super T>> set, Set<l> set2, int i8, int i10, e<T> eVar, Set<Class<?>> set3) {
        this.f15448a = str;
        this.f15449b = Collections.unmodifiableSet(set);
        this.f15450c = Collections.unmodifiableSet(set2);
        this.f15451d = i8;
        this.f15452e = i10;
        this.f15453f = eVar;
        this.f15454g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(T t2, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(u.a(cls));
        int length = clsArr.length;
        int i8 = 0;
        while (i8 < length) {
            Class<? super T> cls2 = clsArr[i8];
            if (cls2 != null) {
                hashSet.add(u.a(cls2));
                i8++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(t2), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f15449b.toArray()) + ">{" + this.f15451d + ", type=" + this.f15452e + ", deps=" + Arrays.toString(this.f15450c.toArray()) + "}";
    }
}
