package zf;

import d2.f1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rf.p;
import sf.j;
import wf.f;
import yf.g;

public final class b implements g<f> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f17965a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17966b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17967c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, ff.g<Integer, Integer>> f17968d;

    public static final class a implements Iterator<f>, tf.a {
        public final /* synthetic */ b B;

        /* renamed from: a  reason: collision with root package name */
        public int f17969a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f17970b;

        /* renamed from: c  reason: collision with root package name */
        public int f17971c;

        /* renamed from: d  reason: collision with root package name */
        public f f17972d;

        /* renamed from: e  reason: collision with root package name */
        public int f17973e;

        public a(b bVar) {
            this.B = bVar;
            int q10 = f1.q(bVar.f17966b, 0, bVar.f17965a.length());
            this.f17970b = q10;
            this.f17971c = q10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r6 < r3) goto L_0x001a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f17971c
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r7.f17969a = r1
                r0 = 0
                r7.f17972d = r0
                goto L_0x007b
            L_0x000b:
                zf.b r2 = r7.B
                int r3 = r2.f17967c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001a
                int r6 = r7.f17973e
                int r6 = r6 + r5
                r7.f17973e = r6
                if (r6 >= r3) goto L_0x0022
            L_0x001a:
                java.lang.CharSequence r3 = r2.f17965a
                int r3 = r3.length()
                if (r0 <= r3) goto L_0x0034
            L_0x0022:
                wf.f r0 = new wf.f
                int r1 = r7.f17970b
                java.lang.CharSequence r2 = r2.f17965a
                int r2 = zf.n.C0(r2)
                r0.<init>(r1, r2)
                r7.f17972d = r0
                r7.f17971c = r4
                goto L_0x0079
            L_0x0034:
                rf.p<java.lang.CharSequence, java.lang.Integer, ff.g<java.lang.Integer, java.lang.Integer>> r0 = r2.f17968d
                java.lang.CharSequence r3 = r2.f17965a
                int r6 = r7.f17971c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r0 = r0.invoke(r3, r6)
                ff.g r0 = (ff.g) r0
                if (r0 != 0) goto L_0x0058
                wf.f r0 = new wf.f
                int r1 = r7.f17970b
                java.lang.CharSequence r2 = r2.f17965a
                int r2 = zf.n.C0(r2)
                r0.<init>(r1, r2)
                r7.f17972d = r0
                r7.f17971c = r4
                goto L_0x0079
            L_0x0058:
                A r2 = r0.f8706a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f8707b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f17970b
                wf.f r3 = d2.f1.P(r3, r2)
                r7.f17972d = r3
                int r2 = r2 + r0
                r7.f17970b = r2
                if (r0 != 0) goto L_0x0076
                r1 = r5
            L_0x0076:
                int r2 = r2 + r1
                r7.f17971c = r2
            L_0x0079:
                r7.f17969a = r5
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zf.b.a.a():void");
        }

        public final boolean hasNext() {
            if (this.f17969a == -1) {
                a();
            }
            return this.f17969a == 1;
        }

        public final Object next() {
            if (this.f17969a == -1) {
                a();
            }
            if (this.f17969a != 0) {
                f fVar = this.f17972d;
                j.d(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f17972d = null;
                this.f17969a = -1;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(CharSequence charSequence, int i8, int i10, p<? super CharSequence, ? super Integer, ff.g<Integer, Integer>> pVar) {
        j.f(charSequence, "input");
        this.f17965a = charSequence;
        this.f17966b = i8;
        this.f17967c = i10;
        this.f17968d = pVar;
    }

    public final Iterator<f> iterator() {
        return new a(this);
    }
}
