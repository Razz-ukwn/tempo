package sb;

import ag.n2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import androidx.lifecycle.m0;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.lassi.presentation.cameraview.controls.CameraView;
import com.lassi.presentation.cameraview.controls.g;
import com.lassi.presentation.videopreview.VideoPreviewActivity;
import com.quickkonnect.silencio.R;
import ff.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import mb.c;
import rf.l;
import sf.j;
import sf.k;
import sf.v;
import tb.d;
import tb.i;
import ub.n;
import ub.p;
import ub.q;
import ub.w;
import ub.z;

public final class e extends yb.e<h> implements View.OnClickListener {
    public static final /* synthetic */ int C0 = 0;
    public final o A0 = ((o) c0(new b(this, 0), new c.e()));
    public final LinkedHashMap B0 = new LinkedHashMap();

    /* renamed from: y0  reason: collision with root package name */
    public i f14886y0;

    /* renamed from: z0  reason: collision with root package name */
    public final o f14887z0 = ((o) c0(new a(this, 0), new c.c()));

    public /* synthetic */ class a extends sf.i implements l<mb.c<File>, m> {
        public a(Object obj) {
            super(1, obj, e.class, "handleVideoRecord", "handleVideoRecord(Lcom/lassi/data/common/VideoRecord;)V");
        }

        public final Object invoke(Object obj) {
            mb.c cVar = (mb.c) obj;
            j.f(cVar, "p0");
            e eVar = (e) this.f14944b;
            int i8 = e.C0;
            eVar.getClass();
            if (cVar instanceof c.C0217c) {
                CameraView cameraView = (CameraView) eVar.u0(R.id.cameraView);
                g gVar = cameraView.I;
                gVar.getClass();
                gVar.z(gVar.N, true, new com.lassi.presentation.cameraview.controls.c(gVar, (File) ((c.C0217c) cVar).f11377a));
                cameraView.M.post(new p(cameraView));
                AppCompatImageView appCompatImageView = (AppCompatImageView) eVar.u0(R.id.ivFlipCamera);
                j.e(appCompatImageView, "ivFlipCamera");
                appCompatImageView.setVisibility(4);
                TextView textView = (TextView) eVar.u0(R.id.tvTimer);
                j.e(textView, "tvTimer");
                textView.setVisibility(0);
            } else if (cVar instanceof c.d) {
                ((TextView) eVar.u0(R.id.tvTimer)).setText(((c.d) cVar).f11378a);
            } else if (cVar instanceof c.a) {
                eVar.z0();
            } else if (cVar instanceof c.b) {
                Context e02 = eVar.e0();
                String x10 = eVar.x(R.string.min_video_recording_time_error);
                j.e(x10, "getString(R.string.min_video_recording_time_error)");
                String format = String.format(x10, Arrays.copyOf(new Object[]{((c.b) cVar).f11376a}, 1));
                j.e(format, "format(format, *args)");
                Toast toast = n2.f452c;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(e02, format, 0);
                j.e(makeText, "makeText(context, message, duration.value)");
                n2.f452c = makeText;
                makeText.show();
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements l<Uri, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f14888a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar) {
            super(1);
            this.f14888a = eVar;
        }

        public final Object invoke(Object obj) {
            Uri uri = (Uri) obj;
            j.f(uri, "uri");
            rb.a aVar = rb.a.V;
            boolean z10 = aVar.U;
            e eVar = this.f14888a;
            if (!z10 || aVar.G > 1) {
                ArrayList arrayList = new ArrayList();
                nb.b bVar = new nb.b(0, (String) null, (String) null, 0, (String) null, 0, false, 127);
                bVar.f11620c = uri.getPath();
                arrayList.add(bVar);
                int i8 = e.C0;
                eVar.getClass();
                Intent intent = new Intent();
                intent.putExtra("selected_media", arrayList);
                x o10 = eVar.o();
                if (o10 != null) {
                    o10.setResult(-1, intent);
                }
                x o11 = eVar.o();
                if (o11 != null) {
                    o11.finish();
                }
            } else {
                gf.c(eVar.d0(), uri);
            }
            return m.f8717a;
        }
    }

    public static final class c extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f14889a;

        public c(e eVar) {
            this.f14889a = eVar;
        }

        public final void a(com.lassi.presentation.cameraview.controls.j jVar) {
            j.f(jVar, "options");
            e eVar = this.f14889a;
            CameraView cameraView = (CameraView) eVar.u0(R.id.cameraView);
            i iVar = eVar.f14886y0;
            if (iVar != null) {
                cameraView.setMode(iVar);
            } else {
                j.l("cameraMode");
                throw null;
            }
        }

        public final void b(w wVar) {
            j.f(wVar, "result");
            int i8 = e.C0;
            h hVar = (h) this.f14889a.s0();
            byte[] bArr = wVar.f15990b;
            hVar.getClass();
            v vVar = new v();
            ze.a aVar = new ze.a(new f(hVar, vVar, bArr));
            se.a aVar2 = df.a.f7520a;
            if (aVar2 != null) {
                ze.b bVar = new ze.b(aVar, aVar2);
                ye.a aVar3 = new ye.a(new j6.i(vVar, hVar), new j0.o(7));
                bVar.A(aVar3);
                hVar.f17329d.c(aVar3);
                return;
            }
            throw new NullPointerException("scheduler is null");
        }

        public final void c(z zVar) {
            j.f(zVar, "video");
            int i8 = e.C0;
            e eVar = this.f14889a;
            eVar.z0();
            int i10 = VideoPreviewActivity.X;
            x o10 = eVar.o();
            String absolutePath = zVar.f15996d.getAbsolutePath();
            j.e(absolutePath, "video.file.absolutePath");
            Intent intent = new Intent(o10, VideoPreviewActivity.class);
            intent.putExtra("videoPath", absolutePath);
            if (o10 != null) {
                o10.startActivityForResult(intent, 203);
            }
        }
    }

