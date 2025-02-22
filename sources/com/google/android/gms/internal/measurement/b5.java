package com.google.android.gms.internal.measurement;

public final class b5 extends c5 {

    /* renamed from: a  reason: collision with root package name */
    public static final b5 f5163a = new b5();

    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
