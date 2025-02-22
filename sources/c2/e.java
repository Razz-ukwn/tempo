package c2;

import java.io.Serializable;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f3659a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializable f3660b;

    public /* synthetic */ e(int i8, String str) {
        this.f3659a = i8;
        this.f3660b = str;
    }

    public boolean a(Object obj) {
        int i8;
        Serializable serializable;
        boolean z10;
        int i10 = 0;
        while (true) {
            i8 = this.f3659a;
            serializable = this.f3660b;
            if (i10 >= i8) {
                z10 = false;
                break;
            } else if (((Object[]) serializable)[i10] == obj) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        } else if (i8 >= ((Object[]) serializable).length) {
            return false;
        } else {
            ((Object[]) serializable)[i8] = obj;
            this.f3659a = i8 + 1;
            return true;
        }
    }

    public Object b() {
        int i8 = this.f3659a;
        if (i8 <= 0) {
            return null;
        }
        int i10 = i8 - 1;
        Serializable serializable = this.f3660b;
        Object obj = ((Object[]) serializable)[i10];
        ((Object[]) serializable)[i10] = null;
        this.f3659a = i8 - 1;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object[], java.io.Serializable] */
    public /* synthetic */ e(int i8) {
        if (i8 > 0) {
            this.f3660b = new Object[i8];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
