package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import t.w2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i0  reason: invalid package */
public abstract class i0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public String f4628a;

    /* renamed from: b  reason: collision with root package name */
    public int f4629b = 2;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f4630c;

    /* renamed from: d  reason: collision with root package name */
    public int f4631d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f4632e;

    public i0(w2 w2Var, CharSequence charSequence) {
        Object obj = w2Var.f15268a;
        this.f4632e = Integer.MAX_VALUE;
        this.f4630c = charSequence;
    }

    /* renamed from: a */
    public final boolean hasNext() {
        int i8;
        int i10 = this.f4629b;
        if (i10 != 4) {
            int i11 = i10 - 1;
            String str = null;
            if (i10 == 0) {
                throw null;
            } else if (i11 == 0) {
                return true;
            } else {
                if (i11 != 2) {
                    this.f4629b = 4;
                    int i12 = this.f4631d;
                    while (true) {
                        int i13 = this.f4631d;
                        if (i13 == -1) {
                            this.f4629b = 3;
                            break;
                        }
                        int e10 = e(i13);
                        CharSequence charSequence = this.f4630c;
                        if (e10 == -1) {
                            e10 = charSequence.length();
                            this.f4631d = -1;
                            i8 = -1;
                        } else {
                            i8 = d(e10);
                            this.f4631d = i8;
                        }
                        if (i8 == i12) {
                            int i14 = i8 + 1;
                            this.f4631d = i14;
                            if (i14 > charSequence.length()) {
                                this.f4631d = -1;
                            }
                        } else {
                            if (i12 < e10) {
                                charSequence.charAt(i12);
                            }
                            if (i12 < e10) {
                                charSequence.charAt(e10 - 1);
                            }
                            int i15 = this.f4632e;
                            if (i15 == 1) {
                                e10 = charSequence.length();
                                this.f4631d = -1;
                                if (e10 > i12) {
                                    charSequence.charAt(e10 - 1);
                                }
                            } else {
                                this.f4632e = i15 - 1;
                            }
                            str = charSequence.subSequence(i12, e10).toString();
                        }
                    }
                    this.f4628a = str;
                    if (this.f4629b != 3) {
                        this.f4629b = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public final Object next() {
        if (hasNext()) {
            this.f4629b = 2;
            String str = this.f4628a;
            this.f4628a = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    public abstract int d(int i8);

    public abstract int e(int i8);

    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
