package q7;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jg.h;
import jg.i;
import kg.b;
import sf.j;

public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    public int f13278a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13279b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13280c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13281d;

    public /* synthetic */ q2(List list) {
        j.f(list, "connectionSpecs");
        this.f13281d = list;
    }

    public /* synthetic */ q2(s2 s2Var, int i8, boolean z10, boolean z11) {
        this.f13281d = s2Var;
        this.f13278a = i8;
        this.f13279b = z10;
        this.f13280c = z11;
    }

    public final i a(SSLSocket sSLSocket) {
        i iVar;
        boolean z10;
        String[] strArr;
        String[] strArr2;
        int i8 = this.f13278a;
        List list = (List) this.f13281d;
        int size = list.size();
        while (true) {
            if (i8 >= size) {
                iVar = null;
                break;
            }
            int i10 = i8 + 1;
            iVar = (i) list.get(i8);
            if (iVar.b(sSLSocket)) {
                this.f13278a = i10;
                break;
            }
            i8 = i10;
        }
        if (iVar != null) {
            int i11 = this.f13278a;
            int size2 = list.size();
            while (true) {
                if (i11 >= size2) {
                    z10 = false;
                    break;
                }
                int i12 = i11 + 1;
                if (((i) list.get(i11)).b(sSLSocket)) {
                    z10 = true;
                    break;
                }
                i11 = i12;
            }
            this.f13279b = z10;
            boolean z11 = this.f13280c;
            String[] strArr3 = iVar.f10113c;
            if (strArr3 != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                j.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                strArr = b.p(enabledCipherSuites, strArr3, h.f10091c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = iVar.f10114d;
            if (strArr4 != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                j.e(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = b.p(enabledProtocols, strArr4, p001if.b.f9664a);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            j.e(supportedCipherSuites, "supportedCipherSuites");
            h.a aVar = h.f10091c;
            byte[] bArr = b.f10474a;
            int length = supportedCipherSuites.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                if (aVar.compare(supportedCipherSuites[i13], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i13++;
            }
            if (z11 && i13 != -1) {
                j.e(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i13];
                j.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                j.e(copyOf, "copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            i.a aVar2 = new i.a(iVar);
            j.e(strArr, "cipherSuitesIntersection");
            aVar2.b((String[]) Arrays.copyOf(strArr, strArr.length));
            j.e(strArr2, "tlsVersionsIntersection");
            aVar2.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            i a10 = aVar2.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f10114d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f10113c);
            }
            return iVar;
        }
        StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f13280c);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        j.c(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        j.e(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final void b(String str) {
        ((s2) this.f13281d).w(this.f13278a, this.f13279b, this.f13280c, str, (Object) null, (Object) null, (Object) null);
    }

    public final void c(Object obj, String str) {
        ((s2) this.f13281d).w(this.f13278a, this.f13279b, this.f13280c, str, obj, (Object) null, (Object) null);
    }

    public final void d(Object obj, Object obj2, String str) {
        ((s2) this.f13281d).w(this.f13278a, this.f13279b, this.f13280c, str, obj, obj2, (Object) null);
    }

    public final void e(String str, Object obj, Object obj2, Object obj3) {
        ((s2) this.f13281d).w(this.f13278a, this.f13279b, this.f13280c, str, obj, obj2, obj3);
    }
}
