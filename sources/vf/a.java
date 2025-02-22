package vf;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import sf.j;

public final class a extends uf.a {
    public final int c(int i8, int i10) {
        return ThreadLocalRandom.current().nextInt(i8, i10);
    }

    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.e(current, "current()");
        return current;
    }
}
