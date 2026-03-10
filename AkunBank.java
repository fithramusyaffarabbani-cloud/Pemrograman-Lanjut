public class AkunBank {

    private String nama;
    private String noRekening;
    private String password;
    private double saldo;

    public AkunBank (String nama, String noRekening, String password, double saldoAwal) {
        setNama(nama);
        setNoRekening(noRekening);
        setPassword(password);
        this.saldo = saldoAwal;
    }

    public void setNama(String nama) {
        if (nama.length() < 4) {
            System.out.println("Nama harus minimal 4 huruf");
        } else {
            this.nama = nama;
        }
    }

    public void setNoRekening(String noRekening) {
        if (noRekening.length() < 8) {
            System.out.println("Nomor rekening minimal 8 angka");
        } else {
            this.noRekening = noRekening;
        }
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password minimal 8 karakter");
            return;
        }

        boolean adaHurufBesar = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                adaHurufBesar = true;
                break;
            }
        }

        if (!adaHurufBesar) {
            System.out.println("Password harus memiliki minimal 1 huruf besar");
        } else {
            this.password = password;
        }
    }

    public void setor(double jumlah, String passwordInput) {
        if (!passwordInput.equals(password)) {
            System.out.println("Password salah!");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Jumlah setor tidak valid");
            return;
        }

        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo sekarang: " + saldo);
    }

    public void tarik(double jumlah, String passwordInput) {
        if (!passwordInput.equals(password)) {
            System.out.println("Password salah!");
            return;
        }

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
            return;
        }

        saldo -= jumlah;
        System.out.println("Penarikan berhasil. Saldo sekarang: " + saldo);
    }

    public void cekSaldo(String passwordInput) {
        if (!passwordInput.equals(password)) {
            System.out.println("Password salah!");
        } else {
            System.out.println("Saldo anda: " + saldo);
        }
    }
}
