package com.bumptech.glide;

import com.bumptech.glide.n;
import j5.c;
import j5.e;

public abstract class n<CHILD extends n<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public e<? super TranscodeType> f4135a = c.f9797b;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
