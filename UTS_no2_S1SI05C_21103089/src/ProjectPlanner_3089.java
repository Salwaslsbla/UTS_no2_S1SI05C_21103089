public class ProjectPlanner_3089 extends Employess_3089{
    public float Komisi_3089;
    public float TotalHslProyek_3089;
    public double Totalgaji_3089;
    
    public ProjectPlanner_3089(){
        
    }
            
    public double TotalGaji_3089(){
        Totalgaji_3089 = GajiPokok_3089 + (Komisi_3089 * TotalHslProyek_3089) - (GajiPokok_3089 *5/100);
        return Totalgaji_3089;
    }
    
    public void TampilData_3089(){
        System.out.println("Project Plannner");
        Tampil_3089();
        System.out.println("Total Gaji: " + Totalgaji_3089);
    }
}
