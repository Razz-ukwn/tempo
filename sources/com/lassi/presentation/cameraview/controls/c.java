package com.lassi.presentation.cameraview.controls;

import android.location.Location;
import android.media.MediaRecorder;
import java.io.File;
import tb.a;
import tb.i;
import ub.m;
import ub.v;
import ub.x;
import ub.z;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f6453a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f6454b;

    public c(g gVar, File file) {
        this.f6454b = gVar;
        this.f6453a = file;
    }

    public final void run() {
        g gVar = this.f6454b;
        if (gVar.f6484h != i.PICTURE) {
            if (!(gVar.f6495t != null)) {
                z zVar = new z();
                zVar.f15996d = this.f6453a;
                zVar.f15997e = gVar.f6483g;
                zVar.f15993a = gVar.f6486j;
                zVar.f15994b = gVar.h(0, 2);
                zVar.f15995c = gVar.d(0, 2) ? gVar.f6500y.a() : gVar.f6500y;
                zVar.f15998f = gVar.f6487k;
                zVar.f15999g = gVar.f6496u;
                zVar.f16000h = gVar.f6497v;
                zVar.f16001i = gVar.f6498w;
                zVar.f16003k = gVar.f6499x;
                try {
                    gVar.V.unlock();
                    m mVar = new m(zVar, gVar, gVar, gVar.V, gVar.f6490o);
                    gVar.f6495t = mVar;
                    a aVar = mVar.f6533b.f15998f;
                    a aVar2 = a.ON;
                    if (aVar == aVar2) {
                        mVar.f6525d.setAudioSource(0);
                    }
                    mVar.f6525d.setOutputFormat(mVar.f6526e.fileFormat);
                    int i8 = mVar.f6533b.f16002j;
                    if (i8 <= 0) {
                        mVar.f6525d.setVideoFrameRate(mVar.f6526e.videoFrameRate);
                        mVar.f6533b.f16002j = mVar.f6526e.videoFrameRate;
                    } else {
                        mVar.f6525d.setVideoFrameRate(i8);
                    }
                    MediaRecorder mediaRecorder = mVar.f6525d;
                    x xVar = mVar.f6529h;
                    mediaRecorder.setVideoSize(xVar.f15991a, xVar.f15992b);
                    int ordinal = mVar.f6533b.f15997e.ordinal();
                    if (ordinal == 0) {
                        mVar.f6525d.setVideoEncoder(mVar.f6526e.videoCodec);
                    } else if (ordinal == 1) {
                        mVar.f6525d.setVideoEncoder(1);
                    } else if (ordinal == 2) {
                        mVar.f6525d.setVideoEncoder(2);
                    }
                    int i10 = mVar.f6533b.f16001i;
                    if (i10 <= 0) {
                        mVar.f6525d.setVideoEncodingBitRate(mVar.f6526e.videoBitRate);
                        mVar.f6533b.f16001i = mVar.f6526e.videoBitRate;
                    } else {
                        mVar.f6525d.setVideoEncodingBitRate(i10);
                    }
                    if (mVar.f6533b.f15998f == aVar2) {
                        mVar.f6525d.setAudioChannels(mVar.f6526e.audioChannels);
                        mVar.f6525d.setAudioSamplingRate(mVar.f6526e.audioSampleRate);
                        mVar.f6525d.setAudioEncoder(mVar.f6526e.audioCodec);
                        int i11 = mVar.f6533b.f16003k;
                        if (i11 <= 0) {
                            mVar.f6525d.setAudioEncodingBitRate(mVar.f6526e.audioBitRate);
                            mVar.f6533b.f16003k = mVar.f6526e.audioBitRate;
                        } else {
                            mVar.f6525d.setAudioEncodingBitRate(i11);
                        }
                    }
                    Location location = mVar.f6533b.f15993a;
                    if (location != null) {
                        mVar.f6525d.setLocation((float) location.getLatitude(), (float) mVar.f6533b.f15993a.getLongitude());
                    }
                    mVar.f6525d.setOutputFile(mVar.f6533b.f15996d.getAbsolutePath());
                    mVar.f6525d.setOrientationHint(mVar.f6533b.f15994b);
                    mVar.f6525d.setMaxFileSize(mVar.f6533b.f15999g);
                    mVar.f6525d.setMaxDuration(mVar.f6533b.f16000h);
                    mVar.f6525d.setOnInfoListener(new v(mVar));
                    try {
                        mVar.f6525d.prepare();
                        mVar.f6525d.start();
                    } catch (Exception e10) {
                        m.f6524i.a(2, "stop:", "Error while starting media recorder.", e10);
                        mVar.f6533b = null;
                        mVar.f6532a = e10;
                        mVar.a();
                    }
                } catch (Exception e11) {
                    gVar.f6495t = null;
                    gVar.f6477a.a(new m(e11));
                    gVar.V.lock();
                }
            }
        } else {
            throw new IllegalStateException("Can't record video while in PICTURE mode");
        }
    }
}
