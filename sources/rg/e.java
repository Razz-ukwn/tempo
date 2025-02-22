package rg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jg.w;
import rg.h;
import sf.j;

public final class e extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Method f14262c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f14263d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f14264e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f14265f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f14266g;

    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f14267a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14268b;

        /* renamed from: c  reason: collision with root package name */
        public String f14269c;

        public a(ArrayList arrayList) {
            this.f14267a = arrayList;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            j.f(obj, "proxy");
            j.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (j.a(name, "supports") && j.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!j.a(name, "unsupported") || !j.a(Void.TYPE, returnType)) {
                boolean a10 = j.a(name, "protocols");
                List<String> list = this.f14267a;
                if (a10) {
                    if (objArr.length == 0) {
                        return list;
                    }
                }
                if ((j.a(name, "selectProtocol") || j.a(name, "select")) && j.a(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list2 = (List) obj2;
                            int size = list2.size();
                            if (size >= 0) {
                                int i8 = 0;
                                while (true) {
                                    int i10 = i8 + 1;
                                    Object obj3 = list2.get(i8);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (list.contains(str)) {
                                            this.f14269c = str;
                                            return str;
                                        } else if (i8 == size) {
                                            break;
                                        } else {
                                            i8 = i10;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = list.get(0);
                            this.f14269c = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!j.a(name, "protocolSelected") && !j.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.f14269c = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f14268b = true;
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f14262c = method;
        this.f14263d = method2;
        this.f14264e = method3;
        this.f14265f = cls;
        this.f14266g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.f14264e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List<? extends w> list) {
        j.f(list, "protocols");
        ArrayList a10 = h.a.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f14265f, this.f14266g}, new a(a10));
            this.f14262c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f14263d.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z10 = aVar.f14268b;
                if (!z10 && aVar.f14269c == null) {
                    h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                    return null;
                } else if (z10) {
                    return null;
                } else {
                    return aVar.f14269c;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
