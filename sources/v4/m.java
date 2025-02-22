package v4;

import java.util.ArrayDeque;
import l5.l;

public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f16183a = new l();

    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f16184d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f16185a;

        /* renamed from: b  reason: collision with root package name */
        public int f16186b;

        /* renamed from: c  reason: collision with root package name */
        public A f16187c;

        static {
            char[] cArr = l.f11007a;
        }

        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f16184d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f16187c = obj;
            aVar.f16186b = 0;
            aVar.f16185a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16186b == aVar.f16186b && this.f16185a == aVar.f16185a && this.f16187c.equals(aVar.f16187c);
        }

        public final int hashCode() {
            return this.f16187c.hashCode() + (((this.f16185a * 31) + this.f16186b) * 31);
        }
    }
}
