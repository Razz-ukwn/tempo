package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w2  reason: invalid package */
public class w2 extends IOException {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5028b = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5029a;

    public w2(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static v2 a() {
        return new v2();
    }

    public static w2 b() {
        return new w2("Protocol message had invalid UTF-8.");
    }

    public static w2 c() {
        return new w2("CodedInputStream encountered a malformed varint.");
    }

    public static w2 d() {
        return new w2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static w2 e() {
        return new w2("Failed to parse the message.");
    }

    public static w2 f() {
        return new w2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public w2(String str) {
        super(str);
    }
}
