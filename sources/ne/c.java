package ne;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Uri f11900a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11901b;

    public c(Context context) {
        this.f11901b = context;
    }

    public final Intent a() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Context context = this.f11901b;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "JPEG_" + System.currentTimeMillis() + ".jpg");
        contentValues.put("mime_type", "image/jpeg");
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        this.f11900a = insert;
        intent.addFlags(1);
        intent.addFlags(2);
        intent.putExtra("output", insert);
        return intent;
    }
}
