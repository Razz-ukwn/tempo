package c6;

import androidx.activity.g;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f3795a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3796b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3797c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3798d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3799e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3800f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3801g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3802h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3803i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3804j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3805k;

    /* renamed from: l  reason: collision with root package name */
    public final String f3806l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f3795a = num;
        this.f3796b = str;
        this.f3797c = str2;
        this.f3798d = str3;
        this.f3799e = str4;
        this.f3800f = str5;
        this.f3801g = str6;
        this.f3802h = str7;
        this.f3803i = str8;
        this.f3804j = str9;
        this.f3805k = str10;
        this.f3806l = str11;
    }

    public final String a() {
        return this.f3806l;
    }

    public final String b() {
        return this.f3804j;
    }

    public final String c() {
        return this.f3798d;
    }

    public final String d() {
        return this.f3802h;
    }

    public final String e() {
        return this.f3797c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f3795a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f3796b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f3797c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f3798d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f3799e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f3800f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f3801g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f3802h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f3803i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f3804j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f3805k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f3806l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f3803i;
    }

    public final String g() {
        return this.f3801g;
    }

    public final String h() {
        return this.f3805k;
    }

    public final int hashCode() {
        int i8 = 0;
        Integer num = this.f3795a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f3796b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3797c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3798d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3799e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f3800f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f3801g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f3802h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f3803i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f3804j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f3805k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f3806l;
        if (str11 != null) {
            i8 = str11.hashCode();
        }
        return i8 ^ hashCode11;
    }

    public final String i() {
        return this.f3796b;
    }

    public final String j() {
        return this.f3800f;
    }

    public final String k() {
        return this.f3799e;
    }

    public final Integer l() {
        return this.f3795a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f3795a);
        sb2.append(", model=");
        sb2.append(this.f3796b);
        sb2.append(", hardware=");
        sb2.append(this.f3797c);
        sb2.append(", device=");
        sb2.append(this.f3798d);
        sb2.append(", product=");
        sb2.append(this.f3799e);
        sb2.append(", osBuild=");
        sb2.append(this.f3800f);
        sb2.append(", manufacturer=");
        sb2.append(this.f3801g);
        sb2.append(", fingerprint=");
        sb2.append(this.f3802h);
        sb2.append(", locale=");
        sb2.append(this.f3803i);
        sb2.append(", country=");
        sb2.append(this.f3804j);
        sb2.append(", mccMnc=");
        sb2.append(this.f3805k);
        sb2.append(", applicationBuild=");
        return g.a(sb2, this.f3806l, "}");
    }
}
