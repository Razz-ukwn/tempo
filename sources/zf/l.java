package zf;

import ff.g;
import java.util.List;
import rf.p;
import sf.k;

public final class l extends k implements p<CharSequence, Integer, g<? extends Integer, ? extends Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List<String> f17979a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f17980b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(List<String> list, boolean z10) {
        super(2);
        this.f17979a = list;
        this.f17980b = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            sf.j.f(r14, r0)
            java.util.List<java.lang.String> r0 = r13.f17979a
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r7 = r13.f17980b
            r8 = 0
            r0 = 0
            if (r7 != 0) goto L_0x007f
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x007f
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.List
            if (r1 == 0) goto L_0x0044
            java.util.List r6 = (java.util.List) r6
            int r1 = r6.size()
            if (r1 == 0) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            java.lang.Object r1 = r6.get(r0)
            goto L_0x0059
        L_0x0034:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x003c:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L_0x0044:
            java.util.Iterator r1 = r6.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0077
            java.lang.Object r2 = r1.next()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L_0x006f
            r1 = r2
        L_0x0059:
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r14 = zf.n.G0(r14, r1, r15, r0, r2)
            if (r14 >= 0) goto L_0x0064
            goto L_0x0111
        L_0x0064:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            ff.g r15 = new ff.g
            r15.<init>(r14, r1)
            goto L_0x0112
        L_0x006f:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Collection has more than one element."
            r14.<init>(r15)
            throw r14
        L_0x0077:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "Collection is empty."
            r14.<init>(r15)
            throw r14
        L_0x007f:
            wf.f r1 = new wf.f
            if (r15 >= 0) goto L_0x0084
            r15 = r0
        L_0x0084:
            int r0 = r14.length()
            r1.<init>(r15, r0)
            boolean r0 = r14 instanceof java.lang.String
            int r9 = r1.f16716c
            int r10 = r1.f16715b
            if (r0 == 0) goto L_0x00d3
            if (r9 <= 0) goto L_0x0097
            if (r15 <= r10) goto L_0x009b
        L_0x0097:
            if (r9 >= 0) goto L_0x0111
            if (r10 > r15) goto L_0x0111
        L_0x009b:
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r11 = r0.iterator()
        L_0x00a2:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r12 = r11.next()
            r3 = r12
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            int r2 = r3.length()
            r1 = r15
            r5 = r7
            boolean r0 = zf.j.u0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00a2
            goto L_0x00c1
        L_0x00c0:
            r12 = r8
        L_0x00c1:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x00cf
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ff.g r15 = new ff.g
            r15.<init>(r14, r12)
            goto L_0x0112
        L_0x00cf:
            if (r15 == r10) goto L_0x0111
            int r15 = r15 + r9
            goto L_0x009b
        L_0x00d3:
            if (r9 <= 0) goto L_0x00d7
            if (r15 <= r10) goto L_0x00db
        L_0x00d7:
            if (r9 >= 0) goto L_0x0111
            if (r10 > r15) goto L_0x0111
        L_0x00db:
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r11 = r0.iterator()
        L_0x00e2:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r12 = r11.next()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r14
            r3 = r15
            r5 = r7
            boolean r0 = zf.n.N0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00e2
            goto L_0x00ff
        L_0x00fe:
            r12 = r8
        L_0x00ff:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x010d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ff.g r15 = new ff.g
            r15.<init>(r14, r12)
            goto L_0x0112
        L_0x010d:
            if (r15 == r10) goto L_0x0111
            int r15 = r15 + r9
            goto L_0x00db
        L_0x0111:
            r15 = r8
        L_0x0112:
            if (r15 == 0) goto L_0x0127
            B r14 = r15.f8707b
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r14.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            ff.g r8 = new ff.g
            A r15 = r15.f8706a
            r8.<init>(r15, r14)
        L_0x0127:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.l.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
