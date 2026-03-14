public class salary {
    public static void main(String[] args) {
        int salary = 1000;

        if (salary>=10000){
            salary = salary+2000;
        } else if (salary<100) {
            salary +=500000;

        } else salary = salary+500;
        System.out.print(salary);
    }
}
