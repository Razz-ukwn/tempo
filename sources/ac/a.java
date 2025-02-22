package ac;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.quickkonnect.silencio.R;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class a {
    public static ArrayList a(PackageManager packageManager, String str) {
        ArrayList arrayList = new ArrayList();
        Intent intent = str.equals("android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Intent intent3 = (Intent) it.next();
            if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                arrayList.remove(intent3);
                break;
            }
        }
        return arrayList;
    }

    public static boolean b(Context context) {
        boolean z10;
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                int length = strArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    } else if (strArr[i8].equalsIgnoreCase("android.permission.CAMERA")) {
                        z10 = true;
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        z10 = false;
        return z10 && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public static boolean c(Context context, Uri uri) {
        boolean z10;
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                openInputStream.close();
            }
            z10 = false;
        } catch (Exception unused) {
            z10 = true;
        }
        return z10;
    }

    public static void d(Activity activity) {
        Intent intent;
        String string = activity.getString(R.string.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!b(activity)) {
            ArrayList arrayList2 = new ArrayList();
            File externalCacheDir = activity.getExternalCacheDir();
            Uri fromFile = externalCacheDir != null ? Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg")) : null;
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo next : packageManager.queryIntentActivities(intent2, 0)) {
                Intent intent3 = new Intent(intent2);
                ActivityInfo activityInfo = next.activityInfo;
                intent3.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent3.setPackage(next.activityInfo.packageName);
                if (fromFile != null) {
                    intent3.putExtra("output", fromFile);
                }
                arrayList2.add(intent3);
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList a10 = a(packageManager, "android.intent.action.GET_CONTENT");
        if (a10.size() == 0) {
            a10 = a(packageManager, "android.intent.action.PICK");
        }
        arrayList.addAll(a10);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, string);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        activity.startActivityForResult(createChooser, 200);
    }
}
