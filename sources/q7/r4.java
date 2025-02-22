package q7;

public final class r4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13301b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13302c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f13303d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a5 f13304e;

    public r4(a5 a5Var, String str, String str2, Object obj, long j10) {
        this.f13304e = a5Var;
        this.f13300a = str;
        this.f13301b = str2;
        this.f13302c = obj;
        this.f13303d = j10;
    }

    public final void run() {
        a5 a5Var = this.f13304e;
        String str = this.f13300a;
        String str2 = this.f13301b;
        a5Var.y(this.f13303d, this.f13302c, str, str2);
    }
}
