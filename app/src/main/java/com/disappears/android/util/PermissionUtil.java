package com.disappears.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PermissionUtil {
    public static boolean hasPermission(Context context, String permission) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            return (ContextCompat.checkSelfPermission(context, permission) ==
                    PackageManager.PERMISSION_GRANTED);
        }
        return true;
    }

    public static boolean hasPermissions(Context context, String... permission) {
        boolean result = true;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            for (String perm : permission) {
                result = ContextCompat.checkSelfPermission(context, perm) ==
                        PackageManager.PERMISSION_GRANTED;
                if (!result) {
                    break;
                }
            }
        }
        return result;
    }

    public static boolean allGranted(int grantResult[]) {
        boolean result = true;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            if (grantResult == null || grantResult.length == 0) {
                return false;
            }
            for (int r : grantResult) {
                result = r == PackageManager.PERMISSION_GRANTED;
                if (!result) {
                    break;
                }
            }
        }
        return result;
    }

    public static boolean requestPermissions(Activity act, int permissionRequest, String... permissions) {
        if (hasPermissions(act, permissions)) {
            return true;
        } else {
            ArrayList<String> permissionsToRequest = new ArrayList<>();
            for (String perm : permissions) {
                if (!hasPermission(act, perm)) {
                    permissionsToRequest.add(perm);
                }
            }
            ActivityCompat.requestPermissions(act,
                    permissionsToRequest.toArray(new String[]{}),
                    permissionRequest);
        }
        return false;
    }

    public static boolean requestPermissions(Fragment f, int permissionRequest, String... permissions) {
        if (hasPermissions(f.getActivity(), permissions)) {
            return true;
        } else {
            ArrayList<String> permissionsToRequest = new ArrayList<>();
            for (String perm : permissions) {
                if (!hasPermission(f.getActivity(), perm)) {
                    permissionsToRequest.add(perm);
                }
            }
            f.requestPermissions(permissionsToRequest.toArray(new String[]{}), permissionRequest);
        }
        return false;
    }
}
