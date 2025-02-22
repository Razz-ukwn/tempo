package ub;

import com.lassi.presentation.cameraview.controls.g;
import com.lassi.presentation.cameraview.controls.k;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public k f15983a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f15984b = null;

    /* renamed from: c  reason: collision with root package name */
    public long f15985c = -1;

    public r(k kVar) {
        this.f15983a = kVar;
    }

    public final void a() {
        k.a aVar;
        byte[] bArr = this.f15984b;
        boolean z10 = true;
        if (bArr != null) {
            k kVar = this.f15983a;
            if (kVar != null) {
                if (bArr == null) {
                    z10 = false;
                }
                if (!z10) {
                    throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously,for the duration of the process() method.");
                } else if (!kVar.f6522c.offer(this)) {
                    this.f15983a = null;
                } else if (bArr.length == kVar.f6520a && (aVar = kVar.f6521b) != null) {
                    g gVar = (g) aVar;
                    if (gVar.x()) {
                        gVar.V.addCallbackBuffer(bArr);
                    }
                }
            }
            this.f15984b = null;
            this.f15985c = -1;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).f15985c == this.f15985c;
    }
}
