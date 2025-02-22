package cb;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f3873a = new Type[0];

    /* renamed from: cb.a$a  reason: collision with other inner class name */
    public static final class C0061a implements GenericArrayType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f3874a;

        public C0061a(Type type) {
            this.f3874a = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.d(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f3874a;
        }

        public final int hashCode() {
            return this.f3874a.hashCode();
        }

        public final String toString() {
            return a.i(this.f3874a) + "[]";
        }
    }

    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f3875a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f3876b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f3877c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                b1.b.a(z10);
            }
            this.f3875a = type == null ? null : a.a(type);
            this.f3876b = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f3877c = typeArr2;
            int length = typeArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.f3877c[i8].getClass();
                a.b(this.f3877c[i8]);
                Type[] typeArr3 = this.f3877c;
                typeArr3[i8] = a.a(typeArr3[i8]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.d(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f3877c.clone();
        }

        public final Type getOwnerType() {
            return this.f3875a;
        }

        public final Type getRawType() {
            return this.f3876b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f3877c) ^ this.f3876b.hashCode();
            Type type = this.f3875a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f3877c;
            int length = typeArr.length;
            Type type = this.f3876b;
            if (length == 0) {
                return a.i(type);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(a.i(type));
            sb2.append("<");
            sb2.append(a.i(typeArr[0]));
            for (int i8 = 1; i8 < length; i8++) {
                sb2.append(", ");
                sb2.append(a.i(typeArr[i8]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final class c implements WildcardType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f3878a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f3879b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10 = true;
            b1.b.a(typeArr2.length <= 1);
            b1.b.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                a.b(typeArr2[0]);
                Class<Object> cls = Object.class;
                b1.b.a(typeArr[0] != cls ? false : z10);
                this.f3879b = a.a(typeArr2[0]);
                this.f3878a = cls;
                return;
            }
            typeArr[0].getClass();
            a.b(typeArr[0]);
            this.f3879b = null;
            this.f3878a = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.d(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f3879b;
            if (type == null) {
                return a.f3873a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f3878a};
        }

        public final int hashCode() {
            Type type = this.f3879b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3878a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f3879b;
            if (type != null) {
                return "? super " + a.i(type);
            }
            Class<Object> cls = Object.class;
            Type type2 = this.f3878a;
            if (type2 == cls) {
                return "?";
            }
            return "? extends " + a.i(type2);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0061a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0061a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void b(Type type) {
        b1.b.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static boolean c(Type type, Type type2) {
        return type == type2 || (type != null && type.equals(type2));
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i8 = 0; i8 < length; i8++) {
                Class<?> cls3 = interfaces[i8];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i8];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i8], interfaces[i8], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> f(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            b1.b.a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return f(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        b1.b.a(cls2.isAssignableFrom(cls));
        return h(type, cls, e(type, cls, cls2), new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: cb.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: cb.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013f A[EDGE_INSN: B:79:0x013f->B:74:0x013f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type h(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r11 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L_0x005e
            r2 = r11
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r12.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            if (r4 == 0) goto L_0x0019
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r4 != r9) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r11 = r4
        L_0x0018:
            return r11
        L_0x0019:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r2, r11)
            if (r1 != 0) goto L_0x0021
            r1 = r2
        L_0x0021:
            java.lang.reflect.GenericDeclaration r11 = r2.getGenericDeclaration()
            boolean r4 = r11 instanceof java.lang.Class
            if (r4 == 0) goto L_0x002c
            java.lang.Class r11 = (java.lang.Class) r11
            goto L_0x002d
        L_0x002c:
            r11 = r0
        L_0x002d:
            if (r11 != 0) goto L_0x0030
            goto L_0x0059
        L_0x0030:
            java.lang.reflect.Type r4 = e(r9, r10, r11)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0059
            java.lang.reflect.TypeVariable[] r11 = r11.getTypeParameters()
            int r5 = r11.length
        L_0x003d:
            if (r3 >= r5) goto L_0x0053
            r6 = r11[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0050
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r11 = r4.getActualTypeArguments()
            r11 = r11[r3]
            goto L_0x005a
        L_0x0050:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0053:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        L_0x0059:
            r11 = r2
        L_0x005a:
            if (r11 != r2) goto L_0x0002
            goto L_0x013f
        L_0x005e:
            boolean r0 = r11 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0082
            r0 = r11
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0082
            java.lang.Class r11 = r0.getComponentType()
            java.lang.reflect.Type r9 = h(r9, r10, r11, r12)
            boolean r10 = c(r11, r9)
            if (r10 == 0) goto L_0x007c
            r11 = r0
            goto L_0x013f
        L_0x007c:
            cb.a$a r10 = new cb.a$a
            r10.<init>(r9)
            goto L_0x009d
        L_0x0082:
            boolean r0 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x00a0
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r0 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = h(r9, r10, r0, r12)
            boolean r10 = c(r0, r9)
            if (r10 == 0) goto L_0x0098
            goto L_0x013f
        L_0x0098:
            cb.a$a r10 = new cb.a$a
            r10.<init>(r9)
        L_0x009d:
            r11 = r10
            goto L_0x013f
        L_0x00a0:
            boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00e4
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r0 = r11.getOwnerType()
            java.lang.reflect.Type r4 = h(r9, r10, r0, r12)
            boolean r0 = c(r4, r0)
            r0 = r0 ^ r2
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x00b9:
            if (r3 >= r6) goto L_0x00d8
            r7 = r5[r3]
            java.lang.reflect.Type r7 = h(r9, r10, r7, r12)
            r8 = r5[r3]
            boolean r8 = c(r7, r8)
            if (r8 != 0) goto L_0x00d5
            if (r0 != 0) goto L_0x00d3
            java.lang.Object r0 = r5.clone()
            r5 = r0
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r0 = r2
        L_0x00d3:
            r5[r3] = r7
        L_0x00d5:
            int r3 = r3 + 1
            goto L_0x00b9
        L_0x00d8:
            if (r0 == 0) goto L_0x013f
            java.lang.reflect.Type r9 = r11.getRawType()
            cb.a$b r10 = new cb.a$b
            r10.<init>(r4, r9, r5)
            goto L_0x009d
        L_0x00e4:
            boolean r0 = r11 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x013f
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r0 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L_0x011b
            r4 = r0[r3]
            java.lang.reflect.Type r9 = h(r9, r10, r4, r12)
            r10 = r0[r3]
            if (r9 == r10) goto L_0x013f
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x010a
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getLowerBounds()
            goto L_0x010f
        L_0x010a:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x010f:
            cb.a$c r11 = new cb.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r3] = r0
            r11.<init>(r10, r9)
            goto L_0x013f
        L_0x011b:
            int r0 = r4.length
            if (r0 != r2) goto L_0x013f
            r0 = r4[r3]
            java.lang.reflect.Type r9 = h(r9, r10, r0, r12)
            r10 = r4[r3]
            if (r9 == r10) goto L_0x013f
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0133
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getUpperBounds()
            goto L_0x0138
        L_0x0133:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x0138:
            cb.a$c r11 = new cb.a$c
            java.lang.reflect.Type[] r10 = f3873a
            r11.<init>(r9, r10)
        L_0x013f:
            if (r1 == 0) goto L_0x0144
            r12.put(r1, r11)
        L_0x0144:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.a.h(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
