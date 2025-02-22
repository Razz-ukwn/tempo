package androidx.profileinstaller;

import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2353a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f2354b = new b();

    public class a implements C0027c {
        public final void a() {
        }

        public final void b(int i8, Object obj) {
        }
    }

    public class b implements C0027c {
        public final void a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        public final void b(int i8, Object obj) {
            String str;
            switch (i8) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case ModuleDescriptor.MODULE_VERSION /*11*/:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i8 == 6 || i8 == 7 || i8 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c  reason: collision with other inner class name */
    public interface C0027c {
        void a();

        void b(int i8, Object obj);
    }

    public static void a(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x024e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0259, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:183:0x0242, B:193:0x0255] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01cd A[SYNTHETIC, Splitter:B:133:0x01cd] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x028c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109 A[SYNTHETIC, Splitter:B:56:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r19, java.util.concurrent.Executor r20, androidx.profileinstaller.c.C0027c r21, boolean r22) {
        /*
            r1 = r19
            r8 = r21
            android.content.Context r0 = r19.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r19.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x02a7 }
            java.io.File r13 = r19.getFilesDir()
            r14 = 1
            r15 = 0
            java.lang.String r3 = "ProfileInstaller"
            if (r22 != 0) goto L_0x008b
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0040
            goto L_0x006d
        L_0x0040:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x006d }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006d }
            r5.<init>(r0)     // Catch:{ IOException -> 0x006d }
            r4.<init>(r5)     // Catch:{ IOException -> 0x006d }
            long r16 = r4.readLong()     // Catch:{ all -> 0x0061 }
            r4.close()     // Catch:{ IOException -> 0x006d }
            long r4 = r12.lastUpdateTime
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            r0 = r14
            goto L_0x005a
        L_0x0059:
            r0 = r11
        L_0x005a:
            if (r0 == 0) goto L_0x006e
            r4 = 2
            r8.b(r4, r15)
            goto L_0x006e
        L_0x0061:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x0067 }
            goto L_0x006c
        L_0x0067:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x006d }
        L_0x006c:
            throw r5     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            r0 = r11
        L_0x006e:
            if (r0 != 0) goto L_0x0071
            goto L_0x008b
        L_0x0071:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r19.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            androidx.profileinstaller.d.c(r1, r11)
            goto L_0x0294
        L_0x008b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Installing profile for "
            r0.<init>(r4)
            java.lang.String r4 = r19.getPackageName()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            androidx.profileinstaller.b r5 = new androidx.profileinstaller.b
            java.lang.String r4 = "dexopt/baseline.prof"
            r2 = r5
            r3 = r9
            r11 = r4
            r4 = r20
            r10 = r5
            r5 = r21
            r18 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = 4
            byte[] r3 = r10.f2347c
            if (r3 != 0) goto L_0x00cf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 3
            r10.b(r4, r0)
            goto L_0x00d8
        L_0x00cf:
            boolean r0 = r18.canWrite()
            if (r0 != 0) goto L_0x00da
            r10.b(r2, r15)
        L_0x00d8:
            r0 = 0
            goto L_0x00dd
        L_0x00da:
            r10.f2350f = r14
            r0 = r14
        L_0x00dd:
            if (r0 != 0) goto L_0x00e3
            r4 = r14
            r5 = 0
            goto L_0x028a
        L_0x00e3:
            boolean r0 = r10.f2350f
            java.lang.String r4 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x02a1
            byte[] r5 = g3.f.f8819a
            r6 = 8
            r7 = 6
            if (r3 != 0) goto L_0x00f2
            goto L_0x01be
        L_0x00f2:
            java.io.FileInputStream r0 = r10.a(r9, r11)     // Catch:{ FileNotFoundException -> 0x00ff, IOException -> 0x00f8 }
            r11 = r0
            goto L_0x0105
        L_0x00f8:
            r0 = move-exception
            r11 = r0
            r14 = 7
            r8.b(r14, r11)
            goto L_0x0104
        L_0x00ff:
            r0 = move-exception
            r11 = r0
            r8.b(r7, r11)
        L_0x0104:
            r11 = r15
        L_0x0105:
            java.lang.String r14 = "Invalid magic"
            if (r11 == 0) goto L_0x0157
            byte[] r0 = cb.d.X(r11, r2)     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            boolean r0 = java.util.Arrays.equals(r5, r0)     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            if (r0 == 0) goto L_0x012e
            byte[] r0 = cb.d.X(r11, r2)     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            java.lang.String r7 = r10.f2349e     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            g3.b[] r7 = g3.f.h(r11, r0, r7)     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            r11.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0149
        L_0x0121:
            r0 = move-exception
            r11 = r0
            r15 = 7
            r8.b(r15, r11)
            goto L_0x0149
        L_0x0128:
            r0 = move-exception
            goto L_0x0136
        L_0x012a:
            r0 = move-exception
            goto L_0x0134
        L_0x012c:
            r0 = move-exception
            goto L_0x013b
        L_0x012e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
            throw r0     // Catch:{ IOException -> 0x012c, IllegalStateException -> 0x0128 }
        L_0x0134:
            r1 = r0
            goto L_0x014c
        L_0x0136:
            r8.b(r6, r0)     // Catch:{ all -> 0x012a }
            r7 = 7
            goto L_0x013f
        L_0x013b:
            r7 = 7
            r8.b(r7, r0)     // Catch:{ all -> 0x012a }
        L_0x013f:
            r11.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x0148
        L_0x0143:
            r0 = move-exception
            r11 = r0
            r8.b(r7, r11)
        L_0x0148:
            r7 = 0
        L_0x0149:
            r10.f2351g = r7
            goto L_0x0157
        L_0x014c:
            r11.close()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0156
        L_0x0150:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.b(r3, r2)
        L_0x0156:
            throw r1
        L_0x0157:
            g3.b[] r0 = r10.f2351g
            if (r0 == 0) goto L_0x01be
            int r7 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r7 <= r11) goto L_0x0162
            goto L_0x0168
        L_0x0162:
            switch(r7) {
                case 31: goto L_0x0166;
                case 32: goto L_0x0166;
                case 33: goto L_0x0166;
                default: goto L_0x0165;
            }
        L_0x0165:
            goto L_0x0168
        L_0x0166:
            r7 = 1
            goto L_0x0169
        L_0x0168:
            r7 = 0
        L_0x0169:
            if (r7 == 0) goto L_0x01be
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r7 = r10.a(r9, r7)     // Catch:{ FileNotFoundException -> 0x01b4, IOException -> 0x01ae, IllegalStateException -> 0x01a6 }
            if (r7 == 0) goto L_0x01a0
            byte[] r9 = g3.f.f8820b     // Catch:{ all -> 0x0194 }
            byte[] r11 = cb.d.X(r7, r2)     // Catch:{ all -> 0x0194 }
            boolean r9 = java.util.Arrays.equals(r9, r11)     // Catch:{ all -> 0x0194 }
            if (r9 == 0) goto L_0x018e
            byte[] r2 = cb.d.X(r7, r2)     // Catch:{ all -> 0x0194 }
            g3.b[] r0 = g3.f.e(r7, r2, r3, r0)     // Catch:{ all -> 0x0194 }
            r10.f2351g = r0     // Catch:{ all -> 0x0194 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x01b4, IOException -> 0x01ae, IllegalStateException -> 0x01a6 }
            r0 = r10
            goto L_0x01bb
        L_0x018e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0194 }
            r0.<init>(r14)     // Catch:{ all -> 0x0194 }
            throw r0     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            r2 = r0
            r7.close()     // Catch:{ all -> 0x019a }
            goto L_0x019f
        L_0x019a:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x01b4, IOException -> 0x01ae, IllegalStateException -> 0x01a6 }
        L_0x019f:
            throw r2     // Catch:{ FileNotFoundException -> 0x01b4, IOException -> 0x01ae, IllegalStateException -> 0x01a6 }
        L_0x01a0:
            if (r7 == 0) goto L_0x01ba
            r7.close()     // Catch:{ FileNotFoundException -> 0x01b4, IOException -> 0x01ae, IllegalStateException -> 0x01a6 }
            goto L_0x01ba
        L_0x01a6:
            r0 = move-exception
            r2 = 0
            r10.f2351g = r2
            r8.b(r6, r0)
            goto L_0x01ba
        L_0x01ae:
            r0 = move-exception
            r2 = 7
            r8.b(r2, r0)
            goto L_0x01ba
        L_0x01b4:
            r0 = move-exception
            r2 = 9
            r8.b(r2, r0)
        L_0x01ba:
            r0 = 0
        L_0x01bb:
            if (r0 == 0) goto L_0x01be
            r10 = r0
        L_0x01be:
            androidx.profileinstaller.c$c r2 = r10.f2346b
            g3.b[] r0 = r10.f2351g
            if (r0 == 0) goto L_0x0213
            byte[] r3 = r10.f2347c
            if (r3 != 0) goto L_0x01c9
            goto L_0x0213
        L_0x01c9:
            boolean r7 = r10.f2350f
            if (r7 == 0) goto L_0x020d
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0204, IllegalStateException -> 0x01ff }
            r7.<init>()     // Catch:{ IOException -> 0x0204, IllegalStateException -> 0x01ff }
            r7.write(r5)     // Catch:{ all -> 0x01f3 }
            r7.write(r3)     // Catch:{ all -> 0x01f3 }
            boolean r0 = g3.f.j(r7, r3, r0)     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01e9
            r0 = 5
            r3 = 0
            r2.b(r0, r3)     // Catch:{ all -> 0x01f3 }
            r10.f2351g = r3     // Catch:{ all -> 0x01f3 }
            r7.close()     // Catch:{ IOException -> 0x0204, IllegalStateException -> 0x01ff }
            goto L_0x0213
        L_0x01e9:
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x01f3 }
            r10.f2352h = r0     // Catch:{ all -> 0x01f3 }
            r7.close()     // Catch:{ IOException -> 0x0204, IllegalStateException -> 0x01ff }
            goto L_0x0209
        L_0x01f3:
            r0 = move-exception
            r3 = r0
            r7.close()     // Catch:{ all -> 0x01f9 }
            goto L_0x01fe
        L_0x01f9:
            r0 = move-exception
            r5 = r0
            r3.addSuppressed(r5)     // Catch:{ IOException -> 0x0204, IllegalStateException -> 0x01ff }
        L_0x01fe:
            throw r3     // Catch:{ IOException -> 0x0204, IllegalStateException -> 0x01ff }
        L_0x01ff:
            r0 = move-exception
            r2.b(r6, r0)
            goto L_0x0209
        L_0x0204:
            r0 = move-exception
            r3 = 7
            r2.b(r3, r0)
        L_0x0209:
            r2 = 0
            r10.f2351g = r2
            goto L_0x0213
        L_0x020d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x0213:
            byte[] r0 = r10.f2352h
            if (r0 != 0) goto L_0x021a
            r4 = 1
            goto L_0x0284
        L_0x021a:
            boolean r2 = r10.f2350f
            if (r2 == 0) goto L_0x029b
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0279, IOException -> 0x0272 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0279, IOException -> 0x0272 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x025f }
            java.io.File r0 = r10.f2348d     // Catch:{ all -> 0x025f }
            r3.<init>(r0)     // Catch:{ all -> 0x025f }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0252 }
        L_0x022e:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0252 }
            if (r4 <= 0) goto L_0x023d
            r5 = 0
            r3.write(r0, r5, r4)     // Catch:{ all -> 0x0239 }
            goto L_0x022e
        L_0x0239:
            r0 = move-exception
            r5 = r0
            r4 = 1
            goto L_0x0255
        L_0x023d:
            r4 = 1
            r5 = 0
            r10.b(r4, r5)     // Catch:{ all -> 0x0250 }
            r3.close()     // Catch:{ all -> 0x024e }
            r2.close()     // Catch:{ FileNotFoundException -> 0x026e, IOException -> 0x026c }
            r10.f2352h = r5
            r10.f2351g = r5
            r5 = r4
            goto L_0x0285
        L_0x024e:
            r0 = move-exception
            goto L_0x0261
        L_0x0250:
            r0 = move-exception
            goto L_0x0254
        L_0x0252:
            r0 = move-exception
            r4 = 1
        L_0x0254:
            r5 = r0
        L_0x0255:
            r3.close()     // Catch:{ all -> 0x0259 }
            goto L_0x025e
        L_0x0259:
            r0 = move-exception
            r3 = r0
            r5.addSuppressed(r3)     // Catch:{ all -> 0x024e }
        L_0x025e:
            throw r5     // Catch:{ all -> 0x024e }
        L_0x025f:
            r0 = move-exception
            r4 = 1
        L_0x0261:
            r3 = r0
            r2.close()     // Catch:{ all -> 0x0266 }
            goto L_0x026b
        L_0x0266:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x026e, IOException -> 0x026c }
        L_0x026b:
            throw r3     // Catch:{ FileNotFoundException -> 0x026e, IOException -> 0x026c }
        L_0x026c:
            r0 = move-exception
            goto L_0x0274
        L_0x026e:
            r0 = move-exception
            goto L_0x027b
        L_0x0270:
            r0 = move-exception
            goto L_0x0295
        L_0x0272:
            r0 = move-exception
            r4 = 1
        L_0x0274:
            r2 = 7
            r10.b(r2, r0)     // Catch:{ all -> 0x0270 }
            goto L_0x027f
        L_0x0279:
            r0 = move-exception
            r4 = 1
        L_0x027b:
            r2 = 6
            r10.b(r2, r0)     // Catch:{ all -> 0x0270 }
        L_0x027f:
            r2 = 0
            r10.f2352h = r2
            r10.f2351g = r2
        L_0x0284:
            r5 = 0
        L_0x0285:
            if (r5 == 0) goto L_0x028a
            a(r12, r13)
        L_0x028a:
            if (r5 == 0) goto L_0x0290
            if (r22 == 0) goto L_0x0290
            r11 = r4
            goto L_0x0291
        L_0x0290:
            r11 = 0
        L_0x0291:
            androidx.profileinstaller.d.c(r1, r11)
        L_0x0294:
            return
        L_0x0295:
            r1 = 0
            r10.f2352h = r1
            r10.f2351g = r1
            throw r0
        L_0x029b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r4)
            throw r0
        L_0x02a7:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.b(r3, r2)
            r2 = 0
            androidx.profileinstaller.d.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.b(android.content.Context, java.util.concurrent.Executor, androidx.profileinstaller.c$c, boolean):void");
    }
}
