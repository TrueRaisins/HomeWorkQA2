public class ProjectEmployers {
    public static void main(String[] args) {
        final int Programmer = 4;
        final int Test = 2; //Test - количество тестеровщиков на одного программиста
        int TestAll = Programmer * Test; //Test_All - всего тестеровщиков
        final int SupSpec = 2;  //SupSpec - специалист поддержки
        int SupSpecAll = Programmer * SupSpec; // SupSpecAll  - специалистов поддержки всего на проекте
        int AllEmployeers = Programmer + TestAll + SupSpecAll;


        System.out.println(AllEmployeers);
    }
}