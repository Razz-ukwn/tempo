package qe;

import b2.c;

public final class d extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f13535a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13536b;

    public d(int i8, String str) {
        super(str);
        this.f13536b = str;
        this.f13535a = i8;
    }

    public final String toString() {
        return "Error type: " + c.c(this.f13535a) + ". " + this.f13536b;
    }
}
