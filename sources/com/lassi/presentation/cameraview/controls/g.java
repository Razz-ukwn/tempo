package com.lassi.presentation.cameraview.controls;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.location.Location;
import android.view.SurfaceHolder;
import com.lassi.presentation.cameraview.controls.CameraView;
import com.lassi.presentation.cameraview.controls.n;
import com.lassi.presentation.cameraview.controls.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import tb.d;
import tb.h;
import tb.i;
import tb.l;
import ub.m;
import ub.r;
import ub.x;

public final class g extends h implements Camera.PreviewCallback, Camera.ErrorCallback, o.a, n.a {
    public static final wb.a Y = new wb.a(g.class.getSimpleName());
    public Camera V;
    public boolean W = false;
    public final a X = new a();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            if (gVar.x()) {
                gVar.V.cancelAutoFocus();
                Camera.Parameters parameters = gVar.V.getParameters();
                int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                if (maxNumFocusAreas > 0) {
                    parameters.setFocusAreas((List) null);
                }
                if (maxNumMeteringAreas > 0) {
                    parameters.setMeteringAreas((List) null);
                }
                gVar.o(parameters);
                gVar.V.setParameters(parameters);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f6472a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u.b f6473b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Runnable f6474c;

        public b(boolean z10, u.b bVar, Runnable runnable) {
            this.f6472a = z10;
            this.f6473b = bVar;
            this.f6474c = runnable;
        }

        public final void run() {
            boolean z10 = this.f6472a;
            u.b bVar = this.f6473b;
            if (!z10 || g.this.x()) {
                this.f6474c.run();
                if (bVar != null) {
                    bVar.a((Integer) null);
                }
            } else if (bVar != null) {
                bVar.a((Integer) null);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                wb.a r0 = com.lassi.presentation.cameraview.controls.g.Y
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "onSurfaceAvailable:"
                r3 = 0
                r1[r3] = r2
                r2 = 1
                java.lang.String r4 = "Inside handler. About to bind."
                r1[r2] = r4
                r0.a(r2, r1)
                com.lassi.presentation.cameraview.controls.g r0 = com.lassi.presentation.cameraview.controls.g.this
                boolean r1 = r0.x()
                if (r1 == 0) goto L_0x0031
                vb.a r1 = r0.f6478b
                if (r1 == 0) goto L_0x0031
                int r4 = r1.f16355b
                if (r4 <= 0) goto L_0x0028
                int r1 = r1.f16356c
                if (r1 <= 0) goto L_0x0028
                r1 = r2
                goto L_0x0029
            L_0x0028:
                r1 = r3
            L_0x0029:
                if (r1 == 0) goto L_0x0031
                boolean r1 = r0.W
                if (r1 != 0) goto L_0x0031
                r1 = r2
                goto L_0x0032
            L_0x0031:
                r1 = r3
            L_0x0032:
                if (r1 == 0) goto L_0x0037
                r0.u()
            L_0x0037:
                boolean r1 = r0.x()
                if (r1 == 0) goto L_0x0042
                boolean r1 = r0.W
                if (r1 == 0) goto L_0x0042
                r3 = r2
            L_0x0042:
                if (r3 == 0) goto L_0x0049
                java.lang.String r1 = "onSurfaceAvailable"
                r0.B(r1)
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.g.c.run():void");
        }
    }

    public g(CameraView.a aVar) {
        super(aVar);
        this.f6492q = new ub.o();
    }

    public static ArrayList A(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Camera.Size size = (Camera.Size) it.next();
            x xVar = new x(size.width, size.height);
            if (!arrayList.contains(xVar)) {
                arrayList.add(xVar);
            }
        }
        Y.a(1, "size:", "sizesFromList:", arrayList);
        return arrayList;
    }

    public static Rect w(double d10, double d11, double d12) {
        double d13 = d12 / 2.0d;
        int max = (int) Math.max(d11 - d13, -1000.0d);
        int min = (int) Math.min(d11 + d13, 1000.0d);
        int max2 = (int) Math.max(d10 - d13, -1000.0d);
        int min2 = (int) Math.min(d10 + d13, 1000.0d);
        Y.a(1, "focus:", "computeMeteringArea:", "top:", Integer.valueOf(max), "left:", Integer.valueOf(max2), "bottom:", Integer.valueOf(min), "right:", Integer.valueOf(min2));
        return new Rect(max2, max, min2, min);
    }

