package kotlinx.coroutines.flow;

import rf.p;
import sf.j;
import sf.k;

public final /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10579a = b.f10582a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f10580b = a.f10581a;

    public static final class a extends k implements p<Object, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f10581a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(j.a(obj, obj2));
        }
    }

    public static final class b extends k implements rf.l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10582a = new b();

        public b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
