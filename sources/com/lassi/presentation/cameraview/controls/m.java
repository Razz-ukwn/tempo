package com.lassi.presentation.cameraview.controls;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import com.lassi.presentation.cameraview.controls.CameraView;
import com.lassi.presentation.cameraview.controls.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import ub.b;
import ub.x;
import ub.z;
import wb.a;

public final class m extends o {

    /* renamed from: i  reason: collision with root package name */
    public static final a f6524i = new a(m.class.getSimpleName());

    /* renamed from: d  reason: collision with root package name */
    public MediaRecorder f6525d;

    /* renamed from: e  reason: collision with root package name */
    public CamcorderProfile f6526e;

    /* renamed from: f  reason: collision with root package name */
    public g f6527f;

    /* renamed from: g  reason: collision with root package name */
    public Camera f6528g;

    /* renamed from: h  reason: collision with root package name */
    public final x f6529h;

    public m(z zVar, g gVar, g gVar2, Camera camera, int i8) {
        super(zVar, gVar);
        CamcorderProfile camcorderProfile;
        this.f6528g = camera;
        this.f6527f = gVar2;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.f6525d = mediaRecorder;
        mediaRecorder.setCamera(camera);
        this.f6525d.setVideoSource(1);
        z zVar2 = this.f6533b;
        x a10 = zVar2.f15994b % 180 != 0 ? zVar2.f15995c.a() : zVar2.f15995c;
        this.f6529h = a10;
        HashMap hashMap = b.f15961a;
        int i10 = a10.f15991a * a10.f15992b;
        HashMap hashMap2 = b.f15961a;
        ArrayList arrayList = new ArrayList(hashMap2.keySet());
        Collections.sort(arrayList, new ub.a(i10));
        while (true) {
            if (arrayList.size() <= 0) {
                camcorderProfile = CamcorderProfile.get(i8, 0);
                break;
            }
            int intValue = ((Integer) hashMap2.get((x) arrayList.remove(0))).intValue();
            if (CamcorderProfile.hasProfile(i8, intValue)) {
                camcorderProfile = CamcorderProfile.get(i8, intValue);
                break;
            }
        }
        this.f6526e = camcorderProfile;
    }

    public final void a() {
        MediaRecorder mediaRecorder = this.f6525d;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (Exception e10) {
                f6524i.a(2, "stop:", "Error while closing media recorder.", e10);
                this.f6533b = null;
                if (this.f6532a == null) {
                    this.f6532a = e10;
                }
            }
            this.f6525d.release();
            g gVar = this.f6527f;
            if (gVar != null) {
                this.f6528g.setPreviewCallbackWithBuffer(gVar);
            }
        }
        this.f6526e = null;
        this.f6525d = null;
        this.f6528g = null;
        this.f6527f = null;
        o.a aVar = this.f6534c;
        if (aVar != null) {
            z zVar = this.f6533b;
            Exception exc = this.f6532a;
            g gVar2 = (g) aVar;
            gVar2.f6495t = null;
            CameraView.b bVar = gVar2.f6477a;
            if (zVar != null) {
                bVar.d(zVar);
            } else {
                bVar.a(new ub.m(exc));
                gVar2.V.lock();
            }
            this.f6534c = null;
            this.f6533b = null;
            this.f6532a = null;
        }
    }
}
