package z1;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import j0.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s0.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final z f17628a = new z(1);

    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [z1.l[], android.database.Cursor] */
    public static k a(Context context, e eVar) {
        Cursor cursor;
        boolean z10;
        e eVar2 = eVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar2.f17629a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = eVar2.f17630b;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                z zVar = f17628a;
                Collections.sort(arrayList, zVar);
                List<List<byte[]>> list = eVar2.f17632d;
                if (list == null) {
                    list = u1.d.b(resources, 0);
                }
                int i8 = 0;
                while (true) {
                    cursor = 0;
                    if (i8 >= list.size()) {
                        resolveContentProvider = cursor;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList(list.get(i8));
                    Collections.sort(arrayList2, zVar);
                    if (arrayList.size() == arrayList2.size()) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                z10 = true;
                                break;
                            } else if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        break;
                    }
                    i8++;
                }
                if (resolveContentProvider == null) {
                    return new k(1, cursor);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar2.f17631c}, (String) null, (Object) null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            arrayList3.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                        }
                    }
                    return new k(0, (l[]) arrayList3.toArray(new l[0]));
                } finally {
                    if (cursor != 0) {
                        cursor.close();
                    }
                }
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
            }
        } else {
            throw new PackageManager.NameNotFoundException(t.a("No package found for authority: ", str));
        }
    }
}
