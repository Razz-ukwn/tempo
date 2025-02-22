package com.google.android.play.core.integrity;

final class c extends IntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f6272a;

    /* renamed from: b  reason: collision with root package name */
    private final Long f6273b;

    public /* synthetic */ c(String str, Long l10, b bVar) {
        this.f6272a = str;
        this.f6273b = l10;
    }

    public final Long cloudProjectNumber() {
        return this.f6273b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f6273b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.play.core.integrity.IntegrityTokenRequest r5 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r5
            java.lang.String r1 = r4.f6272a
            java.lang.String r3 = r5.nonce()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            java.lang.Long r1 = r4.f6273b
            if (r1 != 0) goto L_0x0022
            java.lang.Long r5 = r5.cloudProjectNumber()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            java.lang.Long r5 = r5.cloudProjectNumber()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.f6272a.hashCode() ^ 1000003;
        Long l10 = this.f6273b;
        return (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
    }

    public final String nonce() {
        return this.f6272a;
    }

    public final String toString() {
        String str = this.f6272a;
        Long l10 = this.f6273b;
        return "IntegrityTokenRequest{nonce=" + str + ", cloudProjectNumber=" + l10 + "}";
    }
}
