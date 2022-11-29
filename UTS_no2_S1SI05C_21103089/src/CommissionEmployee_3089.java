public class CommissionEmployee_3089 extends Employess_3089{
    public float Komisi_3089;
    public float TotalPenjualan_3089;
    public float Totalgaji_3089;
    
    public CommissionEmployee_3089(){
        
    }
    
    public float TotalGaji_3089(){
        Totalgaji_3089 = GajiPokok_3089 + (Komisi_3089 * TotalPenjualan_3089);
        return Totalgaji_3089;
    }
    
    public void TampilData_3089(){
        System.out.println("Commission Employee");
        Tampil_3089();
        System.out.println("Total Gaji: " + Totalgaji_3089);
    }
}
