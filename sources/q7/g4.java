package q7;

public final class g4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13075a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13076b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13077c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13078d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h4 f13079e;

    public g4(h4 h4Var, String str, String str2, String str3, long j10) {
        this.f13079e = h4Var;
        this.f13075a = str;
        this.f13076b = str2;
        this.f13077c = str3;
        this.f13078d = j10;
    }

    public final void run() {
        String str = this.f13076b;
        h4 h4Var = this.f13079e;
        String str2 = this.f13075a;
        if (str2 == null) {
            t6 t6Var = h4Var.f13101a;
            t6Var.h().i();
            String str3 = t6Var.Z;
            if (str3 == null || str3.equals(str)) {
                t6Var.Z = str;
                t6Var.Y = null;
                return;
            }
            return;
        }
        f5 f5Var = new f5(this.f13078d, this.f13077c, str2);
        t6 t6Var2 = h4Var.f13101a;
        t6Var2.h().i();
        String str4 = t6Var2.Z;
        if (str4 != null) {
            boolean equals = str4.equals(str);
        }
        t6Var2.Z = str;
        t6Var2.Y = f5Var;
    }
}
