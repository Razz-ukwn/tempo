package z1;

import android.util.Base64;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f17629a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17630b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17631c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f17632d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17633e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f17629a = str;
        str2.getClass();
        this.f17630b = str2;
        this.f17631c = str3;
        list.getClass();
        this.f17632d = list;
        this.f17633e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f17629a + ", mProviderPackage: " + this.f17630b + ", mQuery: " + this.f17631c + ", mCertificates:");
        int i8 = 0;
        while (true) {
            List<List<byte[]>> list = this.f17632d;
            if (i8 < list.size()) {
                sb2.append(" [");
                List list2 = list.get(i8);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb2.append(" \"");
                    sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb2.append("\"");
                }
                sb2.append(" ]");
                i8++;
            } else {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
        }
    }
}
