package zd;

public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f17948a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17949b;

    public static final class a<T> extends g<T> {
        public a(String str) {
            super((Object) null, str);
        }
    }

    public static final class b<T> extends g<T> {
        public b() {
            super(3, (Object) null);
        }
    }

    public static final class c<T> extends g<T> {
        public c() {
            super(3, (Object) null);
        }
    }

    public static final class d<T> extends g<T> {
        public d(T t2) {
            super(2, (Object) t2);
        }
    }

    public g() {
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i8, Object obj) {
        this((i8 & 1) != 0 ? null : obj, (String) null);
    }

    public g(Object obj, String str) {
        this.f17948a = obj;
        this.f17949b = str;
    }
}
