package vb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.quickkonnect.silencio.R;
import wb.a;

public final class i extends a<SurfaceView, SurfaceHolder> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16387k = new a(i.class.getSimpleName());

    /* renamed from: j  reason: collision with root package name */
    public boolean f16388j;

    public i(Context context, ViewGroup viewGroup) {
        super(context, viewGroup);
    }

    public final Object e() {
        return ((SurfaceView) this.f16361h).getHolder();
    }

    public final Class<SurfaceHolder> f() {
        return SurfaceHolder.class;
    }

    public final View g(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.cameraview_surface_view, viewGroup, false);
        viewGroup.addView(inflate, 0);
        SurfaceView surfaceView = (SurfaceView) inflate.findViewById(R.id.surface_view);
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new h(this));
        return surfaceView;
    }
}
