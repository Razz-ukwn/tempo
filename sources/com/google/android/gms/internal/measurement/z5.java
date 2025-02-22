package com.google.android.gms.internal.measurement;

import b2.c;
import com.google.android.gms.internal.measurement.y5;
import com.google.android.gms.internal.measurement.z5;
import d.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public abstract class z5<MessageType extends z5<MessageType, BuilderType>, BuilderType extends y5<MessageType, BuilderType>> implements h8 {
    protected int zzb = 0;

    public static void d(Iterable iterable, l7 l7Var) {
        Charset charset = m7.f5399a;
        iterable.getClass();
        if (iterable instanceof s7) {
            List zzh = ((s7) iterable).zzh();
            s7 s7Var = (s7) l7Var;
            int size = l7Var.size();
            for (Object next : zzh) {
                if (next == null) {
                    String a10 = a.a("Element at index ", s7Var.size() - size, " is null.");
                    int size2 = s7Var.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            s7Var.remove(size2);
                        } else {
                            throw new NullPointerException(a10);
                        }
                    }
                } else if (next instanceof k6) {
                    s7Var.u((k6) next);
                } else {
                    s7Var.add((String) next);
                }
            }
        } else if (!(iterable instanceof o8)) {
            if ((l7Var instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) l7Var).ensureCapacity(((Collection) iterable).size() + l7Var.size());
            }
            int size3 = l7Var.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String a11 = a.a("Element at index ", l7Var.size() - size3, " is null.");
                    int size4 = l7Var.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            l7Var.remove(size4);
                        } else {
                            throw new NullPointerException(a11);
                        }
                    }
                } else {
                    l7Var.add(next2);
                }
            }
        } else {
            l7Var.addAll((Collection) iterable);
        }
    }

    public int c(s8 s8Var) {
        throw null;
    }

    public final byte[] e() {
        try {
            g7 g7Var = (g7) this;
            int a10 = g7Var.a();
            byte[] bArr = new byte[a10];
            Logger logger = o6.f5446d;
            m6 m6Var = new m6(bArr, a10);
            s8 a11 = p8.f5471c.a(g7Var.getClass());
            p6 p6Var = m6Var.f5448c;
            if (p6Var == null) {
                p6Var = new p6(m6Var);
            }
            a11.c(g7Var, p6Var);
            if (a10 - m6Var.D == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public final i6 g() {
        try {
            g7 g7Var = (g7) this;
            int a10 = g7Var.a();
            i6 i6Var = k6.f5359b;
            byte[] bArr = new byte[a10];
            Logger logger = o6.f5446d;
            m6 m6Var = new m6(bArr, a10);
            s8 a11 = p8.f5471c.a(g7Var.getClass());
            p6 p6Var = m6Var.f5448c;
            if (p6Var == null) {
                p6Var = new p6(m6Var);
            }
            a11.c(g7Var, p6Var);
            if (a10 - m6Var.D == 0) {
                return new i6(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }
}
