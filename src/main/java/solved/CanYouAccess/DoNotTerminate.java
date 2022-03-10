package solved.CanYouAccess;

import java.security.Permission;

class DoNotTerminate {
    public static class ExitTrappException extends SecurityException {
        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappException();
                }
            }
        };
        System.out.println(securityManager);
    }
}
