package x0;

import androidx.fragment.app.f1;
import gf.q;
import java.util.Comparator;
import java.util.List;
import s0.b0;
import sf.j;

public final class a implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    public final String f16819a;

    /* renamed from: b  reason: collision with root package name */
    public final List<C0309a<f>> f16820b;

    /* renamed from: c  reason: collision with root package name */
    public final List<C0309a<d>> f16821c;

    /* renamed from: d  reason: collision with root package name */
    public final List<C0309a<? extends Object>> f16822d;

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    public static final class C0309a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f16823a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16824b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16825c;

        /* renamed from: d  reason: collision with root package name */
        public final String f16826d;

        public C0309a(T t2, int i8, int i10, String str) {
            j.f(str, "tag");
            this.f16823a = t2;
            this.f16824b = i8;
            this.f16825c = i10;
            this.f16826d = str;
            if (!(i8 <= i10)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0309a)) {
                return false;
            }
            C0309a aVar = (C0309a) obj;
            return j.a(this.f16823a, aVar.f16823a) && this.f16824b == aVar.f16824b && this.f16825c == aVar.f16825c && j.a(this.f16826d, aVar.f16826d);
        }

        public final int hashCode() {
            T t2 = this.f16823a;
            return this.f16826d.hashCode() + f1.c(this.f16825c, f1.c(this.f16824b, (t2 == null ? 0 : t2.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.f16823a);
            sb2.append(", start=");
            sb2.append(this.f16824b);
            sb2.append(", end=");
            sb2.append(this.f16825c);
            sb2.append(", tag=");
            return b0.a(sb2, this.f16826d, ')');
        }
    }

    public static final class b<T> implements Comparator {
        public final int compare(T t2, T t10) {
            return d2.f1.t(Integer.valueOf(((C0309a) t2).f16824b), Integer.valueOf(((C0309a) t10).f16824b));
        }
    }

    public a() {
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, (List<C0309a<f>>) null, (List<C0309a<d>>) null, (List<? extends C0309a<? extends Object>>) null);
        j.f(str, "text");
    }

    /* renamed from: a */
    public final a subSequence(int i8, int i10) {
        if (i8 <= i10) {
            String str = this.f16819a;
            if (i8 == 0 && i10 == str.length()) {
                return this;
            }
            String substring = str.substring(i8, i10);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new a(substring, b.a(i8, i10, this.f16820b), b.a(i8, i10, this.f16821c), b.a(i8, i10, this.f16822d));
        }
        throw new IllegalArgumentException(("start (" + i8 + ") should be less or equal to end (" + i10 + ')').toString());
    }

    public final char charAt(int i8) {
        return this.f16819a.charAt(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f16819a, aVar.f16819a) && j.a(this.f16820b, aVar.f16820b) && j.a(this.f16821c, aVar.f16821c) && j.a(this.f16822d, aVar.f16822d);
    }

    public final int hashCode() {
        int hashCode = this.f16819a.hashCode() * 31;
        int i8 = 0;
        List<C0309a<f>> list = this.f16820b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<C0309a<d>> list2 = this.f16821c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<C0309a<? extends Object>> list3 = this.f16822d;
        if (list3 != null) {
            i8 = list3.hashCode();
        }
        return hashCode3 + i8;
    }

    public final int length() {
        return this.f16819a.length();
    }

    public final String toString() {
        return this.f16819a;
    }

    public a(String str, List<C0309a<f>> list, List<C0309a<d>> list2, List<? extends C0309a<? extends Object>> list3) {
        j.f(str, "text");
        this.f16819a = str;
        this.f16820b = list;
        this.f16821c = list2;
        this.f16822d = list3;
        if (list2 != null) {
            List J0 = q.J0(list2, new b());
            int size = J0.size();
            int i8 = -1;
            int i10 = 0;
            while (i10 < size) {
                C0309a aVar = (C0309a) J0.get(i10);
                boolean z10 = true;
                if (aVar.f16824b >= i8) {
                    int length = this.f16819a.length();
                    int i11 = aVar.f16825c;
                    if (i11 > length ? false : z10) {
                        i10++;
                        i8 = i11;
                    } else {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + aVar.f16824b + ", " + i11 + ") is out of boundary").toString());
                    }
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }
}
