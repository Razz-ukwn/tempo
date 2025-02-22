package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import l9.f;
import l9.g;
import l9.m;
import l9.p;
import l9.v;
import t.w2;

final class t {

    /* renamed from: a  reason: collision with root package name */
    final v f6297a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m f6298b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6299c;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(android.content.Context r9, l9.m r10) {
        /*
            r8 = this;
            java.lang.String r0 = "PlayCore"
            r8.<init>()
            java.lang.String r1 = r9.getPackageName()
            r8.f6299c = r1
            r8.f6298b = r10
            l9.m r1 = l9.x.f11036a
            java.lang.String r1 = "com.android.vending"
            r2 = 0
            android.content.pm.PackageManager r3 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0091 }
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0091 }
            if (r3 == 0) goto L_0x0091
            android.content.pm.PackageManager r3 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0091 }
            r4 = 64
            android.content.pm.PackageInfo r1 = r3.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x0091 }
            android.content.pm.Signature[] r1 = r1.signatures     // Catch:{ NameNotFoundException -> 0x0091 }
            if (r1 == 0) goto L_0x0078
            int r3 = r1.length
            if (r3 != 0) goto L_0x0030
            goto L_0x0078
        L_0x0030:
            r4 = r2
        L_0x0031:
            if (r4 >= r3) goto L_0x0091
            r5 = r1[r4]
            byte[] r5 = r5.toByteArray()
            java.lang.String r6 = "SHA-256"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch:{ NoSuchAlgorithmException -> 0x004d }
            r6.update(r5)
            byte[] r5 = r6.digest()
            r6 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            goto L_0x004f
        L_0x004d:
            java.lang.String r5 = ""
        L_0x004f:
            java.lang.String r6 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0076
            java.lang.String r6 = android.os.Build.TAGS
            java.lang.String r7 = "dev-keys"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x006b
            java.lang.String r6 = android.os.Build.TAGS
            java.lang.String r7 = "test-keys"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0073
        L_0x006b:
            java.lang.String r6 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x0076
        L_0x0073:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x0076:
            r1 = 1
            goto L_0x0092
        L_0x0078:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            l9.m r3 = l9.x.f11036a
            r3.getClass()
            r4 = 5
            boolean r4 = android.util.Log.isLoggable(r0, r4)
            if (r4 == 0) goto L_0x0091
            java.lang.String r3 = r3.f11019a
            java.lang.String r4 = "Phonesky package is not signed -- possibly self-built package. Could not verify."
            java.lang.String r1 = l9.m.b(r3, r4, r1)
            android.util.Log.w(r0, r1)
        L_0x0091:
            r1 = r2
        L_0x0092:
            if (r1 != 0) goto L_0x00af
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r10.getClass()
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L_0x00ab
            java.lang.String r10 = r10.f11019a
            java.lang.String r1 = "Phonesky is not installed."
            java.lang.String r9 = l9.m.b(r10, r1, r9)
            android.util.Log.e(r0, r9)
        L_0x00ab:
            r9 = 0
            r8.f6297a = r9
            return
        L_0x00af:
            l9.v r0 = new l9.v
            android.content.Intent r1 = com.google.android.play.core.integrity.u.f6300a
            com.google.android.play.core.integrity.q r2 = com.google.android.play.core.integrity.q.f6288a
            r0.<init>(r9, r10, r1)
            r8.f6297a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.t.<init>(android.content.Context, l9.m):void");
    }

    public static Bundle a(t tVar, byte[] bArr, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", tVar.f6299c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", ((g) it.next()).b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(arrayList2));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f6297a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.f6298b.a("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            v vVar = this.f6297a;
            r rVar = new r(this, taskCompletionSource, decode, cloudProjectNumber, taskCompletionSource, integrityTokenRequest);
            synchronized (vVar.f11029f) {
                vVar.f11028e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new w2((Object) vVar, (Object) taskCompletionSource));
            }
            synchronized (vVar.f11029f) {
                if (vVar.f11034k.getAndIncrement() > 0) {
                    m mVar = vVar.f11025b;
                    Object[] objArr = new Object[0];
                    mVar.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        Log.d("PlayCore", m.b(mVar.f11019a, "Already connected to the service.", objArr));
                    }
                }
            }
            vVar.a().post(new p(vVar, rVar.c(), rVar));
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
