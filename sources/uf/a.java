package uf;

import java.util.Random;

public abstract class a extends c {
    public final int a(int i8) {
        return ((-i8) >> 31) & (d().nextInt() >>> (32 - i8));
    }

    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
