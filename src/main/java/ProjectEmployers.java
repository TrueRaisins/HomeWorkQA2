public class ProjectEmployers {
    public static void main (String[] args) {
        int Programmer, Test, Test_All, Sup_Spec, Sup_Spec_All, All_Employeers;
        //T - количество тестеровщиков на одного программиста, Test_All - всего тестеровщиков
        Programmer = 4;
        Test = 2;
        Test_All = Programmer * Test;
        Sup_Spec = 2;
        Sup_Spec_All = Programmer * Sup_Spec;
        All_Employeers = Programmer + Test_All + Sup_Spec_All;

        System.out.println(All_Employeers);
    }
}
