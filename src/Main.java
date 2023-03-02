public class Main {
    public static void main(String[] args) {
        LoginAccount sarah = new LoginAccount("sarah", "dthb567abrfwbz", "dthb567abrfwbz");
        LoginAccount john = new LoginAccount("John<>", "dthb567abrfwbz", "dthb567abrfwbz");
        LoginAccount q = new LoginAccount("wiueriqwuncrwuyerbcwiuyeriubhdgfjs", "dthb567abrfwbz", "dthb567abrfwbz");
        LoginAccount w = new LoginAccount("w", "John<>", "John<>");
        LoginAccount e = new LoginAccount("e", "wiueriqwuncrwuyerbcwiuyeriubhdgfjs", "wiueriqwuncrwuyerbcwiuyeriubhdgfjs");
        LoginAccount r = new LoginAccount("r", "dthb567abrfwbz", "wiueriqwuncrwuyerbcwiuyeriubhdgfjs");

        System.out.println("validateCredentials(sarah) = " + LoginAccountService.validateCredentials(sarah));
        System.out.println("validateCredentials(john) = " + LoginAccountService.validateCredentials(john));
        System.out.println("validateCredentials(q) = " + LoginAccountService.validateCredentials(q));
        System.out.println("validateCredentials(w) = " + LoginAccountService.validateCredentials(w));
        System.out.println("validateCredentials(e) = " + LoginAccountService.validateCredentials(e));
        System.out.println("validateCredentials(r) = " + LoginAccountService.validateCredentials(r));
    }
}