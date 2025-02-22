package zf;

import ff.g;
import rf.p;
import sf.j;

public final class k extends sf.k implements p<CharSequence, Integer, g<? extends Integer, ? extends Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ char[] f17977a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f17978b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(char[] cArr, boolean z10) {
        super(2);
        this.f17977a = cArr;
        this.f17978b = z10;
    }

    public final Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        j.f(charSequence, "$this$$receiver");
        int H0 = n.H0(intValue, charSequence, this.f17978b, this.f17977a);
        if (H0 < 0) {
            return null;
        }
        return new g(Integer.valueOf(H0), 1);
    }
}
