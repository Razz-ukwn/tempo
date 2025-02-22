package f3;

import androidx.fragment.app.f1;
import ff.m;
import gf.s;
import java.util.List;
import jf.d;
import rf.l;
import sf.j;
import sf.k;

public abstract class f2<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public final k0<rf.a<m>> f8219a = new k0<>(c.f8230a);

    public static abstract class a<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final int f8220a;

        /* renamed from: f3.f2$a$a  reason: collision with other inner class name */
        public static final class C0139a<Key> extends a<Key> {

            /* renamed from: b  reason: collision with root package name */
            public final Key f8221b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0139a(int i8, Object obj, boolean z10) {
                super(i8, z10);
                j.f(obj, "key");
                this.f8221b = obj;
            }

            public final Key a() {
                return this.f8221b;
            }
        }

        public static final class b<Key> extends a<Key> {

            /* renamed from: b  reason: collision with root package name */
            public final Key f8222b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(int i8, Object obj, boolean z10) {
                super(i8, z10);
                j.f(obj, "key");
                this.f8222b = obj;
            }

            public final Key a() {
                return this.f8222b;
            }
        }

        public static final class c<Key> extends a<Key> {

            /* renamed from: b  reason: collision with root package name */
            public final Key f8223b;

            public c(int i8, Object obj, boolean z10) {
                super(i8, z10);
                this.f8223b = obj;
            }

            public final Key a() {
                return this.f8223b;
            }
        }

        public a(int i8, boolean z10) {
            this.f8220a = i8;
        }

        public abstract Key a();
    }

    public static abstract class b<Key, Value> {

        public static final class a<Key, Value> extends b<Key, Value> {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f8224a;

            public a(Exception exc) {
                this.f8224a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && j.a(this.f8224a, ((a) obj).f8224a);
            }

            public final int hashCode() {
                return this.f8224a.hashCode();
            }

            public final String toString() {
                return "Error(throwable=" + this.f8224a + ')';
            }
        }

        /* renamed from: f3.f2$b$b  reason: collision with other inner class name */
        public static final class C0140b<Key, Value> extends b<Key, Value> {

            /* renamed from: a  reason: collision with root package name */
            public final List<Value> f8225a;

            /* renamed from: b  reason: collision with root package name */
            public final Key f8226b;

            /* renamed from: c  reason: collision with root package name */
            public final Key f8227c;

            /* renamed from: d  reason: collision with root package name */
            public final int f8228d;

            /* renamed from: e  reason: collision with root package name */
            public final int f8229e;

            static {
                new C0140b(s.f8978a, (Integer) null, 0, 0);
            }

            public C0140b() {
                throw null;
            }

            public C0140b(List list, Integer num, int i8, int i10) {
                this.f8225a = list;
                this.f8226b = null;
                this.f8227c = num;
                this.f8228d = i8;
                this.f8229e = i10;
                boolean z10 = false;
                if (i8 == Integer.MIN_VALUE || i8 >= 0) {
                    if (!((i10 == Integer.MIN_VALUE || i10 >= 0) ? true : z10)) {
                        throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0140b)) {
                    return false;
                }
                C0140b bVar = (C0140b) obj;
                return j.a(this.f8225a, bVar.f8225a) && j.a(this.f8226b, bVar.f8226b) && j.a(this.f8227c, bVar.f8227c) && this.f8228d == bVar.f8228d && this.f8229e == bVar.f8229e;
            }

            public final int hashCode() {
                int hashCode = this.f8225a.hashCode() * 31;
                int i8 = 0;
                Key key = this.f8226b;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f8227c;
                if (key2 != null) {
                    i8 = key2.hashCode();
                }
                return Integer.hashCode(this.f8229e) + f1.c(this.f8228d, (hashCode2 + i8) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Page(data=");
                sb2.append(this.f8225a);
                sb2.append(", prevKey=");
                sb2.append(this.f8226b);
                sb2.append(", nextKey=");
                sb2.append(this.f8227c);
                sb2.append(", itemsBefore=");
                sb2.append(this.f8228d);
                sb2.append(", itemsAfter=");
                return rb.b.a(sb2, this.f8229e, ')');
            }
        }
    }

    public static final class c extends k implements l<rf.a<? extends m>, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8230a = new c();

        public c() {
            super(1);
        }

        public final Object invoke(Object obj) {
            rf.a aVar = (rf.a) obj;
            j.f(aVar, "it");
            aVar.d();
            return m.f8717a;
        }
    }

    public boolean a() {
        return false;
    }

    public abstract Key b(g2<Key, Value> g2Var);

    public abstract Object c(a<Key> aVar, d<? super b<Key, Value>> dVar);
}
