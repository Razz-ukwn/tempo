package yg;

public abstract class d0<T> {
    /* JADX WARNING: Removed duplicated region for block: B:383:0x08e4  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x08e8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static yg.k b(yg.c0 r28, java.lang.reflect.Method r29) {
        /*
            r0 = r28
            r1 = r29
            yg.a0$a r2 = new yg.a0$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f17425c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x000e:
            r7 = 1
            java.lang.String r8 = "HEAD"
            java.lang.reflect.Method r9 = r2.f17424b
            if (r6 >= r4) goto L_0x0146
            r10 = r3[r6]
            boolean r11 = r10 instanceof ah.b
            if (r11 == 0) goto L_0x0028
            ah.b r10 = (ah.b) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
            r2.b(r8, r7, r5)
            goto L_0x0142
        L_0x0028:
            boolean r11 = r10 instanceof ah.f
            if (r11 == 0) goto L_0x0039
            ah.f r10 = (ah.f) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            r2.b(r8, r7, r5)
            goto L_0x0142
        L_0x0039:
            boolean r11 = r10 instanceof ah.g
            if (r11 == 0) goto L_0x0048
            ah.g r10 = (ah.g) r10
            java.lang.String r7 = r10.value()
            r2.b(r8, r7, r5)
            goto L_0x0142
        L_0x0048:
            boolean r8 = r10 instanceof ah.n
            if (r8 == 0) goto L_0x0059
            ah.n r10 = (ah.n) r10
            java.lang.String r8 = r10.value()
            java.lang.String r9 = "PATCH"
            r2.b(r9, r8, r7)
            goto L_0x0142
        L_0x0059:
            boolean r8 = r10 instanceof ah.o
            if (r8 == 0) goto L_0x006a
            ah.o r10 = (ah.o) r10
            java.lang.String r8 = r10.value()
            java.lang.String r9 = "POST"
            r2.b(r9, r8, r7)
            goto L_0x0142
        L_0x006a:
            boolean r8 = r10 instanceof ah.p
            if (r8 == 0) goto L_0x007b
            ah.p r10 = (ah.p) r10
            java.lang.String r8 = r10.value()
            java.lang.String r9 = "PUT"
            r2.b(r9, r8, r7)
            goto L_0x0142
        L_0x007b:
            boolean r8 = r10 instanceof ah.m
            if (r8 == 0) goto L_0x008c
            ah.m r10 = (ah.m) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
            r2.b(r8, r7, r5)
            goto L_0x0142
        L_0x008c:
            boolean r8 = r10 instanceof ah.h
            if (r8 == 0) goto L_0x00a3
            ah.h r10 = (ah.h) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.b(r7, r8, r9)
            goto L_0x0142
        L_0x00a3:
            boolean r8 = r10 instanceof ah.k
            if (r8 == 0) goto L_0x011b
            ah.k r10 = (ah.k) r10
            java.lang.String[] r8 = r10.value()
            int r10 = r8.length
            if (r10 == 0) goto L_0x0111
            jg.q$a r10 = new jg.q$a
            r10.<init>()
            int r11 = r8.length
            r12 = r5
        L_0x00b7:
            if (r12 >= r11) goto L_0x010a
            r13 = r8[r12]
            r14 = 58
            int r14 = r13.indexOf(r14)
            r15 = -1
            if (r14 == r15) goto L_0x00fe
            if (r14 == 0) goto L_0x00fe
            int r15 = r13.length()
            int r15 = r15 - r7
            if (r14 == r15) goto L_0x00fe
            java.lang.String r15 = r13.substring(r5, r14)
            int r14 = r14 + 1
            java.lang.String r13 = r13.substring(r14)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00f8
            java.util.regex.Pattern r14 = jg.t.f10171d     // Catch:{ IllegalArgumentException -> 0x00ec }
            jg.t r14 = jg.t.a.a(r13)     // Catch:{ IllegalArgumentException -> 0x00ec }
            r2.f17441t = r14     // Catch:{ IllegalArgumentException -> 0x00ec }
            goto L_0x00fb
        L_0x00ec:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r5] = r13
            java.lang.String r2 = "Malformed content type: %s"
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r0, r2, r1)
            throw r0
        L_0x00f8:
            r10.a(r15, r13)
        L_0x00fb:
            int r12 = r12 + 1
            goto L_0x00b7
        L_0x00fe:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r5] = r13
            java.lang.String r1 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            r2 = 0
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r2, r1, r0)
            throw r0
        L_0x010a:
            jg.q r7 = r10.c()
            r2.f17440s = r7
            goto L_0x0142
        L_0x0111:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r0, r2, r1)
            throw r0
        L_0x011b:
            r8 = 0
            boolean r11 = r10 instanceof ah.l
            java.lang.String r12 = "Only one encoding annotation is allowed."
            if (r11 == 0) goto L_0x0130
            boolean r10 = r2.f17437p
            if (r10 != 0) goto L_0x0129
            r2.f17438q = r7
            goto L_0x0142
        L_0x0129:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r8, r12, r0)
            throw r0
        L_0x0130:
            boolean r10 = r10 instanceof ah.e
            if (r10 == 0) goto L_0x0142
            boolean r10 = r2.f17438q
            if (r10 != 0) goto L_0x013b
            r2.f17437p = r7
            goto L_0x0142
        L_0x013b:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r8, r12, r0)
            throw r0
        L_0x0142:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0146:
            java.lang.String r3 = r2.f17435n
            if (r3 == 0) goto L_0x0aeb
            boolean r3 = r2.f17436o
            if (r3 != 0) goto L_0x016b
            boolean r3 = r2.f17438q
            if (r3 != 0) goto L_0x0161
            boolean r3 = r2.f17437p
            if (r3 != 0) goto L_0x0157
            goto L_0x016b
        L_0x0157:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            r2 = 0
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r2, r1, r0)
            throw r0
        L_0x0161:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r0, r2, r1)
            throw r0
        L_0x016b:
            java.lang.annotation.Annotation[][] r3 = r2.f17426d
            int r4 = r3.length
            yg.x[] r6 = new yg.x[r4]
            r2.f17443v = r6
            int r6 = r4 + -1
            r11 = r2
            r10 = r7
            r7 = r5
        L_0x0177:
            if (r5 >= r4) goto L_0x0957
            yg.x<?>[] r12 = r11.f17443v
            java.lang.reflect.Type[] r13 = r11.f17427e
            r13 = r13[r5]
            r14 = r3[r5]
            if (r5 != r6) goto L_0x0184
            r7 = r10
        L_0x0184:
            if (r14 == 0) goto L_0x0915
            int r10 = r14.length
            r15 = 0
            r16 = 0
            r17 = r16
            r16 = r3
            r3 = r15
            r15 = r11
        L_0x0190:
            if (r3 >= r10) goto L_0x0907
            r18 = r4
            r4 = r14[r3]
            r19 = r6
            boolean r6 = r4 instanceof ah.y
            r20 = r10
            java.lang.String r10 = "@Path parameters may not be used with @Url."
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r6 == 0) goto L_0x0230
            r11.c(r5, r13)
            boolean r4 = r15.m
            if (r4 != 0) goto L_0x0226
            boolean r4 = r15.f17431i
            if (r4 != 0) goto L_0x021e
            boolean r4 = r15.f17432j
            if (r4 != 0) goto L_0x0214
            boolean r4 = r15.f17433k
            if (r4 != 0) goto L_0x020a
            boolean r4 = r15.f17434l
            if (r4 != 0) goto L_0x0200
            java.lang.String r4 = r15.f17439r
            if (r4 != 0) goto L_0x01f1
            r4 = 1
            r15.m = r4
            java.lang.Class<jg.r> r4 = jg.r.class
            if (r13 == r4) goto L_0x01e8
            if (r13 == r1) goto L_0x01e8
            java.lang.Class<java.net.URI> r1 = java.net.URI.class
            if (r13 == r1) goto L_0x01e8
            boolean r1 = r13 instanceof java.lang.Class
            if (r1 == 0) goto L_0x01de
            r1 = r13
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "android.net.Uri"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x01de
            goto L_0x01e8
        L_0x01de:
            java.lang.String r0 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x01e8:
            yg.x$n r1 = new yg.x$n
            r1.<init>(r5, r9)
            r21 = r8
            goto L_0x027b
        L_0x01f1:
            r0 = 0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r15.f17435n
            r1[r0] = r2
            java.lang.String r0 = "@Url cannot be used with @%s URL"
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0200:
            r0 = 0
            java.lang.String r1 = "A @Url parameter must not come after a @QueryMap."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x020a:
            r0 = 0
            java.lang.String r1 = "A @Url parameter must not come after a @QueryName."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0214:
            r0 = 0
            java.lang.String r1 = "A @Url parameter must not come after a @Query."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x021e:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r10, r0)
            throw r0
        L_0x0226:
            r0 = 0
            java.lang.String r1 = "Multiple @Url method annotations found."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0230:
            boolean r6 = r4 instanceof ah.s
            r21 = r8
            yg.c0 r8 = r15.f17423a
            if (r6 == 0) goto L_0x02de
            r11.c(r5, r13)
            boolean r1 = r15.f17432j
            if (r1 != 0) goto L_0x02d4
            boolean r1 = r15.f17433k
            if (r1 != 0) goto L_0x02ca
            boolean r1 = r15.f17434l
            if (r1 != 0) goto L_0x02c0
            boolean r1 = r15.m
            if (r1 != 0) goto L_0x02b8
            java.lang.String r1 = r15.f17439r
            if (r1 == 0) goto L_0x02a9
            r1 = 1
            r15.f17431i = r1
            ah.s r4 = (ah.s) r4
            java.lang.String r1 = r4.value()
            java.util.regex.Pattern r6 = yg.a0.a.f17422y
            java.util.regex.Matcher r6 = r6.matcher(r1)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L_0x0293
            java.util.LinkedHashSet r6 = r15.f17442u
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x0281
            r8.f(r13, r14)
            yg.x$i r6 = new yg.x$i
            java.lang.reflect.Method r8 = r15.f17424b
            boolean r4 = r4.encoded()
            r6.<init>(r8, r5, r1, r4)
            r1 = r6
        L_0x027b:
            r23 = r7
            r22 = r12
            goto L_0x03ef
        L_0x0281:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r15.f17439r
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0293:
            r0 = 1
            r2 = 0
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.regex.Pattern r4 = yg.a0.a.f17421x
            java.lang.String r4 = r4.pattern()
            r3[r2] = r4
            r3[r0] = r1
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r3)
            throw r0
        L_0x02a9:
            r0 = 1
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r15.f17435n
            r0[r1] = r2
            java.lang.String r1 = "@Path can only be used with relative url on @%s"
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x02b8:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r10, r0)
            throw r0
        L_0x02c0:
            r0 = 0
            java.lang.String r1 = "A @Path parameter must not come after a @QueryMap."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x02ca:
            r0 = 0
            java.lang.String r1 = "A @Path parameter must not come after a @QueryName."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x02d4:
            r0 = 0
            java.lang.String r1 = "A @Path parameter must not come after a @Query."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x02de:
            boolean r6 = r4 instanceof ah.t
            java.lang.String r10 = "<String>)"
            java.lang.String r0 = " must include generic type (e.g., "
            r22 = r12
            java.lang.Class<java.lang.Iterable> r12 = java.lang.Iterable.class
            if (r6 == 0) goto L_0x036e
            r11.c(r5, r13)
            ah.t r4 = (ah.t) r4
            java.lang.String r1 = r4.value()
            boolean r4 = r4.encoded()
            java.lang.Class r6 = yg.g0.e(r13)
            r23 = r7
            r7 = 1
            r15.f17432j = r7
            boolean r7 = r12.isAssignableFrom(r6)
            if (r7 == 0) goto L_0x0346
            boolean r7 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x0321
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r6 = 0
            java.lang.reflect.Type r0 = yg.g0.d(r6, r0)
            r8.f(r0, r14)
            yg.x$j r0 = new yg.x$j
            r0.<init>(r1, r4)
            yg.v r1 = new yg.v
            r1.<init>(r0)
            goto L_0x03ef
        L_0x0321:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r6.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0346:
            boolean r0 = r6.isArray()
            if (r0 == 0) goto L_0x0363
            java.lang.Class r0 = r6.getComponentType()
            java.lang.Class r0 = yg.a0.a.a(r0)
            r8.f(r0, r14)
            yg.x$j r0 = new yg.x$j
            r0.<init>(r1, r4)
            yg.w r1 = new yg.w
            r1.<init>(r0)
            goto L_0x03ef
        L_0x0363:
            r8.f(r13, r14)
            yg.x$j r0 = new yg.x$j
            r0.<init>(r1, r4)
        L_0x036b:
            r1 = r0
            goto L_0x03ef
        L_0x036e:
            r23 = r7
            boolean r6 = r4 instanceof ah.v
            if (r6 == 0) goto L_0x03f4
            r11.c(r5, r13)
            ah.v r4 = (ah.v) r4
            boolean r1 = r4.encoded()
            java.lang.Class r4 = yg.g0.e(r13)
            r6 = 1
            r15.f17433k = r6
            boolean r6 = r12.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x03c9
            boolean r6 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x03a4
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r4 = 0
            java.lang.reflect.Type r0 = yg.g0.d(r4, r0)
            r8.f(r0, r14)
            yg.x$l r0 = new yg.x$l
            r0.<init>(r1)
            yg.v r1 = new yg.v
            r1.<init>(r0)
            goto L_0x03ef
        L_0x03a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r4.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x03c9:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x03e5
            java.lang.Class r0 = r4.getComponentType()
            java.lang.Class r0 = yg.a0.a.a(r0)
            r8.f(r0, r14)
            yg.x$l r0 = new yg.x$l
            r0.<init>(r1)
            yg.w r1 = new yg.w
            r1.<init>(r0)
            goto L_0x03ef
        L_0x03e5:
            r8.f(r13, r14)
            yg.x$l r0 = new yg.x$l
            r0.<init>(r1)
            goto L_0x036b
        L_0x03ef:
            r0 = r2
            r24 = r3
            goto L_0x08e1
        L_0x03f4:
            boolean r6 = r4 instanceof ah.u
            java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
            r24 = r3
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            if (r6 == 0) goto L_0x045b
            r11.c(r5, r13)
            java.lang.Class r0 = yg.g0.e(r13)
            r6 = 1
            r15.f17434l = r6
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x0451
            java.lang.reflect.Type r0 = yg.g0.f(r13, r0)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0449
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r3 = yg.g0.d(r3, r0)
            if (r1 != r3) goto L_0x0433
            java.lang.reflect.Type r0 = yg.g0.d(r6, r0)
            r8.f(r0, r14)
            yg.x$k r0 = new yg.x$k
            ah.u r4 = (ah.u) r4
            boolean r1 = r4.encoded()
            r0.<init>(r9, r5, r1)
            goto L_0x060a
        L_0x0433:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@QueryMap keys must be of type String: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0449:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r7, r0)
            throw r0
        L_0x0451:
            r0 = 0
            java.lang.String r1 = "@QueryMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x045b:
            boolean r6 = r4 instanceof ah.i
            if (r6 == 0) goto L_0x04d9
            r11.c(r5, r13)
            ah.i r4 = (ah.i) r4
            java.lang.String r1 = r4.value()
            java.lang.Class r3 = yg.g0.e(r13)
            boolean r4 = r12.isAssignableFrom(r3)
            if (r4 == 0) goto L_0x04b1
            boolean r4 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x048c
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r0 = yg.g0.d(r3, r0)
            r8.f(r0, r14)
            yg.x$d r0 = new yg.x$d
            r0.<init>(r1)
            yg.v r1 = new yg.v
            r1.<init>(r0)
            goto L_0x04cc
        L_0x048c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r3.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x04b1:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x04cf
            java.lang.Class r0 = r3.getComponentType()
            java.lang.Class r0 = yg.a0.a.a(r0)
            r8.f(r0, r14)
            yg.x$d r0 = new yg.x$d
            r0.<init>(r1)
            yg.w r1 = new yg.w
            r1.<init>(r0)
        L_0x04cc:
            r0 = r1
            goto L_0x060a
        L_0x04cf:
            r8.f(r13, r14)
            yg.x$d r0 = new yg.x$d
            r0.<init>(r1)
            goto L_0x060a
        L_0x04d9:
            boolean r6 = r4 instanceof ah.j
            if (r6 == 0) goto L_0x053d
            java.lang.Class<jg.q> r0 = jg.q.class
            if (r13 != r0) goto L_0x04e8
            yg.x$f r0 = new yg.x$f
            r0.<init>(r5, r9)
            goto L_0x060a
        L_0x04e8:
            r11.c(r5, r13)
            java.lang.Class r0 = yg.g0.e(r13)
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x0533
            java.lang.reflect.Type r0 = yg.g0.f(r13, r0)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x052b
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r3 = yg.g0.d(r3, r0)
            if (r1 != r3) goto L_0x0515
            r1 = 1
            java.lang.reflect.Type r0 = yg.g0.d(r1, r0)
            r8.f(r0, r14)
            yg.x$e r0 = new yg.x$e
            r0.<init>(r9, r5)
            goto L_0x060a
        L_0x0515:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@HeaderMap keys must be of type String: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x052b:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r7, r0)
            throw r0
        L_0x0533:
            r0 = 0
            java.lang.String r1 = "@HeaderMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x053d:
            boolean r6 = r4 instanceof ah.c
            if (r6 == 0) goto L_0x05cf
            r11.c(r5, r13)
            boolean r1 = r15.f17437p
            if (r1 == 0) goto L_0x05c5
            ah.c r4 = (ah.c) r4
            java.lang.String r1 = r4.value()
            boolean r3 = r4.encoded()
            r4 = 1
            r15.f17428f = r4
            java.lang.Class r4 = yg.g0.e(r13)
            boolean r6 = r12.isAssignableFrom(r4)
            if (r6 == 0) goto L_0x059f
            boolean r6 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x057a
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r4 = 0
            java.lang.reflect.Type r0 = yg.g0.d(r4, r0)
            r8.f(r0, r14)
            yg.x$b r0 = new yg.x$b
            r0.<init>(r1, r3)
            yg.v r1 = new yg.v
            r1.<init>(r0)
            goto L_0x04cc
        L_0x057a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r4.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x059f:
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x05bc
            java.lang.Class r0 = r4.getComponentType()
            java.lang.Class r0 = yg.a0.a.a(r0)
            r8.f(r0, r14)
            yg.x$b r0 = new yg.x$b
            r0.<init>(r1, r3)
            yg.w r1 = new yg.w
            r1.<init>(r0)
            goto L_0x04cc
        L_0x05bc:
            r8.f(r13, r14)
            yg.x$b r0 = new yg.x$b
            r0.<init>(r1, r3)
            goto L_0x060a
        L_0x05c5:
            java.lang.String r0 = "@Field parameters can only be used with form encoding."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x05cf:
            boolean r6 = r4 instanceof ah.d
            if (r6 == 0) goto L_0x063f
            r11.c(r5, r13)
            boolean r0 = r15.f17437p
            if (r0 == 0) goto L_0x0635
            java.lang.Class r0 = yg.g0.e(r13)
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x062b
            java.lang.reflect.Type r0 = yg.g0.f(r13, r0)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0623
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r3 = yg.g0.d(r3, r0)
            if (r1 != r3) goto L_0x060d
            r1 = 1
            java.lang.reflect.Type r0 = yg.g0.d(r1, r0)
            r8.f(r0, r14)
            r15.f17428f = r1
            yg.x$c r0 = new yg.x$c
            ah.d r4 = (ah.d) r4
            boolean r1 = r4.encoded()
            r0.<init>(r9, r5, r1)
        L_0x060a:
            r1 = r0
            goto L_0x06de
        L_0x060d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@FieldMap keys must be of type String: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0623:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r7, r0)
            throw r0
        L_0x062b:
            r0 = 0
            java.lang.String r1 = "@FieldMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0635:
            r0 = 0
            java.lang.String r1 = "@FieldMap parameters can only be used with form encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x063f:
            boolean r6 = r4 instanceof ah.q
            r25 = r7
            java.lang.annotation.Annotation[] r7 = r15.f17425c
            r26 = r1
            java.lang.Class<jg.u$c> r1 = jg.u.c.class
            if (r6 == 0) goto L_0x07b7
            r11.c(r5, r13)
            boolean r3 = r15.f17438q
            if (r3 == 0) goto L_0x07ad
            ah.q r4 = (ah.q) r4
            r3 = 1
            r15.f17429g = r3
            java.lang.String r3 = r4.value()
            java.lang.Class r6 = yg.g0.e(r13)
            boolean r25 = r3.isEmpty()
            if (r25 == 0) goto L_0x06e8
            boolean r3 = r12.isAssignableFrom(r6)
            yg.x$m r4 = yg.x.m.f17553a
            java.lang.String r7 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r3 == 0) goto L_0x06b8
            boolean r3 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0693
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r0 = yg.g0.d(r3, r0)
            java.lang.Class r0 = yg.g0.e(r0)
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x068c
            yg.v r0 = new yg.v
            r0.<init>(r4)
            goto L_0x060a
        L_0x068c:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r7, r0)
            throw r0
        L_0x0693:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r6.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x06b8:
            r0 = 0
            boolean r3 = r6.isArray()
            if (r3 == 0) goto L_0x06d7
            java.lang.Class r3 = r6.getComponentType()
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L_0x06d0
            yg.w r0 = new yg.w
            r0.<init>(r4)
            goto L_0x060a
        L_0x06d0:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r7, r0)
            throw r0
        L_0x06d7:
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x06e1
            r1 = r4
        L_0x06de:
            r0 = r2
            goto L_0x08e1
        L_0x06e1:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r7, r0)
            throw r0
        L_0x06e8:
            r11 = 0
            r15 = 4
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r25 = "Content-Disposition"
            r15[r11] = r25
            java.lang.String r11 = "form-data; name=\""
            r27 = r2
            java.lang.String r2 = "\""
            java.lang.String r2 = b2.c.a(r11, r3, r2)
            r3 = 1
            r15[r3] = r2
            java.lang.String r2 = "Content-Transfer-Encoding"
            r3 = 2
            r15[r3] = r2
            r2 = 3
            java.lang.String r3 = r4.encoding()
            r15[r2] = r3
            jg.q r2 = jg.q.b.c(r15)
            boolean r3 = r12.isAssignableFrom(r6)
            java.lang.String r4 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r3 == 0) goto L_0x0766
            boolean r3 = r13 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0741
            r0 = r13
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r3 = 0
            java.lang.reflect.Type r0 = yg.g0.d(r3, r0)
            java.lang.Class r6 = yg.g0.e(r0)
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 != 0) goto L_0x073a
            yg.f r0 = r8.d(r0, r14, r7)
            yg.x$g r1 = new yg.x$g
            r1.<init>(r9, r5, r2, r0)
            yg.v r0 = new yg.v
            r0.<init>(r1)
            goto L_0x0788
        L_0x073a:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r4, r0)
            throw r0
        L_0x0741:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getSimpleName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r6.getSimpleName()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0766:
            boolean r0 = r6.isArray()
            if (r0 == 0) goto L_0x0795
            java.lang.Class r0 = r6.getComponentType()
            java.lang.Class r0 = yg.a0.a.a(r0)
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto L_0x078d
            yg.f r0 = r8.d(r0, r14, r7)
            yg.x$g r1 = new yg.x$g
            r1.<init>(r9, r5, r2, r0)
            yg.w r0 = new yg.w
            r0.<init>(r1)
        L_0x0788:
            r1 = r0
        L_0x0789:
            r0 = r27
            goto L_0x08df
        L_0x078d:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r4, r0)
            throw r0
        L_0x0795:
            r0 = 0
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 != 0) goto L_0x07a6
            yg.f r0 = r8.d(r13, r14, r7)
            yg.x$g r1 = new yg.x$g
            r1.<init>(r9, r5, r2, r0)
            goto L_0x0789
        L_0x07a6:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r4, r0)
            throw r0
        L_0x07ad:
            r0 = 0
            java.lang.String r1 = "@Part parameters can only be used with multipart encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x07b7:
            r27 = r2
            boolean r0 = r4 instanceof ah.r
            if (r0 == 0) goto L_0x0843
            r0 = r27
            r0.c(r5, r13)
            boolean r2 = r0.f17438q
            if (r2 == 0) goto L_0x0839
            r2 = 1
            r0.f17429g = r2
            java.lang.Class r6 = yg.g0.e(r13)
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x082f
            java.lang.reflect.Type r3 = yg.g0.f(r13, r6)
            boolean r6 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0825
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r6 = 0
            java.lang.reflect.Type r6 = yg.g0.d(r6, r3)
            r10 = r26
            if (r10 != r6) goto L_0x080f
            java.lang.reflect.Type r2 = yg.g0.d(r2, r3)
            java.lang.Class r3 = yg.g0.e(r2)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L_0x0805
            yg.f r1 = r8.d(r2, r14, r7)
            ah.r r4 = (ah.r) r4
            yg.x$h r2 = new yg.x$h
            java.lang.String r3 = r4.encoding()
            r2.<init>(r9, r5, r1, r3)
            goto L_0x08dc
        L_0x0805:
            java.lang.String r0 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x080f:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "@PartMap keys must be of type String: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0825:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r25
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x082f:
            r0 = 0
            java.lang.String r1 = "@PartMap parameter type must be Map."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0839:
            r0 = 0
            java.lang.String r1 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0843:
            r0 = r27
            boolean r1 = r4 instanceof ah.a
            if (r1 == 0) goto L_0x0889
            r0.c(r5, r13)
            boolean r1 = r0.f17437p
            if (r1 != 0) goto L_0x087f
            boolean r1 = r0.f17438q
            if (r1 != 0) goto L_0x087f
            boolean r1 = r0.f17430h
            if (r1 != 0) goto L_0x0875
            yg.f r1 = r8.d(r13, r14, r7)     // Catch:{ RuntimeException -> 0x0866 }
            r2 = 1
            r0.f17430h = r2
            yg.x$a r2 = new yg.x$a
            r2.<init>(r9, r5, r1)
            goto L_0x08dc
        L_0x0866:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r13
            java.lang.String r2 = "Unable to create @Body converter for %s"
            java.lang.IllegalArgumentException r0 = yg.g0.k(r9, r1, r5, r2, r0)
            throw r0
        L_0x0875:
            r0 = 0
            java.lang.String r1 = "Multiple @Body method annotations found."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x087f:
            r0 = 0
            java.lang.String r1 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r1, r0)
            throw r0
        L_0x0889:
            boolean r1 = r4 instanceof ah.x
            if (r1 == 0) goto L_0x08de
            r0.c(r5, r13)
            java.lang.Class r1 = yg.g0.e(r13)
            int r2 = r5 + -1
        L_0x0896:
            if (r2 < 0) goto L_0x08d7
            yg.x<?>[] r3 = r0.f17443v
            r3 = r3[r2]
            boolean r4 = r3 instanceof yg.x.o
            if (r4 == 0) goto L_0x08d4
            yg.x$o r3 = (yg.x.o) r3
            java.lang.Class<T> r3 = r3.f17556a
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x08ab
            goto L_0x08d4
        L_0x08ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "@Tag type "
            r0.<init>(r3)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " is duplicate of parameter #"
            r0.append(r1)
            int r2 = r2 + 1
            r0.append(r2)
            java.lang.String r1 = " and would always overwrite its value."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x08d4:
            int r2 = r2 + -1
            goto L_0x0896
        L_0x08d7:
            yg.x$o r2 = new yg.x$o
            r2.<init>(r1)
        L_0x08dc:
            r1 = r2
            goto L_0x08df
        L_0x08de:
            r1 = 0
        L_0x08df:
            r11 = r0
            r15 = r11
        L_0x08e1:
            if (r1 != 0) goto L_0x08e4
            goto L_0x08e8
        L_0x08e4:
            if (r17 != 0) goto L_0x08fd
            r17 = r1
        L_0x08e8:
            int r3 = r24 + 1
            r1 = r29
            r2 = r0
            r4 = r18
            r6 = r19
            r10 = r20
            r8 = r21
            r12 = r22
            r7 = r23
            r0 = r28
            goto L_0x0190
        L_0x08fd:
            java.lang.String r0 = "Multiple Retrofit annotations found, only one allowed."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0907:
            r0 = r2
            r18 = r4
            r19 = r6
            r23 = r7
            r21 = r8
            r22 = r12
            r1 = r11
            r11 = r15
            goto L_0x0925
        L_0x0915:
            r0 = r2
            r16 = r3
            r18 = r4
            r19 = r6
            r23 = r7
            r21 = r8
            r22 = r12
            r17 = 0
            r1 = r11
        L_0x0925:
            if (r17 != 0) goto L_0x0941
            if (r23 == 0) goto L_0x0937
            java.lang.Class r2 = yg.g0.e(r13)     // Catch:{ NoClassDefFoundError -> 0x0937 }
            java.lang.Class<jf.d> r3 = jf.d.class
            if (r2 != r3) goto L_0x0937
            r2 = 1
            r11.f17444w = r2     // Catch:{ NoClassDefFoundError -> 0x0937 }
            r17 = 0
            goto L_0x0941
        L_0x0937:
            java.lang.String r0 = "No Retrofit annotation found."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = yg.g0.j(r9, r5, r0, r1)
            throw r0
        L_0x0941:
            r22[r5] = r17
            int r5 = r5 + 1
            r7 = 0
            r10 = 1
            r2 = r0
            r11 = r1
            r3 = r16
            r4 = r18
            r6 = r19
            r8 = r21
            r0 = r28
            r1 = r29
            goto L_0x0177
        L_0x0957:
            r21 = r8
            java.lang.String r0 = r11.f17439r
            if (r0 != 0) goto L_0x0972
            boolean r0 = r11.m
            if (r0 == 0) goto L_0x0962
            goto L_0x0972
        L_0x0962:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r11.f17435n
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Missing either @%s URL or @Url parameter."
            r2 = 0
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r2, r1, r0)
            throw r0
        L_0x0972:
            boolean r0 = r11.f17437p
            if (r0 != 0) goto L_0x098e
            boolean r1 = r11.f17438q
            if (r1 != 0) goto L_0x098e
            boolean r1 = r11.f17436o
            if (r1 != 0) goto L_0x098e
            boolean r1 = r11.f17430h
            if (r1 != 0) goto L_0x0983
            goto L_0x098e
        L_0x0983:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Non-body HTTP method cannot contain @Body."
            r2 = 0
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r2, r1, r0)
            throw r0
        L_0x098e:
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x09a0
            boolean r0 = r11.f17428f
            if (r0 == 0) goto L_0x0997
            goto L_0x09a0
        L_0x0997:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Form-encoded method must contain at least one @Field."
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r2, r1, r0)
            throw r0
        L_0x09a0:
            boolean r0 = r11.f17438q
            if (r0 == 0) goto L_0x09b2
            boolean r0 = r11.f17429g
            if (r0 == 0) goto L_0x09a9
            goto L_0x09b2
        L_0x09a9:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Multipart method must contain at least one @Part."
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r2, r1, r0)
            throw r0
        L_0x09b2:
            yg.a0 r0 = new yg.a0
            r0.<init>(r11)
            java.lang.reflect.Type r1 = r29.getGenericReturnType()
            boolean r2 = yg.g0.g(r1)
            if (r2 != 0) goto L_0x0adb
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x0ace
            java.lang.annotation.Annotation[] r1 = r29.getAnnotations()
            boolean r2 = r0.f17420k
            java.lang.Class<yg.b0> r3 = yg.b0.class
            if (r2 == 0) goto L_0x0a24
            java.lang.reflect.Type[] r4 = r29.getGenericParameterTypes()
            int r5 = r4.length
            int r5 = r5 + -1
            r4 = r4[r5]
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r5 = 0
            r4 = r4[r5]
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L_0x09ed
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            r4 = r4[r5]
        L_0x09ed:
            java.lang.Class r6 = yg.g0.e(r4)
            if (r6 != r3) goto L_0x09ff
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x09ff
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = yg.g0.d(r5, r4)
            r6 = 1
            goto L_0x0a00
        L_0x09ff:
            r6 = r5
        L_0x0a00:
            yg.g0$b r7 = new yg.g0$b
            r8 = 1
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r8]
            r9[r5] = r4
            java.lang.Class<yg.b> r4 = yg.b.class
            r10 = 0
            r7.<init>(r10, r4, r9)
            java.lang.Class<yg.e0> r4 = yg.e0.class
            boolean r4 = yg.g0.h(r1, r4)
            if (r4 == 0) goto L_0x0a16
            goto L_0x0a29
        L_0x0a16:
            int r4 = r1.length
            int r4 = r4 + r8
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            yg.f0 r9 = yg.f0.f17464a
            r4[r5] = r9
            int r9 = r1.length
            java.lang.System.arraycopy(r1, r5, r4, r8, r9)
            r1 = r4
            goto L_0x0a29
        L_0x0a24:
            java.lang.reflect.Type r7 = r29.getGenericReturnType()
            r6 = 0
        L_0x0a29:
            r4 = r28
            yg.c r1 = r4.a(r7, r1)     // Catch:{ RuntimeException -> 0x0abd }
            java.lang.reflect.Type r5 = r1.b()
            java.lang.Class<jg.c0> r7 = jg.c0.class
            if (r5 == r7) goto L_0x0a97
            if (r5 == r3) goto L_0x0a8a
            java.lang.String r3 = r0.f17412c
            r7 = r21
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0a59
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0a4c
            goto L_0x0a59
        L_0x0a4c:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r2 = 0
            r3 = r29
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r2, r1, r0)
            throw r0
        L_0x0a59:
            r3 = r29
            java.lang.annotation.Annotation[] r7 = r29.getAnnotations()
            yg.f r3 = r4.e(r5, r7)     // Catch:{ RuntimeException -> 0x0a7b }
            jg.d$a r4 = r4.f17449b
            if (r2 != 0) goto L_0x0a6d
            yg.k$a r2 = new yg.k$a
            r2.<init>(r0, r4, r3, r1)
            goto L_0x0a7a
        L_0x0a6d:
            if (r6 == 0) goto L_0x0a75
            yg.k$c r2 = new yg.k$c
            r2.<init>(r0, r4, r3, r1)
            goto L_0x0a7a
        L_0x0a75:
            yg.k$b r2 = new yg.k$b
            r2.<init>(r0, r4, r3, r1)
        L_0x0a7a:
            return r2
        L_0x0a7b:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r1, r2, r0)
            throw r0
        L_0x0a8a:
            r3 = r29
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            r2 = 0
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r2, r1, r0)
            throw r0
        L_0x0a97:
            r3 = r29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "'"
            r0.<init>(r1)
            java.lang.Class r1 = yg.g0.e(r5)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r2, r0, r1)
            throw r0
        L_0x0abd:
            r0 = move-exception
            r3 = r29
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r1, r0, r2)
            throw r0
        L_0x0ace:
            r3 = r29
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Service methods cannot return void."
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r1, r2, r0)
            throw r0
        L_0x0adb:
            r3 = r29
            r0 = 0
            r2 = 0
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.IllegalArgumentException r0 = yg.g0.i(r3, r2, r0, r4)
            throw r0
        L_0x0aeb:
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.IllegalArgumentException r0 = yg.g0.i(r9, r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.d0.b(yg.c0, java.lang.reflect.Method):yg.k");
    }

    public abstract T a(Object[] objArr);
}
