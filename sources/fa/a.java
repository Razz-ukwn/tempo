package fa;

import k6.q;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final ca.a f8642b = new ca.a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f8643c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    public static final String f8644d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final q f8645e = new q(4);

    /* renamed from: a  reason: collision with root package name */
    public final c f8646a;

    public a(c cVar) {
        this.f8646a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            sb2.append(str.charAt(i8));
            if (str2.length() > i8) {
                sb2.append(str2.charAt(i8));
            }
        }
        return sb2.toString();
    }
}
