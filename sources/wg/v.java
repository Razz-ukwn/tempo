package wg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sf.j;
import wg.z;

@IgnoreJRERequirement
public final class v extends u {
    public static Long m(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    public final void b(z zVar, z zVar2) {
        j.f(zVar, "source");
        j.f(zVar2, "target");
        try {
            Files.move(zVar.d(), zVar2.d(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    public final k i(z zVar) {
        z zVar2;
        j.f(zVar, "path");
        Path d10 = zVar.d();
        Long l10 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(d10, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(d10) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = z.f16808b;
                zVar2 = z.a.a(readSymbolicLink.toString(), false);
            } else {
                zVar2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long m = creationTime != null ? m(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long m10 = lastModifiedTime != null ? m(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l10 = m(lastAccessTime);
            }
            return new k(isRegularFile, isDirectory, zVar2, valueOf, m, m10, l10);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public final String toString() {
        return "NioSystemFileSystem";
    }
}
