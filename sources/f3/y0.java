package f3;

import androidx.fragment.app.f1;
import cb.d;
import f3.m0;
import java.util.List;
import sf.j;

public abstract class y0<T> {

    public static final class a<T> extends y0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f8545a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8546b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8547c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8548d;

        public a(o0 o0Var, int i8, int i10, int i11) {
            j.f(o0Var, "loadType");
            this.f8545a = o0Var;
            this.f8546b = i8;
            this.f8547c = i10;
            this.f8548d = i11;
            boolean z10 = true;
            if (o0Var != o0.f8397a) {
                if (a() > 0) {
                    if (!(i11 < 0 ? false : z10)) {
                        throw new IllegalArgumentException(j.k(Integer.valueOf(i11), "Invalid placeholdersRemaining ").toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(j.k(Integer.valueOf(a()), "Drop count must be > 0, but was ").toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        public final int a() {
            return (this.f8547c - this.f8546b) + 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
            r5 = (f3.y0.a) r5;
            r1 = r5.f8545a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof f3.y0.a
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                f3.y0$a r5 = (f3.y0.a) r5
                f3.o0 r1 = r5.f8545a
                f3.o0 r3 = r4.f8545a
                if (r3 == r1) goto L_0x0013
                return r2
            L_0x0013:
                int r1 = r4.f8546b
                int r3 = r5.f8546b
                if (r1 == r3) goto L_0x001a
                return r2
            L_0x001a:
                int r1 = r4.f8547c
                int r3 = r5.f8547c
                if (r1 == r3) goto L_0x0021
                return r2
            L_0x0021:
                int r1 = r4.f8548d
                int r5 = r5.f8548d
                if (r1 == r5) goto L_0x0028
                return r2
            L_0x0028:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.y0.a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            return Integer.hashCode(this.f8548d) + f1.c(this.f8547c, f1.c(this.f8546b, this.f8545a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Drop(loadType=");
            sb2.append(this.f8545a);
            sb2.append(", minPageOffset=");
            sb2.append(this.f8546b);
            sb2.append(", maxPageOffset=");
            sb2.append(this.f8547c);
            sb2.append(", placeholdersRemaining=");
            return rb.b.a(sb2, this.f8548d, ')');
        }
    }

    public static final class b<T> extends y0<T> {

        /* renamed from: g  reason: collision with root package name */
        public static final b<Object> f8549g;

        /* renamed from: a  reason: collision with root package name */
        public final o0 f8550a;

        /* renamed from: b  reason: collision with root package name */
        public final List<s2<T>> f8551b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8552c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8553d;

        /* renamed from: e  reason: collision with root package name */
        public final n0 f8554e;

        /* renamed from: f  reason: collision with root package name */
        public final n0 f8555f;

        public static final class a {
            public static b a(List list, int i8, int i10, n0 n0Var, n0 n0Var2) {
                return new b(o0.f8397a, list, i8, i10, n0Var, n0Var2);
            }
        }

        static {
            List O = d.O(s2.f8481e);
            m0.c cVar = m0.c.f8367c;
            m0.c cVar2 = m0.c.f8366b;
            f8549g = a.a(O, 0, 0, new n0(cVar, cVar2, cVar2), (n0) null);
        }

        public /* synthetic */ b() {
            throw null;
        }

        public b(o0 o0Var, List<s2<T>> list, int i8, int i10, n0 n0Var, n0 n0Var2) {
            this.f8550a = o0Var;
            this.f8551b = list;
            this.f8552c = i8;
            this.f8553d = i10;
            this.f8554e = n0Var;
            this.f8555f = n0Var2;
            boolean z10 = false;
            if (o0Var == o0.f8399c || i8 >= 0) {
                if (o0Var == o0.f8398b || i10 >= 0) {
                    if (!((o0Var != o0.f8397a || (list.isEmpty() ^ true)) ? true : z10)) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(j.k(Integer.valueOf(i10), "Append insert defining placeholdersAfter must be > 0, but was ").toString());
            }
            throw new IllegalArgumentException(j.k(Integer.valueOf(i8), "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
            r5 = (f3.y0.b) r5;
            r1 = r5.f8550a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r5 instanceof f3.y0.b
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                f3.y0$b r5 = (f3.y0.b) r5
                f3.o0 r1 = r5.f8550a
                f3.o0 r3 = r4.f8550a
                if (r3 == r1) goto L_0x0013
                return r2
            L_0x0013:
                java.util.List<f3.s2<T>> r1 = r4.f8551b
                java.util.List<f3.s2<T>> r3 = r5.f8551b
                boolean r1 = sf.j.a(r1, r3)
                if (r1 != 0) goto L_0x001e
                return r2
            L_0x001e:
                int r1 = r4.f8552c
                int r3 = r5.f8552c
                if (r1 == r3) goto L_0x0025
                return r2
            L_0x0025:
                int r1 = r4.f8553d
                int r3 = r5.f8553d
                if (r1 == r3) goto L_0x002c
                return r2
            L_0x002c:
                f3.n0 r1 = r4.f8554e
                f3.n0 r3 = r5.f8554e
                boolean r1 = sf.j.a(r1, r3)
                if (r1 != 0) goto L_0x0037
                return r2
            L_0x0037:
                f3.n0 r1 = r4.f8555f
                f3.n0 r5 = r5.f8555f
                boolean r5 = sf.j.a(r1, r5)
                if (r5 != 0) goto L_0x0042
                return r2
            L_0x0042:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.y0.b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            int hashCode = (this.f8554e.hashCode() + f1.c(this.f8553d, f1.c(this.f8552c, (this.f8551b.hashCode() + (this.f8550a.hashCode() * 31)) * 31, 31), 31)) * 31;
            n0 n0Var = this.f8555f;
            return hashCode + (n0Var == null ? 0 : n0Var.hashCode());
        }

        public final String toString() {
            return "Insert(loadType=" + this.f8550a + ", pages=" + this.f8551b + ", placeholdersBefore=" + this.f8552c + ", placeholdersAfter=" + this.f8553d + ", sourceLoadStates=" + this.f8554e + ", mediatorLoadStates=" + this.f8555f + ')';
        }
    }

    public static final class c<T> extends y0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final n0 f8556a;

        /* renamed from: b  reason: collision with root package name */
        public final n0 f8557b;

        public c(n0 n0Var, n0 n0Var2) {
            j.f(n0Var, "source");
            this.f8556a = n0Var;
            this.f8557b = n0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return j.a(this.f8556a, cVar.f8556a) && j.a(this.f8557b, cVar.f8557b);
        }

        public final int hashCode() {
            int hashCode = this.f8556a.hashCode() * 31;
            n0 n0Var = this.f8557b;
            return hashCode + (n0Var == null ? 0 : n0Var.hashCode());
        }

        public final String toString() {
            return "LoadStateUpdate(source=" + this.f8556a + ", mediator=" + this.f8557b + ')';
        }
    }
}
