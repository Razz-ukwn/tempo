package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.play.core.integrity.model.a;
import java.util.Locale;

public class IntegrityServiceException extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f6269a;

    public IntegrityServiceException(int i8, Throwable th) {
        super(new Status(i8, String.format(Locale.ROOT, "Integrity API error (%d): %s.", new Object[]{Integer.valueOf(i8), a.a(i8)})));
        if (i8 != 0) {
            this.f6269a = th;
            return;
        }
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    public final synchronized Throwable getCause() {
        return this.f6269a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
