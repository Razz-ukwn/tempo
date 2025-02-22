package com.lassi.presentation.cameraview.controls;

import android.graphics.PointF;
import android.hardware.Camera;
import tb.e;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PointF f6464a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6465b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6466c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f6467d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f6468e;

    public class a implements Camera.AutoFocusCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PointF f6469a;

        public a(PointF pointF) {
            this.f6469a = pointF;
        }

        public final void onAutoFocus(boolean z10, Camera camera) {
            f fVar = f.this;
            fVar.f6468e.f6477a.f(fVar.f6467d, z10, this.f6469a);
            g gVar = fVar.f6468e;
            gVar.f6479c.f16682b.removeCallbacks(gVar.X);
            long j10 = gVar.B;
            if (j10 > 0 && j10 != Long.MAX_VALUE) {
                gVar.f6479c.f16682b.postDelayed(gVar.X, j10);
            }
        }
    }

    public f(g gVar, PointF pointF, int i8, int i10, e eVar) {
        this.f6468e = gVar;
        this.f6464a = pointF;
        this.f6465b = i8;
        this.f6466c = i10;
        this.f6467d = eVar;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            com.lassi.presentation.cameraview.controls.g r2 = r1.f6468e
            com.lassi.presentation.cameraview.controls.j r0 = r2.f6491p
            boolean r0 = r0.m
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            android.graphics.PointF r3 = new android.graphics.PointF
            android.graphics.PointF r0 = r1.f6464a
            float r4 = r0.x
            float r0 = r0.y
            r3.<init>(r4, r0)
            float r0 = r3.x
            double r4 = (double) r0
            float r0 = r3.y
            double r6 = (double) r0
            r8 = 0
            r9 = 1
            int r0 = r2.h(r8, r9)
            int r0 = -r0
            int r10 = r1.f6465b
            double r10 = (double) r10
            double r4 = r4 / r10
            r10 = 4656510908468559872(0x409f400000000000, double:2000.0)
            double r4 = r4 * r10
            r12 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
            double r4 = r4 + r12
            int r14 = r1.f6466c
            double r14 = (double) r14
            double r6 = r6 / r14
            double r6 = r6 * r10
            double r6 = r6 + r12
            double r10 = (double) r0
            r12 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r10 = r10 * r12
            r12 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r10 = r10 / r12
            double r12 = java.lang.Math.cos(r10)
            double r12 = r12 * r4
            double r14 = java.lang.Math.sin(r10)
            double r14 = r14 * r6
            double r12 = r12 - r14
            double r14 = java.lang.Math.sin(r10)
            double r14 = r14 * r4
            double r10 = java.lang.Math.cos(r10)
            double r10 = r10 * r6
            double r10 = r10 + r14
            r0 = 5
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String r15 = "focus:"
            r14[r8] = r15
            java.lang.String r16 = "viewClickX:"
            r14[r9] = r16
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r5 = 2
            r14[r5] = r4
            java.lang.String r4 = "viewClickY:"
            r5 = 3
            r14[r5] = r4
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
            r6 = 4
            r14[r6] = r4
            wb.a r4 = com.lassi.presentation.cameraview.controls.g.Y
            r4.a(r9, r14)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r15
            java.lang.String r7 = "sensorClickX:"
            r0[r9] = r7
            java.lang.Double r7 = java.lang.Double.valueOf(r12)
            r14 = 2
            r0[r14] = r7
            java.lang.String r7 = "sensorClickY:"
            r0[r5] = r7
            java.lang.Double r7 = java.lang.Double.valueOf(r10)
            r0[r6] = r7
            r4.a(r9, r0)
            r20 = 4639481672377565184(0x4062c00000000000, double:150.0)
            r16 = r12
            r18 = r10
            android.graphics.Rect r0 = com.lassi.presentation.cameraview.controls.g.w(r16, r18, r20)
            r20 = 4643985272004935680(0x4072c00000000000, double:300.0)
            android.graphics.Rect r4 = com.lassi.presentation.cameraview.controls.g.w(r16, r18, r20)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 2
            r6.<init>(r7)
            android.hardware.Camera$Area r7 = new android.hardware.Camera$Area
            r10 = 1000(0x3e8, float:1.401E-42)
            r7.<init>(r0, r10)
            r6.add(r7)
            android.hardware.Camera$Area r0 = new android.hardware.Camera$Area
            r7 = 100
            r0.<init>(r4, r7)
            r6.add(r0)
            java.util.List r0 = r6.subList(r8, r9)
            android.hardware.Camera r4 = r2.V
            android.hardware.Camera$Parameters r4 = r4.getParameters()
            int r7 = r4.getMaxNumFocusAreas()
            int r10 = r4.getMaxNumMeteringAreas()
            if (r7 <= 0) goto L_0x00e7
            if (r7 <= r9) goto L_0x00e3
            r7 = r6
            goto L_0x00e4
        L_0x00e3:
            r7 = r0
        L_0x00e4:
            r4.setFocusAreas(r7)
        L_0x00e7:
            if (r10 <= 0) goto L_0x00f0
            if (r10 <= r9) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r6 = r0
        L_0x00ed:
            r4.setMeteringAreas(r6)
        L_0x00f0:
            java.lang.String r0 = "auto"
            r4.setFocusMode(r0)
            android.hardware.Camera r0 = r2.V
            r0.setParameters(r4)
            com.lassi.presentation.cameraview.controls.CameraView$b r0 = r2.f6477a
            tb.e r4 = r1.f6467d
            r0.b(r4, r3)
            android.hardware.Camera r0 = r2.V     // Catch:{ RuntimeException -> 0x010c }
            com.lassi.presentation.cameraview.controls.f$a r6 = new com.lassi.presentation.cameraview.controls.f$a     // Catch:{ RuntimeException -> 0x010c }
            r6.<init>(r3)     // Catch:{ RuntimeException -> 0x010c }
            r0.autoFocus(r6)     // Catch:{ RuntimeException -> 0x010c }
            goto L_0x0124
        L_0x010c:
            r0 = move-exception
            wb.a r6 = com.lassi.presentation.cameraview.controls.g.Y
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r10 = "startAutoFocus:"
            r7[r8] = r10
            java.lang.String r10 = "Error calling autoFocus"
            r7[r9] = r10
            r9 = 2
            r7[r9] = r0
            r6.a(r5, r7)
            com.lassi.presentation.cameraview.controls.CameraView$b r0 = r2.f6477a
            r0.f(r4, r8, r3)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.f.run():void");
    }
}
