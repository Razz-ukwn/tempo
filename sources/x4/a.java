package x4;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p4.b;
import p4.g;
import p4.h;
import p4.i;
import y4.k;
import y4.l;
import y4.q;

public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final q f16955a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16956b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16957c;

    /* renamed from: d  reason: collision with root package name */
    public final b f16958d;

    /* renamed from: e  reason: collision with root package name */
    public final k f16959e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16960f;

    /* renamed from: g  reason: collision with root package name */
    public final i f16961g;

    /* renamed from: x4.a$a  reason: collision with other inner class name */
    public class C0314a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i8, int i10, h hVar) {
        if (q.f17218j == null) {
            synchronized (q.class) {
                if (q.f17218j == null) {
                    q.f17218j = new q();
                }
            }
        }
        this.f16955a = q.f17218j;
        this.f16956b = i8;
        this.f16957c = i10;
        this.f16958d = (b) hVar.c(l.f17199f);
        this.f16959e = (k) hVar.c(k.f17197f);
        g gVar = l.f17202i;
        this.f16960f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f16961g = (i) hVar.c(l.f17200g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z10 = false;
        if (this.f16955a.a(this.f16956b, this.f16957c, this.f16960f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f16958d == b.f12452b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0314a());
        Size a10 = imageInfo.getSize();
        int i8 = this.f16956b;
        if (i8 == Integer.MIN_VALUE) {
            i8 = a10.getWidth();
        }
        int i10 = this.f16957c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = a10.getHeight();
        }
        float b10 = this.f16959e.b(a10.getWidth(), a10.getHeight(), i8, i10);
        int round = Math.round(((float) a10.getWidth()) * b10);
        int round2 = Math.round(((float) a10.getHeight()) * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + a10.getWidth() + "x" + a10.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f16961g;
        if (iVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (iVar == i.f12465a && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z10 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            return;
        }
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }
}
