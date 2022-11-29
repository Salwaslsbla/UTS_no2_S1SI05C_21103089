import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO2_C_3089 {

    public static void main(String[] args) {
        SalariedEmployee_3089 se_3089 = new SalariedEmployee_3089();
        CommissionEmployee_3089 ce_3089 = new CommissionEmployee_3089();
        ProjectPlanner_3089 pp_3089 = new ProjectPlanner_3089();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se_3089.Nama_3089 = br.readLine();
            System.out.print("NIP: ");
            se_3089.NIP_3089 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se_3089.GajiPokok_3089 = Float.parseFloat(br.readLine());
            se_3089.TampilData_3089();
            
            System.out.print("Nama: ");
            ce_3089.Nama_3089 = br.readLine();
            System.out.print("NIP: ");
            ce_3089.NIP_3089 = br.readLine();
            System.out.print("GajiPokok: ");
            ce_3089.GajiPokok_3089 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce_3089.Komisi_3089 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce_3089.TotalPenjualan_3089 = Float.parseFloat(br.readLine());
            ce_3089.TotalGaji_3089();
            ce_3089.TampilData_3089();
            
            System.out.print("Nama: ");
            pp_3089.Nama_3089 = br.readLine();
            System.out.print("NIP: ");
            pp_3089.NIP_3089 = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp_3089.GajiPokok_3089 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp_3089.Komisi_3089 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp_3089.TotalHslProyek_3089 = Float.parseFloat(br.readLine());
            pp_3089.TotalGaji_3089();
            pp_3089.TampilData_3089();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
