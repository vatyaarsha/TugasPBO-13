public class App {
    public static void main(String[] args) {

        //polymorphisme
        DataPelanggan P01 = new Pelanggan();

        Kasir K01 = new Kasir();

        K01.login();
    
    //exception    
    try {
        P01.isiDataPelanggan();
    } 
    catch (Exception e){
        System.out.println("Terjadi salah input");
    }

        //mencetak struk
        P01.Struk();

    }
}

