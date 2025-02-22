package u6;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f15825a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15826b;

    public i(String str, String str2) {
        q.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15825a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f15826b = null;
        } else {
            this.f15826b = str2;
        }
    }
}
