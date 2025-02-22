package vb;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.lassi.presentation.cameraview.controls.a;
import com.quickkonnect.silencio.R;
import u.b;

public final class m extends a<TextureView, SurfaceTexture> {

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            int i8;
            int i10;
            float f10;
            m mVar = m.this;
            int i11 = mVar.f16358e;
            b bVar = mVar.f16359f;
            if (i11 == 0 || mVar.f16357d == 0 || (i8 = mVar.f16356c) == 0 || (i10 = mVar.f16355b) == 0) {
                bVar.a((Integer) null);
                return;
            }
            Parcelable.Creator<com.lassi.presentation.cameraview.controls.a> creator = com.lassi.presentation.cameraview.controls.a.CREATOR;
            com.lassi.presentation.cameraview.controls.a a10 = a.C0082a.a(i10, i8);
            com.lassi.presentation.cameraview.controls.a a11 = a.C0082a.a(mVar.f16357d, mVar.f16358e);
            float f11 = 1.0f;
            if (a10.a() >= a11.a()) {
                f10 = a10.a() / a11.a();
            } else {
                float a12 = a11.a() / a10.a();
                f10 = 1.0f;
                f11 = a12;
            }
            T t2 = mVar.f16361h;
            ((TextureView) t2).setScaleX(f11);
            ((TextureView) t2).setScaleY(f10);
            mVar.f16354a = f11 > 1.02f || f10 > 1.02f;
            wb.a aVar = a.f16353i;
            aVar.a(1, "crop:", "applied scaleX=", Float.valueOf(f11));
            aVar.a(1, "crop:", "applied scaleY=", Float.valueOf(f10));
            bVar.a((Integer) null);
        }
    }

    public m(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    public final void a() {
        this.f16359f.e();
        ((TextureView) this.f16361h).post(new a());
    }

    public final Object e() {
        return ((TextureView) this.f16361h).getSurfaceTexture();
    }

    public final Class<SurfaceTexture> f() {
        return SurfaceTexture.class;
    }

    public final View g(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.cameraview_texture_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        TextureView textureView = (TextureView) inflate.findViewById(R.id.texture_view);
        textureView.setSurfaceTextureListener(new l(this));
        return textureView;
    }

    @TargetApi(15)
    public final void k(int i8, int i10, boolean z10) {
        super.k(i8, i10, z10);
        TextureView textureView = (TextureView) this.f16361h;
        if (textureView.getSurfaceTexture() != null) {
            textureView.getSurfaceTexture().setDefaultBufferSize(i8, i10);
        }
    }

    public final boolean l() {
        return true;
    }
}
