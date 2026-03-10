public class MainBank {
    public static void main(String[] args) {

        AkunBank akun1 = new AkunBank (
                "Rabbani",
                "1234567890",
                "Password1",
                100000
        );

        akun1.cekSaldo("Password1");

        akun1.setor(50000, "Password1");

        akun1.tarik(30000, "Password1");

        akun1.tarik(200000, "Password1"); 
    }
}
