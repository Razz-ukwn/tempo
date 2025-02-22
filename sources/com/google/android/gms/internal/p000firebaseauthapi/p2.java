package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.q;
import com.google.android.gms.internal.p000firebaseauthapi.m2;
import com.google.android.gms.internal.p000firebaseauthapi.p2;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p2  reason: invalid package */
public abstract class p2<MessageType extends p2<MessageType, BuilderType>, BuilderType extends m2<MessageType, BuilderType>> extends e1<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected l4 zzc = l4.f4703f;
    private int zzd = -1;

    public static Object d(Method method, Object obj, Object... objArr) {
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

    public static void g(Class cls, p2 p2Var) {
        p2Var.e();
        zzb.put(cls, p2Var);
    }

    public static void m(p2 p2Var) {
        if (!p2Var.j()) {
            throw new w2(new j4().getMessage());
        }
    }

    public static p2 p(Class cls) {
        Map map = zzb;
        p2 p2Var = (p2) map.get(cls);
        if (p2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                p2Var = (p2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (p2Var == null) {
            p2Var = (p2) ((p2) u4.i(cls)).n(6);
            if (p2Var != null) {
                map.put(cls, p2Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return p2Var;
    }

    public static p2 r(p2 p2Var, q1 q1Var, c2 c2Var) {
        r1 g10 = q1Var.g();
        p2 q10 = p2Var.q();
        try {
            z3 a10 = w3.f5030c.a(q10.getClass());
            u1 u1Var = g10.f4940b;
            if (u1Var == null) {
                u1Var = new u1(g10);
            }
            a10.d(q10, u1Var, c2Var);
            a10.zzf(q10);
            try {
                g10.z(0);
                m(q10);
                return q10;
            } catch (w2 e10) {
                throw e10;
            }
        } catch (w2 e11) {
            e = e11;
            if (e.f5029a) {
                e = new w2((IOException) e);
            }
            throw e;
        } catch (j4 e12) {
            throw new w2(e12.getMessage());
        } catch (IOException e13) {
            if (e13.getCause() instanceof w2) {
                throw ((w2) e13.getCause());
            }
            throw new w2(e13);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof w2) {
                throw ((w2) e14.getCause());
            }
            throw e14;
        }
    }

    public static p2 s(p2 p2Var, InputStream inputStream, c2 c2Var) {
        s1 s1Var = new s1(inputStream);
        p2 q10 = p2Var.q();
        try {
            z3 a10 = w3.f5030c.a(q10.getClass());
            u1 u1Var = s1Var.f4940b;
            if (u1Var == null) {
                u1Var = new u1(s1Var);
            }
            a10.d(q10, u1Var, c2Var);
            a10.zzf(q10);
            m(q10);
            return q10;
        } catch (w2 e10) {
            e = e10;
            if (e.f5029a) {
                e = new w2((IOException) e);
            }
            throw e;
        } catch (j4 e11) {
            throw new w2(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof w2) {
                throw ((w2) e12.getCause());
            }
            throw new w2(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof w2) {
                throw ((w2) e13.getCause());
            }
            throw e13;
        }
    }

    public final /* synthetic */ m2 b() {
        return (m2) n(5);
    }

    public final int c(z3 z3Var) {
        if (k()) {
            int l10 = l(z3Var);
            if (l10 >= 0) {
                return l10;
            }
            throw new IllegalStateException(q.a("serialized size must be non-negative, was ", l10));
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int l11 = l(z3Var);
        if (l11 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | l11;
            return l11;
        }
        throw new IllegalStateException(q.a("serialized size must be non-negative, was ", l11));
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return w3.f5030c.a(getClass()).b(this, (p2) obj);
    }

    public final /* synthetic */ p2 f() {
        return (p2) n(6);
    }

    public final void h() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (k()) {
            return w3.f5030c.a(getClass()).zzb(this);
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int zzb2 = w3.f5030c.a(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final void i(y1 y1Var) {
        z3 a10 = w3.f5030c.a(getClass());
        z1 z1Var = y1Var.f5092a;
        if (z1Var == null) {
            z1Var = new z1(y1Var);
        }
        a10.c(this, z1Var);
    }

    public final boolean j() {
        byte byteValue = ((Byte) n(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a10 = w3.f5030c.a(getClass()).a(this);
        n(2);
        return a10;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int l(z3 z3Var) {
        if (z3Var != null) {
            return z3Var.zza(this);
        }
        return w3.f5030c.a(getClass()).zza(this);
    }

    public abstract Object n(int i8);

    public final m2 o() {
        return (m2) n(5);
    }

    public final p2 q() {
        return (p2) n(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = q3.f4834a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        q3.c(this, sb2, 0);
        return sb2.toString();
    }

    public final int zzs() {
        int i8;
        if (k()) {
            i8 = l((z3) null);
            if (i8 < 0) {
                throw new IllegalStateException(q.a("serialized size must be non-negative, was ", i8));
            }
        } else {
            i8 = this.zzd & Integer.MAX_VALUE;
            if (i8 == Integer.MAX_VALUE) {
                i8 = l((z3) null);
                if (i8 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i8;
                } else {
                    throw new IllegalStateException(q.a("serialized size must be non-negative, was ", i8));
                }
            }
        }
        return i8;
    }
}
