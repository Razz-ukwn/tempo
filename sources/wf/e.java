package wf;

import gf.w;
import java.util.NoSuchElementException;

public final class e extends w {

    /* renamed from: a  reason: collision with root package name */
    public final int f16717a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16718b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16719c;

    /* renamed from: d  reason: collision with root package name */
    public int f16720d;

    public e(int i8, int i10, int i11) {
        this.f16717a = i11;
        this.f16718b = i10;
        boolean z10 = true;
        if (i11 <= 0 ? i8 < i10 : i8 > i10) {
            z10 = false;
        }
        this.f16719c = z10;
        this.f16720d = !z10 ? i10 : i8;
    }

    public final boolean hasNext() {
        return this.f16719c;
    }

    public final int nextInt() {
        int i8 = this.f16720d;
        if (i8 != this.f16718b) {
            this.f16720d = this.f16717a + i8;
        } else if (this.f16719c) {
            this.f16719c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i8;
    }
}
