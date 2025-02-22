package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import cg.f;
import cg.h;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {115, 121}, m = "invokeSuspend")
public final class r3 extends i implements p<g<? super Float>, d<? super m>, Object> {
    public final /* synthetic */ s3 B;
    public final /* synthetic */ f<m> C;
    public final /* synthetic */ Context D;

    /* renamed from: a  reason: collision with root package name */
    public h f1411a;

    /* renamed from: b  reason: collision with root package name */
    public int f1412b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f1413c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ContentResolver f1414d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Uri f1415e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r3(ContentResolver contentResolver, Uri uri, s3 s3Var, f<m> fVar, Context context, d<? super r3> dVar) {
        super(2, dVar);
        this.f1414d = contentResolver;
        this.f1415e = uri;
        this.B = s3Var;
        this.C = fVar;
        this.D = context;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        r3 r3Var = new r3(this.f1414d, this.f1415e, this.B, this.C, this.D, dVar);
        r3Var.f1413c = obj;
        return r3Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r3) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[Catch:{ all -> 0x0088 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r9.f1412b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            cg.h r1 = r9.f1411a
            java.lang.Object r4 = r9.f1413c
            kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.g) r4
            cb.b.J(r10)     // Catch:{ all -> 0x0099 }
            goto L_0x0044
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001e:
            cg.h r1 = r9.f1411a
            java.lang.Object r4 = r9.f1413c
            kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.g) r4
            cb.b.J(r10)     // Catch:{ all -> 0x0099 }
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            goto L_0x0058
        L_0x002c:
            cb.b.J(r10)
            java.lang.Object r10 = r9.f1413c
            r4 = r10
            kotlinx.coroutines.flow.g r4 = (kotlinx.coroutines.flow.g) r4
            android.content.ContentResolver r10 = r9.f1414d
            android.net.Uri r1 = r9.f1415e
            r5 = 0
            androidx.compose.ui.platform.s3 r6 = r9.B
            r10.registerContentObserver(r1, r5, r6)
            cg.f<ff.m> r10 = r9.C     // Catch:{ all -> 0x0099 }
            cg.h r1 = r10.iterator()     // Catch:{ all -> 0x0099 }
        L_0x0044:
            r10 = r9
        L_0x0045:
            r10.f1413c = r4     // Catch:{ all -> 0x0094 }
            r10.f1411a = r1     // Catch:{ all -> 0x0094 }
            r10.f1412b = r3     // Catch:{ all -> 0x0094 }
            java.lang.Object r5 = r1.a(r10)     // Catch:{ all -> 0x0094 }
            if (r5 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r8 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L_0x0058:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0088 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x008a
            r4.next()     // Catch:{ all -> 0x0088 }
            android.content.Context r10 = r0.D     // Catch:{ all -> 0x0088 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x0088 }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x0088 }
            java.lang.Float r6 = new java.lang.Float     // Catch:{ all -> 0x0088 }
            r6.<init>(r10)     // Catch:{ all -> 0x0088 }
            r0.f1413c = r5     // Catch:{ all -> 0x0088 }
            r0.f1411a = r4     // Catch:{ all -> 0x0088 }
            r0.f1412b = r2     // Catch:{ all -> 0x0088 }
            java.lang.Object r10 = r5.m(r6, r0)     // Catch:{ all -> 0x0088 }
            if (r10 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r10 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L_0x0045
        L_0x0088:
            r10 = move-exception
            goto L_0x009b
        L_0x008a:
            android.content.ContentResolver r10 = r0.f1414d
            androidx.compose.ui.platform.s3 r0 = r0.B
            r10.unregisterContentObserver(r0)
            ff.m r10 = ff.m.f8717a
            return r10
        L_0x0094:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L_0x009b
        L_0x0099:
            r10 = move-exception
            r0 = r9
        L_0x009b:
            android.content.ContentResolver r1 = r0.f1414d
            androidx.compose.ui.platform.s3 r0 = r0.B
            r1.unregisterContentObserver(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
