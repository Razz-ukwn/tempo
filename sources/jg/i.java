package jg;

import gf.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import jg.g0;
import kg.b;
import sf.j;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final i f10109e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f10110f = new i(false, false, (String[]) null, (String[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10111a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10112b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f10113c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f10114d;

    static {
        h hVar = h.f10105r;
        h hVar2 = h.f10106s;
        h hVar3 = h.f10107t;
        h hVar4 = h.f10100l;
        h hVar5 = h.f10101n;
        h hVar6 = h.m;
        h hVar7 = h.f10102o;
        h hVar8 = h.f10104q;
        h hVar9 = h.f10103p;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f10098j, h.f10099k, h.f10096h, h.f10097i, h.f10094f, h.f10095g, h.f10093e};
        a aVar = new a();
        aVar.c((h[]) Arrays.copyOf(hVarArr, 9));
        g0 g0Var = g0.f10085b;
        g0 g0Var2 = g0.f10086c;
        aVar.f(g0Var, g0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.c((h[]) Arrays.copyOf(hVarArr2, 16));
        aVar2.f(g0Var, g0Var2);
        aVar2.d();
        f10109e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((h[]) Arrays.copyOf(hVarArr2, 16));
        aVar3.f(g0Var, g0Var2, g0.f10087d, g0.f10088e);
        aVar3.d();
        aVar3.a();
    }

    public i(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f10111a = z10;
        this.f10112b = z11;
        this.f10113c = strArr;
        this.f10114d = strArr2;
    }

    public final List<h> a() {
        String[] strArr = this.f10113c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(h.f10090b.b(b10));
        }
        return q.O0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f10111a) {
            return false;
        }
        String[] strArr = this.f10114d;
        if (strArr != null && !b.j(strArr, sSLSocket.getEnabledProtocols(), p001if.b.f9664a)) {
            return false;
        }
        String[] strArr2 = this.f10113c;
        return strArr2 == null || b.j(strArr2, sSLSocket.getEnabledCipherSuites(), h.f10091c);
    }

    public final List<g0> c() {
        String[] strArr = this.f10114d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            arrayList.add(g0.a.a(a10));
        }
        return q.O0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z10 = iVar.f10111a;
        boolean z11 = this.f10111a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f10113c, iVar.f10113c) && Arrays.equals(this.f10114d, iVar.f10114d) && this.f10112b == iVar.f10112b);
    }

    public final int hashCode() {
        if (!this.f10111a) {
            return 17;
        }
        int i8 = 0;
        String[] strArr = this.f10113c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f10114d;
        if (strArr2 != null) {
            i8 = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i8) * 31) + (this.f10112b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f10111a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f10112b + ')';
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f10115a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f10116b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f10117c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10118d;

        public a() {
            this.f10115a = true;
        }

        public final i a() {
            return new i(this.f10115a, this.f10118d, this.f10116b, this.f10117c);
        }

        public final void b(String... strArr) {
            j.f(strArr, "cipherSuites");
            if (this.f10115a) {
                if (!(strArr.length == 0)) {
                    this.f10116b = (String[]) strArr.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void c(h... hVarArr) {
            j.f(hVarArr, "cipherSuites");
            if (this.f10115a) {
                ArrayList arrayList = new ArrayList(hVarArr.length);
                for (h hVar : hVarArr) {
                    arrayList.add(hVar.f10108a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    b((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void d() {
            if (this.f10115a) {
                this.f10118d = true;
                return;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final void e(String... strArr) {
            j.f(strArr, "tlsVersions");
            if (this.f10115a) {
                if (!(strArr.length == 0)) {
                    this.f10117c = (String[]) strArr.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final void f(g0... g0VarArr) {
            if (this.f10115a) {
                ArrayList arrayList = new ArrayList(g0VarArr.length);
                for (g0 g0Var : g0VarArr) {
                    arrayList.add(g0Var.f10089a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    e((String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(i iVar) {
            this.f10115a = iVar.f10111a;
            this.f10116b = iVar.f10113c;
            this.f10117c = iVar.f10114d;
            this.f10118d = iVar.f10112b;
        }
    }
}
