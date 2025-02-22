package yg;

import androidx.appcompat.widget.a1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f17467a = new Type[0];

    public static final class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        public final Type f17468a;

        public a(Type type) {
            this.f17468a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && g0.b(this, (GenericArrayType) obj);
        }

        public final Type getGenericComponentType() {
            return this.f17468a;
        }

        public final int hashCode() {
            return this.f17468a.hashCode();
        }

        public final String toString() {
            return g0.n(this.f17468a) + "[]";
        }
    }

    public static final class b implements ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        public final Type f17469a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f17470b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f17471c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                g0.a(type3);
            }
            this.f17469a = type;
            this.f17470b = type2;
            this.f17471c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && g0.b(this, (ParameterizedType) obj);
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f17471c.clone();
        }

        public final Type getOwnerType() {
            return this.f17469a;
        }

        public final Type getRawType() {
            return this.f17470b;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.f17471c) ^ this.f17470b.hashCode();
            Type type = this.f17469a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f17471c;
            int length = typeArr.length;
            Type type = this.f17470b;
            if (length == 0) {
                return g0.n(type);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(g0.n(type));
            sb2.append("<");
            sb2.append(g0.n(typeArr[0]));
            for (int i8 = 1; i8 < typeArr.length; i8++) {
                sb2.append(", ");
                sb2.append(g0.n(typeArr[i8]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final class c implements WildcardType {

        /* renamed from: a  reason: collision with root package name */
        public final Type f17472a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f17473b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                g0.a(type);
                Class<Object> cls = Object.class;
                if (typeArr[0] == cls) {
                    this.f17473b = typeArr2[0];
                    this.f17472a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                g0.a(type2);
                this.f17473b = null;
                this.f17472a = typeArr[0];
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && g0.b(this, (WildcardType) obj);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f17473b;
            if (type == null) {
                return g0.f17467a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f17472a};
        }

        public final int hashCode() {
            Type type = this.f17473b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f17472a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f17473b;
            if (type != null) {
                return "? super " + g0.n(type);
            }
            Class<Object> cls = Object.class;
            Type type2 = this.f17472a;
            if (type2 == cls) {
                return "?";
            }
            return "? extends " + g0.n(type2);
        }
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean b(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type c(Type type, Class<?> cls, Class<?> cls2) {
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
                    return c(cls.getGenericInterfaces()[i8], interfaces[i8], cls2);
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
                    return c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type d(int i8, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i8 < 0 || i8 >= actualTypeArguments.length) {
            StringBuilder b10 = a1.b("Index ", i8, " not in range [0,");
            b10.append(actualTypeArguments.length);
            b10.append(") for ");
            b10.append(parameterizedType);
            throw new IllegalArgumentException(b10.toString());
        }
        Type type = actualTypeArguments[i8];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static Class<?> e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type f(Type type, Class cls) {
        Class<Map> cls2 = Map.class;
        if (cls2.isAssignableFrom(cls)) {
            return l(type, cls, c(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type g10 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(g10)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static boolean h(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException i(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder b10 = d.a.b(String.format(str, objArr), "\n    for method ");
        b10.append(method.getDeclaringClass().getSimpleName());
        b10.append(".");
        b10.append(method.getName());
        return new IllegalArgumentException(b10.toString(), exc);
    }

    public static IllegalArgumentException j(Method method, int i8, String str, Object... objArr) {
        StringBuilder b10 = d.a.b(str, " (parameter #");
        b10.append(i8 + 1);
        b10.append(")");
        return i(method, (Exception) null, b10.toString(), objArr);
    }

    public static IllegalArgumentException k(Method method, Exception exc, int i8, String str, Object... objArr) {
        StringBuilder b10 = d.a.b(str, " (parameter #");
        b10.append(i8 + 1);
        b10.append(")");
        return i(method, exc, b10.toString(), objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[LOOP:0: B:0:0x0000->B:21:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type l(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            goto L_0x003f
        L_0x0016:
            java.lang.reflect.Type r2 = c(r8, r9, r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003f
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0022:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0039
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0036
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x0040
        L_0x0036:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0039:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003f:
            r0 = r10
        L_0x0040:
            if (r0 != r10) goto L_0x0043
            return r0
        L_0x0043:
            r10 = r0
            goto L_0x0000
        L_0x0045:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0063
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0063
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = l(r8, r9, r10)
            if (r10 != r8) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            yg.g0$a r0 = new yg.g0$a
            r0.<init>(r8)
        L_0x0062:
            return r0
        L_0x0063:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x007a
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = l(r8, r9, r0)
            if (r0 != r8) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            yg.g0$a r10 = new yg.g0$a
            r10.<init>(r8)
        L_0x0079:
            return r10
        L_0x007a:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00bb
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = l(r8, r9, r0)
            if (r3 == r0) goto L_0x008d
            r0 = r2
            goto L_0x008e
        L_0x008d:
            r0 = r1
        L_0x008e:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0093:
            if (r1 >= r5) goto L_0x00ae
            r6 = r4[r1]
            java.lang.reflect.Type r6 = l(r8, r9, r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00ab
            if (r0 != 0) goto L_0x00a9
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r2
        L_0x00a9:
            r4[r1] = r6
        L_0x00ab:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00ae:
            if (r0 == 0) goto L_0x00ba
            yg.g0$b r8 = new yg.g0$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00ba:
            return r10
        L_0x00bb:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00ff
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e6
            r3 = r0[r1]
            java.lang.reflect.Type r8 = l(r8, r9, r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x00ff
            yg.g0$c r9 = new yg.g0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e6:
            int r0 = r3.length
            if (r0 != r2) goto L_0x00ff
            r0 = r3[r1]
            java.lang.reflect.Type r8 = l(r8, r9, r0)
            r9 = r3[r1]
            if (r8 == r9) goto L_0x00ff
            yg.g0$c r9 = new yg.g0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = f17467a
            r9.<init>(r10, r8)
            return r9
        L_0x00ff:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.g0.l(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void m(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String n(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
