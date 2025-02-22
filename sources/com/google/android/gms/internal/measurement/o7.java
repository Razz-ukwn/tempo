package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class o7 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5449a = 0;

    public o7(String str) {
        super(str);
    }

    public static o7 a() {
        return new o7("Protocol message had invalid UTF-8.");
    }

    public static o7 b() {
        return new o7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static o7 c() {
        return new o7("Failed to parse the message.");
    }

    public static o7 d() {
        return new o7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
