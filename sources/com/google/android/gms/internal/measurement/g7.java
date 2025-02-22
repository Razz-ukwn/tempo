package com.google.android.gms.internal.measurement;

import androidx.fragment.app.q;
import com.google.android.gms.internal.measurement.c7;
import com.google.android.gms.internal.measurement.g7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class g7<MessageType extends g7<MessageType, BuilderType>, BuilderType extends c7<MessageType, BuilderType>> extends z5<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected e9 zzc = e9.f5259f;
    private int zzd = -1;

    public static g7 k(Class cls) {
        Map map = zza;
        g7 g7Var = (g7) map.get(cls);
        if (g7Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g7Var = (g7) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (g7Var == null) {
            g7Var = (g7) ((g7) n9.i(cls)).s(6);
            if (g7Var != null) {
                map.put(cls, g7Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return g7Var;
    }

    public static w7 l(k7 k7Var) {
        int size = k7Var.size();
        int i8 = size == 0 ? 10 : size + size;
        w7 w7Var = (w7) k7Var;
        if (i8 >= w7Var.f5572c) {
            return new w7(Arrays.copyOf(w7Var.f5571b, i8), w7Var.f5572c, true);
        }
        throw new IllegalArgumentException();
    }

    public static l7 m(l7 l7Var) {
        int size = l7Var.size();
        return l7Var.zzd(size == 0 ? 10 : size + size);
    }

    public static Object n(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static void p(Class cls, g7 g7Var) {
        g7Var.o();
        zza.put(cls, g7Var);
    }

    public final int a() {
        int i8;
        if (r()) {
            i8 = h((s8) null);
            if (i8 < 0) {
                throw new IllegalStateException(q.a("serialized size must be non-negative, was ", i8));
            }
        } else {
            i8 = this.zzd & Integer.MAX_VALUE;
            if (i8 == Integer.MAX_VALUE) {
                i8 = h((s8) null);
                if (i8 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i8;
                } else {
                    throw new IllegalStateException(q.a("serialized size must be non-negative, was ", i8));
                }
            }
        }
        return i8;
    }

    public final /* synthetic */ g7 b() {
        return (g7) s(6);
    }

    public final int c(s8 s8Var) {
        if (r()) {
            int h3 = h(s8Var);
            if (h3 >= 0) {
                return h3;
            }
            throw new IllegalStateException(q.a("serialized size must be non-negative, was ", h3));
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int h10 = h(s8Var);
        if (h10 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | h10;
            return h10;
        }
        throw new IllegalStateException(q.a("serialized size must be non-negative, was ", h10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p8.f5471c.a(getClass()).b(this, (g7) obj);
    }

    public final /* synthetic */ c7 f() {
        return (c7) s(5);
    }

    public final int h(s8 s8Var) {
        if (s8Var != null) {
            return s8Var.zza(this);
        }
        return p8.f5471c.a(getClass()).zza(this);
    }

    public final int hashCode() {
        if (r()) {
            return p8.f5471c.a(getClass()).zzb(this);
        }
        int i8 = this.zzb;
        if (i8 != 0) {
            return i8;
        }
        int zzb = p8.f5471c.a(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final c7 i() {
        return (c7) s(5);
    }

    public final c7 j() {
        c7 c7Var = (c7) s(5);
        if (!c7Var.f5178a.equals(this)) {
            if (!c7Var.f5179b.r()) {
                g7 g7Var = (g7) c7Var.f5178a.s(4);
                p8.f5471c.a(g7Var.getClass()).zzg(g7Var, c7Var.f5179b);
                c7Var.f5179b = g7Var;
            }
            g7 g7Var2 = c7Var.f5179b;
            p8.f5471c.a(g7Var2.getClass()).zzg(g7Var2, this);
        }
        return c7Var;
    }

    public final void o() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void q() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean r() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object s(int i8);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = j8.f5341a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        j8.c(this, sb2, 0);
        return sb2.toString();
    }
}
