package com.lassi.presentation.cameraview.controls;

import android.hardware.Camera;
import android.os.Parcelable;
import com.lassi.presentation.cameraview.controls.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import tb.b;
import tb.c;
import tb.d;
import tb.g;
import tb.h;
import tb.i;
import tb.k;
import tb.l;
import ub.o;
import ub.x;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f6508a = new HashSet(5);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f6509b = new HashSet(2);

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f6510c = new HashSet(4);

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f6511d = new HashSet(2);

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f6512e = new HashSet(15);

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f6513f = new HashSet(5);

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f6514g = new HashSet(4);

    /* renamed from: h  reason: collision with root package name */
    public final HashSet f6515h = new HashSet(3);

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6516i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6517j;

    /* renamed from: k  reason: collision with root package name */
    public final float f6518k;

    /* renamed from: l  reason: collision with root package name */
    public final float f6519l;
    public final boolean m;

    public j(Camera.Parameters parameters, boolean z10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        boolean z11 = false;
        for (int i8 = 0; i8 < numberOfCameras; i8++) {
            Camera.getCameraInfo(i8, cameraInfo);
            c cVar = (c) o.I(o.f15979d, Integer.valueOf(cameraInfo.facing));
            if (cVar != null) {
                this.f6509b.add(cVar);
            }
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        if (supportedWhiteBalance != null) {
            for (String I : supportedWhiteBalance) {
                l lVar = (l) o.I(o.f15978c, I);
                if (lVar != null) {
                    this.f6508a.add(lVar);
                }
            }
        }
        this.f6510c.add(d.OFF);
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            for (String I2 : supportedFlashModes) {
                d dVar = (d) o.I(o.f15977b, I2);
                if (dVar != null) {
                    this.f6510c.add(dVar);
                }
            }
        }
        this.f6511d.add(h.OFF);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String I3 : supportedSceneModes) {
                h hVar = (h) o.I(o.f15980e, I3);
                if (hVar != null) {
                    this.f6511d.add(hVar);
                }
            }
        }
        this.f6516i = parameters.isZoomSupported();
        this.m = parameters.getSupportedFocusModes().contains("auto");
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        this.f6518k = ((float) parameters.getMinExposureCompensation()) * exposureCompensationStep;
        this.f6519l = ((float) parameters.getMaxExposureCompensation()) * exposureCompensationStep;
        this.f6517j = (parameters.getMinExposureCompensation() == 0 && parameters.getMaxExposureCompensation() == 0) ? z11 : true;
        for (Camera.Size next : parameters.getSupportedPictureSizes()) {
            int i10 = z10 ? next.height : next.width;
            int i11 = z10 ? next.width : next.height;
            this.f6512e.add(new x(i10, i11));
            HashSet hashSet = this.f6514g;
            Parcelable.Creator<a> creator = a.CREATOR;
            hashSet.add(a.C0082a.a(i10, i11));
        }
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size next2 : supportedVideoSizes) {
                int i12 = z10 ? next2.height : next2.width;
                int i13 = z10 ? next2.width : next2.height;
                this.f6513f.add(new x(i12, i13));
                HashSet hashSet2 = this.f6515h;
                Parcelable.Creator<a> creator2 = a.CREATOR;
                hashSet2.add(a.C0082a.a(i12, i13));
            }
            return;
        }
        for (Camera.Size next3 : parameters.getSupportedPreviewSizes()) {
            int i14 = z10 ? next3.height : next3.width;
            int i15 = z10 ? next3.width : next3.height;
            this.f6513f.add(new x(i14, i15));
            HashSet hashSet3 = this.f6515h;
            Parcelable.Creator<a> creator3 = a.CREATOR;
            hashSet3.add(a.C0082a.a(i14, i15));
        }
    }

    public final boolean a(b bVar) {
        Class<?> cls = bVar.getClass();
        return (cls.equals(tb.a.class) ? Arrays.asList(tb.a.values()) : cls.equals(c.class) ? Collections.unmodifiableSet(this.f6509b) : cls.equals(d.class) ? Collections.unmodifiableSet(this.f6510c) : cls.equals(g.class) ? Arrays.asList(g.values()) : cls.equals(h.class) ? Collections.unmodifiableSet(this.f6511d) : cls.equals(i.class) ? Arrays.asList(i.values()) : cls.equals(k.class) ? Arrays.asList(k.values()) : cls.equals(l.class) ? Collections.unmodifiableSet(this.f6508a) : Collections.emptyList()).contains(bVar);
    }
}