    public final void B(String str) {
        wb.a aVar = Y;
        aVar.a(1, str, "Dispatching onCameraPreviewStreamSizeChanged.");
        this.f6477a.j();
        x f10 = f();
        this.f6478b.k(f10.f15991a, f10.f15992b, d(0, 1));
        Camera.Parameters parameters = this.V.getParameters();
        this.A = parameters.getPreviewFormat();
        x xVar = this.f6501z;
        parameters.setPreviewSize(xVar.f15991a, xVar.f15992b);
        i iVar = this.f6484h;
        i iVar2 = i.PICTURE;
        if (iVar == iVar2) {
            x xVar2 = this.f6500y;
            parameters.setPictureSize(xVar2.f15991a, xVar2.f15992b);
        } else {
            x a10 = a(iVar2);
            parameters.setPictureSize(a10.f15991a, a10.f15992b);
        }
        this.V.setParameters(parameters);
        this.V.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        this.V.setPreviewCallbackWithBuffer(this);
        int bitsPerPixel = ImageFormat.getBitsPerPixel(this.A);
        x xVar3 = this.f6501z;
        k kVar = this.f6493r;
        kVar.getClass();
        kVar.f6520a = (int) Math.ceil(((double) ((long) ((xVar3.f15992b * xVar3.f15991a) * bitsPerPixel))) / 8.0d);
        for (int i8 = 0; i8 < 2; i8++) {
            byte[] bArr = new byte[kVar.f6520a];
            g gVar = (g) kVar.f6521b;
            if (gVar.x()) {
                gVar.V.addCallbackBuffer(bArr);
            }
        }
        aVar.a(1, str, "Starting preview with startPreview().");
        try {
            this.V.startPreview();
            aVar.a(1, str, "Started preview.");
        } catch (Exception e10) {
            aVar.a(3, str, "Failed to start preview.", e10);
            throw new m(e10);
        }
    }