    public final /* synthetic */ void N() {
        super.N();
        n0();
    }

    public final void V() {
        this.f2062b0 = true;
        x o10 = o();
        j.d(o10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        e.a L = ((androidx.appcompat.app.c) o10).L();
        if (L != null) {
            L.f();
        }
        tb.a audio = ((CameraView) u0(R.id.cameraView)).getAudio();
        j.e(audio, "cameraView.audio");
        if (v0(audio)) {
            ((CameraView) u0(R.id.cameraView)).h();
        }
    }

    public final void Y() {
        this.f2062b0 = true;
        x o10 = o();
        j.d(o10, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        e.a L = ((androidx.appcompat.app.c) o10).L();
        if (L != null) {
            L.t();
        }
    }

    public final void n0() {
        this.B0.clear();
    }

    public final void o0() {
        this.f14886y0 = rb.a.V.F == 2 ? i.VIDEO : i.PICTURE;
    }

    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        i iVar = i.PICTURE;
        boolean z10 = false;
        if (valueOf != null && valueOf.intValue() == R.id.ivCaptureImage) {
            i iVar2 = this.f14886y0;
            if (iVar2 == null) {
                j.l("cameraMode");
                throw null;
            } else if (iVar2 == iVar) {
                if (!(((CameraView) u0(R.id.cameraView)).I.f6494s != null)) {
                    if (!(((CameraView) u0(R.id.cameraView)).I.f6495t != null)) {
                        g gVar = ((CameraView) u0(R.id.cameraView)).I;
                        gVar.getClass();
                        g.Y.a(0, "takePicture: scheduling");
                        gVar.z((u.b) null, true, new com.lassi.presentation.cameraview.controls.b(gVar));
                    }
                }
            } else {
                if (((CameraView) u0(R.id.cameraView)).I.f6495t != null) {
                    z10 = true;
                }
                if (!z10) {
                    h hVar = (h) s0();
                    j.e(hVar.f14894e, "logTag");
                    hVar.e();
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                    if (!file.exists()) {
                        new File(file.getPath()).mkdirs();
                    }
                    File createTempFile = File.createTempFile("VID-", ".mp4", file);
                    j.e(createTempFile, "videoFile");
                    hVar.f14896g.k(new c.C0217c(createTempFile));
                    ((CountDownTimer) hVar.f14900k.getValue()).start();
                    return;
                }
                ((h) s0()).f();
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.ivFlipCamera) {
            if (!(((CameraView) u0(R.id.cameraView)).I.f6494s != null)) {
                if (((CameraView) u0(R.id.cameraView)).I.f6495t != null) {
                    z10 = true;
                }
                if (!z10) {
                    CameraView cameraView = (CameraView) u0(R.id.cameraView);
                    int ordinal = cameraView.I.f6480d.ordinal();
                    if (ordinal == 0) {
                        cameraView.setFacing(tb.c.FRONT);
                    } else if (ordinal == 1) {
                        cameraView.setFacing(tb.c.BACK);
                    }
                    tb.c cVar = cameraView.I.f6480d;
                }
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.ivFlash && e0().getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            i iVar3 = this.f14886y0;
            if (iVar3 == null) {
                j.l("cameraMode");
                throw null;
            } else if (iVar3 == iVar) {
                int ordinal2 = ((CameraView) u0(R.id.cameraView)).getFlash().ordinal();
                if (ordinal2 == 1) {
                    x0();
                } else if (ordinal2 != 2) {
                    w0();
                } else {
                    ((CameraView) u0(R.id.cameraView)).setFlash(d.ON);
                    ((AppCompatImageView) u0(R.id.ivFlash)).setImageResource(R.drawable.ic_flash_on_white);
                }
            } else {
                int ordinal3 = ((CameraView) u0(R.id.cameraView)).getFlash().ordinal();
                if (ordinal3 == 0) {
                    ((CameraView) u0(R.id.cameraView)).setFlash(d.TORCH);
                    ((AppCompatImageView) u0(R.id.ivFlash)).setImageResource(R.drawable.ic_flash_on_white);
                } else if (ordinal3 != 3) {
                    w0();
                } else {
                    x0();
                }
            }
        }
    }

    public final int p0() {
        return R.layout.activity_camera;
    }

    public final void q0() {
        ((ImageView) u0(R.id.ivCaptureImage)).setOnClickListener(this);
        ((AppCompatImageView) u0(R.id.ivFlipCamera)).setOnClickListener(this);
        ((AppCompatImageView) u0(R.id.ivFlash)).setOnClickListener(this);
        ((CameraView) u0(R.id.cameraView)).setLifecycleOwner(this);
        ((CameraView) u0(R.id.cameraView)).f6423b.add(new c(this));
        y0();
    }

    public final yb.c r0() {
        return (h) new m0(this).a(h.class);
    }

    public final void t0() {
        ((h) s0()).f14896g.e(this, new qb.a(new a(this)));
        ((h) s0()).f14895f.e(this, new qb.a(new b(this)));
    }

    public final View u0(int i8) {
        View findViewById;
        Integer valueOf = Integer.valueOf(i8);
        LinkedHashMap linkedHashMap = this.B0;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = this.f2066d0;
        if (view2 == null || (findViewById = view2.findViewById(i8)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i8), findViewById);
        return findViewById;
    }

    public final boolean v0(tb.a aVar) {
        ((CameraView) u0(R.id.cameraView)).e(aVar);
        int i8 = Build.VERSION.SDK_INT;
        boolean z10 = rb.a.V.F == 2 && aVar == tb.a.ON;
        boolean z11 = t1.a.a(e0(), "android.permission.CAMERA") != 0;
        boolean z12 = i8 >= 33 || t1.a.a(e0(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0;
        if (z10) {
            z10 = z10 && t1.a.a(e0(), "android.permission.RECORD_AUDIO") != 0;
        }
        return !z11 && !z10 && !z12;
    }

    public final void w0() {
        ((CameraView) u0(R.id.cameraView)).setFlash(d.AUTO);
        ((AppCompatImageView) u0(R.id.ivFlash)).setImageResource(R.drawable.ic_flash_auto_white);
    }

    public final void x0() {
        ((CameraView) u0(R.id.cameraView)).setFlash(d.OFF);
        ((AppCompatImageView) u0(R.id.ivFlash)).setImageResource(R.drawable.ic_flash_off_white);
    }

    public final void y0() {
        tb.a audio = ((CameraView) u0(R.id.cameraView)).getAudio();
        j.e(audio, "cameraView.audio");
        if (v0(audio)) {
            ((CameraView) u0(R.id.cameraView)).h();
        } else if (t1.a.a(e0(), "android.permission.CAMERA") != 0 || t1.a.a(e0(), "android.permission.RECORD_AUDIO") != 0 || t1.a.a(e0(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || t1.a.a(e0(), "android.permission.READ_MEDIA_IMAGES") != 0 || t1.a.a(e0(), "android.permission.READ_MEDIA_VIDEO") != 0 || t1.a.a(e0(), "android.permission.READ_MEDIA_AUDIO") != 0) {
            ArrayList Q = cb.d.Q("android.permission.CAMERA");
            if (Build.VERSION.SDK_INT < 33) {
                Q.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (rb.a.V.F == 2 && ((CameraView) u0(R.id.cameraView)).getAudio() == tb.a.ON && t1.a.a(e0(), "android.permission.RECORD_AUDIO") != 0) {
                Q.add("android.permission.RECORD_AUDIO");
            }
            Object[] array = Q.toArray(new String[0]);
            j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.f14887z0.a(array);
        }
    }

    public final void z0() {
        if (((CameraView) u0(R.id.cameraView)).I.f6495t != null) {
            CameraView cameraView = (CameraView) u0(R.id.cameraView);
            g gVar = cameraView.I;
            gVar.getClass();
            gVar.z((u.b) null, false, new ub.e(gVar));
            cameraView.M.post(new q(cameraView));
            AppCompatImageView appCompatImageView = (AppCompatImageView) u0(R.id.ivFlipCamera);
            j.e(appCompatImageView, "ivFlipCamera");
            appCompatImageView.setVisibility(0);
            TextView textView = (TextView) u0(R.id.tvTimer);
            j.e(textView, "tvTimer");
            textView.setVisibility(8);
        }
    }
}
