package cb;

import ab.k;
import ab.o;
import ab.w;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, k<?>> f3907a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3908b;

    /* renamed from: c  reason: collision with root package name */
    public final List<w> f3909c;

    public class a implements s<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f3910a;

        public a(k kVar, Type type) {
            this.f3910a = kVar;
        }

        public final T g() {
            return this.f3910a.a();
        }
    }

    public class b implements s<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f3911a;

        public b(k kVar, Type type) {
            this.f3911a = kVar;
        }

        public final T g() {
            return this.f3911a.a();
        }
    }

    public class c implements s<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3912a;

        public c(String str) {
            this.f3912a = str;
        }

        public final T g() {
            throw new o(this.f3912a);
        }
    }

    public class d implements s<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3913a;

        public d(String str) {
            this.f3913a = str;
        }

        public final T g() {
            throw new o(this.f3913a);
        }
    }

    public h(List list, Map map, boolean z10) {
        this.f3907a = map;
        this.f3908b = z10;
        this.f3909c = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> cb.s<T> a(gb.a<T> r13) {
        /*
            r12 = this;
            java.lang.reflect.Type r0 = r13.f8929b
            java.util.Map<java.lang.reflect.Type, ab.k<?>> r1 = r12.f3907a
            java.lang.Object r2 = r1.get(r0)
            ab.k r2 = (ab.k) r2
            if (r2 == 0) goto L_0x0012
            cb.h$a r13 = new cb.h$a
            r13.<init>(r2, r0)
            return r13
        L_0x0012:
            java.lang.Class<? super T> r13 = r13.f8928a
            java.lang.Object r1 = r1.get(r13)
            ab.k r1 = (ab.k) r1
            if (r1 == 0) goto L_0x0022
            cb.h$b r13 = new cb.h$b
            r13.<init>(r1, r0)
            return r13
        L_0x0022:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r13)
            r2 = 0
            if (r1 == 0) goto L_0x0031
            cb.j r1 = new cb.j
            r1.<init>(r0)
            goto L_0x003c
        L_0x0031:
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r13 != r1) goto L_0x003b
            cb.k r1 = new cb.k
            r1.<init>(r0)
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 == 0) goto L_0x003f
            return r1
        L_0x003f:
            java.util.List<ab.w> r1 = r12.f3909c
            int r1 = cb.t.a(r13, r1)
            int r3 = r13.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isAbstract(r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0053
            goto L_0x0107
        L_0x0053:
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0107 }
            java.lang.reflect.Constructor r3 = r13.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x0107 }
            if (r1 == r4) goto L_0x0073
            cb.t$a r6 = cb.t.a.f3949a
            boolean r6 = r6.a(r3, r2)
            if (r6 == 0) goto L_0x0071
            r6 = 4
            if (r1 != r6) goto L_0x0073
            int r6 = r3.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isPublic(r6)
            if (r6 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r6 = r5
            goto L_0x0074
        L_0x0073:
            r6 = r4
        L_0x0074:
            if (r6 != 0) goto L_0x0090
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to invoke no-args constructor of "
            r3.<init>(r6)
            r3.append(r13)
            java.lang.String r6 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            cb.l r6 = new cb.l
            r6.<init>(r3)
            goto L_0x0108
        L_0x0090:
            if (r1 != r4) goto L_0x0101
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0097 }
            r6 = r2
            goto L_0x00f8
        L_0x0097:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed making constructor '"
            r7.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.Class r9 = r3.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            r8.<init>(r9)
            r9 = 35
            r8.append(r9)
            java.lang.Class r9 = r3.getDeclaringClass()
            java.lang.String r9 = r9.getSimpleName()
            r8.append(r9)
            r9 = 40
            r8.append(r9)
            java.lang.Class[] r9 = r3.getParameterTypes()
            r10 = r5
        L_0x00c6:
            int r11 = r9.length
            if (r10 >= r11) goto L_0x00dc
            if (r10 <= 0) goto L_0x00d0
            java.lang.String r11 = ", "
            r8.append(r11)
        L_0x00d0:
            r11 = r9[r10]
            java.lang.String r11 = r11.getSimpleName()
            r8.append(r11)
            int r10 = r10 + 1
            goto L_0x00c6
        L_0x00dc:
            r9 = 41
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.append(r8)
            java.lang.String r8 = "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x00f8:
            if (r6 == 0) goto L_0x0101
            cb.m r3 = new cb.m
            r3.<init>(r6)
            r6 = r3
            goto L_0x0108
        L_0x0101:
            cb.n r6 = new cb.n
            r6.<init>(r3)
            goto L_0x0108
        L_0x0107:
            r6 = r2
        L_0x0108:
            if (r6 == 0) goto L_0x010b
            return r6
        L_0x010b:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r13)
            if (r3 == 0) goto L_0x0145
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r13)
            if (r0 == 0) goto L_0x0122
            cb.b r2 = new cb.b
            r2.<init>()
            goto L_0x01a4
        L_0x0122:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r13)
            if (r0 == 0) goto L_0x0131
            androidx.lifecycle.s0 r2 = new androidx.lifecycle.s0
            r2.<init>()
            goto L_0x01a4
        L_0x0131:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r13)
            if (r0 == 0) goto L_0x013f
            cb.c r2 = new cb.c
            r2.<init>()
            goto L_0x01a4
        L_0x013f:
            ag.v1 r2 = new ag.v1
            r2.<init>()
            goto L_0x01a4
        L_0x0145:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r13)
            if (r3 == 0) goto L_0x01a4
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r2 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r2 = r2.isAssignableFrom(r13)
            if (r2 == 0) goto L_0x015b
            cb.d r2 = new cb.d
            r2.<init>()
            goto L_0x01a4
        L_0x015b:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r2 = java.util.concurrent.ConcurrentMap.class
            boolean r2 = r2.isAssignableFrom(r13)
            if (r2 == 0) goto L_0x0169
            cb.e r2 = new cb.e
            r2.<init>()
            goto L_0x01a4
        L_0x0169:
            java.lang.Class<java.util.SortedMap> r2 = java.util.SortedMap.class
            boolean r2 = r2.isAssignableFrom(r13)
            if (r2 == 0) goto L_0x0177
            ag.d r2 = new ag.d
            r2.<init>()
            goto L_0x01a4
        L_0x0177:
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x019f
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r5]
            r0.getClass()
            java.lang.reflect.Type r0 = cb.a.a(r0)
            java.lang.Class r2 = cb.a.f(r0)
            r0.hashCode()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x019f
            gc.b r2 = new gc.b
            r2.<init>()
            goto L_0x01a4
        L_0x019f:
            cb.f r2 = new cb.f
            r2.<init>()
        L_0x01a4:
            if (r2 == 0) goto L_0x01a7
            return r2
        L_0x01a7:
            java.lang.String r0 = androidx.fragment.app.z.g(r13)
            if (r0 == 0) goto L_0x01b3
            cb.h$c r13 = new cb.h$c
            r13.<init>(r0)
            return r13
        L_0x01b3:
            java.lang.String r0 = "Unable to create instance of "
            if (r1 != r4) goto L_0x01d8
            boolean r1 = r12.f3908b
            if (r1 == 0) goto L_0x01c1
            cb.g r0 = new cb.g
            r0.<init>(r13)
            goto L_0x01d7
        L_0x01c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r13 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            cb.i r0 = new cb.i
            r0.<init>(r13)
        L_0x01d7:
            return r0
        L_0x01d8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r13 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            cb.h$d r0 = new cb.h$d
            r0.<init>(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.h.a(gb.a):cb.s");
    }

    public final String toString() {
        return this.f3907a.toString();
    }
}
