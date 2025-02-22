package rd;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.activity.g;
import androidx.activity.result.a;
import androidx.activity.result.b;
import androidx.fragment.app.x;
import cb.d;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import e9.c;
import gf.l;
import h4.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import nc.e1;
import sf.j;
import x3.f;

public final class q implements b<a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14238a;

    public q(ProfileFragment profileFragment) {
        this.f14238a = profileFragment;
    }

    public final void a(Object obj) {
        File externalCacheDir;
        a aVar = (a) obj;
        if (aVar.f609a == -1) {
            Intent intent = aVar.f610b;
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("selected_media") : null;
            j.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.lassi.data.media.MiMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.lassi.data.media.MiMedia> }");
            ArrayList arrayList = (ArrayList) serializableExtra;
            if (!arrayList.isEmpty()) {
                int i8 = 0;
                for (Object next : arrayList) {
                    int i10 = i8 + 1;
                    if (i8 >= 0) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeFile(((nb.b) next).f11620c), 500, 500, false);
                        StringBuilder sb2 = new StringBuilder();
                        ProfileFragment profileFragment = this.f14238a;
                        x o10 = profileFragment.o();
                        profileFragment.E0 = g.a(sb2, (o10 == null || (externalCacheDir = o10.getExternalCacheDir()) == null) ? null : externalCacheDir.getAbsolutePath(), "/profile.jpg");
                        FileOutputStream fileOutputStream = new FileOutputStream(profileFragment.E0);
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
                        fileOutputStream.close();
                        File file = new File(profileFragment.E0);
                        if (file.exists()) {
                            e1 e1Var = profileFragment.A0;
                            j.c(e1Var);
                            ImageView imageView = e1Var.f11665c0;
                            j.e(imageView, "binding.imageViewProfileImage");
                            f e10 = cb.f.e(imageView.getContext());
                            h.a aVar2 = new h.a(imageView.getContext());
                            aVar2.f9171c = file;
                            aVar2.c(imageView);
                            aVar2.b(true);
                            aVar2.m = c.n(l.f0(new k4.b[]{new k4.a()}));
                            e10.a(aVar2.a());
                            profileFragment.D0 = file;
                        }
                        i8 = i10;
                    } else {
                        d.i0();
                        throw null;
                    }
                }
            }
        }
    }
}
