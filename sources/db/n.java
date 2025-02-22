package db;

import ab.a0;
import ab.b;
import ab.b0;
import ab.c;
import ab.u;
import ab.w;
import cb.h;
import cb.o;
import cb.s;
import cb.t;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class n implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f7441a;

    /* renamed from: b  reason: collision with root package name */
    public final c f7442b;

    /* renamed from: c  reason: collision with root package name */
    public final o f7443c;

    /* renamed from: d  reason: collision with root package name */
    public final e f7444d;

    /* renamed from: e  reason: collision with root package name */
    public final List<w> f7445e;

    public static final class a<T> extends a0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final s<T> f7446a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f7447b;

        public a(s sVar, LinkedHashMap linkedHashMap) {
            this.f7446a = sVar;
            this.f7447b = linkedHashMap;
        }

        public final T a(hb.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            T g10 = this.f7446a.g();
            try {
                aVar.d();
                while (aVar.F()) {
                    b bVar = this.f7447b.get(aVar.Y());
                    if (bVar != null) {
                        if (bVar.f7450c) {
                            bVar.a(aVar, g10);
                        }
                    }
                    aVar.v0();
                }
                aVar.q();
                return g10;
            } catch (IllegalStateException e10) {
                throw new u((Exception) e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
            }
        }

        public final void b(hb.b bVar, T t2) {
            if (t2 == null) {
                bVar.z();
                return;
            }
            bVar.e();
            try {
                for (b b10 : this.f7447b.values()) {
                    b10.b(bVar, t2);
                }
                bVar.q();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f7448a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7449b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7450c;

        public b(String str, boolean z10, boolean z11) {
            this.f7448a = str;
            this.f7449b = z10;
            this.f7450c = z11;
        }

        public abstract void a(hb.a aVar, Object obj);

        public abstract void b(hb.b bVar, Object obj);
    }

    public n(h hVar, b.a aVar, o oVar, e eVar, List list) {
        this.f7441a = hVar;
        this.f7442b = aVar;
        this.f7443c = oVar;
        this.f7444d = eVar;
        this.f7445e = list;
    }

    public static void b(Object obj, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (!t.a.f3949a.a(field, obj)) {
            throw new ab.o("Field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0268, code lost:
        r39 = r8;
        r9 = new gb.a<>(cb.a.h(r11, r39, r39.getGenericSuperclass(), new java.util.HashMap()));
        r8 = r9.f8928a;
        r0 = r42;
        r13 = r13;
        r10 = r10;
        r2 = r19;
        r15 = r21;
        r14 = r14;
        r12 = r12;
        r6 = r6;
        r4 = r4;
        r5 = r5;
        r3 = r3;
        r1 = r41;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> ab.a0<T> a(ab.i r42, gb.a<T> r43) {
        /*
            r41 = this;
            r1 = r41
            r0 = r42
            r13 = r43
            java.lang.Class<? super T> r14 = r13.f8928a
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
            boolean r2 = r15.isAssignableFrom(r14)
            r16 = 0
            if (r2 != 0) goto L_0x0013
            return r16
        L_0x0013:
            java.util.List<ab.w> r12 = r1.f7445e
            int r2 = cb.t.a(r14, r12)
            r11 = 4
            java.lang.String r10 = "ReflectionAccessFilter does not permit using reflection for "
            if (r2 == r11) goto L_0x02b8
            r7 = 3
            if (r2 != r7) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            cb.h r6 = r1.f7441a
            cb.s r5 = r6.a(r13)
            db.n$a r4 = new db.n$a
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            boolean r17 = r14.isInterface()
            if (r17 == 0) goto L_0x003e
        L_0x0037:
            r1 = r3
            r36 = r4
            r37 = r5
            goto L_0x02b0
        L_0x003e:
            r9 = r13
            r8 = r14
        L_0x0040:
            if (r8 == r15) goto L_0x0037
            java.lang.reflect.Field[] r7 = r8.getDeclaredFields()
            if (r8 == r14) goto L_0x007a
            int r11 = r7.length
            if (r11 <= 0) goto L_0x007a
            int r2 = cb.t.a(r8, r12)
            r11 = 4
            if (r2 == r11) goto L_0x005b
            r11 = 3
            if (r2 != r11) goto L_0x0058
            r19 = 1
            goto L_0x007d
        L_0x0058:
            r19 = 0
            goto L_0x007d
        L_0x005b:
            ab.o r0 = new ab.o
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            r2.append(r8)
            java.lang.String r3 = " (supertype of "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = "). Register a TypeAdapter for this type or adjust the access filter."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x007a:
            r11 = 3
            r19 = r2
        L_0x007d:
            int r2 = r7.length
            r21 = r15
            r15 = 0
        L_0x0081:
            java.lang.reflect.Type r11 = r9.f8929b
            if (r15 >= r2) goto L_0x0268
            r23 = r14
            r14 = r7[r15]
            r24 = r2
            r2 = 1
            boolean r25 = r1.c(r14, r2)
            r2 = 0
            boolean r17 = r1.c(r14, r2)
            if (r25 != 0) goto L_0x00b5
            if (r17 != 0) goto L_0x00b5
            r26 = r2
            r1 = r3
            r36 = r4
            r37 = r5
            r32 = r6
            r22 = r7
            r39 = r8
            r18 = r9
            r14 = r10
            r30 = r12
            r31 = r15
            r34 = 1
            r38 = 3
            r40 = 4
            goto L_0x022a
        L_0x00b5:
            if (r19 != 0) goto L_0x00eb
            r2 = 1
            r14.setAccessible(r2)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00eb
        L_0x00bc:
            r0 = move-exception
            r2 = r0
            ab.o r0 = new ab.o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed making field '"
            r3.<init>(r4)
            java.lang.Class r4 = r14.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "#"
            r3.append(r4)
            java.lang.String r4 = r14.getName()
            r3.append(r4)
            java.lang.String r4 = "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r2)
            throw r0
        L_0x00eb:
            java.lang.reflect.Type r2 = r14.getGenericType()
            r27 = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.reflect.Type r11 = cb.a.h(r11, r8, r2, r3)
            java.lang.Class<bb.b> r2 = bb.b.class
            java.lang.annotation.Annotation r2 = r14.getAnnotation(r2)
            bb.b r2 = (bb.b) r2
            if (r2 != 0) goto L_0x0111
            ab.c r2 = r1.f7442b
            java.lang.String r2 = r2.a(r14)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r28 = r4
            goto L_0x0122
        L_0x0111:
            java.lang.String r3 = r2.value()
            java.lang.String[] r2 = r2.alternate()
            r28 = r4
            int r4 = r2.length
            if (r4 != 0) goto L_0x0128
            java.util.List r2 = java.util.Collections.singletonList(r3)
        L_0x0122:
            r29 = r5
            r18 = 1
            r5 = r2
            goto L_0x0148
        L_0x0128:
            java.util.ArrayList r4 = new java.util.ArrayList
            r29 = r5
            int r5 = r2.length
            r18 = 1
            int r5 = r5 + 1
            r4.<init>(r5)
            r4.add(r3)
            int r3 = r2.length
            r5 = 0
        L_0x0139:
            if (r5 >= r3) goto L_0x0147
            r30 = r3
            r3 = r2[r5]
            r4.add(r3)
            int r5 = r5 + 1
            r3 = r30
            goto L_0x0139
        L_0x0147:
            r5 = r4
        L_0x0148:
            int r4 = r5.size()
            r2 = r16
            r3 = 0
        L_0x014f:
            if (r3 >= r4) goto L_0x020c
            java.lang.Object r30 = r5.get(r3)
            r13 = r30
            java.lang.String r13 = (java.lang.String) r13
            r30 = r12
            if (r3 == 0) goto L_0x015f
            r25 = 0
        L_0x015f:
            gb.a r12 = new gb.a
            r12.<init>(r11)
            r31 = r2
            java.lang.Class<? super T> r2 = r12.f8928a
            r32 = r3
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0177
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L_0x0177
            r33 = r18
            goto L_0x0179
        L_0x0177:
            r33 = 0
        L_0x0179:
            java.lang.Class<bb.a> r2 = bb.a.class
            java.lang.annotation.Annotation r2 = r14.getAnnotation(r2)
            bb.a r2 = (bb.a) r2
            if (r2 == 0) goto L_0x018d
            db.e r3 = r1.f7444d
            r3.getClass()
            ab.a0 r2 = db.e.b(r6, r0, r12, r2)
            goto L_0x018f
        L_0x018d:
            r2 = r16
        L_0x018f:
            if (r2 == 0) goto L_0x0194
            r34 = r18
            goto L_0x0196
        L_0x0194:
            r34 = 0
        L_0x0196:
            if (r2 != 0) goto L_0x019c
            ab.a0 r2 = r0.c(r12)
        L_0x019c:
            r35 = r2
            db.m r3 = new db.m
            r0 = r31
            r26 = 0
            r2 = r3
            r31 = r15
            r1 = r27
            r27 = r32
            r15 = r3
            r3 = r13
            r36 = r28
            r28 = r4
            r4 = r25
            r37 = r29
            r29 = r5
            r5 = r17
            r32 = r6
            r6 = r19
            r22 = r7
            r38 = 3
            r7 = r14
            r39 = r8
            r8 = r34
            r34 = r18
            r18 = r9
            r9 = r35
            r35 = r14
            r14 = r10
            r10 = r42
            r20 = r11
            r40 = 4
            r11 = r12
            r12 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r1.put(r13, r15)
            db.n$b r2 = (db.n.b) r2
            if (r0 != 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r2 = r0
        L_0x01e5:
            int r3 = r27 + 1
            r0 = r42
            r13 = r43
            r27 = r1
            r10 = r14
            r9 = r18
            r11 = r20
            r7 = r22
            r4 = r28
            r5 = r29
            r12 = r30
            r15 = r31
            r6 = r32
            r18 = r34
            r14 = r35
            r28 = r36
            r29 = r37
            r8 = r39
            r1 = r41
            goto L_0x014f
        L_0x020c:
            r0 = r2
            r32 = r6
            r22 = r7
            r39 = r8
            r14 = r10
            r30 = r12
            r31 = r15
            r34 = r18
            r1 = r27
            r36 = r28
            r37 = r29
            r26 = 0
            r38 = 3
            r40 = 4
            r18 = r9
            if (r0 != 0) goto L_0x0248
        L_0x022a:
            int r15 = r31 + 1
            r0 = r42
            r13 = r43
            r3 = r1
            r10 = r14
            r9 = r18
            r7 = r22
            r14 = r23
            r2 = r24
            r12 = r30
            r6 = r32
            r4 = r36
            r5 = r37
            r8 = r39
            r1 = r41
            goto L_0x0081
        L_0x0248:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r43
            java.lang.reflect.Type r3 = r3.f8929b
            r2.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f7448a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0268:
            r1 = r3
            r36 = r4
            r37 = r5
            r32 = r6
            r39 = r8
            r30 = r12
            r3 = r13
            r23 = r14
            r26 = 0
            r34 = 1
            r38 = 3
            r40 = 4
            r14 = r10
            java.lang.reflect.Type r0 = r39.getGenericSuperclass()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4 = r39
            java.lang.reflect.Type r0 = cb.a.h(r11, r4, r0, r2)
            gb.a r9 = new gb.a
            r9.<init>(r0)
            java.lang.Class<? super T> r8 = r9.f8928a
            r0 = r42
            r13 = r3
            r10 = r14
            r2 = r19
            r15 = r21
            r14 = r23
            r12 = r30
            r6 = r32
            r4 = r36
            r5 = r37
            r7 = r38
            r11 = r40
            r3 = r1
            r1 = r41
            goto L_0x0040
        L_0x02b0:
            r2 = r36
            r0 = r37
            r2.<init>(r0, r1)
            return r2
        L_0x02b8:
            r23 = r14
            r14 = r10
            ab.o r0 = new ab.o
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r14)
            r2 = r23
            r1.append(r2)
            java.lang.String r2 = ". Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db.n.a(ab.i, gb.a):ab.a0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r0 == false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.lang.reflect.Field r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getType()
            cb.o r1 = r9.f7443c
            boolean r2 = r1.b(r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0017
            boolean r0 = r1.f(r0, r11)
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r3
            goto L_0x0018
        L_0x0017:
            r0 = r4
        L_0x0018:
            if (r0 != 0) goto L_0x00a0
            int r0 = r10.getModifiers()
            int r2 = r1.f3921b
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0025
            goto L_0x009a
        L_0x0025:
            double r5 = r1.f3920a
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            java.lang.Class<bb.c> r0 = bb.c.class
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r0)
            bb.c r0 = (bb.c) r0
            java.lang.Class<bb.d> r2 = bb.d.class
            java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
            bb.d r2 = (bb.d) r2
            boolean r0 = r1.h(r0, r2)
            if (r0 != 0) goto L_0x0044
            goto L_0x009a
        L_0x0044:
            boolean r0 = r10.isSynthetic()
            if (r0 == 0) goto L_0x004b
            goto L_0x009a
        L_0x004b:
            boolean r0 = r1.f3922c
            if (r0 != 0) goto L_0x006c
            java.lang.Class r0 = r10.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L_0x0068
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0063
            r0 = r4
            goto L_0x0064
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r0 != 0) goto L_0x0068
            r0 = r4
            goto L_0x0069
        L_0x0068:
            r0 = r3
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            goto L_0x009a
        L_0x006c:
            java.lang.Class r10 = r10.getType()
            boolean r10 = cb.o.g(r10)
            if (r10 == 0) goto L_0x0077
            goto L_0x009a
        L_0x0077:
            if (r11 == 0) goto L_0x007c
            java.util.List<ab.a> r10 = r1.f3923d
            goto L_0x007e
        L_0x007c:
            java.util.List<ab.a> r10 = r1.f3924e
        L_0x007e:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x009c
            java.util.Iterator r10 = r10.iterator()
        L_0x0088:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009c
            java.lang.Object r11 = r10.next()
            ab.a r11 = (ab.a) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto L_0x0088
        L_0x009a:
            r10 = r4
            goto L_0x009d
        L_0x009c:
            r10 = r3
        L_0x009d:
            if (r10 != 0) goto L_0x00a0
            r3 = r4
        L_0x00a0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: db.n.c(java.lang.reflect.Field, boolean):boolean");
    }
}
