package s4;

public final class e implements a<byte[]> {
    public final int a() {
        return 1;
    }

    public final String b() {
        return "ByteArrayPool";
    }

    public final int c(Object obj) {
        return ((byte[]) obj).length;
    }

    public final Object newArray(int i8) {
        return new byte[i8];
    }
}
