public class LoginAccountService {
    private static boolean checkLoginLength(LoginAccount loginAccount) {
        return loginAccount.getLogin().length() > 20;
    }

    private static boolean checkPasswordLength(LoginAccount loginAccount) {
        return loginAccount.getPassword().length() >= 20;
    }

    private static boolean checkWrongSymbolsLogin(LoginAccount loginAccount) {
        final String allowedSymbols = "abcdefghijklmnopqrstuvwxyz1234567890_";
        for (int i = 0; i < loginAccount.getLogin().length(); i++) {
            if (!allowedSymbols.contains(String.valueOf(loginAccount.getLogin().charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWrongSymbolsPassword(LoginAccount loginAccount) {
        final String allowedSymbols = "abcdefghijklmnopqrstuvwxyz1234567890_";
        for (int i = 0; i < loginAccount.getPassword().length(); i++) {
            if (!allowedSymbols.contains(String.valueOf(loginAccount.getPassword().charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkNotEqualsPassword(LoginAccount loginAccount) {
        return !loginAccount.getPassword().equals(loginAccount.getConfirmPassword());
    }

    private static void checkAccount(LoginAccount loginAccount) {
        if (checkLoginLength(loginAccount) || checkWrongSymbolsLogin(loginAccount)) {
            throw new WrongLoginException("Login is wrong");
        } else if (checkPasswordLength(loginAccount) ||
                checkWrongSymbolsPassword(loginAccount)) {
            throw new WrongPasswordException("Password is wrong");
        } else if (checkNotEqualsPassword(loginAccount)) {
            throw new PasswordConfirmpasswordAreNotEqualsException("password and confirm password are not equal");
        }
    }

    public static boolean validateCredentials(LoginAccount loginAccount) {
        try {
            checkAccount(loginAccount);
            return true;
        } catch (WrongLoginException e) {
            System.out.println("Invalid login: " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
            return false;
        } catch (PasswordConfirmpasswordAreNotEqualsException e) {
            System.out.println("Invalid confirm password: " + e.getMessage());
            return false;
        }
    }
}
