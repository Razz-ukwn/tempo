package com.quickkonnect.silencio.service.measuring;

import a3.a;
import ag.s0;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.IBinder;
import cb.d;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.StartLocation;
import d2.f1;
import java.io.File;
import java.util.ArrayList;
import jf.f;
import jf.g;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.internal.e;
import qc.b;
import qc.c;
import qc.f;
import qc.h;
import qc.i;
import s1.s;
import sf.j;

public final class MeasuringService extends Service {
    public String B = "";
    public double C;
    public StartLocation D;
    public Double E;
    public final ArrayList F = new ArrayList();
    public Long G;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public final e f6683a = f1.e(d.f().n0(s0.f481b));

    /* renamed from: b  reason: collision with root package name */
    public b f6684b;

    /* renamed from: c  reason: collision with root package name */
    public qc.d f6685c;

    /* renamed from: d  reason: collision with root package name */
    public a f6686d;

    /* renamed from: e  reason: collision with root package name */
    public MediaRecorder f6687e;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        try {
            this.f6686d = a.a(getApplicationContext());
            Context applicationContext = getApplicationContext();
            j.e(applicationContext, "applicationContext");
            Context applicationContext2 = getApplicationContext();
            int i8 = n7.d.f11604a;
            this.f6684b = new b(applicationContext, new k7.d(applicationContext2));
            this.f6687e = Build.VERSION.SDK_INT >= 31 ? new MediaRecorder(getApplication()) : new MediaRecorder();
            StringBuilder sb2 = new StringBuilder();
            File cacheDir = getApplication().getCacheDir();
            sb2.append(cacheDir != null ? cacheDir.getAbsolutePath() : null);
            sb2.append("/measuring.aac");
            this.B = sb2.toString();
            MediaRecorder mediaRecorder = this.f6687e;
            if (mediaRecorder != null) {
                mediaRecorder.setAudioSource(5);
                MediaRecorder mediaRecorder2 = this.f6687e;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.setOutputFormat(1);
                    MediaRecorder mediaRecorder3 = this.f6687e;
                    if (mediaRecorder3 != null) {
                        mediaRecorder3.setAudioEncoder(3);
                        MediaRecorder mediaRecorder4 = this.f6687e;
                        if (mediaRecorder4 != null) {
                            mediaRecorder4.setOutputFile(this.B);
                            Context applicationContext3 = getApplicationContext();
                            j.e(applicationContext3, "applicationContext");
                            MediaRecorder mediaRecorder5 = this.f6687e;
                            if (mediaRecorder5 != null) {
                                this.f6685c = new qc.d(applicationContext3, mediaRecorder5);
                            } else {
                                j.l("mediaRecorder");
                                throw null;
                            }
                        } else {
                            j.l("mediaRecorder");
                            throw null;
                        }
                    } else {
                        j.l("mediaRecorder");
                        throw null;
                    }
                } else {
                    j.l("mediaRecorder");
                    throw null;
                }
            } else {
                j.l("mediaRecorder");
                throw null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        try {
            MediaRecorder mediaRecorder = this.f6687e;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
                MediaRecorder mediaRecorder2 = this.f6687e;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.release();
                    f1.l(this.f6683a);
                    new File(this.B).delete();
                    return;
                }
                j.l("mediaRecorder");
                throw null;
            }
            j.l("mediaRecorder");
            throw null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final int onStartCommand(Intent intent, int i8, int i10) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -528730005) {
                if (hashCode == 789225721 && action.equals("ACTION_START")) {
                    s sVar = new s(this, "location");
                    sVar.f14515e = s.b(getString(R.string.app_name));
                    sVar.f14516f = s.b(getString(R.string.measuring));
                    sVar.f14517g = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 67108864);
                    sVar.f14528s.icon = R.drawable.notification_icon;
                    sVar.f14524o = getResources().getColor(R.color.color_primary);
                    qc.d dVar = this.f6685c;
                    if (dVar != null) {
                        c cVar = new c(dVar, (jf.d<? super c>) null);
                        g gVar = g.f10014a;
                        cg.e eVar = cg.e.f4020a;
                        k kVar = new k(new e0(new qc.g(this, (jf.d<? super qc.g>) null), new p(new kotlinx.coroutines.flow.b(cVar, gVar, -2, eVar), new f((jf.d<? super f>) null))), (jf.d<? super k>) null);
                        e eVar2 = this.f6683a;
                        cb.b.D(eVar2, (f.b) null, 0, kVar, 3);
                        b bVar = this.f6684b;
                        if (bVar != null) {
                            cb.b.D(eVar2, (f.b) null, 0, new k(new e0(new i(this, (jf.d<? super i>) null), new p(new kotlinx.coroutines.flow.b(new qc.a(bVar, 500, (jf.d<? super qc.a>) null), gVar, -2, eVar), new h((jf.d<? super h>) null))), (jf.d<? super k>) null), 3);
                            startForeground(1, sVar.a());
                        } else {
                            j.l("locationClient");
                            throw null;
                        }
                    } else {
                        j.l("recordingClient");
                        throw null;
                    }
                }
            } else if (action.equals("ACTION_STOP")) {
                stopForeground(1);
                stopSelf();
            }
        }
        return super.onStartCommand(intent, i8, i10);
    }
}
