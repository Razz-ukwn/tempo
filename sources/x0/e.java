package x0;

import d2.f1;
import e1.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import x0.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a0.e f16836a = a0.d.a(a.f16854a, b.f16856a);

    /* renamed from: b  reason: collision with root package name */
    public static final a0.e f16837b = a0.d.a(c.f16858a, d.f16860a);

    /* renamed from: c  reason: collision with root package name */
    public static final a0.e f16838c = a0.d.a(C0310e.f16862a, f.f16864a);

    /* renamed from: d  reason: collision with root package name */
    public static final a0.e f16839d = a0.d.a(k0.f16875a, l0.f16877a);

    /* renamed from: e  reason: collision with root package name */
    public static final a0.e f16840e = a0.d.a(i0.f16871a, j0.f16873a);

    /* renamed from: f  reason: collision with root package name */
    public static final a0.e f16841f = a0.d.a(s.f16884a, t.f16885a);

    /* renamed from: g  reason: collision with root package name */
    public static final a0.e f16842g = a0.d.a(w.f16888a, x.f16889a);

    /* renamed from: h  reason: collision with root package name */
    public static final a0.e f16843h = a0.d.a(y.f16890a, z.f16891a);

    /* renamed from: i  reason: collision with root package name */
    public static final a0.e f16844i = a0.d.a(a0.f16855a, b0.f16857a);

    /* renamed from: j  reason: collision with root package name */
    public static final a0.e f16845j = a0.d.a(c0.f16859a, d0.f16861a);

    /* renamed from: k  reason: collision with root package name */
    public static final a0.e f16846k = a0.d.a(k.f16874a, l.f16876a);

    /* renamed from: l  reason: collision with root package name */
    public static final a0.e f16847l = a0.d.a(g.f16866a, h.f16868a);
    public static final a0.e m = a0.d.a(e0.f16863a, f0.f16865a);

    /* renamed from: n  reason: collision with root package name */
    public static final a0.e f16848n = a0.d.a(u.f16886a, v.f16887a);

    /* renamed from: o  reason: collision with root package name */
    public static final a0.e f16849o = a0.d.a(i.f16870a, j.f16872a);

    /* renamed from: p  reason: collision with root package name */
    public static final a0.e f16850p = a0.d.a(g0.f16867a, h0.f16869a);

    /* renamed from: q  reason: collision with root package name */
    public static final a0.e f16851q = a0.d.a(q.f16882a, r.f16883a);

    /* renamed from: r  reason: collision with root package name */
    public static final a0.e f16852r = a0.d.a(m.f16878a, n.f16879a);

    /* renamed from: s  reason: collision with root package name */
    public static final a0.e f16853s = a0.d.a(o.f16880a, p.f16881a);

    public static final class a extends sf.k implements rf.p<a0.f, a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16854a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            a aVar = (a) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(aVar, "it");
            Object[] objArr = new Object[4];
            a0.e eVar = e.f16836a;
            objArr[0] = aVar.f16819a;
            List list = gf.s.f8978a;
            List list2 = aVar.f16820b;
            if (list2 == null) {
                list2 = list;
            }
            a0.e eVar2 = e.f16837b;
            objArr[1] = e.a(list2, eVar2, fVar);
            List list3 = aVar.f16821c;
            if (list3 != null) {
                list = list3;
            }
            objArr[2] = e.a(list, eVar2, fVar);
            objArr[3] = e.a(aVar.f16822d, eVar2, fVar);
            return cb.d.m(objArr);
        }
    }

    public static final class a0 extends sf.k implements rf.p<a0.f, e1.g, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a0 f16855a = new a0();

        public a0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            e1.g gVar = (e1.g) obj2;
            sf.j.f((a0.f) obj, "$this$Saver");
            sf.j.f(gVar, "it");
            return cb.d.m(Float.valueOf(gVar.f7770a), Float.valueOf(gVar.f7771b));
        }
    }

    public static final class b extends sf.k implements rf.l<Object, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16856a = new b();

        public b() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = "it"
                sf.j.f(r8, r0)
                java.util.List r8 = (java.util.List) r8
                r0 = 1
                java.lang.Object r0 = r8.get(r0)
                a0.e r1 = x0.e.f16837b
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r3 = sf.j.a(r0, r2)
                r4 = 0
                if (r3 == 0) goto L_0x0018
                goto L_0x0023
            L_0x0018:
                if (r0 == 0) goto L_0x0023
                rf.l<java.lang.Object, java.lang.Object> r3 = r1.f14b
                java.lang.Object r0 = r3.invoke(r0)
                java.util.List r0 = (java.util.List) r0
                goto L_0x0024
            L_0x0023:
                r0 = r4
            L_0x0024:
                r3 = 2
                java.lang.Object r3 = r8.get(r3)
                boolean r5 = sf.j.a(r3, r2)
                if (r5 == 0) goto L_0x0030
                goto L_0x003b
            L_0x0030:
                if (r3 == 0) goto L_0x003b
                rf.l<java.lang.Object, java.lang.Object> r5 = r1.f14b
                java.lang.Object r3 = r5.invoke(r3)
                java.util.List r3 = (java.util.List) r3
                goto L_0x003c
            L_0x003b:
                r3 = r4
            L_0x003c:
                r5 = 0
                java.lang.Object r5 = r8.get(r5)
                if (r5 == 0) goto L_0x0046
                java.lang.String r5 = (java.lang.String) r5
                goto L_0x0047
            L_0x0046:
                r5 = r4
            L_0x0047:
                sf.j.c(r5)
                if (r0 == 0) goto L_0x0058
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r6 = r0.isEmpty()
                if (r6 == 0) goto L_0x0055
                r0 = r4
            L_0x0055:
                java.util.List r0 = (java.util.List) r0
                goto L_0x0059
            L_0x0058:
                r0 = r4
            L_0x0059:
                if (r3 == 0) goto L_0x0067
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r6 = r3.isEmpty()
                if (r6 == 0) goto L_0x0064
                r3 = r4
            L_0x0064:
                java.util.List r3 = (java.util.List) r3
                goto L_0x0068
            L_0x0067:
                r3 = r4
            L_0x0068:
                r6 = 3
                java.lang.Object r8 = r8.get(r6)
                boolean r2 = sf.j.a(r8, r2)
                if (r2 == 0) goto L_0x0074
                goto L_0x007f
            L_0x0074:
                if (r8 == 0) goto L_0x007f
                rf.l<java.lang.Object, java.lang.Object> r1 = r1.f14b
                java.lang.Object r8 = r1.invoke(r8)
                r4 = r8
                java.util.List r4 = (java.util.List) r4
            L_0x007f:
                x0.a r8 = new x0.a
                r8.<init>(r5, r0, r3, r4)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.e.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b0 extends sf.k implements rf.l<Object, e1.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b0 f16857a = new b0();

        public b0() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            return new e1.g(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    public static final class c extends sf.k implements rf.p<a0.f, List<? extends a.C0309a<? extends Object>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16858a = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            List list = (List) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(list, "it");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(e.a((a.C0309a) list.get(i8), e.f16838c, fVar));
            }
            return arrayList;
        }
    }

    public static final class c0 extends sf.k implements rf.p<a0.f, e1.h, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final c0 f16859a = new c0();

        public c0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            e1.h hVar = (e1.h) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(hVar, "it");
            f1.k kVar = new f1.k(hVar.f7773a);
            a0.e eVar = e.f16850p;
            return cb.d.m(e.a(kVar, eVar, fVar), e.a(new f1.k(hVar.f7774b), eVar, fVar));
        }
    }

    public static final class d extends sf.k implements rf.l<Object, List<? extends a.C0309a<? extends Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16860a = new d();

        public d() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj2 = list.get(i8);
                a.C0309a aVar = (!sf.j.a(obj2, Boolean.FALSE) && obj2 != null) ? (a.C0309a) e.f16838c.f14b.invoke(obj2) : null;
                sf.j.c(aVar);
                arrayList.add(aVar);
            }
            return arrayList;
        }
    }

    public static final class d0 extends sf.k implements rf.l<Object, e1.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final d0 f16861a = new d0();

        public d0() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: f1.k} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.String r0 = "it"
                sf.j.f(r7, r0)
                java.util.List r7 = (java.util.List) r7
                e1.h r0 = new e1.h
                r1 = 0
                java.lang.Object r1 = r7.get(r1)
                f1.l[] r2 = f1.k.f8042b
                a0.e r2 = x0.e.f16850p
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                boolean r4 = sf.j.a(r1, r3)
                r5 = 0
                if (r4 == 0) goto L_0x001c
                goto L_0x0027
            L_0x001c:
                if (r1 == 0) goto L_0x0027
                rf.l<java.lang.Object, java.lang.Object> r4 = r2.f14b
                java.lang.Object r1 = r4.invoke(r1)
                f1.k r1 = (f1.k) r1
                goto L_0x0028
            L_0x0027:
                r1 = r5
            L_0x0028:
                sf.j.c(r1)
                r4 = 1
                java.lang.Object r7 = r7.get(r4)
                boolean r3 = sf.j.a(r7, r3)
                if (r3 == 0) goto L_0x0037
                goto L_0x0042
            L_0x0037:
                if (r7 == 0) goto L_0x0042
                rf.l<java.lang.Object, java.lang.Object> r2 = r2.f14b
                java.lang.Object r7 = r2.invoke(r7)
                r5 = r7
                f1.k r5 = (f1.k) r5
            L_0x0042:
                sf.j.c(r5)
                long r2 = r5.f8044a
                long r4 = r1.f8044a
                r0.<init>(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.e.d0.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: x0.e$e  reason: collision with other inner class name */
    public static final class C0310e extends sf.k implements rf.p<a0.f, a.C0309a<? extends Object>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0310e f16862a = new C0310e();

        public C0310e() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            a.C0309a aVar = (a.C0309a) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(aVar, "it");
            T t2 = aVar.f16823a;
            c cVar = t2 instanceof d ? c.f16827a : t2 instanceof f ? c.f16828b : t2 instanceof k ? c.f16829c : t2 instanceof j ? c.f16830d : c.f16831e;
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                sf.j.d(t2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                t2 = e.a((d) t2, e.f16841f, fVar);
            } else if (ordinal == 1) {
                sf.j.d(t2, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                t2 = e.a((f) t2, e.f16842g, fVar);
            } else if (ordinal == 2) {
                sf.j.d(t2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                t2 = e.a((k) t2, e.f16839d, fVar);
            } else if (ordinal == 3) {
                sf.j.d(t2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                t2 = e.a((j) t2, e.f16840e, fVar);
            } else if (ordinal == 4) {
                a0.e eVar = e.f16836a;
            } else {
                throw new ff.e();
            }
            return cb.d.m(cVar, t2, Integer.valueOf(aVar.f16824b), Integer.valueOf(aVar.f16825c), aVar.f16826d);
        }
    }

    public static final class e0 extends sf.k implements rf.p<a0.f, h, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final e0 f16863a = new e0();

        public e0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            long j10 = ((h) obj2).f16908a;
            sf.j.f((a0.f) obj, "$this$Saver");
            int i8 = h.f16907c;
            Integer valueOf = Integer.valueOf((int) (j10 >> 32));
            a0.e eVar = e.f16836a;
            return cb.d.m(valueOf, Integer.valueOf(h.a(j10)));
        }
    }

    public static final class f extends sf.k implements rf.l<Object, a.C0309a<? extends Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f16864a = new f();

        public f() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = null;
            c cVar = obj2 != null ? (c) obj2 : null;
            sf.j.c(cVar);
            Object obj4 = list.get(2);
            Integer num = obj4 != null ? (Integer) obj4 : null;
            sf.j.c(num);
            int intValue = num.intValue();
            Object obj5 = list.get(3);
            Integer num2 = obj5 != null ? (Integer) obj5 : null;
            sf.j.c(num2);
            int intValue2 = num2.intValue();
            Object obj6 = list.get(4);
            String str = obj6 != null ? (String) obj6 : null;
            sf.j.c(str);
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                Object obj7 = list.get(1);
                a0.e eVar = e.f16841f;
                if (!sf.j.a(obj7, Boolean.FALSE) && obj7 != null) {
                    obj3 = (d) eVar.f14b.invoke(obj7);
                }
                sf.j.c(obj3);
                return new a.C0309a(obj3, intValue, intValue2, str);
            } else if (ordinal == 1) {
                Object obj8 = list.get(1);
                a0.e eVar2 = e.f16842g;
                if (!sf.j.a(obj8, Boolean.FALSE) && obj8 != null) {
                    obj3 = (f) eVar2.f14b.invoke(obj8);
                }
                sf.j.c(obj3);
                return new a.C0309a(obj3, intValue, intValue2, str);
            } else if (ordinal == 2) {
                Object obj9 = list.get(1);
                a0.e eVar3 = e.f16839d;
                if (!sf.j.a(obj9, Boolean.FALSE) && obj9 != null) {
                    obj3 = (k) eVar3.f14b.invoke(obj9);
                }
                sf.j.c(obj3);
                return new a.C0309a(obj3, intValue, intValue2, str);
            } else if (ordinal == 3) {
                Object obj10 = list.get(1);
                a0.e eVar4 = e.f16840e;
                if (!sf.j.a(obj10, Boolean.FALSE) && obj10 != null) {
                    obj3 = (j) eVar4.f14b.invoke(obj10);
                }
                sf.j.c(obj3);
                return new a.C0309a(obj3, intValue, intValue2, str);
            } else if (ordinal == 4) {
                Object obj11 = list.get(1);
                if (obj11 != null) {
                    obj3 = (String) obj11;
                }
                sf.j.c(obj3);
                return new a.C0309a(obj3, intValue, intValue2, str);
            } else {
                throw new ff.e();
            }
        }
    }

    public static final class f0 extends sf.k implements rf.l<Object, h> {

        /* renamed from: a  reason: collision with root package name */
        public static final f0 f16865a = new f0();

        public f0() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = null;
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            sf.j.c(num2);
            int intValue = num2.intValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                num = (Integer) obj3;
            }
            sf.j.c(num);
            return new h(gc.b.c(intValue, num.intValue()));
        }
    }

    public static final class g extends sf.k implements rf.p<a0.f, e1.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f16866a = new g();

        public g() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            float f10 = ((e1.a) obj2).f7766a;
            sf.j.f((a0.f) obj, "$this$Saver");
            return Float.valueOf(f10);
        }
    }

    public static final class g0 extends sf.k implements rf.p<a0.f, f1.k, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final g0 f16867a = new g0();

        public g0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            long j10 = ((f1.k) obj2).f8044a;
            sf.j.f((a0.f) obj, "$this$Saver");
            Float valueOf = Float.valueOf(f1.k.c(j10));
            a0.e eVar = e.f16836a;
            return cb.d.m(valueOf, new f1.l(f1.k.b(j10)));
        }
    }

    public static final class h extends sf.k implements rf.l<Object, e1.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f16868a = new h();

        public h() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            return new e1.a(((Float) obj).floatValue());
        }
    }

    public static final class h0 extends sf.k implements rf.l<Object, f1.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final h0 f16869a = new h0();

        public h0() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            f1.l lVar = null;
            Float f10 = obj2 != null ? (Float) obj2 : null;
            sf.j.c(f10);
            float floatValue = f10.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                lVar = (f1.l) obj3;
            }
            sf.j.c(lVar);
            return new f1.k(lVar.f8045a | (((long) Float.floatToIntBits(floatValue)) & 4294967295L));
        }
    }

    public static final class i extends sf.k implements rf.p<a0.f, i0.i, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f16870a = new i();

        public i() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            long j10 = ((i0.i) obj2).f9378a;
            sf.j.f((a0.f) obj, "$this$Saver");
            return new ff.k(j10);
        }
    }

    public static final class i0 extends sf.k implements rf.p<a0.f, j, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final i0 f16871a = new i0();

        public i0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            j jVar = (j) obj2;
            sf.j.f((a0.f) obj, "$this$Saver");
            sf.j.f(jVar, "it");
            a0.e eVar = e.f16836a;
            return jVar.f16909a;
        }
    }

    public static final class j extends sf.k implements rf.l<Object, i0.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f16872a = new j();

        public j() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            return new i0.i(((ff.k) obj).f8716a);
        }
    }

    public static final class j0 extends sf.k implements rf.l<Object, j> {

        /* renamed from: a  reason: collision with root package name */
        public static final j0 f16873a = new j0();

        public j0() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            return new j((String) obj);
        }
    }

    public static final class k extends sf.k implements rf.p<a0.f, z0.p, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f16874a = new k();

        public k() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            z0.p pVar = (z0.p) obj2;
            sf.j.f((a0.f) obj, "$this$Saver");
            sf.j.f(pVar, "it");
            return Integer.valueOf(pVar.f17608a);
        }
    }

    public static final class k0 extends sf.k implements rf.p<a0.f, k, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final k0 f16875a = new k0();

        public k0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            k kVar = (k) obj2;
            sf.j.f((a0.f) obj, "$this$Saver");
            sf.j.f(kVar, "it");
            a0.e eVar = e.f16836a;
            return kVar.f16910a;
        }
    }

    public static final class l extends sf.k implements rf.l<Object, z0.p> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f16876a = new l();

        public l() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            return new z0.p(((Integer) obj).intValue());
        }
    }

    public static final class l0 extends sf.k implements rf.l<Object, k> {

        /* renamed from: a  reason: collision with root package name */
        public static final l0 f16877a = new l0();

        public l0() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            return new k((String) obj);
        }
    }

    public static final class m extends sf.k implements rf.p<a0.f, b1.d, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f16878a = new m();

        public m() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            b1.d dVar = (b1.d) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(dVar, "it");
            List<b1.c> list = dVar.f2998a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(e.a(list.get(i8), e.f16853s, fVar));
            }
            return arrayList;
        }
    }

    public static final class n extends sf.k implements rf.l<Object, b1.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f16879a = new n();

        public n() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj2 = list.get(i8);
                b1.c cVar = (!sf.j.a(obj2, Boolean.FALSE) && obj2 != null) ? (b1.c) e.f16853s.f14b.invoke(obj2) : null;
                sf.j.c(cVar);
                arrayList.add(cVar);
            }
            return new b1.d(arrayList);
        }
    }

    public static final class o extends sf.k implements rf.p<a0.f, b1.c, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f16880a = new o();

        public o() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            b1.c cVar = (b1.c) obj2;
            sf.j.f((a0.f) obj, "$this$Saver");
            sf.j.f(cVar, "it");
            return cVar.f2997a.a();
        }
    }

    public static final class p extends sf.k implements rf.l<Object, b1.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f16881a = new p();

        public p() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            e9.c.f7877b.getClass();
            Locale forLanguageTag = Locale.forLanguageTag((String) obj);
            sf.j.e(forLanguageTag, "forLanguageTag(languageTag)");
            return new b1.c(new b1.a(forLanguageTag));
        }
    }

    public static final class q extends sf.k implements rf.p<a0.f, h0.c, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f16882a = new q();

        public q() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            long j10 = ((h0.c) obj2).f9072a;
            sf.j.f((a0.f) obj, "$this$Saver");
            if (h0.c.a(j10, h0.c.f9070d)) {
                return Boolean.FALSE;
            }
            Float valueOf = Float.valueOf(h0.c.b(j10));
            a0.e eVar = e.f16836a;
            return cb.d.m(valueOf, Float.valueOf(h0.c.c(j10)));
        }
    }

    public static final class r extends sf.k implements rf.l<Object, h0.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f16883a = new r();

        public r() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            if (sf.j.a(obj, Boolean.FALSE)) {
                return new h0.c(h0.c.f9070d);
            }
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = null;
            Float f11 = obj2 != null ? (Float) obj2 : null;
            sf.j.c(f11);
            float floatValue = f11.floatValue();
            Object obj3 = list.get(1);
            if (obj3 != null) {
                f10 = (Float) obj3;
            }
            sf.j.c(f10);
            return new h0.c(f1.f(floatValue, f10.floatValue()));
        }
    }

    public static final class s extends sf.k implements rf.p<a0.f, d, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f16884a = new s();

        public s() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            d dVar = (d) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(dVar, "it");
            a0.e eVar = e.f16836a;
            int i8 = e1.h.f7772c;
            return cb.d.m(dVar.f16832a, dVar.f16833b, e.a(new f1.k(dVar.f16834c), e.f16850p, fVar), e.a(dVar.f16835d, e.f16845j, fVar));
        }
    }

    public static final class t extends sf.k implements rf.l<Object, d> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f16885a = new t();

        public t() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            e1.c cVar = obj2 != null ? (e1.c) obj2 : null;
            Object obj3 = list.get(1);
            e1.e eVar = obj3 != null ? (e1.e) obj3 : null;
            Object obj4 = list.get(2);
            f1.l[] lVarArr = f1.k.f8042b;
            a0.e eVar2 = e.f16850p;
            Boolean bool = Boolean.FALSE;
            f1.k kVar = (!sf.j.a(obj4, bool) && obj4 != null) ? (f1.k) eVar2.f14b.invoke(obj4) : null;
            sf.j.c(kVar);
            long j10 = kVar.f8044a;
            Object obj5 = list.get(3);
            int i8 = e1.h.f7772c;
            return new d(cVar, eVar, j10, (!sf.j.a(obj5, bool) && obj5 != null) ? (e1.h) e.f16845j.f14b.invoke(obj5) : null);
        }
    }

    public static final class u extends sf.k implements rf.p<a0.f, i0.s, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f16886a = new u();

        public u() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            i0.s sVar = (i0.s) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(sVar, "it");
            return cb.d.m(e.a(new i0.i(sVar.f9390a), e.f16849o, fVar), e.a(new h0.c(sVar.f9391b), e.f16851q, fVar), Float.valueOf(sVar.f9392c));
        }
    }

    public static final class v extends sf.k implements rf.l<Object, i0.s> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f16887a = new v();

        public v() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            int i8 = i0.i.f9377f;
            a0.e eVar = e.f16849o;
            Boolean bool = Boolean.FALSE;
            Float f10 = null;
            i0.i iVar = (!sf.j.a(obj2, bool) && obj2 != null) ? (i0.i) eVar.f14b.invoke(obj2) : null;
            sf.j.c(iVar);
            long j10 = iVar.f9378a;
            Object obj3 = list.get(1);
            int i10 = h0.c.f9071e;
            h0.c cVar = (!sf.j.a(obj3, bool) && obj3 != null) ? (h0.c) e.f16851q.f14b.invoke(obj3) : null;
            sf.j.c(cVar);
            long j11 = cVar.f9072a;
            Object obj4 = list.get(2);
            if (obj4 != null) {
                f10 = (Float) obj4;
            }
            sf.j.c(f10);
            return new i0.s(j10, j11, f10.floatValue());
        }
    }

    public static final class w extends sf.k implements rf.p<a0.f, f, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f16888a = new w();

        public w() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a0.f fVar = (a0.f) obj;
            f fVar2 = (f) obj2;
            sf.j.f(fVar, "$this$Saver");
            sf.j.f(fVar2, "it");
            i0.i iVar = new i0.i(fVar2.f16892a.a());
            a0.e eVar = e.f16849o;
            f1.k kVar = new f1.k(fVar2.f16893b);
            a0.e eVar2 = e.f16850p;
            z0.p pVar = z0.p.f17605b;
            a0.e eVar3 = e.f16846k;
            a0.e eVar4 = e.f16847l;
            a0.e eVar5 = e.f16844i;
            a0.e eVar6 = e.f16852r;
            a0.e eVar7 = e.f16843h;
            int i8 = i0.s.f9389d;
            return cb.d.m(e.a(iVar, eVar, fVar), e.a(kVar, eVar2, fVar), e.a(fVar2.f16894c, eVar3, fVar), fVar2.f16895d, fVar2.f16896e, -1, fVar2.f16898g, e.a(new f1.k(fVar2.f16899h), eVar2, fVar), e.a(fVar2.f16900i, eVar4, fVar), e.a(fVar2.f16901j, eVar5, fVar), e.a(fVar2.f16902k, eVar6, fVar), e.a(new i0.i(fVar2.f16903l), eVar, fVar), e.a(fVar2.m, eVar7, fVar), e.a(fVar2.f16904n, e.f16848n, fVar));
        }
    }

    public static final class x extends sf.k implements rf.l<Object, f> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f16889a = new x();

        public x() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Object obj2 = obj;
            sf.j.f(obj2, "it");
            List list = (List) obj2;
            Object obj3 = list.get(0);
            int i8 = i0.i.f9377f;
            a0.e eVar = e.f16849o;
            Boolean bool = Boolean.FALSE;
            i0.i iVar = (!sf.j.a(obj3, bool) && obj3 != null) ? (i0.i) eVar.f14b.invoke(obj3) : null;
            sf.j.c(iVar);
            boolean z10 = true;
            Object obj4 = list.get(1);
            f1.l[] lVarArr = f1.k.f8042b;
            a0.e eVar2 = e.f16850p;
            f1.k kVar = (!sf.j.a(obj4, bool) && obj4 != null) ? (f1.k) eVar2.f14b.invoke(obj4) : null;
            sf.j.c(kVar);
            long j10 = kVar.f8044a;
            Object obj5 = list.get(2);
            z0.p pVar = z0.p.f17605b;
            z0.p pVar2 = (!sf.j.a(obj5, bool) && obj5 != null) ? (z0.p) e.f16846k.f14b.invoke(obj5) : null;
            Object obj6 = list.get(3);
            z0.n nVar = obj6 != null ? (z0.n) obj6 : null;
            Object obj7 = list.get(4);
            z0.o oVar = obj7 != null ? (z0.o) obj7 : null;
            Object obj8 = list.get(6);
            String str = obj8 != null ? (String) obj8 : null;
            Object obj9 = list.get(7);
            f1.k kVar2 = (!sf.j.a(obj9, bool) && obj9 != null) ? (f1.k) eVar2.f14b.invoke(obj9) : null;
            sf.j.c(kVar2);
            long j11 = kVar2.f8044a;
            Object obj10 = list.get(8);
            e1.a aVar = (!sf.j.a(obj10, bool) && obj10 != null) ? (e1.a) e.f16847l.f14b.invoke(obj10) : null;
            Object obj11 = list.get(9);
            e1.g gVar = (!sf.j.a(obj11, bool) && obj11 != null) ? (e1.g) e.f16844i.f14b.invoke(obj11) : null;
            Object obj12 = list.get(10);
            b1.d dVar = (!sf.j.a(obj12, bool) && obj12 != null) ? (b1.d) e.f16852r.f14b.invoke(obj12) : null;
            Object obj13 = list.get(11);
            i0.i iVar2 = (!sf.j.a(obj13, bool) && obj13 != null) ? (i0.i) eVar.f14b.invoke(obj13) : null;
            sf.j.c(iVar2);
            long j12 = j10;
            long j13 = iVar2.f9378a;
            Object obj14 = list.get(12);
            e1.d dVar2 = (!sf.j.a(obj14, bool) && obj14 != null) ? (e1.d) e.f16843h.f14b.invoke(obj14) : null;
            Object obj15 = list.get(13);
            int i10 = i0.s.f9389d;
            i0.s sVar = (!sf.j.a(obj15, bool) && obj15 != null) ? (i0.s) e.f16848n.f14b.invoke(obj15) : null;
            long j14 = i0.i.f9376e;
            long j15 = iVar.f9378a;
            if (j15 == j14) {
                z10 = false;
            }
            return new f(z10 ? new e1.b(j15) : f.a.f7769a, j12, pVar2, nVar, oVar, (z0.f) null, str, j11, aVar, gVar, dVar, j13, dVar2, sVar, (androidx.fragment.app.z) null);
        }
    }

    public static final class y extends sf.k implements rf.p<a0.f, e1.d, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f16890a = new y();

        public y() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            e1.d dVar = (e1.d) obj2;
            sf.j.f((a0.f) obj, "$this$Saver");
            sf.j.f(dVar, "it");
            return Integer.valueOf(dVar.f7768a);
        }
    }

    public static final class z extends sf.k implements rf.l<Object, e1.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f16891a = new z();

        public z() {
            super(1);
        }

        public final Object invoke(Object obj) {
            sf.j.f(obj, "it");
            return new e1.d(((Integer) obj).intValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r2.a(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Object r1, a0.e r2, a0.f r3) {
        /*
            java.lang.String r0 = "saver"
            sf.j.f(r2, r0)
            java.lang.String r0 = "scope"
            sf.j.f(r3, r0)
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r2.a(r3, r1)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.a(java.lang.Object, a0.e, a0.f):java.lang.Object");
    }
}
