package vb;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lassi.presentation.cameraview.controls.a;
import com.quickkonnect.silencio.R;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class d extends a<GLSurfaceView, SurfaceTexture> implements GLSurfaceView.Renderer {

    /* renamed from: j  reason: collision with root package name */
    public final float[] f16366j = new float[16];

    /* renamed from: k  reason: collision with root package name */
    public float f16367k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f16368l = 1.0f;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public int f16369n = 0;

    /* renamed from: o  reason: collision with root package name */
    public SurfaceTexture f16370o;

    /* renamed from: p  reason: collision with root package name */
    public xb.b f16371p;

    /* renamed from: q  reason: collision with root package name */
    public final Set<c> f16372q = Collections.synchronizedSet(new HashSet());

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            for (c a10 : d.this.f16372q) {
                a10.a();
            }
        }
    }

    public class b implements SurfaceTexture.OnFrameAvailableListener {
        public b() {
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            ((GLSurfaceView) d.this.f16361h).requestRender();
        }
    }

    public interface c {
        void a();

        void b();
    }

    public d(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    public final void a() {
        int i8;
        int i10;
        float f10;
        float f11;
        u.b bVar = this.f16359f;
        bVar.e();
        if (this.f16357d > 0 && this.f16358e > 0 && (i8 = this.f16355b) > 0 && (i10 = this.f16356c) > 0) {
            Parcelable.Creator<com.lassi.presentation.cameraview.controls.a> creator = com.lassi.presentation.cameraview.controls.a.CREATOR;
            com.lassi.presentation.cameraview.controls.a a10 = a.C0082a.a(i8, i10);
            com.lassi.presentation.cameraview.controls.a a11 = a.C0082a.a(this.f16357d, this.f16358e);
            if (a10.a() >= a11.a()) {
                f11 = a10.a() / a11.a();
                f10 = 1.0f;
            } else {
                f10 = a11.a() / a10.a();
                f11 = 1.0f;
            }
            this.f16354a = f10 > 1.02f || f11 > 1.02f;
            this.f16367k = 1.0f / f10;
            this.f16368l = 1.0f / f11;
            ((GLSurfaceView) this.f16361h).requestRender();
        }
        bVar.a((Integer) null);
    }

    public final Object e() {
        return this.f16370o;
    }

    public final Class<SurfaceTexture> f() {
        return SurfaceTexture.class;
    }

    public final View g(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.cameraview_gl_view, viewGroup, false);
        GLSurfaceView gLSurfaceView = (GLSurfaceView) viewGroup2.findViewById(R.id.gl_surface_view);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
        gLSurfaceView.getHolder().addCallback(new c(this));
        viewGroup.addView(viewGroup2, 0);
        return gLSurfaceView;
    }

    public final void h() {
        this.f16372q.clear();
        SurfaceTexture surfaceTexture = this.f16370o;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            this.f16370o.release();
            this.f16370o = null;
        }
        this.f16369n = 0;
        xb.b bVar = this.f16371p;
        if (bVar != null) {
            GLES20.glDeleteProgram(bVar.f17028e);
            bVar.f17028e = -1;
            this.f16371p = null;
        }
    }

    public final void i() {
        ((GLSurfaceView) this.f16361h).onPause();
    }

    public final void j() {
        ((GLSurfaceView) this.f16361h).onResume();
    }

    public final void onDrawFrame(GL10 gl10) {
        this.f16370o.updateTexImage();
        if (this.f16357d > 0 && this.f16358e > 0) {
            SurfaceTexture surfaceTexture = this.f16370o;
            float[] fArr = this.f16366j;
            surfaceTexture.getTransformMatrix(fArr);
            if (this.f16354a) {
                Matrix.translateM(fArr, 0, (1.0f - this.f16367k) / 2.0f, (1.0f - this.f16368l) / 2.0f, 0.0f);
                Matrix.scaleM(fArr, 0, this.f16367k, this.f16368l, 1.0f);
            }
            xb.b bVar = this.f16371p;
            int i8 = this.f16369n;
            FloatBuffer floatBuffer = bVar.f17026c;
            FloatBuffer floatBuffer2 = bVar.f17027d;
            xb.a.a("draw start");
            GLES20.glUseProgram(bVar.f17028e);
            xb.a.a("glUseProgram");
            GLES20.glActiveTexture(33984);
            int i10 = bVar.f17029f;
            GLES20.glBindTexture(i10, i8);
            GLES20.glUniformMatrix4fv(bVar.f17030g, 1, false, xb.a.f17022a, 0);
            xb.a.a("glUniformMatrix4fv");
            GLES20.glUniformMatrix4fv(bVar.f17031h, 1, false, fArr, 0);
            xb.a.a("glUniformMatrix4fv");
            int i11 = bVar.f17032i;
            GLES20.glEnableVertexAttribArray(i11);
            xb.a.a("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(bVar.f17032i, 2, 5126, false, 8, floatBuffer);
            xb.a.a("glVertexAttribPointer");
            int i12 = bVar.f17033j;
            GLES20.glEnableVertexAttribArray(i12);
            xb.a.a("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(bVar.f17033j, 2, 5126, false, 8, floatBuffer2);
            xb.a.a("glVertexAttribPointer");
            GLES20.glDrawArrays(5, 0, xb.b.m);
            xb.a.a("glDrawArrays");
            GLES20.glDisableVertexAttribArray(i11);
            GLES20.glDisableVertexAttribArray(i12);
            GLES20.glBindTexture(i10, 0);
            GLES20.glUseProgram(0);
            for (c b10 : this.f16372q) {
                b10.b();
            }
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i8, int i10) {
        gl10.glViewport(0, 0, i8, i10);
        if (!this.m) {
            b(i8, i10);
            this.m = true;
        } else if (i8 != this.f16355b || i10 != this.f16356c) {
            d(i8, i10);
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        xb.b bVar = new xb.b();
        this.f16371p = bVar;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        xb.a.a("glGenTextures");
        int i8 = iArr[0];
        GLES20.glBindTexture(bVar.f17029f, i8);
        xb.a.a("glBindTexture " + i8);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        xb.a.a("glTexParameter");
        this.f16369n = i8;
        this.f16370o = new SurfaceTexture(this.f16369n);
        ((GLSurfaceView) this.f16361h).queueEvent(new a());
        this.f16370o.setOnFrameAvailableListener(new b());
    }
}
