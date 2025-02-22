package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
import s4.b;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f4105a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4106b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4107c;

    /* renamed from: d  reason: collision with root package name */
    public int f4108d;

    public c(FileOutputStream fileOutputStream, b bVar) {
        this.f4105a = fileOutputStream;
        this.f4107c = bVar;
        this.f4106b = (byte[]) bVar.c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        OutputStream outputStream = this.f4105a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f4106b;
            if (bArr != null) {
                this.f4107c.put(bArr);
                this.f4106b = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    public final void flush() {
        int i8 = this.f4108d;
        OutputStream outputStream = this.f4105a;
        if (i8 > 0) {
            outputStream.write(this.f4106b, 0, i8);
            this.f4108d = 0;
        }
        outputStream.flush();
    }

    public final void write(int i8) {
        byte[] bArr = this.f4106b;
        int i10 = this.f4108d;
        int i11 = i10 + 1;
        this.f4108d = i11;
        bArr[i10] = (byte) i8;
        if (i11 == bArr.length && i11 > 0) {
            this.f4105a.write(bArr, 0, i11);
            this.f4108d = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i8, int i10) {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i8 + i11;
            int i14 = this.f4108d;
            OutputStream outputStream = this.f4105a;
            if (i14 != 0 || i12 < this.f4106b.length) {
                int min = Math.min(i12, this.f4106b.length - i14);
                System.arraycopy(bArr, i13, this.f4106b, this.f4108d, min);
                int i15 = this.f4108d + min;
                this.f4108d = i15;
                i11 += min;
                byte[] bArr2 = this.f4106b;
                if (i15 == bArr2.length && i15 > 0) {
                    outputStream.write(bArr2, 0, i15);
                    this.f4108d = 0;
                    continue;
                }
            } else {
                outputStream.write(bArr, i13, i12);
                return;
            }
        } while (i11 < i10);
    }
}
