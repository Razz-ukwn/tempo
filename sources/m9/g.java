package m9;

import u6.q;

public class g extends Exception {
    @Deprecated
    public g() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(str);
        q.g("Detail message must not be empty", str);
    }
}
