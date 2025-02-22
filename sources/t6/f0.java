package t6;

public class f0 {

    /* renamed from: d  reason: collision with root package name */
    public static final f0 f15397d = new f0(true, (String) null, (Exception) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15398a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15399b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f15400c;

    public f0(boolean z10, String str, Exception exc) {
        this.f15398a = z10;
        this.f15399b = str;
        this.f15400c = exc;
    }

    public static f0 b(String str) {
        return new f0(false, str, (Exception) null);
    }

    public static f0 c(String str, Exception exc) {
        return new f0(false, str, exc);
    }

    public String a() {
        return this.f15399b;
    }
}
