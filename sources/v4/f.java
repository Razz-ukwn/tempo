package v4;

import ag.b1;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

public final class f implements p4.f {

    /* renamed from: b  reason: collision with root package name */
    public final g f16165b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f16166c;

    /* renamed from: d  reason: collision with root package name */
    public final String f16167d;

    /* renamed from: e  reason: collision with root package name */
    public String f16168e;

    /* renamed from: f  reason: collision with root package name */
    public URL f16169f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f16170g;

    /* renamed from: h  reason: collision with root package name */
    public int f16171h;

    public f(URL url) {
        i iVar = g.f16172a;
        b1.b(url);
        this.f16166c = url;
        this.f16167d = null;
        b1.b(iVar);
        this.f16165b = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        if (this.f16170g == null) {
            this.f16170g = c().getBytes(p4.f.f12458a);
        }
        messageDigest.update(this.f16170g);
    }

    public final String c() {
        String str = this.f16167d;
        if (str != null) {
            return str;
        }
        URL url = this.f16166c;
        b1.b(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f16169f == null) {
            if (TextUtils.isEmpty(this.f16168e)) {
                String str = this.f16167d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f16166c;
                    b1.b(url);
                    str = url.toString();
                }
                this.f16168e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f16169f = new URL(this.f16168e);
        }
        return this.f16169f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c().equals(fVar.c()) && this.f16165b.equals(fVar.f16165b);
    }

    public final int hashCode() {
        if (this.f16171h == 0) {
            int hashCode = c().hashCode();
            this.f16171h = hashCode;
            this.f16171h = this.f16165b.hashCode() + (hashCode * 31);
        }
        return this.f16171h;
    }

    public final String toString() {
        return c();
    }

    public f(String str) {
        i iVar = g.f16172a;
        this.f16166c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f16167d = str;
            b1.b(iVar);
            this.f16165b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
