package t6;

import java.lang.ref.WeakReference;

public abstract class v extends t {

    /* renamed from: f  reason: collision with root package name */
    public static final WeakReference f15416f = new WeakReference((Object) null);

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f15417e = f15416f;

    public v(byte[] bArr) {
        super(bArr);
    }

    public final byte[] P() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f15417e.get();
            if (bArr == null) {
                bArr = Q();
                this.f15417e = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] Q();
}
