package com.google.android.gms.internal.measurement;

import b2.c;

public final class e5 extends c5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5255a;

    public e5(Object obj) {
        this.f5255a = obj;
    }

    public final Object a() {
        return this.f5255a;
    }

    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e5) {
            return this.f5255a.equals(((e5) obj).f5255a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5255a.hashCode() + 1502476572;
    }

    public final String toString() {
        return c.a("Optional.of(", this.f5255a.toString(), ")");
    }
}