    public final void C() {
        this.A = 0;
        k kVar = this.f6493r;
        LinkedBlockingQueue<r> linkedBlockingQueue = kVar.f6522c;
        Iterator<r> it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            r next = it.next();
            next.f15983a = null;
            next.a();
        }
        linkedBlockingQueue.clear();
        kVar.f6520a = -1;
        this.V.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        try {
            this.V.stopPreview();
        } catch (Exception e10) {
            Y.a(3, "stopPreview", "Could not stop preview", e10);
        }
    }

    public final void D() {
        this.W = false;
        this.f6501z = null;
        this.f6500y = null;
        try {
            if (this.f6478b.f() == SurfaceHolder.class) {
                this.V.setPreviewDisplay((SurfaceHolder) null);
            } else if (this.f6478b.f() == SurfaceTexture.class) {
                this.V.setPreviewTexture((SurfaceTexture) null);
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
        } catch (IOException e10) {
            Y.a(3, "unbindFromSurface", "Could not release surface", e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r8 = this;
            boolean r0 = r8.x()
            java.lang.String r1 = "onStart:"
            wb.a r2 = Y
            r3 = 0
            r4 = 1
            r5 = 2
            if (r0 == 0) goto L_0x001b
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r1
            java.lang.String r6 = "Camera not available. Should not happen."
            r0[r4] = r6
            r2.a(r5, r0)
            r8.j()
        L_0x001b:
            boolean r0 = r8.v()
            r6 = 3
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "createCamera:"
            int r7 = r8.f6490o     // Catch:{ Exception -> 0x00c2 }
            android.hardware.Camera r7 = android.hardware.Camera.open(r7)     // Catch:{ Exception -> 0x00c2 }
            r8.V = r7     // Catch:{ Exception -> 0x00c2 }
            r7.setErrorCallback(r8)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r3] = r0
            java.lang.String r0 = "Applying default parameters."
            r6[r4] = r0
            r2.a(r4, r6)
            android.hardware.Camera r0 = r8.V
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            com.lassi.presentation.cameraview.controls.j r6 = new com.lassi.presentation.cameraview.controls.j
            boolean r7 = r8.d(r3, r4)
            r6.<init>(r0, r7)
            r8.f6491p = r6
            r8.o(r0)
            tb.d r6 = tb.d.OFF
            r8.p(r0, r6)
            r8.r(r0)
            tb.l r6 = tb.l.AUTO
            r8.t(r0, r6)
            tb.h r6 = tb.h.OFF
            r8.q(r0, r6)
            boolean r6 = r8.f6489n
            r8.s(r6)
            tb.i r6 = r8.f6484h
            tb.i r7 = tb.i.VIDEO
            if (r6 != r7) goto L_0x006d
            r6 = r4
            goto L_0x006e
        L_0x006d:
            r6 = r3
        L_0x006e:
            r0.setRecordingHint(r6)
            android.hardware.Camera r6 = r8.V
            r6.setParameters(r0)
            android.hardware.Camera r0 = r8.V
            int r6 = r8.h(r3, r4)
            r0.setDisplayOrientation(r6)
            boolean r0 = r8.x()
            if (r0 == 0) goto L_0x009c
            vb.a r0 = r8.f6478b
            if (r0 == 0) goto L_0x009c
            int r6 = r0.f16355b
            if (r6 <= 0) goto L_0x0093
            int r0 = r0.f16356c
            if (r0 <= 0) goto L_0x0093
            r0 = r4
            goto L_0x0094
        L_0x0093:
            r0 = r3
        L_0x0094:
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.W
            if (r0 != 0) goto L_0x009c
            r0 = r4
            goto L_0x009d
        L_0x009c:
            r0 = r3
        L_0x009d:
            if (r0 == 0) goto L_0x00a2
            r8.u()
        L_0x00a2:
            boolean r0 = r8.x()
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r8.W
            if (r0 == 0) goto L_0x00ae
            r0 = r4
            goto L_0x00af
        L_0x00ae:
            r0 = r3
        L_0x00af:
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "onStart"
            r8.B(r0)
        L_0x00b6:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r1
            java.lang.String r1 = "Ended"
            r0[r4] = r1
            r2.a(r4, r0)
            return
        L_0x00c2:
            r1 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r3] = r0
            java.lang.String r0 = "Failed to connect. Maybe in use by another app?"
            r5[r4] = r0
            r2.a(r6, r5)
            ub.m r0 = new ub.m
            r0.<init>(r1)
            throw r0
        L_0x00d4:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r1
            java.lang.String r1 = "No camera available for facing"
            r0[r4] = r1
            tb.c r1 = r8.f6480d
            r0[r5] = r1
            r2.a(r6, r0)
            ub.m r0 = new ub.m
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lassi.presentation.cameraview.controls.g.i():void");
    }

    public final void j() {
        wb.a aVar = Y;
        aVar.a(1, "onStop:", "About to clean up.");
        this.f6479c.f16682b.removeCallbacks(this.X);
        m mVar = this.f6495t;
        if (mVar != null) {
            mVar.a();
            this.f6495t = null;
        }
        if (this.V != null) {
            C();
            if (this.W) {
                D();
            }
            try {
                aVar.a(1, "destroyCamera:", "Clean up.", "Releasing camera.");
                this.V.release();
                aVar.a(1, "destroyCamera:", "Clean up.", "Released camera.");
            } catch (Exception e10) {
                aVar.a(2, "destroyCamera:", "Clean up.", "Exception while releasing camera.", e10);
            }
            this.V = null;
            this.f6491p = null;
        }
        this.f6491p = null;
        this.V = null;
        this.f6501z = null;
        this.f6500y = null;
        this.W = false;
        aVar.a(2, "onStop:", "Clean up.", "Returning.");
    }

    public final void o(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (this.f6484h == i.VIDEO && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        } else if (supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        } else if (supportedFocusModes.contains("infinity")) {
            parameters.setFocusMode("infinity");
        } else if (supportedFocusModes.contains("fixed")) {
            parameters.setFocusMode("fixed");
        }
    }

    public final void onError(int i8, Camera camera) {
        wb.a aVar = Y;
        if (i8 == 100) {
            aVar.a(2, "Recoverable error inside the onError callback.", "CAMERA_ERROR_SERVER_DIED");
            n();
            m();
            return;
        }
        aVar.a(3, "Internal Camera1 error.", Integer.valueOf(i8));
        throw new m(new RuntimeException(wb.a.f16661b));
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        long currentTimeMillis = System.currentTimeMillis();
        h(0, 2);
        k kVar = this.f6493r;
        r poll = kVar.f6522c.poll();
        if (poll == null) {
            poll = new r(kVar);
        }
        poll.f15984b = bArr;
        poll.f15985c = currentTimeMillis;
        this.f6477a.k(poll);
    }

    public final boolean p(Camera.Parameters parameters, d dVar) {
        if (this.f6491p.a(this.f6481e)) {
            parameters.setFlashMode((String) this.f6492q.F(this.f6481e));
            return true;
        }
        this.f6481e = dVar;
        return false;
    }

    public final boolean q(Camera.Parameters parameters, h hVar) {
        if (this.f6491p.a(this.f6485i)) {
            parameters.setSceneMode((String) this.f6492q.G(this.f6485i));
            return true;
        }
        this.f6485i = hVar;
        return false;
    }

    public final void r(Camera.Parameters parameters) {
        Location location = this.f6486j;
        if (location != null) {
            parameters.setGpsLatitude(location.getLatitude());
            parameters.setGpsLongitude(this.f6486j.getLongitude());
            parameters.setGpsAltitude(this.f6486j.getAltitude());
            parameters.setGpsTimestamp(this.f6486j.getTime());
            parameters.setGpsProcessingMethod(this.f6486j.getProvider());
        }
    }

    @TargetApi(17)
    public final boolean s(boolean z10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f6490o, cameraInfo);
        if (cameraInfo.canDisableShutterSound) {
            try {
                return this.V.enableShutterSound(this.f6489n);
            } catch (RuntimeException unused) {
                return false;
            }
        } else if (this.f6489n) {
            return true;
        } else {
            this.f6489n = z10;
            return false;
        }
    }

    public final boolean t(Camera.Parameters parameters, l lVar) {
        if (this.f6491p.a(this.f6482f)) {
            parameters.setWhiteBalance((String) this.f6492q.H(this.f6482f));
            return true;
        }
        this.f6482f = lVar;
        return false;
    }

    public final void u() {
        wb.a aVar = Y;
        aVar.a(1, "bindToSurface:", "Started");
        Object e10 = this.f6478b.e();
        try {
            if (e10 instanceof SurfaceHolder) {
                this.V.setPreviewDisplay((SurfaceHolder) e10);
            } else if (e10 instanceof SurfaceTexture) {
                this.V.setPreviewTexture((SurfaceTexture) e10);
            } else {
                throw new RuntimeException("Unknown CameraPreview output class.");
            }
            this.f6500y = a(this.f6484h);
            this.f6501z = b(A(this.V.getParameters().getSupportedPreviewSizes()));
            this.W = true;
        } catch (IOException e11) {
            aVar.a(3, "bindToSurface:", "Failed to bind.", e11);
            throw new m(e11);
        }
    }

    public final boolean v() {
        ub.o oVar = this.f6492q;
        tb.c cVar = this.f6480d;
        oVar.getClass();
        int intValue = ub.o.f15979d.get(cVar).intValue();
        Y.a(1, "collectCameraId", "Facing:", this.f6480d, "Internal:", Integer.valueOf(intValue), "Cameras:", Integer.valueOf(Camera.getNumberOfCameras()));
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i8 = 0; i8 < numberOfCameras; i8++) {
            Camera.getCameraInfo(i8, cameraInfo);
            if (cameraInfo.facing == intValue) {
                this.C = cameraInfo.orientation;
                this.f6490o = i8;
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        int i8 = this.D;
        return i8 != 1 ? i8 == 2 : this.V != null;
    }

    public final void y() {
        Y.a(1, "onSurfaceAvailable:", "Size is", g());
        z((u.b) null, false, new c());
    }

    public final void z(u.b bVar, boolean z10, Runnable runnable) {
        this.f6479c.b(new b(z10, bVar, runnable));
    }
}
