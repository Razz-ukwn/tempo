package ac;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.lassi.presentation.cropper.CropImageActivity;
import e9.c;
import ff.m;
import rf.p;
import sf.i;
import sf.j;

public final /* synthetic */ class b extends i implements p<Uri, String, m> {
    public b(Object obj) {
        super(2, obj, CropImageActivity.class, "onFileScanComplete", "onFileScanComplete(Landroid/net/Uri;Ljava/lang/String;)V");
    }

    public final Object invoke(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        String str = (String) obj2;
        CropImageActivity cropImageActivity = (CropImageActivity) this.f14944b;
        int i8 = CropImageActivity.Z;
        if (uri != null) {
            Cursor query = cropImageActivity.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    query.moveToFirst();
                    try {
                        nb.b bVar = new nb.b(query.getLong(query.getColumnIndex("_id")), query.getString(query.getColumnIndex("_display_name")), query.getString(query.getColumnIndex("_data")), 0, (String) null, 0, false, 112);
                        Intent intent = new Intent();
                        intent.putExtra("mediaPreview", bVar);
                        cropImageActivity.setResult(-1, intent);
                        cropImageActivity.finish();
                    } catch (Exception e10) {
                        j.e(cropImageActivity.V, "logTag");
                        e10.toString();
                    }
                    query.close();
                    m mVar = m.f8717a;
                    c.c(query, (Throwable) null);
                    return m.f8717a;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        c.c(query, th2);
                        throw th4;
                    }
                }
            }
        } else {
            cropImageActivity.getClass();
        }
        if (str != null) {
            CropImageActivity cropImageActivity2 = cropImageActivity;
            nb.b bVar2 = new nb.b(0, (String) null, str, 0, (String) null, 0, false, 59);
            Intent intent2 = new Intent();
            intent2.putExtra("mediaPreview", bVar2);
            cropImageActivity2.setResult(-1, intent2);
            cropImageActivity2.finish();
        }
        return m.f8717a;
    }
}
